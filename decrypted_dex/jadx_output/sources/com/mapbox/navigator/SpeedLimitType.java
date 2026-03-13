package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum SpeedLimitType {
    IMPLICIT(StubApp.getString2(15466)),
    EXPLICIT(StubApp.getString2(15468)),
    UNKNOWN(StubApp.getString2(2164)),
    PROLONGED(StubApp.getString2(15470));

    private String str;

    SpeedLimitType(String str) {
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
