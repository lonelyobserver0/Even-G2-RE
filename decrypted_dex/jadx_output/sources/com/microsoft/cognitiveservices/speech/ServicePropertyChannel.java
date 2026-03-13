package com.microsoft.cognitiveservices.speech;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum ServicePropertyChannel {
    UriQueryParameter(0),
    HttpHeader(1);

    private final int id;

    ServicePropertyChannel(int i3) {
        this.id = i3;
    }

    public int getValue() {
        return this.id;
    }
}
