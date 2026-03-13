package com.microsoft.cognitiveservices.speech;

import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class AutoDetectSourceLanguageConfig implements AutoCloseable {
    private SafeHandle configHandle;
    private boolean disposed = false;

    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private AutoDetectSourceLanguageConfig(long j) {
        this.configHandle = null;
        Contracts.throwIfNull(j, StubApp.getString2(15661));
        this.configHandle = new SafeHandle(j, SafeHandleType.AutoDetectSourceLanguageConfig);
    }

    private static final native long addSourceLangConfigToAutoDetectSourceLangConfig(IntRef intRef, SafeHandle safeHandle);

    private static final native long createFromSourceLangConfig(IntRef intRef, SafeHandle safeHandle);

    private static final native long fromLanguages(IntRef intRef, String str);

    public static AutoDetectSourceLanguageConfig fromLanguages(List<String> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException(StubApp.getString2(15662));
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < list.size(); i3++) {
            sb2.append(list.get(i3));
            if (i3 != list.size() - 1) {
                sb2.append(StubApp.getString2(321));
            }
        }
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromLanguages(intRef, sb2.toString()));
        return new AutoDetectSourceLanguageConfig(intRef.getValue());
    }

    private static final native long fromOpenRange(IntRef intRef);

    public static AutoDetectSourceLanguageConfig fromOpenRange() {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromOpenRange(intRef));
        return new AutoDetectSourceLanguageConfig(intRef.getValue());
    }

    public static AutoDetectSourceLanguageConfig fromSourceLanguageConfigs(List<SourceLanguageConfig> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException(StubApp.getString2(15664));
        }
        IntRef intRef = new IntRef(0L);
        boolean z2 = true;
        for (SourceLanguageConfig sourceLanguageConfig : list) {
            Contracts.throwIfNull(sourceLanguageConfig, StubApp.getString2(15663));
            if (z2) {
                Contracts.throwIfFail(createFromSourceLangConfig(intRef, sourceLanguageConfig.getImpl()));
                z2 = false;
            } else {
                Contracts.throwIfFail(addSourceLangConfigToAutoDetectSourceLangConfig(intRef, sourceLanguageConfig.getImpl()));
            }
        }
        return new AutoDetectSourceLanguageConfig(intRef.getValue());
    }

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
}
