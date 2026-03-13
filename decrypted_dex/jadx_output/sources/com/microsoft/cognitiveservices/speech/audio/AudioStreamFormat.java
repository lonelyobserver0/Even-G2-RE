package com.microsoft.cognitiveservices.speech.audio;

import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class AudioStreamFormat {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12553a;

    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public AudioStreamFormat(SafeHandle safeHandle) {
        this.f12553a = null;
        Contracts.throwIfNull(safeHandle, StubApp.getString2(16004));
        this.f12553a = safeHandle;
    }

    private static final native long createFromCompressedFormat(SafeHandle safeHandle, int i3);

    private static final native long createFromDefaultInput(SafeHandle safeHandle);

    private static final native long createFromWaveFormat(SafeHandle safeHandle, long j, short s10, short s11, int i3);

    public static AudioStreamFormat getCompressedFormat(AudioStreamContainerFormat audioStreamContainerFormat) {
        SafeHandle safeHandle = new SafeHandle(0L, SafeHandleType.AudioStreamFormat);
        Contracts.throwIfFail(createFromCompressedFormat(safeHandle, AudioStreamContainerFormat.values()[audioStreamContainerFormat.ordinal()].getValue()));
        return new AudioStreamFormat(safeHandle);
    }

    public static AudioStreamFormat getDefaultInputFormat() {
        SafeHandle safeHandle = new SafeHandle(0L, SafeHandleType.AudioStreamFormat);
        Contracts.throwIfFail(createFromDefaultInput(safeHandle));
        return new AudioStreamFormat(safeHandle);
    }

    public static AudioStreamFormat getWaveFormat(long j, short s10, short s11, AudioStreamWaveFormat audioStreamWaveFormat) {
        SafeHandle safeHandle = new SafeHandle(0L, SafeHandleType.AudioStreamFormat);
        Contracts.throwIfFail(createFromWaveFormat(safeHandle, j, s10, s11, AudioStreamWaveFormat.values()[audioStreamWaveFormat.ordinal()].getValue()));
        return new AudioStreamFormat(safeHandle);
    }

    public static AudioStreamFormat getWaveFormatPCM(long j, short s10, short s11) {
        SafeHandle safeHandle = new SafeHandle(0L, SafeHandleType.AudioStreamFormat);
        Contracts.throwIfFail(createFromWaveFormat(safeHandle, j, s10, s11, AudioStreamWaveFormat.PCM.getValue()));
        return new AudioStreamFormat(safeHandle);
    }

    public void close() {
        SafeHandle safeHandle = this.f12553a;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12553a = null;
        }
    }

    public SafeHandle getImpl() {
        return this.f12553a;
    }
}
