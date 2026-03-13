package com.microsoft.cognitiveservices.speech.audio;

import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class PullAudioInputStream extends AudioInputStream {
    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public PullAudioInputStream(SafeHandle safeHandle) {
        super(safeHandle);
        Contracts.throwIfNull(getImpl(), StubApp.getString2(15928));
        Contracts.throwIfFail(setStreamCallbacks(getImpl()));
    }

    public static PullAudioInputStream create(PullAudioInputStreamCallback pullAudioInputStreamCallback) {
        SafeHandle safeHandle = new SafeHandle(0L, SafeHandleType.AudioInputStream);
        Contracts.throwIfFail(createPullAudioInputStream(safeHandle, null));
        return new PullAudioInputStream(safeHandle);
    }

    private static final native long createPullAudioInputStream(SafeHandle safeHandle, SafeHandle safeHandle2);

    private final native long setStreamCallbacks(SafeHandle safeHandle);

    @Override // com.microsoft.cognitiveservices.speech.audio.AudioInputStream, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    public static PullAudioInputStream create(PullAudioInputStreamCallback pullAudioInputStreamCallback, AudioStreamFormat audioStreamFormat) {
        SafeHandle safeHandle = new SafeHandle(0L, SafeHandleType.AudioInputStream);
        Contracts.throwIfFail(createPullAudioInputStream(safeHandle, audioStreamFormat.getImpl()));
        return new PullAudioInputStream(safeHandle);
    }
}
