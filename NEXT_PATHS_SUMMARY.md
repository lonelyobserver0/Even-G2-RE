# Next Paths Summary

## Current blocker

The Python BLE sender can authenticate and talk to the glasses, but cannot
render images because the real outbound dashboard image payload is still
unknown.

## Highest-priority path

- [ARM64_CAPTURE_OPTIONS.md](/home/loneobs/Code/Even/RE/even-g2-direct/backend/ARM64_CAPTURE_OPTIONS.md)

This is the best path to the real outbound bytes. The preferred target is a
rooted `arm64` device with `frida-server`.

## Supporting reverse-engineering path

- [X86_BASE_ONLY_MEMDEX3_RUNBOOK.md](/home/loneobs/Code/Even/RE/even-g2-direct/backend/X86_BASE_ONLY_MEMDEX3_RUNBOOK.md)

This is the best documented bypass path for recovering more semantic app
structure when `arm64` runtime instrumentation is blocked.

## Existing technical baseline

- [CURRENT_RE_FINDINGS.md](/home/loneobs/Code/Even/RE/even-g2-direct/backend/CURRENT_RE_FINDINGS.md)
- [HANDOFF_INDEX.md](/home/loneobs/Code/Even/RE/even-g2-direct/backend/HANDOFF_INDEX.md)
- [REPORT_BLE_PROTOCOL.md](/home/loneobs/Code/Even/RE/even-apks/base/REPORT_BLE_PROTOCOL.md)
- [REPORT_UNPACKING.md](/home/loneobs/Code/Even/RE/even-apks/base/REPORT_UNPACKING.md)

## Practical rule

Do not spend more time on guessed dashboard sender variants until one of these
happens:

- real outbound bytes are captured from the official app
- `DashboardDataPackage` / `APP_UPDATE_IMAGE_RAW_DATA_PACKET` is mapped more
  concretely from runtime or dumped artifacts
