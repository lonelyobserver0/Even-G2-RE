package com.microsoft.cognitiveservices.speech.audio;

import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class AudioInputStream implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12548a;

    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public AudioInputStream(SafeHandle safeHandle) {
        this.f12548a = null;
        Contracts.throwIfNull(safeHandle, StubApp.getString2(15659));
        this.f12548a = safeHandle;
    }

    public static PullAudioInputStream createPullStream(PullAudioInputStreamCallback pullAudioInputStreamCallback) {
        return PullAudioInputStream.create(pullAudioInputStreamCallback);
    }

    public static PushAudioInputStream createPushStream() {
        return PushAudioInputStream.create();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        SafeHandle safeHandle = this.f12548a;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12548a = null;
        }
    }

    public SafeHandle getImpl() {
        return this.f12548a;
    }

    public static PullAudioInputStream createPullStream(PullAudioInputStreamCallback pullAudioInputStreamCallback, AudioStreamFormat audioStreamFormat) {
        return PullAudioInputStream.create(pullAudioInputStreamCallback, audioStreamFormat);
    }

    public static PushAudioInputStream createPushStream(AudioStreamFormat audioStreamFormat) {
        return PushAudioInputStream.create(audioStreamFormat);
    }
}
