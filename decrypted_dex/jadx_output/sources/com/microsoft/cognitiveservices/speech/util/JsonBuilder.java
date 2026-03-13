package com.microsoft.cognitiveservices.speech.util;

import N9.b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class JsonBuilder implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12741a;
    public int root;

    public JsonBuilder() {
        JsonBuilder createBuilder = JsonBuilderJNI.createBuilder();
        this.f12741a = createBuilder.f12741a;
        this.root = createBuilder.root;
    }

    public int addItem(int i3, int i10, String str) {
        return JsonBuilderJNI.addItem(this.f12741a, i3, i10, str);
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        SafeHandle safeHandle = this.f12741a;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12741a = null;
        }
    }

    public int setBoolean(int i3, boolean z2) {
        return JsonBuilderJNI.setItem(this.f12741a, i3, null, b.f4944e, null, z2, 0, 0.0d);
    }

    public int setDouble(int i3, double d8) {
        return JsonBuilderJNI.setItem(this.f12741a, i3, null, b.f4943d, null, false, 0, d8);
    }

    public int setInteger(int i3, int i10) {
        return JsonBuilderJNI.setItem(this.f12741a, i3, null, b.f4943d, null, false, i10, 0.0d);
    }

    public int setJson(int i3, String str) {
        return JsonBuilderJNI.setItem(this.f12741a, i3, str, b.f4941b, null, false, 0, 0.0d);
    }

    public int setString(int i3, String str) {
        return JsonBuilderJNI.setItem(this.f12741a, i3, null, b.f4942c, str, false, 0, 0.0d);
    }

    public String toString() {
        return JsonBuilderJNI.asJsonCopy(this.f12741a, this.root);
    }

    public JsonBuilder(SafeHandle safeHandle, int i3) {
        this.f12741a = safeHandle;
        this.root = i3;
    }
}
