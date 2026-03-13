package com.microsoft.cognitiveservices.speech.speaker;

import com.mapbox.common.b;
import com.microsoft.cognitiveservices.speech.PropertyCollection;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.ResultReason;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class SpeakerRecognitionResult implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12615a;

    /* renamed from: b, reason: collision with root package name */
    public PropertyCollection f12616b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12617c;

    /* renamed from: d, reason: collision with root package name */
    public final ResultReason f12618d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12619e;

    /* renamed from: f, reason: collision with root package name */
    public final double f12620f;

    public SpeakerRecognitionResult(long j) {
        this.f12615a = null;
        this.f12616b = null;
        this.f12617c = "";
        this.f12619e = "";
        this.f12620f = 0.0d;
        Contracts.throwIfNull(j, StubApp.getString2(1890));
        this.f12615a = new SafeHandle(j, SafeHandleType.SpeakerRecognitionResult);
        StringRef stringRef = new StringRef("");
        Contracts.throwIfFail(getResultId(this.f12615a, stringRef));
        this.f12617c = stringRef.getValue();
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getResultReason(this.f12615a, intRef));
        this.f12618d = ResultReason.values()[(int) intRef.getValue()];
        IntRef intRef2 = new IntRef(0L);
        PropertyCollection c10 = b.c(getPropertyBagFromResult(this.f12615a, intRef2), intRef2);
        this.f12616b = c10;
        this.f12619e = c10.getProperty(StubApp.getString2(16050));
        String property = this.f12616b.getProperty(StubApp.getString2(16051));
        this.f12620f = property.isEmpty() ? 0.0d : Double.parseDouble(property);
    }

    private final native long getPropertyBagFromResult(SafeHandle safeHandle, IntRef intRef);

    private final native long getResultId(SafeHandle safeHandle, StringRef stringRef);

    private final native long getResultReason(SafeHandle safeHandle, IntRef intRef);

    @Override // java.lang.AutoCloseable
    public void close() {
        SafeHandle safeHandle = this.f12615a;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12615a = null;
        }
        PropertyCollection propertyCollection = this.f12616b;
        if (propertyCollection != null) {
            propertyCollection.close();
            this.f12616b = null;
        }
    }

    public SafeHandle getImpl() {
        Contracts.throwIfNull(this.f12615a, StubApp.getString2(1890));
        return this.f12615a;
    }

    public String getProfileId() {
        return this.f12619e;
    }

    public PropertyCollection getProperties() {
        return this.f12616b;
    }

    public ResultReason getReason() {
        return this.f12618d;
    }

    public String getResultId() {
        return this.f12617c;
    }

    public Double getScore() {
        return Double.valueOf(this.f12620f);
    }

    public String toString() {
        return StubApp.getString2(15731) + getResultId() + StubApp.getString2(15710) + getReason() + StubApp.getString2(16052) + getProfileId() + StubApp.getString2(16053) + this.f12616b.getProperty(PropertyId.SpeechServiceResponse_JsonResult);
    }
}
