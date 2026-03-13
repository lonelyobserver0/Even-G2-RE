package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum SapaType {
    NONE(StubApp.getString2(9895)),
    SERVICE_AREA(StubApp.getString2(15401)),
    REST_AREA(StubApp.getString2(15451));

    private String str;

    SapaType(String str) {
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
