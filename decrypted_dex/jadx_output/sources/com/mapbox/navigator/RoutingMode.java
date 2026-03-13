package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum RoutingMode {
    DRIVING(StubApp.getString2(15447)),
    WALKING(StubApp.getString2(13398)),
    CYCLING(StubApp.getString2(13396)),
    DRIVING_TRAFFIC(StubApp.getString2(15449));

    private String str;

    RoutingMode(String str) {
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
