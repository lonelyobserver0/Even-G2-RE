package com.mapbox.navigator.route_data;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum RdLaneIndication {
    NONE,
    STRAIGHT,
    SHARP_LEFT,
    LEFT,
    SLIGHT_LEFT,
    SLIGHT_RIGHT,
    RIGHT,
    SHARP_RIGHT,
    UTURN;

    private int getValue() {
        return ordinal();
    }
}
