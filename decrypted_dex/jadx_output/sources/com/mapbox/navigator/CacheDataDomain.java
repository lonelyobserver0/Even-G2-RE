package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum CacheDataDomain {
    MAPS(StubApp.getString2(13490)),
    NAVIGATION(StubApp.getString2(7501)),
    SEARCH(StubApp.getString2(13492)),
    ADAS(StubApp.getString2(13494)),
    NAVIGATION_HD(StubApp.getString2(13496));

    private String str;

    CacheDataDomain(String str) {
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
