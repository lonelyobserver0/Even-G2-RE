package com.mapbox.common.location;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum AccuracyAuthorization {
    NONE(StubApp.getString2(9895)),
    EXACT(StubApp.getString2(13594)),
    INEXACT(StubApp.getString2(13596));

    private String str;

    AccuracyAuthorization(String str) {
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
