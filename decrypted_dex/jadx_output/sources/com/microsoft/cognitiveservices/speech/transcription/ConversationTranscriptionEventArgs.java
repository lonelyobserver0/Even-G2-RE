package com.microsoft.cognitiveservices.speech.transcription;

import com.microsoft.cognitiveservices.speech.RecognitionEventArgs;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ConversationTranscriptionEventArgs extends RecognitionEventArgs {

    /* renamed from: a, reason: collision with root package name */
    public ConversationTranscriptionResult f12675a;

    public ConversationTranscriptionEventArgs(long j, int i3) {
        super(j);
        a(true);
    }

    public final void a(boolean z2) {
        Contracts.throwIfNull(this.eventHandle, StubApp.getString2(15697));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getRecognitionResult(this.eventHandle, intRef));
        this.f12675a = new ConversationTranscriptionResult(intRef.getValue());
        Contracts.throwIfNull(getSessionId(), StubApp.getString2(15707));
        if (z2) {
            super.close();
        }
    }

    public final ConversationTranscriptionResult getResult() {
        return this.f12675a;
    }

    @Override // com.microsoft.cognitiveservices.speech.RecognitionEventArgs, com.microsoft.cognitiveservices.speech.SessionEventArgs
    public String toString() {
        return StubApp.getString2(15708) + getSessionId() + StubApp.getString2(15709) + this.f12675a.getResultId() + StubApp.getString2(15710) + this.f12675a.getReason() + StubApp.getString2(16073) + this.f12675a.getSpeakerId() + StubApp.getString2(15920) + this.f12675a.getText() + StubApp.getString2(6919);
    }
}
