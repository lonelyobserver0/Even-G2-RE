package com.microsoft.cognitiveservices.speech.transcription;

import L9.g;
import L9.h;
import com.microsoft.cognitiveservices.speech.AutoDetectSourceLanguageConfig;
import com.microsoft.cognitiveservices.speech.OutputFormat;
import com.microsoft.cognitiveservices.speech.PropertyCollection;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.Recognizer;
import com.microsoft.cognitiveservices.speech.SourceLanguageConfig;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import com.microsoft.cognitiveservices.speech.util.AsyncThreadService;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.EventHandlerImpl;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.stub.StubApp;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class ConversationTranscriber extends Recognizer {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f12669b = Collections.synchronizedSet(new HashSet());

    /* renamed from: a, reason: collision with root package name */
    public PropertyCollection f12670a;
    public final EventHandlerImpl<ConversationTranscriptionCanceledEventArgs> canceled;
    public final EventHandlerImpl<ConversationTranscriptionEventArgs> transcribed;
    public final EventHandlerImpl<ConversationTranscriptionEventArgs> transcribing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationTranscriber(SpeechConfig speechConfig) {
        super(null, null);
        speechConfig.getTokenCredential();
        this.transcribing = new EventHandlerImpl<>(this.eventCounter);
        this.transcribed = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.f12670a = null;
        Contracts.throwIfNull(speechConfig, StubApp.getString2(15923));
        Contracts.throwIfNull(super.getImpl(), StubApp.getString2(15749));
        Contracts.throwIfFail(createConversationTranscriberFromConfig(super.getImpl(), speechConfig.getImpl(), null));
        a();
    }

    private void canceledEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("15732"));
            if (this.disposed) {
                return;
            }
            ConversationTranscriptionCanceledEventArgs conversationTranscriptionCanceledEventArgs = new ConversationTranscriptionCanceledEventArgs(j);
            EventHandlerImpl<ConversationTranscriptionCanceledEventArgs> eventHandlerImpl = this.canceled;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, conversationTranscriptionCanceledEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    private final native long createConversationTranscriberFromAutoDetectSourceLangConfig(SafeHandle safeHandle, SafeHandle safeHandle2, SafeHandle safeHandle3, SafeHandle safeHandle4);

    private final native long createConversationTranscriberFromConfig(SafeHandle safeHandle, SafeHandle safeHandle2, SafeHandle safeHandle3);

    private final native long createConversationTranscriberFromSourceLangConfig(SafeHandle safeHandle, SafeHandle safeHandle2, SafeHandle safeHandle3, SafeHandle safeHandle4);

    private void recognizedEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("15732"));
            if (this.disposed) {
                return;
            }
            ConversationTranscriptionEventArgs conversationTranscriptionEventArgs = new ConversationTranscriptionEventArgs(j, 0);
            EventHandlerImpl<ConversationTranscriptionEventArgs> eventHandlerImpl = this.transcribed;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, conversationTranscriptionEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    private void recognizingEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("15732"));
            if (this.disposed) {
                return;
            }
            ConversationTranscriptionEventArgs conversationTranscriptionEventArgs = new ConversationTranscriptionEventArgs(j, 0);
            EventHandlerImpl<ConversationTranscriptionEventArgs> eventHandlerImpl = this.transcribing;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, conversationTranscriptionEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    public final void a() {
        this.transcribing.updateNotificationOnConnected(new g(this, this, 1));
        this.transcribed.updateNotificationOnConnected(new g(this, this, 2));
        this.canceled.updateNotificationOnConnected(new g(this, this, 3));
        this.sessionStarted.updateNotificationOnConnected(new g(this, this, 4));
        this.sessionStopped.updateNotificationOnConnected(new g(this, this, 5));
        this.tokenRequested.updateNotificationOnConnected(new g(this, this, 6));
        this.speechStartDetected.updateNotificationOnConnected(new g(this, this, 7));
        this.speechEndDetected.updateNotificationOnConnected(new g(this, this, 0));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getPropertyBagFromRecognizerHandle(getImpl(), intRef));
        PropertyCollection propertyCollection = new PropertyCollection(intRef);
        this.f12670a = propertyCollection;
        setUpTokenRefreshCallback(propertyCollection);
    }

    @Override // com.microsoft.cognitiveservices.speech.Recognizer
    public void dispose(boolean z2) {
        if (!this.disposed && z2) {
            PropertyCollection propertyCollection = this.f12670a;
            if (propertyCollection != null) {
                propertyCollection.close();
                this.f12670a = null;
            }
            f12669b.remove(this);
            super.dispose(z2);
        }
    }

    public String getAuthorizationToken() {
        return this.f12670a.getProperty(PropertyId.SpeechServiceAuthorization_Token);
    }

    public OutputFormat getOutputFormat() {
        return this.f12670a.getProperty(PropertyId.SpeechServiceResponse_RequestDetailedResultTrueFalse).equals(StubApp.getString2(6547)) ? OutputFormat.Detailed : OutputFormat.Simple;
    }

    public PropertyCollection getProperties() {
        return this.f12670a;
    }

    public String getSpeechRecognitionLanguage() {
        return this.f12670a.getProperty(PropertyId.SpeechServiceConnection_RecoLanguage);
    }

    public void setAuthorizationToken(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(1071));
        this.f12670a.setProperty(PropertyId.SpeechServiceAuthorization_Token, str);
    }

    public Future<Void> startTranscribingAsync() {
        return AsyncThreadService.submit(new h(this, this, 0));
    }

    public Future<Void> stopTranscribingAsync() {
        return AsyncThreadService.submit(new h(this, this, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationTranscriber(SpeechConfig speechConfig, AutoDetectSourceLanguageConfig autoDetectSourceLanguageConfig) {
        super(null, null);
        speechConfig.getTokenCredential();
        this.transcribing = new EventHandlerImpl<>(this.eventCounter);
        this.transcribed = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.f12670a = null;
        Contracts.throwIfNull(speechConfig, StubApp.getString2(15923));
        Contracts.throwIfNull(autoDetectSourceLanguageConfig, StubApp.getString2(15924));
        Contracts.throwIfFail(createConversationTranscriberFromAutoDetectSourceLangConfig(super.getImpl(), speechConfig.getImpl(), autoDetectSourceLanguageConfig.getImpl(), null));
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationTranscriber(SpeechConfig speechConfig, AutoDetectSourceLanguageConfig autoDetectSourceLanguageConfig, AudioConfig audioConfig) {
        super(audioConfig, null);
        speechConfig.getTokenCredential();
        this.transcribing = new EventHandlerImpl<>(this.eventCounter);
        this.transcribed = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.f12670a = null;
        Contracts.throwIfNull(speechConfig, StubApp.getString2(15923));
        Contracts.throwIfNull(autoDetectSourceLanguageConfig, StubApp.getString2(15924));
        Contracts.throwIfFail(audioConfig == null ? createConversationTranscriberFromAutoDetectSourceLangConfig(super.getImpl(), speechConfig.getImpl(), autoDetectSourceLanguageConfig.getImpl(), null) : createConversationTranscriberFromAutoDetectSourceLangConfig(super.getImpl(), speechConfig.getImpl(), autoDetectSourceLanguageConfig.getImpl(), audioConfig.getImpl()));
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationTranscriber(SpeechConfig speechConfig, SourceLanguageConfig sourceLanguageConfig) {
        super(null, null);
        speechConfig.getTokenCredential();
        this.transcribing = new EventHandlerImpl<>(this.eventCounter);
        this.transcribed = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.f12670a = null;
        Contracts.throwIfNull(speechConfig, StubApp.getString2(15923));
        Contracts.throwIfNull(sourceLanguageConfig, StubApp.getString2(15925));
        Contracts.throwIfFail(createConversationTranscriberFromSourceLangConfig(super.getImpl(), speechConfig.getImpl(), sourceLanguageConfig.getImpl(), null));
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationTranscriber(SpeechConfig speechConfig, SourceLanguageConfig sourceLanguageConfig, AudioConfig audioConfig) {
        super(audioConfig, null);
        speechConfig.getTokenCredential();
        this.transcribing = new EventHandlerImpl<>(this.eventCounter);
        this.transcribed = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.f12670a = null;
        Contracts.throwIfNull(speechConfig, StubApp.getString2(15923));
        Contracts.throwIfNull(sourceLanguageConfig, StubApp.getString2(15925));
        Contracts.throwIfFail(audioConfig == null ? createConversationTranscriberFromSourceLangConfig(super.getImpl(), speechConfig.getImpl(), sourceLanguageConfig.getImpl(), null) : createConversationTranscriberFromSourceLangConfig(super.getImpl(), speechConfig.getImpl(), sourceLanguageConfig.getImpl(), audioConfig.getImpl()));
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationTranscriber(SpeechConfig speechConfig, AudioConfig audioConfig) {
        super(audioConfig, null);
        speechConfig.getTokenCredential();
        this.transcribing = new EventHandlerImpl<>(this.eventCounter);
        this.transcribed = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.f12670a = null;
        Contracts.throwIfNull(speechConfig, StubApp.getString2(15923));
        Contracts.throwIfFail(audioConfig == null ? createConversationTranscriberFromConfig(super.getImpl(), speechConfig.getImpl(), null) : createConversationTranscriberFromConfig(super.getImpl(), speechConfig.getImpl(), audioConfig.getImpl()));
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationTranscriber(SpeechConfig speechConfig, String str) {
        super(null, null);
        speechConfig.getTokenCredential();
        this.transcribing = new EventHandlerImpl<>(this.eventCounter);
        this.transcribed = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.f12670a = null;
        Contracts.throwIfNull(speechConfig, StubApp.getString2(15923));
        Contracts.throwIfIllegalLanguage(str, StubApp.getString2(15898));
        Contracts.throwIfFail(createConversationTranscriberFromSourceLangConfig(super.getImpl(), speechConfig.getImpl(), SourceLanguageConfig.fromLanguage(str).getImpl(), null));
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationTranscriber(SpeechConfig speechConfig, String str, AudioConfig audioConfig) {
        super(audioConfig, null);
        speechConfig.getTokenCredential();
        this.transcribing = new EventHandlerImpl<>(this.eventCounter);
        this.transcribed = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.f12670a = null;
        Contracts.throwIfNull(speechConfig, StubApp.getString2(15923));
        Contracts.throwIfIllegalLanguage(str, StubApp.getString2(15898));
        Contracts.throwIfFail(audioConfig == null ? createConversationTranscriberFromSourceLangConfig(super.getImpl(), speechConfig.getImpl(), SourceLanguageConfig.fromLanguage(str).getImpl(), null) : createConversationTranscriberFromSourceLangConfig(super.getImpl(), speechConfig.getImpl(), SourceLanguageConfig.fromLanguage(str).getImpl(), audioConfig.getImpl()));
        a();
    }
}
