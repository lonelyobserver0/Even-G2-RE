package com.mapbox.common.location;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum PermissionStatus {
    DENIED(StubApp.getString2(13700)),
    GRANTED(StubApp.getString2(13701)),
    FOREGROUND(StubApp.getString2(13353)),
    BACKGROUND(StubApp.getString2(13357));

    private String str;

    PermissionStatus(String str) {
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
