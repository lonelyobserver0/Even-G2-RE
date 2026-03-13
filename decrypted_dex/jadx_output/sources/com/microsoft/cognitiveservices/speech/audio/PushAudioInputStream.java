package com.microsoft.cognitiveservices.speech.audio;

import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.CloseGuard;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class PushAudioInputStream extends AudioInputStream {

    /* renamed from: b, reason: collision with root package name */
    public final CloseGuard f12565b;

    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public PushAudioInputStream(SafeHandle safeHandle) {
        super(safeHandle);
        this.f12565b = new CloseGuard();
    }

    public static PushAudioInputStream create() {
        SafeHandle safeHandle = new SafeHandle(0L, SafeHandleType.AudioInputStream);
        Contracts.throwIfFail(createPushAudioInputStream(safeHandle, null));
        return new PushAudioInputStream(safeHandle);
    }

    private static final native long createPushAudioInputStream(SafeHandle safeHandle, SafeHandle safeHandle2);

    private final native long pushAudioInputStreamClose(SafeHandle safeHandle);

    private final native long pushAudioInputStreamWrite(SafeHandle safeHandle, byte[] bArr, int i3);

    @Override // com.microsoft.cognitiveservices.speech.audio.AudioInputStream, java.lang.AutoCloseable
    public void close() {
        this.f12565b.closeObject();
        if (getImpl() != null) {
            Contracts.throwIfFail(pushAudioInputStreamClose(getImpl()));
        }
        super.close();
    }

    public void write(byte[] bArr) {
        CloseGuard closeGuard = this.f12565b;
        closeGuard.enterUseObject();
        try {
            Contracts.throwIfFail(pushAudioInputStreamWrite(getImpl(), bArr, bArr.length));
        } finally {
            closeGuard.exitUseObject();
        }
    }

    public static PushAudioInputStream create(AudioStreamFormat audioStreamFormat) {
        SafeHandle safeHandle = new SafeHandle(0L, SafeHandleType.AudioInputStream);
        Contracts.throwIfFail(createPushAudioInputStream(safeHandle, audioStreamFormat.getImpl()));
        return new PushAudioInputStream(safeHandle);
    }
}
