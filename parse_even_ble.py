#!/usr/bin/env python3
"""
Parser pacchetti BLE Even G2 — analisi dal dump nRF Connect.

Formato pacchetto (confermato):
  Byte 0:    0xAA (magic)
  Byte 1:    0x12 (costante — versione protocollo?)
  Byte 2:    sconosciuto (varia — possibile hash/check)
  Byte 3:    payload_length (uint8)
  Byte 4-5:  0x01 0x01 (costante)
  Byte 6..6+N-1:  payload (N = payload_length)
    - Byte 0-1 del payload: serviceId (uint16 LE)
    - Byte 2+: protobuf message
  Ultimi 2 byte: CRC16

  Dimensione totale = payload_length + 8
"""

import re
import struct
import sys


def decode_varint(data: bytes, offset: int) -> tuple[int, int]:
    """Decode protobuf varint, ritorna (valore, nuovoOffset)."""
    result = 0
    shift = 0
    while offset < len(data):
        b = data[offset]
        result |= (b & 0x7F) << shift
        offset += 1
        if (b & 0x80) == 0:
            break
        shift += 7
    return result, offset


def parse_protobuf(data: bytes, indent: int = 0) -> list[dict]:
    """Parse protobuf semplice, ritorna lista di campi."""
    fields = []
    offset = 0
    prefix = "  " * indent

    while offset < len(data):
        if offset >= len(data):
            break

        tag_byte, new_offset = decode_varint(data, offset)
        field_num = tag_byte >> 3
        wire_type = tag_byte & 0x07

        if field_num == 0:
            break  # invalid

        entry = {"field": field_num, "wire_type": wire_type}

        if wire_type == 0:  # varint
            value, new_offset = decode_varint(data, new_offset)
            entry["value"] = value
            entry["type"] = "varint"
        elif wire_type == 1:  # 64-bit
            if new_offset + 8 > len(data):
                break
            value = struct.unpack_from("<Q", data, new_offset)[0]
            new_offset += 8
            entry["value"] = value
            entry["type"] = "fixed64"
        elif wire_type == 2:  # length-delimited
            length, new_offset = decode_varint(data, new_offset)
            if new_offset + length > len(data):
                break
            value = data[new_offset:new_offset + length]
            new_offset += length
            entry["type"] = "bytes"
            entry["length"] = length
            # Prova a decodificare come stringa
            try:
                text = value.decode("utf-8")
                if all(32 <= ord(c) < 127 or c in "\n\r\t" for c in text):
                    entry["value_str"] = text
            except (UnicodeDecodeError, ValueError):
                pass
            # Prova a decodificare come sub-message protobuf
            try:
                sub = parse_protobuf(value, indent + 1)
                if sub and len(sub) > 0:
                    entry["sub_message"] = sub
            except Exception:
                pass
            entry["value_hex"] = value.hex(" ") if value else "(empty)"
            entry["value"] = value
        elif wire_type == 5:  # 32-bit
            if new_offset + 4 > len(data):
                break
            value = struct.unpack_from("<I", data, new_offset)[0]
            new_offset += 4
            entry["value"] = value
            entry["type"] = "fixed32"
        else:
            break  # unknown wire type

        fields.append(entry)
        offset = new_offset

    return fields


def format_protobuf(fields: list[dict], indent: int = 0) -> str:
    """Formatta campi protobuf come stringa leggibile."""
    lines = []
    prefix = "    " * indent

    for f in fields:
        if f["type"] == "varint":
            lines.append(f'{prefix}field {f["field"]}: {f["value"]} (0x{f["value"]:X})')
        elif f["type"] == "bytes":
            if "value_str" in f:
                lines.append(f'{prefix}field {f["field"]}: "{f["value_str"]}"')
            elif f["length"] == 0:
                lines.append(f'{prefix}field {f["field"]}: (empty bytes)')
            elif "sub_message" in f:
                lines.append(f'{prefix}field {f["field"]}: {{')
                lines.append(format_protobuf(f["sub_message"], indent + 1))
                lines.append(f'{prefix}}}')
            else:
                lines.append(f'{prefix}field {f["field"]}: [{f["value_hex"]}]')
        elif f["type"] in ("fixed32", "fixed64"):
            lines.append(f'{prefix}field {f["field"]}: {f["value"]} ({f["type"]})')

    return "\n".join(lines)


# Nomi serviceId noti (da determinare con certezza)
SERVICE_NAMES = {
    0x0001: "DEFAULT?",
    0x0008: "DASHBOARD/SETTINGS?",
    0x000C: "MODULE_CONFIGURE?",
    0x000E: "NOTIFICATION/TRANSLATE?",
    0x0080: "SYSTEM?",
    0x0108: "SYNC_INFO?",
    0x0109: "DEV_INFO",
    0x010D: "DEV_SETTINGS?",
}


def parse_packet(hex_str: str, timestamp: str = "") -> dict:
    """Parse un pacchetto Even BLE da stringa hex."""
    # Rimuovi prefisso (0x) e separatori
    clean = hex_str.replace("(0x) ", "").replace("-", "").strip()
    data = bytes.fromhex(clean)

    result = {
        "raw_len": len(data),
        "timestamp": timestamp,
    }

    if len(data) < 6:
        result["error"] = "Troppo corto"
        return result

    # Header
    result["magic"] = data[0]
    result["byte1"] = data[1]
    result["byte2"] = data[2]
    result["payload_len"] = data[3]
    result["byte4"] = data[4]
    result["byte5"] = data[5]

    expected_total = data[3] + 8
    if len(data) != expected_total:
        result["warning"] = f"Lunghezza attesa {expected_total}, ricevuta {len(data)}"

    payload_len = data[3]

    if payload_len == 0:
        # Pacchetto senza payload (heartbeat?)
        result["type"] = "HEARTBEAT/EMPTY"
        result["crc"] = data[6:8].hex(" ") if len(data) >= 8 else "N/A"
        return result

    # Payload
    payload = data[6:6 + payload_len]
    crc = data[6 + payload_len:6 + payload_len + 2]
    result["crc"] = crc.hex(" ")

    if len(payload) >= 2:
        service_id = struct.unpack_from("<H", payload, 0)[0]
        result["service_id"] = service_id
        result["service_name"] = SERVICE_NAMES.get(service_id, f"UNKNOWN(0x{service_id:04X})")

        if len(payload) > 2:
            proto_data = payload[2:]
            result["protobuf_hex"] = proto_data.hex(" ")
            try:
                fields = parse_protobuf(proto_data)
                result["protobuf"] = fields
                result["protobuf_str"] = format_protobuf(fields)
            except Exception as e:
                result["protobuf_error"] = str(e)

    return result


def parse_nrf_log(filepath: str):
    """Parse file log nRF Connect."""
    with open(filepath, "r") as f:
        lines = f.readlines()

    packets = []
    for line in lines:
        # Match: I	14:23:19.926	Notification received from ..., value: (0x) AA-...
        m = re.match(
            r'[IA]\s+(\d{2}:\d{2}:\d{2}\.\d+)\s+.*?value:\s*(\(0x\)\s*[0-9A-Fa-f-]+)',
            line.strip()
        )
        if not m:
            # Anche le linee con "received"
            m = re.match(
                r'[IA]\s+(\d{2}:\d{2}:\d{2}\.\d+)\s+.*?"(\(0x\)\s*[0-9A-Fa-f-]+)".*received',
                line.strip()
            )
        if m:
            timestamp = m.group(1)
            hex_data = m.group(2)
            packets.append(parse_packet(hex_data, timestamp))

    return packets


def main():
    if len(sys.argv) < 2:
        filepath = "/home/loneobs/Downloads/AyuGram Desktop/even logs.txt"
    else:
        filepath = sys.argv[1]

    print(f"Parsing: {filepath}")
    print("=" * 80)

    packets = parse_nrf_log(filepath)

    # Statistiche
    service_counts = {}
    cmd_counts = {}

    for i, pkt in enumerate(packets):
        ts = pkt.get("timestamp", "")
        pkt_type = pkt.get("type", "DATA")

        if pkt_type == "HEARTBEAT/EMPTY":
            print(f"\n[{i:3d}] {ts}  HEARTBEAT  (crc={pkt.get('crc', '?')})")
            continue

        sid = pkt.get("service_id", -1)
        sname = pkt.get("service_name", "?")
        proto_str = pkt.get("protobuf_str", "")

        # Estrai cmdId (field 1) e seqNum (field 2) dal protobuf
        cmd_id = "?"
        seq_num = "?"
        fields = pkt.get("protobuf", [])
        for f in fields:
            if f["field"] == 1 and f["type"] == "varint":
                cmd_id = f["value"]
            elif f["field"] == 2 and f["type"] == "varint":
                seq_num = f["value"]

        service_counts[sid] = service_counts.get(sid, 0) + 1
        cmd_key = f"{sid}:{cmd_id}"
        cmd_counts[cmd_key] = cmd_counts.get(cmd_key, 0) + 1

        print(f"\n[{i:3d}] {ts}  serviceId={sid} ({sname})  cmdId={cmd_id}  seq={seq_num}  "
              f"payload={pkt.get('payload_len', '?')}B")
        if proto_str:
            for line in proto_str.split("\n"):
                print(f"      {line}")

    # Sommario
    print("\n" + "=" * 80)
    print("SOMMARIO")
    print("=" * 80)
    print(f"\nTotale pacchetti: {len(packets)}")

    print(f"\nService ID distribution:")
    for sid, count in sorted(service_counts.items()):
        name = SERVICE_NAMES.get(sid, f"UNKNOWN(0x{sid:04X})")
        print(f"  serviceId={sid:5d} (0x{sid:04X}) [{name:25s}]: {count} pacchetti")

    print(f"\nCommand distribution (serviceId:cmdId):")
    for key, count in sorted(cmd_counts.items()):
        print(f"  {key:15s}: {count} pacchetti")


if __name__ == "__main__":
    main()
