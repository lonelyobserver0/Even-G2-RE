package com.microsoft.cognitiveservices.speech.speaker;

import K9.a;
import K9.c;
import com.mapbox.common.b;
import com.microsoft.cognitiveservices.speech.PropertyCollection;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import com.microsoft.cognitiveservices.speech.util.AsyncThreadService;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;
import java.util.List;
import java.util.concurrent.Future;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class VoiceProfileClient implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12631a;

    /* renamed from: b, reason: collision with root package name */
    public PropertyCollection f12632b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12633c = false;

    public VoiceProfileClient(SpeechConfig speechConfig) {
        this.f12631a = null;
        this.f12632b = null;
        Contracts.throwIfNull(speechConfig, StubApp.getString2(15923));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createFromConfig(intRef, speechConfig.getImpl()));
        this.f12631a = new SafeHandle(intRef.getValue(), SafeHandleType.VoiceProfileClient);
        AsyncThreadService.initialize();
        IntRef intRef2 = new IntRef(0L);
        this.f12632b = b.c(getPropertyBagFromHandle(this.f12631a, intRef2), intRef2);
    }

    private final native long createFromConfig(IntRef intRef, SafeHandle safeHandle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long createVoiceProfile(SafeHandle safeHandle, int i3, String str, IntRef intRef);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long deleteVoiceProfile(SafeHandle safeHandle, SafeHandle safeHandle2, IntRef intRef);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long enrollVoiceProfile(SafeHandle safeHandle, SafeHandle safeHandle2, SafeHandle safeHandle3, IntRef intRef);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long getActivationPhrases(SafeHandle safeHandle, int i3, String str, IntRef intRef);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long getProfilesJson(SafeHandle safeHandle, int i3, StringRef stringRef, IntRef intRef);

    private final native long getPropertyBagFromHandle(SafeHandle safeHandle, IntRef intRef);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long resetVoiceProfile(SafeHandle safeHandle, SafeHandle safeHandle2, IntRef intRef);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long retrieveEnrollmentResult(SafeHandle safeHandle, String str, int i3, IntRef intRef);

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.f12633c) {
            return;
        }
        PropertyCollection propertyCollection = this.f12632b;
        if (propertyCollection != null) {
            propertyCollection.close();
            this.f12632b = null;
        }
        SafeHandle safeHandle = this.f12631a;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12631a = null;
        }
        AsyncThreadService.shutdown();
        this.f12633c = true;
    }

    public Future<VoiceProfile> createProfileAsync(VoiceProfileType voiceProfileType, String str) {
        return AsyncThreadService.submit(new a(this, voiceProfileType, str, 0));
    }

    public Future<VoiceProfileResult> deleteProfileAsync(VoiceProfile voiceProfile) {
        return AsyncThreadService.submit(new c(this, voiceProfile, 0));
    }

    public Future<VoiceProfileEnrollmentResult> enrollProfileAsync(VoiceProfile voiceProfile, AudioConfig audioConfig) {
        return AsyncThreadService.submit(new K9.b(this, voiceProfile, audioConfig, 0));
    }

    public Future<VoiceProfilePhraseResult> getActivationPhrasesAsync(VoiceProfileType voiceProfileType, String str) {
        return AsyncThreadService.submit(new a(this, voiceProfileType, str, 1));
    }

    public Future<List<VoiceProfile>> getAllProfilesAsync(VoiceProfileType voiceProfileType) {
        return AsyncThreadService.submit(new J9.c(4, this, voiceProfileType));
    }

    public SafeHandle getImpl() {
        return this.f12631a;
    }

    public PropertyCollection getProperties() {
        return this.f12632b;
    }

    public Future<VoiceProfileResult> resetProfileAsync(VoiceProfile voiceProfile) {
        return AsyncThreadService.submit(new c(this, voiceProfile, 1));
    }

    public Future<VoiceProfileEnrollmentResult> retrieveEnrollmentResultAsync(VoiceProfile voiceProfile) {
        return AsyncThreadService.submit(new c(this, voiceProfile, 2));
    }
}
