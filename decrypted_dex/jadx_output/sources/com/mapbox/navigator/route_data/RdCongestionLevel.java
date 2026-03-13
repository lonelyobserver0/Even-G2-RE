package com.mapbox.navigator.route_data;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum RdCongestionLevel {
    UNKNOWN,
    LOW,
    MODERATE,
    HEAVY,
    SEVERE;

    private int getValue() {
        return ordinal();
    }
}
