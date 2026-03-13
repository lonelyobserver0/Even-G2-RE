"""
Compare right-lens BLE send bursts across multiple feature logcat captures.

It extracts `BleDevice: Send cmd ... type=... data length=...` entries for the
right lens and highlights:
- pre-burst packets
- 244/244/X rendering triplets
- repeated triplet patterns per capture

Example:
    python compare_even_bursts.py \
      dashboard=dashboard-logcat.txt \
      teleprompter=teleprompter-logcat.txt
"""

from __future__ import annotations

import argparse
import re
from pathlib import Path


SEND_RE = re.compile(
    r"(?P<ts>\d{2}-\d{2} \d{2}:\d{2}:\d{2}\.\d+).*?"
    r"BleDevice: Send cmd: (?P<addr>[0-9A-F:]+) .*? type=(?P<type>\d+), data length=(?P<len>\d+)"
)

RIGHT_ADDR = "E8:9D:EF:A4:DE:80"


def parse_entries(path: Path) -> list[dict]:
    entries = []
    for line in path.read_text(errors="ignore").splitlines():
        match = SEND_RE.search(line)
        if not match:
            continue
        if match.group("addr") != RIGHT_ADDR:
            continue
        entries.append(
            {
                "ts": match.group("ts"),
                "type": int(match.group("type")),
                "length": int(match.group("len")),
                "raw": line,
            }
        )
    return entries


def split_bursts(entries: list[dict]) -> tuple[list[int], list[list[int]], list[int]]:
    lengths = [entry["length"] for entry in entries if entry["type"] == 0]
    first_burst_idx = next((i for i, value in enumerate(lengths) if value == 244), None)
    if first_burst_idx is None:
        return lengths, [], lengths

    prefix = lengths[:first_burst_idx]
    tail = lengths[first_burst_idx:]

    triplets = []
    i = 0
    while i + 2 < len(tail):
        if tail[i] == 244 and tail[i + 1] == 244:
            triplets.append(tail[i:i + 3])
            i += 3
            continue
        i += 1

    return lengths, triplets, prefix


def summarize_feature(name: str, path: Path) -> str:
    entries = parse_entries(path)
    lengths, triplets, prefix = split_bursts(entries)

    lines = [f"{name}: {path}"]
    lines.append(f"  right psType=0 lengths: {lengths}")
    lines.append(f"  prefix before first 244 burst: {prefix if prefix else '[]'}")
    lines.append(f"  rendering triplets: {triplets if triplets else '[]'}")

    unique_suffix = sorted({triplet[2] for triplet in triplets}) if triplets else []
    if unique_suffix:
        lines.append(f"  unique third-chunk lengths: {unique_suffix}")

    return "\n".join(lines)


def compare_features(named_paths: list[tuple[str, Path]]) -> str:
    lines = []
    summaries = []

    feature_data = {}
    for name, path in named_paths:
        entries = parse_entries(path)
        lengths, triplets, prefix = split_bursts(entries)
        feature_data[name] = {
            "entries": entries,
            "lengths": lengths,
            "triplets": triplets,
            "prefix": prefix,
        }
        summaries.append(summarize_feature(name, path))

    lines.extend(summaries)

    if len(named_paths) >= 2:
        lines.append("")
        lines.append("Comparison")
        lines.append("----------")

        names = [name for name, _ in named_paths]
        baseline = feature_data[names[0]]
        for other_name in names[1:]:
            other = feature_data[other_name]
            lines.append(f"{names[0]} vs {other_name}:")
            lines.append(f"  prefix: {baseline['prefix']} vs {other['prefix']}")
            lines.append(f"  triplets: {baseline['triplets']} vs {other['triplets']}")

    return "\n".join(lines)


def parse_named_path(value: str) -> tuple[str, Path]:
    if "=" not in value:
        raise argparse.ArgumentTypeError("expected NAME=PATH")
    name, raw_path = value.split("=", 1)
    return name, Path(raw_path)


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("captures", nargs="+", type=parse_named_path, help="NAME=PATH")
    args = parser.parse_args()

    print(compare_features(args.captures))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
