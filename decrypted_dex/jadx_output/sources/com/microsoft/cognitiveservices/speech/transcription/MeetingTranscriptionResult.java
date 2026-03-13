package com.microsoft.cognitiveservices.speech.transcription;

import com.microsoft.cognitiveservices.speech.SpeechRecognitionResult;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class MeetingTranscriptionResult extends SpeechRecognitionResult {

    /* renamed from: a, reason: collision with root package name */
    public final String f12702a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12703b;

    public MeetingTranscriptionResult(long j) {
        super(j);
        if (j != 0) {
            StringRef stringRef = new StringRef("");
            Contracts.throwIfFail(getUserId(super.getImpl(), stringRef));
            this.f12702a = stringRef.getValue();
            StringRef stringRef2 = new StringRef("");
            Contracts.throwIfFail(getUtteranceId(super.getImpl(), stringRef2));
            this.f12703b = stringRef2.getValue();
        }
    }

    private final native long getUserId(SafeHandle safeHandle, StringRef stringRef);

    private final native long getUtteranceId(SafeHandle safeHandle, StringRef stringRef);

    @Override // com.microsoft.cognitiveservices.speech.SpeechRecognitionResult, com.microsoft.cognitiveservices.speech.RecognitionResult, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    public String getUserId() {
        return this.f12702a;
    }

    public String getUtteranceId() {
        return this.f12703b;
    }

    @Override // com.microsoft.cognitiveservices.speech.SpeechRecognitionResult
    public String toString() {
        return StubApp.getString2(15731) + getResultId() + StubApp.getString2(15922) + getReason() + StubApp.getString2(16080) + this.f12702a + StubApp.getString2(16081) + this.f12703b + StubApp.getString2(15920) + getText() + StubApp.getString2(6919);
    }
}
