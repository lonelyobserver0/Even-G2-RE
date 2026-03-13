package com.microsoft.cognitiveservices.speech.util;

import N9.b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class JsonBuilderJNI {
    public static int addItem(SafeHandle safeHandle, int i3, int i10, String str) {
        return builderAdd(safeHandle, i3, i10, str);
    }

    public static String asJsonCopy(SafeHandle safeHandle, int i3) {
        return builderAsJsonCopy(safeHandle, i3);
    }

    private static final native int builderAdd(SafeHandle safeHandle, int i3, int i10, String str);

    private static final native String builderAsJsonCopy(SafeHandle safeHandle, int i3);

    private static final native int builderSet(SafeHandle safeHandle, int i3, String str, int i10, String str2, boolean z2, int i11, double d8);

    public static JsonBuilder createBuilder() {
        IntRef intRef = new IntRef(0L);
        return new JsonBuilder(new SafeHandle(intRef.getValue(), SafeHandleType.JSONBUILDER), createJsonBuilderHandle(intRef));
    }

    private static final native int createJsonBuilderHandle(IntRef intRef);

    public static int setItem(SafeHandle safeHandle, int i3, String str, b bVar, String str2, boolean z2, int i10, double d8) {
        return builderSet(safeHandle, i3, str, bVar.f4946a, str2, z2, i10, d8);
    }
}
