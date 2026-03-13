package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum LoggingLevel {
    DEBUG(StubApp.getString2(13363)),
    INFO(StubApp.getString2(13365)),
    WARNING(StubApp.getString2(13367)),
    ERROR(StubApp.getString2(3997));

    private String str;

    LoggingLevel(String str) {
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
