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
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class VoiceProfilePhraseResult implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12650a;

    /* renamed from: b, reason: collision with root package name */
    public PropertyCollection f12651b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12652c;

    /* renamed from: d, reason: collision with root package name */
    public final ResultReason f12653d;

    /* renamed from: e, reason: collision with root package name */
    public final List f12654e;

    public VoiceProfilePhraseResult(long j) {
        this.f12650a = null;
        this.f12651b = null;
        this.f12652c = "";
        this.f12650a = new SafeHandle(j, SafeHandleType.VoiceProfilePhraseResult);
        StringRef stringRef = new StringRef("");
        Contracts.throwIfFail(getResultId(this.f12650a, stringRef));
        this.f12652c = stringRef.getValue();
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getResultReason(this.f12650a, intRef));
        this.f12653d = ResultReason.values()[(int) intRef.getValue()];
        IntRef intRef2 = new IntRef(0L);
        PropertyCollection c10 = b.c(getPropertyBagFromResult(this.f12650a, intRef2), intRef2);
        this.f12651b = c10;
        String property = c10.getProperty(StubApp.getString2(16066));
        if (property.isEmpty()) {
            return;
        }
        this.f12654e = Arrays.asList(property.split(StubApp.getString2(3048)));
    }

    private final native long getPropertyBagFromResult(SafeHandle safeHandle, IntRef intRef);

    private final native long getResultId(SafeHandle safeHandle, StringRef stringRef);

    private final native long getResultReason(SafeHandle safeHandle, IntRef intRef);

    @Override // java.lang.AutoCloseable
    public void close() {
        PropertyCollection propertyCollection = this.f12651b;
        if (propertyCollection != null) {
            propertyCollection.close();
            this.f12651b = null;
        }
        SafeHandle safeHandle = this.f12650a;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12650a = null;
        }
    }

    public SafeHandle getImpl() {
        Contracts.throwIfNull(this.f12650a, StubApp.getString2(1890));
        return this.f12650a;
    }

    public List<String> getPhrases() {
        return this.f12654e;
    }

    public PropertyCollection getProperties() {
        return this.f12651b;
    }

    public ResultReason getReason() {
        return this.f12653d;
    }

    public String getResultId() {
        return this.f12652c;
    }

    public String toString() {
        return StubApp.getString2(15731) + getResultId() + StubApp.getString2(15710) + getReason() + StubApp.getString2(16053) + this.f12651b.getProperty(PropertyId.SpeechServiceResponse_JsonResult);
    }
}
