# Dashboard Proto Map

Date: 2026-03-13

## Scope

This is a reasoned pseudo-schema for the Even G2 dashboard protobuf family,
built from names confirmed directly in `libapp.so`.

It is not a recovered `.proto` file. It is an operational map that separates:

- confirmed names from the Flutter AOT binary
- high-confidence structure inferences
- open unknowns that still need runtime bytes or deeper recovery

## Confirmed names from libapp.so

Top-level dashboard family:

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
- `eDashboardCommandId`

Command names:

- `APP_REQUEST_CREATE_STARTUP_PAGE_PACKET`
- `APP_REQUEST_REBUILD_PAGE_PACKET`
- `APP_REQUEST_SHUTDOWN_PAGE_PACKET`
- `APP_UPDATE_IMAGE_RAW_DATA_PACKET`
- `OS_RESPONSE_CREATE_STARTUP_PAGE_PACKET`
- `OS_RESPONSE_REBUILD_PAGE_PACKET`
- `OS_RESPONSE_IMAGE_RAW_DATA_PACKET`

Result / status names:

- `APP_RESPOND_SUCCESS`
- `APP_RESPOND_PARAMETER_ERROR`
- `APP_REQUEST_CREATE_PAGE_SUCCESS`
- `APP_REQUEST_REBUILD_PAGE_SUCCESS`
- `APP_REQUEST_REBUILD_PAGE_FAILD`
- `APP_REQUEST_CREATE_INVAILD_CONTAINER`
- `APP_REQUEST_CREATE_OUTOFMEMORY_CONTAINER`
- `APP_REQUEST_CREATE_OVERSIZE_RESPONSE_CONTAINER`

Dashboard content variants:

- `singleData`
- `multData`
- `singleHighlight`
- `multHighlight`

Display setting fields:

- `gridDistance`
- `gridHeight`

State / response handling:

- `pageId`
- `lineId`
- `handleHeartBeatFromOS pageId=`
- `_handlePageAndLineInfoFromOS`
- `, dataLen=`

Image pipeline:

- `assembleGlassesImage`
- `bmpEncode`
- `compressBmpData`

## High-confidence pseudo-schema

### App layer wrapper

```proto
message DashboardDataPackage {
  // Exact field numbers unknown.
  // Very likely wraps one request or response envelope for serviceId=8.
  oneof payload {
    AppRequest app_request;
    DashboardReceiveFromApp receive_from_app;
    DashboardRespondToApp respond_to_app;
    AppRespondToDashboard app_respond_to_dashboard;
  }
}
```

Reasoning:

- all these type names coexist in the dashboard proto family
- `DashboardDataPackage.fromBuffer` exists
- the module clearly models both app->OS and OS->app traffic

### Request envelope from app side

```proto
message AppRequest {
  // Exact oneof field numbers unknown.
  // One branch is likely chosen from eDashboardCommandId.
  oneof command_data {
    CreateStartUpPageContainer create_startup_page;
    RebuildPageContainer rebuild_page;
    ProtoImage update_image_raw_data;
    // likely more variants: shutdown, audio control, text, heartbeat
  }
}
```

Reasoning:

- `AppRequest` exists
- string `send error: empty command_data(oneof) for cmd=` exists
- command names exist for create/rebuild/update-image
- container classes exist for create/rebuild
- `ProtoImage` exists alongside the image pipeline markers

### Dashboard content payload

```proto
message DashboardContent {
  oneof content {
    SingleData singleData;
    MultData multData;
    SingleHighlight singleHighlight;
    MultHighlight multHighlight;
  }
}
```

Reasoning:

- `oneof=singleData`
- `oneof=multData`
- `oneof=singleHighlight`
- `oneof=multHighlight`
- setters/getters exist for these names

Interpretation:

- dashboard content can represent one or many standard data cards
- it also has a highlight-oriented mode used by health/news-like summaries
- this is a semantic content layer, not necessarily the raw render-image layer

### Display/layout metadata

```proto
message DashboardDisplaySetting {
  // Exact field numbers unknown.
  int32 gridDistance;
  int32 gridHeight;
  // probably more layout/display fields
}
```

Reasoning:

- `DashboardDisplaySetting`
- `gridDistance`
- `gridHeight`
- setters/getters and logging strings for both

Interpretation:

- page creation or dashboard content likely carries real layout metadata
- this supports the conclusion that `cmdId=7` is not a dummy packet
- helper names `ProtoBaseSettings|setGlassGridDistance` and
  `ProtoBaseSettings|setGlassGridHeight` suggest these values may be pushed via
  a dedicated base-settings helper layer in the real sender path

### Page/container model

```proto
message CreateStartUpPageContainer {
  // exact fields unknown
  DashboardDisplaySetting display_setting;
  DashboardContent content;
  // possibly page/container identifiers and counts
}

message RebuildPageContainer {
  // exact fields unknown
  uint32 pageId;   // inferred from OS response handling, not field-mapped
  uint32 lineId;   // inferred from OS response handling, not field-mapped
  DashboardContent content;
  DashboardDisplaySetting display_setting;
}
```

Reasoning:

- `CreateStartUpPageContainer` and `RebuildPageContainer` exist as real types
- response handlers track `pageId` and `lineId`
- the dashboard family includes content plus display-setting types

### Image update model

```proto
message ProtoUpdateWithImageCallArguments {
  // exact fields unknown
  ProtoImage image;
  // maybe additional update flags / context
}

message ProtoImage {
  // exact field numbers unknown
  // likely contains compressed BMP payload plus image metadata
  bytes image_data;
  BmpImageSizeData image_size;
  // possibly flags / offsets / page association
}
```

Reasoning:

- `ProtoUpdateWithImageCallArguments`
- `ProtoImage`
- `BmpImageSizeData`
- `BmpInfo`
- `IcoBmpInfo`
- `_stepBmpEncode`
- `assembleGlassesImage`
- `bmpEncode`
- `compressBmpData`
- `APP_UPDATE_IMAGE_RAW_DATA_PACKET`

Interpretation:

- `cmdId=8` is still best modeled as an image-update command
- the image is likely wrapped in `ProtoImage`, and may be passed through an
  additional helper layer such as `ProtoUpdateWithImageCallArguments`
- the real app path may preserve more BMP-related metadata than the current
  sender prototype does

## Best operational model for cmdId=7 / cmdId=8

### cmdId=7

Best current model:

- maps to `APP_REQUEST_CREATE_STARTUP_PAGE_PACKET`
- likely serializes an `AppRequest`
- that request likely carries `CreateStartUpPageContainer`
- that container likely references:
  - `DashboardDisplaySetting`
  - semantic `DashboardContent`
  - maybe initial page/container identifiers

### cmdId=8

Best current model:

- maps to `APP_UPDATE_IMAGE_RAW_DATA_PACKET`
- likely serializes an `AppRequest`
- that request likely carries `ProtoUpdateWithImageCallArguments` or directly
  `ProtoImage`
- `ProtoImage` likely contains:
  - compressed BMP bytes
  - image size metadata
  - maybe page association / offsets / chunk metadata

### OS responses

Best current model:

- `OS_RESPONSE_CREATE_STARTUP_PAGE_PACKET` returns page state
- `OS_RESPONSE_REBUILD_PAGE_PACKET` confirms rebuild/result
- `OS_RESPONSE_IMAGE_RAW_DATA_PACKET` returns image-write result and/or data len
- app logs show it tracks `pageId`, `lineId`, and `dataLen`

## What this changes for sender work

Do not model dashboard rendering as:

```proto
DashboardDataPackage {
  cmd = 8
  bytes bmp = ...
}
```

The minimum realistic model is closer to:

```proto
DashboardDataPackage {
  AppRequest {
    command_data = CreateStartUpPageContainer(...)
  }
}

DashboardDataPackage {
  AppRequest {
    command_data = ProtoImage(...)
  }
}
```

with transport fragmentation happening only after the logical message is built.

## Still unknown

- exact field numbers everywhere
- exact enum values for `eDashboardCommandId`
- exact location of `pageId` / `lineId` in protobuf fields
- whether `cmdId=8` wraps `ProtoImage` directly or wraps
  `ProtoUpdateWithImageCallArguments`
- exact `ProtoImage` field layout
- whether `DashboardContent` is sent in the same message as page creation,
  or staged across multiple command variants

## Priority targets after this map

1. recover deeper structure around `AppRequest`
2. recover deeper structure around `ProtoImage`
3. recover deeper structure around `DashboardDisplaySetting`
4. compare dashboard with teleprompter/navigation for shared image wrappers
5. eventually validate with real runtime bytes when capture becomes possible
