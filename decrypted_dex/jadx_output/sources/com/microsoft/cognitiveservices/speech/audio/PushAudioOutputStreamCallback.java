package com.microsoft.cognitiveservices.speech.audio;

import com.microsoft.cognitiveservices.speech.SpeechConfig;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class PushAudioOutputStreamCallback {
    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public abstract void close();

    public abstract int write(byte[] bArr);
}
