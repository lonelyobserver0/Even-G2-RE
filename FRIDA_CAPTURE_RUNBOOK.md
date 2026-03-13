# Frida Capture Runbook

Date: 2026-03-10

## Goal

Capture the real payload bytes written by the official Even Android app during a
display update.

## Current device state

- Phone connected over ADB.
- Package: `com.even.sg`
- App process visible via `adb shell ps -A`.
- `run-as com.even.sg` fails because the app is not debuggable.
- `frida-ps -Uai` currently returns no visible app/process list.

## Honest constraint

On the current non-root device, the easiest capture path is blocked unless one
of these becomes available:

- root + `frida-server`
- repacked APK with Frida Gadget
- another runtime instrumentation path that can attach to a non-debuggable app

## Hook prepared

Use:

- `frida_hook_even_ble.js`

It hooks:

- `com.fzfstudio.ezw_ble.ble.models.BleDevice.writeCharacteristic([B, int)`
- `android.bluetooth.BluetoothGatt.writeCharacteristic(BluetoothGattCharacteristic, byte[], int)`
- `BluetoothGattCallback.onCharacteristicChanged(...)`

The hook logs:

- device UUID/name when available
- `psType`
- characteristic UUID and instance id
- `writeType`
- full payload bytes in hex

## Expected high-value target

Trigger one of these features while the hook is running:

- dashboard
- teleprompter

Those are the two features already confirmed to produce repeatable right-lens
render bursts shaped like `244,244,X`.

## Example commands

If Frida becomes available on the device:

```bash
frida -U -f com.even.sg -l frida_hook_even_ble.js
```

If the app is already running and attach is possible:

```bash
frida -U -n com.even.sg -l frida_hook_even_ble.js
```

## What to look for

For each visible display update, extract:

- exact characteristic UUID
- exact payload bytes for the `244,244,X` burst
- whether `psType=3` is used by the official app in the same render window
- whether the image bytes start with `BM` or a custom metadata wrapper
- whether there is a final commit packet after the image chunks

## Next step after capture

Feed the captured hex payloads into the local decoder stack:

- `even_protocol.py`
- `decode_even_packets.py`
- `parse_log.py`

Then compare dashboard vs teleprompter payload structure and rebuild the Python
sender from real packets instead of guessed protobuf fields.
