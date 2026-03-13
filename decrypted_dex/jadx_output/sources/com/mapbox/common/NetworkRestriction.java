package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum NetworkRestriction {
    NONE(0),
    DISALLOW_EXPENSIVE(1),
    DISALLOW_ALL(255);

    public final int value;

    NetworkRestriction(int i3) {
        this.value = i3;
    }

    private int getValue() {
        return this.value;
    }
}
