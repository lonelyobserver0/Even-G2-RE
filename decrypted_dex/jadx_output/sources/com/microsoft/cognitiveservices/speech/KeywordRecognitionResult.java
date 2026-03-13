package com.microsoft.cognitiveservices.speech;

import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class KeywordRecognitionResult extends RecognitionResult {
    public KeywordRecognitionResult(long j) {
        super(j);
        Contracts.throwIfNull(super.getImpl(), StubApp.getString2(15730));
    }

    @Override // com.microsoft.cognitiveservices.speech.RecognitionResult, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    public String toString() {
        return StubApp.getString2(15731) + getResultId() + StubApp.getString2(15710) + getReason() + StubApp.getString2(15711) + getText() + StubApp.getString2(6919);
    }
}
