package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum ResourceLoadFlags {
    NONE(0),
    CRITICAL(1),
    ACCEPT_EXPIRED(2),
    FORCE_LOAD(4),
    SKIP_DATA_LOADING(8),
    SKIP_DATA_TRANSFER(24),
    FORCE_EXPIRED(32),
    SKIP_DECOMPRESSION(64),
    CHECK_INTEGRITY(128);

    public final int value;

    ResourceLoadFlags(int i3) {
        this.value = i3;
    }

    private int getValue() {
        return this.value;
    }
}
