package com.microsoft.cognitiveservices.speech.audio;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum AudioStreamContainerFormat {
    OGG_OPUS(257),
    MP3(258),
    FLAC(259),
    ALAW(260),
    MULAW(261),
    AMRNB(262),
    AMRWB(263),
    ANY(264);


    /* renamed from: a, reason: collision with root package name */
    public final int f12552a;

    AudioStreamContainerFormat(int i3) {
        this.f12552a = i3;
    }

    public int getValue() {
        return this.f12552a;
    }
}
