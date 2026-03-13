package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum HttpRequestErrorType {
    CONNECTION_ERROR(StubApp.getString2(13320)),
    SSLERROR(StubApp.getString2(13322)),
    REQUEST_CANCELLED(StubApp.getString2(13324)),
    REQUEST_TIMED_OUT(StubApp.getString2(13326)),
    RANGE_ERROR(StubApp.getString2(13328)),
    OTHER_ERROR(StubApp.getString2(13235));

    private String str;

    HttpRequestErrorType(String str) {
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
