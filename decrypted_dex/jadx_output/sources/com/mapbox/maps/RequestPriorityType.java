package com.mapbox.maps;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum RequestPriorityType {
    REGULAR(StubApp.getString2(2143)),
    LOW(StubApp.getString2(14171));

    private String str;

    RequestPriorityType(String str) {
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
