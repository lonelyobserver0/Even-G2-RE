package com.microsoft.cognitiveservices.speech.intent;

import com.microsoft.cognitiveservices.speech.EmbeddedSpeechConfig;
import com.microsoft.cognitiveservices.speech.KeywordRecognitionModel;
import com.microsoft.cognitiveservices.speech.PropertyCollection;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.Recognizer;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import com.microsoft.cognitiveservices.speech.util.AsyncThreadService;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.EventHandlerImpl;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class IntentRecognizer extends Recognizer {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f12590b = Collections.synchronizedSet(new HashSet());

    /* renamed from: a, reason: collision with root package name */
    public PropertyCollection f12591a;
    public final EventHandlerImpl<IntentRecognitionCanceledEventArgs> canceled;
    public final EventHandlerImpl<IntentRecognitionEventArgs> recognized;
    public final EventHandlerImpl<IntentRecognitionEventArgs> recognizing;

    public IntentRecognizer(EmbeddedSpeechConfig embeddedSpeechConfig) {
        super(null, null);
        this.recognizing = new EventHandlerImpl<>(this.eventCounter);
        this.recognized = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.f12591a = null;
        Contracts.throwIfNull(embeddedSpeechConfig, StubApp.getString2(15706));
        Contracts.throwIfNull(super.getImpl(), StubApp.getString2(15749));
        Contracts.throwIfFail(createIntentRecognizerFromConfig(super.getImpl(), embeddedSpeechConfig.getImpl(), null));
        initialize();
    }

    private final native long addIntent(SafeHandle safeHandle, String str, SafeHandle safeHandle2);

    private final native long addIntentWithModelId(SafeHandle safeHandle, SafeHandle safeHandle2, String str);

    private void canceledEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("15732"));
            if (this.disposed) {
                return;
            }
            IntentRecognitionCanceledEventArgs intentRecognitionCanceledEventArgs = new IntentRecognitionCanceledEventArgs(j);
            EventHandlerImpl<IntentRecognitionCanceledEventArgs> eventHandlerImpl = this.canceled;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, intentRecognitionCanceledEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    private final native long clearLanguageModels(SafeHandle safeHandle);

    private final native long createIntentRecognizerFromConfig(SafeHandle safeHandle, SafeHandle safeHandle2, SafeHandle safeHandle3);

    private final native long createPatternMatchingModel(SafeHandle safeHandle, SafeHandle safeHandle2, String str);

    private final native long patternMatchingModelAddEntity(SafeHandle safeHandle, String str, int i3, int i10, String[] strArr);

    private final native long patternMatchingModelAddIntent(SafeHandle safeHandle, String str, int i3, String[] strArr);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long recognizeTextOnce(SafeHandle safeHandle, String str, IntRef intRef);

    private void recognizedEventCallback(long j) {
        try {
            Contracts.throwIfNull(this, StubApp.getString2("15732"));
            if (this.disposed) {
                return;
            }
            IntentRecognitionEventArgs intentRecognitionEventArgs = new IntentRecognitionEventArgs(j, 0);
            EventHandlerImpl<IntentRecognitionEventArgs> eventHandlerImpl = this.recognized;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, intentRecognitionEventArgs);
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
            IntentRecognitionEventArgs intentRecognitionEventArgs = new IntentRecognitionEventArgs(j, 0);
            EventHandlerImpl<IntentRecognitionEventArgs> eventHandlerImpl = this.recognizing;
            if (eventHandlerImpl != null) {
                eventHandlerImpl.fireEvent(this, intentRecognitionEventArgs);
            }
        } catch (Exception unused) {
        }
    }

    public void addAllIntents(LanguageUnderstandingModel languageUnderstandingModel) {
        Contracts.throwIfNull(languageUnderstandingModel, StubApp.getString2(215));
        Contracts.throwIfFail(addIntent(super.getImpl(), (String) null, IntentTrigger.fromModel(languageUnderstandingModel.getImpl()).getImpl()));
    }

    public void addIntent(LanguageUnderstandingModel languageUnderstandingModel, String str) {
        Contracts.throwIfNull(languageUnderstandingModel, StubApp.getString2(215));
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(16042));
        Contracts.throwIfFail(addIntent(super.getImpl(), str, IntentTrigger.fromModel(languageUnderstandingModel.getImpl(), str).getImpl()));
    }

    public boolean applyLanguageModels(Collection<LanguageUnderstandingModel> collection) throws NullPointerException {
        Throwable th;
        Contracts.throwIfNull(collection, StubApp.getString2(15760));
        Contracts.throwIfFail(clearLanguageModels(super.getImpl()));
        boolean z2 = true;
        for (LanguageUnderstandingModel languageUnderstandingModel : collection) {
            Contracts.throwIfNull(languageUnderstandingModel, StubApp.getString2(215));
            if (languageUnderstandingModel instanceof PatternMatchingModel) {
                PatternMatchingModel patternMatchingModel = (PatternMatchingModel) languageUnderstandingModel;
                SafeHandle safeHandle = new SafeHandle(0L, SafeHandleType.LanguageUnderstandingModel);
                try {
                    Contracts.throwIfFail(createPatternMatchingModel(safeHandle, super.getImpl(), patternMatchingModel.getId()));
                    for (PatternMatchingIntent patternMatchingIntent : patternMatchingModel.getIntents().values()) {
                        try {
                            Contracts.throwIfFail(patternMatchingModelAddIntent(safeHandle, patternMatchingIntent.getId(), 0, (String[]) patternMatchingIntent.Phrases.toArray(new String[0])));
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    for (PatternMatchingEntity patternMatchingEntity : patternMatchingModel.getEntities().values()) {
                        try {
                            Contracts.throwIfFail(patternMatchingModelAddEntity(safeHandle, patternMatchingEntity.getId(), patternMatchingEntity.getType().getValue(), patternMatchingEntity.getMatchMode().getValue(), (String[]) patternMatchingEntity.Phrases.toArray(new String[0])));
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    }
                    IntentTrigger fromModel = IntentTrigger.fromModel(safeHandle);
                    try {
                        Contracts.throwIfFail(addIntentWithModelId(super.getImpl(), fromModel.getImpl(), patternMatchingModel.getId()));
                        fromModel.close();
                        safeHandle.close();
                    } finally {
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } else if (languageUnderstandingModel != null) {
                Contracts.throwIfFail(addIntent(super.getImpl(), (String) null, IntentTrigger.fromModel(languageUnderstandingModel.getImpl()).getImpl()));
                z2 = false;
            }
        }
        return z2;
    }

    @Override // com.microsoft.cognitiveservices.speech.Recognizer
    public void dispose(boolean z2) {
        if (!this.disposed && z2) {
            PropertyCollection propertyCollection = this.f12591a;
            if (propertyCollection != null) {
                propertyCollection.close();
                this.f12591a = null;
            }
            f12590b.remove(this);
            super.dispose(z2);
        }
    }

    public String getAuthorizationToken() {
        return this.f12591a.getProperty(PropertyId.SpeechServiceAuthorization_Token);
    }

    public PropertyCollection getProperties() {
        return this.f12591a;
    }

    public String getSpeechRecognitionLanguage() {
        return this.f12591a.getProperty(PropertyId.SpeechServiceConnection_RecoLanguage);
    }

    public final void initialize() {
        this.recognizing.updateNotificationOnConnected(new a(this, this, 4));
        this.recognized.updateNotificationOnConnected(new a(this, this, 5));
        this.canceled.updateNotificationOnConnected(new a(this, this, 6));
        this.sessionStarted.updateNotificationOnConnected(new a(this, this, 0));
        this.sessionStopped.updateNotificationOnConnected(new a(this, this, 1));
        this.speechStartDetected.updateNotificationOnConnected(new a(this, this, 2));
        this.speechEndDetected.updateNotificationOnConnected(new a(this, this, 3));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(getPropertyBagFromRecognizerHandle(getImpl(), intRef));
        this.f12591a = new PropertyCollection(intRef);
    }

    public Future<IntentRecognitionResult> recognizeOnceAsync() {
        return AsyncThreadService.submit(new M9.b(this, 1));
    }

    public void setAuthorizationToken(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(1071));
        this.f12591a.setProperty(PropertyId.SpeechServiceAuthorization_Token, str);
    }

    public Future<Void> startContinuousRecognitionAsync() {
        return AsyncThreadService.submit(new b(this, this, 0));
    }

    public Future<Void> startKeywordRecognitionAsync(KeywordRecognitionModel keywordRecognitionModel) {
        Contracts.throwIfNull(keywordRecognitionModel, StubApp.getString2(215));
        return AsyncThreadService.submit(new K9.b(this, this, keywordRecognitionModel, 4));
    }

    public Future<Void> stopContinuousRecognitionAsync() {
        return AsyncThreadService.submit(new b(this, this, 1));
    }

    public Future<Void> stopKeywordRecognitionAsync() {
        return AsyncThreadService.submit(new b(this, this, 2));
    }

    public IntentRecognizer(EmbeddedSpeechConfig embeddedSpeechConfig, AudioConfig audioConfig) {
        super(audioConfig, null);
        this.recognizing = new EventHandlerImpl<>(this.eventCounter);
        this.recognized = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.f12591a = null;
        Contracts.throwIfNull(embeddedSpeechConfig, StubApp.getString2(15706));
        Contracts.throwIfNull(super.getImpl(), StubApp.getString2(15749));
        Contracts.throwIfFail(audioConfig == null ? createIntentRecognizerFromConfig(super.getImpl(), embeddedSpeechConfig.getImpl(), null) : createIntentRecognizerFromConfig(super.getImpl(), embeddedSpeechConfig.getImpl(), audioConfig.getImpl()));
        initialize();
    }

    public void addAllIntents(LanguageUnderstandingModel languageUnderstandingModel, String str) {
        Contracts.throwIfNull(languageUnderstandingModel, StubApp.getString2(215));
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(16041));
        Contracts.throwIfFail(addIntent(super.getImpl(), str, IntentTrigger.fromModel(languageUnderstandingModel.getImpl()).getImpl()));
    }

    public void addIntent(LanguageUnderstandingModel languageUnderstandingModel, String str, String str2) {
        Contracts.throwIfNull(languageUnderstandingModel, StubApp.getString2(215));
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(16042));
        Contracts.throwIfNullOrWhitespace(str2, StubApp.getString2(16041));
        Contracts.throwIfFail(addIntent(super.getImpl(), str2, IntentTrigger.fromModel(languageUnderstandingModel.getImpl(), str).getImpl()));
    }

    public Future<IntentRecognitionResult> recognizeOnceAsync(String str) {
        return AsyncThreadService.submit(new K9.b(this, this, str, 3));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentRecognizer(SpeechConfig speechConfig) {
        super(null, null);
        speechConfig.getTokenCredential();
        this.recognizing = new EventHandlerImpl<>(this.eventCounter);
        this.recognized = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.f12591a = null;
        Contracts.throwIfNull(speechConfig, StubApp.getString2(15923));
        Contracts.throwIfNull(super.getImpl(), StubApp.getString2(15749));
        Contracts.throwIfFail(createIntentRecognizerFromConfig(super.getImpl(), speechConfig.getImpl(), null));
        initialize();
    }

    public void addIntent(String str) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(16043));
        Contracts.throwIfFail(addIntent(super.getImpl(), str, IntentTrigger.fromPhrase(str).getImpl()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentRecognizer(SpeechConfig speechConfig, AudioConfig audioConfig) {
        super(audioConfig, null);
        speechConfig.getTokenCredential();
        this.recognizing = new EventHandlerImpl<>(this.eventCounter);
        this.recognized = new EventHandlerImpl<>(this.eventCounter);
        this.canceled = new EventHandlerImpl<>(this.eventCounter);
        this.f12591a = null;
        Contracts.throwIfNull(speechConfig, StubApp.getString2(15923));
        Contracts.throwIfFail(audioConfig == null ? createIntentRecognizerFromConfig(super.getImpl(), speechConfig.getImpl(), null) : createIntentRecognizerFromConfig(super.getImpl(), speechConfig.getImpl(), audioConfig.getImpl()));
        initialize();
    }

    public void addIntent(String str, String str2) {
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(16043));
        Contracts.throwIfNullOrWhitespace(str2, StubApp.getString2(16041));
        Contracts.throwIfFail(addIntent(super.getImpl(), str2, IntentTrigger.fromPhrase(str).getImpl()));
    }
}
