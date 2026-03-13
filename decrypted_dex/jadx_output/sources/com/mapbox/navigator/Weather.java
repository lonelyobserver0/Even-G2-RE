package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum Weather {
    RAIN(StubApp.getString2(15490)),
    SNOW(StubApp.getString2(15492)),
    FOG(StubApp.getString2(15494)),
    WET_ROAD(StubApp.getString2(15496));

    private String str;

    Weather(String str) {
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
