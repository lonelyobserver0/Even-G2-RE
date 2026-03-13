package com.microsoft.cognitiveservices.speech;

import com.mapbox.common.b;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class PronunciationAssessmentConfig implements AutoCloseable {
    private SafeHandle configHandle;
    private boolean disposed;
    private PropertyCollection propertyHandle;

    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private PronunciationAssessmentConfig(long j) {
        this.configHandle = null;
        this.propertyHandle = null;
        this.disposed = false;
        init(j);
    }

    private final native long applyTo(SafeHandle safeHandle, SafeHandle safeHandle2);

    private static final native long create(IntRef intRef, String str, int i3, int i10, boolean z2);

    private static final native long fromJson(IntRef intRef, String str);

    public static PronunciationAssessmentConfig fromJson(String str) {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromJson(intRef, str));
        return new PronunciationAssessmentConfig(intRef.getValue());
    }

    private final native long getPropertyBag(SafeHandle safeHandle, IntRef intRef);

    private void init(long j) {
        Contracts.throwIfNull(j, StubApp.getString2(15661));
        this.configHandle = new SafeHandle(j, SafeHandleType.PronunciationAssessmentConfig);
        IntRef intRef = new IntRef(0L);
        this.propertyHandle = b.c(getPropertyBag(this.configHandle, intRef), intRef);
    }

    private final native String toJson(SafeHandle safeHandle);

    public void applyTo(Recognizer recognizer) {
        Contracts.throwIfNull(this.configHandle, StubApp.getString2(15748));
        Contracts.throwIfNull(recognizer, StubApp.getString2(15732));
        Contracts.throwIfNull(recognizer.getImpl(), StubApp.getString2(15749));
        applyTo(this.configHandle, recognizer.getImpl());
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.disposed) {
            return;
        }
        PropertyCollection propertyCollection = this.propertyHandle;
        if (propertyCollection != null) {
            propertyCollection.close();
            this.propertyHandle = null;
        }
        SafeHandle safeHandle = this.configHandle;
        if (safeHandle != null) {
            safeHandle.close();
            this.configHandle = null;
        }
        this.disposed = true;
    }

    public void enableContentAssessmentWithTopic(String str) {
        Contracts.throwIfNull(str, StubApp.getString2(1418));
        this.propertyHandle.setProperty(PropertyId.PronunciationAssessment_ContentTopic, str);
    }

    public void enableProsodyAssessment() {
        this.propertyHandle.setProperty(PropertyId.PronunciationAssessment_EnableProsodyAssessment, StubApp.getString2(6547));
    }

    public SafeHandle getImpl() {
        return this.configHandle;
    }

    public String getReferenceText() {
        return this.propertyHandle.getProperty(PropertyId.PronunciationAssessment_ReferenceText);
    }

    public void setNBestPhonemeCount(int i3) {
        this.propertyHandle.setProperty(PropertyId.PronunciationAssessment_NBestPhonemeCount, String.valueOf(i3));
    }

    public void setPhonemeAlphabet(String str) {
        Contracts.throwIfNull(str, StubApp.getString2(1061));
        this.propertyHandle.setProperty(PropertyId.PronunciationAssessment_PhonemeAlphabet, str);
    }

    public void setReferenceText(String str) {
        Contracts.throwIfNull(str, StubApp.getString2(1061));
        this.propertyHandle.setProperty(PropertyId.PronunciationAssessment_ReferenceText, str);
    }

    public String toJson() {
        Contracts.throwIfNull(this.configHandle, StubApp.getString2(15748));
        return toJson(this.configHandle);
    }

    public PronunciationAssessmentConfig(String str) {
        this(str, PronunciationAssessmentGradingSystem.FivePoint, PronunciationAssessmentGranularity.Phoneme);
    }

    public PronunciationAssessmentConfig(String str, PronunciationAssessmentGradingSystem pronunciationAssessmentGradingSystem, PronunciationAssessmentGranularity pronunciationAssessmentGranularity) {
        this(str, pronunciationAssessmentGradingSystem, pronunciationAssessmentGranularity, false);
    }

    public PronunciationAssessmentConfig(String str, PronunciationAssessmentGradingSystem pronunciationAssessmentGradingSystem, PronunciationAssessmentGranularity pronunciationAssessmentGranularity, boolean z2) {
        this.configHandle = null;
        this.propertyHandle = null;
        this.disposed = false;
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(create(intRef, str, pronunciationAssessmentGradingSystem.getValue(), pronunciationAssessmentGranularity.getValue(), z2));
        init(intRef.getValue());
    }
}
