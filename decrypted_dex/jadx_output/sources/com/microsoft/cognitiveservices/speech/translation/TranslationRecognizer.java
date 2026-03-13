package com.microsoft.cognitiveservices.speech.translation;

import M9.a;
import M9.b;
import M9.c;
import com.microsoft.cognitiveservices.speech.AutoDetectSourceLanguageConfig;
import com.microsoft.cognitiveservices.speech.EmbeddedSpeechConfig;
import com.microsoft.cognitiveservices.speech.HybridSpeechConfig;
import com.microsoft.cognitiveservices.speech.PropertyCollection;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.Recognizer;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import com.microsoft.cognitiveservices.speech.util.AsyncThreadService;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.EventHandlerImpl;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class TranslationRecognizer extends Recognizer {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f12721c = Collections.synchronizedSet(new HashSet());

    /* renamed from: a, reason: collision with root package name */
    public PropertyCollection f12722a;

    /* renamed from: b, reason: collision with root package name */
    public SafeHandle f12723b;
    public final EventHandlerImpl<TranslationRecognitionCanceledEventArgs> canceled;
    public final EventHandlerImpl<TranslationRecognitionEventArgs> recognized;
    public final EventHandlerImpl<TranslationRecognitionEventArgs> recognizing;
    public final EventHandlerImpl<TranslationSynthesisEventArgs> synthesizing;

    public TranslationRecognizer(EmbeddedSpeechConfig embeddedSpeechConfig) {
        super(null, null);
        this.recognizing = new EventHandlerImpl<>(this.eventCounter);
        this.recognized = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.synthesizing = new EventHandlerImpl<>(this.eventCounter);
        this.f12722a = null;
        this.f12723b = null;
        Contracts.throwIfNull(embeddedSpeechConfig, StubApp.getString2(15706));
        Contracts.throwIfNull(super.getImpl(), StubApp.getString2(15749));
        Contracts.throwIfFail(createTranslationRecognizerFromConfig(super.getImpl(), embeddedSpeechConfig.getImpl(), null));
        d();
    }

    private final native long addTargetLanguage(SafeHandle safeHandle, String str);

    private void canceledEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("15732"));
            if (this.disposed) {
                return;
            }
            TranslationRecognitionCanceledEventArgs translationRecognitionCanceledEventArgs = new TranslationRecognitionCanceledEventArgs(j);
            EventHandlerImpl<TranslationRecognitionCanceledEventArgs> eventHandlerImpl = this.canceled;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, translationRecognitionCanceledEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    private final native long createTranslationRecognizerFromAutoDetectSourceLangConfig(SafeHandle safeHandle, SafeHandle safeHandle2, SafeHandle safeHandle3, SafeHandle safeHandle4);

    private final native long createTranslationRecognizerFromConfig(SafeHandle safeHandle, SafeHandle safeHandle2, SafeHandle safeHandle3);

    private void recognizedEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("15732"));
            if (this.disposed) {
                return;
            }
            TranslationRecognitionEventArgs translationRecognitionEventArgs = new TranslationRecognitionEventArgs(j, 0);
            EventHandlerImpl<TranslationRecognitionEventArgs> eventHandlerImpl = this.recognized;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, translationRecognitionEventArgs);
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
            TranslationRecognitionEventArgs translationRecognitionEventArgs = new TranslationRecognitionEventArgs(j, 0);
            EventHandlerImpl<TranslationRecognitionEventArgs> eventHandlerImpl = this.recognizing;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, translationRecognitionEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    private final native long removeTargetLanguage(SafeHandle safeHandle, String str);

    private void synthesizingEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("15732"));
            if (this.disposed) {
                return;
            }
            TranslationSynthesisEventArgs translationSynthesisEventArgs = new TranslationSynthesisEventArgs(j);
            EventHandlerImpl<TranslationSynthesisEventArgs> eventHandlerImpl = this.synthesizing;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, translationSynthesisEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long synthesizingSetCallback(long j);

    public void addTargetLanguage(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(1061));
        Contracts.throwIfFail(addTargetLanguage(super.getImpl(), str));
    }

    public final void d() {
        this.f12723b = new SafeHandle(getImpl().getValue(), SafeHandleType.TranslationSynthesis);
        this.recognizing.updateNotificationOnConnected(new a(this, this, 3));
        this.recognized.updateNotificationOnConnected(new a(this, this, 4));
        this.synthesizing.updateNotificationOnConnected(new a(this, this, 5));
        this.canceled.updateNotificationOnConnected(new a(this, this, 6));
        this.sessionStarted.updateNotificationOnConnected(new a(this, this, 7));
        this.sessionStopped.updateNotificationOnConnected(new a(this, this, 8));
        this.tokenRequested.updateNotificationOnConnected(new a(this, this, 0));
        this.speechStartDetected.updateNotificationOnConnected(new a(this, this, 1));
        this.speechEndDetected.updateNotificationOnConnected(new a(this, this, 2));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getPropertyBagFromRecognizerHandle(getImpl(), intRef));
        PropertyCollection propertyCollection = new PropertyCollection(intRef);
        this.f12722a = propertyCollection;
        setUpTokenRefreshCallback(propertyCollection);
    }

    @Override // com.microsoft.cognitiveservices.speech.Recognizer
    public void dispose(boolean z2) {
        if (!this.disposed && z2) {
            PropertyCollection propertyCollection = this.f12722a;
            if (propertyCollection != null) {
                propertyCollection.close();
                this.f12722a = null;
            }
            SafeHandle safeHandle = this.f12723b;
            if (safeHandle != null) {
                safeHandle.close();
                this.f12723b = null;
            }
            f12721c.remove(this);
            super.dispose(z2);
        }
    }

    public String getAuthorizationToken() {
        return this.f12722a.getProperty(PropertyId.SpeechServiceAuthorization_Token);
    }

    public PropertyCollection getProperties() {
        return this.f12722a;
    }

    public String getSpeechRecognitionLanguage() {
        return this.f12722a.getProperty(PropertyId.SpeechServiceConnection_RecoLanguage);
    }

    public ArrayList<String> getTargetLanguages() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : this.f12722a.getProperty(PropertyId.SpeechServiceConnection_TranslationToLanguages).split(StubApp.getString2(321))) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public String getVoiceName() {
        return this.f12722a.getProperty(PropertyId.SpeechServiceConnection_TranslationVoice);
    }

    public Future<TranslationRecognitionResult> recognizeOnceAsync() {
        return AsyncThreadService.submit(new b(this, 0));
    }

    public void removeTargetLanguage(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(1061));
        Contracts.throwIfFail(removeTargetLanguage(super.getImpl(), str));
    }

    public void setAuthorizationToken(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(1071));
        this.f12722a.setProperty(PropertyId.SpeechServiceAuthorization_Token, str);
    }

    public Future<Void> startContinuousRecognitionAsync() {
        return AsyncThreadService.submit(new c(this, this, 0));
    }

    public Future<Void> stopContinuousRecognitionAsync() {
        return AsyncThreadService.submit(new c(this, this, 1));
    }

    public TranslationRecognizer(EmbeddedSpeechConfig embeddedSpeechConfig, AutoDetectSourceLanguageConfig autoDetectSourceLanguageConfig) {
        super(null, null);
        this.recognizing = new EventHandlerImpl<>(this.eventCounter);
        this.recognized = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.synthesizing = new EventHandlerImpl<>(this.eventCounter);
        this.f12722a = null;
        this.f12723b = null;
        Contracts.throwIfNull(embeddedSpeechConfig, StubApp.getString2(15706));
        Contracts.throwIfNull(autoDetectSourceLanguageConfig, StubApp.getString2(15924));
        Contracts.throwIfNull(super.getImpl(), StubApp.getString2(15749));
        Contracts.throwIfFail(createTranslationRecognizerFromAutoDetectSourceLangConfig(super.getImpl(), embeddedSpeechConfig.getImpl(), autoDetectSourceLanguageConfig.getImpl(), null));
        d();
    }

    public TranslationRecognizer(EmbeddedSpeechConfig embeddedSpeechConfig, AutoDetectSourceLanguageConfig autoDetectSourceLanguageConfig, AudioConfig audioConfig) {
        super(audioConfig, null);
        this.recognizing = new EventHandlerImpl<>(this.eventCounter);
        this.recognized = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.synthesizing = new EventHandlerImpl<>(this.eventCounter);
        this.f12722a = null;
        this.f12723b = null;
        Contracts.throwIfNull(embeddedSpeechConfig, StubApp.getString2(15706));
        Contracts.throwIfNull(autoDetectSourceLanguageConfig, StubApp.getString2(15924));
        Contracts.throwIfNull(super.getImpl(), StubApp.getString2(15749));
        Contracts.throwIfFail(audioConfig == null ? createTranslationRecognizerFromAutoDetectSourceLangConfig(super.getImpl(), embeddedSpeechConfig.getImpl(), autoDetectSourceLanguageConfig.getImpl(), null) : createTranslationRecognizerFromAutoDetectSourceLangConfig(super.getImpl(), embeddedSpeechConfig.getImpl(), autoDetectSourceLanguageConfig.getImpl(), audioConfig.getImpl()));
        d();
    }

    public TranslationRecognizer(EmbeddedSpeechConfig embeddedSpeechConfig, AudioConfig audioConfig) {
        super(audioConfig, null);
        this.recognizing = new EventHandlerImpl<>(this.eventCounter);
        this.recognized = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.synthesizing = new EventHandlerImpl<>(this.eventCounter);
        this.f12722a = null;
        this.f12723b = null;
        Contracts.throwIfNull(embeddedSpeechConfig, StubApp.getString2(15706));
        Contracts.throwIfFail(audioConfig == null ? createTranslationRecognizerFromConfig(super.getImpl(), embeddedSpeechConfig.getImpl(), null) : createTranslationRecognizerFromConfig(super.getImpl(), embeddedSpeechConfig.getImpl(), audioConfig.getImpl()));
        d();
    }

    public TranslationRecognizer(HybridSpeechConfig hybridSpeechConfig) {
        super(null, null);
        this.recognizing = new EventHandlerImpl<>(this.eventCounter);
        this.recognized = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.synthesizing = new EventHandlerImpl<>(this.eventCounter);
        this.f12722a = null;
        this.f12723b = null;
        Contracts.throwIfNull(hybridSpeechConfig, StubApp.getString2(16094));
        Contracts.throwIfNull(super.getImpl(), StubApp.getString2(15749));
        Contracts.throwIfFail(createTranslationRecognizerFromConfig(super.getImpl(), hybridSpeechConfig.getImpl(), null));
        d();
    }

    public TranslationRecognizer(HybridSpeechConfig hybridSpeechConfig, AudioConfig audioConfig) {
        super(audioConfig, null);
        this.recognizing = new EventHandlerImpl<>(this.eventCounter);
        this.recognized = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.synthesizing = new EventHandlerImpl<>(this.eventCounter);
        this.f12722a = null;
        this.f12723b = null;
        Contracts.throwIfNull(hybridSpeechConfig, StubApp.getString2(16094));
        Contracts.throwIfFail(audioConfig == null ? createTranslationRecognizerFromConfig(super.getImpl(), hybridSpeechConfig.getImpl(), null) : createTranslationRecognizerFromConfig(super.getImpl(), hybridSpeechConfig.getImpl(), audioConfig.getImpl()));
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationRecognizer(SpeechTranslationConfig speechTranslationConfig) {
        super(null, null);
        speechTranslationConfig.getTokenCredential();
        this.recognizing = new EventHandlerImpl<>(this.eventCounter);
        this.recognized = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.synthesizing = new EventHandlerImpl<>(this.eventCounter);
        this.f12722a = null;
        this.f12723b = null;
        Contracts.throwIfNull(speechTranslationConfig, StubApp.getString2(16095));
        Contracts.throwIfNull(super.getImpl(), StubApp.getString2(15749));
        Contracts.throwIfFail(createTranslationRecognizerFromConfig(super.getImpl(), speechTranslationConfig.getImpl(), null));
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationRecognizer(SpeechTranslationConfig speechTranslationConfig, AutoDetectSourceLanguageConfig autoDetectSourceLanguageConfig) {
        super(null, null);
        speechTranslationConfig.getTokenCredential();
        this.recognizing = new EventHandlerImpl<>(this.eventCounter);
        this.recognized = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.synthesizing = new EventHandlerImpl<>(this.eventCounter);
        this.f12722a = null;
        this.f12723b = null;
        Contracts.throwIfNull(speechTranslationConfig, StubApp.getString2(16095));
        Contracts.throwIfNull(autoDetectSourceLanguageConfig, StubApp.getString2(15924));
        Contracts.throwIfNull(super.getImpl(), StubApp.getString2(15749));
        Contracts.throwIfFail(createTranslationRecognizerFromAutoDetectSourceLangConfig(super.getImpl(), speechTranslationConfig.getImpl(), autoDetectSourceLanguageConfig.getImpl(), null));
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationRecognizer(SpeechTranslationConfig speechTranslationConfig, AutoDetectSourceLanguageConfig autoDetectSourceLanguageConfig, AudioConfig audioConfig) {
        super(audioConfig, null);
        speechTranslationConfig.getTokenCredential();
        this.recognizing = new EventHandlerImpl<>(this.eventCounter);
        this.recognized = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.synthesizing = new EventHandlerImpl<>(this.eventCounter);
        this.f12722a = null;
        this.f12723b = null;
        Contracts.throwIfNull(speechTranslationConfig, StubApp.getString2(16095));
        Contracts.throwIfNull(autoDetectSourceLanguageConfig, StubApp.getString2(15924));
        Contracts.throwIfNull(super.getImpl(), StubApp.getString2(15749));
        Contracts.throwIfFail(audioConfig == null ? createTranslationRecognizerFromAutoDetectSourceLangConfig(super.getImpl(), speechTranslationConfig.getImpl(), autoDetectSourceLanguageConfig.getImpl(), null) : createTranslationRecognizerFromAutoDetectSourceLangConfig(super.getImpl(), speechTranslationConfig.getImpl(), autoDetectSourceLanguageConfig.getImpl(), audioConfig.getImpl()));
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationRecognizer(SpeechTranslationConfig speechTranslationConfig, AudioConfig audioConfig) {
        super(audioConfig, null);
        speechTranslationConfig.getTokenCredential();
        this.recognizing = new EventHandlerImpl<>(this.eventCounter);
        this.recognized = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.synthesizing = new EventHandlerImpl<>(this.eventCounter);
        this.f12722a = null;
        this.f12723b = null;
        Contracts.throwIfNull(speechTranslationConfig, StubApp.getString2(16095));
        Contracts.throwIfFail(audioConfig == null ? createTranslationRecognizerFromConfig(super.getImpl(), speechTranslationConfig.getImpl(), null) : createTranslationRecognizerFromConfig(super.getImpl(), speechTranslationConfig.getImpl(), audioConfig.getImpl()));
        d();
    }
}
