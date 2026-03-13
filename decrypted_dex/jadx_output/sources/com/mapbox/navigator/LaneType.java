package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum LaneType {
    REVERSE(StubApp.getString2(15085)),
    BOTH_WAYS(StubApp.getString2(15087)),
    BUS(StubApp.getString2(15089));

    private String str;

    LaneType(String str) {
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
