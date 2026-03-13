package com.microsoft.cognitiveservices.speech;

import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class SourceLanguageConfig implements AutoCloseable {
    private SafeHandle configHandle;
    private boolean disposed = false;

    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private SourceLanguageConfig(long j) {
        this.configHandle = null;
        Contracts.throwIfNull(j, StubApp.getString2(15661));
        this.configHandle = new SafeHandle(j, SafeHandleType.SourceLanguageConfig);
    }

    private static final native long fromLanguage(IntRef intRef, String str);

    public static SourceLanguageConfig fromLanguage(String str) {
        Contracts.throwIfIllegalLanguage(str, StubApp.getString2(15898));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromLanguage(intRef, str));
        return new SourceLanguageConfig(intRef.getValue());
    }

    private static final native long fromLanguageAndEndpointId(IntRef intRef, String str, String str2);

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.disposed) {
            return;
        }
        SafeHandle safeHandle = this.configHandle;
        if (safeHandle != null) {
            safeHandle.close();
            this.configHandle = null;
        }
        this.disposed = true;
    }

    public SafeHandle getImpl() {
        return this.configHandle;
    }

    public static SourceLanguageConfig fromLanguage(String str, String str2) {
        Contracts.throwIfIllegalLanguage(str, StubApp.getString2(15898));
        Contracts.throwIfNullOrWhitespace(str2, StubApp.getString2(15899));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromLanguageAndEndpointId(intRef, str, str2));
        return new SourceLanguageConfig(intRef.getValue());
    }
}
