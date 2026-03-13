package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum AudioType {
    BLUETOOTH(StubApp.getString2(14898)),
    HEADPHONES(StubApp.getString2(14899)),
    SPEAKER(StubApp.getString2(14901)),
    UNKNOWN(StubApp.getString2(2164));

    private String str;

    AudioType(String str) {
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
