package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum ForceRerouteReason {
    DEVIATION,
    CLOSURE,
    INSUFFICIENT_CHARGE,
    PARAMETERS_CHANGE,
    ROUTE_INVALIDATED,
    USER_TRIGGERED,
    CPOI_OCCUPIED,
    CPOI_OUT_OF_ORDER;

    private int getValue() {
        return ordinal();
    }
}
