package com.mapbox.navigator.route_data;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum RdManeuverModifier {
    UTURN,
    SHARP_RIGHT,
    RIGHT,
    SLIGHT_RIGHT,
    STRAIGHT,
    SLIGHT_LEFT,
    LEFT,
    SHARP_LEFT;

    private int getValue() {
        return ordinal();
    }
}
