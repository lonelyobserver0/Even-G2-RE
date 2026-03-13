package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum RoadItemLocation {
    RIGHT(StubApp.getString2(14891)),
    LEFT(StubApp.getString2(14890)),
    ABOVE(StubApp.getString2(15173)),
    ON_SURFACE(StubApp.getString2(15175)),
    ABOVE_LANE(StubApp.getString2(15177));

    private String str;

    RoadItemLocation(String str) {
        this.str = str;
    }

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
