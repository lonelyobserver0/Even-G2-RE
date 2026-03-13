package com.mapbox.maps;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum StylePackErrorType {
    CANCELED(StubApp.getString2(13498)),
    DOES_NOT_EXIST(StubApp.getString2(13499)),
    DISK_FULL(StubApp.getString2(13503)),
    OTHER(StubApp.getString2(13505));

    private String str;

    StylePackErrorType(String str) {
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
