# Even Realities App - Analisi Completa

**Data:** 2026-03-09
**APK:** `com.even.sg` (Even Realities G2)
**Versione Dart:** 3.8.0 (stable, 14 maggio 2025)
**Framework:** Flutter con GetX state management
**Protezione:** Qihoo 360 Jiagu (加固) - DEX criptati a runtime
**Build:** Jenkins CI su macOS (`/Volumes/Acer_SSD/jenkins_data/workspace/APP/G2/Android-GooglePlay/`)
**DEX Decrittati:** 5 file (18.5MB totale), 13.517 file Java decompilati con jadx 1.5.1

---

## Indice

1. [Architettura dell'App](#1-architettura-dellapp)
2. [Librerie Native](#2-librerie-native)
3. [Protocollo BLE - Panoramica](#3-protocollo-ble---panoramica)
4. [Protocollo BLE G2 - Dettaglio Completo](#4-protocollo-ble-g2---dettaglio-completo)
5. [Protocollo BLE G1 (Legacy)](#5-protocollo-ble-g1-legacy)
6. [Protocollo BLE Ring R1](#6-protocollo-ble-ring-r1)
7. [Glasses OS - Comandi e Risposte](#7-glasses-os---comandi-e-risposte)
8. [Pipeline Audio e ASR](#8-pipeline-audio-e-asr)
9. [Even AI Assistant](#9-even-ai-assistant)
10. [Navigazione](#10-navigazione)
11. [Traduzione e Trascrizione](#11-traduzione-e-trascrizione)
12. [Teleprompter](#12-teleprompter)
13. [Health Tracking (Ring R1)](#13-health-tracking-ring-r1)
14. [Dashboard](#14-dashboard)
15. [API Backend](#15-api-backend)
16. [Sicurezza e Crittografia](#16-sicurezza-e-crittografia)
17. [OTA e Firmware Updates](#17-ota-e-firmware-updates)
18. [Osservazioni di Sicurezza](#18-osservazioni-di-sicurezza)
19. [Layer BLE Nativo Android (da DEX decompilato)](#19-layer-ble-nativo-android-da-dex-decompilato)
20. [Plugin Flutter Nativi (da DEX decompilato)](#20-plugin-flutter-nativi-da-dex-decompilato)
21. [Servizi Android (da DEX decompilato)](#21-servizi-android-da-dex-decompilato)
22. [Offuscamento Stringhe Jiagu (da DEX decompilato)](#22-offuscamento-stringhe-jiagu-da-dex-decompilato)

---

## 1. Architettura dell'App

### Stack Tecnologico
- **Frontend:** Flutter (Dart AOT compilato in `libapp.so`)
- **State Management:** GetX (`GetxController`, `GetxService`, dependency injection)
- **Pattern:** Controller/Binding/View con `EvenController` base class + `EvenPageMixin`
- **Database locale:** Drift (SQLite ORM) + MMKV (key-value veloce) + Hive (storage strutturato)
- **Networking:** Dio (HTTP client) + WebSocket
- **Serializzazione:** Protocol Buffers per comunicazione BLE, JSON per API REST

### Struttura Multi-Package

```
even/                          # App principale (UI, pagine, servizi)
even_core/                     # Core: networking, storage, design system, crittografia
even_connect/                  # Connettività BLE (G1, G2, Ring1)
  ├── core/                    # Modelli base, DFU, MCU manager
  ├── g1/                      # Protocollo G1 (legacy)
  ├── g2/                      # Protocollo G2 (corrente)
  │   └── proto/generated/     # Protobuf generati (30+ moduli)
  └── ring1/                   # Protocollo Ring R1
even_navigate/                 # Modulo navigazione (Mapbox, Pigeon)
even_ui/                       # Libreria componenti UI
translate/                     # Motore traduzione
teleprompt/                    # Modulo teleprompter
conversate/                    # Modulo conversazione AI
dashboard/                     # Widget dashboard (stocks, weather, calendar, news)
flutter_ezw_asr/               # ASR abstraction (Soniox + Azure)
flutter_ezw_audio/             # Processamento audio (AGC, denoising, speech enhance)
flutter_ezw_ble/               # Astrazione BLE basso livello
flutter_ezw_lc3/               # Codec LC3 (Bluetooth LE Audio)
flutter_ezw_logger/            # Framework logging (mmap-based)
flutter_ezw_health_algorithm/  # Algoritmi dati salute
flutter_ezw_utils/             # Utility (encryption, storage, extensions)
flutter_ezw_utop/              # Business logic providers
```

### Navigazione App (Pagine)

```
Login Flow:
  login_entry → login_email → login_captcha → login_pwd → login_register
  login_forget_pwd → password_reset
  login_choose_country
  onboarding (video, wear, notification, headup, disconnect states)

Main Screen (tabs):
  home      → stato dispositivi, ring NV recovery
  health    → heart_rate, spo2, sleep, steps, calories, hrv, temperature, productivity
  mine      → profilo, inbox, terminal_info, privacy, regulatory

Feature Pages:
  translate     → details, preview, filter, settings, language_pair, font_enlarger
  teleprompter  → list, auto, manual, ai, edit_preview, settings
  converse      → live, history_detail, setting, debug
  ai_agent      → main, setting, shortcut, history
  navigate      → search, favorite, favorite_detail
  dashboard     → settings: calendar, weather, stock, news, menu, news_source
  quicklist     → list, detail

Device Pages:
  devices/discovery
  devices/info
  devices/mine → display, brightness, brightness_calibration, motion, advanced, recalibrate
  devices/ota  → glasses, ring, ring_bootloader_sd, ring_dfu_error
  devices/nickname

Settings:
  theme, language, notification (display_time), unit (date_format), gesture_customization

Debug (nascosto):
  scanner_connect_device, health_productivity_debug, health_point_debug
  health_window_debug, health_pending_upload_debug, ota_settings_card
  converse_settings_card, translation_settings_card, quick_list_test_card
  ring_nv_recover_card, share_test_card, log_debug_model
```

---

## 2. Librerie Native

| Libreria | Dimensione | Scopo |
|----------|-----------|-------|
| `libapp.so` | 28 MB | Codice Dart AOT compilato (tutta la logica app) |
| `libflutter.so` | 11 MB | Flutter engine (Impeller renderer) |
| `libeven.so` | 30 MB | **Custom native: ONNX Runtime + LLaMA inference + Speech Enhancement** |
| `liblc3.so` | - | Codec LC3 per Bluetooth LE Audio |
| `libsherpa-onnx-c-api.so` | - | Sherpa-ONNX (speech recognition on-device) |
| `libsherpa-onnx-cxx-api.so` | - | Sherpa-ONNX C++ API |
| `libonnxruntime.so` | - | ONNX Runtime (ML inference) |
| `libMicrosoft.CognitiveServices.Speech.core.so` | - | Azure Cognitive Services Speech SDK |
| `libmapbox-common.so` | - | Mapbox Maps SDK |
| `libmapbox-maps.so` | - | Mapbox Maps rendering |
| `libnavigator-android.so` | - | Mapbox Navigation SDK |
| `libmmkv.so` | - | MMKV key-value storage |
| `libsqlite3.so` | - | SQLite database |
| `libjniPdfium.so` | - | PDF rendering |

### Scoperta chiave: `libeven.so`
La libreria custom `libeven.so` (30 MB) integra:
- **ONNX Runtime** per inferenza modelli ML
- **LLaMA model inference** (llama_kv_cache, llm_build_llama, ecc.)
- **Speech Enhancement pipeline** (SpeechEnhanceConfig, AGC, noise reduction)
- Questo abilita **inferenza AI on-device** senza connettività cloud

---

## 3. Protocollo BLE - Panoramica

### UUID dei Servizi BLE

#### Servizio Custom Even (base: `00002760-08C2-11E1-9073-0E8AC72E____`)

| UUID (ultimi 4 byte) | Scopo Probabile |
|-----------------------|-----------------|
| `0001` | Servizio primario |
| `0002` | Servizio secondario |
| `1001` | Controllo/comando |
| **Gruppo 54xx** | **Canale dati 1 (probabilmente lente sinistra)** |
| `5401` | Caratteristica TX (write) |
| `5402` | Caratteristica RX (read) |
| `5450` | Caratteristica notify |
| **Gruppo 64xx** | **Canale dati 2 (probabilmente lente destra)** |
| `6401` | Caratteristica TX (write) |
| `6402` | Caratteristica RX (read) |
| `6450` | Caratteristica notify |
| **Gruppo 74xx** | **Canale dati 3 (probabilmente ring)** |
| `7401` | Caratteristica TX (write) |
| `7402` | Caratteristica RX (read) |
| `7450` | Caratteristica notify |

Il pattern `xx01` = servizio, `xx02` = write characteristic, `xx50` = notify characteristic.

#### Nordic UART Service (NUS) - Usato per G1

| UUID | Scopo |
|------|-------|
| `6E400001-B5A3-F393-E0A9-E50E24DCCA9E` | Servizio NUS |
| `6E400002-B5A3-F393-E0A9-E50E24DCCA9E` | TX Characteristic (write to device) |
| `6E400003-B5A3-F393-E0A9-E50E24DCCA9E` | RX Characteristic (notify from device) |

#### Servizio Custom BAE8 - Usato per G2

| UUID | Scopo |
|------|-------|
| `BAE80001-4F05-4503-8E65-3AF1F7329D1F` | Servizio privato G2 |
| `BAE80012-4F05-4503-8E65-3AF1F7329D1F` | Write characteristic (comandi verso gli occhiali) |
| `BAE80013-4F05-4503-8E65-3AF1F7329D1F` | Notify characteristic (risposte dagli occhiali) |

### Architettura di Connessione

```
┌──────────────┐      BLE (BAE8xxxx)      ┌──────────────┐
│   App Even   │◄────────────────────────►│  Occhiali G2 │
│  (Flutter)   │      Protobuf/Binary     │  (Even OS)   │
└──────┬───────┘                          └──────┬───────┘
       │                                         │
       │  BLE (0x2760-74xx)                      │ Ring relay
       │                                         │ (RING_GLASSES)
       ▼                                         ▼
┌──────────────┐                          ┌──────────────┐
│  Ring R1     │◄─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ►│  (via G2)    │
│  (Health)    │    Ring data relay        │              │
└──────────────┘                          └──────────────┘
```

---

## 4. Protocollo BLE G2 - Dettaglio Completo

### 4.1 Transport Layer (`EvenBleTransport`)

Ogni pacchetto BLE inizia con un header binario:

```
┌─────────┬───────────┬─────────────────┬───────────┬─────────────┐
│ HEAD_ID │ packetLen │ sequenceNumber  │ serviceId │   payload   │
│  0xAA   │  2 bytes  │    2 bytes      │  2 bytes  │  N bytes    │
└─────────┴───────────┴─────────────────┴───────────┴─────────────┘
```

- **HEAD_ID:** Sempre `0xAA` (magic byte). Se diverso: `"EvenBleTransport::fromBytes: headId is not 0xAA. Received: 0x..."`
- **packetLen:** Lunghezza totale del pacchetto
- **sequenceNumber:** Numero di sequenza per ordinamento/retry
- **serviceId:** Identifica il modulo destinazione (vedi tabella sotto)
- **payload:** Dati serializzati in Protobuf

**Validazione:** `"EvenBleTransport::fromBytes: Data too short for a valid BLE packet. Minimum length is ..."` e `"Data length mismatch. Expected at least header (...)"`

**Multi-pacchetto:** I dati più grandi del MTU vengono frammentati con `_splitDataIntoPackets` e riassemblati tramite `BleG2MultiPacketItem`. La coda viene gestita da `_processPacketQueue`.

**Retry:** Il sistema include `_parseRetryPackets` e `_waitForPacketResponse` con timeout.

### 4.2 Service ID e DataPackage

Ogni modulo degli occhiali ha un `serviceId` unico. Il payload è un Protobuf `DataPackage` con un campo `psType` (packet/service type) che identifica il sotto-comando.

| Service ID Enum | DataPackage Class | Protobuf Source | Descrizione |
|-----------------|-------------------|-----------------|-------------|
| `UI_DEFAULT_APP_ID` | - | - | App display default |
| `UI_SETTING_APP_ID` | - | - | Impostazioni |
| `UI_TRANSLATE_APP_ID` | `TranslateDataPackage` | `translate.pb.dart` | Traduzione |
| `UI_TRANSCRIBE_APP_ID` | `TranscribeDataPackage` | `transcribe.pb.dart` | Trascrizione |
| `UI_TELEPROMPT_APP_ID` | `TelepromptDataPackage` | `teleprompt.pb.dart` | Teleprompter |
| `UI_CONVERSATE_APP_ID` | `ConversateDataPackage` | `conversate.pb.dart` | Conversazione AI |
| `UI_LOGGER_APP_ID` | - | `logger.pb.dart` | Logger dispositivo |
| `UI_FOREGROUND_EVEN_AI_ID` | `EvenAIDataPackage` | `even_ai.pb.dart` | Even AI Assistant |
| `UI_ONBOARDING_APP_ID` | `OnboardingDataPackage` | `onboarding.pb.dart` | Onboarding |
| `UI_BACKGROUND_DASHBOARD_APP_ID` | `DashboardDataPackage` | `dashboard.pb.dart` | Dashboard background |
| `UI_FOREGROUND_SYSTEM_ALERT_APP_ID` | - | - | Allarmi di sistema |
| `UI_FOREGROUND_SYSTEM_CLOSE_APP_ID` | - | - | Chiusura sistema |
| `UI_QUICKLIST_APP_ID` | `QuicklistDataPackage` | `quicklist.pb.dart` | Note rapide |
| `UI_HEALTH_APP_ID` | `HealthDataPackage` | `health.pb.dart` | Dati salute |
| `UI_BACKGROUND_EVENHUB_APP_ID` | - | `EvenHub.pb.dart` | EvenHub |
| `UX_DEVICE_SETTINGS_APP_ID` | `DevCfgDataPackage` | `dev_config_protocol.pb.dart` | Configurazione device |
| `UX_GLASSES_CASE_APP_ID` | `GlassesCaseDataPackage` | `glasses_case.pb.dart` | Custodia occhiali |
| `UX_RING_DATA_RELAY_ID` | `RingDataPackage` | `ring.pb.dart` | Relay dati ring |
| `UX_RING_ROW_DATA_ID` | - | - | Dati raw ring |
| `UX_OTA_TRANSMIT_CMD_ID` | - | `ota_transmit.pbenum.dart` | Comandi OTA |
| `UX_OTA_TRANSMIT_RAW_DATA_ID` | - | - | Dati raw OTA |
| `UX_OTA_EXPORT_FILE_CMD_ID` | - | - | Export file OTA |
| `UX_OTA_EXPORT_FILE_RAW_DATA_ID` | - | - | Dati raw export OTA |
| `UX_EVEN_FILE_SERVICE_CMD_SEND_ID` | - | `efs_transmit.pbenum.dart` | File service: invio |
| `UX_EVEN_FILE_SERVICE_CMD_EXPORT_ID` | - | - | File service: export |
| `UX_EVEN_FILE_SERVICE_RAW_SEND_DATA_ID` | - | - | File service: dati raw invio |
| `UX_EVEN_FILE_SERVICE_RAW_EXPORT_DATA_ID` | - | - | File service: dati raw export |
| `SERVICE_MODULE_CONFIGURE_APP_ID` | - | `module_configure.pb.dart` | Configurazione moduli |

### 4.3 Flusso di Comunicazione

```
App                                    Occhiali G2
 │                                          │
 │  ┌──────────────────────────────────┐    │
 │  │ 1. Crea DataPackage con psType   │    │
 │  │ 2. Serializza in Protobuf        │    │
 │  │ 3. Wrappa in EvenBleTransport    │    │
 │  │    (0xAA + len + seq + svcId)    │    │
 │  │ 4. Frammenta se > MTU            │    │
 │  └──────────────────────────────────┘    │
 │                                          │
 │──── writeCharacteristic (BAE80012) ─────►│
 │                                          │
 │◄──── notify (BAE80013) ─────────────────│
 │                                          │
 │  ┌──────────────────────────────────┐    │
 │  │ 1. Riassembla multi-pacchetti    │    │
 │  │ 2. Valida header (0xAA)          │    │
 │  │ 3. Estrai serviceId              │    │
 │  │ 4. Deserializza Protobuf         │    │
 │  │ 5. Dispatcha al handler          │    │
 │  └──────────────────────────────────┘    │
```

### 4.4 Creazione DataPackage (BleG2CmdProto)

La classe `BleG2CmdProto` espone metodi factory per ogni tipo di DataPackage:

```
BleG2CmdProtoExt:
  _createDashboardDataPackage()
  _createNotificationDataPackage()
  _createNavigationDataPackage()
  _createTelepromptDataPackage()
  _createTranscribeDataPackage()
  _createConverseDataPackage()
  _createEvenAiDataPackage()
  _createHealthDataPackage()
  _createRingDataPackage()
  _createQuickListDataPackage()
  _createGlassesCaseDataPackage()
  _createDevCfgDataPackage()
  _createG2SettingDataPackage()
  _createEvenHubDataPackage()
  _createOnboardingDataPackage()
  _createFileTransmitDataPackage()
  _createLoggerDataPackage()
  _createMenuDataPackage()
  _createModuleConfigureDataPackage()
  _createSyncInfoDataPackage()
```

Ogni DataPackage ha un metodo `fromBuffer()` per la deserializzazione dalla risposta BLE.

### 4.5 Comandi Device Settings

```
BleG2CmdProtoDeviceSettingsExt:
  connectRing()              # Connette l'anello R1 via occhiali
  startPair()                # Avvia pairing BLE
  unpair()                   # Rimuovi pairing
  disconnect()               # Disconnetti
  createTimeSyncCommand()    # Sincronizza orologio
  sendHeartbeat()            # Keep-alive
  quickRestart()             # Riavvio rapido occhiali
  restoreFactory()           # Reset di fabbrica
  selectPipeChannel()        # Seleziona canale di comunicazione
  sendFile()                 # Invia file agli occhiali
  receiveFile()              # Ricevi file dagli occhiali

BleG2CmdProtoRingExt:
  openRingBroadcast()        # Apri broadcast ring per discovery
  switchRingHand()           # Cambia mano (sinistra/destra)
```

### 4.6 Protocollo File Transfer

```
Invio (App → Occhiali):
  EVEN_FILE_SERVICE_CMD_SEND_START          # Inizio trasferimento
  EVEN_FILE_SERVICE_CMD_SEND_DATA           # Blocco dati
  EVEN_FILE_SERVICE_CMD_SEND_RESULT_CHECK   # Verifica risultato

Export (Occhiali → App):
  EVEN_FILE_SERVICE_CMD_EXPORT_START        # Richiedi export
  EVEN_FILE_SERVICE_CMD_EXPORT_DATA         # Blocco dati export
  EVEN_FILE_SERVICE_CMD_EXPORT_RESULT_CHECK # Verifica risultato export

Codici di risposta:
  EVEN_FILE_SERVICE_RSP_SUCCESS             # Successo
  EVEN_FILE_SERVICE_RSP_FAIL                # Fallimento generico
  EVEN_FILE_SERVICE_RSP_DATA_CRC_ERR        # Errore CRC dati
  EVEN_FILE_SERVICE_RSP_FLASH_WRITE_ERR     # Errore scrittura flash
  EVEN_FILE_SERVICE_RSP_NO_RESOURCES        # Risorse insufficienti
  EVEN_FILE_SERVICE_RSP_TIMEOUT             # Timeout
  EVEN_FILE_SERVICE_RSP_START_ERR           # Errore di avvio
  EVEN_FILE_SERVICE_RSP_RESULT_CHECK_FAIL   # Verifica fallita
```

### 4.7 Protocollo OTA

```
OTA Transmit (firmware update):
  OTA_TRANSMIT_START                   # Avvio aggiornamento
  OTA_TRANSMIT_INFORMATION             # Info firmware
  OTA_TRANSMIT_FILE                    # Trasferimento file
  OTA_TRANSMIT_RESULT_CHECK            # Verifica risultato
  OTA_TRANSMIT_NOTIFY                  # Notifica progresso

Risposte OTA:
  OTA_RECV_RSP_SUCCESS                 # Successo
  OTA_RECV_RSP_FAIL                    # Fallimento
  OTA_RECV_RSP_HEADER_ERR              # Errore header
  OTA_RECV_RSP_CRC_ERR                 # Errore CRC
  OTA_RECV_RSP_PATH_ERR               # Errore percorso
  OTA_RECV_RSP_FLASH_WRITE_ERR        # Errore scrittura flash
  OTA_RECV_RSP_NO_RESOURCES           # Risorse insufficienti
  OTA_RECV_RSP_TIMEOUT                # Timeout
  OTA_RECV_RSP_CHECK_FAIL             # Verifica fallita
```

---

## 5. Protocollo BLE G1 (Legacy)

Gli occhiali G1 usano un protocollo più semplice basato su Nordic UART Service (NUS):

```
Classi principali:
  BleG1Service                  # Servizio BLE G1
  BleG1CmdService               # Servizio comandi
  BleG1CmdProto                 # Protocollo comandi
  BleG1Cmd                      # Enum comandi
  BleG1CmdResult                # Risultato comando

Invio dati:
  BleG1CmdServicePublicExt|sendBothData     # Invia a entrambe le lenti
  BleG1CmdServicePrivateExt|_sendData       # Invio interno
  BleG1CmdServicePublicExt|clearSendResults # Pulisci risultati

Supporto OTA:
  McuOtaUpgrade (mixin)         # Aggiornamento MCU via MCU Manager
  EvenDeviceReconnectMixin      # Riconnessione dopo DFU
```

Il G1 non usa Protobuf ma un formato binario più semplice con comandi diretti alle lenti sinistra/destra.

---

## 6. Protocollo BLE Ring R1

### 6.1 Architettura

```
Classi principali:
  BleRing1Service               # Servizio BLE ring
  BleRing1CmdService            # Servizio comandi (con file service mixin)
  BleRing1CmdProto              # Protocollo comandi
  BleRing1Cmd                   # Comandi principali
  BleRing1SubCmd                # Sotto-comandi
  BleRing1CmdResponse           # Risposta comandi

UUID BLE (0x2760 gruppo 74xx):
  00002760-08C2-11E1-9073-0E8AC72E7401  # TX (write)
  00002760-08C2-11E1-9073-0E8AC72E7402  # RX (read)
  00002760-08C2-11E1-9073-0E8AC72E7450  # Notify
```

### 6.2 Comandi Ring

```
BleRing1CmdPublicExt:
  sendCmd()                      # Invio comando generico
  cleanCmdQueue()                # Pulisci coda comandi

BleRing1CmdPrivateExt:
  _handleCmdResponse()           # Gestione risposte
  _processCmd()                  # Processamento comandi
  _handleMultiPacket()           # Gestione multi-pacchetto

BleRing1CmdSettingsStatusExt:
  getSystemSettingsStatus()      # Leggi impostazioni sistema
  setSystemSettingsStatus()      # Scrivi impostazioni sistema
  getHealthSettingsStatus()      # Leggi impostazioni salute

BleRing1CmdHealthExt:
  ackNotifyData()                # ACK dati salute notificati

BleRing1CmdWearStatusExt:
  getWearStatus()                # Stato indossamento (su/giù)

BleRing1CmdGoMoreExt:
  getAlgoKeyStatus()             # Stato chiave algoritmo GoMore
  setAlgoKey()                   # Imposta chiave algoritmo GoMore

BleRing1CmdOldExt:
  unpair()                       # Disaccoppia ring (legacy)
```

### 6.3 Modelli Dati Ring

```
Sistema:
  BleRing1SystemInfo              # Info sistema ring
  BleRing1SystemSettingsStatus    # Stato impostazioni
  BleRing1SystemNvRecover         # Recovery dati non-volatili
  BleRing1SystemDeviceSn          # Serial number
  BleRing1SystemPackageAck        # ACK pacchetti
  BleRing1SystemUserInfo          # Info utente
  BleRing1SystemWearStatus        # Stato indossamento

Salute:
  BleRing1HealthDailyFactory      # Factory dati giornalieri
  BleRing1HealthCommonDaily       # Dati giornalieri comuni
  BleRing1HealthHourItem          # Dati orari
  BleRing1HealthActivityAllDay    # Attività giornaliera (passi, calorie)
  BleRing1HealthSleep             # Dati sonno
  BleRing1HealthSleepStageType    # Tipi stadi sonno (deep, light, REM)
  BleRing1HealthPointState        # Stato punti salute
  BleRing1HealthSettingsStatus    # Impostazioni salute

File:
  BleRing1FileModel               # Modello file
  BleRing1FileRsp                 # Risposta file
  BleRing1FileExportCmd           # Comando export file
  BleRing1FileOriginalData        # Dati raw file
  BleRing1Transfer                # Trasferimento file

Stato:
  BleRing1StatusAck               # ACK stato
  BleRing1StatusMethod            # Metodo stato
  BleRing1ChargeStatus            # Stato carica
  BleRing1Model                   # Modello ring
```

### 6.4 Ring Relay via Occhiali

I dati del ring possono transitare attraverso gli occhiali G2:

```
Service ID: UX_RING_DATA_RELAY_ID     # Relay dati ring
Service ID: UX_RING_ROW_DATA_ID       # Dati raw ring
Comando OS: RING_GLASSES              # Ring ↔ Glasses relay
```

---

## 7. Glasses OS - Comandi e Risposte

### 7.1 Comandi App → Occhiali

| Comando | Descrizione |
|---------|-------------|
| `APP_REQUEST_START_UP` | Avvio app sugli occhiali |
| `APP_REQUEST_EXIT` | Chiudi app sugli occhiali |
| `APP_REQUEST_HEARTBEAT_PACKET` | Keep-alive |
| `APP_REQUEST_CREATE_STARTUP_PAGE_PACKET` | Crea pagina iniziale |
| `APP_REQUEST_CREATE_PAGE_SUCCESS` | Conferma creazione pagina |
| `APP_REQUEST_REBUILD_PAGE_PACKET` | Ricostruisci pagina |
| `APP_REQUEST_REBUILD_PAGE_SUCCESS` | Conferma ricostruzione |
| `APP_REQUEST_REBUILD_PAGE_FAILD` | Fallimento ricostruzione |
| `APP_REQUEST_SHUTDOWN_PAGE_PACKET` | Chiudi pagina |
| `APP_REQUEST_AUDIO_CTR_PACKET` | Controllo audio |
| `APP_REQUEST_AUDIO_CTR_SUCCESS` | Conferma controllo audio |
| `APP_REQUEST_AUDIO_CTR_FAILED` | Fallimento controllo audio |
| `APP_REQUEST_NAVIGATION_COMPLETE` | Navigazione completata |
| `APP_REQUEST_SYNC_INFO` | Sincronizza informazioni |
| `APP_REQUEST_RECALCULATING_LOCATION_START` | Ricalcolo posizione |
| `APP_REQUEST_CREATE_OVERSIZE_RESPONSE_CONTAINER` | Container risposta oversize |
| `APP_REQUEST_CREATE_OUTOFMEMORY_CONTAINER` | Container out of memory |
| `APP_REQUEST_CREATE_INVAILD_CONTAINER` | Container invalido |
| `APP_SEND_HEARTBEAT_CMD` | Heartbeat |
| `APP_SEND_MENU_INFO` | Info menu |
| `APP_SEND_BASIC_INFO` | Info di base |
| `APP_SEND_ERROR_INFO_MSG` | Messaggio errore |
| `APP_SEND_MAX_MAP_FILE` | File mappa massimo |
| `APP_SNED_MINI_MAP_FILE` | File mini-mappa (nota: typo nel codice) |
| `APP_Send_Universe_Setting` | Impostazioni universali |
| `APP_Send_Gesture_Control` | Controllo gesti |
| `APP_Send_Gesture_Control_List` | Lista controlli gesti |
| `APP_Send_Dominant_Hand` | Mano dominante |
| `APP_RESPONSE_LOCATION_LIST` | Risposta lista posizioni |
| `APP_RESPONSE_LOCATION_NONE` | Nessuna posizione |

### 7.2 Risposte/Notifiche Occhiali → App

| Comando | Descrizione |
|---------|-------------|
| `OS_RESPONSE_HEARTBEAT_PACKET` | Risposta heartbeat |
| `OS_RESPONSE_TEXT_DATA_PACKET` | Dati testo |
| `OS_RESPONSE_IMAGE_RAW_DATA_PACKET` | Dati immagine raw |
| `OS_RESPONSE_MENU_INFO` | Info menu |
| `OS_RESPONSE_SHUTDOWN_PAGE_PACKET` | Pagina chiusa |
| `OS_RESPONSE_CREATE_STARTUP_PAGE_PACKET` | Pagina iniziale creata |
| `OS_RESPONSE_REBUILD_PAGE_PACKET` | Pagina ricostruita |
| `OS_RESPONSE_AUDIO_CTR_PACKET` | Risposta controllo audio |
| `OS_NOTIFY_EXIT` | Notifica uscita |
| `OS_NOTIFY_COMPASS_CALIBRATE_STRAT` | Inizio calibrazione bussola |
| `OS_NOTIFY_COMPASS_CALIBRATE_COMPLETE` | Fine calibrazione bussola |
| `OS_NOTIFY_COMPASS_CHANGED` | Cambio bussola |
| `OS_NOTIFY_SYNC_INFO4` | Sincronizzazione info |
| `OS_NOTIFY_LOCATION_SELECTED` | Posizione selezionata |
| `OS_NOTIFY_REVIEW_CHANGED` | Review cambiata |
| `OS_NOTIFY_MENU_STARTUP_REQUEST_LOCATION_LIST` | Richiesta lista posizioni da menu |

### 7.3 Comandi OTA/Upgrade (subset)

| Comando | Descrizione |
|---------|-------------|
| `APP_REQUEST_UPGRADE_HEARTBEAT_PACKET_SUCCESS` | Heartbeat upgrade OK |
| `APP_REQUEST_UPGRADE_TEXT_DATA_SUCCESS/FAILED` | Dati testo upgrade |
| `APP_REQUEST_UPGRADE_IMAGE_RAW_DATA_SUCCESS/FAILED` | Immagine upgrade |
| `APP_REQUEST_UPGRADE_SHUTDOWN_SUCCESS/FAILED` | Shutdown upgrade |

### 7.4 Configurazione Device

| Setting | Descrizione |
|---------|-------------|
| `DEVICE_WAKEUP_ANGLE` | Angolo di attivazione HeadUp |
| `DEVICE_BRIGHTNESS` | Luminosità display |
| `DEVICE_DISPLAY_MODE` | Modalità display |
| `DEVICE_ANTI_SHAKE_ENABLE` | Anti-vibrazione |
| `DEVICE_WORK_MODE` | Modalità lavoro |
| `DEVICE_BLE_MAC` | Indirizzo MAC BLE |
| `DEVICE_GLASSES_SN` | Serial number occhiali |
| `DEVICE_DEVICE_SN` | Serial number dispositivo |
| `DEVICE_SEND_LOGGER_DATA` | Invio dati log |

---

## 8. Pipeline Audio e ASR

### 8.1 Pipeline Audio

```
Microfono/BT Audio → PCM Capture
         │
         ▼
   ┌──────────┐
   │   AGC    │ ← EvenAGC (Automatic Gain Control)
   └────┬─────┘
        │
        ▼
   ┌──────────────────┐
   │ Noise Reduction  │ ← noise_reduction.pb.dart (ONNX model)
   └────┬─────────────┘
        │
        ▼
   ┌──────────────────┐
   │ Speech Enhance   │ ← speech_enhance.pb.dart (BERT-based model)
   │ (speechEnhance)  │   speechEnhanceLoadModel, speechEnhanceProcess
   └────┬─────────────┘
        │
        ▼
   ┌──────────┐        ┌──────────────┐
   │ VAD      │───────►│ ASR Engine   │
   │ (Silero) │        │ (selezionato)│
   └──────────┘        └──────────────┘
```

### 8.2 VAD (Voice Activity Detection)

- **Modello:** Silero VAD (`/vad_model.onnx`)
- **Configurazione:** `SileroVadModelConfig`
- **Eventi:** `vadStart`, `VAD_END`, `VAD_TIMEOUT`
- **Feedback:** `sendVadEndFeedBack` → invia a occhiali quando la voce finisce
- **Timeout:** Configurabile, con `"wait vadEnd timeout"` se troppo lento

### 8.3 ASR (Automatic Speech Recognition)

Tre backend selezionabili:

| Backend | Tipo | Classe | Dettagli |
|---------|------|--------|----------|
| **Azure Cognitive Services** | Cloud | `AzureTranscribeRecognizer`, `AzureTranscribeProcessor` | Config: `AzureTranscribeConfiguration.pcm`, SDK nativo |
| **Soniox** | Cloud (WebSocket) | `SonioxTranscribeRecognizerV2`, `SonioxWebsocketManager` | Streaming real-time, timeout 2 ore, segmentazione |
| **Sherpa-ONNX** | On-device | `SherpaOnnxOnlineStreamAcceptWaveform` | Nessuna connettività necessaria, VAD integrato |

Configurazione: `asr_sconf` API endpoint, `AzureTranscribeConfiguration`, `SonioxConfigurationBase`
Token: `sonioxFullPushKey`, `asr_config_manager.dart`

### 8.4 Codec LC3

- **Libreria:** `flutter_ezw_lc3` → `liblc3.so`
- **Scopo:** Codec Bluetooth LE Audio per streaming audio a/da occhiali
- **API:** `Lc3Codec::Decode`, `lc3_decode`, `lc3_setup_decoder`
- **Config:** `Lc3DecoderConfig(dtUs: ...)` con time slot configurabile

### 8.5 Speaker Diarization

Sherpa-ONNX supporta anche la diarizzazione degli speaker:
- `SherpaOnnxOfflineSpeakerDiarization`
- `SherpaOnnxSpeakerEmbeddingExtractorCreateStream`
- `SherpaOnnxSpeakerEmbeddingExtractorComputeEmbedding`
- `SherpaOnnxSpeakerEmbeddingManagerFreeSearch`

---

## 9. Even AI Assistant

### 9.1 Macchina a Stati

```
                    ┌─────────┐
           ┌───────│  IDLE   │◄──────────────────┐
           │       └────┬────┘                    │
           │            │ gesture/angolo           │
           │            ▼                          │
           │    ┌──────────────┐                   │
           │    │  WAKEUP      │                   │
           │    │  (wakeup_    │                   │
           │    │   state)     │                   │
           │    └──────┬───────┘                   │
           │           │ wakeup response           │
           │           ▼                           │
           │    ┌──────────────┐                   │
           │    │    ASR       │                   │
           │    │  (asr_state) │ ←── VAD detection │
           │    └──────┬───────┘                   │
           │           │ transcript ready          │
           │           ▼                           │
           │    ┌──────────────┐                   │
           │    │     AI       │                   │
           │    │  (ai_state)  │ ←── Cloud/LLaMA   │
           │    └──────┬───────┘                   │
           │           │ response ready            │
           │           ▼                           │
           │    ┌──────────────────┐               │
           │    │  CMD DISPATCH    │               │
           │    │ (cmd_dispatch_   │               │
           │    │  state)          │               │
           │    └──────┬───────────┘               │
           │           │ dispatch complete          │
           │           ▼                           │
           │    ┌──────────────┐                   │
           └────│    STAY      │───────────────────┘
                │ (stay_state) │   timeout/exit
                └──────────────┘
```

### 9.2 Attivazione

- **HeadUp gesture:** `DEVICE_WAKEUP_ANGLE` - inclinazione testa verso l'alto
- **Wake word:** `EVEN_AI_WAKE_UP`
- **Exit:** `EVEN_AI_EXIT`
- **Configurazione:** `EvenAIConfig`, `HeadupState`
- **Angolo:** `wakeupAngle` configurabile nelle impostazioni

### 9.3 Skills (Comandi AI)

```
ProtoAiExt:
  sendSkillConverse           # Avvia conversazione
  sendSkillBrightness         # Controlla luminosità
  sendSkillBrightnessAuto     # Luminosità automatica
  sendSkillNotification       # Leggi notifiche
  sendAsr                     # Speech recognition
  sendAnalyzeLoading          # Analisi in corso
  sendEvenHeartbeat           # Keep-alive AI
  sendWakeupResp              # Risposta wakeup
  sendIllegalState            # Stato errore
  sendVadEndFeedBack          # Fine voce
```

### 9.4 Notifiche OS per AI

```
os_even_ai_notification_cleared    # Notifiche pulite
os_even_ai_auto_brightness_off     # Luminosità auto disattivata
os_even_ai_save_to_quicklist       # Salva in quicklist
```

### 9.5 AI Backend

- **Cloud:** `/v2/g/jarvis/chat` - API REST per chat AI
- **On-device:** LLaMA inference via `libeven.so` (30 MB)
- **Command dispatch:** `AiCommand{intent: ...}` con `ai_bt_cmd_manager`

---

## 10. Navigazione

### 10.1 Stack Tecnologico

- **Maps:** Mapbox Maps SDK (`libmapbox-maps.so`, `libmapbox-common.so`)
- **Navigation:** Mapbox Navigation SDK (`libnavigator-android.so`)
- **Platform Channel:** Pigeon (`even_navigate`)
- **Display su occhiali:** Mini-mappa e overview map inviate come immagini

### 10.2 API Pigeon (Flutter ↔ Native)

```
NavigationApi (Flutter → Native):
  captureOverviewMap()           # Cattura mappa panoramica
  captureMiniMap()               # Cattura mini-mappa
  setNavigateVoiceOnOff()        # Voce navigazione on/off

NavigateFlutterApi (Native → Flutter):
  clearPreviewRoute()            # Pulisci anteprima route
```

### 10.3 Flusso Navigazione

```
1. Ricerca destinazione (autocomplete: /g/navigate_auto_complete)
2. Calcolo route (Mapbox Navigation SDK)
3. Avvio navigazione → APP_REQUEST_START_UP + sendNavigationStart
4. Loop continuo:
   a. captureOverviewMap → _sendNavigationOverviewMap (come immagine)
   b. captureMiniMap → _sendNavigationMiniMap (come immagine)
   c. sendNavigationHeartbeat (keep-alive)
   d. Ricalcolo se necessario (APP_REQUEST_RECALCULATING_LOCATION_START)
5. Arrivo → sendNavigationArrive + APP_REQUEST_NAVIGATION_COMPLETE
```

### 10.4 Dati Mappa

```
MapRawData                       # Dati raw mappa
miniMapData / maxMapData         # Dimensioni mappa
processMiniMapData()             # Elabora mini-mappa
processOverviewMapData()         # Elabora overview
_transformMapData()              # Trasforma per display occhiali
_isMiniMapDataEqual()            # Check se mappa è cambiata
APP_SNED_MINI_MAP_FILE           # Invio file mini-mappa (typo nel codice)
APP_SEND_MAX_MAP_FILE            # Invio file mappa grande
```

### 10.5 Bussola

```
OS_NOTIFY_COMPASS_CALIBRATE_STRAT     # Inizio calibrazione
OS_NOTIFY_COMPASS_CALIBRATE_COMPLETE  # Fine calibrazione
OS_NOTIFY_COMPASS_CHANGED             # Cambio direzione
```

---

## 11. Traduzione e Trascrizione

### 11.1 Flusso Traduzione

```
Audio → AGC → Noise Reduction → Speech Enhancement
  │
  ▼
VAD (Silero) → ASR (Azure/Soniox/Sherpa)
  │
  ▼
Language Detection (flutter_langdetect)
  │
  ▼
Translation → Display su occhiali (TranslateDataPackage)
  │
  ▼
Cloud storage (/v2/g/translate_create, translate_update)
  │
  ▼
AI Summary (/v2/g/translate_ai_summary)
```

### 11.2 Configurazioni

```
even_ai_translate              # AI in modalità traduzione
even_ai_teleprompt             # AI in modalità teleprompter
even_ai_conversate             # AI in modalità conversazione
```

### 11.3 Soniox Specifiche

- **Connessione:** WebSocket streaming
- **Timeout sessione:** 2 ore (`"Soniox translation session timeout after 2 hours"`)
- **Qualità:** `soniox_quality_statistics.dart`
- **Segmentazione:** `SonioxSegmentationHelper`
- **Config:** `SonioxConfigurationBase`, `sonioxFullPushKey`

---

## 12. Teleprompter

### 12.1 Modalità

| Modalità | Descrizione |
|----------|-------------|
| **Auto** | Scorrimento automatico del testo |
| **Manual** | Controllo manuale dello scorrimento |
| **AI** | AI controlla il ritmo basandosi sulla voce |

### 12.2 Funzionalità

- **Speed control:** Velocità di scorrimento configurabile
- **Auto-resume:** Riprende automaticamente dopo pausa
- **Match rating:** Sistema di valutazione corrispondenza voce-testo
- **Volume helper:** Guida audio per il ritmo
- **AI sync events:** Sincronizzazione con AI per ritmo del contenuto
- **Layout configuration:** Sistema di layout per diversi tipi di contenuto

---

## 13. Health Tracking (Ring R1)

### 13.1 Metriche Monitorate

| Metrica | Classe | Descrizione |
|---------|--------|-------------|
| **Heart Rate** | `HeartRateController` | Frequenza cardiaca continua |
| **SpO2** | - | Saturazione ossigeno nel sangue |
| **Sleep** | `BleRing1HealthSleep` | Sonno con stadi (deep, light, REM) |
| **Steps** | - | Conteggio passi giornaliero |
| **Calories** | `CaloriesPage` | Calorie bruciate |
| **HRV** | - | Variabilità frequenza cardiaca |
| **Temperature** | - | Temperatura cutanea |
| **Productivity** | `health_productivity_debug` | Score produttività (algoritmo custom) |

### 13.2 Stadi del Sonno

```
BleRing1SleepStageType:
  - Deep sleep    (sonno profondo)
  - Light sleep   (sonno leggero)
  - REM           (sonno REM)

BleRing1SleepType     # Tipo generico sonno
SleepStageSpan        # Span temporale di uno stadio
```

### 13.3 Algoritmo GoMore

```
BleRing1CmdGoMoreExt:
  getAlgoKeyStatus()    # Verifica stato chiave algoritmo
  setAlgoKey()          # Imposta chiave algoritmo

API: /v2/g/health/get_pkey   # Ottieni chiave algoritmo GoMore dal server
```

GoMore fornisce metriche avanzate basate sui dati raw del ring.

### 13.4 Sincronizzazione Dati

```
Flusso:
  Ring R1 → BLE → App (BleRing1HealthDailyFactory) → Cloud (/v2/g/health/push)

Query:
  /v2/g/health/get_latest_data     # Ultimi dati
  /v2/g/health/query_window        # Finestra temporale
  /v2/g/health/batch_query_window  # Query batch
  /v2/g/health/export              # Export completo

Export file dal ring:
  BleRing1FileServiceMixin          # Servizio file ring
  BleRing1FileExportCmd             # Comando export
```

### 13.5 Highlights Salute

Messaggi personalizzati basati sui dati:
```
"HRV dropped below trend; breathe slower today and reduce overall stress load"
"spo2_low_highlight_content_a"
"hrv_low_highlight_content_c"
"calorie_low_highlight_content_c"
"steps_low_highlight_content_c"
```

---

## 14. Dashboard

### 14.1 Widget Dashboard

| Widget | Descrizione | API |
|--------|-------------|-----|
| **Stocks** | Ticker borsa, grafici intraday, preferiti | `/v2/g/stock_tickers`, `/v2/g/stock_intraday` |
| **Weather** | Stato meteo | `WeatherStatus` |
| **Calendar** | Integrazione calendario OS | `DeviceCalendarPlugin`, `calendarFullAccess` |
| **News** | Notizie per categoria/fonte | `/v2/g/news_list`, `/v2/g/news_categories` |
| **Health** | HR, SpO2, passi, calorie | Via Ring R1 BLE |
| **Electricity** | Livello batteria occhiali/ring | Via BLE |

### 14.2 Auto-close

I widget dashboard hanno un timer di auto-chiusura configurabile.

### 14.3 Dashboard → Occhiali

I dati dashboard vengono inviati come `DashboardDataPackage` via BLE con service ID `UI_BACKGROUND_DASHBOARD_APP_ID`.

---

## 15. API Backend

### 15.1 Server

| URL | Scopo |
|-----|-------|
| `https://api2.evenreal.co` | API produzione principale |
| `https://api2.ev3n.co` | API alternativa/legacy |
| `https://cdn.evenreal.co` | CDN assets |
| `https://cdn2.evenreal.co` | CDN documenti privacy |
| `https://pre-g2.evenreal.co` | Pre-produzione/staging G2 |
| `https://evenapp.evenrealities.com` | Web app (privacy, termini) |
| `http://192.168.2.113:8888` | **Server di sviluppo (hardcoded!)** |

### 15.2 Endpoint API Completi (tutti sotto `/v2/g/`)

#### Autenticazione e Utenti
| Endpoint | Metodo | Descrizione |
|----------|--------|-------------|
| `/v2/g/login` | POST | Login utente |
| `/v2/g/register` | POST | Registrazione |
| `/v2/g/check_reg` | - | Verifica stato registrazione |
| `/v2/g/send_code` | POST | Invio codice verifica |
| `/v2/g/pre_check_code` | - | Pre-verifica codice |
| `/v2/g/check_password` | POST | Verifica password |
| `/v2/g/reset_passwd` | POST | Reset password |
| `/v2/g/account_logout` | POST | Logout |
| `/v2/g/account_del` | POST | Elimina account |
| `/v2/g/user_info` | GET | Profilo utente |
| `/v2/g/set_profile` | POST | Aggiorna profilo |
| `/v2/g/upload_avatar` | POST | Upload avatar |
| `/v2/g/user_settings` | GET/POST | Impostazioni utente |
| `/v2/g/get_user_prefs` | GET | Preferenze utente |
| `/v2/g/set_user_prefs` | POST | Imposta preferenze |
| `/v2/g/update_set` | POST | Aggiorna impostazioni |
| `/v2/g/get_privacy_urls` | GET | URL privacy policy |

#### Gestione Dispositivi
| Endpoint | Descrizione |
|----------|-------------|
| `/v2/g/bind_device` | Associa dispositivo all'account |
| `/v2/g/unbind_device` | Disassocia dispositivo |
| `/v2/g/unbind_terminal` | Disassocia terminale |
| `/v2/g/check_bind` | Verifica stato binding |
| `/v2/g/list_devices` | Lista dispositivi associati |
| `/v2/g/set_device_remark` | Imposta nickname dispositivo |
| `/v2/g/update_glasses_settings` | Aggiorna configurazione occhiali |
| `/v2/g/update_ios_app_list` | Sync lista app notifiche iOS |
| `/v2/g/func_conf` | Configurazione funzionalità |
| `/v2/g/get_nv` / `/v2/g/get_nv?sn=` | Dati NV ring (con serial number) |
| `/v2/g/upload_nv` | Upload dati NV ring |

#### Firmware
| Endpoint | Descrizione |
|----------|-------------|
| `/v2/g/check_app` | Verifica aggiornamenti app |
| `/v2/g/check_firmware` | Verifica versione firmware |
| `/v2/g/check_latest_firmware` | Ultimo firmware disponibile |

#### Salute
| Endpoint | Descrizione |
|----------|-------------|
| `/v2/g/health/push` | Push dati salute al cloud |
| `/v2/g/health/export` | Export dati salute |
| `/v2/g/health/get_latest_data` | Ultimi dati salute |
| `/v2/g/health/get_info` | Info salute |
| `/v2/g/health/update_info` | Aggiorna info salute |
| `/v2/g/health/query_window` | Query finestra temporale |
| `/v2/g/health/batch_query_window` | Query batch finestre |
| `/v2/g/health/get_pkey` | Chiave algoritmo GoMore |

#### Traduzione
| Endpoint | Descrizione |
|----------|-------------|
| `/v2/g/translate_create` | Crea sessione traduzione |
| `/v2/g/translate_get` | Query sessioni traduzione |
| `/v2/g/translate_update` | Aggiorna record traduzione |
| `/v2/g/translate_delete` | Elimina record traduzione |
| `/v2/g/translate_ai_summary` | Summary AI della traduzione |
| `/v2/g/asr_sconf` | Configurazione ASR |

#### AI e Conversazione
| Endpoint | Descrizione |
|----------|-------------|
| `/v2/g/jarvis/chat` | Chat AI (endpoint principale) |
| `/v2/g/jarvis/conversate/ws` | WebSocket conversazione |
| `/v2/g/jarvis/conversate/list` | Lista conversazioni |
| `/v2/g/jarvis/conversate/detail` | Dettaglio conversazione |
| `/v2/g/jarvis/conversate/messages` | Messaggi conversazione |
| `/v2/g/jarvis/conversate/update` | Aggiorna conversazione |
| `/v2/g/jarvis/conversate/finish` | Termina conversazione |
| `/v2/g/jarvis/conversate/remove` | Rimuovi conversazione |
| `/v2/g/jarvis/message/list` | Lista messaggi |
| `/v2/g/jarvis/message/sentiment` | Analisi sentiment |
| `/v2/g/jarvis/session/action/delete` | Elimina azione sessione |

#### Contenuti e Dashboard
| Endpoint | Descrizione |
|----------|-------------|
| `/v2/g/stock_tickers` | Dati ticker borsa |
| `/v2/g/stock_intraday` | Dati intraday |
| `/v2/g/stock_favorite_list` | Lista preferiti borsa |
| `/v2/g/stock_favorite_create` | Aggiungi preferito |
| `/v2/g/stock_favorite_update` | Aggiorna preferito |
| `/v2/g/stock_favorite_del` | Elimina preferito |
| `/v2/g/news_list` | Articoli news |
| `/v2/g/news_categories` | Categorie news |
| `/v2/g/news_sources` | Fonti news |
| `/v2/g/news_favorites_settings` | Impostazioni preferiti news |
| `/v2/g/news_favorites_settings_save` | Salva preferiti news |

#### Inbox
| Endpoint | Descrizione |
|----------|-------------|
| `/v2/g/inbox/list` | Lista messaggi inbox |
| `/v2/g/inbox/delete` | Elimina messaggio |
| `/v2/g/inbox/mark_as_read` | Segna come letto |
| `/v2/g/inbox/unread_count` | Conteggio non letti |

#### Altro
| Endpoint | Descrizione |
|----------|-------------|
| `/v2/g/set_on_boarded` | Segna onboarding completato |
| `/v2/g/filelogs/feedback` | Invia feedback con log |
| `/g/navigate_auto_complete` | Autocomplete navigazione |

### 15.3 Autenticazione API

```
Header: API-Auth           # Token di autenticazione
Header: API-LoginExpired    # Gestione sessione scaduta
Firma: EvenSignature        # Firma custom delle request (signature_util.dart)
Campo: api_key / apiKey     # Chiave API
Storage: getLoginToken      # Token persistito localmente
```

---

## 16. Sicurezza e Crittografia

### 16.1 Crittografia

```
Libreria: pointycastle (Dart)
  - AES (AESEngine, encryptBlock)
  - HMAC (HMac, _HmacSink)
  - HKDF (HKDFKeyDerivator)
  - RSA
  - ECC

File chiave:
  package:even_core/network/utils/signature_util.dart    # Firma request API
  package:even_core/extension/encrypt_ext.dart            # Estensioni crittografiche
  package:flutter_ezw_utils/encrypt/encrypt.dart          # Utility crittografiche
  package:hive/src/crypto/aes_cbc_pkcs7.dart             # AES-CBC per Hive storage
```

### 16.2 Firma Request (EvenSignature)

Le request API vengono firmate con `EvenSignature` usando probabilmente HMAC:
- Il meccanismo è implementato in `signature_util.dart`
- Usa HMAC + HKDF per derivare chiavi di firma
- Ogni request include la firma nell'header

---

## 17. OTA e Firmware Updates

### 17.1 Metodi di Aggiornamento

| Metodo | Dispositivo | Libreria |
|--------|-------------|----------|
| **Nordic DFU** | Ring R1, G1 | `nordic_dfu` |
| **MCU Manager** | G1, componenti MCU | `mcumgr_flutter` |
| **Custom G2 OTA** | G2 occhiali | `BleG2OtaUpgradeMixin` |
| **Ring Bootloader/SD** | Ring R1 | `DeviceRingBsDsdOta` |

### 17.2 Flusso OTA G2

```
1. Check firmware: /v2/g/check_firmware, /v2/g/check_latest_firmware
2. Download: downloadG2Firmware()
3. Validazione: BleG2OtaHeader.fromBytes() + magic bytes + CRC
4. Trasferimento:
   OTA_TRANSMIT_START → OTA_TRANSMIT_INFORMATION → OTA_TRANSMIT_FILE → OTA_TRANSMIT_RESULT_CHECK
5. Progresso: OTA_TRANSMIT_NOTIFY
6. Riavvio: quickRestart()
```

### 17.3 DFU Ring R1

```
Flusso:
1. Verifica firmware ring
2. Avvio DFU: "Dfu process starting, originalAddress: ..."
3. Nordic DFU protocol (dev.steenbakker.nordic_dfu)
4. Multi-step: SD (SoftDevice) + App components
5. Bootloader update se necessario
6. Verifica: DeviceRingDfuErrorOta (gestione errori specifici)
```

### 17.4 MCU Manager

```
mcumgr_flutter:
  - McuMgrLogger
  - ProtoFirmwareUpgradeConfiguration_FirmwareUpgradeMode
  - ProtoUpdateStateChanges_FirmwareUpgradeState
  - ProtoFirmwareUpgradeConfiguration_ImageUploadAlignment
  - McuOtaUpgrade (mixin per BleG1Service)

Manifest:
  mcu_manifest.dart             # Definizione manifest firmware
  mcu_service.dart              # Servizio MCU
  mcu_update.dart               # Logica aggiornamento
```

---

## 18. Osservazioni di Sicurezza

### Esposizioni trovate nel binary

1. **Server di sviluppo hardcoded:** `http://192.168.2.113:8888` - server locale di sviluppo presente nel build di produzione

2. **Path Jenkins CI:** `file:///Volumes/Acer_SSD/jenkins_data/workspace/APP/G2/Android-GooglePlay/` - percorso build system esposto

3. **Chiavi API:** Campi `api_key` / `apiKey` visibili nelle stringhe

4. **Token GoMore:** Gestione chiave algoritmo GoMore (`get_pkey`) via API non cifrata

5. **DFU insicuro:** Flag `enableUnsafeExperimentalButtonlessServiceInSecureDfu` - DFU buttonless sperimentale abilitato

6. **Buffer criptati:** `_isBufferEncrypted` e `ENCRYPTED_SIZE` suggeriscono che alcuni buffer sono criptati ma il flag è verificabile

### Protezione APK

- **360 Jiagu (加固):** Protegge il DEX Java con crittografia a runtime
- **Controllo integrità:** Jiagu verifica la firma APK via VM interpreter (`interpreter_wrap_int64_t`)
- **Limitazione:** La logica Flutter in `libapp.so` NON è protetta da Jiagu (solo il DEX è criptato)
- **Implicazione:** Tutta la logica dell'app, protocolli BLE, API endpoints e chiavi sono estraibili da `libapp.so` tramite semplice estrazione di stringhe

### Localizzazione

Lingue supportate: Inglese (primaria), Italiano, Spagnolo, Francese, Tedesco, Cinese Semplificato, Filippino/Tagalog.

---

## 19. Layer BLE Nativo Android (da DEX decompilato)

> **Sorgente:** `decrypted_dex/jadx_output/sources/com/fzfstudio/ezw_ble/` (classes3.dex)
> **Libreria:** `flutter_ezw_ble` - plugin Flutter Kotlin per comunicazione BLE
> **Package:** `com.fzfstudio.ezw_ble`

### 19.1 Architettura Generale

Il layer BLE nativo è implementato come libreria Flutter plugin (`flutter_ezw_ble_release`) scritta in Kotlin. Utilizza l'API Android Bluetooth LE standard e comunica con il layer Flutter tramite MethodChannel (comandi sincroni) e EventChannel (stream di eventi).

```
┌─────────────────────────────────────────────────────────┐
│                  Flutter (Dart)                          │
│                                                         │
│  MethodChannel("flutter_ezw_ble")  EventChannel(5 ch)  │
└───────────────┬────────────────────────┬────────────────┘
                │                        │
┌───────────────▼────────────────────────▼────────────────┐
│           FlutterEzwBlePlugin                           │
│  onMethodCall() → BleMC.from(method).handle()           │
│  onAttachedToEngine() → BleEC.registerEventChannel()    │
└───────────────┬────────────────────────┬────────────────┘
                │                        │
┌───────────────▼────────────────────────▼────────────────┐
│              BleManager (Singleton)                      │
│  init(), startScan(), connect(), sendCmd(), ...          │
│  BluetoothGattCallback, ScanCallback, BleStateListener  │
└─────────────────────────────────────────────────────────┘
```

### 19.2 BleManager - Singleton Principale

**Classe:** `com.fzfstudio.ezw_ble.ble.BleManager` (1143 linee Kotlin, ~1600 linee decompilate)
**Pattern:** Singleton via `BleManager.INSTANCE.getInstance()`

#### Campi Interni

| Campo | Tipo | Descrizione |
|-------|------|-------------|
| `instance` | `BleManager` (static) | Istanza singleton |
| `cccdDescriptor` | `UUID` (static) | CCCD UUID: `StubApp.getString2(11299)` → `00002902-0000-1000-8000-00805f9b34fb` |
| `connectedDevices` | `List<BleDevice>` (synchronized) | Dispositivi attualmente connessi |
| `scanResultTemp` | `List<BleDevice>` | Buffer temporaneo risultati scan |
| `waitingConnectDevices` | `List<BleConnectTemp>` (synchronized) | Coda dispositivi in attesa di connessione |
| `descriptorQueue` | `Queue<Pair<Integer, BluetoothGattDescriptor>>` | Coda CCCD descriptor da scrivere |
| `upgradeDevices` | `List<String>` (synchronized) | UUID dispositivi in modalità upgrade/DFU |
| `sendCmdQueue` | `ConcurrentLinkedQueue<BleCmd>` | Coda comandi BLE (thread-safe) |
| `disconnectingDevices` | `List<Pair<String, BleConnectState>>` (synchronized) | Dispositivi in fase di disconnessione |
| `preConnectedDevices` | `Set<String>` (synchronized) | UUID dispositivi pre-connessi (handshake Flutter) |
| `weakContext` | `WeakReference<Context>` | Contesto Android (weak reference) |
| `bluetoothManager` | `BluetoothManager` | System service Bluetooth |
| `bleStateListener` | `BleStateListener` | Listener stato Bluetooth |
| `bleConfigs` | `List<BleConfig>` | Configurazioni BLE (dal layer Flutter) |
| `bleState` | `int` | Stato BLE corrente (0=unknown, 4=off, 5=on) |
| `blePermission` | `boolean` | Permesso Bluetooth concesso |
| `bleLocation` | `boolean` | Permesso location concesso |
| `isScanning` | `boolean` | Scan in corso |
| `scanPureMode` | `boolean` | Modalità scan "pura" (UUID random) |
| `scanCallback` | `ScanCallback?` | Callback scan corrente |
| `scanSettings` | `ScanSettings` (lazy) | `ScanMode=2` (LOW_LATENCY) |
| `mainScope` | `CoroutineScope` | Scope coroutine per operazioni main thread |

#### Metodi Pubblici

| Metodo | Firma | Descrizione |
|--------|-------|-------------|
| `init()` | `(Context)` | Inizializza BluetoothManager, BleStateListener, mainScope |
| `initConfigs()` | `(List<BleConfig>)` | Imposta configurazioni BLE dal Flutter |
| `startScan()` | `(pureModel: Boolean = false)` | Avvia BLE scan con `ScanMode.LOW_LATENCY` |
| `stopScan()` | `(isStartScan: Boolean = false)` | Ferma scan BLE |
| `connect()` | `(belongConfig, uuid, name, sn, isWaitingDevice=false, afterUpgrade=false, retryWhenNoFoudDevice=true)` | Connessione dispositivo con retry e coda |
| `disconnect()` | `(uuid, removeBond=false)` | Disconnessione dispositivo |
| `setPreConnected()` | `(uuid)` | Segna dispositivo come pre-connesso |
| `setConnected()` | `(uuid)` | Conferma connessione dal Flutter → stato CONNECTED |
| `sendCmd()` | `(uuid, data: ByteArray, psType=0)` | Invia comando BLE **con coda** (aspetta risposta precedente) |
| `sendCmdNoWait()` | `(uuid, data: ByteArray, psType=0)` | Invia comando BLE **senza coda** (immediato) |
| `enterUpgradeState()` | `(uuid)` | Entra in modalità upgrade (DFU), blocca comandi non-DFU |
| `quiteUpgradeState()` | `(uuid)` | Esce da modalità upgrade → CONNECTED |
| `cleanConnectCache()` | `()` | Cancella coda connessioni in attesa |
| `reset()` | `()` | Reset completo: stop scan, disconnetti tutti, pulisci code |
| `release()` | `()` | Rilascio risorse: reset + unregister listener + cancel scope |
| `checkBluetoothPermission()` | `()` | Verifica permessi BLE/location, aggiorna stato |
| `findConnectedDevice()` | `(uuid) → BleDevice?` | Cerca dispositivo connesso per UUID |
| `getCurrentBleState()` | `() → Int` | Stato corrente: 6=no location, 3=no permission, else bleState |

#### Flusso di Connessione Dettagliato

```
1. connect() chiamato dal Flutter via BleMC.CONNECT_DEVICE
   ├── Verifica checkIsFunctionCanBeCalled() (BLE on + config presente)
   ├── Verifica UUID non vuoto → altrimenti EMPTY_UUID
   ├── Cerca BleConfig per belongConfig name → altrimenti NO_BLE_CONFIG_FOUND
   ├── Rimuove da preConnectedDevices
   ├── Se retryWhenNoFoudDevice e device.getName() == null:
   │   ├── Stato → CONNECTING
   │   ├── Avvia scan temporaneo
   │   └── Ritenta dopo delay via coroutine
   ├── Se device.getName() == null: → NO_DEVICE_FOUND
   ├── Verifica coda waitingConnectDevices:
   │   ├── Se >1 in coda: accoda e ritorna (CONNECTING)
   │   └── Se 1: procedi con connessione
   ├── Crea/riusa BleDevice, aggiungi a connectedDevices
   ├── connectGatt(context, false, callback, TRANSPORT_LE=2, PHY_LE_1M=2)
   ├── Avvia Timer timeout: connectTimeout + (afterUpgrade ? upgradeSwapTime : 0)
   └── Stato → CONNECTING

2. BluetoothGattCallback.onConnectionStateChange()
   ├── newState=0 (DISCONNECTED):
   │   ├── Se BLE disabilitato: ignora
   │   ├── Se device in fase connecting: ignora
   │   ├── gatt.close()
   │   ├── Se status=8 (connessione persa): refreshDeviceCache()
   │   ├── Se in disconnectingDevices: rimuovi e ritorna
   │   ├── Se status=22 (timeout locale): ignora
   │   └── Stato → DISCONNECT_FROM_SYS
   └── newState=2 (CONNECTED):
       ├── gatt.discoverServices()
       └── Stato → SEARCH_SERVICE

3. onServicesDiscovered()
   ├── Per ogni BlePrivateService nella config:
   │   ├── Cerca service GATT per UUID
   │   ├── Cerca write characteristic → altrimenti CHARS_FAIL
   │   ├── Cerca read characteristic → altrimenti CHARS_FAIL
   │   ├── setCharacteristicNotification(readChars, true)
   │   ├── Ottieni CCCD descriptor per readChars
   │   ├── Accoda descriptor in descriptorQueue
   │   └── Aggiorna BleDevice con gatt, psType, write, read
   └── Stato → SEARCH_CHARS (implicito)

4. processNextDescriptor() [iterativo]
   ├── Se descriptorQueue vuota: → requestDeviceMtu()
   └── Altrimenti: writeDescriptor(ENABLE_NOTIFICATION_VALUE)

5. onDescriptorWrite() → processNextDescriptor() [loop]

6. requestDeviceMtu()
   └── gatt.requestMtu(config.mtu) [default: 247]

7. onMtuChanged()
   └── connectingFlowFinish(gatt, mtu)

8. connectingFlowFinish()
   ├── Se initiateBinding e bondState != BONDED:
   │   ├── device.createBond()
   │   └── Stato → START_BINDING
   └── Altrimenti:
       └── Stato → CONNECT_FINISH

9. BleStateListener.onDeviceBondStateChanged()
   ├── Se bonded e config.initiateBinding:
   │   └── Stato → CONNECT_FINISH
   └── Se bond fallito: → BOUND_FAIL

10. Flutter chiama DEVICE_PRE_CONNECTED → setPreConnected()
11. Flutter chiama DEVICE_CONNECTED → setConnected() → CONNECTED
```

#### Flusso Invio Comandi

```
sendCmd(uuid, data, psType):
  1. Verifica BLE attivo e config presente
  2. Se device in upgrade e psType != 1: blocca (solo DFU consentito)
  3. Crea BleCmd(uuid, psType, data, isSuccess=false)
  4. Accoda in sendCmdQueue
  5. Se coda aveva 0 elementi (ora 1):
     ├── Poll dalla coda
     └── device.writeCharacteristic(data, psType)
  6. Altrimenti: attende onCharacteristicWrite() che processa il prossimo

sendCmdNoWait(uuid, data, psType):
  1. Verifica BLE attivo e config presente
  2. Scrive direttamente: device.writeCharacteristic(data, psType)
  [Nessuna coda - invio immediato]

onCharacteristicWrite() callback:
  1. Poll prossimo BleCmd da sendCmdQueue
  2. Se presente: device.writeCharacteristic(cmd.data, cmd.psType)
  [Implementa write-with-response seriale]

onCharacteristicChanged() callback:
  1. Trova device per gatt address
  2. Trova BlePrivateService per readChars UUID
  3. Crea BleCmd(address, psType, characteristic.value, isSuccess=true)
  4. Invia su EventChannel RECEIVE_DATA via mainScope
```

### 19.3 Modello Dati BLE

#### BleConfig - Configurazione Dispositivo

```kotlin
data class BleConfig(
    val name: String,                           // Nome configurazione (es. "G2", "Ring1")
    val scan: BleScan,                          // Configurazione scan
    val privateServices: List<BlePrivateService>, // Servizi GATT privati
    val initiateBinding: Boolean,               // Richiedi bonding Android
    val connectTimeout: Double = 15000.0,       // Timeout connessione (ms)
    val upgradeSwapTime: Double = 60000.0,      // Tempo extra per upgrade DFU
    val mtu: Int = 247                          // MTU richiesto
)
// Metodo: isEmpty() → name vuoto o privateServices vuoto

// Companion: BleConfig.empty() → default con tutti i valori base
```

#### BleScan - Configurazione Scan

```kotlin
data class BleScan(
    val nameFilters: List<String>,  // Filtri nome dispositivo (es. ["Even", "G2"])
    val snRule: BleSnRule?,         // Regola estrazione serial number
    val matchCount: Int = 1         // Numero match richiesti prima di notificare
)
// Companion: BleScan.empty() → nameFilters vuota, matchCount=1
```

#### BleSnRule - Regola Serial Number

```kotlin
data class BleSnRule(
    val byteLength: Int,            // Lunghezza byte da leggere dal scan record
    val startSubIndex: Int,         // Indice di inizio nel byte array
    val replaceRex: String,         // Regex per rimuovere caratteri di controllo
    val filters: List<String>       // Filtri aggiuntivi sul SN estratto
) : Serializable
// Companion: BleSnRule.empty() → byteLength=0, startSubIndex=0
```

#### BlePrivateService - Servizio GATT Privato

```kotlin
data class BlePrivateService(
    val service: String,      // UUID servizio GATT (stringa)
    val writeChars: String?,  // UUID characteristic di scrittura
    val readChars: String?,   // UUID characteristic di lettura (notifica)
    val type: Int = 0         // Tipo servizio (psType: 0=principale, 1=DFU, ...)
) : Serializable {
    val serviceUUID: UUID       // Conversione a UUID
    val writeCharsUUID: UUID?   // Conversione a UUID
    val readCharsUUID: UUID?    // Conversione a UUID
}
```

#### BleDevice - Dispositivo BLE

```kotlin
class BleDevice(
    @JsonAdapter(BleConfigOutAdapter::class)
    val belongConfig: BleConfig,           // Config a cui appartiene
    val name: String,                       // Nome dispositivo
    val uuid: String,                       // MAC address (UUID)
    val sn: String,                         // Serial number
    var rssi: Int,                          // Potenza segnale
    var connectState: BleConnectState       // Stato connessione corrente
) {
    private var gatt: BluetoothGatt?                    // Connessione GATT
    private val writeAndReadList: List<BleWriteAndRead>  // Coppie write/read per psType

    fun update(gatt, psType?, write?, read?)  // Aggiorna GATT e characteristics
    fun releaseAndClear()                      // Disconnetti e pulisci
    fun writeCharacteristic(data, psType) → Boolean  // Scrivi su GATT
    val isConnected: Boolean                   // connectState == CONNECTED
    val myGatt: BluetoothGatt?                 // Getter per gatt
}
```

**writeCharacteristic():**
- Cerca `BleWriteAndRead` per `psType` nella lista
- Se gatt o characteristic null: invia `BleCmd.fail()` su `RECEIVE_DATA` EventChannel
- Android 33+: usa `gatt.writeCharacteristic(chars, data, WRITE_TYPE_DEFAULT=1)`
- Android <33: usa `chars.setValue(data)` + `gatt.writeCharacteristic(chars)`
- Se scrittura fallisce: invia `BleCmd.fail()` su EventChannel

#### BleWriteAndRead - Coppia Write/Read

```kotlin
class BleWriteAndRead(
    var psType: Integer?,                          // Tipo servizio privato
    var writeChars: BluetoothGattCharacteristic?,  // Characteristic di scrittura
    var readChars: BluetoothGattCharacteristic?    // Characteristic di lettura
)
```

#### BleCmd - Comando/Risposta BLE

```kotlin
data class BleCmd(
    val uuid: String,                           // MAC dispositivo
    val psType: Int,                            // Tipo servizio privato
    @JsonAdapter(ByteArrayAdapter::class)
    val data: ByteArray?,                       // Dati payload
    val isSuccess: Boolean                      // true=risposta ok, false=errore
) {
    companion object {
        fun fail(uuid: String, psType: Int): BleCmd  // Crea risposta di errore
    }
}
```

#### BleConnectModel - Modello Stato Connessione (per EventChannel)

```kotlin
data class BleConnectModel(
    val uuid: String,                    // MAC dispositivo
    val name: String,                    // Nome dispositivo
    val connectState: BleConnectState,   // Stato connessione
    val mtu: Int = 247                   // MTU negoziato
)
```

#### BleConnectTemp - Connessione Temporanea in Coda

```kotlin
data class BleConnectTemp(
    val belongConfig: BleConfig,  // Config del dispositivo
    val uuid: String,             // MAC
    val name: String,             // Nome
    val sn: String,               // Serial number
    var afterUpgrade: Boolean,    // Post-upgrade (timeout esteso)
    var timeoutTimer: Timer?      // Timer timeout connessione
)
```

#### BleMatchDevice - Risultato Scan Raggruppato

```kotlin
data class BleMatchDevice(
    val sn: String,              // Serial number
    val devices: List<BleDevice> // Dispositivi trovati con questo SN
)
// Inviato come JSON su EventChannel SCAN_RESULT
```

#### BleConnectedDevice - Dispositivo Connesso (Serializzabile)

```kotlin
data class BleConnectedDevice(
    val writeChars: String,   // UUID characteristic scrittura
    val readChars: String,    // UUID characteristic lettura
    val isConnected: Boolean  // Stato connessione
) : Serializable
```

### 19.4 BleConnectState - 21 Stati di Connessione

```kotlin
enum class BleConnectState {
    // === Fase di connessione (isConnecting = true) ===
    CONNECTING,          // 0  - Avvio connessione
    CONTACT_DEVICE,      // 1  - Contatto dispositivo
    SEARCH_SERVICE,      // 2  - Ricerca servizi GATT
    SEARCH_CHARS,        // 3  - Ricerca characteristics
    START_BINDING,       // 4  - Avvio bonding Android
    CONNECT_FINISH,      // 5  - Connessione completata (pre-CONNECTED)

    // === Disconnessione (isDisconnected = true) ===
    DISCONNECT_BY_USER,  // 6  - Disconnessione volontaria
    DISCONNECT_FROM_SYS, // 7  - Disconnessione dal sistema/hardware

    // === Errori (isError = true) ===
    EMPTY_UUID,          // 8  - UUID vuoto fornito
    NO_BLE_CONFIG_FOUND, // 9  - Nessuna BleConfig trovata per il device
    NO_DEVICE_FOUND,     // 10 - Dispositivo non trovato (getName() == null)
    ALREADY_BOUND,       // 11 - Dispositivo già connesso
    BOUND_FAIL,          // 12 - Bonding fallito
    SERVICE_FAIL,        // 13 - Servizi GATT non trovati
    CHARS_FAIL,          // 14 - Characteristics non trovate
    TIMEOUT,             // 15 - Timeout connessione
    BLE_ERROR,           // 16 - Errore BLE generico
    SYSTEM_ERROR,        // 17 - Errore di sistema

    // === Connesso (isConnected = true) ===
    CONNECTED,           // 18 - Connesso e operativo
    UPGRADE,             // 19 - In modalità upgrade/DFU (isUpgrade=true)

    // === Nessuno ===
    NONE                 // 20 - Stato iniziale/non definito
}

// Proprietà computed:
// isStartConnect: CONNECTING only
// isConnecting: CONNECTING..CONNECT_FINISH
// isConnected: CONNECTED, UPGRADE
// isDisconnected: DISCONNECT_BY_USER, DISCONNECT_FROM_SYS
// isError: EMPTY_UUID..SYSTEM_ERROR (9 stati)
// isUpgrade: UPGRADE only
```

### 19.5 BleMC - 17 Comandi MethodChannel

```kotlin
enum class BleMC {
    GET_PLATFORM_VERSION,  // 0  → result.success("Android " + Build.VERSION.RELEASE)
    BLE_STATE,             // 1  → result.success(getCurrentBleState())
    INIT_CONFIGS,          // 2  → arguments: List<Map> → deserializza in List<BleConfig>
    START_SCAN,            // 3  → arguments: Map{"pureModel": Boolean}
    STOP_SCAN,             // 4  → BleManager.stopScan(false)
    CONNECT_DEVICE,        // 5  → arguments: Map{"belongConfig","uuid","name","sn","afterUpgrade"}
    DEVICE_PRE_CONNECTED,  // 6  → arguments: String (uuid)
    DEVICE_CONNECTED,      // 7  → arguments: String (uuid)
    DISCONNECT_DEVICE,     // 8  → arguments: Map{"uuid","removeBond": Boolean}
    SEND_CMD,              // 9  → arguments: Map{"uuid","data": ByteArray,"psType": Int}
    ENTER_UPGRADE_STATE,   // 10 → arguments: String (uuid)
    QUITE_UPGRADE_STATE,   // 11 → arguments: String (uuid)
    CLEAN_CONNECT_CACHE,   // 12 → nessun argomento
    RESET_BLE,             // 13 → nessun argomento
    OPEN_BLE_SETTINGS,     // 14 → Intent(ACTION_BLUETOOTH_SETTINGS)
    OPEN_APP_SETTINGS,     // 15 → Intent(ACTION_APPLICATION_DETAILS_SETTINGS)
    UNKNOWN                // 16 → sentinella
}

// Companion: BleMC.from(method: String) → converte camelCase a UPPER_SNAKE_CASE
// Regex: StubApp.getString2(11223) → sostituisce pattern con StubApp.getString2(11224)
// Poi toUpperCase() e valueOf()
```

**Dettaglio argomenti CONNECT_DEVICE (case 6):**

```
Map {
  StubApp.getString2(11243) → "belongConfig"  (nome config)
  StubApp.getString2(11240) → "uuid"          (MAC address)
  StubApp.getString2(ModuleDescriptor.MODULE_VERSION) → "name"  (nome device)
  StubApp.getString2(11244) → "sn"            (serial number)
  StubApp.getString2(11245) → "afterUpgrade"  (boolean)
}
```

**Dettaglio argomenti SEND_CMD (case 10):**

```
Map {
  StubApp.getString2(11240) → "uuid"    (MAC address)
  StubApp.getString2(1485)  → "data"    (byte array)
  StubApp.getString2(11241) → "psType"  (int, default 0)
}
```

### 19.6 BleEC - 5 Stream EventChannel

```kotlin
enum class BleEC {
    BLE_STATE,       // 0 - Cambiamenti stato Bluetooth (on/off/permessi)
    SCAN_RESULT,     // 1 - Risultati scan (BleMatchDevice JSON)
    CONNECT_STATUS,  // 2 - Cambiamenti stato connessione (BleConnectModel)
    RECEIVE_DATA,    // 3 - Dati ricevuti dal dispositivo (BleCmd map)
    LOGGER           // 4 - Log di debug BLE
}

// Event label: StubApp.getString2(11222) + snakeCase(name())
// Es: "flutter_ezw_ble/event/" + "ble_state" → "flutter_ezw_ble/event/ble_state"

// Storage: BleChannelKt.bleEvents: Map<String, EventChannel.EventSink>
// registerEventChannel(binaryMessenger):
//   - Crea EventChannel con label
//   - onListen: salva EventSink in bleEvents
//   - onCancel: rimuove EventSink da bleEvents
// getEvent(): restituisce EventSink corrente dalla mappa
```

### 19.7 BleStateListener - Monitor Stato Bluetooth

```
Callback: BluetoothStateCallback
  ├── onBluetoothStateChanged(state: Int)
  │   ├── MIN_VALUE → bleState = 0 (unknown)
  │   ├── 10 → bleState = 4 (OFF)
  │   ├── 12 → bleState = 5 (ON)
  │   └── Se OFF: disconnetti tutti i dispositivi connessi
  ├── onDeviceBondStateChanged(device, isBonded)
  │   ├── Se bonded e device connecting con initiateBinding:
  │   │   └── Stato → CONNECT_FINISH
  │   ├── Se unbonded e device connesso:
  │   │   └── Stato → BOUND_FAIL
  │   └── Se bonded e device già connesso: log only
  ├── onDeviceConnected(device) → default impl
  └── onDeviceDisconnected(device) → default impl
```

### 19.8 BluetoothGattStatus - Descrizioni Status

```kotlin
object BluetoothGattStatus {
    fun getStatusDescription(status: Int): String
    // Mappa codici GATT a descrizioni leggibili
}
```

### 19.9 Refresh Device Cache

```java
// Reflection hack per pulire cache GATT:
Method method = gatt.getClass().getMethod("refresh");  // StubApp.getString2(11304)
boolean result = (Boolean) method.invoke(gatt);
// Chiamato dopo disconnessione con status=8 (connection lost)
```

### 19.10 Scan Logic

```
startScan(pureModel):
  1. checkIsFunctionCanBeCalled() → BLE on + config presente
  2. Se già scanning: ritorna
  3. scanPureMode = pureModel
  4. stopScan() precedente
  5. scanResultTemp.clear()
  6. ScanSettings: ScanMode.LOW_LATENCY (2)
  7. bluetoothLeScanner.startScan(null, settings, callback)

ScanCallback.onScanResult():
  1. Ignora dispositivi senza nome
  2. Ignora dispositivi già in scanResultTemp (per UUID)
  3. Cerca BleConfig matching per nameFilters (contains su nome)
  4. Se pureMode:
     ├── UUID = random UUID
     ├── Crea BleDevice
     └── sendMatchDevices(uuid, [device])
  5. Altrimenti:
     ├── Se snRule presente:
     │   ├── parseDataToObtainSn(scanRecord.bytes, snRule)
     │   ├── Applica filters su SN estratto
     │   └── replaceControlCharacters con replaceRex
     ├── Crea BleDevice con SN
     └── Se matchCount >= 2:
         ├── Raggruppa per SN
         ├── Se count == matchCount: sendMatchDevices()
         └── Altrimenti: attendi altri risultati
```

---

## 20. Plugin Flutter Nativi (da DEX decompilato)

### 20.1 FlutterEzwBlePlugin

**Classe:** `com.fzfstudio.ezw_ble.FlutterEzwBlePlugin`
**File sorgente:** `FlutterEzwBlePlugin.kt` (65 linee)
**Interfacce:** `FlutterPlugin`, `MethodChannel.MethodCallHandler`

```
onAttachedToEngine(binding):
  1. context = binding.applicationContext
  2. Crea MethodChannel("flutter_ezw_ble") ← StubApp.getString2(11216)
  3. Registra this come MethodCallHandler
  4. Per ogni BleEC: registerEventChannel(binaryMessenger)
  5. BleManager.init(context)
  6. Registra ActivityLifecycleCallbacks:
     └── onActivityStarted → BleManager.checkBluetoothPermission()

onMethodCall(call, result):
  1. BleMC.from(call.method) → converte nome metodo in enum
  2. bleMC.handle(context, call.arguments, result)

onDetachedFromEngine(binding):
  1. channel.setMethodCallHandler(null)
  2. BleManager.release()
```

**Channel name:** `StubApp.getString2(11216)` → probabilmente `"flutter_ezw_ble"`

### 20.2 TranslatePlugin (Azure Cognitive Services)

**Classe:** `com.even.translate.TranslatePlugin`
**Interfacce:** `FlutterPlugin`, `MethodChannel.MethodCallHandler`
**Funzionalità:** Traduzione vocale in tempo reale tramite Azure Speech SDK

**Metodi MethodChannel:**

| Indice getString2 | Metodo | Argomenti | Descrizione |
|-------------------|--------|-----------|-------------|
| 10061 | `handleInit` | `Map{apiKey, region, sourceLanguage, targetLanguage, sessionID, ...}` | Inizializza Azure SDK |
| 10059 | `handleStartTranslation` | - | Avvia riconoscimento e traduzione |
| 10058 | `handleStopTranslation` | - | Ferma la traduzione |
| 10060 | `handleSetSourceLanguage` | `Map{language: String}` | Imposta lingua sorgente |
| 10062 | `handleSetTargetLanguage` | `Map{language: String}` | Imposta lingua target |
| 10063 | `handleWriteAudioData` | `Map{data: byte[]}` | Scrive dati audio nel buffer |

#### AzureTranslationRecognizer

**Classe:** `com.even.translate.azure.translation.AzureTranslationRecognizer`
**Interfaccia:** `AzureRecognizerProtocol`

**Macchina a stati:**
```
IDLE → STARTING → RUNNING ⇄ PAUSED → STOPPING → IDLE
                    ↓
                  ERROR
```

**Configurazione audio:**
```java
AudioStreamFormat.getWaveFormatPCM(
    sampleRate: 16000,      // Hz
    bitsPerSample: 16,      // bit
    channels: 1             // mono
)
PushAudioInputStream = AudioInputStream.createPushStream(format)
AudioConfig = AudioConfig.fromStreamInput(audioInputStream)
```

**Configurazione Azure:**
```java
SpeechTranslationConfig.fromSubscription(apiKey, region)
setSpeechRecognitionLanguage(sourceLanguage)
addTargetLanguage(targetLanguage)
setProperty(InitialSilenceTimeoutMs, ...)
setProperty(EndSilenceTimeoutMs, ...)
setProperty(SegmentationSilenceTimeoutMs, ...)
```

**8 Event Listener registrati:**
1. `recognizer.recognized` → testo riconosciuto finale
2. `recognizer.recognizing` → testo parziale (interim)
3. `recognizer.sessionStarted` → sessione avviata
4. `recognizer.sessionStopped` → sessione terminata
5. `recognizer.speechStartDetected` → voce rilevata
6. `recognizer.speechEndDetected` → fine voce
7. `recognizer.canceled` → sessione cancellata/errore
8. `recognizer.synthesizing` → sintesi vocale traduzione

**Payload eventi (Protobuf `TranslationEvent`):**
```protobuf
TranslationEvent {
    TranslationEventType type       // recognized, recognizing, error, canceled
    TranslationResult result {
        string sessionId
        string original             // testo originale
        string target               // testo tradotto
        bool isFinal
        int64 id                    // sentenceID incrementale
        string reason
        int64 offset                // milliseconds / 10000
        int64 duration              // milliseconds / 10000
    }
}
// Serializzato come byte[] via toByteArray() su EventChannel
```

**Codec supportati:**
```
PCM16  (16-bit, audio/pcm, .pcm)
PCM24  (24-bit, audio/pcm, .pcm)
PCM32  (32-bit, audio/pcm, .pcm)
AAC    (16-bit, audio/aac, .aac)
```

**Flusso dati audio:**
```
Microfono occhiali → BLE (LC3/PCM) → App Flutter
    → MethodChannel "writeAudioData" → TranslatePlugin
    → AzureTranslationRecognizer.writeAudioData(byte[])
    → PushAudioInputStream.write(data)
    → Azure Cognitive Services (cloud)
    → TranslationEvent (protobuf) via EventChannel
    → Flutter UI → Display su occhiali
```

### 20.3 Serializzazione JSON (GsonSerializable)

```
Classi base:
- AbstractC1457a (alias: o3.a) → classe base per modelli serializzabili
  └── toMap(): Map<String, Object>  // Serializza a mappa
  └── toJson(): String              // Serializza a JSON string

- ByteArrayAdapter: JsonAdapter custom per serializzare byte[] in formato compatibile
- BleConfigOutAdapter: JsonAdapter custom per BleConfig (serializzazione in output)
- BleConnectStateAdapter: JsonAdapter custom per BleConnectState enum
```

---

## 21. Servizi Android (da DEX decompilato)

### 21.1 EvNLService (NotificationListenerService)

**Classe:** `com.even.even_core.services.nls.EvNLService`
**Tipo:** `android.service.notification.NotificationListenerService`

```
Funzionalità:
- Intercetta notifiche di sistema Android
- Inoltra dati notifica al layer Flutter via callback nativi
- Consente agli occhiali di mostrare notifiche del telefono

Metodi chiave:
- onNotificationPosted(StatusBarNotification) → notifica Flutter
- onNotificationRemoved(StatusBarNotification) → notifica Flutter
- Callback: metodi nativi per comunicare con il layer Flutter
```

### 21.2 NavigationForegroundService

**Classe:** `com.even.navigate.service.NavigationForegroundService`
**Tipo:** `android.app.Service` (foreground)

```
Funzionalità:
- Mantiene la navigazione attiva anche con app in background
- Mostra notifica persistente durante navigazione
- Impedisce al sistema di terminare il processo

Lifecycle:
- startForeground() con notification channel
- Comunica con il layer Flutter per aggiornamenti posizione
```

### 21.3 EvDatabase (Room)

**Tecnologia:** Android Room Persistence Library
**Schema:** Criptato (dettagli non completamente deoffuscati)

```
Componenti identificati:
- EvDatabase: RoomDatabase principale
- DAO classes: Data Access Objects per query
- Entity classes: Tabelle del database locale
- Migrations: Gestione versioni schema

Utilizzo: Cache locale per dati offline (configurazioni, log, stato dispositivo)
```

### 21.4 MainActivity

**Classe:** `com.even.sg.MainActivity`
**Tipo:** `FlutterActivity` (punto di ingresso app)

```
Responsabilità:
- Inizializzazione Flutter engine
- Registrazione plugin nativi
- Gestione permessi Android a runtime
- Deep linking e intent handling
```

---

## 22. Offuscamento Stringhe Jiagu (da DEX decompilato)

### 22.1 Meccanismo StubApp.getString2()

**Classe:** `com.stub.StubApp`
**Metodo:** `getString2(int index) → String`

Tutte le stringhe nel codice decompilato sono sostituite con chiamate a `StubApp.getString2(index)`, dove `index` è un riferimento a una tabella di stringhe decrittate a runtime dal packer Jiagu.

```java
// Esempio nel codice decompilato:
BleManager.cccdDescriptor = UUID.fromString(StubApp.getString2(11299));
// → UUID.fromString("00002902-0000-1000-8000-00805f9b34fb")

// Le stringhe sono criptate nel DEX originale e decrittate
// dalla VM nativa di Jiagu (libjiagu_x86.so) al primo accesso
```

### 22.2 Intervalli Indici Identificati

| Range Indici | Contesto | Esempi |
|-------------|----------|--------|
| 74 | Carattere di chiusura | `)` |
| 81 | Separatore | `, ` o simile |
| 140-143 | Permessi Android | `ACCESS_FINE_LOCATION`, `ACCESS_COARSE_LOCATION`, `ACTION_APPLICATION_DETAILS_SETTINGS` |
| 207 | Valore enum | `"NONE"` |
| 343 | Valore enum | `"UNKNOWN"` |
| 999 | Separatore | Separatore per log |
| 1065 | Separatore | `, name=` o simile |
| 1485 | Chiave mappa | `"data"` |
| 1829-1850 | Permessi BLE | `BLUETOOTH_CONNECT`, `BLUETOOTH_SCAN` |
| 2148 | Separatore | `, psType=` o simile |
| 2817 | Prefisso | `"Android "` |
| 3469 | Timeout | `"TIMEOUT"` |
| 3503 | Schema URI | `"package"` |
| 3674 | Placeholder | String placeholder |
| 5307 | Separatore | `, length=` o simile |
| 5826 | Intent action | `"android.settings.BLUETOOTH_SETTINGS"` |
| 10093 | Nome enum | `"SCAN_RESULT"` |
| 11216 | Channel name | `"flutter_ezw_ble"` |
| 11218-11221 | Nomi BleEC enum | `"BLE_STATE"`, `"CONNECT_STATUS"`, `"RECEIVE_DATA"`, `"LOGGER"` |
| 11222 | Prefisso evento | `"flutter_ezw_ble/event/"` |
| 11223-11224 | Regex conversione | Pattern camelCase → SNAKE_CASE |
| 11225-11239 | Nomi BleMC enum | `"GET_PLATFORM_VERSION"` ... `"OPEN_APP_SETTINGS"` |
| 11240-11246 | Chiavi argomenti | `"uuid"`, `"psType"`, `"removeBond"`, `"belongConfig"`, `"sn"`, `"afterUpgrade"`, `"pureModel"` |
| 11247-11346 | Messaggi log BLE | Varie stringhe di log per debug BLE |
| 11347-11416 | toString/enum | Stringhe per toString() e nomi enum BleConnectState |

### 22.3 Implicazioni per il Reverse Engineering

1. **Decrittazione necessaria:** Per ottenere le stringhe reali, è necessario:
   - Eseguire l'app su un device/emulatore
   - Hookare `StubApp.getString2()` con Frida/Xposed
   - Oppure analizzare la tabella stringhe nella VM Jiagu

2. **Inferenza contestuale:** Molte stringhe possono essere inferite dal contesto:
   - UUID BLE: formato standard `xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx`
   - Permessi: costanti Android note
   - Nomi enum: corrispondono ai nomi Kotlin nel metadata

3. **Indici stabili:** Gli indici sono generati al momento del packing e rimangono costanti per una specifica versione dell'APK

4. **Solo DEX protetto:** Le stringhe in `libapp.so` (Flutter/Dart) NON sono protette da Jiagu e sono leggibili direttamente

---

## Appendice: Moduli Protobuf Completi

```
even_connect/g2/proto/generated/
├── common/common.pbenum.dart
├── conversate/conversate.pb.dart, .pbenum.dart
├── dashboard/dashboard.pb.dart, .pbenum.dart
├── dev_config_protocol/dev_config_protocol.pb.dart, .pbenum.dart
├── dev_infomation/dev_infomation.pb.dart, .pbenum.dart
├── dev_pair_manager/dev_pair_manager.pb.dart, .pbenum.dart
├── dev_settings/dev_settings.pb.dart, .pbenum.dart
├── efs_transmit/efs_transmit.pbenum.dart
├── EvenHub/EvenHub.pb.dart, .pbenum.dart
├── even_ai/even_ai.pb.dart, .pbenum.dart
├── g2_setting/g2_setting.pb.dart, .pbenum.dart
├── glasses_case/glasses_case.pb.dart, .pbenum.dart
├── health/health.pb.dart, .pbenum.dart
├── logger/logger.pb.dart, .pbenum.dart
├── menu/menu.pb.dart, .pbenum.dart
├── module_configure/module_configure.pb.dart, .pbenum.dart
├── navigation/navigation.pb.dart, .pbenum.dart
├── notification/notification.pb.dart, .pbenum.dart
├── onboarding/onboarding.pb.dart, .pbenum.dart
├── ota_transmit/ota_transmit.pbenum.dart
├── quicklist/quicklist.pb.dart, .pbenum.dart
├── ring/ring.pb.dart, .pbenum.dart
├── service_id_def/service_id_def.pbenum.dart
├── sync_info/sync_info.pb.dart, .pbenum.dart
├── teleprompt/teleprompt.pb.dart, .pbenum.dart
├── transcribe/transcribe.pb.dart, .pbenum.dart
└── translate/translate.pb.dart, .pbenum.dart

flutter_ezw_audio/audio_algorithm/model/generated/
├── bert.pb.dart
├── common.pbenum.dart
├── noise_reduction.pb.dart
├── speech.pb.dart
└── speech_enhance.pb.dart

flutter_ezw_asr/proto/
└── transcribe_event.pb.dart, .pbenum.dart

translate/src/proto/
└── translation_event.pb.dart, .pbenum.dart

mcumgr_flutter/proto/
└── flutter_mcu.pb.dart, .pbenum.dart
```
