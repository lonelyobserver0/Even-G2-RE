package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum TransferState {
    PENDING,
    IN_PROGRESS,
    FAILED,
    FINISHED;

    private int getValue() {
        return ordinal();
    }
}
