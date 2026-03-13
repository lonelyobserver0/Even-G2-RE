package com.microsoft.cognitiveservices.speech.translation;

import com.microsoft.cognitiveservices.speech.CancellationDetails;
import com.microsoft.cognitiveservices.speech.CancellationErrorCode;
import com.microsoft.cognitiveservices.speech.CancellationReason;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class TranslationRecognitionCanceledEventArgs extends TranslationRecognitionEventArgs {

    /* renamed from: b, reason: collision with root package name */
    public final CancellationReason f12716b;

    /* renamed from: c, reason: collision with root package name */
    public final CancellationErrorCode f12717c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12718d;

    public TranslationRecognitionCanceledEventArgs(long j) {
        super(j);
        a(false);
        Contracts.throwIfNull(this.eventHandle, StubApp.getString2(15697));
        CancellationDetails fromResult = CancellationDetails.fromResult(getResult());
        this.f12716b = fromResult.getReason();
        this.f12717c = fromResult.getErrorCode();
        this.f12718d = fromResult.getErrorDetails();
        super.close();
    }

    public CancellationErrorCode getErrorCode() {
        return this.f12717c;
    }

    public String getErrorDetails() {
        return this.f12718d;
    }

    public CancellationReason getReason() {
        return this.f12716b;
    }

    @Override // com.microsoft.cognitiveservices.speech.translation.TranslationRecognitionEventArgs, com.microsoft.cognitiveservices.speech.RecognitionEventArgs, com.microsoft.cognitiveservices.speech.SessionEventArgs
    public String toString() {
        return StubApp.getString2(15708) + getSessionId() + StubApp.getString2(15709) + getResult().getResultId() + StubApp.getString2(15917) + this.f12716b + StubApp.getString2(15918) + this.f12717c + StubApp.getString2(16035) + this.f12718d;
    }
}
