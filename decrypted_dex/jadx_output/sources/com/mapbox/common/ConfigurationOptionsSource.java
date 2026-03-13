package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum ConfigurationOptionsSource {
    LOCAL(StubApp.getString2(13237)),
    SERVER(StubApp.getString2(13238));

    private String str;

    ConfigurationOptionsSource(String str) {
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
