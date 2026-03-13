import argparse
import asyncio
import time
from io import BytesIO

from bleak import BleakClient, BleakScanner
from PIL import Image, ImageOps

from even_protocol import (
    CMD_COMMIT_PAGE,
    CMD_INIT,
    CMD_CREATE_PAGE,
    CMD_UPDATE_IMAGE,
    SERVICE_DASHBOARD,
    build_packet,
    build_protobuf,
    protobuf_message,
    protobuf_bytes,
    protobuf_varint,
    varint,
)
from dashboard_image_field_candidates import top_candidates

WRITE_UUID = "00002760-08c2-11e1-9073-0e8ac72e5401"
NOTIFY_UUID = "00002760-08c2-11e1-9073-0e8ac72e5402"
DEFAULT_WIDTH = 32
DEFAULT_HEIGHT = 18
DEFAULT_GRID_DISTANCE = 100
DEFAULT_GRID_HEIGHT = 50
DEFAULT_DASHBOARD_WRAPPER_FIELD = 3
DEFAULT_APP_REQUEST_FIELD = 1
DEFAULT_COMMAND_DATA_FIELD = 1
DEFAULT_SCAN_TIMEOUT = 8.0
AUTH_SERVICE_BYTES = [
    (0x80, 0x00, bytes([0x08, 0x04, 0x10, 0x0C, 0x1A, 0x04, 0x08, 0x01, 0x10, 0x04])),
    (0x80, 0x20, bytes([0x08, 0x05, 0x10, 0x0E, 0x22, 0x02, 0x08, 0x02])),
    (0x80, 0x00, bytes([0x08, 0x04, 0x10, 0x10, 0x1A, 0x04, 0x08, 0x01, 0x10, 0x04])),
    (0x80, 0x00, bytes([0x08, 0x04, 0x10, 0x11, 0x1A, 0x04, 0x08, 0x01, 0x10, 0x04])),
    (0x80, 0x20, bytes([0x08, 0x05, 0x10, 0x12, 0x22, 0x02, 0x08, 0x01])),
]


def make_minimal_page_payload() -> bytes:
    image_container = b"\x08" + varint(0) + b"\x10" + varint(0)
    image_container += b"\x18" + varint(100) + b"\x20" + varint(50)
    image_container += b"\x48" + varint(1) + b"\x52\x04img1"
    return b"\x08" + varint(1) + b"\x22" + varint(len(image_container)) + image_container


def make_proto_map_display_setting_payload(
    *,
    grid_distance: int,
    grid_height: int,
) -> bytes:
    return (
        protobuf_varint(1, grid_distance)
        + protobuf_varint(2, grid_height)
    )


def make_proto_map_content_payload() -> bytes:
    # Best-effort semantic placeholder:
    # DashboardContent.oneof content = singleData { empty message }
    return protobuf_message(1, ())


def make_proto_map_app_request_payload(
    command_payload: bytes,
    *,
    command_data_field: int,
) -> bytes:
    return protobuf_message(command_data_field, [command_payload])


def make_proto_map_dashboard_package_payload(
    app_request_payload: bytes,
    *,
    dashboard_wrapper_field: int,
    app_request_field: int,
) -> bytes:
    return protobuf_message(
        dashboard_wrapper_field,
        [protobuf_message(app_request_field, [app_request_payload])],
    )


def make_proto_map_create_page_payload(
    *,
    grid_distance: int,
    grid_height: int,
) -> bytes:
    return b"".join(
        [
            protobuf_message(
                1,
                [
                    make_proto_map_display_setting_payload(
                        grid_distance=grid_distance,
                        grid_height=grid_height,
                    )
                ],
            ),
            protobuf_message(2, [make_proto_map_content_payload()]),
        ]
    )


def make_proto_map_image_payload(
    bmp: bytes,
    *,
    width: int,
    height: int,
    compression_mode: int,
    image_field_number: int,
) -> bytes:
    image_size = protobuf_varint(1, width) + protobuf_varint(2, height)
    fields = [
        protobuf_message(1, [image_size]),
        protobuf_varint(2, compression_mode),
        protobuf_bytes(image_field_number, bmp),
    ]
    return b"".join(fields)


def render_packet_debug(packet: bytes, label: str) -> None:
    print(f"\n{label}")
    print(f"  total={len(packet)} bytes")
    print(f"  hex={packet.hex()}")


def image_to_bmp_bytes(path: str, *, width: int, height: int) -> bytes:
    img = Image.open(path)
    img = ImageOps.exif_transpose(img)
    img = img.convert("L")
    img = img.resize((width, height), Image.LANCZOS)
    img = ImageOps.autocontrast(img)
    img = img.convert("1", dither=Image.FLOYDSTEINBERG)

    buf = BytesIO()
    img.save(buf, format="BMP")
    return buf.getvalue()


def score_even_candidate(name: str) -> int:
    lower_name = name.lower()
    score = 0

    if "even" in lower_name:
        score += 20
    if "g2" in lower_name:
        score += 20

    if any(token in lower_name for token in ("_l_", " l ", "_l", "-l", "left")):
        score += 30
    if any(token in lower_name for token in ("_r_", " r ", "_r", "-r", "right")):
        score += 30

    return score


async def find_even_candidates(timeout: float) -> list[tuple[int, str, str]]:
    print(f"\nScanning for Even G2 candidates (timeout={timeout:.1f}s)...\n")
    devices = await BleakScanner.discover(timeout=timeout)

    scored: list[tuple[int, str, str]] = []
    for device in devices:
        name = device.name or ""
        print(device.address, name)
        score = score_even_candidate(name)
        if score > 0:
            scored.append((score, device.address, name))

    scored.sort(key=lambda item: (-item[0], item[2], item[1]))
    return scored


async def notification_handler(_: int, data: bytearray) -> None:
    print(f"notify {len(data):3d} bytes: {bytes(data).hex()}")


def crc16(data: bytes, init: int = 0xFFFF) -> int:
    crc = init
    for b in data:
        crc ^= b << 8
        for _ in range(8):
            crc = ((crc << 1) ^ 0x1021) if crc & 0x8000 else (crc << 1)
            crc &= 0xFFFF
    return crc


def old_pkt(seq: int, sh: int, sl: int, payload: bytes) -> bytes:
    header = bytes([0xAA, 0x21, seq & 0xFF, len(payload) + 2, 0x01, 0x01, sh, sl])
    full = header + payload
    csum = crc16(full[8:])
    return full + bytes([csum & 0xFF, (csum >> 8) & 0xFF])


async def send_legacy_auth(client: BleakClient, *, auth_delay: float) -> None:
    print("\nSending legacy auth sequence (AA 21)")
    timestamp = varint(int(time.time()))
    tx_blob = bytes([0xE8, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0x01])
    auth_packets = [
        old_pkt(1, *AUTH_SERVICE_BYTES[0]),
        old_pkt(2, *AUTH_SERVICE_BYTES[1]),
        old_pkt(
            3,
            0x80,
            0x20,
            bytes([0x08, 0x80, 0x01, 0x10, 0x0F, 0x82, 0x08, 0x11, 0x08])
            + timestamp
            + bytes([0x10])
            + tx_blob,
        ),
        old_pkt(4, *AUTH_SERVICE_BYTES[2]),
        old_pkt(5, *AUTH_SERVICE_BYTES[3]),
        old_pkt(6, *AUTH_SERVICE_BYTES[4]),
        old_pkt(
            7,
            0x80,
            0x20,
            bytes([0x08, 0x80, 0x01, 0x10, 0x13, 0x82, 0x08, 0x11, 0x08])
            + timestamp
            + bytes([0x10])
            + tx_blob,
        ),
    ]
    for index, packet in enumerate(auth_packets, start=1):
        await client.write_gatt_char(WRITE_UUID, packet, response=False)
        print(f"  auth {index}/{len(auth_packets)}: {len(packet)} bytes")
        await asyncio.sleep(auth_delay)
    await asyncio.sleep(1.0)


async def send_dashboard_image(
    client: BleakClient,
    image_path: str,
    *,
    mode: str,
    dry_run: bool,
    header_byte2: int,
    image_field_number: int,
    use_legacy_auth: bool,
    auth_delay: float,
    width: int,
    height: int,
    grid_distance: int,
    grid_height: int,
    compression_mode: int,
    dashboard_wrapper_field: int,
    app_request_field: int,
    command_data_field: int,
) -> None:
    bmp = image_to_bmp_bytes(image_path, width=width, height=height)
    print(f"BMP size: {len(bmp)} bytes ({width}x{height})")

    if use_legacy_auth and not dry_run:
        await send_legacy_auth(client, auth_delay=auth_delay)

    init_payload = build_protobuf(CMD_INIT, 1)
    init_packet = build_packet(
        SERVICE_DASHBOARD,
        init_payload,
        header_byte2=header_byte2,
    )
    if mode == "proto-map":
        create_command_payload = make_proto_map_create_page_payload(
            grid_distance=grid_distance,
            grid_height=grid_height,
        )
        create_extra_fields = [
            make_proto_map_dashboard_package_payload(
                make_proto_map_app_request_payload(
                    create_command_payload,
                    command_data_field=command_data_field,
                ),
                dashboard_wrapper_field=dashboard_wrapper_field,
                app_request_field=app_request_field,
            )
        ]
    else:
        create_extra_fields = [make_minimal_page_payload()]

    create_payload = build_protobuf(CMD_CREATE_PAGE, 1, create_extra_fields)
    create_packet = build_packet(
        SERVICE_DASHBOARD,
        create_payload,
        header_byte2=header_byte2,
    )

    render_packet_debug(init_packet, "cmdId=5 init")
    render_packet_debug(create_packet, "cmdId=7 create-page")

    if not dry_run:
        print("\nSending cmdId=5 init")
        await client.write_gatt_char(WRITE_UUID, init_packet, response=False)
        await asyncio.sleep(0.3)

        print("\nSending cmdId=7 create-page")
        await client.write_gatt_char(WRITE_UUID, create_packet, response=False)
        await asyncio.sleep(0.3)

    if mode == "proto-map":
        image_command_payload = make_proto_map_image_payload(
            bmp,
            width=width,
            height=height,
            compression_mode=compression_mode,
            image_field_number=image_field_number,
        )
        extra_fields = [
            make_proto_map_dashboard_package_payload(
                make_proto_map_app_request_payload(
                    image_command_payload,
                    command_data_field=command_data_field,
                ),
                dashboard_wrapper_field=dashboard_wrapper_field,
                app_request_field=app_request_field,
            )
        ]
    else:
        extra_fields = [protobuf_bytes(image_field_number, bmp)]
    image_payload = build_protobuf(CMD_UPDATE_IMAGE, 2, extra_fields)
    if len(image_payload) > 0xFD:
        raise ValueError(
            "Single cmdId=8 protobuf payload is too large for one AA 12 packet: "
            f"{len(image_payload)} bytes. Reduce --width/--height or add the real "
            "fragmentation/container format."
        )
    image_packet = build_packet(
        SERVICE_DASHBOARD,
        image_payload,
        header_byte2=header_byte2,
    )
    render_packet_debug(image_packet, "cmdId=8 image-update")
    print(
        "Sending one logical cmdId=8 image update "
        f"(packet={len(image_packet)} bytes, field={image_field_number}, mode={mode})"
    )
    if not dry_run:
        await client.write_gatt_char(WRITE_UUID, image_packet, response=False)
        await asyncio.sleep(0.3)

    commit_payload = build_protobuf(CMD_COMMIT_PAGE, 3)
    commit_packet = build_packet(
        SERVICE_DASHBOARD,
        commit_payload,
        header_byte2=header_byte2,
    )
    render_packet_debug(commit_packet, "cmdId=9 commit-page")
    if not dry_run:
        print("Sending cmdId=9 commit-page experiment")
        await client.write_gatt_char(WRITE_UUID, commit_packet, response=False)
        await asyncio.sleep(0.3)


def parse_args() -> argparse.Namespace:
    default_field_number = top_candidates()[0].field_number
    parser = argparse.ArgumentParser(
        description="Send a BMP experiment using the confirmed Even G2 AA 12 transport.",
    )
    parser.add_argument("image", help="Input image path")
    parser.add_argument(
        "--mode",
        choices=("proto-map", "naive"),
        default="proto-map",
        help=(
            "Build cmdId=7/cmdId=8 using the newer nested proto-map model or the "
            "older naive single-field model. Default: proto-map"
        ),
    )
    parser.add_argument(
        "--dry-run",
        action="store_true",
        help="Build and print packets without scanning or sending over BLE.",
    )
    parser.add_argument(
        "--address",
        help="BLE address of one Even G2 lens. If omitted, the script scans for candidates.",
    )
    parser.add_argument(
        "--all-lenses",
        action="store_true",
        help="Scan and run the test on all discovered Even G2 lens candidates.",
    )
    parser.add_argument(
        "--scan-timeout",
        type=float,
        default=DEFAULT_SCAN_TIMEOUT,
        help="BLE scan timeout in seconds when --address is omitted. Default: 8",
    )
    parser.add_argument(
        "--header-byte2",
        type=lambda value: int(value, 0),
        default=0,
        help="Unknown packet header byte 2. Default: 0x00",
    )
    parser.add_argument(
        "--image-field-number",
        type=int,
        default=default_field_number,
        help=(
            "Protobuf field number used for BMP bytes in cmdId=8. "
            f"Default: {default_field_number}"
        ),
    )
    parser.add_argument(
        "--width",
        type=int,
        default=DEFAULT_WIDTH,
        help=(
            "Experimental BMP width. Default is intentionally tiny so one logical "
            "cmdId=8 fits in a single AA 12 packet."
        ),
    )
    parser.add_argument(
        "--height",
        type=int,
        default=DEFAULT_HEIGHT,
        help=(
            "Experimental BMP height. Default is intentionally tiny so one logical "
            "cmdId=8 fits in a single AA 12 packet."
        ),
    )
    parser.add_argument(
        "--grid-distance",
        type=int,
        default=DEFAULT_GRID_DISTANCE,
        help="Proto-map DashboardDisplaySetting.gridDistance guess. Default: 100",
    )
    parser.add_argument(
        "--grid-height",
        type=int,
        default=DEFAULT_GRID_HEIGHT,
        help="Proto-map DashboardDisplaySetting.gridHeight guess. Default: 50",
    )
    parser.add_argument(
        "--compression-mode",
        type=int,
        default=1,
        help=(
            "Proto-map ProtoImage compression enum guess. "
            "Default: 1"
        ),
    )
    parser.add_argument(
        "--dashboard-wrapper-field",
        type=int,
        default=DEFAULT_DASHBOARD_WRAPPER_FIELD,
        help=(
            "Guessed field number for DashboardDataPackage payload wrapper. "
            "Default: 3"
        ),
    )
    parser.add_argument(
        "--app-request-field",
        type=int,
        default=DEFAULT_APP_REQUEST_FIELD,
        help=(
            "Guessed nested field number for AppRequest inside DashboardDataPackage. "
            "Default: 1"
        ),
    )
    parser.add_argument(
        "--command-data-field",
        type=int,
        default=DEFAULT_COMMAND_DATA_FIELD,
        help=(
            "Guessed field number for AppRequest.command_data oneof branch. "
            "Default: 1"
        ),
    )
    parser.add_argument(
        "--no-legacy-auth",
        action="store_true",
        help="Skip the legacy AA 21 auth sequence before the dashboard render test.",
    )
    parser.add_argument(
        "--auth-delay",
        type=float,
        default=0.1,
        help="Delay between legacy auth packets in seconds. Default: 0.1",
    )
    return parser.parse_args()


async def main() -> None:
    args = parse_args()
    ranked = top_candidates()
    print(
        "Field candidates:",
        ", ".join(f"{item.field_number}({item.score})" for item in ranked),
    )
    if args.dry_run:
        await send_dashboard_image(
            None,
            args.image,
            mode=args.mode,
            dry_run=True,
            header_byte2=args.header_byte2,
            image_field_number=args.image_field_number,
            use_legacy_auth=not args.no_legacy_auth,
            auth_delay=args.auth_delay,
            width=args.width,
            height=args.height,
            grid_distance=args.grid_distance,
            grid_height=args.grid_height,
            compression_mode=args.compression_mode,
            dashboard_wrapper_field=args.dashboard_wrapper_field,
            app_request_field=args.app_request_field,
            command_data_field=args.command_data_field,
        )
        return

    if args.address:
        targets = [(999, args.address, "manual-address")]
    else:
        targets = await find_even_candidates(args.scan_timeout)

    if not targets:
        raise SystemExit("No Even G2 candidates found")

    print("\nDiscovered candidates:")
    for score, address, name in targets:
        print(f"  {address} {name!r} score={score}")

    if not args.all_lenses:
        targets = targets[:1]
        print(f"\nAuto-selected candidate: {targets[0][1]} {targets[0][2]!r}")
    else:
        print("\nRunning test on all discovered candidates")

    input(
        "\nPress ENTER to start cmdId=7/cmdId=8 dashboard experiment "
        f"(mode={args.mode})"
    )

    for _, address, name in targets:
        print(f"\nConnecting to {address} {name!r}")
        async with BleakClient(address) as client:
            await client.start_notify(NOTIFY_UUID, notification_handler)
            print("Connected")
            await send_dashboard_image(
                client,
                args.image,
                mode=args.mode,
                dry_run=False,
                header_byte2=args.header_byte2,
                image_field_number=args.image_field_number,
                use_legacy_auth=not args.no_legacy_auth,
                auth_delay=args.auth_delay,
                width=args.width,
                height=args.height,
                grid_distance=args.grid_distance,
                grid_height=args.grid_height,
                compression_mode=args.compression_mode,
                dashboard_wrapper_field=args.dashboard_wrapper_field,
                app_request_field=args.app_request_field,
                command_data_field=args.command_data_field,
            )
            await asyncio.sleep(2)


if __name__ == "__main__":
    try:
        asyncio.run(main())
    except Exception as exc:
        print("BLE closed:", exc)
