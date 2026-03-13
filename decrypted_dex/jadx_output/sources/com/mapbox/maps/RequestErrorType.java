package com.mapbox.maps;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum RequestErrorType {
    SUCCESS(StubApp.getString2(14165)),
    NOT_FOUND(StubApp.getString2(13271)),
    SERVER(StubApp.getString2(13238)),
    CONNECTION(StubApp.getString2(2411)),
    RATE_LIMIT(StubApp.getString2(14166)),
    IN_OFFLINE_MODE(StubApp.getString2(14167)),
    OTHER(StubApp.getString2(13505));

    private String str;

    RequestErrorType(String str) {
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
