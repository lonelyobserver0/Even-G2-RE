# Current Even G2 Findings

Date: 2026-03-10

## Sources used

- `even-current-logcat.txt`
- `even-current-bt.log`
- `bugreport.zip`
- `even-apks/base` reports and jadx output

## Decrypted DEX status

The decrypted DEX in `even-apks/base/decrypted_dex` is enough to confirm the full Android BLE bridge:

- `FlutterEzwBlePlugin` receives Flutter method calls.
- `BleMC` maps method names to BLE operations.
- `BleManager` performs config checks, routing, queueing, and MTU requests.
- `BleDevice` performs the final GATT write selected by `psType`.

What this gives us:

- confirmed Java-side send path
- confirmed `WRITE_TYPE_NO_RESPONSE`
- confirmed `psType` is a real channel selector
- confirmed default `MTU=247`

What it does not give us:

- the real dashboard image protobuf builder
- the exact `cmdId=7` create-page payload
- the exact `cmdId=8` image blob field mapping

That logic still lives in Flutter `libapp.so`.

See:

- `DEX_BRIDGE_FINDINGS.md`
- `summarize_dex_bridge.py`
- `DASHBOARD_OUTBOUND_MODEL.md`

## Confirmed from app bridge

From `com.fzfstudio.ezw_ble`:

- `BleDevice.writeCharacteristic()` uses `WRITE_TYPE_NO_RESPONSE`.
- App logs only `device address`, `psType`, and `data length`.
- `BleManager` routes traffic by `psType` to the write/read characteristic pair discovered for that device.

Relevant references:

- `even-apks/base/decrypted_dex/jadx_output/sources/com/fzfstudio/ezw_ble/ble/models/BleDevice.java`
- `even-apks/base/decrypted_dex/jadx_output/sources/com/fzfstudio/ezw_ble/ble/BleManager.java`

## Inferred handle mapping from live logs

### Main Even channel on right lens

- write handle: `0x0842`
- notify handle: `2116` = `0x0844`
- app-side `psType`: `0`

This matches the known main channel behavior and is consistent with:

- app log `data length=N`
- stack log `L2CA_SendFixedChnlData len=N+3`

### Secondary channel seen only in heavier right-lens traffic

- write handle: `0x0882`
- notify handle: `2180` = `0x0884`
- app-side `psType`: `3`

This is a real second path used by the official app on the right lens. It is not noise.

The exact UUID for `psType=3` is still not confirmed from live discovery logs.

## Burst patterns observed

### Rendering-like burst previously captured

Right lens, `psType=0`:

- `244`
- `244`
- `62`

Observed in system log around `03-10 09:39:52.xxx`, with stack ATT lengths:

- `247`
- `247`
- `65`

Right lens, `psType=3`:

- `103`
- `11`
- `244`
- `79`

Observed around `03-10 09:39:57.xxx` to `03-10 09:39:59.xxx`, with:

- notify handle `2180`
- write handle `0x0882`

### Lightweight steady-state traffic captured later

Right lens, `psType=0`:

- `17`
- `156`
- `17`
- `17`

Left lens, `psType=0`:

- `17`
- `17`
- `17`

This suggests:

- `17`-byte packets are likely heartbeat / status / polling
- the heavier rendering burst only happens during a UI/display update in the official app

## Practical interpretation

- The official app definitely writes to both left and right lenses.
- The right lens uses at least two transport routes in practice:
  - `psType=0` on handle pair `0x0842/0x0844`
  - `psType=3` on handle pair `0x0882/0x0884`
- The main unresolved question is no longer "does the app use another channel?".
  It does.
- The next capture must be triggered during a visible display update so that the `244/244/62` and `103/11/244/79` bursts can be correlated with a specific feature screen.

## Files / tools added in backend

- `analyze_even_logcat.py`
- `decode_even_packets.py`
- `compare_even_bursts.py`
- `timeline_even_render.py`

Useful command:

```bash
python analyze_even_logcat.py \
  --log even-current-logcat.txt \
  --bt-log even-current-bt.log
```

## Feature comparison from real captures

### Dashboard

- prefix before render burst: `17, 17, 17, 17`
- render triplets:
  - `244, 244, 71`
  - `244, 244, 71`
  - `244, 244, 67`

### Teleprompter

- prefix before render burst: `22, 22, 22, 17, 19, 17, 17`
- render triplets:
  - `244, 244, 75`
  - `244, 244, 75`
  - `244, 244, 71`

### Interpretation

- Both features render on the right lens over `psType=0`.
- Both use the same high-level burst structure: repeated `244, 244, X`.
- The feature-specific difference is visible in:
  - the pre-burst control packets
  - the third chunk size of each triplet

This is the strongest current evidence that the app is sending the same general
image/update container with small feature-dependent metadata or payload-size changes.

## Dashboard outbound model

The current best local model is:

- `cmdId=7` is a real page/container creation message and likely needs non-trivial metadata.
- `cmdId=8` is one logical image-update message that gets fragmented at the transport layer for MTU.
- The image update likely includes metadata plus image bytes, not just a single naked BMP field.
- The old preference for `field 6` has been downgraded because that hint came from an inbound ACK-like packet, not the outbound render payload.

Useful command:

```bash
python compare_even_bursts.py \
  dashboard=dashboard-logcat.txt \
  teleprompter=teleprompter-logcat.txt
```

## Render cycle timing

Using `timeline_even_render.py`, the right-lens render cycle appears as a tight
time window with:

- three repeated send triplets `244,244,X`
- one notify `2116` after each triplet

### Dashboard timing

The render cycle is a single clean block:

- sends: `244,244,71,244,244,71,244,244,67`
- notifies: `2116,2116,2116`

### Teleprompter timing

The render cycle is almost identical, but starts with a notify immediately
before the first `244`:

- notify: `2116`
- sends: `244,244,75,244,244,75,244,244,71`
- notifies interleaved after each triplet

### Interpretation

- The repeated `244,244,X + notify` pattern is the strongest candidate for the
  actual display update loop.
- The per-feature differences are small and localized.
- This makes the next practical reverse-engineering step a comparison of the
  payload bytes for these triplets, rather than guessing new command sequences.

Useful command:

```bash
python timeline_even_render.py --log dashboard-logcat.txt
python timeline_even_render.py --log teleprompter-logcat.txt
```

## Handoff note

For the consolidated handoff package in `even-apks/base`, start from:

- `HANDOFF_INDEX.md`

That index points to the current status report, the older protocol/app reports,
the most useful live captures, and the local analysis scripts.

## Mini changelog

- Added controlled live captures for `dashboard`, `navigation`, and `teleprompter`.
- Confirmed repeatable right-lens render bursts shaped as `244,244,X`.
- Confirmed practical right-lens channel mapping:
  - `psType=0` -> `0x0842/0x0844`
  - `psType=3` -> `0x0882/0x0884`
- Added local tools for burst comparison and render-cycle timeline analysis.
- Consolidated reports, captures, and scripts into `even-apks/base`.

## Official emulator findings

Tested on the official Android Emulator AVD `even_test`:

- Android 14 / API 34
- system image: `google_apis/x86_64`
- `ro.product.cpu.abilist = x86_64,arm64-v8a`
- `ro.dalvik.vm.native.bridge = libndk_translation.so`

The Even app installs successfully with:

- `base.apk`
- `split_config.arm64_v8a.apk`
- `split_config.xxxhdpi.apk`
- `split_config.it.apk`

However, app startup crashes before useful instrumentation can begin:

```text
java.lang.UnsatisfiedLinkError:
dlopen failed: "/data/data/com.even.sg/.jiagu/libjiagu_64.so"
is for EM_X86_64 (62) instead of EM_AARCH64 (183)
```

Interpretation:

- the official emulator is much better than the previous `vbox86p` target
- ARM translation is present and working at the guest level
- but the Jiagu bootstrap layer introduces an architecture mismatch during
  application startup
- so this emulator cannot currently be used to run the official app end-to-end
  without repackaging or a different target architecture

## Repack experiment on official emulator

A local repack experiment was attempted against `base.apk`:

- decoded `base.apk` with apktool
- patched `com.stub.StubApp` to stop treating the emulator as `x86`
- rebuilt and re-signed `base.apk`
- reinstalled the patched base together with the original splits using
  non-incremental `install-multiple`

Observed progression:

1. Original install on the official emulator failed in `attachBaseContext()`
   with:
   `libjiagu_64.so is for EM_X86_64 instead of EM_AARCH64`
2. After the stub patch, `MainActivity` launches successfully
3. The app now fails later inside Jiagu with either:
   - `JNI_ERR returned from JNI_OnLoad in "/data/data/com.even.sg/.jiagu/libjiagu_64.so"`
   - or a later `SIGSEGV` in the same loader path

Interpretation:

- the patch is meaningful and moves the failure point forward
- but Jiagu's native loader still rejects or crashes in the emulator before the
  real app logic becomes usable
- Frida can spawn the repacked app and install hooks, but the process still
  dies during the Jiagu bootstrap stage

## Payload image: what is narrowed down now

The current evidence strongly suggests we must not mix up two different app-side
models:

- `DashboardDataPackage` on `serviceId=8`
- `EvenHub.pb.dart` container APIs (`createStartUpPageContainer`,
  `rebuildPageContainer`, `updateImageRawData`, `image_data`, `container_id`)

Practical interpretation:

- The live glasses rendering we captured (`serviceId=8`, alternating `cmdId=7`
  and `cmdId=8`, repeated `244,244,X` bursts) points to the **dashboard/UI
  background channel**.
- The rich field names such as `image_data`, `container_id`,
  `container_total_num`, and `map_raw_data` belong to the **EvenHub** model and
  are useful as conceptual hints, but they are **not yet proof** that the same
  field names or field numbers appear in the `serviceId=8` dashboard packets.
- The inbound `cmdId=8` packet already documented in the reports is an ACK-like
  packet with an empty field, not the outbound image payload.

Immediate consequence:

- keep targeting `serviceId=8`, `cmdId=7/8` for the real glasses sender
- do not assume that the `EvenHub` `image_data` field mapping applies directly
  to `DashboardDataPackage`
- the remaining missing piece is still the **outbound** protobuf field mapping
  for the image bytes in the dashboard render cycle
