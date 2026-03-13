#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
EVEN_APKS="/home/loneobs/Code/Even/RE/even-apks"
BUILD_TOOLS="/home/loneobs/Android/Sdk/build-tools/36.1.0"
APKTOOL_JAR="/home/loneobs/.apklab/apktool_2.12.1.jar"
KEYSTORE="$ROOT/debug.keystore"
KEY_ALIAS="androiddebugkey"
KEY_PASS="android"
GADGET_SO="/tmp/frida-gadget-android-arm64.so"
OUT_DIR="$ROOT/gadget_signed"
TMP_DIR="$ROOT/gadget_tmp"

BASE_DECODED="$ROOT/base_apktool"
BASE_UNSIGNED="$OUT_DIR/base_gadget_unsigned.apk"
BASE_ALIGNED="$OUT_DIR/base_gadget_aligned.apk"
ARM64_WORK="$TMP_DIR/arm64_split"
ARM64_UNSIGNED="$OUT_DIR/split_config.arm64_v8a.gadget.unsigned.apk"
ARM64_ALIGNED="$OUT_DIR/split_config.arm64_v8a.gadget.aligned.apk"
XXXHDPI_ALIGNED="$OUT_DIR/split_config.xxxhdpi.aligned.apk"
IT_ALIGNED="$OUT_DIR/split_config.it.aligned.apk"

if [[ ! -f "$GADGET_SO" ]]; then
  echo "Missing $GADGET_SO"
  exit 1
fi

if [[ ! -f "$KEYSTORE" ]]; then
  keytool -genkeypair \
    -keystore "$KEYSTORE" \
    -storepass "$KEY_PASS" \
    -keypass "$KEY_PASS" \
    -alias "$KEY_ALIAS" \
    -dname "CN=Android Debug,O=Android,C=US" \
    -keyalg RSA \
    -keysize 2048 \
    -validity 10000 >/dev/null 2>&1
fi

rm -rf "$OUT_DIR" "$TMP_DIR"
mkdir -p "$OUT_DIR" "$ARM64_WORK/lib/arm64-v8a"

echo "[1/5] Building patched base.apk"
java -jar "$APKTOOL_JAR" b "$BASE_DECODED" -o "$BASE_UNSIGNED" >/dev/null
"$BUILD_TOOLS/zipalign" -f -p 4 "$BASE_UNSIGNED" "$BASE_ALIGNED"

echo "[2/5] Building patched arm64 split with Frida Gadget"
unzip -q "$EVEN_APKS/split_config.arm64_v8a.apk" -d "$ARM64_WORK"
cp -f "$GADGET_SO" "$ARM64_WORK/lib/arm64-v8a/libfrida-gadget.so"
(
  cd "$ARM64_WORK"
  zip -qr "$ARM64_UNSIGNED" .
)
"$BUILD_TOOLS/zipalign" -f -p 4 "$ARM64_UNSIGNED" "$ARM64_ALIGNED"

echo "[3/5] Aligning untouched splits"
"$BUILD_TOOLS/zipalign" -f -p 4 "$EVEN_APKS/split_config.xxxhdpi.apk" "$XXXHDPI_ALIGNED"
"$BUILD_TOOLS/zipalign" -f -p 4 "$EVEN_APKS/split_config.it.apk" "$IT_ALIGNED"

echo "[4/5] Signing APK set"
"$BUILD_TOOLS/apksigner" sign --ks "$KEYSTORE" --ks-key-alias "$KEY_ALIAS" --ks-pass "pass:$KEY_PASS" --key-pass "pass:$KEY_PASS" "$BASE_ALIGNED"
"$BUILD_TOOLS/apksigner" sign --ks "$KEYSTORE" --ks-key-alias "$KEY_ALIAS" --ks-pass "pass:$KEY_PASS" --key-pass "pass:$KEY_PASS" "$ARM64_ALIGNED"
"$BUILD_TOOLS/apksigner" sign --ks "$KEYSTORE" --ks-key-alias "$KEY_ALIAS" --ks-pass "pass:$KEY_PASS" --key-pass "pass:$KEY_PASS" "$XXXHDPI_ALIGNED"
"$BUILD_TOOLS/apksigner" sign --ks "$KEYSTORE" --ks-key-alias "$KEY_ALIAS" --ks-pass "pass:$KEY_PASS" --key-pass "pass:$KEY_PASS" "$IT_ALIGNED"

echo "[5/5] Done"
printf '%s\n' \
  "$BASE_ALIGNED" \
  "$ARM64_ALIGNED" \
  "$XXXHDPI_ALIGNED" \
  "$IT_ALIGNED"
