"""Rank candidate protobuf field numbers for Dashboard cmdId=8 image payloads."""

from __future__ import annotations

from dataclasses import dataclass


@dataclass(frozen=True)
class Candidate:
    field_number: int
    score: int
    rationale: str


CANDIDATES: list[Candidate] = [
    Candidate(
        field_number=3,
        score=90,
        rationale=(
            "Best current guess. It is still the most natural early length-delimited "
            "field for the primary image blob in a compact protobuf layout."
        ),
    ),
    Candidate(
        field_number=4,
        score=55,
        rationale=(
            "Plausible fallback if field 3 is reserved for nested metadata and the "
            "image blob is the next early length-delimited field."
        ),
    ),
    Candidate(
        field_number=5,
        score=40,
        rationale=(
            "Still plausible as a mid-layout blob field, but weaker than 3/4 without "
            "a real outbound capture."
        ),
    ),
    Candidate(
        field_number=6,
        score=25,
        rationale=(
            "Downgraded. The only concrete sighting is an empty field 6 in an inbound "
            "ACK-like cmdId=8 packet, which is weak evidence for the outbound image blob."
        ),
    ),
    Candidate(
        field_number=7,
        score=20,
        rationale=(
            "Possible only as a late-layout field. No direct evidence from reports "
            "other than prior brute-force attempts."
        ),
    ),
    Candidate(
        field_number=8,
        score=15,
        rationale=(
            "Weak candidate. More likely to be confused with cmdId value 8 than to be "
            "the real image blob field."
        ),
    ),
]


def top_candidates() -> list[Candidate]:
    return list(CANDIDATES)


def format_candidates() -> str:
    lines = [
        "Dashboard cmdId=8 image field candidates",
        "",
    ]
    for item in CANDIDATES:
        lines.append(
            f"field {item.field_number}: score={item.score} - {item.rationale}"
        )
    return "\n".join(lines)


if __name__ == "__main__":
    print(format_candidates())
