package com.microsoft.cognitiveservices.speech.translation;

import com.microsoft.cognitiveservices.speech.ResultReason;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class TranslationSynthesisResult {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f12725a;

    /* renamed from: b, reason: collision with root package name */
    public SafeHandle f12726b;

    /* renamed from: c, reason: collision with root package name */
    public final ResultReason f12727c;

    public TranslationSynthesisResult(long j) {
        Contracts.throwIfNull(j, StubApp.getString2(1890));
        this.f12726b = new SafeHandle(j, SafeHandleType.RecognitionResult);
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getResultReason(this.f12726b, intRef));
        this.f12727c = ResultReason.values()[(int) intRef.getValue()];
        IntRef intRef2 = new IntRef(0L);
        this.f12725a = getAudio(this.f12726b, intRef2);
        Contracts.throwIfFail(intRef2.getValue());
    }

    private final native byte[] getAudio(SafeHandle safeHandle, IntRef intRef);

    private final native long getResultReason(SafeHandle safeHandle, IntRef intRef);

    public void close() {
        SafeHandle safeHandle = this.f12726b;
        if (safeHandle != null) {
            safeHandle.close();
        }
        this.f12726b = null;
    }

    public byte[] getAudio() {
        return this.f12725a;
    }

    public ResultReason getReason() {
        return this.f12727c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(16097));
        sb2.append(this.f12727c);
        sb2.append(StubApp.getString2(16098));
        return AbstractC1482f.f(this.f12725a.length, StubApp.getString2(1), sb2);
    }
}
