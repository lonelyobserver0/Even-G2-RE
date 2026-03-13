package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum BillingSessionStatus {
    SESSION_ACTIVE(StubApp.getString2(13226)),
    SESSION_PAUSED(StubApp.getString2(13228)),
    NO_SESSION(StubApp.getString2(13230));

    private String str;

    BillingSessionStatus(String str) {
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
