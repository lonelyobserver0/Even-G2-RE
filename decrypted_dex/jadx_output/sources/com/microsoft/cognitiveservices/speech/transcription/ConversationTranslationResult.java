package com.microsoft.cognitiveservices.speech.transcription;

import com.microsoft.cognitiveservices.speech.translation.TranslationRecognitionResult;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ConversationTranslationResult extends TranslationRecognitionResult {

    /* renamed from: b, reason: collision with root package name */
    public final String f12682b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12683c;

    public ConversationTranslationResult(long j) {
        super(j);
        Contracts.throwIfNull(super.getImpl(), StubApp.getString2(15730));
        StringRef stringRef = new StringRef("");
        Contracts.throwIfFail(getOriginalLang(super.getImpl(), stringRef));
        this.f12682b = stringRef.getValue();
        Contracts.throwIfFail(getParticipantId(super.getImpl(), stringRef));
        this.f12683c = stringRef.getValue();
    }

    private final native long getOriginalLang(SafeHandle safeHandle, StringRef stringRef);

    private final native long getParticipantId(SafeHandle safeHandle, StringRef stringRef);

    public String getOriginalLang() {
        return this.f12682b;
    }

    public String getParticipantId() {
        return this.f12683c;
    }
}
