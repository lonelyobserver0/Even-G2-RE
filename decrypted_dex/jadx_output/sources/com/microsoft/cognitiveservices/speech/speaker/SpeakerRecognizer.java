package com.microsoft.cognitiveservices.speech.speaker;

import J9.c;
import com.mapbox.common.b;
import com.microsoft.cognitiveservices.speech.PropertyCollection;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import com.microsoft.cognitiveservices.speech.util.AsyncThreadService;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;
import java.util.concurrent.Future;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class SpeakerRecognizer implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12621a;

    /* renamed from: b, reason: collision with root package name */
    public PropertyCollection f12622b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12623c = false;

    public SpeakerRecognizer(SpeechConfig speechConfig, AudioConfig audioConfig) {
        this.f12621a = null;
        this.f12622b = null;
        Contracts.throwIfNull(speechConfig, StubApp.getString2(15923));
        IntRef intRef = new IntRef(0L);
        SafeHandle impl = speechConfig.getImpl();
        Contracts.throwIfFail(audioConfig == null ? createFromConfig(intRef, impl, null) : createFromConfig(intRef, impl, audioConfig.getImpl()));
        this.f12621a = new SafeHandle(intRef.getValue(), SafeHandleType.SpeakerRecognizer);
        AsyncThreadService.initialize();
        IntRef intRef2 = new IntRef(0L);
        this.f12622b = b.c(getPropertyBagFromRecognizerHandle(this.f12621a, intRef2), intRef2);
    }

    private final native long createFromConfig(IntRef intRef, SafeHandle safeHandle, SafeHandle safeHandle2);

    private final native long getPropertyBagFromRecognizerHandle(SafeHandle safeHandle, IntRef intRef);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long identifyOnce(SafeHandle safeHandle, SafeHandle safeHandle2, IntRef intRef);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long verifyOnce(SafeHandle safeHandle, SafeHandle safeHandle2, IntRef intRef);

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.f12623c) {
            return;
        }
        PropertyCollection propertyCollection = this.f12622b;
        if (propertyCollection != null) {
            propertyCollection.close();
            this.f12622b = null;
        }
        SafeHandle safeHandle = this.f12621a;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12621a = null;
        }
        AsyncThreadService.shutdown();
        this.f12623c = true;
    }

    public SafeHandle getImpl() {
        return this.f12621a;
    }

    public PropertyCollection getProperties() {
        return this.f12622b;
    }

    public Future<SpeakerRecognitionResult> recognizeOnceAsync(SpeakerIdentificationModel speakerIdentificationModel) {
        return AsyncThreadService.submit(new c(3, this, speakerIdentificationModel));
    }

    public Future<SpeakerRecognitionResult> recognizeOnceAsync(SpeakerVerificationModel speakerVerificationModel) {
        return AsyncThreadService.submit(new c(2, this, speakerVerificationModel));
    }
}
