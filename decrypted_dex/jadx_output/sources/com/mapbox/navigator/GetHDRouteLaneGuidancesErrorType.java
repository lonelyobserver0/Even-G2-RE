package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum GetHDRouteLaneGuidancesErrorType {
    NOT_READY(StubApp.getString2(13666)),
    CANCELLED(StubApp.getString2(13676));

    private String str;

    GetHDRouteLaneGuidancesErrorType(String str) {
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
