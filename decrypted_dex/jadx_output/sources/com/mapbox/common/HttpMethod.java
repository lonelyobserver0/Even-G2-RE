package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum HttpMethod {
    GET(StubApp.getString2(13310)),
    HEAD(StubApp.getString2(13311)),
    POST(StubApp.getString2(13313));

    private String str;

    HttpMethod(String str) {
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
