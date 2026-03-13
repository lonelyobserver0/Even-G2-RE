package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum ResourceLoadErrorType {
    ERRORED,
    UNSATISFIED,
    CANCELED,
    INVALID_ARGUMENT,
    INSUFFICIENT_STORAGE,
    INTEGRITY_CHECK_ERROR;

    private int getValue() {
        return ordinal();
    }
}
