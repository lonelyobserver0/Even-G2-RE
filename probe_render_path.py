import asyncio
import time
from io import BytesIO

from bleak import BleakClient, BleakScanner
from PIL import Image, ImageDraw

WRITE_UUID = "00002760-08c2-11e1-9073-0e8ac72e5401"
NOTIFY_UUID = "00002760-08c2-11e1-9073-0e8ac72e5402"


def varint(value: int) -> bytes:
    out = bytearray()
    while value > 0x7F:
        out.append((value & 0x7F) | 0x80)
        value >>= 7
    out.append(value & 0x7F)
    return bytes(out)


def crc16(data: bytes, init: int = 0xFFFF) -> int:
    crc = init
    for byte in data:
        crc ^= byte << 8
        for _ in range(8):
            crc = ((crc << 1) ^ 0x1021) if crc & 0x8000 else (crc << 1)
            crc &= 0xFFFF
    return crc


def old_pkt(seq: int, sh: int, sl: int, payload: bytes) -> bytes:
    header = bytes([0xAA, 0x21, seq & 0xFF, len(payload) + 2, 0x01, 0x01, sh, sl])
    full = header + payload
    csum = crc16(full[8:])
    return full + bytes([csum & 0xFF, (csum >> 8) & 0xFF])


def build_pb(cmd_id: int, seq_num: int, extra: bytes = b"") -> bytes:
    return bytes([0x08]) + varint(cmd_id) + bytes([0x10]) + varint(seq_num) + extra


def make_container_pb() -> bytes:
    image_container = b"\x08" + varint(0) + b"\x10" + varint(0)
    image_container += b"\x18" + varint(100) + b"\x20" + varint(50)
    image_container += b"\x48" + varint(1) + b"\x52\x04img1"
    return b"\x08" + varint(1) + b"\x22" + varint(len(image_container)) + image_container


def make_tiny_bmp() -> bytes:
    image = Image.new("1", (16, 8), 0)
    draw = ImageDraw.Draw(image)
    draw.rectangle([2, 2, 13, 5], fill=1)
    buf = BytesIO()
    image.save(buf, format="BMP")
    return buf.getvalue()


async def notify_handler(_: int, data: bytearray) -> None:
    print(f"notify {len(data):3d} bytes: {bytes(data).hex()}")


async def find_left() -> str | None:
    devices = await BleakScanner.discover(timeout=8)
    for device in devices:
        name = device.name or ""
        if "g2" in name.lower() and "_l_" in name.lower():
            return device.address
    return None


async def send_legacy_auth(client: BleakClient) -> None:
    timestamp = varint(int(time.time()))
    tx_blob = bytes([0xE8, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0x01])
    packets = [
        old_pkt(1, 0x80, 0x00, bytes([0x08, 0x04, 0x10, 0x0C, 0x1A, 0x04, 0x08, 0x01, 0x10, 0x04])),
        old_pkt(2, 0x80, 0x20, bytes([0x08, 0x05, 0x10, 0x0E, 0x22, 0x02, 0x08, 0x02])),
        old_pkt(
            3,
            0x80,
            0x20,
            bytes([0x08, 0x80, 0x01, 0x10, 0x0F, 0x82, 0x08, 0x11, 0x08])
            + timestamp
            + bytes([0x10])
            + tx_blob,
        ),
        old_pkt(4, 0x80, 0x00, bytes([0x08, 0x04, 0x10, 0x10, 0x1A, 0x04, 0x08, 0x01, 0x10, 0x04])),
        old_pkt(5, 0x80, 0x00, bytes([0x08, 0x04, 0x10, 0x11, 0x1A, 0x04, 0x08, 0x01, 0x10, 0x04])),
        old_pkt(6, 0x80, 0x20, bytes([0x08, 0x05, 0x10, 0x12, 0x22, 0x02, 0x08, 0x01])),
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
    print("Sending legacy auth")
    for index, packet in enumerate(packets, start=1):
        await client.write_gatt_char(WRITE_UUID, packet, response=False)
        print(f"  auth {index}/{len(packets)}: {len(packet)} bytes")
        await asyncio.sleep(0.1)
    await asyncio.sleep(1.0)


async def main() -> None:
    address = await find_left()
    if not address:
        raise SystemExit("Left lens not found")

    tiny_bmp = make_tiny_bmp()
    bmp_field = bytes([0x1A]) + varint(len(tiny_bmp)) + tiny_bmp
    container = make_container_pb()

    print(f"Connecting to {address}")
    async with BleakClient(address) as client:
        await client.start_notify(NOTIFY_UUID, notify_handler)
        print("Connected")
        input("\nPress ENTER to send render-path probes")
        await send_legacy_auth(client)

        seq = 0x20
        probes = [
            ("old svc=0x08-0x20 cmdId=7", old_pkt(seq, 0x08, 0x20, build_pb(7, seq))),
            ("old svc=0x08-0x20 cmdId=8", old_pkt(seq + 1, 0x08, 0x20, build_pb(8, seq + 1, bmp_field))),
            ("old svc=0x20-0x20 container", old_pkt(seq + 2, 0x20, 0x20, container)),
            ("old svc=0x21-0x20 container", old_pkt(seq + 3, 0x21, 0x20, container)),
        ]

        for label, packet in probes:
            print(f"\nSending {label}: {len(packet)} bytes")
            await client.write_gatt_char(WRITE_UUID, packet, response=False)
            await asyncio.sleep(3.0)

        print("\nDone. Watch the glasses for 10 seconds.")
        await asyncio.sleep(10.0)


if __name__ == "__main__":
    asyncio.run(main())
