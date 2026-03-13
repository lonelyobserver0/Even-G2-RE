package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum IncidentType {
    ACCIDENT(StubApp.getString2(15026)),
    CONGESTION(StubApp.getString2(15028)),
    CONSTRUCTION(StubApp.getString2(15030)),
    DISABLED_VEHICLE(StubApp.getString2(15032)),
    LANE_RESTRICTION(StubApp.getString2(15034)),
    MASS_TRANSIT(StubApp.getString2(15036)),
    MISCELLANEOUS(StubApp.getString2(15038)),
    OTHER_NEWS(StubApp.getString2(15040)),
    PLANNED_EVENT(StubApp.getString2(15042)),
    ROAD_CLOSURE(StubApp.getString2(15044)),
    ROAD_HAZARD(StubApp.getString2(15046)),
    WEATHER(StubApp.getString2(15048));

    private String str;

    IncidentType(String str) {
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
