package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum IncidentCongestionDescription {
    UNKNOWN,
    NONE,
    VERY_LIGHT,
    LIGHT,
    MODERATE,
    HEAVY,
    SEVERE,
    STOPPED;

    private int getValue() {
        return ordinal();
    }
}
