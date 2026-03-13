package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum MergingAreaType {
    FROM_LEFT(StubApp.getString2(15114)),
    FROM_RIGHT(StubApp.getString2(15116)),
    FROM_BOTH(StubApp.getString2(15118));

    private String str;

    MergingAreaType(String str) {
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
