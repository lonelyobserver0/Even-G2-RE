package com.microsoft.cognitiveservices.speech.speaker;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum VoiceProfileType {
    TextIndependentIdentification(1),
    TextDependentVerification(2),
    TextIndependentVerification(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f12660a;

    VoiceProfileType(int i3) {
        this.f12660a = i3;
    }

    public int getValue() {
        return this.f12660a;
    }
}
