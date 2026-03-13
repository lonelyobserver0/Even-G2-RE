package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum ConfigurationServiceErrorCode {
    NO_TOKEN(StubApp.getString2(13240)),
    NO_CONFIGURATION(StubApp.getString2(13242)),
    HTTP_ERROR(StubApp.getString2(13244)),
    MALFORMED_CONFIGURATION(StubApp.getString2(13246)),
    IOERROR(StubApp.getString2(13248)),
    UPDATE_IN_PROGRESS(StubApp.getString2(13250)),
    UNEXPECTED_HTTPRESPONSE_CODE(StubApp.getString2(13252)),
    EXPIRED_CONFIGURATION(StubApp.getString2(13254));

    private String str;

    ConfigurationServiceErrorCode(String str) {
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
