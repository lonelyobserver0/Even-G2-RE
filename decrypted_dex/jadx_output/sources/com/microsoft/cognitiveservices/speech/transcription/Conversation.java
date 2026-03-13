package com.microsoft.cognitiveservices.speech.transcription;

import L9.a;
import L9.c;
import L9.d;
import L9.e;
import L9.f;
import com.mapbox.common.b;
import com.microsoft.cognitiveservices.speech.PropertyCollection;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.AsyncThreadService;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;
import java.util.concurrent.Future;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Conversation implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12661a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12662b = false;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12663c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public int f12664d = 0;

    /* renamed from: e, reason: collision with root package name */
    public PropertyCollection f12665e;

    public Conversation(long j) {
        this.f12661a = new SafeHandle(j, SafeHandleType.Conversation);
        IntRef intRef = new IntRef(0L);
        this.f12665e = b.c(getPropertyBag(this.f12661a, intRef), intRef);
    }

    public static void F(Conversation conversation, Runnable runnable) {
        synchronized (conversation.f12663c) {
            conversation.f12664d++;
        }
        if (conversation.f12662b) {
            throw new IllegalStateException(Conversation.class.getName());
        }
        try {
            runnable.run();
            synchronized (conversation.f12663c) {
                conversation.f12664d--;
            }
        } catch (Throwable th) {
            synchronized (conversation.f12663c) {
                conversation.f12664d--;
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long addParticipant(SafeHandle safeHandle, SafeHandle safeHandle2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long addParticipantByUser(SafeHandle safeHandle, SafeHandle safeHandle2);

    public static Future<Conversation> createConversationAsync(SpeechConfig speechConfig) {
        Contracts.throwIfNull(speechConfig, StubApp.getString2(15923));
        AsyncThreadService.initialize();
        return AsyncThreadService.submit(new c(speechConfig, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long createConversationFromConfig(IntRef intRef, SafeHandle safeHandle, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long deleteConversation(SafeHandle safeHandle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long endConversation(SafeHandle safeHandle);

    private final native long getConversationId(SafeHandle safeHandle, StringRef stringRef);

    private final native long getPropertyBag(SafeHandle safeHandle, IntRef intRef);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long lockConversation(SafeHandle safeHandle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long muteAll(SafeHandle safeHandle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long muteParticipant(SafeHandle safeHandle, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long removeParticipant(SafeHandle safeHandle, SafeHandle safeHandle2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long removeParticipantByUser(SafeHandle safeHandle, SafeHandle safeHandle2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long removeParticipantByUserId(SafeHandle safeHandle, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long startConversation(SafeHandle safeHandle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long unlockConversation(SafeHandle safeHandle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long unmuteAll(SafeHandle safeHandle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long unmuteParticipant(SafeHandle safeHandle, String str);

    public Future<Participant> addParticipantAsync(Participant participant) {
        return AsyncThreadService.submit(new e(this, participant, this, 0));
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f12663c) {
            try {
                if (this.f12664d != 0) {
                    throw new IllegalStateException(StubApp.getString2("15871"));
                }
                dispose(true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Future<Void> deleteConversationAsync() {
        return AsyncThreadService.submit(new a(this, this, 1));
    }

    public void dispose(boolean z2) {
        if (!this.f12662b && z2) {
            SafeHandle safeHandle = this.f12661a;
            if (safeHandle != null) {
                safeHandle.close();
                this.f12661a = null;
            }
            PropertyCollection propertyCollection = this.f12665e;
            if (propertyCollection != null) {
                propertyCollection.close();
                this.f12665e = null;
            }
            AsyncThreadService.shutdown();
            this.f12662b = true;
        }
    }

    public Future<Void> endConversationAsync() {
        return AsyncThreadService.submit(new a(this, this, 6));
    }

    public String getAuthorizationToken() {
        return this.f12665e.getProperty(PropertyId.SpeechServiceAuthorization_Token);
    }

    public String getConversationId() {
        StringRef stringRef = new StringRef("");
        Contracts.throwIfFail(getConversationId(this.f12661a, stringRef));
        return stringRef.getValue();
    }

    public SafeHandle getImpl() {
        return this.f12661a;
    }

    public PropertyCollection getProperties() {
        return this.f12665e;
    }

    public Future<Void> lockConversationAsync() {
        return AsyncThreadService.submit(new a(this, this, 2));
    }

    public Future<Void> muteAllParticipantsAsync() {
        return AsyncThreadService.submit(new a(this, this, 4));
    }

    public Future<Void> muteParticipantAsync(String str) {
        return AsyncThreadService.submit(new L9.b(this, str, this, 0));
    }

    public Future<Void> removeParticipantAsync(Participant participant) {
        return AsyncThreadService.submit(new e(this, participant, this, 1));
    }

    public void setAuthorizationToken(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(1071));
        this.f12665e.setProperty(PropertyId.SpeechServiceAuthorization_Token, str);
    }

    public Future<Void> startConversationAsync() {
        return AsyncThreadService.submit(new a(this, this, 0));
    }

    public Future<Void> unlockConversationAsync() {
        return AsyncThreadService.submit(new a(this, this, 3));
    }

    public Future<Void> unmuteAllParticipantsAsync() {
        return AsyncThreadService.submit(new a(this, this, 5));
    }

    public Future<Void> unmuteParticipantAsync(String str) {
        return AsyncThreadService.submit(new L9.b(this, str, this, 1));
    }

    public static Future<Conversation> createConversationAsync(SpeechConfig speechConfig, String str) {
        Contracts.throwIfNull(speechConfig, StubApp.getString2(15923));
        Contracts.throwIfNull(str, StubApp.getString2(16070));
        AsyncThreadService.initialize();
        return AsyncThreadService.submit(new d(speechConfig, str, 0));
    }

    public Future<User> addParticipantAsync(User user) {
        return AsyncThreadService.submit(new f(this, user, this, 0));
    }

    public Future<Void> removeParticipantAsync(User user) {
        return AsyncThreadService.submit(new f(this, user, this, 1));
    }

    public Future<Participant> addParticipantAsync(String str) {
        return AsyncThreadService.submit(new L9.b(this, str, this, 2));
    }

    public Future<Void> removeParticipantAsync(String str) {
        return AsyncThreadService.submit(new L9.b(this, str, this, 3));
    }
}
