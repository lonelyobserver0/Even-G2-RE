package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum LaneSeparatorType {
    SOLID(StubApp.getString2(15063)),
    DASHED(StubApp.getString2(15065)),
    DOUBLE(StubApp.getString2(15067)),
    DASHED_SOLID(StubApp.getString2(15068)),
    SOLID_DASHED(StubApp.getString2(15070)),
    EMPTY(StubApp.getString2(15072)),
    FENCE(StubApp.getString2(15073)),
    HATCHED_LINE(StubApp.getString2(15075)),
    SHORT_DASH(StubApp.getString2(15077)),
    CROSSED_LINE(StubApp.getString2(15079)),
    DASHED_POINT(StubApp.getString2(15081)),
    DOUBLE_DASHED_POINT(StubApp.getString2(15083)),
    UNKNOWN(StubApp.getString2(2164));

    private String str;

    LaneSeparatorType(String str) {
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
