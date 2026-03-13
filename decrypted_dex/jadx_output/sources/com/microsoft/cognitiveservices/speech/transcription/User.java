package com.microsoft.cognitiveservices.speech.transcription;

import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.microsoft.cognitiveservices.speech.util.StringRef;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class User implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12714a;

    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static final native long createFromUserId(String str, IntRef intRef);

    public static User fromUserId(String str) {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createFromUserId(str, intRef));
        long value = intRef.getValue();
        User user = new User();
        user.f12714a = new SafeHandle(value, SafeHandleType.User);
        return user;
    }

    private final native long getId(SafeHandle safeHandle, StringRef stringRef);

    @Override // java.lang.AutoCloseable
    public void close() {
        SafeHandle safeHandle = this.f12714a;
        if (safeHandle != null) {
            safeHandle.close();
        }
        this.f12714a = null;
    }

    public String getId() {
        StringRef stringRef = new StringRef("");
        Contracts.throwIfFail(getId(this.f12714a, stringRef));
        return stringRef.getValue();
    }

    public SafeHandle getImpl() {
        return this.f12714a;
    }
}
