package com.microsoft.cognitiveservices.speech.util;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class JsonValue implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final int f12742a;

    /* renamed from: b, reason: collision with root package name */
    public SafeHandle f12743b;

    public JsonValue(int i3, SafeHandle safeHandle) {
        this.f12742a = i3;
        this.f12743b = safeHandle;
    }

    public static JsonValue Parse(String str) {
        return JsonValueJNI.createParser(str);
    }

    public boolean asBoolean() {
        return JsonValueJNI.asBoolean(this.f12743b, this.f12742a);
    }

    public float asFloat() {
        return JsonValueJNI.asFloat(this.f12743b, this.f12742a);
    }

    public long asInt() {
        return JsonValueJNI.asInt(this.f12743b, this.f12742a);
    }

    public String asJson() {
        return JsonValueJNI.asJson(this.f12743b, this.f12742a);
    }

    public String asString() {
        return JsonValueJNI.asString(this.f12743b, this.f12742a);
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        SafeHandle safeHandle = this.f12743b;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12743b = null;
        }
    }

    public int count() {
        return JsonValueJNI.count(this.f12743b, this.f12742a);
    }

    public JsonValue get(int i3) {
        return JsonValueJNI.getValue(this.f12743b, this.f12742a, i3, null);
    }

    public String getName(int i3) {
        return JsonValueJNI.getName(this.f12743b, this.f12742a, i3, null);
    }

    public boolean hasValue(int i3) {
        return JsonValueJNI.hasValue(this.f12743b, this.f12742a, i3, null);
    }

    public JsonValue get(String str) {
        return JsonValueJNI.getValue(this.f12743b, this.f12742a, 0, str);
    }

    public boolean hasValue(String str) {
        return JsonValueJNI.hasValue(this.f12743b, this.f12742a, 0, str);
    }
}
