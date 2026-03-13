package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum RerouteStrategyForMatchRoute {
    REROUTE_DISABLED(StubApp.getString2(15169)),
    NAVIGATE_TO_FINAL_DESTINATION(StubApp.getString2(15171));

    private String str;

    RerouteStrategyForMatchRoute(String str) {
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
