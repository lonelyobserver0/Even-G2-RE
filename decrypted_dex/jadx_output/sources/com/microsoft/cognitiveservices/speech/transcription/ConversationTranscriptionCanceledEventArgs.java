package com.microsoft.cognitiveservices.speech.transcription;

import com.microsoft.cognitiveservices.speech.CancellationDetails;
import com.microsoft.cognitiveservices.speech.CancellationErrorCode;
import com.microsoft.cognitiveservices.speech.CancellationReason;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class ConversationTranscriptionCanceledEventArgs extends ConversationTranscriptionEventArgs {

    /* renamed from: b, reason: collision with root package name */
    public final String f12671b;

    /* renamed from: c, reason: collision with root package name */
    public final CancellationReason f12672c;

    /* renamed from: d, reason: collision with root package name */
    public final CancellationErrorCode f12673d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12674e;

    public ConversationTranscriptionCanceledEventArgs(long j) {
        super(j);
        a(false);
        Contracts.throwIfNull(this.eventHandle, StubApp.getString2(15697));
        String sessionId = getSessionId();
        this.f12671b = sessionId;
        Contracts.throwIfNull(sessionId, StubApp.getString2(15707));
        CancellationDetails fromResult = CancellationDetails.fromResult(getResult());
        this.f12672c = fromResult.getReason();
        this.f12673d = fromResult.getErrorCode();
        this.f12674e = fromResult.getErrorDetails();
        super.close();
    }

    public CancellationErrorCode getErrorCode() {
        return this.f12673d;
    }

    public String getErrorDetails() {
        return this.f12674e;
    }

    public CancellationReason getReason() {
        return this.f12672c;
    }

    @Override // com.microsoft.cognitiveservices.speech.transcription.ConversationTranscriptionEventArgs, com.microsoft.cognitiveservices.speech.RecognitionEventArgs, com.microsoft.cognitiveservices.speech.SessionEventArgs
    public String toString() {
        return StubApp.getString2(15708) + this.f12671b + StubApp.getString2(15709) + getResult().getResultId() + StubApp.getString2(15917) + this.f12672c + StubApp.getString2(15918) + this.f12673d + StubApp.getString2(15919) + this.f12674e;
    }
}
