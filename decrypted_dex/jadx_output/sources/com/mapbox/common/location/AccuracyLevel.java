package com.mapbox.common.location;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum AccuracyLevel {
    PASSIVE,
    LOW,
    MEDIUM,
    HIGH,
    HIGHEST;

    private int getValue() {
        return ordinal();
    }
}
