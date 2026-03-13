# libapp.so Dashboard RE Findings

Date: 2026-03-13

## Scope

Static review of `lib/arm64-v8a/libapp.so` extracted from
`../split_config.arm64_v8a.apk`, focused on the Even G2 dashboard/render path.

## Artifact

- source APK: `../split_config.arm64_v8a.apk`
- extracted binary: `/tmp/even_libs/lib/arm64-v8a/libapp.so`
- SHA-256:
  `c9408262f81cc6abf68d56f826fdfe8d434a223e8870799b3e2de5d7f103e33c`

## Confirmed directly from libapp.so

### Dashboard protobuf and command family exist in Flutter AOT

The following strings are present in `libapp.so`:

- `DashboardDataPackage`
- `DashboardDataPackage.fromBuffer`
- `BleG2CmdProtoExt|_createDashboardDataPackage`
- `eDashboardCommandId`
- `AppRequest`
- `DashboardSendToApp`
- `DashboardReceiveFromApp`
- `DashboardRespondToApp`
- `AppRespondToDashboard`
- `DashboardContent`
- `DashboardDisplaySetting`
- `APP_REQUEST_CREATE_STARTUP_PAGE_PACKET`
- `APP_REQUEST_REBUILD_PAGE_PACKET`
- `APP_REQUEST_SHUTDOWN_PAGE_PACKET`
- `APP_UPDATE_IMAGE_RAW_DATA_PACKET`
- `OS_RESPONSE_CREATE_STARTUP_PAGE_PACKET`
- `OS_RESPONSE_REBUILD_PAGE_PACKET`
- `OS_RESPONSE_IMAGE_RAW_DATA_PACKET`

This confirms that the dashboard packet builder and the command names live in
Flutter `libapp.so`, not in the decrypted Android DEX bridge.

### Dashboard protobuf wrapper structure is richer than a single image blob

The following generated-type names are present in `dashboard.pb.dart` strings:

- `AppRequest`
- `DashboardSendToApp`
- `DashboardReceiveFromApp`
- `DashboardRespondToApp`
- `AppRespondToDashboard`
- `DashboardContent`
- `DashboardDisplaySetting`

This strongly suggests that the dashboard module uses a layered protobuf model
with explicit request/response wrappers, not a flat image-only message.

### Dashboard content uses a oneof-style payload family

The following strings are present together:

- `oneof=singleData`
- `oneof=multData`
- `oneof=singleHighlight`
- `oneof=multHighlight`
- `set:singleData`
- `get:singleData`
- `set:multData`
- `get:multData`
- `set:multHighlight`
- `get:multHighlight`
- `get:singleHighlight`
- `pre-send multHighlight: items=`

Inference:

- `DashboardContent` almost certainly contains a `oneof` with at least these
  variants:
  - `singleData`
  - `multData`
  - `singleHighlight`
  - `multHighlight`
- the dashboard protocol is therefore capable of carrying structured semantic
  content in addition to image/update traffic

This does not prove that the display-render path avoids image payloads.
`APP_UPDATE_IMAGE_RAW_DATA_PACKET`, `ProtoImage`, `bmpEncode`, and
`compressBmpData` are still present. It does show that the dashboard protobuf
surface is richer than a single image field guess.

### Dashboard display settings expose concrete layout fields

The following strings are present together with `DashboardDisplaySetting`:

- `gridDistance`
- `gridHeight`
- `DisplaySettingsExt|setGridDistance`
- `DisplaySettingsExt|setGridHeight`
- `get:gridDistance`
- `, gridDistance: `
- `, gridHeight: `
- `gridDistance:`
- `gridHeight:`
- `ProtoBaseSettings|setGlassGridDistance`
- `ProtoBaseSettings|setGlassGridHeight`

Inference:

- `DashboardDisplaySetting` is not a placeholder type
- it likely carries layout or rendering geometry used by the dashboard page
- this reinforces that the page/container path includes non-trivial metadata
  beyond the image blob itself
- the Flutter sender likely has dedicated protobuf helpers to push these values
  toward the glasses-side layout system

### Deeper image-update helper exists

The following additional image/update markers are present:

- `ProtoUpdateWithImageCallArguments`
- `ProtoUpdateWithImageCallArguments._@3084438062`
- `BmpInfo`
- `IcoBmpInfo`
- `_stepBmpEncode`

Inference:

- the dashboard image path likely does not jump straight from raw BMP bytes into
  `DashboardDataPackage`
- there is probably an intermediate argument/helper object for image update
- `ProtoImage` may be only one layer of the final nested image-update payload

This makes the current sender shape useful as an informed probe, but still
likely shallower than the real app path.

### Additional dashboard state/config names exist

The following names also appear in the same dashboard family:

- `DashboardCombineMode`
- `DashboardMainWidgetMode`
- `DashboardReceiveFLAG`
- `DashboardGeneralSetting`
- `maxDashboardHeight`

Inference:

- the dashboard subsystem likely has extra configuration/state dimensions that
  can influence how page/content data is assembled
- this is more evidence against a minimal stateless render update

### Real page/container model exists

The following page/container types are present:

- `CreateStartUpPageContainer`
- `RebuildPageContainer`

This is strong evidence that the real `cmdId=7` flow is built around explicit
page/container objects and not around a trivial placeholder protobuf.

### Image pipeline markers exist together in the same binary

The following image/render strings are present:

- `assembleDisplayView`
- `assembleGlassesImage`
- `assembleGlassesLive`
- `writeFrame`
- `writeFrames`
- `_writeFrameControlChunk`
- `bmpEncode`
- `compressBmpData`
- `BmpFileHeader`
- `BmpImageSizeData`
- `BmpCompression`
- `ProtoImage`

This confirms the pipeline already inferred from the reports:

1. assemble display/widget view
2. convert to glasses image
3. BMP encode
4. compress BMP payload
5. wrap into dashboard package
6. send through BLE transport

### Dashboard feature senders are named in Flutter

Dashboard-specific send methods present in `libapp.so`:

- `ProtoDashboardExt|sendDashboardBaseSettingInfoToGlass`
- `ProtoDashboardExt|sendNeedSendNewsCount`
- `ProtoDashboardExt|sendWeatherInfoToGlass`
- `sendCalendarContentToGlass`
- `sendStockContentToGlass`
- `sendNewsContentToGlass`
- `sendBaseSettingInfoToGlass`

This suggests the dashboard service is composed of multiple feature-specific
builders layered on top of the shared `DashboardDataPackage`.

### Transport confirms one logical package before fragmentation

Transport strings present in `libapp.so`:

- `BleG2CmdProtoExt|sendDataPackage`
- `BleG2CmdTransportPrivateExt|_splitDataIntoPackets`
- `BleG2CmdTransportPrivateExt|_sendPacketInternal`
- `BleG2CmdTransportPrivateExt|_waitForPacketResponse`
- `BleG2CmdPsTypeCommonExt|_handlePacketResponse`
- `markPacketConfirmed`
- `continueChunkNumber`
- `send via sendDataPackage: cmd=`
- `cmdId mismatch: commandId=`

This supports the current model:

- one logical dashboard command is built first
- then transport fragmentation happens afterward for MTU
- the renderer path is not hundreds of independent app-level dashboard protobufs

### The OS response path keeps page state

The following response-handling strings are present:

- `handleHeartBeatFromOS pageId=`
- `_handlePageAndLineInfoFromOS`
- `_handlePageAndLineInfoFromOS after pageId=`
- `lineId`
- `, dataLen=`

This is useful because it confirms the app tracks a real `pageId` returned by
the glasses OS. That makes a guessed stateless `cmdId=8` image blob even less
likely to work.

## Practical implications

### What is now stronger than before

- `cmdId=7` almost certainly needs a real page/container payload.
- `cmdId=8` almost certainly belongs to the image update path named by
  `APP_UPDATE_IMAGE_RAW_DATA_PACKET`.
- The dashboard sender is a Flutter-side builder problem, not a Java bridge
  problem.
- The render path has explicit page state (`pageId`) and response handling.
- The dashboard protobuf family includes explicit request/response wrapper
  types and a content `oneof`, so it is more structured than a naive
  `DashboardDataPackage { bytes image }` model.
- `DashboardDisplaySetting` likely contributes layout metadata such as
  `gridDistance` and `gridHeight`.
- the true image-update path may include an additional helper layer such as
  `ProtoUpdateWithImageCallArguments` before the final command is serialized.
- The transport split happens after package creation.

### What is still missing

- numeric enum mapping for `eDashboardCommandId`
- field numbers inside `DashboardDataPackage`
- field numbers inside `DashboardContent`
- field numbers inside `DashboardDisplaySetting`
- the relationship between `ProtoUpdateWithImageCallArguments`, `ProtoImage`,
  and `APP_UPDATE_IMAGE_RAW_DATA_PACKET`
- field numbers inside `CreateStartUpPageContainer` / `RebuildPageContainer`
- exact `ProtoImage` and compressed BMP embedding layout
- the exact outbound bytes for a real render update

## Best next static targets

If runtime capture remains blocked, the most useful next static pivots are:

1. recover more structure around `eDashboardCommandId`
2. recover references around `CreateStartUpPageContainer`
3. recover references around `RebuildPageContainer`
4. recover `ProtoImage` field layout candidates
5. compare dashboard, teleprompter, and navigation image-send families for
   shared helpers

## Reproduction commands

```bash
mkdir -p /tmp/even_libs
unzip -o ../split_config.arm64_v8a.apk \
  'lib/arm64-v8a/libapp.so' \
  'lib/arm64-v8a/libeven.so' \
  -d /tmp/even_libs

sha256sum /tmp/even_libs/lib/arm64-v8a/libapp.so

strings -n 6 /tmp/even_libs/lib/arm64-v8a/libapp.so | rg \
  'DashboardDataPackage|CreateStartUpPageContainer|RebuildPageContainer|APP_UPDATE_IMAGE_RAW_DATA_PACKET|assembleGlassesImage|bmpEncode|compressBmpData|sendDataPackage|_splitDataIntoPackets'
```
