package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum GetRouteReason {
    NEW_ROUTE(StubApp.getString2(15003)),
    ALTERNATIVE(StubApp.getString2(15004)),
    REROUTE_BY_DEVIATION(StubApp.getString2(15006)),
    REROUTE_OTHER(StubApp.getString2(15007)),
    BACK_TO_ONLINE(StubApp.getString2(15008)),
    ROUTING_PARAMETERS_CHANGE(StubApp.getString2(15010)),
    ROUTE_INVALIDATED(StubApp.getString2(15012));

    private String str;

    GetRouteReason(String str) {
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
