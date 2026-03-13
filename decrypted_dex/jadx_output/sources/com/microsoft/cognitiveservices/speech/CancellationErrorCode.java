package com.microsoft.cognitiveservices.speech;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum CancellationErrorCode {
    NoError(0),
    AuthenticationFailure(1),
    BadRequest(2),
    TooManyRequests(3),
    Forbidden(4),
    ConnectionFailure(5),
    ServiceTimeout(6),
    ServiceError(7),
    ServiceUnavailable(8),
    RuntimeError(9),
    ServiceRedirectTemporary(10),
    ServiceRedirectPermanent(11),
    EmbeddedModelError(12);

    private final int id;

    CancellationErrorCode(int i3) {
        this.id = i3;
    }

    public int getValue() {
        return this.id;
    }
}
