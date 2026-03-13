package com.microsoft.cognitiveservices.speech;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum PronunciationAssessmentGradingSystem {
    FivePoint(1),
    HundredMark(2);

    private final int id;

    PronunciationAssessmentGradingSystem(int i3) {
        this.id = i3;
    }

    public int getValue() {
        return this.id;
    }
}
