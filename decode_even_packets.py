"""
Decode Even G2 AA 12 packets from a raw hex string or from g2_packets.txt.

Examples:
    python decode_even_packets.py --hex "aa12000b01010800080710011a02424dffff"
    python decode_even_packets.py --dump g2_packets.txt
"""

from __future__ import annotations

import argparse
import sys
from pathlib import Path

from even_protocol import parse_packet


WIRE_VARINT = 0
WIRE_64BIT = 1
WIRE_LENGTH_DELIMITED = 2
WIRE_32BIT = 5


def read_varint(data: bytes, offset: int) -> tuple[int, int]:
    value = 0
    shift = 0
    while offset < len(data):
        byte = data[offset]
        offset += 1
        value |= (byte & 0x7F) << shift
        if (byte & 0x80) == 0:
            return value, offset
        shift += 7
        if shift > 63:
            raise ValueError("varint too long")
    raise ValueError("truncated varint")


def decode_fields(data: bytes) -> list[dict]:
    fields = []
    offset = 0
    while offset < len(data):
        key, offset = read_varint(data, offset)
        field_number = key >> 3
        wire_type = key & 0x07

        entry = {
            "field_number": field_number,
            "wire_type": wire_type,
        }

        if wire_type == WIRE_VARINT:
            value, offset = read_varint(data, offset)
            entry["value"] = value
        elif wire_type == WIRE_LENGTH_DELIMITED:
            length, offset = read_varint(data, offset)
            value = data[offset:offset + length]
            if len(value) != length:
                raise ValueError("truncated length-delimited field")
            offset += length
            entry["value"] = value
        elif wire_type == WIRE_32BIT:
            value = data[offset:offset + 4]
            if len(value) != 4:
                raise ValueError("truncated 32-bit field")
            offset += 4
            entry["value"] = value
        elif wire_type == WIRE_64BIT:
            value = data[offset:offset + 8]
            if len(value) != 8:
                raise ValueError("truncated 64-bit field")
            offset += 8
            entry["value"] = value
        else:
            raise ValueError(f"unsupported wire type {wire_type}")

        fields.append(entry)

    return fields


def looks_like_nested_protobuf(value: bytes) -> bool:
    if not value:
        return False
    try:
        decode_fields(value)
    except Exception:
        return False
    return True


def describe_bytes(value: bytes) -> str:
    preview = value[:32].hex()
    suffix = "..." if len(value) > 32 else ""
    tags = []
    if value.startswith(b"BM"):
        tags.append("BMP")
    if value.startswith(b"\x89PNG\r\n\x1a\n"):
        tags.append("PNG")
    if looks_like_nested_protobuf(value):
        tags.append("nested-pb")
    tag_text = f" [{' '.join(tags)}]" if tags else ""
    return f"len={len(value)} {preview}{suffix}{tag_text}"


def print_packet(packet_hex: str, index: int | None = None) -> None:
    packet = bytes.fromhex(packet_hex)
    parsed = parse_packet(packet)
    prefix = f"[{index}] " if index is not None else ""
    print(
        f"{prefix}svc=0x{parsed['service_id']:04X} "
        f"byte2=0x{parsed['header_byte2']:02X} "
        f"payload_len={parsed['payload_len']} "
        f"crc_ok={parsed['crc_ok']}"
    )

    try:
        fields = decode_fields(parsed["protobuf_payload"])
    except Exception as exc:
        print(f"  protobuf decode error: {exc}")
        print(f"  raw: {parsed['protobuf_payload'].hex()}")
        return

    for field in fields:
        field_number = field["field_number"]
        wire_type = field["wire_type"]
        if wire_type == WIRE_VARINT:
            print(f"  field {field_number}: varint {field['value']}")
            continue

        value = field["value"]
        if isinstance(value, bytes):
            print(f"  field {field_number}: bytes {describe_bytes(value)}")
        else:
            print(f"  field {field_number}: wire={wire_type} {value}")

        if wire_type == WIRE_LENGTH_DELIMITED and looks_like_nested_protobuf(value):
            try:
                nested = decode_fields(value)
            except Exception:
                continue
            for inner in nested:
                inner_number = inner["field_number"]
                if inner["wire_type"] == WIRE_VARINT:
                    print(f"    nested field {inner_number}: varint {inner['value']}")
                elif isinstance(inner["value"], bytes):
                    print(f"    nested field {inner_number}: bytes {describe_bytes(inner['value'])}")
                else:
                    print(f"    nested field {inner_number}: wire={inner['wire_type']} {inner['value']}")


def extract_hex_packets(text: str) -> list[str]:
    packets = []
    for line in text.splitlines():
        candidate = line.strip().replace(" ", "")
        if not candidate:
            continue
        if candidate.startswith("aa12") and all(ch in "0123456789abcdef" for ch in candidate.lower()):
            packets.append(candidate)
            continue
        if "aa12" not in candidate.lower():
            continue
        idx = candidate.lower().find("aa12")
        candidate = candidate[idx:]
        if all(ch in "0123456789abcdef" for ch in candidate.lower()) and len(candidate) % 2 == 0:
            packets.append(candidate)
    return packets


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--hex", help="Single AA 12 packet as hex")
    parser.add_argument("--dump", help="Text file containing packet hex")
    args = parser.parse_args()

    if not args.hex and not args.dump:
        parser.error("one of --hex or --dump is required")

    if args.hex:
        print_packet(args.hex)
        return 0

    path = Path(args.dump)
    text = path.read_text()
    packets = extract_hex_packets(text)
    for index, packet_hex in enumerate(packets):
        print_packet(packet_hex, index=index)
    print(f"\nDecoded {len(packets)} AA 12 packets from {path}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
