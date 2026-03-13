package com.microsoft.cognitiveservices.speech.audio;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class MicrophoneCoordinates {

    /* renamed from: a, reason: collision with root package name */
    public final int f12561a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12562b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12563c;

    public MicrophoneCoordinates(int i3, int i10, int i11) {
        this.f12561a = i3;
        this.f12562b = i10;
        this.f12563c = i11;
    }

    public int getX() {
        return this.f12561a;
    }

    public int getY() {
        return this.f12562b;
    }

    public int getZ() {
        return this.f12563c;
    }

    public MicrophoneCoordinates(MicrophoneCoordinates microphoneCoordinates) {
        this.f12561a = microphoneCoordinates.f12561a;
        this.f12562b = microphoneCoordinates.f12562b;
        this.f12563c = microphoneCoordinates.f12563c;
    }
}
