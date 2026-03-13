package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum NavigationStatusOrigin {
    LOCATION_UPDATE(StubApp.getString2(15128)),
    LEG_CHANGE(StubApp.getString2(15130)),
    SET_ROUTE(StubApp.getString2(15132)),
    UNCONDITIONAL(StubApp.getString2(15133)),
    ROUTE_REFRESH(StubApp.getString2(15135));

    private String str;

    NavigationStatusOrigin(String str) {
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
