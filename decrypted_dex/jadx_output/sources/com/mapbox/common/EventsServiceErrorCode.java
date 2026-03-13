package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum EventsServiceErrorCode {
    NO_TOKEN(StubApp.getString2(13240)),
    NO_USER_AGENT(StubApp.getString2(13269)),
    NOT_FOUND(StubApp.getString2(13271)),
    UNAUTHORIZED(StubApp.getString2(414)),
    INVALID_PAYLOAD(StubApp.getString2(13274)),
    LARGE_PAYLOAD(StubApp.getString2(13275)),
    MULTI_STATUS(StubApp.getString2(13277)),
    BAD_REQUEST(StubApp.getString2(13279)),
    TIMEOUT(StubApp.getString2(13281)),
    INVALID_ENDPOINT(StubApp.getString2(13282)),
    MALFORMED_EVENT(StubApp.getString2(13284)),
    HTTP_ERROR(StubApp.getString2(13244)),
    EVENTS_DISABLED(StubApp.getString2(13286)),
    IOERROR(StubApp.getString2(13248));

    private String str;

    EventsServiceErrorCode(String str) {
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
