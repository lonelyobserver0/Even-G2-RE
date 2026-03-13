package com.microsoft.cognitiveservices.speech.translation;

import com.microsoft.cognitiveservices.speech.RecognitionEventArgs;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class TranslationRecognitionEventArgs extends RecognitionEventArgs {

    /* renamed from: a, reason: collision with root package name */
    public TranslationRecognitionResult f12719a;

    public TranslationRecognitionEventArgs(long j, int i3) {
        super(j);
        a(true);
    }

    public final void a(boolean z2) {
        Contracts.throwIfNull(this.eventHandle, StubApp.getString2(15697));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getRecognitionResult(this.eventHandle, intRef));
        this.f12719a = new TranslationRecognitionResult(intRef.getValue());
        Contracts.throwIfNull(getSessionId(), StubApp.getString2(15707));
        if (z2) {
            super.close();
        }
    }

    public final TranslationRecognitionResult getResult() {
        return this.f12719a;
    }

    @Override // com.microsoft.cognitiveservices.speech.RecognitionEventArgs, com.microsoft.cognitiveservices.speech.SessionEventArgs
    public String toString() {
        String str = StubApp.getString2(16089) + super.toString();
        for (String str2 : this.f12719a.getTranslations().keySet()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(StubApp.getString2(16090));
            sb2.append(str2);
            sb2.append(StubApp.getString2(16091));
            str = AbstractC1482f.k(sb2, this.f12719a.getTranslations().get(str2), StubApp.getString2(16092));
        }
        return str;
    }
}
