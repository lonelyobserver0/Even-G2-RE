package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum PersistentStorageErrorCode {
    KEY_ALREADY_EXISTS,
    KEY_NOT_FOUND,
    CORRUPTED_DATA,
    IOERROR,
    UNKNOWN;

    private int getValue() {
        return ordinal();
    }
}
