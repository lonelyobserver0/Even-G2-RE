package com.mapbox.maps;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum ResponseSourceType {
    NETWORK(StubApp.getString2(14161)),
    CACHE(StubApp.getString2(14169)),
    TILE_STORE(StubApp.getString2(14178)),
    LOCAL_FILE(StubApp.getString2(14180));

    private String str;

    ResponseSourceType(String str) {
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
