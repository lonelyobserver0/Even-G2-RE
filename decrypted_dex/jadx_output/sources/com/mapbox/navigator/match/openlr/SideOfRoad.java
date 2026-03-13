package com.mapbox.navigator.match.openlr;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum SideOfRoad {
    ON_ROAD_OR_UNKNOWN(0, StubApp.getString2(15636)),
    RIGHT(1, StubApp.getString2(14891)),
    LEFT(2, StubApp.getString2(14890)),
    BOTH(3, StubApp.getString2(15634));

    private String str;
    public final int value;

    SideOfRoad(int i3, String str) {
        this.value = i3;
        this.str = str;
    }

    private int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
