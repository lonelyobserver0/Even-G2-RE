package com.microsoft.cognitiveservices.speech.speaker;

import com.microsoft.cognitiveservices.speech.CancellationErrorCode;
import com.microsoft.cognitiveservices.speech.CancellationReason;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class VoiceProfileEnrollmentCancellationDetails {

    /* renamed from: a, reason: collision with root package name */
    public CancellationReason f12634a;

    /* renamed from: b, reason: collision with root package name */
    public String f12635b;

    /* renamed from: c, reason: collision with root package name */
    public CancellationErrorCode f12636c;

    public static VoiceProfileEnrollmentCancellationDetails fromResult(VoiceProfileEnrollmentResult voiceProfileEnrollmentResult) {
        VoiceProfileEnrollmentCancellationDetails voiceProfileEnrollmentCancellationDetails = new VoiceProfileEnrollmentCancellationDetails();
        Contracts.throwIfNull(voiceProfileEnrollmentResult, StubApp.getString2(1890));
        Contracts.throwIfNull(voiceProfileEnrollmentResult.getImpl(), StubApp.getString2(15730));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(voiceProfileEnrollmentCancellationDetails.getCanceledReason(voiceProfileEnrollmentResult.getImpl(), intRef));
        voiceProfileEnrollmentCancellationDetails.f12634a = CancellationReason.values()[((int) intRef.getValue()) - 1];
        Contracts.throwIfFail(voiceProfileEnrollmentCancellationDetails.getCanceledErrorCode(voiceProfileEnrollmentResult.getImpl(), intRef));
        voiceProfileEnrollmentCancellationDetails.f12636c = CancellationErrorCode.values()[(int) intRef.getValue()];
        voiceProfileEnrollmentCancellationDetails.f12635b = voiceProfileEnrollmentResult.getProperties().getProperty(PropertyId.SpeechServiceResponse_JsonErrorDetails);
        return voiceProfileEnrollmentCancellationDetails;
    }

    private final native long getCanceledErrorCode(SafeHandle safeHandle, IntRef intRef);

    private final native long getCanceledReason(SafeHandle safeHandle, IntRef intRef);

    public CancellationErrorCode getErrorCode() {
        return this.f12636c;
    }

    public String getErrorDetails() {
        return this.f12635b;
    }

    public CancellationReason getReason() {
        return this.f12634a;
    }

    public String toString() {
        return StubApp.getString2(15668) + this.f12634a + StubApp.getString2(15669) + this.f12636c + StubApp.getString2(15670) + this.f12635b;
    }
}
