package com.microsoft.cognitiveservices.speech;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SpeechRecognitionResult extends RecognitionResult {
    public SpeechRecognitionResult(long j) {
        super(j);
    }

    @Override // com.microsoft.cognitiveservices.speech.RecognitionResult, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    public String toString() {
        return StubApp.getString2(15731) + getResultId() + StubApp.getString2(15922) + getReason() + StubApp.getString2(15920) + getText() + StubApp.getString2(6919);
    }
}
