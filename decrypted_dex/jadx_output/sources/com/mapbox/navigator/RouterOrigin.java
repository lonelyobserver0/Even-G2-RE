package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum RouterOrigin {
    ONLINE(StubApp.getString2(15441)),
    ONBOARD(StubApp.getString2(15442)),
    CUSTOM(StubApp.getString2(15164)),
    CUSTOM_EXTERNAL(StubApp.getString2(15444));

    private String str;

    RouterOrigin(String str) {
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
