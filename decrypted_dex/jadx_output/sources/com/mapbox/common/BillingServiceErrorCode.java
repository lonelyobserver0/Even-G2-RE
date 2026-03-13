package com.mapbox.common;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum BillingServiceErrorCode {
    TOKEN_VALIDATION_FAILED(StubApp.getString2(13222)),
    RESUME_FAILED(StubApp.getString2(13224));

    private String str;

    BillingServiceErrorCode(String str) {
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
