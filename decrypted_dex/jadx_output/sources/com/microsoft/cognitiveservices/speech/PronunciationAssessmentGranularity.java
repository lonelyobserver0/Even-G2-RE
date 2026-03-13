package com.microsoft.cognitiveservices.speech;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum PronunciationAssessmentGranularity {
    Phoneme(1),
    Word(2),
    FullText(3);

    private final int id;

    PronunciationAssessmentGranularity(int i3) {
        this.id = i3;
    }

    public int getValue() {
        return this.id;
    }
}
