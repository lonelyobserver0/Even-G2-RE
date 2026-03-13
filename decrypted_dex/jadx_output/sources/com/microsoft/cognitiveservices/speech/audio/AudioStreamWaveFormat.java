package com.microsoft.cognitiveservices.speech.audio;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum AudioStreamWaveFormat {
    PCM(1),
    ALAW(6),
    MULAW(7),
    G722(655);


    /* renamed from: a, reason: collision with root package name */
    public final int f12555a;

    AudioStreamWaveFormat(int i3) {
        this.f12555a = i3;
    }

    public int getValue() {
        return this.f12555a;
    }
}
