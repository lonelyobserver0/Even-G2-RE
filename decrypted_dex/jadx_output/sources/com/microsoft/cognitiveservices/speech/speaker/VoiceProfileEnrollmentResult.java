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
import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class VoiceProfileEnrollmentResult implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12637a;

    /* renamed from: b, reason: collision with root package name */
    public PropertyCollection f12638b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12639c;

    /* renamed from: d, reason: collision with root package name */
    public final ResultReason f12640d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12641e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12642f;

    /* renamed from: g, reason: collision with root package name */
    public final BigInteger f12643g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12644h;
    public final BigInteger j;

    /* renamed from: k, reason: collision with root package name */
    public final BigInteger f12645k;

    /* renamed from: l, reason: collision with root package name */
    public final BigInteger f12646l;

    /* renamed from: m, reason: collision with root package name */
    public final BigInteger f12647m;

    /* renamed from: n, reason: collision with root package name */
    public final String f12648n;

    /* renamed from: p, reason: collision with root package name */
    public final String f12649p;

    public VoiceProfileEnrollmentResult(long j) {
        this.f12637a = null;
        this.f12638b = null;
        this.f12639c = "";
        this.f12641e = "";
        this.f12642f = 0;
        this.f12644h = 0;
        this.f12648n = "";
        this.f12649p = "";
        this.f12637a = new SafeHandle(j, SafeHandleType.VoiceProfileEnrollmentResult);
        StringRef stringRef = new StringRef("");
        Contracts.throwIfFail(getResultId(this.f12637a, stringRef));
        this.f12639c = stringRef.getValue();
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getResultReason(this.f12637a, intRef));
        this.f12640d = ResultReason.values()[(int) intRef.getValue()];
        IntRef intRef2 = new IntRef(0L);
        PropertyCollection c10 = b.c(getPropertyBagFromResult(this.f12637a, intRef2), intRef2);
        this.f12638b = c10;
        this.f12641e = c10.getProperty(StubApp.getString2(16056));
        String property = this.f12638b.getProperty(StubApp.getString2(16057));
        this.f12642f = property.isEmpty() ? 0 : Integer.parseInt(property);
        String property2 = this.f12638b.getProperty(StubApp.getString2(16058));
        this.f12644h = property2.isEmpty() ? 0 : Integer.parseInt(property2);
        String property3 = this.f12638b.getProperty(StubApp.getString2(16059));
        this.f12643g = property3.isEmpty() ? BigInteger.ZERO : new BigInteger(property3);
        String property4 = this.f12638b.getProperty(StubApp.getString2(16060));
        this.j = property4.isEmpty() ? BigInteger.ZERO : new BigInteger(property4);
        String property5 = this.f12638b.getProperty(StubApp.getString2(16061));
        this.f12645k = property5.isEmpty() ? BigInteger.ZERO : new BigInteger(property5);
        String property6 = this.f12638b.getProperty(StubApp.getString2(16062));
        this.f12646l = property6.isEmpty() ? BigInteger.ZERO : new BigInteger(property6);
        String property7 = this.f12638b.getProperty(StubApp.getString2(16063));
        this.f12647m = property7.isEmpty() ? BigInteger.ZERO : new BigInteger(property7);
        this.f12648n = this.f12638b.getProperty(StubApp.getString2(16064));
        this.f12649p = this.f12638b.getProperty(StubApp.getString2(16065));
    }

    private final native long getPropertyBagFromResult(SafeHandle safeHandle, IntRef intRef);

    private final native long getResultId(SafeHandle safeHandle, StringRef stringRef);

    private final native long getResultReason(SafeHandle safeHandle, IntRef intRef);

    @Override // java.lang.AutoCloseable
    public void close() {
        PropertyCollection propertyCollection = this.f12638b;
        if (propertyCollection != null) {
            propertyCollection.close();
            this.f12638b = null;
        }
        SafeHandle safeHandle = this.f12637a;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12637a = null;
        }
    }

    public BigInteger getAudioLength() {
        return this.f12645k;
    }

    public BigInteger getAudioSpeechLength() {
        return this.f12646l;
    }

    public String getCreatedTime() {
        return this.f12648n;
    }

    public int getEnrollmentsCount() {
        return this.f12642f;
    }

    public BigInteger getEnrollmentsLength() {
        return this.f12643g;
    }

    public BigInteger getEnrollmentsSpeechLength() {
        return this.f12647m;
    }

    public SafeHandle getImpl() {
        Contracts.throwIfNull(this.f12637a, StubApp.getString2(1890));
        return this.f12637a;
    }

    public String getLastUpdatedDateTime() {
        return this.f12649p;
    }

    public String getProfileId() {
        return this.f12641e;
    }

    public PropertyCollection getProperties() {
        return this.f12638b;
    }

    public ResultReason getReason() {
        return this.f12640d;
    }

    public int getRemainingEnrollmentsCount() {
        return this.f12644h;
    }

    public BigInteger getRemainingEnrollmentsSpeechLength() {
        return this.j;
    }

    public String getResultId() {
        return this.f12639c;
    }

    public String toString() {
        return StubApp.getString2(15731) + getResultId() + StubApp.getString2(15710) + getReason() + StubApp.getString2(16053) + this.f12638b.getProperty(PropertyId.SpeechServiceResponse_JsonResult);
    }
}
