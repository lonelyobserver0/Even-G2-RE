package com.microsoft.cognitiveservices.speech.translation;

import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.stub.StubApp;
import java.net.URI;
import java.util.ArrayList;
import x2.InterfaceC1906a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class SpeechTranslationConfig extends SpeechConfig implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12715a;

    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public SpeechTranslationConfig(long j) {
        super(j);
        this.f12715a = false;
    }

    private final native long addTargetLanguage(SafeHandle safeHandle, String str);

    private static final native long fromAuthorizationToken(IntRef intRef, String str, String str2);

    public static SpeechTranslationConfig fromAuthorizationToken(String str, String str2) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(15908));
        Contracts.throwIfNullOrWhitespace(str2, StubApp.getString2(2051));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromAuthorizationToken(intRef, str, str2));
        return new SpeechTranslationConfig(intRef.getValue());
    }

    private static final native long fromEndpoint(IntRef intRef, String str, String str2);

    public static SpeechTranslationConfig fromEndpoint(URI uri) {
        Contracts.throwIfNull(uri, StubApp.getString2(15909));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromEndpoint(intRef, uri.toString(), null));
        return new SpeechTranslationConfig(intRef.getValue());
    }

    private static final native long fromHost(IntRef intRef, String str, String str2);

    public static SpeechTranslationConfig fromHost(URI uri) {
        Contracts.throwIfNull(uri, StubApp.getString2(5873));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromHost(intRef, uri.toString(), null));
        return new SpeechTranslationConfig(intRef.getValue());
    }

    private static final native long fromSubscription(IntRef intRef, String str, String str2);

    public static SpeechTranslationConfig fromSubscription(String str, String str2) {
        Contracts.throwIfIllegalSubscriptionKey(str, StubApp.getString2(15910));
        Contracts.throwIfNullOrWhitespace(str2, StubApp.getString2(2051));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromSubscription(intRef, str, str2));
        return new SpeechTranslationConfig(intRef.getValue());
    }

    private final native long removeTargetLanguage(SafeHandle safeHandle, String str);

    private final native long setCustomModelCategoryId(SafeHandle safeHandle, String str);

    public void addTargetLanguage(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(1061));
        Contracts.throwIfFail(addTargetLanguage(super.getImpl(), str));
    }

    @Override // com.microsoft.cognitiveservices.speech.SpeechConfig, java.lang.AutoCloseable
    public void close() {
        if (this.f12715a) {
            return;
        }
        super.close();
        this.f12715a = true;
    }

    @Override // com.microsoft.cognitiveservices.speech.SpeechConfig
    public SafeHandle getImpl() {
        return super.getImpl();
    }

    public ArrayList<String> getTargetLanguages() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : getProperty(PropertyId.SpeechServiceConnection_TranslationToLanguages).split(StubApp.getString2(321))) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.microsoft.cognitiveservices.speech.SpeechConfig
    public InterfaceC1906a getTokenCredential() {
        return null;
    }

    public String getVoiceName() {
        return getProperty(PropertyId.SpeechServiceConnection_TranslationVoice);
    }

    public void removeTargetLanguage(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(1061));
        Contracts.throwIfFail(removeTargetLanguage(super.getImpl(), str));
    }

    public void setCustomModelCategoryId(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(16088));
        Contracts.throwIfFail(setCustomModelCategoryId(super.getImpl(), str));
    }

    public void setVoiceName(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(1061));
        setProperty(PropertyId.SpeechServiceConnection_TranslationVoice, str);
    }

    public static SpeechTranslationConfig fromEndpoint(URI uri, String str) {
        Contracts.throwIfNull(uri, StubApp.getString2(15909));
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(15910));
        }
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromEndpoint(intRef, uri.toString(), str));
        return new SpeechTranslationConfig(intRef.getValue());
    }

    public static SpeechTranslationConfig fromHost(URI uri, String str) {
        Contracts.throwIfNull(uri, StubApp.getString2(5873));
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(15910));
        }
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromHost(intRef, uri.toString(), str));
        return new SpeechTranslationConfig(intRef.getValue());
    }

    public static SpeechTranslationConfig fromEndpoint(URI uri, InterfaceC1906a interfaceC1906a) {
        Contracts.throwIfNull(uri, StubApp.getString2(15909));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromEndpoint(intRef, uri.toString(), null));
        return new SpeechTranslationConfig(intRef.getValue());
    }
}
