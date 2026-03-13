package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum NetworkStatus {
    NOT_REACHABLE(StubApp.getString2(13407)),
    REACHABLE_VIA_WI_FI(StubApp.getString2(13409)),
    REACHABLE_VIA_ETHERNET(StubApp.getString2(13411)),
    REACHABLE_VIA_WWAN(StubApp.getString2(13413));

    private String str;

    NetworkStatus(String str) {
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
