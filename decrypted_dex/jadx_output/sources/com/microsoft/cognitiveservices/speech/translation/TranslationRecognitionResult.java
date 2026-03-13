package com.microsoft.cognitiveservices.speech.translation;

import com.microsoft.cognitiveservices.speech.RecognitionResult;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.StringMapRef;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class TranslationRecognitionResult extends RecognitionResult {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12720a;

    public TranslationRecognitionResult(long j) {
        super(j);
        Contracts.throwIfNull(super.getImpl(), StubApp.getString2(15730));
        StringMapRef stringMapRef = new StringMapRef();
        Contracts.throwIfFail(getTranslations(super.getImpl(), stringMapRef));
        HashMap hashMap = new HashMap();
        this.f12720a = hashMap;
        if (stringMapRef.getValue().isEmpty()) {
            return;
        }
        hashMap.putAll(stringMapRef.getValue());
    }

    private final native long getTranslations(SafeHandle safeHandle, StringMapRef stringMapRef);

    public final Map<String, String> getTranslations() {
        return this.f12720a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(15731));
        sb2.append(getResultId());
        sb2.append(StubApp.getString2(15710));
        sb2.append(getReason());
        sb2.append(StubApp.getString2(16093));
        sb2.append(getText());
        String string2 = StubApp.getString2(16092);
        sb2.append(string2);
        String sb3 = sb2.toString();
        HashMap hashMap = this.f12720a;
        for (String str : hashMap.keySet()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            sb4.append(StubApp.getString2(16090));
            sb4.append(str);
            sb4.append(StubApp.getString2(16091));
            sb3 = AbstractC1482f.k(sb4, (String) hashMap.get(str), string2);
        }
        return sb3;
    }
}
