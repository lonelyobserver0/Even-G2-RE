package com.google.gson;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface ExclusionStrategy {
    boolean shouldSkipClass(Class<?> cls);

    boolean shouldSkipField(FieldAttributes fieldAttributes);
}
