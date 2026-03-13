package com.mapbox.navigator.route_data;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum RdManeuverType {
    TURN,
    NEW_NAME,
    DEPART,
    ARRIVE,
    MERGE,
    ON_RAMP,
    OFF_RAMP,
    FORK,
    END_OF_ROAD,
    CONTINUE,
    ROUNDABOUT,
    ROTARY,
    ROUNDABOUT_TURN,
    NOTIFICATION,
    EXIT_ROUNDABOUT,
    EXIT_ROTARY;

    private int getValue() {
        return ordinal();
    }
}
