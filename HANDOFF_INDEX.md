# EVEN G2 Handoff Index

Questa cartella raccoglie il materiale utile per continuare il reverse engineering BLE del display Even G2.

## Ordine consigliato

1. Leggi [CURRENT_RE_FINDINGS.md](/home/loneobs/Code/Even/RE/even-apks/base/CURRENT_RE_FINDINGS.md) per lo stato più recente dei test live.
2. Leggi [REPORT_BLE_PROTOCOL.md](/home/loneobs/Code/Even/RE/even-apks/base/REPORT_BLE_PROTOCOL.md) per il quadro del transport `AA 12`, service ID e rendering.
3. Leggi [REPORT_APP_ANALYSIS.md](/home/loneobs/Code/Even/RE/even-apks/base/REPORT_APP_ANALYSIS.md) per architettura app, Flutter/libapp e bridge BLE nativo.
4. Leggi [REPORT_UNPACKING.md](/home/loneobs/Code/Even/RE/even-apks/base/REPORT_UNPACKING.md) per i limiti incontrati sull'unpacking e sul codice protetto.

## Capture e log utili

- [dashboard-logcat.txt](/home/loneobs/Code/Even/RE/even-apks/base/dashboard-logcat.txt): capture live della dashboard, con burst `244,244,X` sul destro.
- [teleprompter-logcat.txt](/home/loneobs/Code/Even/RE/even-apks/base/teleprompter-logcat.txt): capture live del teleprompter, stesso schema di burst con prefisso diverso.
- [navigation-logcat.txt](/home/loneobs/Code/Even/RE/even-apks/base/navigation-logcat.txt): capture poco informativa, utile come controllo negativo.
- [even-current-logcat.txt](/home/loneobs/Code/Even/RE/even-apks/base/even-current-logcat.txt): logcat grezzo usato per le analisi intermedie.
- [even-current-bt.log](/home/loneobs/Code/Even/RE/even-apks/base/even-current-bt.log): log Bluetooth di sistema con handle e lunghezze ATT.
- [bugreport.zip](/home/loneobs/Code/Even/RE/even-apks/base/bugreport.zip): bugreport Android completo.
- [dashboard-bugreport.zip](/home/loneobs/Code/Even/RE/even-apks/base/dashboard-bugreport.zip): bugreport dedicato al test dashboard.

## Script di analisi

- [analyze_even_logcat.py](/home/loneobs/Code/Even/RE/even-apks/base/analyze_even_logcat.py): estrae pattern di scrittura dai logcat Even.
- [compare_even_bursts.py](/home/loneobs/Code/Even/RE/even-apks/base/compare_even_bursts.py): confronta i burst tra feature diverse.
- [timeline_even_render.py](/home/loneobs/Code/Even/RE/even-apks/base/timeline_even_render.py): costruisce una timeline del render cycle.
- [decode_even_packets.py](/home/loneobs/Code/Even/RE/even-apks/base/decode_even_packets.py): decoder protobuf/transport per packet dump `AA 12`.
- [parse_log.py](/home/loneobs/Code/Even/RE/even-apks/base/parse_log.py): parser generico dei log packet-level.
- [even_protocol.py](/home/loneobs/Code/Even/RE/even-apks/base/even_protocol.py): helper condivisi per CRC, varint e packet format.
- [summarize_dex_bridge.py](/home/loneobs/Code/Even/RE/even-apks/base/summarize_dex_bridge.py): riepilogo rapido del bridge BLE Java/Kotlin nei DEX decriptati.

## Script sperimentali di invio

- [send_image_real.py](/home/loneobs/Code/Even/RE/even-apks/base/send_image_real.py): sender Python aggiornato sul transport reale.
- [server.py](/home/loneobs/Code/Even/RE/even-apks/base/server.py): API locale per scan/connect e test dashboard.

## Hook e runbook Android

- [frida_hook_even_ble.js](/home/loneobs/Code/Even/RE/even-apks/base/frida_hook_even_ble.js): hook Frida per loggare write e notify BLE dell'app ufficiale.
- [FRIDA_CAPTURE_RUNBOOK.md](/home/loneobs/Code/Even/RE/even-apks/base/FRIDA_CAPTURE_RUNBOOK.md): stato attuale del device e procedura consigliata per catturare i byte reali.
- [DEX_BRIDGE_FINDINGS.md](/home/loneobs/Code/Even/RE/even-apks/base/DEX_BRIDGE_FINDINGS.md): cosa i DEX decriptati già confermano sul bridge BLE e cosa invece resta solo in `libapp.so`.
- [DASHBOARD_OUTBOUND_MODEL.md](/home/loneobs/Code/Even/RE/even-apks/base/DASHBOARD_OUTBOUND_MODEL.md): modello più stretto del render cycle dashboard e dei suoi vincoli outbound.

## Stato tecnico sintetico

- Discovery e connessione BLE: funzionano.
- Sequenza auth legacy `AA 21`: probabilmente sufficiente a sopprimere "Use the app".
- Transport reale `AA 12`: confermato.
- Rendering live ufficiale: osservato come burst ripetuti `244,244,X` sul destro via `psType=0`.
- Mapping utile dai log:
  - `psType=0` destro -> write handle `0x0842`, notify `0x0844` (`2116`)
  - `psType=3` destro -> write handle `0x0882`, notify `0x0884` (`2180`)
- Gap principale: payload protobuf esatto del render update, in particolare il contenitore dell'immagine in `cmdId=8`.
- Emulatore ufficiale Android:
  - supporta `x86_64,arm64-v8a` con `libndk_translation.so`
  - installa gli split Even corretti
  - ma l'app crasha nel bootstrap Jiagu con mismatch `EM_X86_64` vs `EM_AARCH64`

## Prossimo passo raccomandato

Ottenere i byte reali delle write dell'app ufficiale durante un update display, preferibilmente con hook runtime su Android o con una cattura BLE più bassa del logcat.
