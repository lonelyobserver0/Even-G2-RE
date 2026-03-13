package com.microsoft.cognitiveservices.speech;

import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class SpeechRecognitionCanceledEventArgs extends SpeechRecognitionEventArgs {
    private CancellationReason cancellationReason;
    private CancellationErrorCode errorCode;
    private String errorDetails;

    public SpeechRecognitionCanceledEventArgs(long j) {
        super(j);
        storeEventData(false);
    }

    private void storeEventData(boolean z2) {
        Contracts.throwIfNull(this.eventHandle, StubApp.getString2(15697));
        CancellationDetails fromResult = CancellationDetails.fromResult(getResult());
        this.cancellationReason = fromResult.getReason();
        this.errorCode = fromResult.getErrorCode();
        this.errorDetails = fromResult.getErrorDetails();
        if (z2) {
            super.close();
        }
    }

    public CancellationErrorCode getErrorCode() {
        return this.errorCode;
    }

    public String getErrorDetails() {
        return this.errorDetails;
    }

    public CancellationReason getReason() {
        return this.cancellationReason;
    }

    @Override // com.microsoft.cognitiveservices.speech.SpeechRecognitionEventArgs, com.microsoft.cognitiveservices.speech.RecognitionEventArgs, com.microsoft.cognitiveservices.speech.SessionEventArgs
    public String toString() {
        return StubApp.getString2(15708) + getSessionId() + StubApp.getString2(15709) + getResult().getResultId() + StubApp.getString2(15917) + this.cancellationReason + StubApp.getString2(15918) + this.errorCode + StubApp.getString2(15919) + this.errorDetails;
    }

    public SpeechRecognitionCanceledEventArgs(long j, boolean z2) {
        super(j);
        storeEventData(z2);
    }
}
