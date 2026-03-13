# Even Realities G2 — Protocollo BLE Completo

Reverse engineering del protocollo Bluetooth Low Energy degli occhiali Even Realities G1/G2.
Informazioni estratte dal layer nativo Kotlin (DEX decompilato), dal layer Dart (stringhe libapp.so),
e **confermato con analisi di pacchetti BLE reali** catturati via nRF Connect da un G2 (firmware 2.0.7.16).

---

## Indice

1. [Architettura Stack BLE](#1-architettura-stack-ble)
2. [UUID BLE — Servizi e Characteristic](#2-uuid-ble--servizi-e-characteristic)
3. [Connessione e Setup](#3-connessione-e-setup)
4. [EvenBleTransport — Formato Pacchetto](#4-eventbletransport--formato-pacchetto)
5. [Service ID — Identificatori Servizio](#5-service-id--identificatori-servizio)
6. [BleDataPackage — Protobuf](#6-bledatapackage--protobuf)
7. [Comandi Protocollo (App ↔ OS)](#7-comandi-protocollo-app--os)
8. [Display e Invio Immagini](#8-display-e-invio-immagini)
9. [Sistema BMP — Encoding Immagini](#9-sistema-bmp--encoding-immagini)
10. [Trasporto Multi-Pacchetto](#10-trasporto-multi-pacchetto)
11. [File Service](#11-file-service)
12. [Heartbeat e Keep-Alive](#12-heartbeat-e-keep-alive)
13. [OTA / Firmware Update](#13-ota--firmware-update)
14. [Ring R1 — Relay Dati](#14-ring-r1--relay-dati)
15. [Ricostruzione Pratica — Guida Step-by-Step](#15-ricostruzione-pratica--guida-step-by-step)

---

## 1. Architettura Stack BLE

```
┌─────────────────────────────────────────────────────────┐
│                    Flutter App (Dart)                     │
│  ┌──────────────┐  ┌──────────────┐  ┌───────────────┐  │
│  │ BleG2CmdProto│  │BleG2CmdService│  │BleG2CmdTransport│
│  │ (costruzione │  │ (logica app)  │  │ (frammentazione, │
│  │  protobuf)   │  │              │  │  sequencing,     │
│  └──────┬───────┘  └──────┬───────┘  │  retry)          │
│         │                 │          └────────┬──────────│
│         └─────────────────┴───────────────────┘          │
│                           │                              │
│              sendDataPackage(serviceId, protobuf)         │
│                           │                              │
│              ┌────────────▼────────────┐                 │
│              │   EvenBleTransport      │                 │
│              │  (header 0xAA + payload)│                 │
│              └────────────┬────────────┘                 │
│                           │                              │
│              _splitDataIntoPackets(data, mtu)             │
│                           │                              │
├───────────────────────────┼──────────────────────────────┤
│         Flutter Method Channel: "sendCmd"                 │
│         args: {uuid, data: byte[], psType: int}           │
├───────────────────────────┼──────────────────────────────┤
│                  Android Nativo (Kotlin)                   │
│              ┌────────────▼────────────┐                 │
│              │  FlutterEzwBlePlugin    │                 │
│              │  → BleMC.SEND_CMD       │                 │
│              │  → BleManager.sendCmd() │                 │
│              └────────────┬────────────┘                 │
│                           │                              │
│              ┌────────────▼────────────┐                 │
│              │  BleDevice              │                 │
│              │  .writeCharacteristic() │                 │
│              │  (seleziona write char  │                 │
│              │   in base a psType)     │                 │
│              └────────────┬────────────┘                 │
│                           │                              │
│              BluetoothGatt.writeCharacteristic()          │
└───────────────────────────┼──────────────────────────────┘
                            │
                     ┌──────▼──────┐
                     │  BLE Radio  │
                     │  (GATT)     │
                     └──────┬──────┘
                            │
                    ┌───────▼───────┐
                    │ Even G2 Glasses│
                    └───────────────┘
```

### Layer Nativo (Kotlin — DEX)

| Classe | Ruolo |
|--------|-------|
| `FlutterEzwBlePlugin` | Bridge Flutter ↔ nativo |
| `BleMC` | Enum 17 comandi MethodChannel |
| `BleEC` | Enum 5 EventChannel (BLE_STATE, SCAN_RESULT, CONNECT_STATUS, RECEIVE_DATA, LOGGER) |
| `BleManager` | Singleton — scan, connect, sendCmd, GATT callback |
| `BleDevice` | Rappresenta device connesso, writeCharacteristic() |
| `BleConfig` | Configurazione: name, scan, privateServices[], mtu, timeouts |
| `BlePrivateService` | Servizio GATT: serviceUUID, writeCharsUUID, readCharsUUID, type (= psType) |
| `BleCmd` | Comando: uuid, psType, data[], isSuccess |
| `BleWriteAndRead` | Mappa psType → (writeCharacteristic, readCharacteristic) |

### Layer Dart (libapp.so)

| Classe | Ruolo |
|--------|-------|
| `BleG2CmdProto` | Costruzione pacchetti protobuf per ogni serviceId |
| `BleG2CmdService` | Logica applicativa (gestione connessione, heartbeat, OTA) |
| `BleG2CmdTransport` | Frammentazione, sequencing, retry, coda pacchetti |
| `EvenBleTransport` | Serializzazione header pacchetto (0xAA + campi) |
| `BleDataPackage` | Wrapper protobuf per serviceId specifico |
| `BleG2PsType` | Enum dei tipi psType |

---

## 2. UUID BLE — Servizi e Characteristic

### Even Custom Service (base: `00002760-08C2-11E1-9073-0E8AC72E____`)

| UUID Suffix | Tipo | Descrizione |
|-------------|------|-------------|
| `0001` | Service | Servizio base (discovery?) |
| `0002` | Characteristic | Characteristic base |
| `1001` | Service/Char | Servizio secondario |
| **`5401`** | **Write** | **Canale 1 — TX (app → occhiali)** |
| **`5402`** | **Read/Notify** | **Canale 1 — RX (occhiali → app)** |
| `5450` | Notify | Canale 1 — notifiche |
| **`6401`** | **Write** | **Canale 2 — TX** |
| **`6402`** | **Read/Notify** | **Canale 2 — RX** |
| `6450` | Notify | Canale 2 — notifiche |
| **`7401`** | **Write** | **Canale 3 — TX** |
| **`7402`** | **Read/Notify** | **Canale 3 — RX** |
| `7450` | Notify | Canale 3 — notifiche |

**Pattern**: Ogni canale ha 3 characteristic:
- `xx01` = Write (app → device)
- `xx02` = Read/Notify (device → app)
- `xx50` = Notify aggiuntivo

I canali 5/6/7 probabilmente corrispondono a diversi `psType` (0, 1, 2...).

### Nordic UART Service (NUS) — G1

| UUID | Tipo |
|------|------|
| `6E400001-B5A3-F393-E0A9-E50E24DCCA9E` | Service |
| `6E400002-B5A3-F393-E0A9-E50E24DCCA9E` | TX (Write) |
| `6E400003-B5A3-F393-E0A9-E50E24DCCA9E` | RX (Notify) |

### BAE8 Service — G2 (NON presente su tutti i G2!)

**ATTENZIONE**: Il servizio BAE8 **NON** è stato trovato durante il service discovery
su un Even G2 reale (firmware 2.0.7.16). Il G2 reale usa **Even Custom (2760)** come
servizio principale per il protocollo dati. BAE8 potrebbe essere usato solo su
versioni firmware precedenti o dispositivi diversi.

| UUID | Tipo |
|------|------|
| `BAE80001-4F05-4503-8E65-3AF1F7329D1F` | Service |
| `BAE80012-4F05-4503-8E65-3AF1F7329D1F` | Write (app → occhiali) |
| `BAE80013-4F05-4503-8E65-3AF1F7329D1F` | Notify (occhiali → app) |

### Servizi Confermati su G2 Reale (nRF Connect scan)

| UUID | Tipo |
|------|------|
| `00001800-...` | Generic Access |
| `00001801-...` | Generic Attribute |
| `0000180A-...` | Device Information |
| `00002760-08C2-11E1-9073-0E8AC72E0001` | Even Custom Service 1 |
| `00002760-08C2-11E1-9073-0E8AC72E1001` | Even Custom Service 2 |
| `00002760-08C2-11E1-9073-0E8AC72E****` | Even Custom Services (x4 totali) |
| `6E400001-B5A3-F393-E0A9-E50E24DCCA9E` | Nordic UART Service |

**Tutti i pacchetti dati osservati transitano su `00002760-08c2-11e1-9073-0e8ac72e5402` (Read/Notify canale 1).**

### CCCD Descriptor

`00002902-0000-1000-8000-00805f9b34fb` — standard BLE Client Characteristic Configuration Descriptor, scritto con `ENABLE_NOTIFICATION_VALUE` per abilitare le notifiche.

---

## 3. Connessione e Setup

### Flusso Completo (da BleManager.java)

```
1. Flutter → INIT_CONFIGS       Carica BleConfig[] con UUID servizi e psType
2. Flutter → START_SCAN          Scan BLE con nameFilters
3. onScanResult()               Match per nome device
4. Flutter → CONNECT_DEVICE      Avvia connessione GATT
5. onConnectionStateChange(2)    CONNECTED → discoverServices()
6. onServicesDiscovered()        Per ogni BlePrivateService in config:
   6a. getService(serviceUUID)     Trova il servizio GATT
   6b. getCharacteristic(writeUUID) Trova write characteristic
   6c. getCharacteristic(readUUID)  Trova read characteristic
   6d. setCharacteristicNotification(read, true)  Abilita notifiche
   6e. getDescriptor(CCCD)         Ottieni CCCD descriptor
   6f. descriptorQueue.add(psType, cccdDescriptor)  Accoda
   6g. device.update(gatt, psType, write, read)     Salva mapping
7. processNextDescriptor()       Scrive CCCD per ogni servizio in coda
8. onDescriptorWrite()           Conferma → processa il prossimo
9. requestMtu(config.mtu)        Richiedi MTU (default 247)
10. onMtuChanged()               Conferma MTU negoziato
11. connectingFlowFinish()       → CONNECT_FINISH / CONNECTED
```

### Parametri Default (da BleConfig.empty())

| Parametro | Valore |
|-----------|--------|
| MTU | **247** |
| connectTimeout | **15,000 ms** (15 sec) |
| upgradeSwapTime | **60,000 ms** (60 sec) |
| initiateBinding | `true` |

### psType → Characteristic Mapping

Il `psType` è l'intero che identifica quale coppia write/read usare. Viene definito in `BlePrivateService.type` e corrisponde al canale BLE:

```
BleConfig {
  name: "Even G2",
  privateServices: [
    // CONFERMATO: G2 (firmware 2.0.7.16) usa Even Custom, NON BAE8
    BlePrivateService(service: "00002760-...5450", writeChars: "...5401", readChars: "...5402", type: 0),
    BlePrivateService(service: "00002760-...6450", writeChars: "...6401", readChars: "...6402", type: 1),
    BlePrivateService(service: "00002760-...7450", writeChars: "...7401", readChars: "...7402", type: 2),
  ]
}
```

**CONFERMATO**: Tutto il traffico dati del G2 transita su canale 1 (psType=0):
- `sendCmd(uuid, data, psType=0)` → scrive su `...5401`, riceve da `...5402`
- `sendCmd(uuid, data, psType=1)` → scrive su `...6401` (canale 2, es. OTA/file?)
- `sendCmd(uuid, data, psType=2)` → scrive su `...7401` (canale 3)

**Nota**: `psType=1` è speciale — esentato dal blocco upgrade (`upgradeDevices` check).

---

## 4. EvenBleTransport — Formato Pacchetto

### Header — CONFERMATO da analisi pacchetti reali

Il formato del pacchetto di trasporto BLE è stato **confermato** dall'analisi di 200 pacchetti
catturati da un Even G2 reale (firmware 2.0.7.16):

```
┌──────────┬──────────┬──────────┬─────────────┬──────────┬──────────┬──────────────────────┬──────────┐
│ Byte 0   │ Byte 1   │ Byte 2   │ Byte 3      │ Byte 4-5 │ Byte 6-N │ Byte N+1, N+2        │          │
│ headId   │ constant │ unknown  │ payloadLen  │ constant │ payload  │ CRC16                │          │
│ 0xAA     │ 0x12     │ varies   │ uint8       │ 0x01 01  │ N bytes  │ 2 bytes              │          │
└──────────┴──────────┴──────────┴─────────────┴──────────┴──────────┴──────────────────────┴──────────┘

Dimensione totale = payloadLen + 8

Payload structure:
  ┌──────────────────┬─────────────────────────┐
  │ Byte 0-1         │ Byte 2+                 │
  │ serviceId        │ protobuf message        │
  │ uint16 LE        │ (cmdId, seqNum, fields) │
  └──────────────────┴─────────────────────────┘
```

**Campi confermati dall'analisi reale**:
- **Byte 0** (`headId`): `0xAA` (magic byte — sempre costante)
- **Byte 1**: `0x12` (costante — versione protocollo?)
- **Byte 2**: Varia per pacchetto — possibile hash/checksum/counter
- **Byte 3** (`payloadLen`): Lunghezza del payload in bytes (uint8)
- **Byte 4-5**: `0x01 0x01` (sempre costante)
- **Byte 6 → 6+payloadLen-1**: Payload
  - **Primi 2 byte del payload**: `serviceId` (uint16 Little Endian)
  - **Byte 2+ del payload**: Messaggio protobuf con campi:
    - **field 1**: `cmdId` (varint)
    - **field 2**: `seqNumber` (varint)
    - **field 3+**: Dati comando specifici
- **Ultimi 2 byte**: CRC16 — **CONFERMATO**: CRC-16/CCITT-FALSE (poly=0x1021, init=0xFFFF), calcolato su `packet[8:]` (solo protobuf, esclusi header 8 byte e CRC), output Little Endian. Verificato su 184/184 pacchetti reali.

### Pacchetto Heartbeat (payload vuoto)

Quando `payloadLen == 0`, il pacchetto è un heartbeat/keep-alive:
```
AA 12 xx 00 01 01 [CRC16]    ← 8 byte totali
```
I heartbeat compaiono ogni ~5-6 secondi nel traffico reale.

### Esempio Pacchetto Reale (DEV_INFO)

```
AA-12-53-2B-01-01-09-01-08-02-10-02-22-23-08-01-10-23-18-06-2A-08-
32-2E-30-2E-37-2E-31-36-32-08-32-2E-30-2E-37-2E-31-36-40-1E-50-01-
60-64-90-01-01-9D-86
```
Decodifica:
- `AA` → headId
- `12` → costante
- `53` → byte2 (hash?)
- `2B` → payloadLen = 43 bytes
- `01 01` → costante
- `09 01` → serviceId = 0x0109 (265 = DEV_INFO)
- `08 02 10 02 22 23...` → protobuf:
  - field 1 = 2 (cmdId)
  - field 2 = 2 (seqNum)
  - field 4 = { field 1=1, field 2=35, field 3=6, field 5="2.0.7.16",
    field 6="2.0.7.16", field 8=30, field 10=1, field 12=100, field 18=1 }
- `9D 86` → CRC16

**Interpretazione DEV_INFO field 4**:
- field 5/6: versione firmware ("2.0.7.16")
- field 12: livello batteria (100%)
- field 8: luminosità display (30?)

**Stringhe di riferimento**:
```
"EvenBleTransport(headId: 0x"
"EvenBleTransport::fromBytes: headId is not 0xAA. Received: 0x"
"EvenBleTransport::fromBytes: Data too short for a valid BLE packet. Minimum length is "
"EvenBleTransport::fromBytes: Data length mismatch. Expected at least header ("
"crc16"        ← funzione Dart per il checksum
"verifyCrc"    ← funzione Dart per la verifica
```

---

## 5. Service ID — Identificatori Servizio (CONFERMATI)

Ogni serviceId identifica un "modulo" del firmware degli occhiali.
**I valori numerici sotto sono confermati dall'analisi di pacchetti BLE reali.**

### Service ID con Valori Numerici Confermati

| Valore | Hex | Nome Simbolico | Descrizione | Pacchetti osservati |
|--------|------|----------------|-------------|---------------------|
| **1** | 0x0001 | `UI_DEFAULT_APP_ID` | App di default | 2 |
| **8** | 0x0008 | `UI_BACKGROUND_DASHBOARD_APP_ID` | **Dashboard** (aggiornamenti display) | **130** (65%!) |
| **12** | 0x000C | `SERVICE_MODULE_CONFIGURE_APP_ID` | Configurazione moduli | 2 |
| **14** | 0x000E | `UI_TRANSLATE_APP_ID` | Traduzione / notifiche | 10 |
| **128** | 0x0080 | (SYSTEM) | Sistema | 2 |
| **264** | 0x0108 | `SERVICE_SYNC_INFO_APP_ID` | Sincronizzazione info | 18 |
| **265** | 0x0109 | (DEV_INFO) | Informazioni device | 2 |
| **269** | 0x010D | `UX_DEVICE_SETTINGS_APP_ID` | Impostazioni device | 2 |
| **384** | 0x0180 | `UI_BACKGROUND_NAVIGATION_ID` | **Navigazione** | 16 |

### Distribuzione Comandi Confermata (dal log con navigazione attiva)

| serviceId:cmdId | Pacchetti | Significato probabile |
|-----------------|-----------|----------------------|
| 8:7 | 44 | Dashboard: richiesta creazione pagina |
| 8:8 | 58 | Dashboard: aggiornamento/ricostruzione pagina |
| 8:5 | 2 | Dashboard: inizializzazione |
| 8:? (no cmdId) | 26 | Dashboard: conferma/ack |
| 384:6 | 16 | Navigazione: heartbeat/aggiornamento |
| 264:15 | 12 | Sync: aggiornamento periodico |
| 14:2 | 6 | Traduzione: status notify |
| 14:1 | 2 | Traduzione: comando |
| 14:4 | 2 | Traduzione: configurazione |
| 265:2 | 2 | DEV_INFO: risposta info device |
| 269:1 | 2 | Device settings: query |
| 128:128 | 2 | Sistema: stato |
| 12:2 | 2 | Configurazione moduli |
| 1:1 | 2 | Default: inizializzazione |

**Pattern dominante**: cmdId=7 e cmdId=8 su serviceId=8 si alternano ogni ~1 secondo.
Questo è il ciclo di rendering della **UI di navigazione** (crea pagina → invia immagine → ricostruisci).

### Altri Service ID (dal codice, valori numerici non ancora confermati)

| Nome Simbolico | Descrizione |
|----------------|-------------|
| `UI_TRANSCRIBE_APP_ID` | Trascrizione speech-to-text |
| `UI_TELEPROMPT_APP_ID` | Teleprompter |
| `UI_CONVERSATE_APP_ID` | AI chat |
| `UI_HEALTH_APP_ID` | Dati salute |
| `UI_SETTING_APP_ID` | Impostazioni |
| `UI_ONBOARDING_APP_ID` | Setup iniziale |
| `UI_QUICKLIST_APP_ID` | Lista rapida azioni |
| `UI_LOGGER_APP_ID` | Debug/logging |
| `UI_FOREGROUND_NOTIFICATION_ID` | Notifiche push |
| `UI_FOREGROUND_EVEN_AI_ID` | Assistente AI |
| `UI_FOREGROUND_MEUN_ID` | Menu principale |
| `UI_FOREGROUND_SYSTEM_ALERT_APP_ID` | Alert di sistema |
| `UI_FOREGROUND_SYSTEM_CLOSE_APP_ID` | Chiusura app |
| `UI_BACKGROUND_EVENHUB_APP_ID` | EvenHub background |
| `UX_GLASSES_CASE_APP_ID` | Stato custodia |
| `UX_RING_DATA_RELAY_ID` | Dati dal Ring R1 |
| `UX_RING_ROW_DATA_ID` | Dati grezzi Ring |
| `UX_OTA_TRANSMIT_CMD_ID` | Comandi OTA |
| `UX_OTA_TRANSMIT_RAW_DATA_ID` | Dati raw OTA |
| `UX_OTA_EXPORT_FILE_CMD_ID` | Export firmware |
| `UX_OTA_EXPORT_FILE_RAW_DATA_ID` | Dati export |
| `UX_EVEN_FILE_SERVICE_CMD_SEND_ID` | Invio file |
| `UX_EVEN_FILE_SERVICE_RAW_SEND_DATA_ID` | Dati file |
| `UX_EVEN_FILE_SERVICE_CMD_EXPORT_ID` | Export file |
| `UX_EVEN_FILE_SERVICE_RAW_EXPORT_DATA_ID` | Dati export |

---

## 6. BleDataPackage — Protobuf

Ogni servizio ha il proprio set di messaggi protobuf. Il pacchetto viene costruito con:

```dart
BleDataPackage.fromServiceId(serviceId)  // crea wrapper per il serviceId
```

### Protobuf Packages (generati da .proto files)

| Package | File Dart | Servizio |
|---------|-----------|----------|
| `translate` | `translate.pb.dart` | Traduzione |
| `transcribe` | `transcribe.pb.dart` | Trascrizione |
| `teleprompt` | `teleprompt.pb.dart` | Teleprompter |
| `conversate` | `conversate.pb.dart` | AI Chat |
| `dashboard` | `dashboard.pb.dart` | Dashboard |
| `menu` | `menu.pb.dart` | Menu |
| `notification` | `notification.pb.dart` | Notifiche |
| `navigation` | `navigation.pb.dart` | Navigazione |
| `health` | `health.pb.dart` | Salute |
| `even_ai` | `even_ai.pb.dart` | Even AI |
| `EvenHub` | `EvenHub.pb.dart` | EvenHub |
| `quicklist` | `quicklist.pb.dart` | QuickList |
| `onboarding` | `onboarding.pb.dart` | Onboarding |
| `g2_setting` | `g2_setting.pb.dart` | Impostazioni G2 |
| `dev_settings` | `dev_settings.pb.dart` | Device settings |
| `dev_config_protocol` | `dev_config_protocol.pb.dart` | Config protocollo |
| `dev_infomation` | `dev_infomation.pb.dart` | Info device |
| `dev_pair_manager` | `dev_pair_manager.pb.dart` | Pairing |
| `module_configure` | `module_configure.pb.dart` | Configurazione moduli |
| `sync_info` | `sync_info.pb.dart` | Sync info |
| `glasses_case` | `glasses_case.pb.dart` | Custodia |
| `ring` | `ring.pb.dart` | Ring R1 |
| `logger` | `logger.pb.dart` | Logger |
| `ota_transmit` | `ota_transmit.pbenum.dart` | OTA (solo enum) |
| `efs_transmit` | `efs_transmit.pbenum.dart` | File service (solo enum) |
| `common` | `common.pbenum.dart` | Tipi comuni |
| `service_id_def` | `service_id_def.pbenum.dart` | Definizione service ID |

### Flusso Costruzione Pacchetto (Dart)

```
BleG2CmdProtoExt._createDashboardDataPackage(protobufMessage)
    ↓
BleDataPackage(serviceId=UI_BACKGROUND_DASHBOARD_APP_ID, payload=protobuf.writeToBuffer())
    ↓
BleG2CmdProtoExt.sendDataPackage(package)
    ↓
EvenBleTransport(headId=0xAA, serviceId, cmdId, seqNum, payload, crc32)
    ↓
BleG2CmdTransport._splitDataIntoPackets(transportBytes, mtu)
    ↓
BleG2CmdTransport._sendPacketInternal(packet)
    ↓
Flutter MethodChannel → "sendCmd" {uuid, data, psType}
    ↓
Android: BleManager.sendCmd(uuid, data, psType)
    ↓
BleDevice.writeCharacteristic(data, psType)
    ↓
BluetoothGatt.writeCharacteristic(characteristic, data, WRITE_TYPE_DEFAULT)
```

---

## 7. Comandi Protocollo (App ↔ OS)

### Comandi App → Occhiali

| Comando | Direzione | Descrizione |
|---------|-----------|-------------|
| `APP_REQUEST_START_UP` | App → OS | Avvio app/servizio |
| `APP_REQUEST_EXIT` | App → OS | Uscita dall'app |
| `APP_REQUEST_CREATE_STARTUP_PAGE_PACKET` | App → OS | Crea pagina iniziale |
| `APP_REQUEST_REBUILD_PAGE_PACKET` | App → OS | Ricostruisci pagina |
| `APP_REQUEST_SHUTDOWN_PAGE_PACKET` | App → OS | Chiudi pagina |
| `APP_UPDATE_IMAGE_RAW_DATA_PACKET` | App → OS | **Invia dati immagine raw** |
| `APP_UPDATE_TEXT_DATA_PACKET` | App → OS | **Invia dati testo** |
| `APP_REQUEST_AUDIO_CTR_PACKET` | App → OS | Controllo audio |
| `APP_REQUEST_SYNC_INFO` | App → OS | Sincronizza informazioni |
| `APP_REQUEST_HEARTBEAT_PACKET` | App → OS | Heartbeat |
| `APP_SEND_BASIC_INFO` | App → OS | Info base (versione, etc.) |
| `APP_SEND_MENU_INFO` | App → OS | Informazioni menu |
| `APP_SEND_HEARTBEAT_CMD` | App → OS | Comando heartbeat |
| `APP_SEND_MAX_MAP_FILE` | App → OS | File mappa max |
| `APP_SEND_ERROR_INFO_MSG` | App → OS | Messaggi errore |
| `APP_Send_Dominant_Hand` | App → OS | Mano dominante |
| `APP_Send_Gesture_Control` | App → OS | Controllo gesture |
| `APP_Send_Gesture_Control_List` | App → OS | Lista controlli gesture |
| `APP_Send_Universe_Setting` | App → OS | Impostazioni universali |
| `APP_INQUIRE_DASHBOARD_AUTO_CLOSE_VALUE` | App → OS | Query auto-close dashboard |
| `APP_SET_DASHBOARD_AUTO_CLOSE_VALUE` | App → OS | Set auto-close dashboard |
| `APP_REQUEST_NAVIGATION_COMPLETE` | App → OS | Navigazione completata |
| `APP_REQUEST_RECALCULATING_LOCATION_START` | App → OS | Ricalcolo posizione |

### Risposte App

| Risposta | Descrizione |
|----------|-------------|
| `APP_RESPOND_SUCCESS` | Operazione riuscita |
| `APP_RESPOND_PARAMETER_ERROR` | Errore parametri |
| `APP_REQUEST_CREATE_PAGE_SUCCESS` | Pagina creata con successo |
| `APP_REQUEST_REBUILD_PAGE_SUCCESS` | Pagina ricostruita |
| `APP_REQUEST_REBUILD_PAGE_FAILD` | Ricostruzione fallita |
| `APP_REQUEST_AUDIO_CTR_SUCCESS` | Controllo audio ok |
| `APP_REQUEST_AUDIO_CTR_FAILED` | Controllo audio fallito |
| `APP_REQUEST_UPGRADE_IMAGE_RAW_DATA_SUCCESS` | Immagine raw inviata ok |
| `APP_REQUEST_UPGRADE_IMAGE_RAW_DATA_FAILED` | Immagine raw fallita |
| `APP_REQUEST_UPGRADE_TEXT_DATA_SUCCESS` | Testo inviato ok |
| `APP_REQUEST_UPGRADE_TEXT_DATA_FAILED` | Testo fallito |
| `APP_REQUEST_CREATE_INVAILD_CONTAINER` | Container non valido |
| `APP_REQUEST_CREATE_OUTOFMEMORY_CONTAINER` | Container out of memory |
| `APP_REQUEST_CREATE_OVERSIZE_RESPONSE_CONTAINER` | Container troppo grande |

### Risposte OS (Occhiali → App)

| Risposta | Descrizione |
|----------|-------------|
| `OS_RESPONSE_CREATE_STARTUP_PAGE_PACKET` | Conferma creazione pagina |
| `OS_RESPONSE_IMAGE_RAW_DATA_PACKET` | **Conferma ricezione immagine** |
| `OS_RESPONSE_TEXT_DATA_PACKET` | Conferma ricezione testo |
| `OS_RESPONSE_REBUILD_PAGE_PACKET` | Conferma ricostruzione pagina |
| `OS_RESPONSE_SHUTDOWN_PAGE_PACKET` | Conferma chiusura pagina |
| `OS_RESPONSE_AUDIO_CTR_PACKET` | Conferma controllo audio |
| `OS_RESPONSE_HEARTBEAT_PACKET` | Risposta heartbeat |
| `OS_RESPONSE_MENU_INFO` | Info menu |

---

## 8. Display e Invio Immagini

### Flusso Display

Il display degli occhiali G2 usa un sistema a **pagine**. L'app deve:

1. **Creare una pagina** → `APP_REQUEST_CREATE_STARTUP_PAGE_PACKET`
2. **Attendere conferma** ← `OS_RESPONSE_CREATE_STARTUP_PAGE_PACKET`
3. **Inviare contenuto**:
   - Testo: `APP_UPDATE_TEXT_DATA_PACKET`
   - Immagine: `APP_UPDATE_IMAGE_RAW_DATA_PACKET`
4. **Aggiornare** → `APP_REQUEST_REBUILD_PAGE_PACKET` (se necessario)
5. **Chiudere** → `APP_REQUEST_SHUTDOWN_PAGE_PACKET`

### Funzioni Display (Dart)

| Funzione | Descrizione |
|----------|-------------|
| `writeFrame` | Scrive un frame di immagine al display |
| `writeFrames` | Scrive multipli frame |
| `_writeFrameControlChunk` | Chunk di controllo frame |
| `_writeFrames` | Implementazione interna |
| `clearFrame` | Pulisce il display |
| `assembleDisplayView` | Assembla la view da visualizzare |
| `assembleGlassesImage` | Prepara immagine per gli occhiali |
| `assembleGlassesLive` | Prepara vista live |
| `setImage` | Imposta immagine |
| `setVisibleDisplay` | Controlla visibilità display |
| `setGlassesDisplayDataFilter` | Imposta filtro dati display |
| `shouldFilterTokenForGlassesDisplay` | Filtra token per display |

### GlassesDisplayDataFilter

Sistema di filtraggio che decide quali dati mostrare sul display degli occhiali:
```
GlassesDisplayDataFilter
GlassesDisplayDataFilterExtension|fromName
glassesDisplayDataFilterKey
_buildGlassesDisplayDataFilterOption
_buildGlassesDisplayDataFilterSelector
```

### Display View Timer

```
HomeCtlPublicExt|_cancelDisplayViewTimer
HomeCtlPublicExt|_startOrResetDisplayViewTimer
DisplayViewTimer
```

---

## 9. Sistema BMP — Encoding Immagini

### Classi BMP

| Classe | Ruolo |
|--------|-------|
| `BmpFileHeader` | Header file BMP standard |
| `BmpImageSizeData` | Dimensioni immagine |
| `BmpCompression` | Enum tipi compressione |
| `bmpEncode` | Funzione encoding BMP |
| `_stepBmpEncode` | Encoding incrementale (step-by-step) |
| `compressBmpData` | Compressione dati BMP |
| `_EvenRleCompressor` | Compressore RLE proprietario Even |

### Tipi di Compressione BMP

Dalla ricerca sulle stringhe, i tipi supportati sono:

| Tipo | Descrizione |
|------|-------------|
| `monochrome` | 1-bit, bianco/nero |
| `gray4bit` | 4-bit grayscale (16 livelli) |
| `grayscale` | 8-bit grayscale (256 livelli) |
| `rle4` | RLE compresso 4-bit |
| `rle8` | RLE compresso 8-bit |
| `paletteRle` | RLE con palette |
| `grayRle` | RLE grayscale |
| `rgbRle` | RLE RGB |
| `cmykRle4` | RLE 4-bit CMYK |
| `cmykRle8` | RLE 8-bit CMYK |

### Flusso Encoding Immagine

```
1. Flutter renderizza la view (testo/icone) su un Canvas
2. assembleGlassesImage() → bitmap Flutter
3. bmpEncode(bitmap) → dati BMP con header
4. compressBmpData(bmpData) → compressione RLE (se supportata)
5. BleG2CmdProto._createXxxDataPackage(compressedData)
6. Wrapping in EvenBleTransport + protobuf
7. _splitDataIntoPackets() → frammentazione per MTU
8. sendCmd() via BLE
```

### Display G2 — Specifiche Confermate

| Parametro | Valore |
|-----------|--------|
| **Risoluzione** | **640 x 350 pixel** |
| **Tipo** | Micro-LED con waveguide (HAO 2.0) |
| **Colore** | Monocromatico (verde) |
| **Refresh rate** | 60 Hz |
| **Luminosità** | fino a 1200 nits |
| **Pass-through** | 98% |
| **Display** | Su entrambe le lenti |

*(Fonte: specifiche ufficiali Even Realities)*

### Formato Dati Immagine

Il display Micro-LED monocromatico verde degli Even G2 riceve immagini come BMP.
L'immagine viene inviata come:

```
BmpFileHeader (14 bytes):
  Magic: "BM"
  FileSize: uint32
  Reserved: uint32 (0)
  DataOffset: uint32

BmpInfoHeader (40+ bytes):
  HeaderSize: uint32 (40)
  Width: int32
  Height: int32
  Planes: uint16 (1)
  BitCount: uint16 (1 = mono, 4 = gray, 8 = full gray)
  Compression: uint32 (0=none, 1=RLE8, 2=RLE4)
  ImageSize: uint32
  ...

Pixel Data:
  Packed bits/bytes, bottom-up scanlines
```

---

## 10. Trasporto Multi-Pacchetto

### Frammentazione

Quando i dati protobuf superano la MTU (247 byte default), il layer `BleG2CmdTransport` li frammenta:

```dart
_splitDataIntoPackets(data, mtu)
// maxPayloadSize = mtu - headerLength
// Divide data in chunk da maxPayloadSize
// Ogni chunk ha sequenceNumber incrementale
```

### Classi Multi-Pacchetto

| Classe | Ruolo |
|--------|-------|
| `EvenBleMultiPacketItem` | Rappresenta un item multi-pacchetto in assembling |
| `_processPacketQueue` | Processa la coda di pacchetti |
| `_sendPacketInternal` | Invio pacchetto singolo |
| `_waitForPacketResponse` | Attende risposta per pacchetto |
| `_parseRetryPackets` | Parse pacchetti per retry |
| `_handlePacketResponse` | Gestisce risposta pacchetto |
| `_isPacketResponse` | Verifica se è una risposta pacchetto |
| `_completePacketItemAsCanceled` | Cancella item pacchetto |
| `_getPacketItemServiceId` | Ottiene serviceId dal pacchetto |

### Flusso Multi-Pacchetto

```
1. sendDataPackage(protobufPayload)
2. EvenBleTransport.toBytes() → serializza header + payload
3. _splitDataIntoPackets(bytes, currentMtu)
4. Per ogni chunk:
   a. _sendPacketInternal(chunk)
   b. _waitForPacketResponse() → attende ACK
   c. Se timeout/errore → _parseRetryPackets() → retry
5. Quando tutti i chunk inviati → completa
```

### Coda Comandi Nativa (Kotlin)

Il layer nativo ha la sua coda seriale:

```kotlin
// BleManager.sendCmd()
sendCmdQueue.add(BleCmd(uuid, psType, data, false))
if (sendCmdQueue.size == 1) {
    sendCmdQueue.poll()
    device.writeCharacteristic(data, psType)
}

// onCharacteristicWrite callback
val nextCmd = sendCmdQueue.poll()
if (nextCmd != null) {
    device.writeCharacteristic(nextCmd.data, nextCmd.psType)
}
```

Questo garantisce che solo un write BLE sia in corso alla volta.

---

## 11. File Service

### Even File Service (EFS)

| Service ID | Descrizione |
|------------|-------------|
| `UX_EVEN_FILE_SERVICE_CMD_SEND_ID` | Comando invio file |
| `UX_EVEN_FILE_SERVICE_RAW_SEND_DATA_ID` | Dati raw invio |
| `UX_EVEN_FILE_SERVICE_CMD_EXPORT_ID` | Comando export file |
| `UX_EVEN_FILE_SERVICE_RAW_EXPORT_DATA_ID` | Dati raw export |

### Comandi File Service

| Comando | Descrizione |
|---------|-------------|
| `EVEN_FILE_SERVICE_CMD_SEND_START` | Avvia invio file |
| `EVEN_FILE_SERVICE_CMD_SEND_DATA` | Invia dati file |
| `EVEN_FILE_SERVICE_CMD_SEND_RESULT_CHECK` | Verifica risultato invio |
| `EVEN_FILE_SERVICE_CMD_EXPORT_START` | Avvia export |
| `EVEN_FILE_SERVICE_CMD_EXPORT_DATA` | Dati export |
| `EVEN_FILE_SERVICE_CMD_EXPORT_RESULT_CHECK` | Verifica risultato export |

### File Path Occhiali

`BleG2GlassesFilePath` — enum/classe per i percorsi file nel filesystem degli occhiali.

---

## 12. Heartbeat e Keep-Alive

### Tipi Heartbeat

| Tipo | Funzione |
|------|----------|
| `APP_SEND_HEARTBEAT_CMD` | Heartbeat generico |
| `APP_REQUEST_HEARTBEAT_PACKET` | Richiesta heartbeat |
| `OS_RESPONSE_HEARTBEAT_PACKET` | Risposta heartbeat |
| `CONNECT_HEART_PACKET` | Heartbeat di connessione |
| `BASE_CONNECT_HEART_BEAT` | Heartbeat base |
| `APP_REQUEST_UPGRADE_HEARTBEAT_PACKET_SUCCESS` | Heartbeat durante OTA |

### Implementazione

```
BleG2ServicePublicExt|startBleHeartbeat  → avvia heartbeat periodico
BleG2ServicePublicExt|resetHeartbeat     → reset
BleG2ServicePrivateExt|_executeBleConnectHeartBeat → esecuzione BLE
BleG2ServicePrivateExt|_executeHeartbeat → esecuzione generica
BleG2CmdProtoDeviceSettingsExt|sendHeartbeat → via protobuf
cancelHeartbeat → annulla
```

### HeartBeatPacket

```
HeartBeatPacket._@2404181980  → classe Dart per il pacchetto heartbeat
```

---

## 13. OTA / Firmware Update

### Service ID

| Service ID | Descrizione |
|------------|-------------|
| `UX_OTA_TRANSMIT_CMD_ID` | Comandi OTA |
| `UX_OTA_TRANSMIT_RAW_DATA_ID` | Dati raw firmware |
| `UX_OTA_EXPORT_FILE_CMD_ID` | Export file OTA |
| `UX_OTA_EXPORT_FILE_RAW_DATA_ID` | Dati raw export |

### OTA Header

```
BleG2OtaHeader {
  otaMagic1: ...,           // Magic number 1
  components: ...,          // Lista componenti firmware
  otaMagic2: ...,           // Magic number 2
  payloadCrc32: ...,        // CRC32 payload
}

BleG2OtaHeader.fromBytes(data)  → parse header OTA
calculatePayloadMagicNum()      → calcola magic number
```

### Errori OTA

```
OTA_RECV_RSP_HEADER_ERR         — errore header risposta
APP_REQUEST_UPGRADE_SHUTDOWN_FAILED/SUCCESS — shutdown upgrade
```

### Nordic DFU

Per G1 (Nordic NUS): usa libreria Nordic DFU standard (`no.nordicsemi.android.dfu`).

---

## 14. Ring R1 — Relay Dati

### Service ID

| Service ID | Descrizione |
|------------|-------------|
| `UX_RING_DATA_RELAY_ID` | Dati relay dal Ring |
| `UX_RING_ROW_DATA_ID` | Dati raw Ring |

### Comandi Ring

```
BleG2CmdProtoRingExt|openRingBroadcast  → apre broadcast Ring
BleG2CmdProtoRingExt|switchRingHand     → cambia mano Ring
BleRing1CmdPrivateExt|_handleMultiPacket → gestisce multi-pacchetti Ring
BleRing1CmdPrivateExt|_handleCmdResponse → gestisce risposte Ring
BleRing1CmdOldExt|unpair                → unpair Ring
BleRing1CmdPublicExt|sendCmd            → invio comando Ring
```

### Ring File Service

```
BleRing1FilePrivateExt|_handleRing1FileDataReceive → ricezione dati file
BleRing1FilePrivateExt|handleRing1FileReceive      → gestione ricezione
BleRing1FilePublicExt|startReceiveFile             → avvia ricezione file
BleRing1FilePrivateExt|_sendFileCmd                → invio comando file
```

---

## 15. Ricostruzione Pratica — Guida Step-by-Step

### Requisiti

- Dispositivo con BLE (Android/Linux/macOS)
- Libreria BLE (bleak per Python, flutter_blue, etc.)
- Libreria Protobuf
- Conoscenza dei .proto files (da ricostruire)

### Step 1: Connessione BLE

```python
import asyncio
from bleak import BleakClient, BleakScanner

# Scan per dispositivi Even
devices = await BleakScanner.discover()
even_device = [d for d in devices if "Even" in (d.name or "")]

# Connetti
client = BleakClient(even_device[0].address)
await client.connect()

# Richiedi MTU 247
await client.request_mtu(247)

# Scopri servizi — cerca Even Custom (2760)
services = client.services
for s in services:
    print(f"Service: {s.uuid}")
    for c in s.characteristics:
        print(f"  Char: {c.uuid} props={c.properties}")
```

### Step 2: Setup Notifiche

```python
# Even Custom Service — Canale 1 (CONFERMATO da G2 reale)
WRITE_UUID = "00002760-08c2-11e1-9073-0e8ac72e5401"   # Write (app → occhiali)
NOTIFY_UUID = "00002760-08c2-11e1-9073-0e8ac72e5402"   # Notify (occhiali → app)

# Handler per ricevere pacchetti
def notification_handler(sender, data):
    if data[0] == 0xAA:
        payload_len = data[3]
        if payload_len >= 2:
            service_id = int.from_bytes(data[6:8], 'little')
            print(f"ServiceId={service_id}, payload={payload_len}B, hex={data.hex()}")

# Abilita notifiche
await client.start_notify(NOTIFY_UUID, notification_handler)
```

### Step 3: Costruzione Pacchetto (FORMATO CONFERMATO)

```python
import struct

def crc16(data: bytes, init: int = 0xFFFF) -> int:
    """
    CRC-16/CCITT-FALSE — CONFERMATO al 100% (184/184 pacchetti reali).
    Poly=0x1021, init=0xFFFF, no final XOR, MSB-first.
    INPUT: solo protobuf payload (packet[8:], esclusi header 8 byte e CRC 2 byte).
    OUTPUT: 2 byte Little Endian appesi al pacchetto.
    """
    crc = init
    for byte in data:
        crc ^= byte << 8
        for _ in range(8):
            if crc & 0x8000:
                crc = (crc << 1) ^ 0x1021
            else:
                crc <<= 1
            crc &= 0xFFFF
    return crc

def build_protobuf_simple(cmd_id: int, seq_num: int, extra_fields: bytes = b"") -> bytes:
    """Costruisce un protobuf minimo con cmdId (field 1) e seqNum (field 2)."""
    def encode_varint(value):
        result = []
        while value > 0x7F:
            result.append((value & 0x7F) | 0x80)
            value >>= 7
        result.append(value)
        return bytes(result)

    pb = b""
    pb += bytes([0x08]) + encode_varint(cmd_id)     # field 1 = cmdId
    pb += bytes([0x10]) + encode_varint(seq_num)     # field 2 = seqNum
    pb += extra_fields
    return pb

def build_even_packet(service_id: int, protobuf_payload: bytes) -> bytes:
    """
    Costruisce un pacchetto EvenBleTransport completo.
    FORMATO CONFERMATO da analisi pacchetti reali G2.
    """
    payload = struct.pack('<H', service_id) + protobuf_payload
    payload_len = len(payload)

    # Header: AA 12 [byte2] [payloadLen] 01 01
    packet = bytes([0xAA, 0x12, 0x00, payload_len, 0x01, 0x01])
    packet += payload

    # CRC16 — CONFERMATO: calcolato solo sul protobuf payload (byte 8+)
    # cioè: payload SENZA i primi 2 byte del serviceId (quelli sono ai byte 6-7)
    # ATTENZIONE: il CRC copre packet[8:], cioè SOLO il protobuf, non l'header
    protobuf_only = protobuf_payload  # == packet[8:] (dopo header + serviceId)
    crc = crc16(protobuf_only)
    packet += struct.pack('<H', crc)

    return packet

# Esempio: costruisci pacchetto heartbeat (payload vuoto → protobuf vuoto)
heartbeat = bytes([0xAA, 0x12, 0x00, 0x00, 0x01, 0x01])
heartbeat += struct.pack('<H', crc16(b''))  # CRC di payload vuoto = 0xFFFF
```

### Step 4: Invio Immagine sul Display

```python
from PIL import Image
import io

def encode_bmp_mono(image_path: str, width: int, height: int) -> bytes:
    """
    Converte un'immagine in BMP monocromatico per il display G2.
    Il display G2 è MicroLED verde, monocromatico.
    La risoluzione va ancora confermata — provare 640x480, 576x136, etc.
    """
    img = Image.open(image_path)
    img = img.resize((width, height))
    img_mono = img.convert('1')  # 1-bit monochrome

    bmp_buffer = io.BytesIO()
    img_mono.save(bmp_buffer, format='BMP')
    return bmp_buffer.getvalue()

async def send_image_to_glasses(client, service_id: int = 8, mtu: int = 247):
    """
    Ciclo display degli occhiali G2 (confermato dal traffico reale):

    1. Crea pagina:  serviceId=8, cmdId=5 (inizializzazione)
    2. Loop rendering:
       a. cmdId=7 → APP_REQUEST_CREATE_STARTUP_PAGE (richiesta creazione pagina)
       b. Attendi OS_RESPONSE → conferma
       c. cmdId=8 → APP_UPDATE_IMAGE_RAW_DATA (invia dati immagine BMP compressi)
       d. Attendi OS_RESPONSE → conferma
    3. Per aggiornare: ripeti dal punto 2
    4. Per chiudere: APP_REQUEST_SHUTDOWN_PAGE
    """
    WRITE_UUID = "00002760-08c2-11e1-9073-0e8ac72e5401"

    # Step 1: Crea pagina
    seq = 1
    create_pb = build_protobuf_simple(cmd_id=5, seq_num=seq)
    create_pkt = build_even_packet(service_id=8, protobuf_payload=create_pb)
    await client.write_gatt_char(WRITE_UUID, create_pkt)
    await asyncio.sleep(0.1)

    # Step 2: Invia immagine (frammentata per MTU)
    seq += 1
    bmp_data = encode_bmp_mono("test.png", 640, 350)  # CONFERMATO: 640x350 Micro-LED

    # Il payload BMP va wrappato in un campo protobuf (probabilmente field 3 o 6)
    # length-delimited: tag + varint_len + data
    bmp_field = bytes([0x1A])  # field 3, wire type 2 (length-delimited)
    bmp_len_varint = encode_varint(len(bmp_data))
    extra = bmp_field + bmp_len_varint + bmp_data

    update_pb = build_protobuf_simple(cmd_id=8, seq_num=seq, extra_fields=extra)
    full_payload = struct.pack('<H', service_id) + update_pb

    # Frammenta per MTU
    header_overhead = 8  # AA + 12 + byte2 + payloadLen + 01 01 + CRC16
    max_payload = mtu - header_overhead

    for i in range(0, len(full_payload), max_payload):
        chunk = full_payload[i:i + max_payload]
        packet = build_even_packet(service_id=8, protobuf_payload=chunk)
        await client.write_gatt_char(WRITE_UUID, packet)
        await asyncio.sleep(0.05)

def encode_varint(value):
    result = []
    while value > 0x7F:
        result.append((value & 0x7F) | 0x80)
        value >>= 7
    result.append(value)
    return bytes(result)
```

### Step 5: Sistema WYSWYG (What You See is What You Get)

Il display degli G2 usa un sistema **WYSWYG** con widget separati per ogni funzione.
Dall'analisi del codice Dart:

```
wyswyg_controller.dart    ← Controller principale
wyswyg_widget.dart        ← Widget root
wyswyg_helper.dart        ← Utility
Widget specifici:
  dashboard_widget.dart   ← Dashboard (meteo, ora, notifiche)
  navigate_widget.dart    ← Navigazione turn-by-turn
  translation_widget.dart ← Traduzione real-time
  teleprompt_widget.dart  ← Teleprompter
  converse_widget.dart    ← AI chat
```

Ogni widget viene renderizzato come **immagine BMP** e inviato agli occhiali
tramite il ciclo cmdId=7 (crea pagina) → cmdId=8 (aggiorna immagine).

### Step 6: Cattura Pacchetti (per completare il RE)

Per ottenere le informazioni mancanti (risoluzione, CRC esatto, proto schemas):

1. **nRF Connect** (Android) — cattura GATT notifications
2. **Android HCI snoop log** — abilita in Developer Options
3. **Wireshark** — analizza btsnoop_hci.log
4. **Frida hook** su `writeCharacteristic` — cattura pacchetti in uscita

```bash
# Esempio Frida hook
frida -U -f com.even.sg -l hook_ble.js

# hook_ble.js
Java.perform(() => {
    const BluetoothGatt = Java.use("android.bluetooth.BluetoothGatt");
    BluetoothGatt.writeCharacteristic.overload(
        "android.bluetooth.BluetoothGattCharacteristic", "[B", "int"
    ).implementation = function(char, data, writeType) {
        console.log("Write to: " + char.getUuid());
        console.log("Data: " + Array.from(data).map(b =>
            ('0' + (b & 0xFF).toString(16)).slice(-2)).join(' '));
        return this.writeCharacteristic(char, data, writeType);
    };
});
```

### Cosa Manca (da Determinare)

| Info | Status | Come Ottenere |
|------|--------|---------------|
| Valori numerici service ID | **9 CONFERMATI** | ~~Sniffing~~ FATTO |
| Formato header pacchetto | **CONFERMATO** | ~~Sniffing~~ FATTO |
| Risoluzione display G2 | **CONFERMATA: 640x350** | ~~Catturare pacchetto~~ Specifiche ufficiali |
| Algoritmo CRC16 esatto | **CONFERMATO** | CRC-16/CCITT-FALSE (poly=0x1021, init=0xFFFF), calcolato su `packet[8:]` (solo protobuf). Verificato 184/184 pacchetti. La chiave era lo scope: CRC su protobuf soltanto, NON su header+serviceId |
| Byte 2 dell'header | **SCONOSCIUTO** | Analizzare la correlazione con il contenuto |
| Schema .proto completo | **PARZIALE** | Raccogliere più pacchetti per ogni serviceId |
| Formato BMP immagini | **DA FARE** | Catturare pacchetti di tipo immagine (cmdId=8) |
| Compressione RLE Even | **DA FARE** | Analizzare payload immagine compressi |

### Approccio Consigliato (aggiornato)

1. **FATTO** ~~Connettiti via BLE, service discovery~~
2. **FATTO** ~~Cattura pacchetti con nRF Connect~~
3. **PROSSIMO**: Cattura un **HCI snoop log completo** con l'app Even attiva (per vedere anche i pacchetti in USCITA, non solo le notifiche in ingresso)
4. **PROSSIMO**: Identifica la risoluzione del display dai pacchetti immagine
5. **FATTO**: CRC16 confermato: CRC-16/CCITT-FALSE su packet[8:] (184/184 match)
6. **POI**: Ricostruisci i .proto files dai payload catturati
7. **POI**: Invia un testo semplice (più facile delle immagini)
8. **POI**: Sperimenta con BMP monocromatico

---

## Appendice A — Mappa Completa UUID

```
Even Custom (00002760-08C2-11E1-9073-0E8AC72Exxxx):
  0001 — Service base
  0002 — Characteristic base
  1001 — Service secondario
  5401 — Write canale 1 (psType 0?)
  5402 — Read/Notify canale 1
  5450 — Notify canale 1
  6401 — Write canale 2 (psType 1?)
  6402 — Read/Notify canale 2
  6450 — Notify canale 2
  7401 — Write canale 3 (psType 2?)
  7402 — Read/Notify canale 3
  7450 — Notify canale 3

Nordic UART (6E40xxxx-B5A3-F393-E0A9-E50E24DCCA9E):
  0001 — Service
  0002 — TX Write
  0003 — RX Notify

BAE8 (BAE8xxxx-4F05-4503-8E65-3AF1F7329D1F):
  ⚠ NON presente su G2 firmware 2.0.7.16! Trovato solo nel codice decompilato.
  0001 — Service
  0012 — Write (app → device)
  0013 — Notify (device → app)

CCCD: 00002902-0000-1000-8000-00805f9b34fb
```

## Appendice B — Tutte le Classi Protocollo Dart

```
# Transport Layer
EvenBleTransport              — serializzazione pacchetto BLE
BleG2CmdTransport             — frammentazione e sequencing
BleG2CmdTransportPrivateExt   — metodi privati transport
BleG2CmdTransportPublicExt    — metodi pubblici transport
EvenBleMultiPacketItem        — item multi-pacchetto

# Command Protocol
BleG2CmdProto                 — costruzione comandi protobuf
BleG2CmdProtoExt              — estensioni per ogni DataPackage
BleG2CmdProtoDeviceSettingsExt — comandi device settings
BleG2CmdProtoRingExt          — comandi Ring R1
BleG2CmdPsTypeCommonExt       — gestione psType comune

# Service
BleG2CmdService               — servizio comandi
BleG2FileServiceMixin          — mixin file service
BleG2OtaUpgradeMixin           — mixin OTA upgrade

# Data Packages (Protobuf)
BleDataPackage                — wrapper generico
ConversateDataPackage         — AI chat
DashboardDataPackage          — Dashboard
DevCfgDataPackage             — Config device
EvenAIDataPackage             — Even AI
GlassesCaseDataPackage        — Custodia
HealthDataPackage             — Salute
NotificationDataPackage       — Notifiche
OnboardingDataPackage         — Onboarding
QuicklistDataPackage          — QuickList
RingDataPackage               — Ring R1
TelepromptDataPackage         — Teleprompter
TranscribeDataPackage         — Trascrizione
TranslateDataPackage          — Traduzione

# BMP / Display
BmpFileHeader                 — header BMP
BmpImageSizeData              — dimensioni immagine
BmpCompression                — enum compressione
_EvenRleCompressor            — compressore RLE proprietario

# Models (Kotlin/nativo)
BleConfig                     — configurazione device
BlePrivateService             — servizio GATT
BleDevice                     — device connesso
BleCmd                        — comando BLE
BleWriteAndRead               — mapping psType → characteristic
BleConnectState               — enum 21 stati connessione
BleMC                         — enum 17 comandi MethodChannel
BleEC                         — enum 5 EventChannel
```

## Appendice C — Servizi GATT Confermati (nRF Connect scan, G2 firmware 2.0.7.16)

```
Device: Even G2_32_R_A4DE80 (E8:9D:EF:A4:DE:80)

Generic Access (0x1800)
  - Device Name [R] (0x2A00)
  - Appearance [R] (0x2A01)
  - Central Address Resolution [R] (0x2AA6)

Generic Attribute (0x1801)
  - Service Changed [I] (0x2A05) + CCCD
  - Client Supported Features [R W] (0x2B29)
  - Database Hash [R] (0x2B2A)

Device Information (0x180A)
  - Manufacturer Name String [R] (0x2A29)
  - Model Number String [R] (0x2A24)
  - Serial Number String [R] (0x2A25)
  - Firmware Revision String [R] (0x2A26)
  - Hardware Revision String [R] (0x2A27)

Even Custom Service 1 (00002760-08c2-11e1-9073-0e8ac72e1001)
  - Char [WNR] (00002760-08c2-11e1-9073-0e8ac72e0001)
  - Char [N]   (00002760-08c2-11e1-9073-0e8ac72e0002) + CCCD

Even Custom Service 2 — Canale 1 / psType=0 (00002760-08c2-11e1-9073-0e8ac72e5450)
  - Write [WNR] (00002760-08c2-11e1-9073-0e8ac72e5401)   ← APP → GLASSES
  - Notify [N]  (00002760-08c2-11e1-9073-0e8ac72e5402) + CCCD  ← GLASSES → APP ★

Even Custom Service 3 — Canale 2 / psType=1 (00002760-08c2-11e1-9073-0e8ac72e6450)
  - Write [WNR] (00002760-08c2-11e1-9073-0e8ac72e6401)
  - Notify [N]  (00002760-08c2-11e1-9073-0e8ac72e6402) + CCCD

Even Custom Service 4 — Canale 3 / psType=2 (00002760-08c2-11e1-9073-0e8ac72e7450)
  - Write [WNR] (00002760-08c2-11e1-9073-0e8ac72e7401)
  - Notify [N]  (00002760-08c2-11e1-9073-0e8ac72e7402) + CCCD

Nordic UART Service (6e400001-b5a3-f393-e0a9-e50e24dcca9e)
  - RX [W WNR] (6e400002-...)
  - TX [N]     (6e400003-...) + CCCD

★ = Tutti i 200 pacchetti nel log sono stati ricevuti su questa characteristic
```

## Appendice D — Pacchetti Reali Decodificati (esempi)

### DEV_INFO (serviceId=265, cmdId=2)
```
Raw:  AA-12-53-2B-01-01-09-01-08-02-10-02-22-23-08-01-10-23-18-06-
      2A-08-32-2E-30-2E-37-2E-31-36-32-08-32-2E-30-2E-37-2E-31-36-
      40-1E-50-01-60-64-90-01-01-9D-86

Header:  AA 12 53 2B 01 01
ServiceId: 0x0109 (265 = DEV_INFO)
Protobuf:
  field 1 = 2  (cmdId)
  field 2 = 2  (seqNum)
  field 4 = {
    field 1 = 1    (device type?)
    field 2 = 35   (0x23 — hardware revision?)
    field 3 = 6    (?)
    field 5 = "2.0.7.16"  (firmware version left)
    field 6 = "2.0.7.16"  (firmware version right)
    field 8 = 30   (brightness level?)
    field 10 = 1   (?)
    field 12 = 100 (battery level %)
    field 18 = 1   (charging status?)
  }
CRC: 9D 86
```

### Dashboard Update (serviceId=8, cmdId=8)
```
Raw:  AA-12-87-09-01-01-08-00-08-08-10-98-01-32-00-E0-7C

ServiceId: 0x0008 (8 = DASHBOARD)
Protobuf:
  field 1 = 8    (cmdId = aggiornamento pagina)
  field 2 = 152  (seqNum)
  field 6 = ""   (dati vuoti — probabilmente ACK/conferma)
```

### Navigation Heartbeat (serviceId=384, cmdId=6)
```
Raw:  AA-12-37-08-01-01-80-01-08-06-10-37-2A-00-68-7C

ServiceId: 0x0180 (384 = NAVIGATION)
Protobuf:
  field 1 = 6    (cmdId = heartbeat navigazione)
  field 2 = 55   (seqNum)
  field 5 = ""   (dati vuoti — keep-alive)
```

### Heartbeat (payload vuoto)
```
Raw:  AA-12-87-00-01-01-08-02

PayloadLen = 0, nessun serviceId/protobuf
Appare ogni ~5-6 secondi come keep-alive della connessione BLE
```
