package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum DRSensorFusionState {
    DISABLED(StubApp.getString2(14306)),
    COLD_START(StubApp.getString2(14937)),
    INITIALIZATION(StubApp.getString2(14938)),
    NORMAL_OPERATION(StubApp.getString2(14939)),
    FAILURE(StubApp.getString2(14940));

    private String str;

    DRSensorFusionState(String str) {
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
