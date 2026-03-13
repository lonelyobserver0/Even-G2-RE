package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum LaneIndication {
    NONE(StubApp.getString2(9895)),
    STRAIGHT(StubApp.getString2(15050)),
    SHARP_LEFT(StubApp.getString2(15051)),
    LEFT(StubApp.getString2(14890)),
    SLIGHT_LEFT(StubApp.getString2(15053)),
    SLIGHT_RIGHT(StubApp.getString2(15055)),
    RIGHT(StubApp.getString2(14891)),
    SHARP_RIGHT(StubApp.getString2(15057)),
    UTURN(StubApp.getString2(15059));

    private String str;

    LaneIndication(String str) {
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
