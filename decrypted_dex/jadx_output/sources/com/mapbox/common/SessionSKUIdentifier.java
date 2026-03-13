package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum SessionSKUIdentifier {
    NAV2_SES_TRIP(StubApp.getString2(13453)),
    NAV2_SES_FDTRIP(StubApp.getString2(13455)),
    NAV3_SES_UX_AGTRIP(StubApp.getString2(13457)),
    NAV3_SES_UX_FDTRIP(StubApp.getString2(13459)),
    NAV3_SES_CORE_AGTRIP(StubApp.getString2(13461)),
    NAV3_SES_CORE_FDTRIP(StubApp.getString2(13463));

    private String str;

    SessionSKUIdentifier(String str) {
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
