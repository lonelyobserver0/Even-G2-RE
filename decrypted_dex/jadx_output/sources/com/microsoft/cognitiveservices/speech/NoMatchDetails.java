package com.microsoft.cognitiveservices.speech;

import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class NoMatchDetails {
    private NoMatchReason reason;

    public NoMatchDetails(RecognitionResult recognitionResult) {
        Contracts.throwIfNull(recognitionResult, StubApp.getString2(1890));
        Contracts.throwIfFail(getResultReason(recognitionResult.getImpl(), new IntRef(0L)));
        this.reason = NoMatchReason.values()[((int) r0.getValue()) - 1];
    }

    public static NoMatchDetails fromResult(RecognitionResult recognitionResult) {
        return new NoMatchDetails(recognitionResult);
    }

    private final native long getResultReason(SafeHandle safeHandle, IntRef intRef);

    public void close() {
    }

    public NoMatchReason getReason() {
        return this.reason;
    }

    public String toString() {
        return StubApp.getString2(15735) + this.reason;
    }
}
