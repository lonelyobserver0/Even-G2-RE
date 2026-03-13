package com.microsoft.cognitiveservices.speech.audio;

import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class MicrophoneArrayGeometry {

    /* renamed from: a, reason: collision with root package name */
    public final MicrophoneArrayType f12556a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12557b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12558c;

    /* renamed from: d, reason: collision with root package name */
    public final MicrophoneCoordinates[] f12559d;

    public MicrophoneArrayGeometry(MicrophoneArrayType microphoneArrayType, int i3, int i10, MicrophoneCoordinates[] microphoneCoordinatesArr) {
        Contracts.throwIfNull(microphoneCoordinatesArr, StubApp.getString2(16007));
        if (i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(16009));
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(16008));
        }
        this.f12556a = microphoneArrayType;
        this.f12557b = i3;
        this.f12558c = i10;
        this.f12559d = new MicrophoneCoordinates[microphoneCoordinatesArr.length];
        for (int i11 = 0; i11 < microphoneCoordinatesArr.length; i11++) {
            this.f12559d[i11] = new MicrophoneCoordinates(microphoneCoordinatesArr[i11]);
        }
    }

    public int getBeamformingEndAngle() {
        return this.f12558c;
    }

    public int getBeamformingStartAngle() {
        return this.f12557b;
    }

    public MicrophoneArrayType getMicrophoneArrayType() {
        return this.f12556a;
    }

    public MicrophoneCoordinates[] getMicrophoneCoordinates() {
        MicrophoneCoordinates[] microphoneCoordinatesArr = this.f12559d;
        int length = microphoneCoordinatesArr.length;
        MicrophoneCoordinates[] microphoneCoordinatesArr2 = new MicrophoneCoordinates[length];
        for (int i3 = 0; i3 < length; i3++) {
            microphoneCoordinatesArr2[i3] = new MicrophoneCoordinates(microphoneCoordinatesArr[i3]);
        }
        return microphoneCoordinatesArr2;
    }

    public MicrophoneArrayGeometry(MicrophoneArrayType microphoneArrayType, MicrophoneCoordinates[] microphoneCoordinatesArr) {
        Contracts.throwIfNull(microphoneCoordinatesArr, StubApp.getString2(16007));
        this.f12556a = microphoneArrayType;
        this.f12557b = 0;
        this.f12558c = microphoneArrayType == MicrophoneArrayType.Linear ? 180 : 360;
        this.f12559d = new MicrophoneCoordinates[microphoneCoordinatesArr.length];
        for (int i3 = 0; i3 < microphoneCoordinatesArr.length; i3++) {
            this.f12559d[i3] = new MicrophoneCoordinates(microphoneCoordinatesArr[i3]);
        }
    }
}
