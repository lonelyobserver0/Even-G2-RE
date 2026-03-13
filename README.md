# Even G2 BLE Reverse Engineering

This repository collects notes, logs, scripts, and experiments related to the
BLE protocol used by the Even G2 glasses.

The main goal is narrow and practical:

- recover the real dashboard/render send path used by the official app
- understand the real payloads behind `serviceId=8`
- reconstruct the true meaning of `cmdId=7` and `cmdId=8`

## Why this matters

BLE connectivity is not the hard part anymore. The hard part is reproducing the
same logical payloads that the official app sends during a real display update.

At this point, the main unknown is not transport, but application-layer
structure.

## What is already confirmed

- The real transport format is `AA 12`.
- The legacy auth path `AA 21` is known.
- The decrypted Android BLE bridge confirms:
  - `WRITE_TYPE_NO_RESPONSE`
  - `psType` is a real channel selector
  - default MTU is `247`
- The official app talks to both lenses.
- Real display updates have been observed on the right lens as repeated bursts
  shaped like `244,244,X`.

## What is still unknown

- the exact `cmdId=7` create-page payload
- the exact `cmdId=8` image-update payload
- the protobuf field mapping used by the Flutter app
- the exact relationship between page/container metadata and image data

## Current best model

Based on the available logs, DEX analysis, and static reverse engineering of
`libapp.so`:

- `cmdId=7` is almost certainly a real page/container creation message
- `cmdId=8` is almost certainly a real image-update message
- transport fragmentation happens after the logical protobuf is built
- the image path likely includes metadata, not just raw BMP bytes

## Main findings from `libapp.so`

Static analysis of the Flutter AOT binary currently confirms the existence of:

- `DashboardDataPackage`
- `AppRequest`
- `DashboardSendToApp`
- `DashboardReceiveFromApp`
- `DashboardRespondToApp`
- `AppRespondToDashboard`
- `DashboardContent`
- `DashboardDisplaySetting`
- `CreateStartUpPageContainer`
- `RebuildPageContainer`
- `ProtoImage`
- `ProtoUpdateWithImageCallArguments`

Additional useful structure:

- `DashboardContent` appears to use a `oneof` with:
  - `singleData`
  - `multData`
  - `singleHighlight`
  - `multHighlight`
- `DashboardDisplaySetting` exposes:
  - `gridDistance`
  - `gridHeight`

This is strong evidence that the real app is building structured request and
content wrappers, not just sending a naked image blob.

## Recommended reading order

Start here:

1. [CURRENT_RE_FINDINGS.md](CURRENT_RE_FINDINGS.md)
2. [REPORT_BLE_PROTOCOL.md](REPORT_BLE_PROTOCOL.md)
3. [REPORT_APP_ANALYSIS.md](REPORT_APP_ANALYSIS.md)
4. [REPORT_UNPACKING.md](REPORT_UNPACKING.md)

Then read the newer `libapp.so`-focused notes:

- [LIBAPP_DASHBOARD_RE_FINDINGS.md](LIBAPP_DASHBOARD_RE_FINDINGS.md)
- [DASHBOARD_PROTO_MAP.md](DASHBOARD_PROTO_MAP.md)

## Important files

### Reports

- [HANDOFF_INDEX.md](HANDOFF_INDEX.md)
- [DASHBOARD_OUTBOUND_MODEL.md](DASHBOARD_OUTBOUND_MODEL.md)
- [DASHBOARD_PAYLOAD_CONSTRAINTS.md](DASHBOARD_PAYLOAD_CONSTRAINTS.md)
- [DEX_BRIDGE_FINDINGS.md](DEX_BRIDGE_FINDINGS.md)

### Logs and captures

- [dashboard-logcat.txt](dashboard-logcat.txt)
- [teleprompter-logcat.txt](teleprompter-logcat.txt)
- [navigation-logcat.txt](navigation-logcat.txt)
- [even-current-logcat.txt](even-current-logcat.txt)
- [even-current-bt.log](even-current-bt.log)
- [Captured.pcapng](Captured.pcapng)
- [Captured2.pcapng](Captured2.pcapng)

Note:

- The available nRF captures do not currently contain the ATT payloads needed
  to reconstruct the real app traffic. They mostly show advertising and
  connection attempts, not a correctly followed GATT session.

### Analysis scripts

- [even_protocol.py](even_protocol.py)
- [decode_even_packets.py](decode_even_packets.py)
- [parse_log.py](parse_log.py)
- [analyze_even_logcat.py](analyze_even_logcat.py)
- [compare_even_bursts.py](compare_even_bursts.py)
- [timeline_even_render.py](timeline_even_render.py)

### Experimental sender / probes

- [send_image_real.py](send_image_real.py)
- [server.py](server.py)
- [probe_render_path.py](probe_render_path.py)

### Android hook / capture material

- [frida_hook_even_ble.js](frida_hook_even_ble.js)
- [FRIDA_CAPTURE_RUNBOOK.md](FRIDA_CAPTURE_RUNBOOK.md)
- [ARM64_CAPTURE_OPTIONS.md](ARM64_CAPTURE_OPTIONS.md)
- [X86_BASE_ONLY_MEMDEX3_RUNBOOK.md](X86_BASE_ONLY_MEMDEX3_RUNBOOK.md)

## Experimental sender

`send_image_real.py` is not a faithful implementation of the official app. It
is an informed probe.

It currently supports:

- `naive` mode
- `proto-map` mode
- `--dry-run` to build and inspect packets without BLE
- automatic scanning of Even G2 candidates
- `--all-lenses` to try the test against all discovered lenses

Example dry-run:

```bash
source .venv/bin/activate

python send_image_real.py \
  --dry-run \
  --mode proto-map \
  --width 8 \
  --height 8 \
  test.png
```

Example live test against all discovered lenses:

```bash
source .venv/bin/activate

python send_image_real.py \
  --mode proto-map \
  --all-lenses \
  --scan-timeout 10 \
  --dashboard-wrapper-field 3 \
  --app-request-field 1 \
  --command-data-field 1 \
  --image-field-number 3 \
  --compression-mode 1 \
  --width 8 \
  --height 8 \
  test.png
```

## Current blockers

The following paths have been tried and are currently blocked or incomplete:

- passive nRF capture that fails to follow the useful BLE connection
- HCI snoop that does not expose the payloads we need
- no rooted `arm64` Android target currently available for Frida capture
- emulator / Genymotion paths that do not provide a reliable route to real
  runtime bytes

## What would be most valuable next

The single most valuable next artifact would be:

- the real outbound bytes written by the official app during a visible display
  update such as dashboard or teleprompter

The next most useful things would be:

- a rooted `arm64` capture target
- a full BLE capture that actually contains ATT writes and notifications
- deeper recovery of the `libapp.so` dashboard/image wrapper structure

## How to contribute

Useful contributions include:

- better BLE captures with real ATT payloads
- rooted-device Frida traces of write/notify traffic
- deeper static RE of `libapp.so`
- better guesses or recovery of dashboard protobuf structure
- reproducing or validating findings on different firmware versions

If you contribute, please keep these distinctions clear:

- confirmed facts
- high-confidence inference
- open hypothesis

That separation matters a lot in this project.

## Project metadata

- [DISCLAIMER.md](DISCLAIMER.md)
- [ROADMAP.md](ROADMAP.md)
- [LICENSE](LICENSE)

## Current caution

Do not over-interpret the current sender as "the protocol". It is still a probe
built from partial structure recovery, not from ground-truth runtime payloads.

The current direction is useful because it is less blind than earlier BMP-field
guesses, but the real app path is still likely deeper than the sender model.

## Python environment

This workspace uses the local virtual environment:

```bash
source .venv/bin/activate
```
