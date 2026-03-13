package com.microsoft.cognitiveservices.speech.transcription;

import com.microsoft.cognitiveservices.speech.RecognitionEventArgs;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ConversationTranslationEventArgs extends RecognitionEventArgs {

    /* renamed from: a, reason: collision with root package name */
    public ConversationTranslationResult f12681a;

    public ConversationTranslationEventArgs(long j, int i3) {
        super(j);
        a(true);
    }

    public final void a(boolean z2) {
        Contracts.throwIfNull(this.eventHandle, StubApp.getString2(15697));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getRecognitionResult(this.eventHandle, intRef));
        this.f12681a = new ConversationTranslationResult(intRef.getValue());
        Contracts.throwIfNull(getSessionId(), StubApp.getString2(15707));
        if (z2) {
            super.close();
        }
    }

    public final ConversationTranslationResult getResult() {
        return this.f12681a;
    }

    @Override // com.microsoft.cognitiveservices.speech.RecognitionEventArgs, com.microsoft.cognitiveservices.speech.SessionEventArgs
    public String toString() {
        return StubApp.getString2(15708) + getSessionId() + StubApp.getString2(15709) + this.f12681a.getResultId() + StubApp.getString2(15710) + this.f12681a.getReason() + StubApp.getString2(16074) + this.f12681a.getOriginalLang() + StubApp.getString2(16075) + this.f12681a.getParticipantId() + StubApp.getString2(15920) + this.f12681a.getText() + StubApp.getString2(6919);
    }
}
