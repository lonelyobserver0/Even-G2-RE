# Even G2 RE Workspace

Questa cartella raccoglie il materiale di reverse engineering per il protocollo
BLE e il rendering display degli Even G2.

L'obiettivo pratico del repo non è generico: ricostruire il path reale di invio
verso gli occhiali, in particolare il payload dashboard/render su `serviceId=8`
e i comandi `cmdId=7` / `cmdId=8`.

## Stato attuale

- Il transport reale `AA 12` è confermato.
- La sequenza auth legacy `AA 21` è nota ed è già stata testata.
- Il bridge BLE Android decriptato dai DEX è sufficiente per confermare:
  - `WRITE_TYPE_NO_RESPONSE`
  - routing per `psType`
  - MTU di default `247`
- Il gap principale resta nel layer Flutter `libapp.so`:
  - payload reale `cmdId=7` create-page
  - payload reale `cmdId=8` image update
  - field mapping protobuf esatto

## Punto chiave

Il problema non è più "come inviare qualcosa via BLE", ma "quale struttura
protobuf e quale contenitore immagine usa davvero l'app ufficiale".

In base ai report e al RE statico attuale:

- `cmdId=7` è quasi certamente un vero messaggio container/pagina
- `cmdId=8` è quasi certamente un vero image update con metadati + bytes
- la frammentazione succede dopo la costruzione del comando logico
- l'app ufficiale parla con entrambe le lenti

## Lettura consigliata

1. [CURRENT_RE_FINDINGS.md](/home/loneobs/Code/Even/RE/even-apks/base/CURRENT_RE_FINDINGS.md)
2. [REPORT_BLE_PROTOCOL.md](/home/loneobs/Code/Even/RE/even-apks/base/REPORT_BLE_PROTOCOL.md)
3. [REPORT_APP_ANALYSIS.md](/home/loneobs/Code/Even/RE/even-apks/base/REPORT_APP_ANALYSIS.md)
4. [REPORT_UNPACKING.md](/home/loneobs/Code/Even/RE/even-apks/base/REPORT_UNPACKING.md)

Per il RE statico più recente di `libapp.so`:

- [LIBAPP_DASHBOARD_RE_FINDINGS.md](/home/loneobs/Code/Even/RE/even-apks/base/LIBAPP_DASHBOARD_RE_FINDINGS.md)
- [DASHBOARD_PROTO_MAP.md](/home/loneobs/Code/Even/RE/even-apks/base/DASHBOARD_PROTO_MAP.md)

## File chiave

### Report

- [HANDOFF_INDEX.md](/home/loneobs/Code/Even/RE/even-apks/base/HANDOFF_INDEX.md)
- [DASHBOARD_OUTBOUND_MODEL.md](/home/loneobs/Code/Even/RE/even-apks/base/DASHBOARD_OUTBOUND_MODEL.md)
- [DASHBOARD_PAYLOAD_CONSTRAINTS.md](/home/loneobs/Code/Even/RE/even-apks/base/DASHBOARD_PAYLOAD_CONSTRAINTS.md)
- [DEX_BRIDGE_FINDINGS.md](/home/loneobs/Code/Even/RE/even-apks/base/DEX_BRIDGE_FINDINGS.md)

### Log e capture

- [dashboard-logcat.txt](/home/loneobs/Code/Even/RE/even-apks/base/dashboard-logcat.txt)
- [teleprompter-logcat.txt](/home/loneobs/Code/Even/RE/even-apks/base/teleprompter-logcat.txt)
- [navigation-logcat.txt](/home/loneobs/Code/Even/RE/even-apks/base/navigation-logcat.txt)
- [even-current-logcat.txt](/home/loneobs/Code/Even/RE/even-apks/base/even-current-logcat.txt)
- [even-current-bt.log](/home/loneobs/Code/Even/RE/even-apks/base/even-current-bt.log)
- [Captured.pcapng](/home/loneobs/Code/Even/RE/even-apks/base/Captured.pcapng)
- [Captured2.pcapng](/home/loneobs/Code/Even/RE/even-apks/base/Captured2.pcapng)

Nota:

- le capture nRF presenti finora non contengono i payload ATT utili; mostrano
  advertising e tentativi di connessione, non il traffico GATT completo seguito
  dal dongle

### Script di analisi

- [even_protocol.py](/home/loneobs/Code/Even/RE/even-apks/base/even_protocol.py)
- [decode_even_packets.py](/home/loneobs/Code/Even/RE/even-apks/base/decode_even_packets.py)
- [parse_log.py](/home/loneobs/Code/Even/RE/even-apks/base/parse_log.py)
- [analyze_even_logcat.py](/home/loneobs/Code/Even/RE/even-apks/base/analyze_even_logcat.py)
- [compare_even_bursts.py](/home/loneobs/Code/Even/RE/even-apks/base/compare_even_bursts.py)
- [timeline_even_render.py](/home/loneobs/Code/Even/RE/even-apks/base/timeline_even_render.py)

### Sender sperimentali

- [send_image_real.py](/home/loneobs/Code/Even/RE/even-apks/base/send_image_real.py)
- [server.py](/home/loneobs/Code/Even/RE/even-apks/base/server.py)
- [probe_render_path.py](/home/loneobs/Code/Even/RE/even-apks/base/probe_render_path.py)

### Hook / Android

- [frida_hook_even_ble.js](/home/loneobs/Code/Even/RE/even-apks/base/frida_hook_even_ble.js)
- [FRIDA_CAPTURE_RUNBOOK.md](/home/loneobs/Code/Even/RE/even-apks/base/FRIDA_CAPTURE_RUNBOOK.md)
- [ARM64_CAPTURE_OPTIONS.md](/home/loneobs/Code/Even/RE/even-apks/base/ARM64_CAPTURE_OPTIONS.md)
- [X86_BASE_ONLY_MEMDEX3_RUNBOOK.md](/home/loneobs/Code/Even/RE/even-apks/base/X86_BASE_ONLY_MEMDEX3_RUNBOOK.md)

## APK e artefatti

La cartella usa questi APK vicini nel repo:

- `/home/loneobs/Code/Even/RE/even-apks/base.apk`
- `/home/loneobs/Code/Even/RE/even-apks/split_config.arm64_v8a.apk`

I DEX decriptati sono già presenti in:

- [decrypted_dex](/home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex)

## RE statico di libapp.so

Dal RE statico attuale del binary Flutter AOT risultano confermati almeno:

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
- `ProtoUpdateWithImageCallArguments`

In più:

- `DashboardContent` sembra avere una `oneof` con:
  - `singleData`
  - `multData`
  - `singleHighlight`
  - `multHighlight`
- `DashboardDisplaySetting` espone almeno:
  - `gridDistance`
  - `gridHeight`

Questa è la ragione per cui i sender "BMP in un campo e basta" non sono più
considerati un modello plausibile del protocollo reale.

## Sender attuale

[send_image_real.py](/home/loneobs/Code/Even/RE/even-apks/base/send_image_real.py) supporta:

- modalità `naive`
- modalità `proto-map`
- `--dry-run` per costruire e stampare i pacchetti senza BLE
- scan automatico dei candidati Even G2
- `--all-lenses` per provare il test su tutte le lenti trovate

Esempio dry-run:

```bash
source /home/loneobs/Code/Even/RE/even-apks/base/.venv/bin/activate

python /home/loneobs/Code/Even/RE/even-apks/base/send_image_real.py \
  --dry-run \
  --mode proto-map \
  --width 8 \
  --height 8 \
  /home/loneobs/Code/Even/RE/even-apks/base/test.png
```

Esempio live su tutte le lenti trovate:

```bash
source /home/loneobs/Code/Even/RE/even-apks/base/.venv/bin/activate

python /home/loneobs/Code/Even/RE/even-apks/base/send_image_real.py \
  --mode proto-map \
  --all-lenses \
  --scan-timeout 10 \
  --dashboard-wrapper-field 3 \
  --app-request-field 1 \
  --command-data-field 1 \
  --image-field-number 3 \
  --compression-mode 1 \
  --width 8 \
  --height 8 \
  /home/loneobs/Code/Even/RE/even-apks/base/test.png
```

## Vincoli attuali

- le capture passive nRF fatte finora non hanno seguito la connessione utile
- HCI snoop sul telefono non ha esposto i payload che servivano
- non c'è al momento un device `arm64` rootato disponibile per Frida
- Genymotion / emulatori non hanno dato un path affidabile per i byte runtime

## Strategia consigliata

1. usare il RE statico di `libapp.so` per restringere ancora il modello
2. trattare il sender Python come probe, non come implementazione fedele
3. se possibile, tornare a una cattura runtime vera appena c'è un target migliore

## Ambiente Python

La venv locale è:

- `/home/loneobs/Code/Even/RE/even-apks/base/.venv`

Attivazione:

```bash
source /home/loneobs/Code/Even/RE/even-apks/base/.venv/bin/activate
```
