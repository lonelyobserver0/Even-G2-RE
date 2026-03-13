package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum RoadSurface {
    PAVED_SMOOTH(StubApp.getString2(15413)),
    PAVED(StubApp.getString2(15415)),
    PAVED_ROUGH(StubApp.getString2(15417)),
    COMPACTED(StubApp.getString2(15419)),
    DIRT(StubApp.getString2(15421)),
    GRAVEL(StubApp.getString2(15423)),
    PATH(StubApp.getString2(15425)),
    IMPASSABLE(StubApp.getString2(15427));

    private String str;

    RoadSurface(String str) {
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
