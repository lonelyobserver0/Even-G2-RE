package com.microsoft.cognitiveservices.speech.speaker;

import com.microsoft.cognitiveservices.speech.CancellationErrorCode;
import com.microsoft.cognitiveservices.speech.CancellationReason;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class VoiceProfileCancellationDetails {

    /* renamed from: a, reason: collision with root package name */
    public CancellationReason f12628a;

    /* renamed from: b, reason: collision with root package name */
    public String f12629b;

    /* renamed from: c, reason: collision with root package name */
    public CancellationErrorCode f12630c;

    public static VoiceProfileCancellationDetails fromResult(VoiceProfileResult voiceProfileResult) {
        VoiceProfileCancellationDetails voiceProfileCancellationDetails = new VoiceProfileCancellationDetails();
        Contracts.throwIfNull(voiceProfileResult, StubApp.getString2(1890));
        Contracts.throwIfNull(voiceProfileResult.getImpl(), StubApp.getString2(15730));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(voiceProfileCancellationDetails.getCanceledReason(voiceProfileResult.getImpl(), intRef));
        voiceProfileCancellationDetails.f12628a = CancellationReason.values()[((int) intRef.getValue()) - 1];
        Contracts.throwIfFail(voiceProfileCancellationDetails.getCanceledErrorCode(voiceProfileResult.getImpl(), intRef));
        voiceProfileCancellationDetails.f12630c = CancellationErrorCode.values()[(int) intRef.getValue()];
        voiceProfileCancellationDetails.f12629b = voiceProfileResult.getProperties().getProperty(PropertyId.SpeechServiceResponse_JsonErrorDetails);
        return voiceProfileCancellationDetails;
    }

    private final native long getCanceledErrorCode(SafeHandle safeHandle, IntRef intRef);

    private final native long getCanceledReason(SafeHandle safeHandle, IntRef intRef);

    public void close() {
    }

    public CancellationErrorCode getErrorCode() {
        return this.f12630c;
    }

    public String getErrorDetails() {
        return this.f12629b;
    }

    public CancellationReason getReason() {
        return this.f12628a;
    }

    public String toString() {
        return StubApp.getString2(15668) + this.f12628a + StubApp.getString2(15669) + this.f12630c + StubApp.getString2(15670) + this.f12629b;
    }
}
