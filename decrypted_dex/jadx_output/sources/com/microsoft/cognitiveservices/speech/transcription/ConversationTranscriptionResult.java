package com.microsoft.cognitiveservices.speech.transcription;

import com.microsoft.cognitiveservices.speech.SpeechRecognitionResult;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ConversationTranscriptionResult extends SpeechRecognitionResult {

    /* renamed from: a, reason: collision with root package name */
    public final String f12676a;

    public ConversationTranscriptionResult(long j) {
        super(j);
        if (j != 0) {
            StringRef stringRef = new StringRef("");
            Contracts.throwIfFail(getSpeakerId(super.getImpl(), stringRef));
            this.f12676a = stringRef.getValue();
        }
    }

    private final native long getSpeakerId(SafeHandle safeHandle, StringRef stringRef);

    @Override // com.microsoft.cognitiveservices.speech.SpeechRecognitionResult, com.microsoft.cognitiveservices.speech.RecognitionResult, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    public String getSpeakerId() {
        return this.f12676a;
    }

    @Override // com.microsoft.cognitiveservices.speech.SpeechRecognitionResult
    public String toString() {
        return StubApp.getString2(15731) + getResultId() + StubApp.getString2(15922) + getReason() + StubApp.getString2(16073) + this.f12676a + StubApp.getString2(15920) + getText() + StubApp.getString2(6919);
    }
}
