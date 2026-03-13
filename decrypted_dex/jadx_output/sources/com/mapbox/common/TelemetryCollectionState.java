package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum TelemetryCollectionState {
    ENABLED(StubApp.getString2(13471)),
    TURNSTILE_EVENTS_ONLY(StubApp.getString2(13473)),
    UNKNOWN(StubApp.getString2(2164)),
    BACKGROUND_LOCATIONS_DISABLED(StubApp.getString2(13475));

    private String str;

    TelemetryCollectionState(String str) {
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
