package com.microsoft.cognitiveservices.speech;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum NoMatchReason {
    NotRecognized(1),
    InitialSilenceTimeout(2),
    InitialBabbleTimeout(3),
    KeywordNotRecognized(4),
    EndSilenceTimeout(5);

    private final int id;

    NoMatchReason(int i3) {
        this.id = i3;
    }

    public int getValue() {
        return this.id;
    }
}
