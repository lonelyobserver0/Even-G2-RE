package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum MessageBinaryFormat {
    ADASISV2_BE(StubApp.getString2(15120)),
    ADASISV2_LE(StubApp.getString2(15122)),
    FLAT_BUFFERS(StubApp.getString2(15124)),
    MAPBOX_INTERNAL(StubApp.getString2(15126));

    private String str;

    MessageBinaryFormat(String str) {
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
