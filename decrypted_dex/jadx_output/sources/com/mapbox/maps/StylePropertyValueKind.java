package com.mapbox.maps;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum StylePropertyValueKind {
    UNDEFINED,
    CONSTANT,
    EXPRESSION,
    TRANSITION;

    private int getValue() {
        return ordinal();
    }
}
