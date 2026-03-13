package com.microsoft.cognitiveservices.speech.audio;

import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class AudioOutputStream implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12549a;

    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public AudioOutputStream(IntRef intRef) {
        Contracts.throwIfNull(intRef, StubApp.getString2(15659));
        this.f12549a = new SafeHandle(intRef.getValue(), SafeHandleType.AudioOutputStream);
    }

    public static PullAudioOutputStream createPullStream() {
        return PullAudioOutputStream.create();
    }

    public static PushAudioOutputStream createPushStream(PushAudioOutputStreamCallback pushAudioOutputStreamCallback) {
        return PushAudioOutputStream.create(pushAudioOutputStreamCallback);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        SafeHandle safeHandle = this.f12549a;
        if (safeHandle != null) {
            safeHandle.close();
        }
        this.f12549a = null;
    }

    public SafeHandle getImpl() {
        return this.f12549a;
    }
}
