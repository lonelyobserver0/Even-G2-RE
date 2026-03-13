package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum VehicleType {
    CAR(StubApp.getString2(15479)),
    TRUCK(StubApp.getString2(15481)),
    BUS(StubApp.getString2(15089)),
    TRAILER(StubApp.getString2(15483)),
    MOTORCYCLE(StubApp.getString2(15485));

    private String str;

    VehicleType(String str) {
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
