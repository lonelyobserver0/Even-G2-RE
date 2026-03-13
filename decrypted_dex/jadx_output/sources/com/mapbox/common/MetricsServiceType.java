package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum MetricsServiceType {
    TELEMETRY(StubApp.getString2(13391)),
    LOG(StubApp.getString2(13393));

    private String str;

    MetricsServiceType(String str) {
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
