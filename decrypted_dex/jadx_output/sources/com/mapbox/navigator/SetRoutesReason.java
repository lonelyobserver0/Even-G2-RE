package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum SetRoutesReason {
    CLEAN_UP(StubApp.getString2(15453)),
    NEW_ROUTE(StubApp.getString2(15003)),
    ALTERNATIVE(StubApp.getString2(15004)),
    REROUTE(StubApp.getString2(15455)),
    FALLBACK_TO_OFFLINE(StubApp.getString2(15456)),
    RESTORE_TO_ONLINE(StubApp.getString2(15458)),
    SWITCH_TO_ONLINE(StubApp.getString2(15460)),
    FASTEST_ROUTE(StubApp.getString2(15462)),
    ROUTING_PARAMETERS_CHANGE(StubApp.getString2(15010));

    private String str;

    SetRoutesReason(String str) {
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
