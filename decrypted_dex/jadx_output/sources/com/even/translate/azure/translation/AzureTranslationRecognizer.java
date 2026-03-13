package com.even.translate.azure.translation;

import Qb.C0227w0;
import Qb.I;
import Qb.J;
import Qb.L;
import Qb.W;
import Qb.r;
import R2.c;
import com.even.translate.azure.basic.AzureRecognizerError;
import com.even.translate.azure.basic.AzureRecognizerProtocol;
import com.even.translate.azure.basic.AzureRecognizerState;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.RecognitionEventArgs;
import com.microsoft.cognitiveservices.speech.SessionEventArgs;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import com.microsoft.cognitiveservices.speech.audio.AudioInputStream;
import com.microsoft.cognitiveservices.speech.audio.AudioStreamFormat;
import com.microsoft.cognitiveservices.speech.audio.PushAudioInputStream;
import com.microsoft.cognitiveservices.speech.translation.SpeechTranslationConfig;
import com.microsoft.cognitiveservices.speech.translation.TranslationRecognitionCanceledEventArgs;
import com.microsoft.cognitiveservices.speech.translation.TranslationRecognitionEventArgs;
import com.microsoft.cognitiveservices.speech.translation.TranslationRecognizer;
import com.microsoft.cognitiveservices.speech.translation.TranslationSynthesisEventArgs;
import com.microsoft.cognitiveservices.speech.util.EventHandler;
import com.stub.StubApp;
import i2.u;
import io.flutter.plugin.common.BinaryMessenger;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p0.AbstractC1482f;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/even/translate/azure/translation/AzureTranslationRecognizer;", "Lcom/even/translate/azure/basic/AzureRecognizerProtocol;", "Lcom/even/translate/azure/translation/AzureTranslationConfiguration;", "configuration", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "<init>", "(Lcom/even/translate/azure/translation/AzureTranslationConfiguration;Lio/flutter/plugin/common/BinaryMessenger;)V", "", "startTranslation", "()V", "pauseTranslation", "resumeTranslation", "stopTranslation", "close", "", "language", "setSourceLanguage", "(Ljava/lang/String;)V", "setTargetLanguage", "", "data", "writeAudioData", "([B)V", "handleRecognizerEvent", "Lcom/even/translate/azure/translation/AzureTranslationConfiguration;", "Lio/flutter/plugin/common/BinaryMessenger;", "tag", "Ljava/lang/String;", "Lcom/even/translate/azure/basic/AzureRecognizerState;", "state", "Lcom/even/translate/azure/basic/AzureRecognizerState;", "getState", "()Lcom/even/translate/azure/basic/AzureRecognizerState;", "setState", "(Lcom/even/translate/azure/basic/AzureRecognizerState;)V", "Lcom/microsoft/cognitiveservices/speech/audio/PushAudioInputStream;", "audioInputStream", "Lcom/microsoft/cognitiveservices/speech/audio/PushAudioInputStream;", "Lcom/microsoft/cognitiveservices/speech/translation/TranslationRecognizer;", "recognizer", "Lcom/microsoft/cognitiveservices/speech/translation/TranslationRecognizer;", "Lcom/microsoft/cognitiveservices/speech/audio/AudioConfig;", "audioConfig", "Lcom/microsoft/cognitiveservices/speech/audio/AudioConfig;", "Lcom/microsoft/cognitiveservices/speech/translation/SpeechTranslationConfig;", "translationConfig", "Lcom/microsoft/cognitiveservices/speech/translation/SpeechTranslationConfig;", "Lcom/even/translate/azure/translation/AzureTranslationEventHandler;", "eventHandler", "Lcom/even/translate/azure/translation/AzureTranslationEventHandler;", "LQb/r;", "scopeJob", "LQb/r;", "LQb/I;", "scope", "LQb/I;", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class AzureTranslationRecognizer implements AzureRecognizerProtocol {
    private AudioConfig audioConfig;
    private PushAudioInputStream audioInputStream;
    private final AzureTranslationConfiguration configuration;
    private AzureTranslationEventHandler eventHandler;
    private final BinaryMessenger messenger;
    private TranslationRecognizer recognizer;
    private final I scope;
    private final r scopeJob;
    private AzureRecognizerState state;
    private final String tag;
    private SpeechTranslationConfig translationConfig;

    public AzureTranslationRecognizer(AzureTranslationConfiguration configuration, BinaryMessenger binaryMessenger) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.configuration = configuration;
        this.messenger = binaryMessenger;
        String string2 = StubApp.getString2(10156);
        this.tag = string2;
        this.state = AzureRecognizerState.IDLE;
        C0227w0 a3 = L.a();
        this.scopeJob = a3;
        this.scope = J.a(CoroutineContext.Element.DefaultImpls.plus(a3, W.f5839b));
        c.d(string2, StubApp.getString2(10157));
        String take = StringsKt.take(configuration.getApiKey(), 8);
        String region = configuration.getRegion();
        String sourceLanguage = configuration.getSourceLanguage();
        String targetLanguage = configuration.getTargetLanguage();
        String sessionID = configuration.getSessionID();
        StringBuilder t3 = u.t(StubApp.getString2(10158), take, StubApp.getString2(10159), region, StubApp.getString2(10124));
        String string22 = StubApp.getString2(10125);
        E1.a.v(t3, sourceLanguage, string22, targetLanguage, StubApp.getString2(6817));
        t3.append(sessionID);
        c.b(string2, t3.toString());
        if (binaryMessenger == null) {
            c.c(string2, StubApp.getString2(10169));
            throw AzureRecognizerError.FlutterBinaryMessengerError.INSTANCE;
        }
        int sampleRate = configuration.getSampleRate();
        int bitsPerSample = configuration.getBitsPerSample();
        int channels = configuration.getChannels();
        StringBuilder l9 = AbstractC1482f.l(sampleRate, StubApp.getString2(10160), bitsPerSample, StubApp.getString2(6819), StubApp.getString2(6820));
        l9.append(channels);
        c.b(string2, l9.toString());
        AudioStreamFormat waveFormatPCM = AudioStreamFormat.getWaveFormatPCM(configuration.getSampleRate(), (short) configuration.getBitsPerSample(), (short) configuration.getChannels());
        if (waveFormatPCM == null) {
            c.c(string2, StubApp.getString2(10168));
            throw AzureRecognizerError.InitStreamFormatError.INSTANCE;
        }
        PushAudioInputStream createPushStream = AudioInputStream.createPushStream(waveFormatPCM);
        this.audioInputStream = createPushStream;
        if (createPushStream == null) {
            c.c(string2, StubApp.getString2(10167));
            throw AzureRecognizerError.InitInputStreamError.INSTANCE;
        }
        this.audioConfig = AudioConfig.fromStreamInput(createPushStream);
        SpeechTranslationConfig fromSubscription = SpeechTranslationConfig.fromSubscription(configuration.getApiKey(), configuration.getRegion());
        this.translationConfig = fromSubscription;
        if (fromSubscription == null) {
            c.c(string2, StubApp.getString2(10166));
            throw AzureRecognizerError.InitTranslationConfigError.INSTANCE;
        }
        Intrinsics.checkNotNull(fromSubscription);
        fromSubscription.setSpeechRecognitionLanguage(configuration.getSourceLanguage());
        SpeechTranslationConfig speechTranslationConfig = this.translationConfig;
        Intrinsics.checkNotNull(speechTranslationConfig);
        speechTranslationConfig.addTargetLanguage(configuration.getTargetLanguage());
        c.b(string2, StubApp.getString2(10161) + configuration.getSourceLanguage() + string22 + configuration.getTargetLanguage());
        if (configuration.getInitialSilenceTimeoutMs() != null && configuration.getInitialSilenceTimeoutMs().intValue() > 0) {
            SpeechTranslationConfig speechTranslationConfig2 = this.translationConfig;
            Intrinsics.checkNotNull(speechTranslationConfig2);
            speechTranslationConfig2.setProperty(PropertyId.SpeechServiceConnection_InitialSilenceTimeoutMs, String.valueOf(configuration.getInitialSilenceTimeoutMs()));
        }
        if (configuration.getEndSilenceTimeoutMs() != null && configuration.getEndSilenceTimeoutMs().intValue() > 0) {
            SpeechTranslationConfig speechTranslationConfig3 = this.translationConfig;
            Intrinsics.checkNotNull(speechTranslationConfig3);
            speechTranslationConfig3.setProperty(PropertyId.SpeechServiceConnection_EndSilenceTimeoutMs, String.valueOf(configuration.getEndSilenceTimeoutMs()));
        }
        if (configuration.getSegmentationSilenceTimeoutMs() != null && configuration.getSegmentationSilenceTimeoutMs().intValue() > 0) {
            SpeechTranslationConfig speechTranslationConfig4 = this.translationConfig;
            Intrinsics.checkNotNull(speechTranslationConfig4);
            speechTranslationConfig4.setProperty(PropertyId.Speech_SegmentationSilenceTimeoutMs, String.valueOf(configuration.getSegmentationSilenceTimeoutMs()));
        }
        c.b(string2, StubApp.getString2(10162) + configuration.getInitialSilenceTimeoutMs() + StubApp.getString2(10163) + configuration.getEndSilenceTimeoutMs() + StubApp.getString2(10164) + configuration.getSegmentationSilenceTimeoutMs());
        this.eventHandler = new AzureTranslationEventHandler(binaryMessenger, configuration.getSessionID());
        c.d(string2, StubApp.getString2(10165));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRecognizerEvent() {
        c.b(this.tag, StubApp.getString2(10170));
        TranslationRecognizer translationRecognizer = this.recognizer;
        if (translationRecognizer != null) {
            final int i3 = 0;
            translationRecognizer.recognized.addEventListener(new EventHandler(this) { // from class: com.even.translate.azure.translation.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AzureTranslationRecognizer f11144b;

                {
                    this.f11144b = this;
                }

                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    switch (i3) {
                        case 0:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$0(this.f11144b, obj, (TranslationRecognitionEventArgs) obj2);
                            break;
                        case 1:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$1(this.f11144b, obj, (TranslationRecognitionEventArgs) obj2);
                            break;
                        case 2:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$2(this.f11144b, obj, (SessionEventArgs) obj2);
                            break;
                        case 3:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$3(this.f11144b, obj, (SessionEventArgs) obj2);
                            break;
                        case 4:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$4(this.f11144b, obj, (RecognitionEventArgs) obj2);
                            break;
                        case 5:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$5(this.f11144b, obj, (RecognitionEventArgs) obj2);
                            break;
                        case 6:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$6(this.f11144b, obj, (TranslationRecognitionCanceledEventArgs) obj2);
                            break;
                        default:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$7(this.f11144b, obj, (TranslationSynthesisEventArgs) obj2);
                            break;
                    }
                }
            });
            final int i10 = 1;
            translationRecognizer.recognizing.addEventListener(new EventHandler(this) { // from class: com.even.translate.azure.translation.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AzureTranslationRecognizer f11144b;

                {
                    this.f11144b = this;
                }

                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    switch (i10) {
                        case 0:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$0(this.f11144b, obj, (TranslationRecognitionEventArgs) obj2);
                            break;
                        case 1:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$1(this.f11144b, obj, (TranslationRecognitionEventArgs) obj2);
                            break;
                        case 2:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$2(this.f11144b, obj, (SessionEventArgs) obj2);
                            break;
                        case 3:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$3(this.f11144b, obj, (SessionEventArgs) obj2);
                            break;
                        case 4:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$4(this.f11144b, obj, (RecognitionEventArgs) obj2);
                            break;
                        case 5:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$5(this.f11144b, obj, (RecognitionEventArgs) obj2);
                            break;
                        case 6:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$6(this.f11144b, obj, (TranslationRecognitionCanceledEventArgs) obj2);
                            break;
                        default:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$7(this.f11144b, obj, (TranslationSynthesisEventArgs) obj2);
                            break;
                    }
                }
            });
            final int i11 = 2;
            translationRecognizer.sessionStarted.addEventListener(new EventHandler(this) { // from class: com.even.translate.azure.translation.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AzureTranslationRecognizer f11144b;

                {
                    this.f11144b = this;
                }

                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    switch (i11) {
                        case 0:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$0(this.f11144b, obj, (TranslationRecognitionEventArgs) obj2);
                            break;
                        case 1:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$1(this.f11144b, obj, (TranslationRecognitionEventArgs) obj2);
                            break;
                        case 2:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$2(this.f11144b, obj, (SessionEventArgs) obj2);
                            break;
                        case 3:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$3(this.f11144b, obj, (SessionEventArgs) obj2);
                            break;
                        case 4:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$4(this.f11144b, obj, (RecognitionEventArgs) obj2);
                            break;
                        case 5:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$5(this.f11144b, obj, (RecognitionEventArgs) obj2);
                            break;
                        case 6:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$6(this.f11144b, obj, (TranslationRecognitionCanceledEventArgs) obj2);
                            break;
                        default:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$7(this.f11144b, obj, (TranslationSynthesisEventArgs) obj2);
                            break;
                    }
                }
            });
            final int i12 = 3;
            translationRecognizer.sessionStopped.addEventListener(new EventHandler(this) { // from class: com.even.translate.azure.translation.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AzureTranslationRecognizer f11144b;

                {
                    this.f11144b = this;
                }

                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    switch (i12) {
                        case 0:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$0(this.f11144b, obj, (TranslationRecognitionEventArgs) obj2);
                            break;
                        case 1:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$1(this.f11144b, obj, (TranslationRecognitionEventArgs) obj2);
                            break;
                        case 2:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$2(this.f11144b, obj, (SessionEventArgs) obj2);
                            break;
                        case 3:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$3(this.f11144b, obj, (SessionEventArgs) obj2);
                            break;
                        case 4:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$4(this.f11144b, obj, (RecognitionEventArgs) obj2);
                            break;
                        case 5:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$5(this.f11144b, obj, (RecognitionEventArgs) obj2);
                            break;
                        case 6:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$6(this.f11144b, obj, (TranslationRecognitionCanceledEventArgs) obj2);
                            break;
                        default:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$7(this.f11144b, obj, (TranslationSynthesisEventArgs) obj2);
                            break;
                    }
                }
            });
            final int i13 = 4;
            translationRecognizer.speechStartDetected.addEventListener(new EventHandler(this) { // from class: com.even.translate.azure.translation.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AzureTranslationRecognizer f11144b;

                {
                    this.f11144b = this;
                }

                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    switch (i13) {
                        case 0:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$0(this.f11144b, obj, (TranslationRecognitionEventArgs) obj2);
                            break;
                        case 1:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$1(this.f11144b, obj, (TranslationRecognitionEventArgs) obj2);
                            break;
                        case 2:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$2(this.f11144b, obj, (SessionEventArgs) obj2);
                            break;
                        case 3:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$3(this.f11144b, obj, (SessionEventArgs) obj2);
                            break;
                        case 4:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$4(this.f11144b, obj, (RecognitionEventArgs) obj2);
                            break;
                        case 5:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$5(this.f11144b, obj, (RecognitionEventArgs) obj2);
                            break;
                        case 6:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$6(this.f11144b, obj, (TranslationRecognitionCanceledEventArgs) obj2);
                            break;
                        default:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$7(this.f11144b, obj, (TranslationSynthesisEventArgs) obj2);
                            break;
                    }
                }
            });
            final int i14 = 5;
            translationRecognizer.speechEndDetected.addEventListener(new EventHandler(this) { // from class: com.even.translate.azure.translation.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AzureTranslationRecognizer f11144b;

                {
                    this.f11144b = this;
                }

                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    switch (i14) {
                        case 0:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$0(this.f11144b, obj, (TranslationRecognitionEventArgs) obj2);
                            break;
                        case 1:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$1(this.f11144b, obj, (TranslationRecognitionEventArgs) obj2);
                            break;
                        case 2:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$2(this.f11144b, obj, (SessionEventArgs) obj2);
                            break;
                        case 3:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$3(this.f11144b, obj, (SessionEventArgs) obj2);
                            break;
                        case 4:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$4(this.f11144b, obj, (RecognitionEventArgs) obj2);
                            break;
                        case 5:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$5(this.f11144b, obj, (RecognitionEventArgs) obj2);
                            break;
                        case 6:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$6(this.f11144b, obj, (TranslationRecognitionCanceledEventArgs) obj2);
                            break;
                        default:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$7(this.f11144b, obj, (TranslationSynthesisEventArgs) obj2);
                            break;
                    }
                }
            });
            final int i15 = 6;
            translationRecognizer.canceled.addEventListener(new EventHandler(this) { // from class: com.even.translate.azure.translation.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AzureTranslationRecognizer f11144b;

                {
                    this.f11144b = this;
                }

                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    switch (i15) {
                        case 0:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$0(this.f11144b, obj, (TranslationRecognitionEventArgs) obj2);
                            break;
                        case 1:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$1(this.f11144b, obj, (TranslationRecognitionEventArgs) obj2);
                            break;
                        case 2:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$2(this.f11144b, obj, (SessionEventArgs) obj2);
                            break;
                        case 3:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$3(this.f11144b, obj, (SessionEventArgs) obj2);
                            break;
                        case 4:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$4(this.f11144b, obj, (RecognitionEventArgs) obj2);
                            break;
                        case 5:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$5(this.f11144b, obj, (RecognitionEventArgs) obj2);
                            break;
                        case 6:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$6(this.f11144b, obj, (TranslationRecognitionCanceledEventArgs) obj2);
                            break;
                        default:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$7(this.f11144b, obj, (TranslationSynthesisEventArgs) obj2);
                            break;
                    }
                }
            });
            final int i16 = 7;
            translationRecognizer.synthesizing.addEventListener(new EventHandler(this) { // from class: com.even.translate.azure.translation.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AzureTranslationRecognizer f11144b;

                {
                    this.f11144b = this;
                }

                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    switch (i16) {
                        case 0:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$0(this.f11144b, obj, (TranslationRecognitionEventArgs) obj2);
                            break;
                        case 1:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$1(this.f11144b, obj, (TranslationRecognitionEventArgs) obj2);
                            break;
                        case 2:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$2(this.f11144b, obj, (SessionEventArgs) obj2);
                            break;
                        case 3:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$3(this.f11144b, obj, (SessionEventArgs) obj2);
                            break;
                        case 4:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$4(this.f11144b, obj, (RecognitionEventArgs) obj2);
                            break;
                        case 5:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$5(this.f11144b, obj, (RecognitionEventArgs) obj2);
                            break;
                        case 6:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$6(this.f11144b, obj, (TranslationRecognitionCanceledEventArgs) obj2);
                            break;
                        default:
                            AzureTranslationRecognizer.handleRecognizerEvent$lambda$8$lambda$7(this.f11144b, obj, (TranslationSynthesisEventArgs) obj2);
                            break;
                    }
                }
            });
        }
        c.b(this.tag, StubApp.getString2(10171));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleRecognizerEvent$lambda$8$lambda$0(AzureTranslationRecognizer azureTranslationRecognizer, Object obj, TranslationRecognitionEventArgs translationRecognitionEventArgs) {
        c.b(azureTranslationRecognizer.tag, StubApp.getString2(6854));
        AzureTranslationEventHandler azureTranslationEventHandler = azureTranslationRecognizer.eventHandler;
        if (azureTranslationEventHandler != null) {
            Intrinsics.checkNotNull(translationRecognitionEventArgs);
            azureTranslationEventHandler.handleRecognized(translationRecognitionEventArgs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleRecognizerEvent$lambda$8$lambda$1(AzureTranslationRecognizer azureTranslationRecognizer, Object obj, TranslationRecognitionEventArgs translationRecognitionEventArgs) {
        c.b(azureTranslationRecognizer.tag, StubApp.getString2(6849));
        AzureTranslationEventHandler azureTranslationEventHandler = azureTranslationRecognizer.eventHandler;
        if (azureTranslationEventHandler != null) {
            Intrinsics.checkNotNull(translationRecognitionEventArgs);
            azureTranslationEventHandler.handleRecognizing(translationRecognitionEventArgs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleRecognizerEvent$lambda$8$lambda$2(AzureTranslationRecognizer azureTranslationRecognizer, Object obj, SessionEventArgs sessionEventArgs) {
        c.b(azureTranslationRecognizer.tag, StubApp.getString2(6846));
        AzureTranslationEventHandler azureTranslationEventHandler = azureTranslationRecognizer.eventHandler;
        if (azureTranslationEventHandler != null) {
            Intrinsics.checkNotNull(sessionEventArgs);
            azureTranslationEventHandler.handleSessionStarted(sessionEventArgs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleRecognizerEvent$lambda$8$lambda$3(AzureTranslationRecognizer azureTranslationRecognizer, Object obj, SessionEventArgs sessionEventArgs) {
        c.b(azureTranslationRecognizer.tag, StubApp.getString2(6843));
        AzureTranslationEventHandler azureTranslationEventHandler = azureTranslationRecognizer.eventHandler;
        if (azureTranslationEventHandler != null) {
            Intrinsics.checkNotNull(sessionEventArgs);
            azureTranslationEventHandler.handleSessionStopped(sessionEventArgs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleRecognizerEvent$lambda$8$lambda$4(AzureTranslationRecognizer azureTranslationRecognizer, Object obj, RecognitionEventArgs recognitionEventArgs) {
        c.b(azureTranslationRecognizer.tag, StubApp.getString2(6840));
        AzureTranslationEventHandler azureTranslationEventHandler = azureTranslationRecognizer.eventHandler;
        if (azureTranslationEventHandler != null) {
            Intrinsics.checkNotNull(recognitionEventArgs);
            azureTranslationEventHandler.handleSpeechStartDetected(recognitionEventArgs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleRecognizerEvent$lambda$8$lambda$5(AzureTranslationRecognizer azureTranslationRecognizer, Object obj, RecognitionEventArgs recognitionEventArgs) {
        c.b(azureTranslationRecognizer.tag, StubApp.getString2(6837));
        AzureTranslationEventHandler azureTranslationEventHandler = azureTranslationRecognizer.eventHandler;
        if (azureTranslationEventHandler != null) {
            Intrinsics.checkNotNull(recognitionEventArgs);
            azureTranslationEventHandler.handleSpeechEndDetected(recognitionEventArgs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleRecognizerEvent$lambda$8$lambda$6(AzureTranslationRecognizer azureTranslationRecognizer, Object obj, TranslationRecognitionCanceledEventArgs translationRecognitionCanceledEventArgs) {
        c.b(azureTranslationRecognizer.tag, StubApp.getString2(6834));
        AzureTranslationEventHandler azureTranslationEventHandler = azureTranslationRecognizer.eventHandler;
        if (azureTranslationEventHandler != null) {
            Intrinsics.checkNotNull(translationRecognitionCanceledEventArgs);
            azureTranslationEventHandler.handleCanceled(translationRecognitionCanceledEventArgs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleRecognizerEvent$lambda$8$lambda$7(AzureTranslationRecognizer azureTranslationRecognizer, Object obj, TranslationSynthesisEventArgs translationSynthesisEventArgs) {
        c.b(azureTranslationRecognizer.tag, StubApp.getString2(10172));
        AzureTranslationEventHandler azureTranslationEventHandler = azureTranslationRecognizer.eventHandler;
        if (azureTranslationEventHandler != null) {
            Intrinsics.checkNotNull(translationSynthesisEventArgs);
            azureTranslationEventHandler.handleSynthesizing(translationSynthesisEventArgs);
        }
    }

    @Override // com.even.translate.azure.basic.AzureRecognizerProtocol
    public void close() {
        c.d(this.tag, StubApp.getString2(556) + getState());
        if (getState() == AzureRecognizerState.IDLE) {
            c.f(this.tag, StubApp.getString2(557));
        } else {
            L.j(this.scope, null, new AzureTranslationRecognizer$close$1(this, null), 3);
        }
    }

    @Override // com.even.translate.azure.basic.AzureRecognizerProtocol
    public AzureRecognizerState getState() {
        return this.state;
    }

    @Override // com.even.translate.azure.basic.AzureRecognizerProtocol
    public void pauseTranslation() {
        c.d(this.tag, StubApp.getString2(561) + getState());
        if (getState() != AzureRecognizerState.RUNNING) {
            c.c(this.tag, StubApp.getString2(562));
        } else {
            L.j(this.scope, null, new AzureTranslationRecognizer$pauseTranslation$1(this, null), 3);
        }
    }

    @Override // com.even.translate.azure.basic.AzureRecognizerProtocol
    public void resumeTranslation() {
        c.d(this.tag, StubApp.getString2(563) + getState());
        if (getState() != AzureRecognizerState.PAUSED) {
            c.c(this.tag, StubApp.getString2(564));
        } else {
            L.j(this.scope, null, new AzureTranslationRecognizer$resumeTranslation$1(this, null), 3);
        }
    }

    public final void setSourceLanguage(String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        c.b(this.tag, StubApp.getString2(565) + language);
        AzureTranslationConfiguration.update$default(this.configuration, language, null, 2, null);
        SpeechTranslationConfig speechTranslationConfig = this.translationConfig;
        if (speechTranslationConfig != null) {
            speechTranslationConfig.setSpeechRecognitionLanguage(language);
        }
    }

    public void setState(AzureRecognizerState azureRecognizerState) {
        Intrinsics.checkNotNullParameter(azureRecognizerState, "<set-?>");
        this.state = azureRecognizerState;
    }

    public final void setTargetLanguage(String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        c.b(this.tag, StubApp.getString2(10173) + language);
        AzureTranslationConfiguration.update$default(this.configuration, null, language, 1, null);
        SpeechTranslationConfig speechTranslationConfig = this.translationConfig;
        if (speechTranslationConfig != null) {
            AzureTranslationRecognizerKt.removeAllTargetLanguages(speechTranslationConfig);
        }
        SpeechTranslationConfig speechTranslationConfig2 = this.translationConfig;
        if (speechTranslationConfig2 != null) {
            speechTranslationConfig2.addTargetLanguage(language);
        }
    }

    @Override // com.even.translate.azure.basic.AzureRecognizerProtocol
    public void startTranslation() {
        c.d(this.tag, StubApp.getString2(566) + getState());
        if (getState() == AzureRecognizerState.IDLE || getState() == AzureRecognizerState.PAUSED) {
            L.j(this.scope, null, new AzureTranslationRecognizer$startTranslation$1(this, null), 3);
        } else {
            c.c(this.tag, StubApp.getString2(567));
        }
    }

    @Override // com.even.translate.azure.basic.AzureRecognizerProtocol
    public void stopTranslation() {
        c.d(this.tag, StubApp.getString2(568) + getState());
        if (getState() == AzureRecognizerState.RUNNING || getState() == AzureRecognizerState.PAUSED) {
            L.j(this.scope, null, new AzureTranslationRecognizer$stopTranslation$1(this, null), 3);
        } else {
            c.c(this.tag, StubApp.getString2(569));
        }
    }

    public final void writeAudioData(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        PushAudioInputStream pushAudioInputStream = this.audioInputStream;
        if (pushAudioInputStream != null) {
            pushAudioInputStream.write(data);
        }
    }
}
