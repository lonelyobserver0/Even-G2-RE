package com.microsoft.cognitiveservices.speech.audio;

import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class PushAudioOutputStream extends AudioOutputStream {
    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static PushAudioOutputStream create(PushAudioOutputStreamCallback pushAudioOutputStreamCallback) {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createPushAudioOutputStream(intRef));
        PushAudioOutputStream pushAudioOutputStream = new PushAudioOutputStream(intRef);
        Contracts.throwIfFail(pushAudioOutputStream.setStreamCallbacks(pushAudioOutputStream.getImpl()));
        return pushAudioOutputStream;
    }

    private static final native long createPushAudioOutputStream(IntRef intRef);

    private final native long setStreamCallbacks(SafeHandle safeHandle);
}
