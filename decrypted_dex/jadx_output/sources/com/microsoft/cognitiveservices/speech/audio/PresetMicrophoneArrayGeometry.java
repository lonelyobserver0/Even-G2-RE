package com.microsoft.cognitiveservices.speech.audio;

import com.stub.StubApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class PresetMicrophoneArrayGeometry {
    public static final PresetMicrophoneArrayGeometry Circular4;
    public static final PresetMicrophoneArrayGeometry Circular7;
    public static final PresetMicrophoneArrayGeometry Custom;
    public static final PresetMicrophoneArrayGeometry Linear2;
    public static final PresetMicrophoneArrayGeometry Linear4;
    public static final PresetMicrophoneArrayGeometry Mono;
    public static final PresetMicrophoneArrayGeometry Uninitialized;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PresetMicrophoneArrayGeometry[] f12564a;

    static {
        PresetMicrophoneArrayGeometry presetMicrophoneArrayGeometry = new PresetMicrophoneArrayGeometry(StubApp.getString2(16012), 0);
        Uninitialized = presetMicrophoneArrayGeometry;
        PresetMicrophoneArrayGeometry presetMicrophoneArrayGeometry2 = new PresetMicrophoneArrayGeometry(StubApp.getString2(16013), 1);
        Circular7 = presetMicrophoneArrayGeometry2;
        PresetMicrophoneArrayGeometry presetMicrophoneArrayGeometry3 = new PresetMicrophoneArrayGeometry(StubApp.getString2(16014), 2);
        Circular4 = presetMicrophoneArrayGeometry3;
        PresetMicrophoneArrayGeometry presetMicrophoneArrayGeometry4 = new PresetMicrophoneArrayGeometry(StubApp.getString2(16015), 3);
        Linear4 = presetMicrophoneArrayGeometry4;
        PresetMicrophoneArrayGeometry presetMicrophoneArrayGeometry5 = new PresetMicrophoneArrayGeometry(StubApp.getString2(16016), 4);
        Linear2 = presetMicrophoneArrayGeometry5;
        PresetMicrophoneArrayGeometry presetMicrophoneArrayGeometry6 = new PresetMicrophoneArrayGeometry(StubApp.getString2(16017), 5);
        Mono = presetMicrophoneArrayGeometry6;
        PresetMicrophoneArrayGeometry presetMicrophoneArrayGeometry7 = new PresetMicrophoneArrayGeometry(StubApp.getString2(15164), 6);
        Custom = presetMicrophoneArrayGeometry7;
        f12564a = new PresetMicrophoneArrayGeometry[]{presetMicrophoneArrayGeometry, presetMicrophoneArrayGeometry2, presetMicrophoneArrayGeometry3, presetMicrophoneArrayGeometry4, presetMicrophoneArrayGeometry5, presetMicrophoneArrayGeometry6, presetMicrophoneArrayGeometry7};
    }

    public static PresetMicrophoneArrayGeometry valueOf(String str) {
        return (PresetMicrophoneArrayGeometry) Enum.valueOf(PresetMicrophoneArrayGeometry.class, str);
    }

    public static PresetMicrophoneArrayGeometry[] values() {
        return (PresetMicrophoneArrayGeometry[]) f12564a.clone();
    }
}
