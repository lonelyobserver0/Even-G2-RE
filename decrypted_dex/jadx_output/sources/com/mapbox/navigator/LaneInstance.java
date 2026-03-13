package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum LaneInstance {
    EGO(StubApp.getString2(15061)),
    LEFT(StubApp.getString2(14890)),
    RIGHT(StubApp.getString2(14891));

    private String str;

    LaneInstance(String str) {
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
