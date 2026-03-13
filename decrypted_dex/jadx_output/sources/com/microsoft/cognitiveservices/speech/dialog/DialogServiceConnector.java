package com.microsoft.cognitiveservices.speech.dialog;

import J9.a;
import J9.b;
import J9.c;
import com.microsoft.cognitiveservices.speech.KeywordRecognitionModel;
import com.microsoft.cognitiveservices.speech.PropertyCollection;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.RecognitionEventArgs;
import com.microsoft.cognitiveservices.speech.SessionEventArgs;
import com.microsoft.cognitiveservices.speech.SpeechRecognitionCanceledEventArgs;
import com.microsoft.cognitiveservices.speech.SpeechRecognitionEventArgs;
import com.microsoft.cognitiveservices.speech.SpeechRecognitionResult;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import com.microsoft.cognitiveservices.speech.util.AsyncThreadService;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.EventHandlerImpl;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class DialogServiceConnector implements AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public static final Set f12576d;

    /* renamed from: a, reason: collision with root package name */
    public PropertyCollection f12577a;
    public EventHandlerImpl<ActivityReceivedEventArgs> activityReceived;

    /* renamed from: b, reason: collision with root package name */
    public SafeHandle f12578b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12579c;
    public EventHandlerImpl<SpeechRecognitionCanceledEventArgs> canceled;
    public EventHandlerImpl<SpeechRecognitionEventArgs> recognized;
    public EventHandlerImpl<SpeechRecognitionEventArgs> recognizing;
    public EventHandlerImpl<SessionEventArgs> sessionStarted;
    public EventHandlerImpl<SessionEventArgs> sessionStopped;
    public EventHandlerImpl<RecognitionEventArgs> speechEndDetected;
    public EventHandlerImpl<RecognitionEventArgs> speechStartDetected;
    public EventHandlerImpl<TurnStatusReceivedEventArgs> turnStatusReceived;

    static {
        try {
            Class.forName(DialogServiceConfig.class.getName());
            f12576d = Collections.synchronizedSet(new HashSet());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public DialogServiceConnector(DialogServiceConfig dialogServiceConfig) {
        this(dialogServiceConfig, AudioConfig.fromDefaultMicrophoneInput());
    }

    private void activityReceivedEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("16032"));
            if (this.f12579c) {
                return;
            }
            ActivityReceivedEventArgs activityReceivedEventArgs = new ActivityReceivedEventArgs(j);
            EventHandlerImpl<ActivityReceivedEventArgs> eventHandlerImpl = this.activityReceived;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, activityReceivedEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long activityReceivedSetCallback(long j);

    private void canceledEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("16032"));
            if (this.f12579c) {
                return;
            }
            SpeechRecognitionCanceledEventArgs speechRecognitionCanceledEventArgs = new SpeechRecognitionCanceledEventArgs(j, true);
            EventHandlerImpl<SpeechRecognitionCanceledEventArgs> eventHandlerImpl = this.canceled;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, speechRecognitionCanceledEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long canceledSetCallback(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long connect(SafeHandle safeHandle);

    private static final native long createDialogServiceConnectorFomConfig(SafeHandle safeHandle, SafeHandle safeHandle2, SafeHandle safeHandle3);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long disconnect(SafeHandle safeHandle);

    private final native long getPropertyBagFromDialogServiceConnectorHandle(SafeHandle safeHandle, IntRef intRef);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long listenOnce(SafeHandle safeHandle, IntRef intRef);

    private void recognizedEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("16032"));
            if (this.f12579c) {
                return;
            }
            SpeechRecognitionEventArgs speechRecognitionEventArgs = new SpeechRecognitionEventArgs(j, true);
            EventHandlerImpl<SpeechRecognitionEventArgs> eventHandlerImpl = this.recognized;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, speechRecognitionEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long recognizedSetCallback(long j);

    private void recognizingEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("16032"));
            if (this.f12579c) {
                return;
            }
            SpeechRecognitionEventArgs speechRecognitionEventArgs = new SpeechRecognitionEventArgs(j, true);
            EventHandlerImpl<SpeechRecognitionEventArgs> eventHandlerImpl = this.recognizing;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, speechRecognitionEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long recognizingSetCallback(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long sendActivity(SafeHandle safeHandle, StringRef stringRef, String str);

    private void sessionStartedEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("16032"));
            if (this.f12579c) {
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
            Contracts.throwIfNull(this, StubApp.getString2("16032"));
            if (this.f12579c) {
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

    private void speechEndDetectedEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("16032"));
            if (this.f12579c) {
                return;
            }
            RecognitionEventArgs recognitionEventArgs = new RecognitionEventArgs(j, true);
            EventHandlerImpl<RecognitionEventArgs> eventHandlerImpl = this.speechEndDetected;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, recognitionEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long speechEndDetectedSetCallback(long j);

    private void speechStartDetectedEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("16032"));
            if (this.f12579c) {
                return;
            }
            RecognitionEventArgs recognitionEventArgs = new RecognitionEventArgs(j, true);
            EventHandlerImpl<RecognitionEventArgs> eventHandlerImpl = this.speechStartDetected;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, recognitionEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long speechStartDetectedSetCallback(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long startKeywordRecognition(SafeHandle safeHandle, SafeHandle safeHandle2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long stopKeywordRecognition(SafeHandle safeHandle);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long stopListening(SafeHandle safeHandle);

    private void turnStatusReceivedEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("16032"));
            if (this.f12579c) {
                return;
            }
            TurnStatusReceivedEventArgs turnStatusReceivedEventArgs = new TurnStatusReceivedEventArgs(j);
            EventHandlerImpl<TurnStatusReceivedEventArgs> eventHandlerImpl = this.turnStatusReceived;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, turnStatusReceivedEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long turnStatusReceivedSetCallback(long j);

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.f12579c) {
            return;
        }
        PropertyCollection propertyCollection = this.f12577a;
        if (propertyCollection != null) {
            propertyCollection.close();
            this.f12577a = null;
        }
        SafeHandle safeHandle = this.f12578b;
        if (safeHandle != null) {
            safeHandle.close();
            this.f12578b = null;
        }
        f12576d.remove(this);
        AsyncThreadService.shutdown();
        this.f12579c = true;
    }

    public Future<Void> connectAsync() {
        return AsyncThreadService.submit(new b(this, 0));
    }

    public Future<Void> disconnectAsync() {
        return AsyncThreadService.submit(new b(this, 1));
    }

    public String getAuthorizationToken() {
        return this.f12577a.getProperty(PropertyId.SpeechServiceAuthorization_Token);
    }

    public SafeHandle getImpl() {
        return this.f12578b;
    }

    public PropertyCollection getProperties() {
        return this.f12577a;
    }

    public Future<SpeechRecognitionResult> listenOnceAsync() {
        return AsyncThreadService.submit(new b(this, 2));
    }

    public Future<String> sendActivityAsync(String str) {
        Contracts.throwIfNull(str, StubApp.getString2(2680));
        return AsyncThreadService.submit(new c(0, this, str));
    }

    public void setAuthorizationToken(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(1071));
        this.f12577a.setProperty(PropertyId.SpeechServiceAuthorization_Token, str);
    }

    public void setSpeechActivityTemplate(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(16033));
        this.f12577a.setProperty(PropertyId.Conversation_Speech_Activity_Template, str);
    }

    public Future<Void> startKeywordRecognitionAsync(KeywordRecognitionModel keywordRecognitionModel) {
        return AsyncThreadService.submit(new c(1, this, keywordRecognitionModel));
    }

    public Future<Void> stopKeywordRecognitionAsync() {
        return AsyncThreadService.submit(new b(this, 4));
    }

    public Future<Void> stopListeningAsync() {
        return AsyncThreadService.submit(new b(this, 3));
    }

    public DialogServiceConnector(DialogServiceConfig dialogServiceConfig, AudioConfig audioConfig) {
        long createDialogServiceConnectorFomConfig;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.recognizing = new EventHandlerImpl<>(atomicInteger);
        this.recognized = new EventHandlerImpl<>(atomicInteger);
        this.sessionStarted = new EventHandlerImpl<>(atomicInteger);
        this.sessionStopped = new EventHandlerImpl<>(atomicInteger);
        this.speechStartDetected = new EventHandlerImpl<>(atomicInteger);
        this.speechEndDetected = new EventHandlerImpl<>(atomicInteger);
        this.canceled = new EventHandlerImpl<>(atomicInteger);
        this.activityReceived = new EventHandlerImpl<>(atomicInteger);
        this.turnStatusReceived = new EventHandlerImpl<>(atomicInteger);
        this.f12578b = null;
        this.f12579c = false;
        Contracts.throwIfNull(dialogServiceConfig, StubApp.getString2(2448));
        if (audioConfig == null) {
            SafeHandle safeHandle = new SafeHandle(0L, SafeHandleType.DialogServiceConnector);
            this.f12578b = safeHandle;
            createDialogServiceConnectorFomConfig = createDialogServiceConnectorFomConfig(safeHandle, dialogServiceConfig.getImpl(), null);
        } else {
            SafeHandle safeHandle2 = new SafeHandle(0L, SafeHandleType.DialogServiceConnector);
            this.f12578b = safeHandle2;
            createDialogServiceConnectorFomConfig = createDialogServiceConnectorFomConfig(safeHandle2, dialogServiceConfig.getImpl(), audioConfig.getImpl());
        }
        Contracts.throwIfFail(createDialogServiceConnectorFomConfig);
        AsyncThreadService.initialize();
        this.recognizing.updateNotificationOnConnected(new a(this, this, 7));
        this.recognized.updateNotificationOnConnected(new a(this, this, 8));
        this.sessionStarted.updateNotificationOnConnected(new a(this, this, 0));
        this.sessionStopped.updateNotificationOnConnected(new a(this, this, 1));
        this.speechStartDetected.updateNotificationOnConnected(new a(this, this, 2));
        this.speechEndDetected.updateNotificationOnConnected(new a(this, this, 3));
        this.canceled.updateNotificationOnConnected(new a(this, this, 4));
        this.activityReceived.updateNotificationOnConnected(new a(this, this, 5));
        this.turnStatusReceived.updateNotificationOnConnected(new a(this, this, 6));
        IntRef intRef = new IntRef(0L);
        this.f12577a = com.mapbox.common.b.c(getPropertyBagFromDialogServiceConnectorHandle(this.f12578b, intRef), intRef);
    }
}
