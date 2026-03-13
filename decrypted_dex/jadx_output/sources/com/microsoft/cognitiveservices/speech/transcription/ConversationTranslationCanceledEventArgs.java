package com.microsoft.cognitiveservices.speech.transcription;

import com.microsoft.cognitiveservices.speech.CancellationDetails;
import com.microsoft.cognitiveservices.speech.CancellationErrorCode;
import com.microsoft.cognitiveservices.speech.CancellationReason;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ConversationTranslationCanceledEventArgs extends ConversationTranslationEventArgs {

    /* renamed from: b, reason: collision with root package name */
    public final String f12677b;

    /* renamed from: c, reason: collision with root package name */
    public final CancellationReason f12678c;

    /* renamed from: d, reason: collision with root package name */
    public final CancellationErrorCode f12679d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12680e;

    public ConversationTranslationCanceledEventArgs(long j) {
        super(j);
        a(false);
        Contracts.throwIfNull(this.eventHandle, StubApp.getString2(15697));
        String sessionId = getSessionId();
        this.f12677b = sessionId;
        Contracts.throwIfNull(sessionId, StubApp.getString2(15707));
        CancellationDetails fromResult = CancellationDetails.fromResult(getResult());
        this.f12678c = fromResult.getReason();
        this.f12679d = fromResult.getErrorCode();
        this.f12680e = fromResult.getErrorDetails();
        super.close();
    }

    public CancellationErrorCode getErrorCode() {
        return this.f12679d;
    }

    public String getErrorDetails() {
        return this.f12680e;
    }

    public CancellationReason getReason() {
        return this.f12678c;
    }

    @Override // com.microsoft.cognitiveservices.speech.transcription.ConversationTranslationEventArgs, com.microsoft.cognitiveservices.speech.RecognitionEventArgs, com.microsoft.cognitiveservices.speech.SessionEventArgs
    public String toString() {
        return StubApp.getString2(15708) + this.f12677b + StubApp.getString2(15709) + getResult().getResultId() + StubApp.getString2(15917) + this.f12678c + StubApp.getString2(15918) + this.f12679d + StubApp.getString2(15919) + this.f12680e;
    }
}
