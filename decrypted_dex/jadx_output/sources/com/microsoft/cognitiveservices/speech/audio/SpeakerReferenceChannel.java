package com.microsoft.cognitiveservices.speech.audio;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class SpeakerReferenceChannel {
    public static final SpeakerReferenceChannel LastChannel;
    public static final SpeakerReferenceChannel None;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SpeakerReferenceChannel[] f12566a;

    static {
        SpeakerReferenceChannel speakerReferenceChannel = new SpeakerReferenceChannel(StubApp.getString2(9895), 0);
        None = speakerReferenceChannel;
        SpeakerReferenceChannel speakerReferenceChannel2 = new SpeakerReferenceChannel(StubApp.getString2(16018), 1);
        LastChannel = speakerReferenceChannel2;
        f12566a = new SpeakerReferenceChannel[]{speakerReferenceChannel, speakerReferenceChannel2};
    }

    public static SpeakerReferenceChannel valueOf(String str) {
        return (SpeakerReferenceChannel) Enum.valueOf(SpeakerReferenceChannel.class, str);
    }

    public static SpeakerReferenceChannel[] values() {
        return (SpeakerReferenceChannel[]) f12566a.clone();
    }
}
