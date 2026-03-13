package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum TurnSignalStatus {
    OFF(StubApp.getString2(15477)),
    RIGHT(StubApp.getString2(14891)),
    LEFT(StubApp.getString2(14890));

    private String str;

    TurnSignalStatus(String str) {
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
