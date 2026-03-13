package com.microsoft.cognitiveservices.speech;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum CancellationReason {
    Error(1),
    EndOfStream(2),
    CancelledByUser(3);

    private final int id;

    CancellationReason(int i3) {
        this.id = i3;
    }

    public int getValue() {
        return this.id;
    }
}
