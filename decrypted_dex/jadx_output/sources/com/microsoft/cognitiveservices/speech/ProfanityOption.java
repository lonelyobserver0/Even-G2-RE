package com.microsoft.cognitiveservices.speech;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum ProfanityOption {
    Masked(0),
    Removed(1),
    Raw(2);

    private final int profanity;

    ProfanityOption(int i3) {
        this.profanity = i3;
    }

    public int getValue() {
        return this.profanity;
    }
}
