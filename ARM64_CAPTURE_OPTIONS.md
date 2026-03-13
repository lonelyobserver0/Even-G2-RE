# ARM64 Capture Options

Date: 2026-03-10

## Goal

Get the real outbound BLE bytes written by the official Even app during a
dashboard or teleprompter render update.

## Best option

### 1. Rooted `arm64` device + `frida-server`

Why:

- highest chance of capturing exact `BluetoothGatt.writeCharacteristic(...)`
  payloads
- no APK repack required
- avoids Jiagu tamper reactions caused by repacking

What to capture:

- `BleDevice.writeCharacteristic([B, int)`
- `BluetoothGatt.writeCharacteristic(...)`
- `BluetoothGattCallback.onCharacteristicChanged(...)`

Needed:

- rooted `arm64` device
- matching `frida-server`
- [frida_hook_even_ble.js](/home/loneobs/Code/Even/RE/even-g2-direct/backend/frida_hook_even_ble.js)

## Good fallback

### 2. Full HCI snoop on the real phone

Why:

- still captures real traffic from the official app
- less invasive than repacking

Needed:

- a device build that really writes full `btsnoop_hci.log`
- access to the raw snoop file, not just bugreport truncation

Success condition:

- complete ATT payloads, not just lengths/handles

## External path

### 3. BLE sniffer hardware

Examples:

- Nordic nRF Sniffer
- Ubertooth

Why:

- independent from Jiagu and app anti-tamper

Cost:

- setup complexity
- pairing/channel-following overhead

## Lower-yield support path

### 4. `x86/base.apk only/memdex3`

Why:

- good for recovering names and builders
- weaker for capturing exact live outbound bytes

Use:

- to support protobuf mapping work
- not as the only path to final render reproduction

## What to trigger during capture

Highest value features:

- dashboard
- teleprompter

Those are the two features already correlated with real right-lens render bursts
like `244,244,X`.

## What to record for each capture

- timestamp
- feature triggered
- characteristic UUID
- psType if available
- full outbound hex
- full inbound notify hex in the same window

## Stop doing

- blind sender experiments with guessed protobuf field numbers
- more `cmdId=7/8/9` permutations without official outbound bytes
- more `arm64` repack attempts unless a new non-tamper pivot appears
