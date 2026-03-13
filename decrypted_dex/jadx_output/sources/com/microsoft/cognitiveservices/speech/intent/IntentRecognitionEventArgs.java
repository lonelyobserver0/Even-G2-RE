package com.microsoft.cognitiveservices.speech.intent;

import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.RecognitionEventArgs;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class IntentRecognitionEventArgs extends RecognitionEventArgs {

    /* renamed from: a, reason: collision with root package name */
    public IntentRecognitionResult f12587a;

    public IntentRecognitionEventArgs(long j, int i3) {
        super(j);
        a(true);
    }

    public final void a(boolean z2) {
        Contracts.throwIfNull(this.eventHandle, StubApp.getString2(15697));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getRecognitionResult(this.eventHandle, intRef));
        this.f12587a = new IntentRecognitionResult(intRef.getValue());
        Contracts.throwIfNull(getSessionId(), StubApp.getString2(15707));
        if (z2) {
            super.close();
        }
    }

    public final IntentRecognitionResult getResult() {
        return this.f12587a;
    }

    @Override // com.microsoft.cognitiveservices.speech.RecognitionEventArgs, com.microsoft.cognitiveservices.speech.SessionEventArgs
    public String toString() {
        return StubApp.getString2(15708) + getSessionId() + StubApp.getString2(15709) + this.f12587a.getResultId() + StubApp.getString2(15710) + this.f12587a.getReason() + StubApp.getString2(16036) + this.f12587a.getIntentId() + StubApp.getString2(15711) + this.f12587a.getText() + StubApp.getString2(16037) + this.f12587a.getProperties().getProperty(PropertyId.SpeechServiceResponse_JsonResult) + StubApp.getString2(16038) + this.f12587a.getProperties().getProperty(PropertyId.LanguageUnderstandingServiceResponse_JsonResult) + StubApp.getString2(6919);
    }
}
