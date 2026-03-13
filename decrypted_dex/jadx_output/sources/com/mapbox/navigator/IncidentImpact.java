package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum IncidentImpact {
    UNKNOWN,
    CRITICAL,
    MAJOR,
    MINOR,
    LOW;

    private int getValue() {
        return ordinal();
    }
}
