# Roadmap

This roadmap is focused on one outcome: recovering the real dashboard/render
payload path used by the official Even G2 app.

## Phase 1: Stabilize known facts

- Keep transport helpers aligned with confirmed `AA 12` behavior.
- Keep log-derived channel and burst findings documented.
- Maintain a clear separation between confirmed facts and inferred structure.

## Phase 2: Push static RE further

- Recover more structure from `libapp.so` around:
  - `DashboardDataPackage`
  - `AppRequest`
  - `DashboardContent`
  - `DashboardDisplaySetting`
  - `CreateStartUpPageContainer`
  - `RebuildPageContainer`
  - `ProtoImage`
  - `ProtoUpdateWithImageCallArguments`
- Improve the proto-map as new type or field hints emerge.

## Phase 3: Improve sender probes

- Keep the Python sender usable as a structured probe.
- Add cleaner sweep tooling for guessed field-number combinations.
- Add better logging of attempted parameter sets and candidate lenses.
- Avoid pretending the sender is "correct" before runtime validation exists.

## Phase 4: Recover real runtime bytes

This remains the most important milestone.

Best-case next evidence:

- rooted `arm64` device + Frida capture of official app writes
- full BLE capture with real ATT payloads
- any reliable runtime path that exposes official outbound dashboard bytes

## Phase 5: Rebuild a faithful sender

Only after real bytes are available:

- compare guessed protobuf structure against real traffic
- fix field mappings
- rebuild create-page and image-update messages accurately
- validate behavior on both lenses

## Contributions that would help most

- rooted-device Frida captures
- successful ATT-level BLE captures
- deeper `libapp.so` recovery
- reproducible tests on other firmware versions
