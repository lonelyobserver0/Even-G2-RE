package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum AssistedDrivingState {
    DISABLED(StubApp.getString2(14306)),
    KEEP_LANE(StubApp.getString2(14892)),
    START_LANE_CHANGE(StubApp.getString2(14894)),
    END_LANE_CHANGE(StubApp.getString2(14896));

    private String str;

    AssistedDrivingState(String str) {
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
