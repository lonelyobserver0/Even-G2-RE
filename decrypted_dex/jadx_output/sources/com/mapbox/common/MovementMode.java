package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum MovementMode {
    IN_VEHICLE(StubApp.getString2(13394)),
    CYCLING(StubApp.getString2(13396)),
    RUNNING(StubApp.getString2(13397)),
    WALKING(StubApp.getString2(13398)),
    ON_FOOT(StubApp.getString2(13399)),
    STATIONARY(StubApp.getString2(13401)),
    UNKNOWN(StubApp.getString2(2164));

    private String str;

    MovementMode(String str) {
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
