package com.mapbox.maps;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum TileStoreUsageMode {
    DISABLED(StubApp.getString2(14306)),
    READ_ONLY(StubApp.getString2(14307)),
    READ_AND_UPDATE(StubApp.getString2(14308));

    private String str;

    TileStoreUsageMode(String str) {
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
