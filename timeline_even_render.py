"""
Build a simple render-cycle timeline from Even app logcat captures.

It correlates:
- right-lens `BleDevice: Send cmd ... data length=...`
- right-lens notify callbacks

and groups nearby events into windows, which helps isolate:
- control prefix
- render triplets `244,244,X`
- notify cadence after each burst

Example:
    python timeline_even_render.py --log dashboard-logcat.txt
"""

from __future__ import annotations

import argparse
import re
from datetime import datetime
from pathlib import Path


RIGHT_ADDR = "E8:9D:EF:A4:DE:80"

SEND_RE = re.compile(
    r"(?P<ts>\d{2}-\d{2} \d{2}:\d{2}:\d{2}\.\d+).*?"
    r"BleDevice: Send cmd: (?P<addr>[0-9A-F:]+) .*? type=(?P<type>\d+), data length=(?P<len>\d+)"
)

NOTIFY_RE = re.compile(
    r"(?P<ts>\d{2}-\d{2} \d{2}:\d{2}:\d{2}\.\d+).*?"
    r"BluetoothGatt: onNotify\(\) - Device=(?P<addr>[0-9A-F:]+) handle=(?P<handle>\d+)"
)


def parse_ts(value: str) -> datetime:
    return datetime.strptime(f"2026-{value}", "%Y-%m-%d %H:%M:%S.%f")


def load_events(path: Path) -> list[dict]:
    events = []
    for line in path.read_text(errors="ignore").splitlines():
        send_match = SEND_RE.search(line)
        if send_match and send_match.group("addr") == RIGHT_ADDR:
            events.append(
                {
                    "kind": "send",
                    "ts_raw": send_match.group("ts"),
                    "ts": parse_ts(send_match.group("ts")),
                    "type": int(send_match.group("type")),
                    "length": int(send_match.group("len")),
                    "raw": line,
                }
            )
            continue

        notify_match = NOTIFY_RE.search(line)
        if notify_match and notify_match.group("addr") == RIGHT_ADDR:
            events.append(
                {
                    "kind": "notify",
                    "ts_raw": notify_match.group("ts"),
                    "ts": parse_ts(notify_match.group("ts")),
                    "handle": int(notify_match.group("handle")),
                    "raw": line,
                }
            )

    return sorted(events, key=lambda item: item["ts"])


def group_windows(events: list[dict], max_gap_ms: int = 350) -> list[list[dict]]:
    if not events:
        return []

    windows = [[events[0]]]
    for event in events[1:]:
        prev = windows[-1][-1]
        delta_ms = (event["ts"] - prev["ts"]).total_seconds() * 1000
        if delta_ms <= max_gap_ms:
            windows[-1].append(event)
        else:
            windows.append([event])
    return windows


def describe_window(index: int, window: list[dict]) -> str:
    lines = [f"Window {index}"]
    sends = [item for item in window if item["kind"] == "send"]
    notifies = [item for item in window if item["kind"] == "notify"]

    if sends:
        send_lengths = [item["length"] for item in sends]
        lines.append(f"  sends: {send_lengths}")
    if notifies:
        notify_handles = [item["handle"] for item in notifies]
        lines.append(f"  notifies: {notify_handles}")

    for item in window:
        if item["kind"] == "send":
            lines.append(f"  {item['ts_raw']} send type={item['type']} len={item['length']}")
        else:
            lines.append(f"  {item['ts_raw']} notify handle={item['handle']}")

    return "\n".join(lines)


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--log", required=True, help="logcat text file")
    parser.add_argument("--max-gap-ms", type=int, default=350, help="grouping gap in milliseconds")
    args = parser.parse_args()

    events = load_events(Path(args.log))
    windows = group_windows(events, max_gap_ms=args.max_gap_ms)

    print(f"Total right-lens events: {len(events)}")
    print(f"Grouped windows: {len(windows)}")
    print()

    for index, window in enumerate(windows):
        print(describe_window(index, window))
        print()

    return 0


if __name__ == "__main__":
    raise SystemExit(main())
