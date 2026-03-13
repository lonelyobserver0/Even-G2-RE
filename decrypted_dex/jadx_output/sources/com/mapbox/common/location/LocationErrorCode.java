package com.mapbox.common.location;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum LocationErrorCode {
    NONE(StubApp.getString2(9895)),
    NOT_READY(StubApp.getString2(13666)),
    NOT_AVAILABLE(StubApp.getString2(13668)),
    ACCESS_DENIED(StubApp.getString2(13669)),
    INVALID_ARGUMENT(StubApp.getString2(13671)),
    FAILED_TO_DETECT_LOCATION(StubApp.getString2(13672)),
    COMMUNICATION_FAILURE(StubApp.getString2(13674)),
    CANCELLED(StubApp.getString2(13676)),
    NOT_SUPPORTED(StubApp.getString2(13678)),
    UNKNOWN(StubApp.getString2(2164));

    private String str;

    LocationErrorCode(String str) {
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
