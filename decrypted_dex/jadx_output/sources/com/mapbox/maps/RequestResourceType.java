package com.mapbox.maps;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum RequestResourceType {
    UNKNOWN(StubApp.getString2(2164)),
    STYLE(StubApp.getString2(13978)),
    SOURCE(StubApp.getString2(13980)),
    TILE(StubApp.getString2(13982)),
    GLYPHS(StubApp.getString2(13981)),
    SPRITE_IMAGE(StubApp.getString2(14172)),
    SPRITE_JSON(StubApp.getString2(14174)),
    IMAGE(StubApp.getString2(14176)),
    MODEL(StubApp.getString2(3841));

    private String str;

    RequestResourceType(String str) {
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
