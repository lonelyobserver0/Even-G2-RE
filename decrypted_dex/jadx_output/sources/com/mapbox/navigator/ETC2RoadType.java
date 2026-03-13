package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum ETC2RoadType {
    UNKNOWN(StubApp.getString2(2164)),
    HIGHWAY(StubApp.getString2(14941)),
    CITY_HIGHWAY(StubApp.getString2(14943)),
    NORMAL_ROAD(StubApp.getString2(14945)),
    OTHER(StubApp.getString2(13505));

    private String str;

    ETC2RoadType(String str) {
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
