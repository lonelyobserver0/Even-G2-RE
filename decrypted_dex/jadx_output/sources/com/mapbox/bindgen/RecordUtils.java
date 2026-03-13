package com.mapbox.bindgen;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RecordUtils {
    private RecordUtils() {
    }

    public static String fieldToString(Object obj) {
        return obj == null ? "" : obj instanceof byte[] ? new String((byte[]) obj) : obj.toString();
    }
}
