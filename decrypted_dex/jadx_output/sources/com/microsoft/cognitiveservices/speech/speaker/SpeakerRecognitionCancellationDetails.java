package com.microsoft.cognitiveservices.speech.speaker;

import com.microsoft.cognitiveservices.speech.CancellationErrorCode;
import com.microsoft.cognitiveservices.speech.CancellationReason;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SpeakerRecognitionCancellationDetails {

    /* renamed from: a, reason: collision with root package name */
    public CancellationReason f12612a;

    /* renamed from: b, reason: collision with root package name */
    public String f12613b;

    /* renamed from: c, reason: collision with root package name */
    public CancellationErrorCode f12614c;

    public static SpeakerRecognitionCancellationDetails fromResult(SpeakerRecognitionResult speakerRecognitionResult) {
        SpeakerRecognitionCancellationDetails speakerRecognitionCancellationDetails = new SpeakerRecognitionCancellationDetails();
        Contracts.throwIfNull(speakerRecognitionResult, StubApp.getString2(1890));
        Contracts.throwIfNull(speakerRecognitionResult.getImpl(), StubApp.getString2(15730));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(speakerRecognitionCancellationDetails.getCanceledReason(speakerRecognitionResult.getImpl(), intRef));
        speakerRecognitionCancellationDetails.f12612a = CancellationReason.values()[((int) intRef.getValue()) - 1];
        Contracts.throwIfFail(speakerRecognitionCancellationDetails.getCanceledErrorCode(speakerRecognitionResult.getImpl(), intRef));
        speakerRecognitionCancellationDetails.f12614c = CancellationErrorCode.values()[(int) intRef.getValue()];
        speakerRecognitionCancellationDetails.f12613b = speakerRecognitionResult.getProperties().getProperty(PropertyId.SpeechServiceResponse_JsonErrorDetails);
        return speakerRecognitionCancellationDetails;
    }

    private final native long getCanceledErrorCode(SafeHandle safeHandle, IntRef intRef);

    private final native long getCanceledReason(SafeHandle safeHandle, IntRef intRef);

    public void close() {
    }

    public CancellationErrorCode getErrorCode() {
        return this.f12614c;
    }

    public String getErrorDetails() {
        return this.f12613b;
    }

    public CancellationReason getReason() {
        return this.f12612a;
    }

    public String toString() {
        return StubApp.getString2(15668) + this.f12612a + StubApp.getString2(15669) + this.f12614c + StubApp.getString2(15670) + this.f12613b;
    }
}
