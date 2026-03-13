package com.microsoft.cognitiveservices.speech.intent;

import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.ResultReason;
import com.microsoft.cognitiveservices.speech.SpeechRecognitionResult;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.JsonValue;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;
import java.util.Dictionary;
import java.util.Hashtable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class IntentRecognitionResult extends SpeechRecognitionResult {

    /* renamed from: a, reason: collision with root package name */
    public final Hashtable f12588a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12589b;

    public IntentRecognitionResult(long j) {
        super(j);
        Contracts.throwIfNull(super.getImpl(), StubApp.getString2(15730));
        StringRef stringRef = new StringRef("");
        Contracts.throwIfFail(getIntentId(super.getImpl(), stringRef));
        String value = stringRef.getValue();
        this.f12589b = value;
        Contracts.throwIfNull(value, StubApp.getString2(16039));
        if (getReason() == ResultReason.RecognizedIntent) {
            String property = getProperties().getProperty(StubApp.getString2(16040));
            this.f12588a = new Hashtable();
            if (property != null) {
                JsonValue Parse = JsonValue.Parse(property);
                int count = Parse.count();
                for (int i3 = 0; i3 < count; i3++) {
                    this.f12588a.put(Parse.getName(i3), Parse.get(i3).asString());
                }
            }
        }
    }

    private final native long getIntentId(SafeHandle safeHandle, StringRef stringRef);

    @Override // com.microsoft.cognitiveservices.speech.SpeechRecognitionResult, com.microsoft.cognitiveservices.speech.RecognitionResult, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    public Dictionary<String, String> getEntities() {
        return this.f12588a;
    }

    public String getIntentId() {
        return this.f12589b;
    }

    @Override // com.microsoft.cognitiveservices.speech.SpeechRecognitionResult
    public String toString() {
        return StubApp.getString2(15731) + getResultId() + StubApp.getString2(15710) + getReason() + StubApp.getString2(16036) + this.f12589b + StubApp.getString2(15711) + getText() + StubApp.getString2(16037) + getProperties().getProperty(PropertyId.SpeechServiceResponse_JsonResult) + StubApp.getString2(16038) + getProperties().getProperty(PropertyId.LanguageUnderstandingServiceResponse_JsonResult) + StubApp.getString2(6919);
    }
}
