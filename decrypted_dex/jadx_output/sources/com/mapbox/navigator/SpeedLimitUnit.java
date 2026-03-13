package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum SpeedLimitUnit {
    KILOMETRES_PER_HOUR(StubApp.getString2(15472)),
    MILES_PER_HOUR(StubApp.getString2(15474));

    private String str;

    SpeedLimitUnit(String str) {
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
