package com.microsoft.cognitiveservices.speech.util;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class JsonValueJNI {
    public static boolean asBoolean(SafeHandle safeHandle, int i3) {
        if (kind(safeHandle, i3) != 98) {
            Contracts.throwIfFail(5L);
        }
        return asBoolean(safeHandle, i3, false);
    }

    private static final native boolean asBoolean(SafeHandle safeHandle, int i3, boolean z2);

    private static final native double asDouble(SafeHandle safeHandle, int i3, double d8);

    public static float asFloat(SafeHandle safeHandle, int i3) {
        if (kind(safeHandle, i3) != 49) {
            Contracts.throwIfFail(5L);
        }
        return (float) asDouble(safeHandle, i3, 0.0d);
    }

    public static long asInt(SafeHandle safeHandle, int i3) {
        if (kind(safeHandle, i3) != 49) {
            Contracts.throwIfFail(5L);
        }
        return asInt(safeHandle, i3, 0L);
    }

    private static final native long asInt(SafeHandle safeHandle, int i3, long j);

    public static final native String asJson(SafeHandle safeHandle, int i3);

    public static String asString(SafeHandle safeHandle, int i3) {
        if (kind(safeHandle, i3) != 34) {
            Contracts.throwIfFail(5L);
        }
        return asString(safeHandle, i3, null);
    }

    private static final native String asString(SafeHandle safeHandle, int i3, String str);

    public static final native int count(SafeHandle safeHandle, int i3);

    private static final native int createJsonParserHandle(String str, IntRef intRef);

    public static JsonValue createParser(String str) {
        IntRef intRef = new IntRef(0L);
        return new JsonValue(createJsonParserHandle(str, intRef), new SafeHandle(intRef.getValue(), SafeHandleType.JSONVALUE));
    }

    private static final native int get(SafeHandle safeHandle, int i3, int i10, String str);

    private static final native String getName(SafeHandle safeHandle, int i3, int i10);

    public static String getName(SafeHandle safeHandle, int i3, int i10, String str) {
        return getName(safeHandle, i3, i10);
    }

    public static JsonValue getValue(SafeHandle safeHandle, int i3, int i10, String str) {
        return new JsonValue(get(safeHandle, i3, i10, str), safeHandle);
    }

    public static boolean hasValue(SafeHandle safeHandle, int i3, int i10, String str) {
        return get(safeHandle, i3, i10, str) > 0;
    }

    private static final native int kind(SafeHandle safeHandle, int i3);
}
