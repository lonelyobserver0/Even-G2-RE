package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum RouteState {
    INVALID(StubApp.getString2(15429)),
    INITIALIZED(StubApp.getString2(15430)),
    TRACKING(StubApp.getString2(15431)),
    COMPLETE(StubApp.getString2(15432)),
    OFF_ROUTE(StubApp.getString2(15433)),
    UNCERTAIN(StubApp.getString2(15434));

    private String str;

    RouteState(String str) {
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
