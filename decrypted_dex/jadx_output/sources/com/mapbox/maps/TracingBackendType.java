package com.mapbox.maps;

import com.stub.StubApp;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum TracingBackendType {
    NOOP(StubApp.getString2(13516)),
    PLATFORM(StubApp.getString2(13518)),
    LOGGER(StubApp.getString2(1133));

    private String str;

    TracingBackendType(String str) {
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
