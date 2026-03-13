package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum ThreadServiceType {
    INTERACTIVE(StubApp.getString2(13483)),
    IMPORTANT(StubApp.getString2(13485)),
    DEFAULT(StubApp.getString2(9991)),
    UTILITY(StubApp.getString2(13487)),
    BACKGROUND(StubApp.getString2(13357)),
    UNSPECIFIED(StubApp.getString2(13489));

    private String str;

    ThreadServiceType(String str) {
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
