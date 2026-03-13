"""
BLE HCI Log Parser for Even G2
================================
Parses .cfa (btsnoop) HCI log files and extracts packets
sent to/from Even G2 glasses.

Usage:
    python parse_log.py path/to/BT_HCI_*.cfa
"""

import struct
import sys
from collections import defaultdict
from pathlib import Path

from even_protocol import parse_packet

# Known G2 UUIDs and handles
G2_UUIDS = {
    "5401": "content_write",
    "5402": "content_notify",
    "6401": "render_write",
    "6402": "render_notify",
    "7401": "unknown1_write",
    "7402": "unknown1_notify",
    "0001": "unknown2_write",
    "0002": "unknown2_notify",
}

# G2 MAC addresses (yours)
G2_MACS = ["d8:b8:af:2a:e8:90", "e8:9d:ef:a4:de:80"]


def try_parse_btsnoop(data):
    """Try to parse as standard btsnoop format."""
    # btsnoop header: "btsnoop\0" + version(4) + datalink(4) = 16 bytes
    if data[:8] == b"btsnoop\x00":
        version = struct.unpack(">I", data[8:12])[0]
        datalink = struct.unpack(">I", data[12:16])[0]
        print(f"  btsnoop version={version}, datalink={datalink}")
        return parse_btsnoop_packets(data, 16)
    return None


def parse_btsnoop_packets(data, offset):
    """Parse btsnoop packet records."""
    packets = []
    while offset + 24 <= len(data):
        orig_len = struct.unpack(">I", data[offset:offset+4])[0]
        incl_len = struct.unpack(">I", data[offset+4:offset+8])[0]
        flags = struct.unpack(">I", data[offset+8:offset+12])[0]
        drops = struct.unpack(">I", data[offset+12:offset+16])[0]
        timestamp = struct.unpack(">Q", data[offset+16:offset+24])[0]

        if incl_len > 100000 or incl_len == 0:
            break

        pkt_data = data[offset+24:offset+24+incl_len]
        direction = "TX" if (flags & 0x01) == 0 else "RX"

        packets.append({
            "offset": offset,
            "orig_len": orig_len,
            "incl_len": incl_len,
            "flags": flags,
            "direction": direction,
            "timestamp": timestamp,
            "data": pkt_data,
        })

        offset += 24 + incl_len

    return packets


def try_parse_raw(data):
    """Try to find HCI packets by scanning for known patterns."""
    packets = []
    i = 0
    while i < len(data) - 5:
        # HCI ACL data: type 0x02
        if data[i] == 0x02:
            if i + 5 <= len(data):
                handle = struct.unpack("<H", data[i+1:i+3])[0]
                length = struct.unpack("<H", data[i+3:i+5])[0]
                conn_handle = handle & 0x0FFF
                if 1 <= length <= 500 and i + 5 + length <= len(data):
                    pkt_data = data[i+5:i+5+length]
                    packets.append({
                        "offset": i,
                        "type": "ACL",
                        "handle": conn_handle,
                        "length": length,
                        "data": pkt_data,
                    })
                    i += 5 + length
                    continue
        # HCI command: type 0x01
        elif data[i] == 0x01:
            if i + 4 <= len(data):
                opcode = struct.unpack("<H", data[i+1:i+3])[0]
                length = data[i+3]
                if length <= 255 and i + 4 + length <= len(data):
                    pkt_data = data[i+4:i+4+length]
                    packets.append({
                        "offset": i,
                        "type": "CMD",
                        "opcode": opcode,
                        "length": length,
                        "data": pkt_data,
                    })
                    i += 4 + length
                    continue
        # HCI event: type 0x04
        elif data[i] == 0x04:
            if i + 3 <= len(data):
                event = data[i+1]
                length = data[i+2]
                if length <= 255 and i + 3 + length <= len(data):
                    pkt_data = data[i+3:i+3+length]
                    packets.append({
                        "offset": i,
                        "type": "EVT",
                        "event": event,
                        "length": length,
                        "data": pkt_data,
                    })
                    i += 3 + length
                    continue
        i += 1

    return packets


def extract_att_writes(packets):
    """Extract ATT Write commands/requests from ACL packets."""
    writes = []

    for pkt in packets:
        d = pkt.get("data", b"")
        if len(d) < 4:
            continue

        # L2CAP header: length(2) + CID(2)
        # For ATT: CID = 0x0004
        if len(d) >= 4:
            l2cap_len = struct.unpack("<H", d[0:2])[0]
            l2cap_cid = struct.unpack("<H", d[2:4])[0]

            if l2cap_cid == 0x0004 and len(d) >= 5:
                att_opcode = d[4]
                att_data = d[5:]

                # ATT Write Request (0x12) or Write Command (0x52)
                if att_opcode in (0x12, 0x52) and len(att_data) >= 2:
                    att_handle = struct.unpack("<H", att_data[0:2])[0]
                    att_value = att_data[2:]

                    writes.append({
                        "offset": pkt.get("offset", 0),
                        "handle": att_handle,
                        "opcode": att_opcode,
                        "opcode_name": "Write Request" if att_opcode == 0x12 else "Write Command",
                        "value": att_value,
                        "raw_pkt": pkt,
                    })

                # ATT Handle Value Notification (0x1B)
                elif att_opcode == 0x1B and len(att_data) >= 2:
                    att_handle = struct.unpack("<H", att_data[0:2])[0]
                    att_value = att_data[2:]

                    writes.append({
                        "offset": pkt.get("offset", 0),
                        "handle": att_handle,
                        "opcode": att_opcode,
                        "opcode_name": "Notification",
                        "value": att_value,
                        "raw_pkt": pkt,
                    })

    return writes


def find_g2_packets(writes):
    """Filter for packets that look like G2 protocol."""
    g2_packets = []

    for w in writes:
        val = w["value"]
        # Confirmed G2 packet header: AA 12
        is_g2 = len(val) >= 2 and val[0] == 0xAA and val[1] == 0x12
        is_interesting = is_g2 or len(val) > 50

        if is_interesting:
            w["is_g2_protocol"] = is_g2
            g2_packets.append(w)

    return g2_packets


def analyze_g2_packets(packets):
    """Analyze G2 protocol packets and extract service IDs."""
    stats = defaultdict(int)
    large_packets = []

    for p in packets:
        val = p["value"]

        if p.get("is_g2_protocol") and len(val) >= 10:
            try:
                parsed = parse_packet(val)
            except ValueError:
                continue

            svc = f"0x{parsed['service_id']:04X}"
            stats[svc] += 1

            if len(val) > 20:
                payload = parsed["protobuf_payload"]
                large_packets.append({
                    "service": svc,
                    "handle": p["handle"],
                    "payload_len": len(payload),
                    "payload_hex": payload[:50].hex(),
                    "crc_ok": parsed["crc_ok"],
                    "header_byte2": parsed["header_byte2"],
                    "full_hex": val.hex(),
                })
        elif len(val) > 50:
            large_packets.append({
                "service": "raw",
                "handle": p["handle"],
                "payload_len": len(val),
                "payload_hex": val[:50].hex(),
                "full_hex": val[:100].hex(),
            })

    return stats, large_packets


# ═══════════════════════════════════════════════════
# Main
# ═══════════════════════════════════════════════════

def main():
    if len(sys.argv) < 2:
        print("Usage: python parse_log.py <file.cfa>")
        print("       python parse_log.py FS/data/misc/bluetooth/logs/bthci/CsLog_*/BT_HCI_*.cfa")
        sys.exit(1)

    filepath = sys.argv[1]
    print(f"Parsing: {filepath}")
    print(f"Size: {Path(filepath).stat().st_size:,} bytes")
    print()

    with open(filepath, "rb") as f:
        data = f.read()

    # Try btsnoop format first
    print("Trying btsnoop format...")
    packets = try_parse_btsnoop(data)

    if packets:
        print(f"  Parsed {len(packets)} btsnoop packets")
    else:
        print("  Not btsnoop. Scanning for raw HCI packets...")
        packets = try_parse_raw(data)
        print(f"  Found {len(packets)} raw HCI packets")

        if not packets:
            print("\n  Could not parse file. Dumping first 256 bytes:")
            print(f"  {data[:256].hex()}")
            print(f"\n  ASCII: {data[:256]}")
            return

    # Extract ATT writes
    print("\nExtracting ATT operations...")
    writes = extract_att_writes(packets)
    print(f"  Found {len(writes)} ATT write/notify operations")

    # Filter G2 packets
    print("\nFiltering G2-related packets...")
    g2_pkts = find_g2_packets(writes)
    print(f"  Found {len(g2_pkts)} G2/interesting packets")

    # Analyze
    if g2_pkts:
        stats, large = analyze_g2_packets(g2_pkts)

        print("\n" + "="*60)
        print("G2 SERVICE ID USAGE")
        print("="*60)
        for svc, count in sorted(stats.items(), key=lambda x: -x[1]):
            print(f"  {svc}: {count} packets")

        print(f"\n{'='*60}")
        print(f"LARGE PACKETS (potential image data): {len(large)}")
        print("="*60)
        for i, lp in enumerate(large[:30]):
            print(f"  [{i}] svc={lp['service']} handle=0x{lp['handle']:04X} len={lp['payload_len']}")
            if "crc_ok" in lp:
                print(f"      crc_ok={lp['crc_ok']} header_byte2=0x{lp['header_byte2']:02X}")
            print(f"      {lp['payload_hex']}...")

        # Save all G2 packets to file for deeper analysis
        outfile = "g2_packets.txt"
        with open(outfile, "w") as f:
            f.write(f"Parsed from: {filepath}\n")
            f.write(f"Total G2 packets: {len(g2_pkts)}\n\n")

            for i, p in enumerate(g2_pkts):
                val = p["value"]
                f.write(f"[{i:04d}] handle=0x{p['handle']:04X} {p['opcode_name']} len={len(val)}\n")
                f.write(f"       {val.hex()}\n")

                if p.get("is_g2_protocol") and len(val) >= 10:
                    try:
                        parsed = parse_packet(val)
                    except ValueError:
                        pass
                    else:
                        f.write(
                            "       "
                            f"svc=0x{parsed['service_id']:04X} "
                            f"byte2=0x{parsed['header_byte2']:02X} "
                            f"payload_len={parsed['payload_len']} "
                            f"crc_ok={parsed['crc_ok']}\n"
                        )
                f.write("\n")

        print(f"\nFull packet dump saved to {outfile}")
    else:
        print("\nNo G2 packets found.")
        print("Dumping all ATT writes for inspection:")
        for i, w in enumerate(writes[:50]):
            print(f"  [{i}] handle=0x{w['handle']:04X} {w['opcode_name']} len={len(w['value'])}: {w['value'][:30].hex()}")


if __name__ == "__main__":
    main()
