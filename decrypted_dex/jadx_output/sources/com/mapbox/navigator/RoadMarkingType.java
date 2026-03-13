package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum RoadMarkingType {
    UNKNOWN(StubApp.getString2(2164)),
    NO_BOUNDARY(StubApp.getString2(15355)),
    SOLID(StubApp.getString2(15063)),
    DASHED(StubApp.getString2(15065)),
    DOUBLE_LINE_SOLID_SOLID(StubApp.getString2(15357)),
    DOUBLE_LINE_SOLID_DASHED(StubApp.getString2(15359)),
    DOUBLE_LINE_DASHED_SOLID(StubApp.getString2(15361));

    private String str;

    RoadMarkingType(String str) {
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
