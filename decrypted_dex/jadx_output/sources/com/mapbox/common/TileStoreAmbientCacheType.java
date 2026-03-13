package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum TileStoreAmbientCacheType {
    TILES(StubApp.getString2(13508)),
    RESOURCES(StubApp.getString2(13510));

    private String str;

    TileStoreAmbientCacheType(String str) {
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
