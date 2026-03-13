package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum TollCollectionType {
    TOLL_BOOTH(StubApp.getString2(15321)),
    TOLL_GANTRY(StubApp.getString2(15475));

    private String str;

    TollCollectionType(String str) {
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
