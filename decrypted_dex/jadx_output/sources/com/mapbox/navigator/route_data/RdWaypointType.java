package com.mapbox.navigator.route_data;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum RdWaypointType {
    REGULAR(StubApp.getString2(2143)),
    SILENT(StubApp.getString2(2144)),
    EV_CHARGING_SERVER(StubApp.getString2(2145)),
    EV_CHARGING_USER(StubApp.getString2(2146));

    private String str;

    RdWaypointType(String str) {
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
