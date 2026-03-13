# Dashboard Outbound Model

This note narrows the likely shape of the real outbound dashboard render flow.

## Confirmed Facts

- Live display updates happen on `serviceId=8`.
- The live cycle alternates `cmdId=7` and `cmdId=8`.
- The app-side pipeline is:
  - `assembleGlassesImage()`
  - `bmpEncode()`
  - `compressBmpData()`
  - `_createDashboardDataPackage(...)`
  - `sendDataPackage(...)`
  - transport split for MTU
- The Java bridge only transports already-built `byte[]`.
- The documented inbound `serviceId=8, cmdId=8` packet is ACK-like, not proof of the real outbound image field layout.

Relevant references:

- `/home/loneobs/Code/Even/RE/even-apks/base/REPORT_BLE_PROTOCOL.md:435`
- `/home/loneobs/Code/Even/RE/even-apks/base/REPORT_BLE_PROTOCOL.md:466`
- `/home/loneobs/Code/Even/RE/even-apks/base/REPORT_BLE_PROTOCOL.md:526`
- `/home/loneobs/Code/Even/RE/even-apks/base/REPORT_BLE_PROTOCOL.md:607`
- `/home/loneobs/Code/Even/RE/even-apks/base/REPORT_APP_ANALYSIS.md:299`
- `/home/loneobs/Code/Even/RE/even-apks/base/REPORT_APP_ANALYSIS.md:958`

## Strong Inferences

### 1. The image is not sent as hundreds of independent app-level `cmdId=8` protobufs

The reports describe:

- one app-layer package created first
- then transport-level fragmentation for MTU

So the more likely structure is:

1. build one logical dashboard protobuf
2. wrap in `EvenBleTransport`
3. split transport bytes for MTU
4. write fragments

This is materially different from sending one protobuf per chunk.

### 2. `cmdId=7` likely carries real page/container metadata

The page system is explicitly documented as:

1. create page
2. wait for create response
3. send content
4. rebuild if needed

So an empty or toy `cmdId=7` is unlikely to be accepted by the real renderer.

### 3. `cmdId=8` likely carries image bytes plus metadata, not just a naked BMP field

Because the pipeline names include:

- image size data
- compression step
- package factory

the image update likely contains some combination of:

- container/page ID
- width/height or `BmpImageSizeData`
- compression selector or flags
- image byte blob

### 4. EvenHub is only a conceptual hint

Names like:

- `image_data`
- `container_id`
- `container_total_num`
- `createStartUpPageContainer`
- `rebuildPageContainer`

are useful hints, but they belong to the EvenHub model and are not proof of the
live `DashboardDataPackage` field numbers.

## Working Hypothesis For Future Sender Work

The next serious sender iteration should assume:

1. `cmdId=7` needs a realistic nested page/container payload.
2. `cmdId=8` is one logical image-update message that is fragmented only at the transport layer.
3. The image payload probably needs more than one length-delimited field.
4. Any field ranking must favor early blob fields, but should not use inbound ACK fields as strong evidence.

## Consequence For Current Experiments

The current Python sender remains useful only as a transport probe.

It is not yet a faithful dashboard renderer because it still lacks:

- a real `cmdId=7` page payload
- the real `cmdId=8` metadata layout
- the proven image-byte field mapping
