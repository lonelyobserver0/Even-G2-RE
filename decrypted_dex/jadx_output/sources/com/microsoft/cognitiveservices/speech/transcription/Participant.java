package com.microsoft.cognitiveservices.speech.transcription;

import com.mapbox.common.b;
import com.microsoft.cognitiveservices.speech.PropertyCollection;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Participant implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12704a;

    /* renamed from: b, reason: collision with root package name */
    public PropertyCollection f12705b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12706c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12707d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12708e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12709f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12710g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12711h;

    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public Participant(long j) {
        this.f12704a = null;
        this.f12704a = new SafeHandle(j, SafeHandleType.Participant);
        IntRef intRef = new IntRef(0L);
        this.f12705b = b.c(getPropertyBag(this.f12704a, intRef), intRef);
        StringRef stringRef = new StringRef("");
        Contracts.logErrorIfFail(getUserId(this.f12704a, stringRef));
        this.f12708e = stringRef.getValue();
        StringRef stringRef2 = new StringRef("");
        Contracts.logErrorIfFail(getDisplayName(this.f12704a, stringRef2));
        this.f12707d = stringRef2.getValue();
        StringRef stringRef3 = new StringRef("");
        Contracts.logErrorIfFail(getAvatar(this.f12704a, stringRef3));
        this.f12706c = stringRef3.getValue();
        this.f12709f = getIsHost(this.f12704a);
        this.f12710g = getIsMuted(this.f12704a);
        this.f12711h = getIsUsingTts(this.f12704a);
    }

    private static final native long createParticipantHandle(IntRef intRef, String str, String str2, String str3);

    public static Participant from(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(16082));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createParticipantHandle(intRef, str, null, null));
        return new Participant(intRef.getValue());
    }

    private final native long getAvatar(SafeHandle safeHandle, StringRef stringRef);

    private final native long getDisplayName(SafeHandle safeHandle, StringRef stringRef);

    private final native boolean getIsHost(SafeHandle safeHandle);

    private final native boolean getIsMuted(SafeHandle safeHandle);

    private final native boolean getIsUsingTts(SafeHandle safeHandle);

    private final native long getPropertyBag(SafeHandle safeHandle, IntRef intRef);

    private final native long getUserId(SafeHandle safeHandle, StringRef stringRef);

    private final native long setPreferredLanguage(SafeHandle safeHandle, String str);

    private final native long setVoiceSignature(SafeHandle safeHandle, String str);

    @Override // java.lang.AutoCloseable
    public void close() {
        SafeHandle safeHandle = this.f12704a;
        if (safeHandle != null) {
            safeHandle.close();
        }
        this.f12704a = null;
        PropertyCollection propertyCollection = this.f12705b;
        if (propertyCollection != null) {
            propertyCollection.close();
        }
        this.f12705b = null;
    }

    public String getAvatar() {
        return this.f12706c;
    }

    public String getDisplayName() {
        return this.f12707d;
    }

    public String getId() {
        return this.f12708e;
    }

    public SafeHandle getImpl() {
        return this.f12704a;
    }

    public PropertyCollection getProperties() {
        return this.f12705b;
    }

    public boolean isHost() {
        return this.f12709f;
    }

    public boolean isMuted() {
        return this.f12710g;
    }

    public boolean isUsingTts() {
        return this.f12711h;
    }

    public void setPreferredLanguage(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(16083));
        Contracts.throwIfFail(setPreferredLanguage(this.f12704a, str));
    }

    public void setVoiceSignature(String str) {
        Contracts.throwIfNull(str, StubApp.getString2(16084));
        Contracts.throwIfFail(setVoiceSignature(this.f12704a, str));
    }

    public static Participant from(String str, String str2) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(16082));
        Contracts.throwIfNullOrWhitespace(str2, StubApp.getString2(16083));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createParticipantHandle(intRef, str, str2, null));
        return new Participant(intRef.getValue());
    }

    public static Participant from(String str, String str2, String str3) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(16082));
        Contracts.throwIfNullOrWhitespace(str2, StubApp.getString2(16083));
        Contracts.throwIfNull(str3, StubApp.getString2(16084));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createParticipantHandle(intRef, str, str2, str3));
        return new Participant(intRef.getValue());
    }
}
