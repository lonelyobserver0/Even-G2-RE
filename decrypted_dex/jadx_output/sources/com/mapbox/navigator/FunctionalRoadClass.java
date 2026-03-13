package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum FunctionalRoadClass {
    MOTORWAY(StubApp.getString2(14982)),
    TRUNK(StubApp.getString2(14984)),
    PRIMARY(StubApp.getString2(14986)),
    SECONDARY(StubApp.getString2(14988)),
    TERTIARY(StubApp.getString2(14990)),
    UNCLASSIFIED(StubApp.getString2(14992)),
    RESIDENTIAL(StubApp.getString2(14994)),
    SERVICE_OTHER(StubApp.getString2(14996));

    private String str;

    FunctionalRoadClass(String str) {
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
