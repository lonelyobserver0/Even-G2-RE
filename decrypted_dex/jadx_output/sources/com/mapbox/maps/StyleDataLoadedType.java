package com.mapbox.maps;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum StyleDataLoadedType {
    STYLE(StubApp.getString2(13978)),
    SPRITE(StubApp.getString2(13979)),
    SOURCES(StubApp.getString2(14285));

    private String str;

    StyleDataLoadedType(String str) {
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
