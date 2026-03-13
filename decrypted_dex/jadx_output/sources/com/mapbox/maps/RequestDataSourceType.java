package com.mapbox.maps;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum RequestDataSourceType {
    ASSET(StubApp.getString2(14155)),
    DATABASE(StubApp.getString2(14157)),
    FILE_SYSTEM(StubApp.getString2(14159)),
    NETWORK(StubApp.getString2(14161)),
    RESOURCE_LOADER(StubApp.getString2(14163));

    private String str;

    RequestDataSourceType(String str) {
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
