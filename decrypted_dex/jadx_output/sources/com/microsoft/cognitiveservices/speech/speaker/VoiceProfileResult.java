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
public final class VoiceProfileResult implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12655a;

    /* renamed from: b, reason: collision with root package name */
    public PropertyCollection f12656b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12657c;

    /* renamed from: d, reason: collision with root package name */
    public final ResultReason f12658d;

    public VoiceProfileResult(long j) {
        this.f12655a = null;
        this.f12656b = null;
        this.f12657c = "";
        Contracts.throwIfNull(j, StubApp.getString2(1890));
        this.f12655a = new SafeHandle(j, SafeHandleType.VoiceProfileResult);
        StringRef stringRef = new StringRef("");
        Contracts.throwIfFail(getResultId(this.f12655a, stringRef));
        this.f12657c = stringRef.getValue();
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getResultReason(this.f12655a, intRef));
        this.f12658d = ResultReason.values()[(int) intRef.getValue()];
        IntRef intRef2 = new IntRef(0L);
        this.f12656b = b.c(getPropertyBagFromResult(this.f12655a, intRef2), intRef2);
    }

    private final native long getPropertyBagFromResult(SafeHandle safeHandle, IntRef intRef);

    private final native long getResultId(SafeHandle safeHandle, StringRef stringRef);

    private final native long getResultReason(SafeHandle safeHandle, IntRef intRef);

    @Override // java.lang.AutoCloseable
    public void close() {
        SafeHandle safeHandle = this.f12655a;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12655a = null;
        }
        PropertyCollection propertyCollection = this.f12656b;
        if (propertyCollection != null) {
            propertyCollection.close();
            this.f12656b = null;
        }
    }

    public SafeHandle getImpl() {
        Contracts.throwIfNull(this.f12655a, StubApp.getString2(1890));
        return this.f12655a;
    }

    public PropertyCollection getProperties() {
        return this.f12656b;
    }

    public ResultReason getReason() {
        return this.f12658d;
    }

    public String getResultId() {
        return this.f12657c;
    }

    public String toString() {
        return StubApp.getString2(15731) + getResultId() + StubApp.getString2(15710) + getReason() + StubApp.getString2(16053) + this.f12656b.getProperty(PropertyId.SpeechServiceResponse_JsonResult);
    }
}
