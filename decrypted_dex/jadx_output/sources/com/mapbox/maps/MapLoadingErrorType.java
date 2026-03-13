package com.mapbox.maps;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum MapLoadingErrorType {
    STYLE(StubApp.getString2(13978)),
    SPRITE(StubApp.getString2(13979)),
    SOURCE(StubApp.getString2(13980)),
    GLYPHS(StubApp.getString2(13981)),
    TILE(StubApp.getString2(13982));

    private String str;

    MapLoadingErrorType(String str) {
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
