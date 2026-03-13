package com.mapbox.maps;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum SourceDataLoadedType {
    METADATA(StubApp.getString2(14196)),
    TILE(StubApp.getString2(13982));

    private String str;

    SourceDataLoadedType(String str) {
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
