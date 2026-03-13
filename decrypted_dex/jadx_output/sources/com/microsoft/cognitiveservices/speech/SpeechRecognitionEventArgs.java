package com.microsoft.cognitiveservices.speech;

import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SpeechRecognitionEventArgs extends RecognitionEventArgs {
    private SpeechRecognitionResult result;

    public SpeechRecognitionEventArgs(long j) {
        super(j);
        storeEventData(false);
    }

    private void storeEventData(boolean z2) {
        Contracts.throwIfNull(this.eventHandle, StubApp.getString2(15697));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getRecognitionResult(this.eventHandle, intRef));
        this.result = new SpeechRecognitionResult(intRef.getValue());
        Contracts.throwIfNull(getSessionId(), StubApp.getString2(15707));
        if (z2) {
            super.close();
        }
    }

    public final SpeechRecognitionResult getResult() {
        return this.result;
    }

    @Override // com.microsoft.cognitiveservices.speech.RecognitionEventArgs, com.microsoft.cognitiveservices.speech.SessionEventArgs
    public String toString() {
        return StubApp.getString2(15708) + getSessionId() + StubApp.getString2(15709) + this.result.getResultId() + StubApp.getString2(15710) + this.result.getReason() + StubApp.getString2(15920) + this.result.getText() + StubApp.getString2(6919);
    }

    public SpeechRecognitionEventArgs(long j, boolean z2) {
        super(j);
        storeEventData(z2);
    }
}
