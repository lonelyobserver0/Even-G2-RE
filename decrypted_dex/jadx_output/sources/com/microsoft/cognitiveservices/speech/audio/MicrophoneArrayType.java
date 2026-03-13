package com.microsoft.cognitiveservices.speech.audio;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class MicrophoneArrayType {
    public static final MicrophoneArrayType Linear;
    public static final MicrophoneArrayType Planar;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MicrophoneArrayType[] f12560a;

    static {
        MicrophoneArrayType microphoneArrayType = new MicrophoneArrayType(StubApp.getString2(16010), 0);
        Linear = microphoneArrayType;
        MicrophoneArrayType microphoneArrayType2 = new MicrophoneArrayType(StubApp.getString2(16011), 1);
        Planar = microphoneArrayType2;
        f12560a = new MicrophoneArrayType[]{microphoneArrayType, microphoneArrayType2};
    }

    public static MicrophoneArrayType valueOf(String str) {
        return (MicrophoneArrayType) Enum.valueOf(MicrophoneArrayType.class, str);
    }

    public static MicrophoneArrayType[] values() {
        return (MicrophoneArrayType[]) f12560a.clone();
    }
}
