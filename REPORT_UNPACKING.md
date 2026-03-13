# Report: Tentativo di Unpacking dell'App Even Realities (com.even.sg)

## 1. Analisi Iniziale dell'APK

### Struttura degli APK
L'app è distribuita come **split APK**:

| File | Dimensione | Contenuto |
|------|-----------|-----------|
| `base.apk` | 140 MB | DEX (packed), assets, risorse, Jiagu libs |
| `split_config.arm64_v8a.apk` | 160 MB | Librerie native ARM64 |
| `split_config.it.apk` | 29 KB | Risorse lingua italiana |
| `split_config.xxxhdpi.apk` | 218 KB | Risorse alta densità |

### Protezione: Qihoo 360 Jiagu (奇虎360加固)
L'app usa il packer/protector **360 Jiagu**. Il codice Java decompilato (`java_src/`) contiene solo lo **stub del packer**, non l'app vera.

**Classi dello stub:**
- `com.stub.StubApp` — Entry point Application, carica libjiagu e decripta il DEX reale
- `com.tianyu.util.C0000a` — Utility: deoffuscamento stringhe (XOR ^ 16), copia SO da assets
- `com.tianyu.util.DtcLoader` — Carica `libjgdtc.so` (crash reporting)
- `com.tianyu.util.QHClassLoader` — ClassLoader custom con intercettazione native
- `com.tianyu.util.Configuration` — Flag di configurazione

### File di protezione nell'APK
```
assets/.jgapp                    (16 bytes - marker file, contiene hash "43d45216df41551e")
assets/libjiagu.so               (720 KB - packer ARM 32-bit)
assets/libjiagu_a64.so           (893 KB - packer ARM 64-bit)
assets/libjiagu_x64.so           (856 KB - packer x86_64)
assets/libjiagu_x86.so           (761 KB - packer x86)
classes.dex                      (10.9 MB - stub DEX con payload crittografato)
```

### Librerie native dell'app (in split_config.arm64_v8a.apk)
```
libapp.so                 (29 MB - codice Dart/Flutter compilato)
libeven.so                (30.5 MB - libreria nativa proprietaria Even)
libflutter.so             (11 MB - Flutter engine)
libMicrosoft.CognitiveServices.Speech.* - Azure Speech SDK
libmapbox-*.so            - Mappe Mapbox
libonnxruntime.so         - ONNX Runtime (ML)
libsherpa-onnx-*.so       - Speech recognition
liblc3.so                 - Codec LC3 (Bluetooth LE Audio)
libmmkv.so                - MMKV storage
libsqlite3.so             - SQLite
```

**Nota importante:** L'app è una **Flutter app** — la logica principale è in `libapp.so` (Dart compilato), non nel DEX.

### Offuscamento stringhe
Il metodo `C0000a.m3a()` usa XOR con chiave 16 per deoffuscare le stringhe:

```java
public static String m3a(String str) {
    char[] charArray = str.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
        charArray[i] = (char) (charArray[i] ^ 16);
    }
    return String.valueOf(charArray);
}
```

Esempi decodificati:
- `"q~tb\u007fyt>q``>QsdyfydiDxbuqt"` → `android.app.ActivityThread`
- `"sebbu~dQsdyfydiDxbuqt"` → `currentActivityThread`
- `"wudCicdu}S\u007f~duhd"` → `getSystemContext`
- `"}Xyttu~Q`yGqb~y~wCx\u007fg~"` → `mHiddenApiWarningShown`

### Analisi del DEX
Il `classes.dex` ha solo **5 classi** ma è 10.9 MB. L'analisi entropica mostra:
- Il DEX header dichiara una dimensione uguale al file (10.9 MB)
- Blocchi ad alta entropia (>7.99) a offset ~0x140000 e ~0x500000-0x640000 = **payload crittografato**
- La data section reale del DEX è solo ~15 KB

### Stringhe rilevanti in libjiagu_a64.so
```
JIAGU_APP_NAME
JIAGU_ENCRYPTED_DEX_NAME
JIAGU_FILE_PATH
JIAGU_HASH_FILE_NAME
JIAGU_SO_BASE_NAME
RMUTGF_KEY
libijmDataEncryption
libjiagu_vip
```

### Firma APK
- Schema: **APK Signature Scheme v3**
- Certificate DN: `CN=Android, OU=Android, O=Google Inc., L=Mountain View, ST=California, C=US`
- SHA-256: `f1ff544cfa3112ab594a1591283d239b4b202496bf7ba03295a77a1f00bba779`

---

## 2. Flusso di Avvio dell'App

Dall'analisi di `StubApp.java`:

```
1. <clinit>()  — static initializer
   ↓
2. attachBaseContext(Context)
   ├── super.attachBaseContext(context)
   ├── C0000a.m9b()  — bypass hidden API restrictions (Android P)
   ├── Determina CPU ABI (ARM/x86, 32/64 bit)
   ├── Estrae libjiagu*.so da assets/ → .jiagu/
   ├── System.load(".jiagu/libjiagu_64.so")
   │   └── JNI_OnLoad()  — integrità check + registrazione metodi nativi
   ├── DtcLoader.init()  — carica libjgdtc.so
   ├── interface5(application)  — ★ DECRITTA IL DEX REALE ★
   ├── Carica la vera Application class via classLoader.loadClass(strEntryApplication)
   ├── Application.attach(context)  — chiama attach sulla vera app
   └── interface8(realApp, context)  — setup finale
   ↓
3. onCreate()
   ├── ChangeTopApplication()  — sostituisce StubApp con la vera Application
   ├── realApp.onCreate()
   └── interface21(realApp)
```

### Analisi di JNI_OnLoad in libjiagu_a64.so

Disassembly AArch64:
```asm
JNI_OnLoad:
    sub sp, sp, #0x20
    stp x19, x30, [sp, #0x10]
    mrs x19, TPIDR_EL0           // TLS (stack canary)
    ldr x8, [x19, #0x28]
    mov x3, x0                   // x3 = JavaVM*
    adrp x0, 0x19000
    adrp x2, 0x22000
    mov x4, x1                   // x4 = reserved
    add x0, x0, #0x498           // x0 = bytecode pointer
    add x2, x2, #0x1c0           // x2 = handler table
    mov w1, #0xb48               // w1 = 2888 (bytecode size)
    str x8, [sp, #0x8]
    bl interpreter_wrap_int64_t  // ★ VM interpreter ★
    ; ... stack canary check ...
    ret
```

**JNI_OnLoad è un thin wrapper** che chiama `interpreter_wrap_int64_t` — un **interprete di una VM custom** che esegue bytecode offuscato. Questo rende l'analisi statica della logica di integrità praticamente impossibile.

---

## 3. Dispositivo Fisico

- **Modello:** Realme RMX3851
- **Android:** 16
- **Build type:** user (NON rootato)
- **ADB:** connesso (`9d10a98`)
- **App Even installata:** com.even.sg

---

## 4. Tentativo 1: BlackDex (Unpacker senza root)

### Procedura
```bash
# Download BlackDex64 v3.2
curl -L -o /tmp/BlackDex64.apk \
  "https://github.com/CodingGay/BlackDex/releases/download/v3.2/app-BlackDex64.apk"

# Installazione
adb install /tmp/BlackDex64.apk  # Success

# Avvio
adb shell am start -n top.niunaijun.blackdexa64/top.niunaijun.blackdex.view.base.WelcomeActivity
```

### Risultato
**FALLITO** — BlackDex v3.2 restituisce "unpack failed". Probabilmente troppo vecchio per questa versione di Jiagu o incompatibile con Android 16.

---

## 5. Tentativo 2: Frida-Gadget Injection

### Setup
```bash
# Virtual environment con frida
python3 -m venv /tmp/frida-env
source /tmp/frida-env/bin/activate
pip install frida-tools frida-dexdump objection
# Frida version: 17.7.3

# Download frida-gadget ARM64
curl -sL -o /tmp/frida-gadget.so.xz \
  "https://github.com/frida/frida/releases/download/17.7.3/frida-gadget-17.7.3-android-arm64.so.xz"
xz -d /tmp/frida-gadget.so.xz

# Download apktool
curl -sL -o /tmp/apktool.jar \
  "https://github.com/iBotPeaches/Apktool/releases/download/v2.10.0/apktool_2.10.0.jar"
```

### Patching dell'APK
```bash
# Decompile
java -jar /tmp/apktool.jar d -f -o /tmp/even-patched base.apk

# Iniettare frida-gadget nel class initializer di StubApp
```

**Modifica smali** (`StubApp.smali`):
```smali
.method static constructor <clinit>()V
    .locals 3
    .prologue

    # AGGIUNTO: carica frida-gadget PRIMA di tutto
    const-string v0, "frida-gadget"
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    const/4 v2, 0x0
    ; ... resto del codice originale ...
```

**Modifica AndroidManifest.xml:**
```xml
<!-- Cambiato extractNativeLibs per permettere l'estrazione di frida-gadget -->
android:extractNativeLibs="true"
```

**Copia frida-gadget:**
```bash
mkdir -p /tmp/even-patched/lib/arm64-v8a
cp /tmp/frida-gadget.so /tmp/even-patched/lib/arm64-v8a/libfrida-gadget.so
```

### Build, Sign, Install
```bash
export PATH="$HOME/Android/Sdk/build-tools/36.1.0:$PATH"

# Build
java -jar /tmp/apktool.jar b -o /tmp/even-patched.apk /tmp/even-patched

# Zipalign
zipalign -f 4 /tmp/even-patched.apk /tmp/even-aligned.apk

# Genera chiave di firma
keytool -genkeypair -v -keystore /tmp/debug.keystore -alias debug \
  -keyalg RSA -keysize 2048 -validity 10000 \
  -storepass android -keypass android -dname "CN=Debug"

# Firma
apksigner sign --ks /tmp/debug.keystore --ks-pass pass:android \
  --key-pass pass:android /tmp/even-aligned.apk

# Ri-firma anche gli split APK con la stessa chiave
for apk in split_config.arm64_v8a.apk split_config.it.apk split_config.xxxhdpi.apk; do
    cp "even-apks/$apk" "/tmp/$apk"
    zipalign -f 4 "/tmp/$apk" "/tmp/aligned_$apk"
    apksigner sign --ks /tmp/debug.keystore --ks-pass pass:android \
      --key-pass pass:android "/tmp/aligned_$apk"
done

# Installa
adb install-multiple /tmp/even-aligned.apk \
  /tmp/aligned_split_config.arm64_v8a.apk \
  /tmp/aligned_split_config.it.apk \
  /tmp/aligned_split_config.xxxhdpi.apk
```

### Configurazione Frida Gadget

**Config file** (`lib/arm64-v8a/libfrida-gadget.config.so`):

Testate diverse configurazioni:

#### A) Modalità "listen" + "wait"
```json
{
  "interaction": {
    "type": "listen",
    "address": "127.0.0.1",
    "port": 27042,
    "on_load": "wait"
  }
}
```

#### B) Modalità "script" (auto-resume)
```json
{
  "interaction": {
    "type": "script",
    "path": "/data/local/tmp/even-bypass.js",
    "on_change": "ignore"
  }
}
```

#### C) Modalità "listen" + "resume"
```json
{
  "interaction": {
    "type": "listen",
    "address": "127.0.0.1",
    "port": 27042,
    "on_load": "resume"
  }
}
```

### Risultato
**Frida-gadget si carica correttamente**, ma `libjiagu_64.so` fallisce con:
```
FATAL EXCEPTION: main
java.lang.UnsatisfiedLinkError: JNI_ERR returned from JNI_OnLoad
  in "/data/data/com.even.sg/.jiagu/libjiagu_64.so"
```

**Jiagu rileva la modifica dell'APK** (firma diversa) nel suo `JNI_OnLoad` e rifiuta di procedere con la decrittazione del DEX.

---

## 6. Tentativo 3: Bypass Integrità via Native Hooks (openat redirect)

### Logica
Pushare l'APK originale (non modificato) sul device e hookkare le chiamate `openat`/`open` in libc per redirectare le letture di `base.apk` verso l'originale.

```bash
adb push base.apk /data/local/tmp/original_base.apk
```

### Script Frida (bypass openat)
```javascript
var originalApkPath = "/data/local/tmp/original_base.apk";

var libc = Process.getModuleByName("libc.so");
var openatAddr = libc.getExportByName("openat");

Interceptor.attach(openatAddr, {
    onEnter: function(args) {
        try {
            var path = args[1].readUtf8String();
            if (path && path.indexOf("base.apk") !== -1
                && path.indexOf("com.even.sg") !== -1) {
                this._newPath = Memory.allocUtf8String(originalApkPath);
                args[1] = this._newPath;
            }
        } catch(e) {}
    }
});
```

### Nota su Android 16
Su Android 16, i nomi degli export libc sono:
- `openat` ✓ (in `libc.so`)
- `open` ✓
- `openat64` ✓
- `fopen` ✓
- `access` ✓
- `stat` ✓

**Problema iniziale:** Usare `Module.getExportByName(null, "openat")` con `null` causa `TypeError: not a function`. Bisogna specificare `"libc.so"` come modulo.

### Risultato
**FALLITO** — Jiagu **non usa `openat`** per leggere l'APK. Probabilmente legge direttamente dalla memory-map dell'APK già creata dal framework Android. Gli hook su openat/open/fopen/access/stat non vengono mai triggerati per i file base.apk.

---

## 7. Tentativo 4: Bypass via Java Hooks (PackageManager spoofing)

### Logica
Hookkare `PackageManager.getPackageInfo()` a livello Java per restituire il certificato originale quando viene richiesta la firma dell'app.

### Estrazione certificato originale
```python
# Il certificato originale è stato estratto dal signing block v2 dell'APK
# Offset: 0x85e2078, lunghezza: 1421 bytes
# SHA-256: f1ff544cfa3112ab594a1591283d239b4b202496bf7ba03295a77a1f00bba779
# Salvato come base64 in /tmp/original_cert.b64
```

### Script Frida (Java hooks)
```javascript
Java.perform(function() {
    var Signature = Java.use("android.content.pm.Signature");
    var Base64 = Java.use("android.util.Base64");
    var ApplicationPackageManager = Java.use("android.app.ApplicationPackageManager");

    var certBytes = Base64.decode(ORIGINAL_CERT_B64, 0);
    var originalSignature = Signature.$new(certBytes);

    ApplicationPackageManager.getPackageInfo
        .overload('java.lang.String', 'int')
        .implementation = function(packageName, flags) {
            var result = this.getPackageInfo(packageName, flags);
            if (packageName === "com.even.sg" && (flags & 0x40) !== 0) {
                result.signatures.value = Java.array(
                    'android.content.pm.Signature', [originalSignature]
                );
            }
            return result;
        };
});
```

### Risultato
**FALLITO** — Jiagu non usa le API Java `PackageManager` per verificare la firma. Il check è interamente nel codice nativo (interpreter VM).

---

## 8. Tentativo 5: Sostituzione certificato nel signing block

### Logica
Patchare direttamente i byte del certificato nel signing block dell'APK firmato, sostituendo il certificato debug con quello originale.

### Analisi
```
Certificato debug:     714 bytes (RSA 2048-bit)
Certificato originale: 1421 bytes (chiave più grande)
```

### Risultato
**Non fattibile** — I certificati hanno dimensioni diverse, non è possibile fare un semplice swap di byte.

---

## 9. Tentativo 6: Intercettazione DEX post-interpreter (Hail Mary)

### Logica
L'idea è che Jiagu potrebbe **decriptare il DEX prima di verificare la firma**. Se così fosse, hookkando `interpreter_wrap_int64_t` e scansionando la memoria subito dopo il suo ritorno, potremmo trovare il DEX decriptato anche se JNI_OnLoad poi fallisce.

### Scoperta chiave: l'interpreter è una VM
`interpreter_wrap_int64_t` è l'unica funzione esportata significativa in libjiagu. JNI_OnLoad è un thin wrapper che la chiama con:
- `x0` = puntatore al bytecode (0x19498)
- `w1` = dimensione bytecode (0xb48 = 2888 bytes)
- `x2` = handler table (0x221c0)
- `x3` = JavaVM*
- `x4` = reserved

### Script Frida (hook interpreter + DEX scan)
```javascript
var libdl = Process.getModuleByName("libdl.so");
var dlopen_ext = libdl.getExportByName("android_dlopen_ext");

Interceptor.attach(dlopen_ext, {
    onEnter: function(args) {
        var path = args[0].readUtf8String();
        if (path && path.indexOf("jiagu") !== -1) this.isJiagu = true;
    },
    onLeave: function(retval) {
        if (this.isJiagu) {
            var jiagu = Process.getModuleByName("libjiagu_64.so");
            var interp = jiagu.getExportByName("interpreter_wrap_int64_t");

            Interceptor.attach(interp, {
                onLeave: function(retval) {
                    // Scan per DEX magic "dex\n" (0x0a786564 LE) in tutte le regioni r--
                    var ranges = Process.enumerateRanges({protection: 'r--', coalesce: true});
                    for (var k = 0; k < ranges.length; k++) {
                        if (ranges[k].base.readU32() === 0x0a786564) {
                            var fsize = ranges[k].base.add(0x20).readU32();
                            if (fsize > 50000 && fsize <= ranges[k].size) {
                                send({type:"dex"}, ranges[k].base.readByteArray(fsize));
                            }
                        }
                    }
                    // Forza JNI_VERSION_1_6
                    retval.replace(ptr(0x10006));
                }
            });
        }
    }
});
```

### Risultati dell'intercettazione
```
[INTERP#1] called, w1=0xb48    → JNI_OnLoad
[INTERP#2] called, w1=0xcf0    → (altra funzione)
[INTERP#3] called, w1=0x1d0    → (altra funzione)
[INTERP#4] called, w1=0x60     → returned: 0
[INTERP#5] called, w1=0x60     → returned: 0
[INTERP#6] called, w1=0x24     → returned: 0, 1, 0, -1
```

### Risultato
**FALLITO** — Il DEX **non viene decriptato** quando l'integrity check fallisce. L'interpreter verifica prima la firma e se fallisce non procede mai alla decrittazione. 0 DEX trovati in memoria dopo le chiamate all'interpreter.

---

## 10. Tentativo 7: Emulatore AVD rootato

### Approccio
Usare l'APK **originale non modificato** su un emulatore rootato con frida-server. Questo bypassa completamente il problema dell'integrity check perché l'APK non viene modificato.

### Genymotion (scartato)
- Installato Samsung Galaxy S23 emulato (Android 15, x86_64)
- **Problema:** Genymotion richiede account Pro per root

### Android Studio Emulator (AVD)
- Immagine: `google_apis` Android 14 (API 34) x86_64
- AVD: `even_test` (Pixel 6 profile, 4GB RAM)
- Supporta `adb root` nativamente

#### Setup completato con successo:
```bash
# Avvio emulatore (risolto problema Qt/Wayland con QT_QPA_PLATFORM=xcb)
QT_QPA_PLATFORM=xcb ~/Android/Sdk/emulator/emulator -avd even_test \
  -port 5554 -no-snapshot-load -gpu swiftshader_indirect &

# Root access
adb -s emulator-5554 root  # uid=0(root)

# SELinux permissive
adb -s emulator-5554 shell setenforce 0

# Frida-server 17.7.3 x86_64 installato
wget "https://github.com/frida/frida/releases/download/17.7.3/frida-server-17.7.3-android-x86_64.xz"
xz -d frida-server-17.7.3-android-x86_64.xz
adb -s emulator-5554 push frida-server /data/local/tmp/frida-server
adb -s emulator-5554 shell chmod 755 /data/local/tmp/frida-server
adb -s emulator-5554 shell "/data/local/tmp/frida-server -D &"

# Verifica frida funzionante
frida-ps -D emulator-5554  # ✓ lista processi visibile

# Installazione APK originale (tutti gli split)
adb -s emulator-5554 install-multiple \
  base.apk split_config.arm64_v8a.apk \
  split_config.it.apk split_config.xxxhdpi.apk  # Success
```

#### Problema ABI: Jiagu estrae la libreria sbagliata

L'emulatore è x86_64, ma l'app è installata con ARM64 native libs (traduzione NDK). Jiagu rileva la CPU reale (x86_64) ma il processo gira in modalità traduzione ARM64:

```
FATAL EXCEPTION: java.lang.UnsatisfiedLinkError:
  dlopen failed: "/data/data/com.even.sg/.jiagu/libjiagu_64.so"
  is for EM_X86_64 (62) instead of EM_AARCH64 (183)
```

**Causa:** `C0000a.m5a()` rileva la CPU x86_64 ed estrae `assets/libjiagu_x64.so`, ma il processo ARM64 (via NDK translation) si aspetta `assets/libjiagu_a64.so`.

#### Workaround: bind mount della versione ARM64

```bash
# Estrai la versione ARM64 di libjiagu dagli assets
unzip -o base.apk "assets/libjiagu_a64.so" -d /tmp/jiagu_fix/
adb push /tmp/jiagu_fix/assets/libjiagu_a64.so /data/local/tmp/libjiagu_a64.so

# Bind mount per sovrapporre la versione ARM64 a quella x86_64
adb shell "mount --bind /data/local/tmp/libjiagu_a64.so \
  /data/data/com.even.sg/.jiagu/libjiagu_64.so"

# Risultato: libjiagu_64.so ora punta alla versione ARM64
xxd -l 20 /data/data/com.even.sg/.jiagu/libjiagu_64.so
# 0300 b700 → EM_AARCH64 (183) ✓
```

Anche `libjiagu.so` (32-bit) deve essere la versione ARM64:
```bash
adb push /tmp/jiagu_fix/assets/libjiagu_a64.so \
  /data/data/com.even.sg/.jiagu/libjiagu.so
# Nota: la directory .jiagu/ è stata resa read-only (chmod 555) per
# impedire a Jiagu di sovrascrivere i nostri file con la versione x86_64
```

#### Crash nel layer di traduzione NDK

Con le librerie ARM64 correttamente piazzate, l'errore UnsatisfiedLinkError scompare, ma:

```
03-08 10:21:25.497  I ndk_translation: Initialized NDK translation (aarch64), version 0.2.3
...
03-08 10:21:25.840  F libc: Fatal signal 11 (SIGSEGV), code 2 (SEGV_ACCERR),
  fault addr 0x715e47010aa0 in tid 6569 (com.even.sg), pid 6569 (com.even.sg)
```

**Il codice nativo obfuscato di Jiagu è troppo complesso per il layer di traduzione ARM→x86_64 dell'emulatore.** La VM interpreter custom di Jiagu usa trucchi a basso livello (TLS, stack canary, memory scanning) che non sopravvivono alla traduzione.

#### Tentativi di hook Frida falliti sull'emulatore

1. **Hook Java `C0000a.m5a()`**: ClassNotFoundException — la classe è nel DEX packed, non accessibile prima del caricamento
2. **Hook `System.loadLibrary`**: Troppo invasivo, rompe le librerie di sistema (`libframework-connectivity-jni.so` not found)
3. **Hook `android_dlopen_ext`**: `Module.getExportByName("libdl.so", "android_dlopen_ext")` → `TypeError: not a function` (su Android 14 x86_64, la funzione è in `linker64`, non `libdl.so`)
4. **Hook `__loader_android_dlopen_ext` in `linker64`**: Hook installato con successo ma non triggerato per i load di Jiagu (possibile conflitto con il layer di traduzione)

### Risultato
**FALLITO** — L'emulatore x86_64 non può eseguire il codice nativo ARM64 di Jiagu a causa della complessità del suo interprete VM custom. Per il DEX dump serve un dispositivo ARM64 nativo con root.

---

## 11. Analisi Alternativa: Flutter/Dart via libapp.so (SUCCESSO)

### Approccio
Poiché l'app è Flutter, tutta la logica reale è compilata in `libapp.so` (Dart AOT), non nel DEX. L'analisi delle stringhe estratte da libapp.so fornisce informazioni equivalenti o superiori a quelle del DEX.

### Procedura
```bash
# Estrai librerie native
unzip -o split_config.arm64_v8a.apk "lib/arm64-v8a/*" -d /tmp/even_flutter/

# Estrai tutte le stringhe (131.858 stringhe trovate!)
strings -n 6 /tmp/even_flutter/lib/arm64-v8a/libapp.so > /tmp/even_flutter/all_strings.txt
```

### Risultati
Dalle stringhe del Dart AOT snapshot sono stati estratti:
- **Nomi completi di classi e metodi Dart** (package:even/..., package:even_connect/...)
- **Tutti gli endpoint API** (~75 sotto `/v2/g/`)
- **UUID BLE** (3 famiglie: Even 0x2760, Nordic UART 6E40, BAE8)
- **Protocollo completo occhiali-app** (30+ moduli Protobuf con service IDs)
- **Architettura multi-package** dell'app (even, even_core, even_connect, ecc.)
- **Pipeline audio** (AGC, noise reduction, speech enhancement, VAD, LC3)
- **3 backend ASR** (Azure, Soniox WebSocket, Sherpa-ONNX on-device)
- **AI on-device** (LLaMA inference in libeven.so)
- **Server di sviluppo hardcoded** (`http://192.168.2.113:8888`)

### Report completo
Il report dettagliato dell'analisi è in: **`REPORT_APP_ANALYSIS.md`** (1700+ righe, 22 sezioni)

---

## 12. Tentativo 8: Genymotion Android 9 x86 + Dummy libflutter.so — SUCCESSO!

### Setup
- **Emulatore:** Genymotion Samsung Galaxy S24 con Android 9 (API 28) x86
- **ARM Translation:** Houdini installato via `Genymotion-ARM-Translation_for_9.0.zip`
- **Frida:** frida-server 17.7.3 per x86

### Intuizione chiave
L'APK base **non ha directory `lib/`** — tutte le librerie native sono:
- **Jiagu:** negli `assets/` (disponibili per x86, x86_64, ARM, ARM64)
- **Flutter/app:** nello split `split_config.arm64_v8a.apk`

Installando **solo il base APK** (senza lo split arm64):
```bash
adb install base.apk   # Successo! Nessun errore ABI
```

Jiagu seleziona `libjiagu_x86.so` dagli assets e gira **nativamente** senza traduzione.

### Problema: crash immediato per libflutter.so mancante
```
Could not find 'libflutter.so'. Looked for: [x86, armeabi-v7a, armeabi], but only found: []
```
L'app crasha troppo velocemente (~2 secondi) per catturare i DEX.

### Soluzione: dummy libflutter.so
Compilata una libreria Flutter fittizia per x86:
```bash
gcc -m32 -shared -o libflutter.so dummy_flutter.c
# Copiata in /data/app/com.even.sg-*/lib/x86/
```
Il processo rimane vivo dopo il crash del Flutter (in `ep_poll`), mantenendo i DEX decriptati in memoria.

### DEX dump via scanner di memoria custom
Frida non riusciva ad attaccarsi al processo, quindi è stato scritto un **scanner di memoria nativo in C** compilato come ELF x86 statico. Il fix critico: usare `lseek64` e `_FILE_OFFSET_BITS=64` perché gli indirizzi del processo x86 superano i 2GB.

```bash
gcc -m32 -static -O2 -D_FILE_OFFSET_BITS=64 -o memdex3 memdex3.c
# Push su device, eseguito come root
/data/local/tmp/memdex3 <PID>
```

### Risultato: 12 DEX trovati!
```
[DEX] #1 at 0xcbbc61d4 size=10916856 ver=035  ← Jiagu stub
[DEX] #2 at 0xcd09a000 size=3325520 ver=039   ← ORIGINALE
[DEX] #3 at 0xcd3c6000 size=7820584 ver=039   ← ORIGINALE
[DEX] #4 at 0xcdb3c000 size=7093840 ver=039   ← ORIGINALE
[DEX] #5 at 0xcf580000 size=10916856 ver=035  ← Jiagu stub (dup)
[DEX] #10 at 0xeba25fc0 size=176328 ver=039   ← ORIGINALE
[DEX] #12 at 0xebebd000 size=176328 ver=039   ← ORIGINALE
```

**5 DEX unici decriptati** (versione 039, ~18.5MB totali):
| File | Dimensione | SHA256 (parziale) |
|------|-----------|-------------------|
| classes1.dex | 3.3 MB | b9cd5fc4... |
| classes2.dex | 7.8 MB | 436e99aa... |
| classes3.dex | 7.1 MB | 64d8b590... |
| classes4.dex | 176 KB | 4ac74904... |
| classes5.dex | 176 KB | 007f12e8... |

### Decompilazione con jadx
```bash
jadx -d jadx_output classes1.dex classes2.dex classes3.dex classes4.dex classes5.dex
```
- **8.541 classi** elaborate (39 errori minori)
- **13.517 file Java** decompilati
- Pacchetti principali:
  - `com/fzfstudio/ezw_ble/` — Plugin BLE Flutter nativo (BleManager, BleConfig, BleCmd...)
  - `io/flutter/` — Flutter engine e plugin
  - `com/google/firebase/` — Firebase, Crashlytics, Messaging
  - `com/llfbandit/record/` — Audio recording
  - `androidx/` — AndroidX framework
  - `okhttp3/` — HTTP client
  - `kotlin/` — Kotlin stdlib

### Note
- Le stringhe sono **offuscate** via `StubApp.getString2(index)` — il Jiagu cifra le stringhe e le decripta a runtime
- Il codice è pesantemente **ProGuard-offuscato** (classi `a`, `A`, `a0`, `B`...)
- La struttura e la logica del codice sono comunque leggibili

### File
- `decrypted_dex/` — DEX originali decriptati
- `decrypted_dex/jadx_output/` — Sorgenti Java decompilati

---

## 13. Riepilogo Finale

### Cosa abbiamo imparato
1. 360 Jiagu usa una **VM interpreter custom** (`interpreter_wrap_int64_t`) per offuscare la logica di protezione
2. L'integrity check è **nel codice nativo**, non nelle API Java
3. Jiagu legge l'APK dalla **memory-map** già esistente, non tramite `openat`/`open`
4. Il DEX viene decriptato **solo se** l'integrity check passa
5. L'app è una **Flutter app** — la logica principale è in `libapp.so` (Dart compilato)
6. **Il codice nativo obfuscato di Jiagu non funziona sotto traduzione NDK** (ARM→x86_64)
7. **Il base APK senza split arm64 si installa su x86 senza errori ABI** — Jiagu ha SO per tutte le architetture
8. **Una dummy libflutter.so mantiene il processo vivo** dopo il crash del Flutter, permettendo il dump DEX
9. **Gli indirizzi di memoria sopra 2GB richiedono lseek64** su processi a 32 bit
10. **Scanner di memoria custom in C** è necessario quando Frida non riesce ad attaccarsi

### Stato del DEX dump
**COMPLETATO!** — 5 DEX unici decriptati (18.5MB), 13.517 file Java decompilati con jadx

### Stato dell'analisi app
**COMPLETATO** — Report completo in `REPORT_APP_ANALYSIS.md` (22 sezioni, 1700+ righe) con:
- Protocollo BLE completo (G2, G1, Ring R1) — da stringhe libapp.so
- 75+ endpoint API REST
- Architettura Glasses OS con comandi/risposte
- Pipeline audio e ASR
- Even AI Assistant (macchina a stati, skills, wake-up)
- Health tracking, navigazione, traduzione, teleprompter
- Sicurezza e crittografia
- OTA e firmware updates
- **Layer BLE nativo Android** (da DEX decompilato) — BleManager, 21 stati di connessione, 17 comandi MethodChannel, 5 EventChannel, modelli dati completi
- **Plugin Flutter nativi** — FlutterEzwBlePlugin, TranslatePlugin (Azure)
- **Servizi Android** — EvNLService, NavigationForegroundService, EvDatabase
- **Offuscamento stringhe Jiagu** — meccanismo StubApp.getString2(), mapping indici noti

### Tool e file creati
- `/tmp/frida-env/` — Python venv con frida-tools 14.6.0, frida-dexdump 2.0.1, objection 1.12.3
- `/tmp/apktool.jar` — Apktool 2.10.0
- `/tmp/debug.keystore` — Keystore debug per firma APK
- `/tmp/even-patched/` — APK decompilato e patchato
- `/tmp/original_cert.b64` — Certificato originale in base64
- `/tmp/even-bypass*.js` — Script Frida per vari tentativi di bypass
- `/tmp/even-emu-hook*.js` — Script Frida per emulatore (fix ABI)
- `/tmp/jiagu_fix/` — Librerie ARM64 di Jiagu estratte
- `/tmp/even_flutter/` — Librerie Flutter/Dart estratte + all_strings.txt (131.858 stringhe)
- `/tmp/blutter_output/ANALYSIS.md` — Analisi Flutter grezza
- `/tmp/memdex3` — Scanner di memoria ELF x86 per DEX dump (C statico)
- `/tmp/jadx/` — Jadx 1.5.1 decompiler
- `~/Android/Sdk/cmdline-tools/latest/` — Android SDK cmdline tools
- `~/.android/avd/even_test.avd/` — AVD google_apis x86_64 (Android 14)
- `Genymotion-ARM-Translation_for_9.0.zip` — ARM translation per Genymotion Android 9
- `decrypted_dex/` — **DEX originali decriptati da Jiagu** (5 file unici)
- `decrypted_dex/jadx_output/` — **Codice Java decompilato** (13.517 file)
- `REPORT_APP_ANALYSIS.md` — Report finale analisi app (1700+ righe, 22 sezioni)
