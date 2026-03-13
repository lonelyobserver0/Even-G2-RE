package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum ActiveGuidanceGeometryEncoding {
    GEO_JSON(StubApp.getString2(14866)),
    POLYLINE5(StubApp.getString2(14868)),
    POLYLINE6(StubApp.getString2(14870));

    private String str;

    ActiveGuidanceGeometryEncoding(String str) {
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
