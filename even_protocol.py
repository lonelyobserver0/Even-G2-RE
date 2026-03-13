"""Helpers for the confirmed Even G2 BLE transport."""

from __future__ import annotations

import struct
from typing import Iterable

MAGIC = 0xAA
VERSION = 0x12
HEADER_PREFIX = bytes([MAGIC, VERSION])
HEADER_FIXED = bytes([0x01, 0x01])

SERVICE_DASHBOARD = 0x0008
SERVICE_NAVIGATION = 0x0180
SERVICE_SYNC_INFO = 0x0108
SERVICE_DEV_INFO = 0x0109

CMD_INIT = 5
CMD_CREATE_PAGE = 7
CMD_UPDATE_IMAGE = 8
CMD_COMMIT_PAGE = 9


def crc16_ccitt_false(data: bytes, init: int = 0xFFFF) -> int:
    crc = init
    for byte in data:
        crc ^= byte << 8
        for _ in range(8):
            crc = ((crc << 1) ^ 0x1021) if crc & 0x8000 else (crc << 1)
            crc &= 0xFFFF
    return crc


def varint(value: int) -> bytes:
    if value < 0:
        raise ValueError("varint only supports non-negative values")

    out = bytearray()
    while value > 0x7F:
        out.append((value & 0x7F) | 0x80)
        value >>= 7
    out.append(value & 0x7F)
    return bytes(out)


def protobuf_varint(field_number: int, value: int) -> bytes:
    return varint((field_number << 3) | 0) + varint(value)


def protobuf_bytes(field_number: int, value: bytes) -> bytes:
    return varint((field_number << 3) | 2) + varint(len(value)) + value


def protobuf_message(field_number: int, fields: Iterable[bytes]) -> bytes:
    return protobuf_bytes(field_number, b"".join(fields))


def build_protobuf(
    cmd_id: int,
    seq_num: int,
    extra_fields: Iterable[bytes] = (),
) -> bytes:
    payload = bytearray()
    payload += protobuf_varint(1, cmd_id)
    payload += protobuf_varint(2, seq_num)
    for field in extra_fields:
        payload += field
    return bytes(payload)


def build_packet(
    service_id: int,
    protobuf_payload: bytes,
    *,
    header_byte2: int = 0,
) -> bytes:
    if not 0 <= header_byte2 <= 0xFF:
        raise ValueError("header_byte2 must fit in one byte")
    if len(protobuf_payload) > 0xFD:
        raise ValueError("protobuf payload too large for single packet")

    payload_len = len(protobuf_payload) + 2
    packet = bytearray()
    packet += HEADER_PREFIX
    packet.append(header_byte2)
    packet.append(payload_len)
    packet += HEADER_FIXED
    packet += struct.pack("<H", service_id)
    packet += protobuf_payload
    packet += struct.pack("<H", crc16_ccitt_false(protobuf_payload))
    return bytes(packet)


def parse_packet(packet: bytes) -> dict:
    if len(packet) < 10:
        raise ValueError("packet too short")
    if packet[0] != MAGIC or packet[1] != VERSION:
        raise ValueError("not an AA 12 packet")

    payload_len = packet[3]
    expected_len = payload_len + 8
    if len(packet) != expected_len:
        raise ValueError(f"length mismatch: got {len(packet)}, expected {expected_len}")

    service_id = struct.unpack_from("<H", packet, 6)[0]
    protobuf_payload = packet[8:-2]
    crc_expected = struct.unpack_from("<H", packet, len(packet) - 2)[0]
    crc_actual = crc16_ccitt_false(protobuf_payload)

    return {
        "header_byte2": packet[2],
        "payload_len": payload_len,
        "service_id": service_id,
        "protobuf_payload": protobuf_payload,
        "crc_expected": crc_expected,
        "crc_actual": crc_actual,
        "crc_ok": crc_expected == crc_actual,
    }
