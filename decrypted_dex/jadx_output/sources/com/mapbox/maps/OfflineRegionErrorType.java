package com.mapbox.maps;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum OfflineRegionErrorType {
    NOT_FOUND,
    SERVER,
    CONNECTION,
    RATE_LIMIT,
    DISK_FULL,
    TILE_COUNT_LIMIT_EXCEEDED,
    OTHER;

    private int getValue() {
        return ordinal();
    }
}
