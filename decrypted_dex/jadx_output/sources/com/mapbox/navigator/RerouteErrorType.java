package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum RerouteErrorType {
    UNKNOWN,
    ROUTER_ERROR,
    CANCELLED,
    NO_ROUTES_OR_CONTROLLER,
    BUILD_URI_ERROR,
    REROUTE_IN_PROGRESS;

    private int getValue() {
        return ordinal();
    }
}
