package com.microsoft.cognitiveservices.speech.intent;

import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class IntentTrigger implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12592a;

    public IntentTrigger(IntRef intRef) {
        this.f12592a = null;
        this.f12592a = new SafeHandle(intRef.getValue(), SafeHandleType.IntentTrigger);
    }

    private static final native long createFromLanguageUnderstandingModel(IntRef intRef, SafeHandle safeHandle, String str);

    private static final native long createFromPhrase(IntRef intRef, String str);

    public static IntentTrigger fromModel(SafeHandle safeHandle) {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createFromLanguageUnderstandingModel(intRef, safeHandle, null));
        return new IntentTrigger(intRef);
    }

    public static IntentTrigger fromPhrase(String str) {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createFromPhrase(intRef, str));
        return new IntentTrigger(intRef);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        SafeHandle safeHandle = this.f12592a;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12592a = null;
        }
    }

    public SafeHandle getImpl() {
        return this.f12592a;
    }

    public static IntentTrigger fromModel(SafeHandle safeHandle, String str) {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createFromLanguageUnderstandingModel(intRef, safeHandle, str));
        return new IntentTrigger(intRef);
    }
}
