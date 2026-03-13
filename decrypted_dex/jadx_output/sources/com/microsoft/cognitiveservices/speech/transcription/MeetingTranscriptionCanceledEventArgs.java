package com.microsoft.cognitiveservices.speech.transcription;

import com.microsoft.cognitiveservices.speech.CancellationDetails;
import com.microsoft.cognitiveservices.speech.CancellationErrorCode;
import com.microsoft.cognitiveservices.speech.CancellationReason;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class MeetingTranscriptionCanceledEventArgs extends MeetingTranscriptionEventArgs {

    /* renamed from: b, reason: collision with root package name */
    public final String f12697b;

    /* renamed from: c, reason: collision with root package name */
    public final CancellationReason f12698c;

    /* renamed from: d, reason: collision with root package name */
    public final CancellationErrorCode f12699d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12700e;

    public MeetingTranscriptionCanceledEventArgs(long j) {
        super(j);
        a(false);
        Contracts.throwIfNull(this.eventHandle, StubApp.getString2(15697));
        String sessionId = getSessionId();
        this.f12697b = sessionId;
        Contracts.throwIfNull(sessionId, StubApp.getString2(15707));
        CancellationDetails fromResult = CancellationDetails.fromResult(getResult());
        this.f12698c = fromResult.getReason();
        this.f12699d = fromResult.getErrorCode();
        this.f12700e = fromResult.getErrorDetails();
        super.close();
    }

    public CancellationErrorCode getErrorCode() {
        return this.f12699d;
    }

    public String getErrorDetails() {
        return this.f12700e;
    }

    public CancellationReason getReason() {
        return this.f12698c;
    }

    @Override // com.microsoft.cognitiveservices.speech.transcription.MeetingTranscriptionEventArgs, com.microsoft.cognitiveservices.speech.RecognitionEventArgs, com.microsoft.cognitiveservices.speech.SessionEventArgs
    public String toString() {
        return StubApp.getString2(15708) + this.f12697b + StubApp.getString2(15709) + getResult().getResultId() + StubApp.getString2(15917) + this.f12698c + StubApp.getString2(15918) + this.f12699d + StubApp.getString2(15919) + this.f12700e;
    }
}
