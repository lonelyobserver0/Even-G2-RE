package com.microsoft.cognitiveservices.speech.translation;

import com.microsoft.cognitiveservices.speech.SessionEventArgs;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class TranslationSynthesisEventArgs extends SessionEventArgs {

    /* renamed from: a, reason: collision with root package name */
    public final TranslationSynthesisResult f12724a;

    public TranslationSynthesisEventArgs(long j) {
        super(j);
        Contracts.throwIfNull(this.eventHandle, StubApp.getString2(15697));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getSynthesisResult(this.eventHandle, intRef));
        this.f12724a = new TranslationSynthesisResult(intRef.getValue());
        Contracts.throwIfNull(getSessionId(), StubApp.getString2(15707));
        super.close();
    }

    private final native long getSynthesisResult(SafeHandle safeHandle, IntRef intRef);

    public final TranslationSynthesisResult getResult() {
        return this.f12724a;
    }

    @Override // com.microsoft.cognitiveservices.speech.SessionEventArgs
    public String toString() {
        return StubApp.getString2(15708) + getSessionId() + StubApp.getString2(16096) + this.f12724a.toString() + StubApp.getString2(1);
    }
}
