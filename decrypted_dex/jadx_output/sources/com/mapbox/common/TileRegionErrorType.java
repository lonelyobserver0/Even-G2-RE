package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum TileRegionErrorType {
    CANCELED(StubApp.getString2(13498)),
    DOES_NOT_EXIST(StubApp.getString2(13499)),
    TILESET_DESCRIPTOR(StubApp.getString2(13501)),
    DISK_FULL(StubApp.getString2(13503)),
    OTHER(StubApp.getString2(13505)),
    TILE_COUNT_EXCEEDED(StubApp.getString2(13506));

    private String str;

    TileRegionErrorType(String str) {
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
