package com.microsoft.cognitiveservices.speech.speaker;

import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SpeakerIdentificationModel implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12610a;

    /* renamed from: b, reason: collision with root package name */
    public SafeHandle f12611b;

    static {
        Class<?> cls = SpeechConfig.speechConfigClass;
    }

    private static final native long createSpeakerIdentificationModel(IntRef intRef);

    public static SpeakerIdentificationModel fromProfiles(List<VoiceProfile> list) {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfNull(list, StubApp.getString2(16049));
        Contracts.throwIfFail(createSpeakerIdentificationModel(intRef));
        Iterator<VoiceProfile> it = list.iterator();
        while (it.hasNext()) {
            Contracts.throwIfFail(speakerIdentificationModelAddProfile(intRef, it.next().getImpl()));
        }
        SpeakerIdentificationModel speakerIdentificationModel = new SpeakerIdentificationModel();
        speakerIdentificationModel.f12610a = false;
        speakerIdentificationModel.f12611b = null;
        Contracts.throwIfNull(intRef, StubApp.getString2(15712));
        speakerIdentificationModel.f12611b = new SafeHandle(intRef.getValue(), SafeHandleType.SpeakerIdentificationModel);
        return speakerIdentificationModel;
    }

    private static final native long speakerIdentificationModelAddProfile(IntRef intRef, SafeHandle safeHandle);

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.f12610a) {
            return;
        }
        SafeHandle safeHandle = this.f12611b;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12611b = null;
        }
        this.f12610a = true;
    }

    public SafeHandle getImpl() {
        return this.f12611b;
    }
}
