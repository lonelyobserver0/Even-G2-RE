"""
Analyze Android logcat or Bluetooth stack logs for Even G2 BLE bursts.

The script correlates:
- app-level logs: "BleDevice: Send cmd ..."
- stack-level logs: ATT write completions and notification handles

Examples:
    adb logcat -d > even.log
    python analyze_even_logcat.py --log even.log

    unzip -p bugreport.zip FS/data/misc/bluetooth/logs/bluetooth_20260310_093703_17456.log > bt.log
    python analyze_even_logcat.py --logcat even.log --bt-log bt.log
"""

from __future__ import annotations

import argparse
import re
from collections import defaultdict
from pathlib import Path


APP_SEND_RE = re.compile(
    r"(?P<ts>\d{2}-\d{2} \d{2}:\d{2}:\d{2}\.\d+).*?"
    r"BleDevice: Send cmd: (?P<addr>[0-9A-F:]+) .*? type=(?P<type>\d+), data length=(?P<len>\d+)"
)

BT_WRITE_RE = re.compile(
    r"\[(?P<ts>.*?)\].*?bta_gattc_write_cmpl: Handling write response type: 1: handle (?P<handle>0x[0-9A-Fa-f]+)"
)

BT_NOTIFY_RE = re.compile(
    r"\[(?P<ts>.*?)\].*?bta_gattc_proc_other_indication: check p_data->att_value.handle=(?P<handle>\d+)"
)

BT_L2CAP_RE = re.compile(
    r"\[(?P<ts>.*?)\].*?L2CA_SendFixedChnlData: Enqueued data for CID: 0x0004 len:(?P<len>\d+)"
)


def parse_app_log(path: Path) -> list[dict]:
    entries = []
    for line in path.read_text(errors="ignore").splitlines():
        match = APP_SEND_RE.search(line)
        if not match:
            continue
        entries.append(
            {
                "ts": match.group("ts"),
                "addr": match.group("addr"),
                "type": int(match.group("type")),
                "data_len": int(match.group("len")),
                "raw": line,
            }
        )
    return entries


def parse_bt_log(path: Path) -> list[dict]:
    events = []
    for line in path.read_text(errors="ignore").splitlines():
        for kind, regex in (
            ("write", BT_WRITE_RE),
            ("notify", BT_NOTIFY_RE),
            ("l2cap", BT_L2CAP_RE),
        ):
            match = regex.search(line)
            if not match:
                continue
            item = {"kind": kind, "ts": match.group("ts"), "raw": line}
            if kind == "write":
                item["handle"] = match.group("handle")
            else:
                item["handle"] = int(match.group("handle") if kind == "notify" else match.group("len"))
            events.append(item)
            break
    return events


def summarize_app(entries: list[dict]) -> str:
    lines = []
    by_addr_type = defaultdict(list)
    for entry in entries:
        by_addr_type[(entry["addr"], entry["type"])].append(entry["data_len"])

    for (addr, ps_type), lengths in sorted(by_addr_type.items()):
        lines.append(f"{addr} psType={ps_type}: {len(lengths)} writes")
        lines.append(f"  lengths: {lengths}")
    return "\n".join(lines)


def summarize_bt(events: list[dict]) -> str:
    lines = []
    writes = [event["handle"] for event in events if event["kind"] == "write"]
    notif = [event["handle"] for event in events if event["kind"] == "notify"]
    l2cap = [event["handle"] for event in events if event["kind"] == "l2cap"]

    if writes:
        lines.append(f"write handles: {sorted(set(writes))}")
    if notif:
        lines.append(f"notify handles: {sorted(set(notif))}")
    if l2cap:
        lines.append(f"l2cap ATT lengths: {l2cap[:40]}{' ...' if len(l2cap) > 40 else ''}")
    return "\n".join(lines)


def infer_mapping(entries: list[dict], events: list[dict]) -> str:
    lines = []
    right_writes = [entry for entry in entries if entry["addr"].endswith("DE:80")]

    type_lengths = defaultdict(list)
    for entry in right_writes:
        type_lengths[entry["type"]].append(entry["data_len"])

    for ps_type, lengths in sorted(type_lengths.items()):
        lines.append(f"Right lens psType={ps_type}: lengths={lengths}")

    write_handles = [event["handle"] for event in events if event["kind"] == "write"]
    notify_handles = [event["handle"] for event in events if event["kind"] == "notify"]

    if "0x0842" in write_handles and 2116 in notify_handles:
        lines.append("Inference: psType=0 uses write handle 0x0842 and notify handle 2116 (0x0844).")
    if "0x0882" in write_handles and 2180 in notify_handles:
        lines.append("Inference: psType=3 uses write handle 0x0882 and notify handle 2180 (0x0884).")

    if any(length in (244, 62) for length in type_lengths.get(0, [])):
        lines.append("Inference: the 244/244/62 burst belongs to psType=0 on the right lens.")
    if any(length in (103, 11, 79) for length in type_lengths.get(3, [])):
        lines.append("Inference: the 103/11/244/79 burst belongs to psType=3 on the right lens.")

    return "\n".join(lines)


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--log", "--logcat", dest="logcat", help="logcat text file")
    parser.add_argument("--bt-log", help="Bluetooth stack log text file")
    args = parser.parse_args()

    if not args.logcat and not args.bt_log:
        parser.error("provide at least --log or --bt-log")

    entries = parse_app_log(Path(args.logcat)) if args.logcat else []
    events = parse_bt_log(Path(args.bt_log)) if args.bt_log else []

    if entries:
        print("App-level sends")
        print("---------------")
        print(summarize_app(entries))
        print()

    if events:
        print("Bluetooth stack")
        print("---------------")
        print(summarize_bt(events))
        print()

    if entries or events:
        print("Inference")
        print("---------")
        print(infer_mapping(entries, events))

    return 0


if __name__ == "__main__":
    raise SystemExit(main())
