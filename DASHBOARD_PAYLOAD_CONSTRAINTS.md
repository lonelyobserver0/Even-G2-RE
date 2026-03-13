# Dashboard Payload Constraints

Date: 2026-03-10

## Why this note exists

The current sender experiments already proved that BLE connectivity and the
legacy auth path are not the core problem. The remaining gap is the real
dashboard render payload.

This note records the strongest constraints already supported by the local
reports so future experiments do not regress into blind guesses.

## Strong constraints

### 1. `serviceId=8` is still the correct dashboard target

This remains the best confirmed dashboard/render service.

### 2. `cmdId=8` inbound packet already captured is ACK-like

The documented inbound sample for `serviceId=8, cmdId=8` is:

- field `1 = 8`
- field `2 = seqNum`
- field `6 = ""`

This strongly suggests the captured packet is an
`OS_RESPONSE_IMAGE_RAW_DATA_PACKET`, not the outbound image payload itself.

Implication:

- do not treat that inbound packet as proof that image bytes live in field `6`

### 3. Dashboard rendering is page/container based

The local reports consistently describe this sequence:

1. create page
2. wait for page response
3. send content
4. optionally rebuild page

Implication:

- `cmdId=7` likely requires real page/container metadata
- a nearly empty `create-page` packet is unlikely to be sufficient

### 4. Image payload is probably not “just BMP in field 3”

What is known:

- `assembleGlassesImage`
- `bmpEncode`
- `compressBmpData`
- `APP_UPDATE_IMAGE_RAW_DATA_PACKET`
- `DashboardDataPackage`

Implication:

- the real outbound image packet may contain:
  - compressed BMP, not raw BMP
  - page/container identifiers
  - offsets or chunk metadata
  - image metadata before the byte blob

### 5. `EvenHub` names are hints, not proof

Names like:

- `image_data`
- `container_id`
- `createStartUpPageContainer`
- `rebuildPageContainer`

are useful, but they belong to the `EvenHub` layer and are not yet proven to
match the live `DashboardDataPackage` field numbers.

## Practical consequence

Do not prioritize more sender variants that only change:

- image field number
- tiny BMP size
- `cmdId=9` commit guesses

unless one of these is also available:

- real outbound packet bytes from the official app
- a better mapping of dashboard page/container fields

## Best next evidence to collect

- full outbound dashboard write payloads during `dashboard`
- full outbound dashboard write payloads during `teleprompter`
- any packet preceding the `244,244,X` right-lens bursts

That evidence is more valuable than another round of guessed sender changes.
