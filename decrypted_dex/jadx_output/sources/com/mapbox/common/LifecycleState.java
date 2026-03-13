package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum LifecycleState {
    UNKNOWN(StubApp.getString2(2164)),
    MOVING_FOREGROUND(StubApp.getString2(13351)),
    FOREGROUND(StubApp.getString2(13353)),
    MOVING_BACKGROUND(StubApp.getString2(13355)),
    BACKGROUND(StubApp.getString2(13357)),
    INACTIVE(StubApp.getString2(13359));

    private String str;

    LifecycleState(String str) {
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
