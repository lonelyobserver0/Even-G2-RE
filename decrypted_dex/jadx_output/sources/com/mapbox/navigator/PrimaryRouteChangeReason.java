package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum PrimaryRouteChangeReason {
    SET_ROUTE,
    REROUTE,
    REFRESH,
    RESET;

    private int getValue() {
        return ordinal();
    }
}
