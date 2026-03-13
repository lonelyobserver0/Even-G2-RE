# DEX Bridge Findings

Scope: `/home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex`

## What The Decrypted DEX Already Gives Us

The decrypted DEX contains the Android BLE bridge used by the Flutter app:

- `FlutterEzwBlePlugin` receives Flutter `MethodChannel` calls and routes them to `BleMC`.
- `BleMC` defines the callable BLE methods: scan, connect, disconnect, send command, upgrade state, cache reset.
- `BleManager` owns connection state, config validation, MTU requests, queues, and dispatch to connected devices.
- `BleDevice` maps `psType -> (write characteristic, notify characteristic)` and performs the real GATT write.

Relevant files:

- `/home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/jadx_output/sources/com/fzfstudio/ezw_ble/FlutterEzwBlePlugin.java`
- `/home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/jadx_output/sources/com/fzfstudio/ezw_ble/ble/BleMC.java`
- `/home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/jadx_output/sources/com/fzfstudio/ezw_ble/ble/BleManager.java`
- `/home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/jadx_output/sources/com/fzfstudio/ezw_ble/ble/models/BleDevice.java`
- `/home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/jadx_output/sources/com/fzfstudio/ezw_ble/ble/models/BleConfig.java`
- `/home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/jadx_output/sources/com/fzfstudio/ezw_ble/ble/models/BlePrivateService.java`

## Confirmed Bridge Flow

1. Flutter calls the plugin method channel.
2. `FlutterEzwBlePlugin.onMethodCall()` maps the method string to a `BleMC` enum entry.
3. `BleMC.handle()` forwards the request to `BleManager`.
4. `BleManager.sendCmd()` / `sendCmdNoWait()` selects the connected `BleDevice`.
5. `BleDevice.writeCharacteristic(data, psType)` finds the write characteristic for that `psType`.
6. Android performs `BluetoothGatt.writeCharacteristic(...)`.

## Confirmed BLE Method Surface

`BleMC` includes:

- `START_SCAN`
- `STOP_SCAN`
- `CONNECT_DEVICE`
- `DEVICE_PRE_CONNECTED`
- `DEVICE_CONNECTED`
- `DISCONNECT_DEVICE`
- `SEND_CMD`
- `ENTER_UPGRADE_STATE`
- `QUITE_UPGRADE_STATE`
- `CLEAN_CONNECT_CACHE`
- `RESET_BLE`

This confirms the Java layer is a generic transport bridge, not the app-specific dashboard encoder.

## Confirmed Send Path Details

`BleManager.sendCmd()`:

- refuses to send if BLE state/config checks fail
- blocks most sends while the device is in upgrade mode, except `psType == 1`
- enqueues `BleCmd(uuid, psType, data, false)`
- writes immediately through `BleDevice` when the queue was empty

`BleManager.sendCmdNoWait()`:

- skips the queue
- directly calls `BleDevice.writeCharacteristic(data, psType)`
- logs `uuid`, `psType`, and `data.length`

`BleDevice.writeCharacteristic()`:

- looks up the matching `BleWriteAndRead` entry by `psType`
- uses `BluetoothGatt.writeCharacteristic(writeChars, data, 1)` on Android 33+
- therefore uses `WRITE_TYPE_NO_RESPONSE`

## Confirmed Config / Transport Constraints

`BleConfig` confirms:

- default `mtu = 247`
- default `connectTimeout = 15000 ms`
- default `upgradeSwapTime = 60000 ms`
- BLE config validity depends on non-empty `privateServices`

`BlePrivateService` confirms the transport abstraction:

- one service UUID
- one write characteristic UUID
- one read/notify characteristic UUID
- one integer `type`

So `psType` is not guessed metadata; it is the actual index used to select the BLE channel/characteristic pair.

## What The DEX Does NOT Give Us

The decrypted DEX does not contain the real dashboard image payload builder.

Why:

- `REPORT_APP_ANALYSIS.md` already states that the real app logic is in Flutter `libapp.so`.
- The Java/Kotlin bridge only receives already-built `byte[] data`.
- `DashboardDataPackage`, `APP_REQUEST_CREATE_STARTUP_PAGE_PACKET`, and `APP_UPDATE_IMAGE_RAW_DATA_PACKET` are app-layer concepts documented from Flutter/protobuf analysis, not built in these DEX classes.

## Practical Consequence

These DEX are sufficient for:

- confirming the Android BLE bridge architecture
- confirming `WRITE_TYPE_NO_RESPONSE`
- confirming `psType` routing is real
- identifying the cleanest Java hook points

These DEX are not sufficient for:

- reconstructing the real dashboard image protobuf
- identifying the exact field number carrying BMP/RLE bytes
- reconstructing the real create-page container payload

## Best Hook Points If Runtime Access Returns

If a working runtime target becomes available again, the highest-value hooks are:

1. `com.fzfstudio.ezw_ble.ble.BleManager.sendCmdNoWait`
2. `com.fzfstudio.ezw_ble.ble.BleManager.sendCmd`
3. `com.fzfstudio.ezw_ble.ble.models.BleDevice.writeCharacteristic`
4. `android.bluetooth.BluetoothGatt.writeCharacteristic`

Reason:

- hooks 1-3 expose `uuid`, `psType`, and `data.length`
- hook 4 exposes the final raw bytes written to GATT

## Updated Priority

Because the decrypted DEX already covers the Java bridge, `memdex3` is no longer urgent just to understand scan/connect/send behavior.

The remaining high-value unknown stays the same:

- outbound dashboard payload construction in Flutter `libapp.so`
- especially the real `cmdId=7` container payload and `cmdId=8` image blob mapping
