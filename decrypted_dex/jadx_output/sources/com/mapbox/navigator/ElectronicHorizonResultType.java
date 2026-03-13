package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum ElectronicHorizonResultType {
    INITIAL(StubApp.getString2(14947)),
    UPDATE(StubApp.getString2(9926)),
    NOT_AVAILABLE(StubApp.getString2(13668));

    private String str;

    ElectronicHorizonResultType(String str) {
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
