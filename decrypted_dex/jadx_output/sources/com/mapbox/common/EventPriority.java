package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum EventPriority {
    DEFERRED,
    QUEUED,
    IMMEDIATE;

    private int getValue() {
        return ordinal();
    }
}
