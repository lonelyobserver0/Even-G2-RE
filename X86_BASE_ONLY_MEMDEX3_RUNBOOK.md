# X86 Base-Only / memdex3 Runbook

Date: 2026-03-10

## Goal

Reproduce the previously successful Jiagu bypass path that worked on `x86`
without repacking the full `arm64` app, then extract the decrypted DEX or any
runtime clues useful for the BLE image pipeline.

This is not the final path to sending images to the glasses. It is a support
path to recover:

- class names
- enum values
- protobuf/container names
- possible dashboard/image packet builders

## Why this path still matters

`REPORT_UNPACKING.md` documents one working bypass path:

- install `base.apk` only
- run Jiagu natively on `x86`
- keep the process alive with a dummy `libflutter.so`
- dump decrypted DEX from memory with `memdex3`

That path avoids the current `arm64` repack + Jiagu `JNI_OnLoad` failure seen
on the real phone.

## What is already available locally

- [base.apk](/home/loneobs/Code/Even/RE/even-apks/base.apk)
- [base_only_signed.apk](/home/loneobs/Code/Even/RE/even-g2-direct/backend/repack/base_only_signed.apk)
- [base_only_unsigned.apk](/home/loneobs/Code/Even/RE/even-g2-direct/backend/repack/base_only_unsigned.apk)
- [REPORT_UNPACKING.md](/home/loneobs/Code/Even/RE/even-apks/base/REPORT_UNPACKING.md)
- [decrypted_dex](/home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex)

## What is not currently present in this workspace

These were described in the report but are not currently present under the repo:

- `memdex3` binary or source
- dummy `libflutter.so` for `x86`
- `dummy_flutter.c`
- a rooted `Genymotion Android 9 x86` target

## Immediate reality check

The `base_only` APK artifacts are available locally and are the correct starting
point for this path.

The two execution blockers are currently:

1. missing dummy Flutter library source/binary
2. missing `memdex3` source/binary

So this path is documented and partially staged, but not yet runnable from this
workspace alone.

## Target environment

The documented successful environment was:

- Genymotion Android 9 (API 28) `x86`
- ARM translation via `Genymotion-ARM-Translation_for_9.0.zip`
- root available
- Frida server for `x86`

## Reproduction steps

1. Boot a rooted `x86` Android 9 target.
2. Install only [base.apk](/home/loneobs/Code/Even/RE/even-apks/base.apk) or [base_only_signed.apk](/home/loneobs/Code/Even/RE/even-g2-direct/backend/repack/base_only_signed.apk).
3. Confirm that Jiagu loads `libjiagu_x86.so` from `assets/`, not `arm64`.
4. Provide a dummy `libflutter.so` in the expected `x86` app lib path so the
   process stays alive after Flutter startup fails.
5. Launch the app and capture the target PID.
6. Run `memdex3 <PID>` as root.
7. Dump any DEX with version `039` and ignore duplicated Jiagu stub DEX blobs.
8. Decompile dumped DEX with jadx and focus only on:
   - `com.fzfstudio.ezw_ble`
   - dashboard package builders
   - packet/container builders around dashboard/image update

## Success criteria

Any of the following counts as progress:

- recover a method building `DashboardDataPackage`
- recover enum values for dashboard image packet types
- recover a protobuf field mapping for image bytes or page container
- recover a class/method pair that obviously maps to `cmdId=7` or `cmdId=8`

## Risks

- this path is useful for class and naming recovery, but may still not reveal
  the final outbound BLE bytes directly
- Flutter/Dart logic still lives in `libapp.so`, so DEX recovery is supporting
  evidence, not the entire answer

## Recommended use

Use this path when:

- `arm64` repack paths are blocked by Jiagu
- you need more semantic names before the next BLE capture
- you want to reduce protobuf guesswork before testing the sender again

## Next concrete need

To reactivate this path, the next artifact to recover or recreate is:

- `memdex3.c` or the `memdex3` binary

Without that, this path remains a documented fallback rather than an executable
one.
