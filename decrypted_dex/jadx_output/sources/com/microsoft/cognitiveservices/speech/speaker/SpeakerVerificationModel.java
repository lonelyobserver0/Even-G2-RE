package com.microsoft.cognitiveservices.speech.speaker;

import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SpeakerVerificationModel implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12624a;

    /* renamed from: b, reason: collision with root package name */
    public SafeHandle f12625b;

    static {
        Class<?> cls = SpeechConfig.speechConfigClass;
    }

    private static final native long createSpeakerVerificationModel(IntRef intRef, SafeHandle safeHandle);

    public static SpeakerVerificationModel fromProfile(VoiceProfile voiceProfile) {
        Contracts.throwIfNull(voiceProfile, StubApp.getString2(16054));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createSpeakerVerificationModel(intRef, voiceProfile.getImpl()));
        SpeakerVerificationModel speakerVerificationModel = new SpeakerVerificationModel();
        speakerVerificationModel.f12624a = false;
        speakerVerificationModel.f12625b = null;
        Contracts.throwIfNull(intRef, StubApp.getString2(15712));
        speakerVerificationModel.f12625b = new SafeHandle(intRef.getValue(), SafeHandleType.SpeakerVerificationModel);
        return speakerVerificationModel;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.f12624a) {
            return;
        }
        SafeHandle safeHandle = this.f12625b;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12625b = null;
        }
        this.f12624a = true;
    }

    public SafeHandle getImpl() {
        return this.f12625b;
    }
}
