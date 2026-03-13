package com.microsoft.cognitiveservices.speech.transcription;

import K9.b;
import L9.i;
import L9.j;
import L9.k;
import com.microsoft.cognitiveservices.speech.PropertyCollection;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.SessionEventArgs;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import com.microsoft.cognitiveservices.speech.util.AsyncThreadService;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.EventHandlerImpl;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import l4.CallableC1207q0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ConversationTranslator implements AutoCloseable {

    /* renamed from: f, reason: collision with root package name */
    public static final Set f12684f = Collections.synchronizedSet(new HashSet());

    /* renamed from: a, reason: collision with root package name */
    public SafeHandle f12685a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12686b;

    /* renamed from: c, reason: collision with root package name */
    public PropertyCollection f12687c;
    public final EventHandlerImpl<ConversationTranslationCanceledEventArgs> canceled;
    public final EventHandlerImpl<ConversationExpirationEventArgs> conversationExpiration;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12688d;

    /* renamed from: e, reason: collision with root package name */
    public int f12689e;
    public final EventHandlerImpl<ConversationParticipantsChangedEventArgs> participantsChanged;
    public final EventHandlerImpl<SessionEventArgs> sessionStarted;
    public final EventHandlerImpl<SessionEventArgs> sessionStopped;
    public final EventHandlerImpl<ConversationTranslationEventArgs> textMessageReceived;
    public final EventHandlerImpl<ConversationTranslationEventArgs> transcribed;
    public final EventHandlerImpl<ConversationTranslationEventArgs> transcribing;

    public ConversationTranslator() {
        this(null);
    }

    public static void A(ConversationTranslator conversationTranslator, Runnable runnable) {
        synchronized (conversationTranslator.f12686b) {
            conversationTranslator.f12689e++;
        }
        if (conversationTranslator.f12688d) {
            throw new IllegalStateException(conversationTranslator.getClass().getName());
        }
        try {
            runnable.run();
            synchronized (conversationTranslator.f12686b) {
                conversationTranslator.f12689e--;
            }
        } catch (Throwable th) {
            synchronized (conversationTranslator.f12686b) {
                conversationTranslator.f12689e--;
                throw th;
            }
        }
    }

    private void canceledEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("16076"));
            if (this.f12688d) {
                return;
            }
            ConversationTranslationCanceledEventArgs conversationTranslationCanceledEventArgs = new ConversationTranslationCanceledEventArgs(j);
            EventHandlerImpl<ConversationTranslationCanceledEventArgs> eventHandlerImpl = this.canceled;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, conversationTranslationCanceledEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long canceledSetCallback(long j);

    private void conversationExpireEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("16076"));
            if (this.f12688d) {
                return;
            }
            ConversationExpirationEventArgs conversationExpirationEventArgs = new ConversationExpirationEventArgs(j);
            EventHandlerImpl<ConversationExpirationEventArgs> eventHandlerImpl = this.conversationExpiration;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, conversationExpirationEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long conversationExpireSetCallback(long j);

    private final native long createConversationTranslatorFromConfig(SafeHandle safeHandle, SafeHandle safeHandle2);

    private final native long getPropertyBagFromHandle(SafeHandle safeHandle, IntRef intRef);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long joinConversation(SafeHandle safeHandle, SafeHandle safeHandle2, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long joinConversationId(SafeHandle safeHandle, String str, String str2, String str3);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long leaveConversation(SafeHandle safeHandle);

    private void participantsChangedEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("16076"));
            if (this.f12688d) {
                return;
            }
            ConversationParticipantsChangedEventArgs conversationParticipantsChangedEventArgs = new ConversationParticipantsChangedEventArgs(j);
            EventHandlerImpl<ConversationParticipantsChangedEventArgs> eventHandlerImpl = this.participantsChanged;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, conversationParticipantsChangedEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long participantsChangedSetCallback(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long sendText(SafeHandle safeHandle, String str);

    private void sessionStartedEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("16076"));
            if (this.f12688d) {
                return;
            }
            SessionEventArgs sessionEventArgs = new SessionEventArgs(j, true);
            EventHandlerImpl<SessionEventArgs> eventHandlerImpl = this.sessionStarted;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, sessionEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long sessionStartedSetCallback(long j);

    private void sessionStoppedEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("16076"));
            if (this.f12688d) {
                return;
            }
            SessionEventArgs sessionEventArgs = new SessionEventArgs(j, true);
            EventHandlerImpl<SessionEventArgs> eventHandlerImpl = this.sessionStopped;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, sessionEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long sessionStoppedSetCallback(long j);

    private final native long setAuthToken(SafeHandle safeHandle, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long startTranscribing(SafeHandle safeHandle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long stopTranscribing(SafeHandle safeHandle);

    private void textMessageEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("16076"));
            if (this.f12688d) {
                return;
            }
            ConversationTranslationEventArgs conversationTranslationEventArgs = new ConversationTranslationEventArgs(j, 0);
            EventHandlerImpl<ConversationTranslationEventArgs> eventHandlerImpl = this.textMessageReceived;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, conversationTranslationEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long textMessageSetCallback(long j);

    private void transcribedEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("16076"));
            if (this.f12688d) {
                return;
            }
            ConversationTranslationEventArgs conversationTranslationEventArgs = new ConversationTranslationEventArgs(j, 0);
            EventHandlerImpl<ConversationTranslationEventArgs> eventHandlerImpl = this.transcribed;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, conversationTranslationEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long transcribedSetCallback(long j);

    private void transcribingEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("16076"));
            if (this.f12688d) {
                return;
            }
            ConversationTranslationEventArgs conversationTranslationEventArgs = new ConversationTranslationEventArgs(j, 0);
            EventHandlerImpl<ConversationTranslationEventArgs> eventHandlerImpl = this.transcribing;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, conversationTranslationEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long transcribingSetCallback(long j);

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f12686b) {
            try {
                if (this.f12689e != 0) {
                    throw new IllegalStateException(StubApp.getString2("16077"));
                }
                if (!this.f12688d) {
                    PropertyCollection propertyCollection = this.f12687c;
                    if (propertyCollection != null) {
                        propertyCollection.close();
                        this.f12687c = null;
                    }
                    SafeHandle safeHandle = this.f12685a;
                    if (safeHandle != null) {
                        safeHandle.close();
                        this.f12685a = null;
                    }
                    f12684f.remove(this);
                    AsyncThreadService.shutdown();
                    this.f12688d = true;
                }
            } finally {
            }
        }
    }

    public String getAuthorizationToken() {
        return this.f12687c.getProperty(PropertyId.SpeechServiceAuthorization_Token);
    }

    public SafeHandle getImpl() {
        return this.f12685a;
    }

    public PropertyCollection getProperties() {
        return this.f12687c;
    }

    public String getSpeechRecognitionLanguage() {
        return this.f12687c.getProperty(PropertyId.SpeechServiceConnection_RecoLanguage);
    }

    public Future<Void> joinConversationAsync(Conversation conversation, String str) {
        return AsyncThreadService.submit(new CallableC1207q0(this, this, conversation, str));
    }

    public Future<Void> leaveConversationAsync() {
        return AsyncThreadService.submit(new k(this, this, 0));
    }

    public Future<Void> sendTextMessageAsync(String str) {
        return AsyncThreadService.submit(new b(this, this, str, 1));
    }

    public void setAuthorizationToken(String str, String str2) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(16078));
        Contracts.throwIfNullOrWhitespace(str2, StubApp.getString2(2051));
        Contracts.throwIfFail(setAuthToken(this.f12685a, str, str2));
    }

    public Future<Void> startTranscribingAsync() {
        return AsyncThreadService.submit(new k(this, this, 1));
    }

    public Future<Void> stopTranscribingAsync() {
        return AsyncThreadService.submit(new k(this, this, 2));
    }

    public ConversationTranslator(AudioConfig audioConfig) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        EventHandlerImpl<ConversationTranslationCanceledEventArgs> eventHandlerImpl = new EventHandlerImpl<>(atomicInteger);
        this.canceled = eventHandlerImpl;
        EventHandlerImpl<ConversationExpirationEventArgs> eventHandlerImpl2 = new EventHandlerImpl<>(atomicInteger);
        this.conversationExpiration = eventHandlerImpl2;
        EventHandlerImpl<ConversationParticipantsChangedEventArgs> eventHandlerImpl3 = new EventHandlerImpl<>(atomicInteger);
        this.participantsChanged = eventHandlerImpl3;
        EventHandlerImpl<SessionEventArgs> eventHandlerImpl4 = new EventHandlerImpl<>(atomicInteger);
        this.sessionStarted = eventHandlerImpl4;
        EventHandlerImpl<SessionEventArgs> eventHandlerImpl5 = new EventHandlerImpl<>(atomicInteger);
        this.sessionStopped = eventHandlerImpl5;
        EventHandlerImpl<ConversationTranslationEventArgs> eventHandlerImpl6 = new EventHandlerImpl<>(atomicInteger);
        this.textMessageReceived = eventHandlerImpl6;
        EventHandlerImpl<ConversationTranslationEventArgs> eventHandlerImpl7 = new EventHandlerImpl<>(atomicInteger);
        this.transcribed = eventHandlerImpl7;
        EventHandlerImpl<ConversationTranslationEventArgs> eventHandlerImpl8 = new EventHandlerImpl<>(atomicInteger);
        this.transcribing = eventHandlerImpl8;
        this.f12685a = null;
        this.f12686b = new Object();
        this.f12687c = null;
        this.f12688d = false;
        this.f12689e = 0;
        SafeHandle safeHandle = new SafeHandle(0L, SafeHandleType.ConversationTranslator);
        this.f12685a = safeHandle;
        Contracts.throwIfFail(audioConfig == null ? createConversationTranslatorFromConfig(safeHandle, null) : createConversationTranslatorFromConfig(safeHandle, audioConfig.getImpl()));
        AsyncThreadService.initialize();
        eventHandlerImpl4.updateNotificationOnConnected(new i(this, this, 5));
        eventHandlerImpl5.updateNotificationOnConnected(new i(this, this, 6));
        eventHandlerImpl.updateNotificationOnConnected(new i(this, this, 7));
        eventHandlerImpl2.updateNotificationOnConnected(new i(this, this, 0));
        eventHandlerImpl3.updateNotificationOnConnected(new i(this, this, 1));
        eventHandlerImpl8.updateNotificationOnConnected(new i(this, this, 2));
        eventHandlerImpl7.updateNotificationOnConnected(new i(this, this, 3));
        eventHandlerImpl6.updateNotificationOnConnected(new i(this, this, 4));
        IntRef intRef = new IntRef(0L);
        this.f12687c = com.mapbox.common.b.c(getPropertyBagFromHandle(this.f12685a, intRef), intRef);
    }

    public Future<Void> joinConversationAsync(String str, String str2, String str3) {
        return AsyncThreadService.submit(new j(this, this, str, str2, str3));
    }
}
