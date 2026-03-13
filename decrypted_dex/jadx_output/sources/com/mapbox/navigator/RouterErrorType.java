package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum RouterErrorType {
    UNKNOWN(StubApp.getString2(2164)),
    REQUEST_CANCELLED(StubApp.getString2(13324)),
    THROTTLING_ERROR(StubApp.getString2(15435)),
    INPUT_ERROR(StubApp.getString2(15436)),
    NETWORK_ERROR(StubApp.getString2(13522)),
    AUTHENTICATION_ERROR(StubApp.getString2(15437)),
    ROUTE_CREATION_ERROR(StubApp.getString2(15438)),
    MAP_MATCHING_CREATION_ERROR(StubApp.getString2(15439));

    private String str;

    RouterErrorType(String str) {
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
