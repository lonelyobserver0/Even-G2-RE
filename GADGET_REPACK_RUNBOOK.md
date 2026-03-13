# Frida Gadget Repack Runbook

Date: 2026-03-10

## Built artifacts

- `/home/loneobs/Code/Even/RE/even-g2-direct/backend/repack/gadget_signed/base_gadget_aligned.apk`
- `/home/loneobs/Code/Even/RE/even-g2-direct/backend/repack/gadget_signed/split_config.arm64_v8a.gadget.aligned.apk`
- `/home/loneobs/Code/Even/RE/even-g2-direct/backend/repack/gadget_signed/split_config.xxxhdpi.aligned.apk`
- `/home/loneobs/Code/Even/RE/even-g2-direct/backend/repack/gadget_signed/split_config.it.aligned.apk`

## What changed

- `com.stub.StubApp.attachBaseContext()` now calls `System.loadLibrary("frida-gadget")`
- the arm64 split now contains `lib/arm64-v8a/libfrida-gadget.so`

## Install on the real phone

Uninstall the Play-signed app first, because the repack is signed with the local
debug keystore:

```bash
adb uninstall com.even.sg
```

Then install the full split set:

```bash
adb install-multiple \
  /home/loneobs/Code/Even/RE/even-g2-direct/backend/repack/gadget_signed/base_gadget_aligned.apk \
  /home/loneobs/Code/Even/RE/even-g2-direct/backend/repack/gadget_signed/split_config.arm64_v8a.gadget.aligned.apk \
  /home/loneobs/Code/Even/RE/even-g2-direct/backend/repack/gadget_signed/split_config.xxxhdpi.aligned.apk \
  /home/loneobs/Code/Even/RE/even-g2-direct/backend/repack/gadget_signed/split_config.it.aligned.apk
```

## Capture

Start the app normally on the phone, then connect to Gadget from the PC:

```bash
frida -H 127.0.0.1:27042 -f com.even.sg -l /home/loneobs/Code/Even/RE/even-g2-direct/backend/frida_hook_even_ble.js
```

If spawn is unstable, try attach after launching the app manually:

```bash
frida -H 127.0.0.1:27042 -n com.even.sg -l /home/loneobs/Code/Even/RE/even-g2-direct/backend/frida_hook_even_ble.js
```

## Goal

Trigger `dashboard` or `teleprompter` and capture the real outbound BLE payloads
written to the glasses.
