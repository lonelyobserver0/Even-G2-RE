package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum DeferredDeliveryOverflowPolicy {
    DISCARD_INCOMING,
    RETIRE_OLDEST;

    private int getValue() {
        return ordinal();
    }
}
