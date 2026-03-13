package B3;

import Qb.C0227w0;
import Qb.J;
import Qb.L;
import Qb.W;
import V8.A;
import V8.B;
import V8.D;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.Cancelable;
import com.mapbox.common.location.DeviceLocationProvider;
import com.mapbox.common.location.DeviceLocationProviderType;
import com.mapbox.common.location.ExtendedLocationProviderParameters;
import com.mapbox.common.location.Location;
import com.mapbox.common.location.LocationError;
import com.mapbox.common.location.LocationErrorCode;
import com.mapbox.common.location.LocationProvider;
import com.mapbox.common.location.LocationService;
import com.mapbox.common.location.LocationServiceFactory;
import com.microsoft.cognitiveservices.speech.ProfanityOption;
import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.SpeechRecognitionCanceledEventArgs;
import com.microsoft.cognitiveservices.speech.SpeechRecognitionEventArgs;
import com.microsoft.cognitiveservices.speech.SpeechRecognizer;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import com.microsoft.cognitiveservices.speech.audio.AudioInputStream;
import com.microsoft.cognitiveservices.speech.audio.AudioStreamFormat;
import com.microsoft.cognitiveservices.speech.audio.PushAudioInputStream;
import com.microsoft.cognitiveservices.speech.util.EventHandler;
import com.stub.StubApp;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p0.AbstractC1482f;
import transcribe.TranscribeEventOuterClass;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f610a;

    /* renamed from: b, reason: collision with root package name */
    public Object f611b;

    /* renamed from: c, reason: collision with root package name */
    public Object f612c;

    /* renamed from: d, reason: collision with root package name */
    public Object f613d;

    /* renamed from: e, reason: collision with root package name */
    public Object f614e;

    /* renamed from: f, reason: collision with root package name */
    public Object f615f;

    /* renamed from: g, reason: collision with root package name */
    public Object f616g;

    /* renamed from: h, reason: collision with root package name */
    public Object f617h;

    /* renamed from: i, reason: collision with root package name */
    public Object f618i;
    public Object j;

    public h(L7.g locationOptions) {
        Expected<LocationError, DeviceLocationProvider> createError;
        DeviceLocationProviderType deviceLocationProviderType;
        Intrinsics.checkNotNullParameter(locationOptions, "locationOptions");
        String string2 = StubApp.getString2(539);
        B b2 = B.f7796f;
        Intrinsics.checkNotNullParameter(b2, string2);
        this.f610a = b2;
        this.f611b = LazyKt.lazy(A.f7790d);
        this.f612c = LazyKt.lazy(new Ac.m(this, 12));
        this.f615f = B.f7797g;
        Intrinsics.checkNotNullParameter("locations inputs thread", StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
        HandlerThread handlerThread = new HandlerThread("locations inputs thread");
        handlerThread.start();
        this.f616g = handlerThread;
        this.f617h = new C2.d(this, 24);
        this.f618i = new D(this, 0);
        if (Intrinsics.areEqual("REAL", "REAL")) {
            if (Intrinsics.areEqual("BEST", "BEST")) {
                deviceLocationProviderType = DeviceLocationProviderType.BEST;
            } else if (Intrinsics.areEqual("BEST", "GPS")) {
                deviceLocationProviderType = DeviceLocationProviderType.ANDROID;
            } else {
                if (!Intrinsics.areEqual("BEST", "FUSED")) {
                    throw new IllegalArgumentException(StubApp.getString2(541));
                }
                deviceLocationProviderType = DeviceLocationProviderType.GOOGLE_PLAY_SERVICES;
            }
            LocationService orCreate = LocationServiceFactory.getOrCreate();
            ExtendedLocationProviderParameters.Builder deviceLocationProviderType2 = new ExtendedLocationProviderParameters.Builder().deviceLocationProviderType(deviceLocationProviderType);
            if (deviceLocationProviderType == DeviceLocationProviderType.ANDROID) {
                deviceLocationProviderType2.locationProviderName(StubApp.getString2(540));
            }
            ExtendedLocationProviderParameters build = deviceLocationProviderType2.build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …                 .build()");
            createError = orCreate.getDeviceLocationProvider(build, locationOptions.f4274a);
        } else {
            createError = ExpectedFactory.createError(new LocationError(LocationErrorCode.INVALID_ARGUMENT, StubApp.getString2(542)));
            Intrinsics.checkNotNullExpressionValue(createError, "createError(\n           … ),\n                    )");
        }
        if (createError.isError()) {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(543));
            LocationError error = createError.getError();
            Intrinsics.checkNotNull(error);
            sb2.append(error.getCode());
            sb2.append(StubApp.getString2(544));
            LocationError error2 = createError.getError();
            Intrinsics.checkNotNull(error2);
            sb2.append(error2.getMessage());
            sb2.append('.');
            D9.l.h(StubApp.getString2(545), sb2.toString());
        }
        this.f613d = createError.getValue();
    }

    public static final void a(final h hVar) {
        SpeechRecognizer speechRecognizer = (SpeechRecognizer) hVar.f616g;
        if (speechRecognizer != null) {
            final int i3 = 0;
            speechRecognizer.recognized.addEventListener(new EventHandler(hVar) { // from class: W2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ B3.h f8083b;

                {
                    this.f8083b = hVar;
                }

                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    switch (i3) {
                        case 0:
                            SpeechRecognitionEventArgs speechRecognitionEventArgs = (SpeechRecognitionEventArgs) obj2;
                            B3.h hVar2 = this.f8083b;
                            hVar2.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6854));
                            c cVar = (c) hVar2.f617h;
                            if (cVar != null) {
                                String text = speechRecognitionEventArgs.getResult().getText();
                                if (text == null) {
                                    text = "";
                                }
                                String reason = speechRecognitionEventArgs.getResult().getReason().toString();
                                Intrinsics.checkNotNullParameter(text, "text");
                                Intrinsics.checkNotNullParameter(reason, "reason");
                                String string2 = StubApp.getString2(6855);
                                String string22 = StubApp.getString2(381);
                                R2.c.b(string22, string2);
                                R2.c.b(string22, StubApp.getString2(6856) + text + StubApp.getString2(6852) + reason + StubApp.getString2(620));
                                TranscribeEventOuterClass.TranscribeResult transcribeResult = (TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setText(text).setReason(reason).setSessionId(cVar.f8076b).setIsFinal(true).setId(cVar.f8080f).m5build();
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.recognized).setResult(transcribeResult).m5build();
                                R2.c.b(string22, StubApp.getString2(6857) + cVar.f8080f + StubApp.getString2(6858) + transcribeResult.getText());
                                Intrinsics.checkNotNull(transcribeEvent);
                                cVar.b(transcribeEvent);
                                long j = cVar.f8080f + 1;
                                cVar.f8080f = j;
                                R2.c.b(string22, StubApp.getString2(6859) + j);
                                break;
                            }
                            break;
                        case 1:
                            SpeechRecognitionEventArgs speechRecognitionEventArgs2 = (SpeechRecognitionEventArgs) obj2;
                            B3.h hVar3 = this.f8083b;
                            hVar3.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6849));
                            c cVar2 = (c) hVar3.f617h;
                            if (cVar2 != null) {
                                String text2 = speechRecognitionEventArgs2.getResult().getText();
                                if (text2 == null) {
                                    text2 = "";
                                }
                                String reason2 = speechRecognitionEventArgs2.getResult().getReason().toString();
                                Intrinsics.checkNotNullParameter(text2, "text");
                                Intrinsics.checkNotNullParameter(reason2, "reason");
                                String string23 = StubApp.getString2(6850);
                                String string24 = StubApp.getString2(381);
                                R2.c.b(string24, string23);
                                R2.c.b(string24, StubApp.getString2(6851) + text2 + StubApp.getString2(6852) + reason2 + StubApp.getString2(620));
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent2 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.recognizing).setResult((TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setText(text2).setReason(reason2).setSessionId(cVar2.f8076b).setIsFinal(false).setId(cVar2.f8080f).m5build()).m5build();
                                R2.c.b(string24, StubApp.getString2(6853).concat(text2));
                                Intrinsics.checkNotNull(transcribeEvent2);
                                cVar2.b(transcribeEvent2);
                                break;
                            }
                            break;
                        case 2:
                            B3.h hVar4 = this.f8083b;
                            hVar4.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6846));
                            c cVar3 = (c) hVar4.f617h;
                            if (cVar3 != null) {
                                String string25 = StubApp.getString2(6847);
                                String string26 = StubApp.getString2(381);
                                R2.c.b(string26, string25);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str = cVar3.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent3 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.sessionStarted).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder.setSessionId(str).m5build()).m5build();
                                R2.c.b(string26, StubApp.getString2(6848) + str);
                                Intrinsics.checkNotNull(transcribeEvent3);
                                cVar3.b(transcribeEvent3);
                                break;
                            }
                            break;
                        case 3:
                            B3.h hVar5 = this.f8083b;
                            hVar5.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6843));
                            c cVar4 = (c) hVar5.f617h;
                            if (cVar4 != null) {
                                String string27 = StubApp.getString2(6844);
                                String string28 = StubApp.getString2(381);
                                R2.c.b(string28, string27);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder2 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str2 = cVar4.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent4 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.sessionStopped).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder2.setSessionId(str2).m5build()).m5build();
                                R2.c.b(string28, StubApp.getString2(6845) + str2);
                                Intrinsics.checkNotNull(transcribeEvent4);
                                cVar4.b(transcribeEvent4);
                                break;
                            }
                            break;
                        case 4:
                            B3.h hVar6 = this.f8083b;
                            hVar6.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6840));
                            c cVar5 = (c) hVar6.f617h;
                            if (cVar5 != null) {
                                String string29 = StubApp.getString2(6841);
                                String string210 = StubApp.getString2(381);
                                R2.c.b(string210, string29);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder3 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str3 = cVar5.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent5 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.speechStartDetected).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder3.setSessionId(str3).m5build()).m5build();
                                R2.c.b(string210, StubApp.getString2(6842) + str3);
                                Intrinsics.checkNotNull(transcribeEvent5);
                                cVar5.b(transcribeEvent5);
                                break;
                            }
                            break;
                        case 5:
                            B3.h hVar7 = this.f8083b;
                            hVar7.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6837));
                            c cVar6 = (c) hVar7.f617h;
                            if (cVar6 != null) {
                                String string211 = StubApp.getString2(6838);
                                String string212 = StubApp.getString2(381);
                                R2.c.b(string212, string211);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder4 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str4 = cVar6.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent6 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.speechEndDetected).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder4.setSessionId(str4).m5build()).m5build();
                                R2.c.b(string212, StubApp.getString2(6839) + str4);
                                Intrinsics.checkNotNull(transcribeEvent6);
                                cVar6.b(transcribeEvent6);
                                break;
                            }
                            break;
                        default:
                            SpeechRecognitionCanceledEventArgs speechRecognitionCanceledEventArgs = (SpeechRecognitionCanceledEventArgs) obj2;
                            B3.h hVar8 = this.f8083b;
                            hVar8.getClass();
                            R2.c.f(StubApp.getString2(546), StubApp.getString2(6834));
                            c cVar7 = (c) hVar8.f617h;
                            if (cVar7 != null) {
                                String reason3 = speechRecognitionCanceledEventArgs.getReason().toString();
                                Intrinsics.checkNotNullParameter(reason3, "reason");
                                String string213 = StubApp.getString2(6835);
                                String string214 = StubApp.getString2(381);
                                R2.c.b(string214, string213);
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent7 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.canceled).setResult((TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setSessionId(cVar7.f8076b).setReason(reason3).m5build()).m5build();
                                R2.c.b(string214, StubApp.getString2(6836) + reason3);
                                Intrinsics.checkNotNull(transcribeEvent7);
                                cVar7.b(transcribeEvent7);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            speechRecognizer.recognizing.addEventListener(new EventHandler(hVar) { // from class: W2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ B3.h f8083b;

                {
                    this.f8083b = hVar;
                }

                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    switch (i10) {
                        case 0:
                            SpeechRecognitionEventArgs speechRecognitionEventArgs = (SpeechRecognitionEventArgs) obj2;
                            B3.h hVar2 = this.f8083b;
                            hVar2.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6854));
                            c cVar = (c) hVar2.f617h;
                            if (cVar != null) {
                                String text = speechRecognitionEventArgs.getResult().getText();
                                if (text == null) {
                                    text = "";
                                }
                                String reason = speechRecognitionEventArgs.getResult().getReason().toString();
                                Intrinsics.checkNotNullParameter(text, "text");
                                Intrinsics.checkNotNullParameter(reason, "reason");
                                String string2 = StubApp.getString2(6855);
                                String string22 = StubApp.getString2(381);
                                R2.c.b(string22, string2);
                                R2.c.b(string22, StubApp.getString2(6856) + text + StubApp.getString2(6852) + reason + StubApp.getString2(620));
                                TranscribeEventOuterClass.TranscribeResult transcribeResult = (TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setText(text).setReason(reason).setSessionId(cVar.f8076b).setIsFinal(true).setId(cVar.f8080f).m5build();
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.recognized).setResult(transcribeResult).m5build();
                                R2.c.b(string22, StubApp.getString2(6857) + cVar.f8080f + StubApp.getString2(6858) + transcribeResult.getText());
                                Intrinsics.checkNotNull(transcribeEvent);
                                cVar.b(transcribeEvent);
                                long j = cVar.f8080f + 1;
                                cVar.f8080f = j;
                                R2.c.b(string22, StubApp.getString2(6859) + j);
                                break;
                            }
                            break;
                        case 1:
                            SpeechRecognitionEventArgs speechRecognitionEventArgs2 = (SpeechRecognitionEventArgs) obj2;
                            B3.h hVar3 = this.f8083b;
                            hVar3.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6849));
                            c cVar2 = (c) hVar3.f617h;
                            if (cVar2 != null) {
                                String text2 = speechRecognitionEventArgs2.getResult().getText();
                                if (text2 == null) {
                                    text2 = "";
                                }
                                String reason2 = speechRecognitionEventArgs2.getResult().getReason().toString();
                                Intrinsics.checkNotNullParameter(text2, "text");
                                Intrinsics.checkNotNullParameter(reason2, "reason");
                                String string23 = StubApp.getString2(6850);
                                String string24 = StubApp.getString2(381);
                                R2.c.b(string24, string23);
                                R2.c.b(string24, StubApp.getString2(6851) + text2 + StubApp.getString2(6852) + reason2 + StubApp.getString2(620));
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent2 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.recognizing).setResult((TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setText(text2).setReason(reason2).setSessionId(cVar2.f8076b).setIsFinal(false).setId(cVar2.f8080f).m5build()).m5build();
                                R2.c.b(string24, StubApp.getString2(6853).concat(text2));
                                Intrinsics.checkNotNull(transcribeEvent2);
                                cVar2.b(transcribeEvent2);
                                break;
                            }
                            break;
                        case 2:
                            B3.h hVar4 = this.f8083b;
                            hVar4.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6846));
                            c cVar3 = (c) hVar4.f617h;
                            if (cVar3 != null) {
                                String string25 = StubApp.getString2(6847);
                                String string26 = StubApp.getString2(381);
                                R2.c.b(string26, string25);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str = cVar3.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent3 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.sessionStarted).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder.setSessionId(str).m5build()).m5build();
                                R2.c.b(string26, StubApp.getString2(6848) + str);
                                Intrinsics.checkNotNull(transcribeEvent3);
                                cVar3.b(transcribeEvent3);
                                break;
                            }
                            break;
                        case 3:
                            B3.h hVar5 = this.f8083b;
                            hVar5.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6843));
                            c cVar4 = (c) hVar5.f617h;
                            if (cVar4 != null) {
                                String string27 = StubApp.getString2(6844);
                                String string28 = StubApp.getString2(381);
                                R2.c.b(string28, string27);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder2 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str2 = cVar4.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent4 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.sessionStopped).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder2.setSessionId(str2).m5build()).m5build();
                                R2.c.b(string28, StubApp.getString2(6845) + str2);
                                Intrinsics.checkNotNull(transcribeEvent4);
                                cVar4.b(transcribeEvent4);
                                break;
                            }
                            break;
                        case 4:
                            B3.h hVar6 = this.f8083b;
                            hVar6.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6840));
                            c cVar5 = (c) hVar6.f617h;
                            if (cVar5 != null) {
                                String string29 = StubApp.getString2(6841);
                                String string210 = StubApp.getString2(381);
                                R2.c.b(string210, string29);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder3 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str3 = cVar5.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent5 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.speechStartDetected).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder3.setSessionId(str3).m5build()).m5build();
                                R2.c.b(string210, StubApp.getString2(6842) + str3);
                                Intrinsics.checkNotNull(transcribeEvent5);
                                cVar5.b(transcribeEvent5);
                                break;
                            }
                            break;
                        case 5:
                            B3.h hVar7 = this.f8083b;
                            hVar7.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6837));
                            c cVar6 = (c) hVar7.f617h;
                            if (cVar6 != null) {
                                String string211 = StubApp.getString2(6838);
                                String string212 = StubApp.getString2(381);
                                R2.c.b(string212, string211);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder4 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str4 = cVar6.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent6 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.speechEndDetected).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder4.setSessionId(str4).m5build()).m5build();
                                R2.c.b(string212, StubApp.getString2(6839) + str4);
                                Intrinsics.checkNotNull(transcribeEvent6);
                                cVar6.b(transcribeEvent6);
                                break;
                            }
                            break;
                        default:
                            SpeechRecognitionCanceledEventArgs speechRecognitionCanceledEventArgs = (SpeechRecognitionCanceledEventArgs) obj2;
                            B3.h hVar8 = this.f8083b;
                            hVar8.getClass();
                            R2.c.f(StubApp.getString2(546), StubApp.getString2(6834));
                            c cVar7 = (c) hVar8.f617h;
                            if (cVar7 != null) {
                                String reason3 = speechRecognitionCanceledEventArgs.getReason().toString();
                                Intrinsics.checkNotNullParameter(reason3, "reason");
                                String string213 = StubApp.getString2(6835);
                                String string214 = StubApp.getString2(381);
                                R2.c.b(string214, string213);
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent7 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.canceled).setResult((TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setSessionId(cVar7.f8076b).setReason(reason3).m5build()).m5build();
                                R2.c.b(string214, StubApp.getString2(6836) + reason3);
                                Intrinsics.checkNotNull(transcribeEvent7);
                                cVar7.b(transcribeEvent7);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i11 = 2;
            speechRecognizer.sessionStarted.addEventListener(new EventHandler(hVar) { // from class: W2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ B3.h f8083b;

                {
                    this.f8083b = hVar;
                }

                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    switch (i11) {
                        case 0:
                            SpeechRecognitionEventArgs speechRecognitionEventArgs = (SpeechRecognitionEventArgs) obj2;
                            B3.h hVar2 = this.f8083b;
                            hVar2.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6854));
                            c cVar = (c) hVar2.f617h;
                            if (cVar != null) {
                                String text = speechRecognitionEventArgs.getResult().getText();
                                if (text == null) {
                                    text = "";
                                }
                                String reason = speechRecognitionEventArgs.getResult().getReason().toString();
                                Intrinsics.checkNotNullParameter(text, "text");
                                Intrinsics.checkNotNullParameter(reason, "reason");
                                String string2 = StubApp.getString2(6855);
                                String string22 = StubApp.getString2(381);
                                R2.c.b(string22, string2);
                                R2.c.b(string22, StubApp.getString2(6856) + text + StubApp.getString2(6852) + reason + StubApp.getString2(620));
                                TranscribeEventOuterClass.TranscribeResult transcribeResult = (TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setText(text).setReason(reason).setSessionId(cVar.f8076b).setIsFinal(true).setId(cVar.f8080f).m5build();
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.recognized).setResult(transcribeResult).m5build();
                                R2.c.b(string22, StubApp.getString2(6857) + cVar.f8080f + StubApp.getString2(6858) + transcribeResult.getText());
                                Intrinsics.checkNotNull(transcribeEvent);
                                cVar.b(transcribeEvent);
                                long j = cVar.f8080f + 1;
                                cVar.f8080f = j;
                                R2.c.b(string22, StubApp.getString2(6859) + j);
                                break;
                            }
                            break;
                        case 1:
                            SpeechRecognitionEventArgs speechRecognitionEventArgs2 = (SpeechRecognitionEventArgs) obj2;
                            B3.h hVar3 = this.f8083b;
                            hVar3.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6849));
                            c cVar2 = (c) hVar3.f617h;
                            if (cVar2 != null) {
                                String text2 = speechRecognitionEventArgs2.getResult().getText();
                                if (text2 == null) {
                                    text2 = "";
                                }
                                String reason2 = speechRecognitionEventArgs2.getResult().getReason().toString();
                                Intrinsics.checkNotNullParameter(text2, "text");
                                Intrinsics.checkNotNullParameter(reason2, "reason");
                                String string23 = StubApp.getString2(6850);
                                String string24 = StubApp.getString2(381);
                                R2.c.b(string24, string23);
                                R2.c.b(string24, StubApp.getString2(6851) + text2 + StubApp.getString2(6852) + reason2 + StubApp.getString2(620));
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent2 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.recognizing).setResult((TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setText(text2).setReason(reason2).setSessionId(cVar2.f8076b).setIsFinal(false).setId(cVar2.f8080f).m5build()).m5build();
                                R2.c.b(string24, StubApp.getString2(6853).concat(text2));
                                Intrinsics.checkNotNull(transcribeEvent2);
                                cVar2.b(transcribeEvent2);
                                break;
                            }
                            break;
                        case 2:
                            B3.h hVar4 = this.f8083b;
                            hVar4.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6846));
                            c cVar3 = (c) hVar4.f617h;
                            if (cVar3 != null) {
                                String string25 = StubApp.getString2(6847);
                                String string26 = StubApp.getString2(381);
                                R2.c.b(string26, string25);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str = cVar3.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent3 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.sessionStarted).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder.setSessionId(str).m5build()).m5build();
                                R2.c.b(string26, StubApp.getString2(6848) + str);
                                Intrinsics.checkNotNull(transcribeEvent3);
                                cVar3.b(transcribeEvent3);
                                break;
                            }
                            break;
                        case 3:
                            B3.h hVar5 = this.f8083b;
                            hVar5.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6843));
                            c cVar4 = (c) hVar5.f617h;
                            if (cVar4 != null) {
                                String string27 = StubApp.getString2(6844);
                                String string28 = StubApp.getString2(381);
                                R2.c.b(string28, string27);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder2 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str2 = cVar4.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent4 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.sessionStopped).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder2.setSessionId(str2).m5build()).m5build();
                                R2.c.b(string28, StubApp.getString2(6845) + str2);
                                Intrinsics.checkNotNull(transcribeEvent4);
                                cVar4.b(transcribeEvent4);
                                break;
                            }
                            break;
                        case 4:
                            B3.h hVar6 = this.f8083b;
                            hVar6.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6840));
                            c cVar5 = (c) hVar6.f617h;
                            if (cVar5 != null) {
                                String string29 = StubApp.getString2(6841);
                                String string210 = StubApp.getString2(381);
                                R2.c.b(string210, string29);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder3 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str3 = cVar5.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent5 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.speechStartDetected).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder3.setSessionId(str3).m5build()).m5build();
                                R2.c.b(string210, StubApp.getString2(6842) + str3);
                                Intrinsics.checkNotNull(transcribeEvent5);
                                cVar5.b(transcribeEvent5);
                                break;
                            }
                            break;
                        case 5:
                            B3.h hVar7 = this.f8083b;
                            hVar7.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6837));
                            c cVar6 = (c) hVar7.f617h;
                            if (cVar6 != null) {
                                String string211 = StubApp.getString2(6838);
                                String string212 = StubApp.getString2(381);
                                R2.c.b(string212, string211);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder4 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str4 = cVar6.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent6 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.speechEndDetected).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder4.setSessionId(str4).m5build()).m5build();
                                R2.c.b(string212, StubApp.getString2(6839) + str4);
                                Intrinsics.checkNotNull(transcribeEvent6);
                                cVar6.b(transcribeEvent6);
                                break;
                            }
                            break;
                        default:
                            SpeechRecognitionCanceledEventArgs speechRecognitionCanceledEventArgs = (SpeechRecognitionCanceledEventArgs) obj2;
                            B3.h hVar8 = this.f8083b;
                            hVar8.getClass();
                            R2.c.f(StubApp.getString2(546), StubApp.getString2(6834));
                            c cVar7 = (c) hVar8.f617h;
                            if (cVar7 != null) {
                                String reason3 = speechRecognitionCanceledEventArgs.getReason().toString();
                                Intrinsics.checkNotNullParameter(reason3, "reason");
                                String string213 = StubApp.getString2(6835);
                                String string214 = StubApp.getString2(381);
                                R2.c.b(string214, string213);
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent7 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.canceled).setResult((TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setSessionId(cVar7.f8076b).setReason(reason3).m5build()).m5build();
                                R2.c.b(string214, StubApp.getString2(6836) + reason3);
                                Intrinsics.checkNotNull(transcribeEvent7);
                                cVar7.b(transcribeEvent7);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i12 = 3;
            speechRecognizer.sessionStopped.addEventListener(new EventHandler(hVar) { // from class: W2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ B3.h f8083b;

                {
                    this.f8083b = hVar;
                }

                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    switch (i12) {
                        case 0:
                            SpeechRecognitionEventArgs speechRecognitionEventArgs = (SpeechRecognitionEventArgs) obj2;
                            B3.h hVar2 = this.f8083b;
                            hVar2.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6854));
                            c cVar = (c) hVar2.f617h;
                            if (cVar != null) {
                                String text = speechRecognitionEventArgs.getResult().getText();
                                if (text == null) {
                                    text = "";
                                }
                                String reason = speechRecognitionEventArgs.getResult().getReason().toString();
                                Intrinsics.checkNotNullParameter(text, "text");
                                Intrinsics.checkNotNullParameter(reason, "reason");
                                String string2 = StubApp.getString2(6855);
                                String string22 = StubApp.getString2(381);
                                R2.c.b(string22, string2);
                                R2.c.b(string22, StubApp.getString2(6856) + text + StubApp.getString2(6852) + reason + StubApp.getString2(620));
                                TranscribeEventOuterClass.TranscribeResult transcribeResult = (TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setText(text).setReason(reason).setSessionId(cVar.f8076b).setIsFinal(true).setId(cVar.f8080f).m5build();
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.recognized).setResult(transcribeResult).m5build();
                                R2.c.b(string22, StubApp.getString2(6857) + cVar.f8080f + StubApp.getString2(6858) + transcribeResult.getText());
                                Intrinsics.checkNotNull(transcribeEvent);
                                cVar.b(transcribeEvent);
                                long j = cVar.f8080f + 1;
                                cVar.f8080f = j;
                                R2.c.b(string22, StubApp.getString2(6859) + j);
                                break;
                            }
                            break;
                        case 1:
                            SpeechRecognitionEventArgs speechRecognitionEventArgs2 = (SpeechRecognitionEventArgs) obj2;
                            B3.h hVar3 = this.f8083b;
                            hVar3.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6849));
                            c cVar2 = (c) hVar3.f617h;
                            if (cVar2 != null) {
                                String text2 = speechRecognitionEventArgs2.getResult().getText();
                                if (text2 == null) {
                                    text2 = "";
                                }
                                String reason2 = speechRecognitionEventArgs2.getResult().getReason().toString();
                                Intrinsics.checkNotNullParameter(text2, "text");
                                Intrinsics.checkNotNullParameter(reason2, "reason");
                                String string23 = StubApp.getString2(6850);
                                String string24 = StubApp.getString2(381);
                                R2.c.b(string24, string23);
                                R2.c.b(string24, StubApp.getString2(6851) + text2 + StubApp.getString2(6852) + reason2 + StubApp.getString2(620));
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent2 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.recognizing).setResult((TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setText(text2).setReason(reason2).setSessionId(cVar2.f8076b).setIsFinal(false).setId(cVar2.f8080f).m5build()).m5build();
                                R2.c.b(string24, StubApp.getString2(6853).concat(text2));
                                Intrinsics.checkNotNull(transcribeEvent2);
                                cVar2.b(transcribeEvent2);
                                break;
                            }
                            break;
                        case 2:
                            B3.h hVar4 = this.f8083b;
                            hVar4.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6846));
                            c cVar3 = (c) hVar4.f617h;
                            if (cVar3 != null) {
                                String string25 = StubApp.getString2(6847);
                                String string26 = StubApp.getString2(381);
                                R2.c.b(string26, string25);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str = cVar3.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent3 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.sessionStarted).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder.setSessionId(str).m5build()).m5build();
                                R2.c.b(string26, StubApp.getString2(6848) + str);
                                Intrinsics.checkNotNull(transcribeEvent3);
                                cVar3.b(transcribeEvent3);
                                break;
                            }
                            break;
                        case 3:
                            B3.h hVar5 = this.f8083b;
                            hVar5.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6843));
                            c cVar4 = (c) hVar5.f617h;
                            if (cVar4 != null) {
                                String string27 = StubApp.getString2(6844);
                                String string28 = StubApp.getString2(381);
                                R2.c.b(string28, string27);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder2 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str2 = cVar4.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent4 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.sessionStopped).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder2.setSessionId(str2).m5build()).m5build();
                                R2.c.b(string28, StubApp.getString2(6845) + str2);
                                Intrinsics.checkNotNull(transcribeEvent4);
                                cVar4.b(transcribeEvent4);
                                break;
                            }
                            break;
                        case 4:
                            B3.h hVar6 = this.f8083b;
                            hVar6.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6840));
                            c cVar5 = (c) hVar6.f617h;
                            if (cVar5 != null) {
                                String string29 = StubApp.getString2(6841);
                                String string210 = StubApp.getString2(381);
                                R2.c.b(string210, string29);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder3 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str3 = cVar5.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent5 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.speechStartDetected).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder3.setSessionId(str3).m5build()).m5build();
                                R2.c.b(string210, StubApp.getString2(6842) + str3);
                                Intrinsics.checkNotNull(transcribeEvent5);
                                cVar5.b(transcribeEvent5);
                                break;
                            }
                            break;
                        case 5:
                            B3.h hVar7 = this.f8083b;
                            hVar7.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6837));
                            c cVar6 = (c) hVar7.f617h;
                            if (cVar6 != null) {
                                String string211 = StubApp.getString2(6838);
                                String string212 = StubApp.getString2(381);
                                R2.c.b(string212, string211);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder4 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str4 = cVar6.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent6 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.speechEndDetected).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder4.setSessionId(str4).m5build()).m5build();
                                R2.c.b(string212, StubApp.getString2(6839) + str4);
                                Intrinsics.checkNotNull(transcribeEvent6);
                                cVar6.b(transcribeEvent6);
                                break;
                            }
                            break;
                        default:
                            SpeechRecognitionCanceledEventArgs speechRecognitionCanceledEventArgs = (SpeechRecognitionCanceledEventArgs) obj2;
                            B3.h hVar8 = this.f8083b;
                            hVar8.getClass();
                            R2.c.f(StubApp.getString2(546), StubApp.getString2(6834));
                            c cVar7 = (c) hVar8.f617h;
                            if (cVar7 != null) {
                                String reason3 = speechRecognitionCanceledEventArgs.getReason().toString();
                                Intrinsics.checkNotNullParameter(reason3, "reason");
                                String string213 = StubApp.getString2(6835);
                                String string214 = StubApp.getString2(381);
                                R2.c.b(string214, string213);
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent7 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.canceled).setResult((TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setSessionId(cVar7.f8076b).setReason(reason3).m5build()).m5build();
                                R2.c.b(string214, StubApp.getString2(6836) + reason3);
                                Intrinsics.checkNotNull(transcribeEvent7);
                                cVar7.b(transcribeEvent7);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i13 = 4;
            speechRecognizer.speechStartDetected.addEventListener(new EventHandler(hVar) { // from class: W2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ B3.h f8083b;

                {
                    this.f8083b = hVar;
                }

                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    switch (i13) {
                        case 0:
                            SpeechRecognitionEventArgs speechRecognitionEventArgs = (SpeechRecognitionEventArgs) obj2;
                            B3.h hVar2 = this.f8083b;
                            hVar2.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6854));
                            c cVar = (c) hVar2.f617h;
                            if (cVar != null) {
                                String text = speechRecognitionEventArgs.getResult().getText();
                                if (text == null) {
                                    text = "";
                                }
                                String reason = speechRecognitionEventArgs.getResult().getReason().toString();
                                Intrinsics.checkNotNullParameter(text, "text");
                                Intrinsics.checkNotNullParameter(reason, "reason");
                                String string2 = StubApp.getString2(6855);
                                String string22 = StubApp.getString2(381);
                                R2.c.b(string22, string2);
                                R2.c.b(string22, StubApp.getString2(6856) + text + StubApp.getString2(6852) + reason + StubApp.getString2(620));
                                TranscribeEventOuterClass.TranscribeResult transcribeResult = (TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setText(text).setReason(reason).setSessionId(cVar.f8076b).setIsFinal(true).setId(cVar.f8080f).m5build();
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.recognized).setResult(transcribeResult).m5build();
                                R2.c.b(string22, StubApp.getString2(6857) + cVar.f8080f + StubApp.getString2(6858) + transcribeResult.getText());
                                Intrinsics.checkNotNull(transcribeEvent);
                                cVar.b(transcribeEvent);
                                long j = cVar.f8080f + 1;
                                cVar.f8080f = j;
                                R2.c.b(string22, StubApp.getString2(6859) + j);
                                break;
                            }
                            break;
                        case 1:
                            SpeechRecognitionEventArgs speechRecognitionEventArgs2 = (SpeechRecognitionEventArgs) obj2;
                            B3.h hVar3 = this.f8083b;
                            hVar3.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6849));
                            c cVar2 = (c) hVar3.f617h;
                            if (cVar2 != null) {
                                String text2 = speechRecognitionEventArgs2.getResult().getText();
                                if (text2 == null) {
                                    text2 = "";
                                }
                                String reason2 = speechRecognitionEventArgs2.getResult().getReason().toString();
                                Intrinsics.checkNotNullParameter(text2, "text");
                                Intrinsics.checkNotNullParameter(reason2, "reason");
                                String string23 = StubApp.getString2(6850);
                                String string24 = StubApp.getString2(381);
                                R2.c.b(string24, string23);
                                R2.c.b(string24, StubApp.getString2(6851) + text2 + StubApp.getString2(6852) + reason2 + StubApp.getString2(620));
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent2 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.recognizing).setResult((TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setText(text2).setReason(reason2).setSessionId(cVar2.f8076b).setIsFinal(false).setId(cVar2.f8080f).m5build()).m5build();
                                R2.c.b(string24, StubApp.getString2(6853).concat(text2));
                                Intrinsics.checkNotNull(transcribeEvent2);
                                cVar2.b(transcribeEvent2);
                                break;
                            }
                            break;
                        case 2:
                            B3.h hVar4 = this.f8083b;
                            hVar4.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6846));
                            c cVar3 = (c) hVar4.f617h;
                            if (cVar3 != null) {
                                String string25 = StubApp.getString2(6847);
                                String string26 = StubApp.getString2(381);
                                R2.c.b(string26, string25);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str = cVar3.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent3 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.sessionStarted).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder.setSessionId(str).m5build()).m5build();
                                R2.c.b(string26, StubApp.getString2(6848) + str);
                                Intrinsics.checkNotNull(transcribeEvent3);
                                cVar3.b(transcribeEvent3);
                                break;
                            }
                            break;
                        case 3:
                            B3.h hVar5 = this.f8083b;
                            hVar5.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6843));
                            c cVar4 = (c) hVar5.f617h;
                            if (cVar4 != null) {
                                String string27 = StubApp.getString2(6844);
                                String string28 = StubApp.getString2(381);
                                R2.c.b(string28, string27);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder2 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str2 = cVar4.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent4 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.sessionStopped).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder2.setSessionId(str2).m5build()).m5build();
                                R2.c.b(string28, StubApp.getString2(6845) + str2);
                                Intrinsics.checkNotNull(transcribeEvent4);
                                cVar4.b(transcribeEvent4);
                                break;
                            }
                            break;
                        case 4:
                            B3.h hVar6 = this.f8083b;
                            hVar6.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6840));
                            c cVar5 = (c) hVar6.f617h;
                            if (cVar5 != null) {
                                String string29 = StubApp.getString2(6841);
                                String string210 = StubApp.getString2(381);
                                R2.c.b(string210, string29);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder3 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str3 = cVar5.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent5 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.speechStartDetected).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder3.setSessionId(str3).m5build()).m5build();
                                R2.c.b(string210, StubApp.getString2(6842) + str3);
                                Intrinsics.checkNotNull(transcribeEvent5);
                                cVar5.b(transcribeEvent5);
                                break;
                            }
                            break;
                        case 5:
                            B3.h hVar7 = this.f8083b;
                            hVar7.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6837));
                            c cVar6 = (c) hVar7.f617h;
                            if (cVar6 != null) {
                                String string211 = StubApp.getString2(6838);
                                String string212 = StubApp.getString2(381);
                                R2.c.b(string212, string211);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder4 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str4 = cVar6.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent6 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.speechEndDetected).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder4.setSessionId(str4).m5build()).m5build();
                                R2.c.b(string212, StubApp.getString2(6839) + str4);
                                Intrinsics.checkNotNull(transcribeEvent6);
                                cVar6.b(transcribeEvent6);
                                break;
                            }
                            break;
                        default:
                            SpeechRecognitionCanceledEventArgs speechRecognitionCanceledEventArgs = (SpeechRecognitionCanceledEventArgs) obj2;
                            B3.h hVar8 = this.f8083b;
                            hVar8.getClass();
                            R2.c.f(StubApp.getString2(546), StubApp.getString2(6834));
                            c cVar7 = (c) hVar8.f617h;
                            if (cVar7 != null) {
                                String reason3 = speechRecognitionCanceledEventArgs.getReason().toString();
                                Intrinsics.checkNotNullParameter(reason3, "reason");
                                String string213 = StubApp.getString2(6835);
                                String string214 = StubApp.getString2(381);
                                R2.c.b(string214, string213);
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent7 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.canceled).setResult((TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setSessionId(cVar7.f8076b).setReason(reason3).m5build()).m5build();
                                R2.c.b(string214, StubApp.getString2(6836) + reason3);
                                Intrinsics.checkNotNull(transcribeEvent7);
                                cVar7.b(transcribeEvent7);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i14 = 5;
            speechRecognizer.speechEndDetected.addEventListener(new EventHandler(hVar) { // from class: W2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ B3.h f8083b;

                {
                    this.f8083b = hVar;
                }

                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    switch (i14) {
                        case 0:
                            SpeechRecognitionEventArgs speechRecognitionEventArgs = (SpeechRecognitionEventArgs) obj2;
                            B3.h hVar2 = this.f8083b;
                            hVar2.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6854));
                            c cVar = (c) hVar2.f617h;
                            if (cVar != null) {
                                String text = speechRecognitionEventArgs.getResult().getText();
                                if (text == null) {
                                    text = "";
                                }
                                String reason = speechRecognitionEventArgs.getResult().getReason().toString();
                                Intrinsics.checkNotNullParameter(text, "text");
                                Intrinsics.checkNotNullParameter(reason, "reason");
                                String string2 = StubApp.getString2(6855);
                                String string22 = StubApp.getString2(381);
                                R2.c.b(string22, string2);
                                R2.c.b(string22, StubApp.getString2(6856) + text + StubApp.getString2(6852) + reason + StubApp.getString2(620));
                                TranscribeEventOuterClass.TranscribeResult transcribeResult = (TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setText(text).setReason(reason).setSessionId(cVar.f8076b).setIsFinal(true).setId(cVar.f8080f).m5build();
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.recognized).setResult(transcribeResult).m5build();
                                R2.c.b(string22, StubApp.getString2(6857) + cVar.f8080f + StubApp.getString2(6858) + transcribeResult.getText());
                                Intrinsics.checkNotNull(transcribeEvent);
                                cVar.b(transcribeEvent);
                                long j = cVar.f8080f + 1;
                                cVar.f8080f = j;
                                R2.c.b(string22, StubApp.getString2(6859) + j);
                                break;
                            }
                            break;
                        case 1:
                            SpeechRecognitionEventArgs speechRecognitionEventArgs2 = (SpeechRecognitionEventArgs) obj2;
                            B3.h hVar3 = this.f8083b;
                            hVar3.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6849));
                            c cVar2 = (c) hVar3.f617h;
                            if (cVar2 != null) {
                                String text2 = speechRecognitionEventArgs2.getResult().getText();
                                if (text2 == null) {
                                    text2 = "";
                                }
                                String reason2 = speechRecognitionEventArgs2.getResult().getReason().toString();
                                Intrinsics.checkNotNullParameter(text2, "text");
                                Intrinsics.checkNotNullParameter(reason2, "reason");
                                String string23 = StubApp.getString2(6850);
                                String string24 = StubApp.getString2(381);
                                R2.c.b(string24, string23);
                                R2.c.b(string24, StubApp.getString2(6851) + text2 + StubApp.getString2(6852) + reason2 + StubApp.getString2(620));
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent2 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.recognizing).setResult((TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setText(text2).setReason(reason2).setSessionId(cVar2.f8076b).setIsFinal(false).setId(cVar2.f8080f).m5build()).m5build();
                                R2.c.b(string24, StubApp.getString2(6853).concat(text2));
                                Intrinsics.checkNotNull(transcribeEvent2);
                                cVar2.b(transcribeEvent2);
                                break;
                            }
                            break;
                        case 2:
                            B3.h hVar4 = this.f8083b;
                            hVar4.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6846));
                            c cVar3 = (c) hVar4.f617h;
                            if (cVar3 != null) {
                                String string25 = StubApp.getString2(6847);
                                String string26 = StubApp.getString2(381);
                                R2.c.b(string26, string25);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str = cVar3.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent3 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.sessionStarted).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder.setSessionId(str).m5build()).m5build();
                                R2.c.b(string26, StubApp.getString2(6848) + str);
                                Intrinsics.checkNotNull(transcribeEvent3);
                                cVar3.b(transcribeEvent3);
                                break;
                            }
                            break;
                        case 3:
                            B3.h hVar5 = this.f8083b;
                            hVar5.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6843));
                            c cVar4 = (c) hVar5.f617h;
                            if (cVar4 != null) {
                                String string27 = StubApp.getString2(6844);
                                String string28 = StubApp.getString2(381);
                                R2.c.b(string28, string27);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder2 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str2 = cVar4.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent4 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.sessionStopped).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder2.setSessionId(str2).m5build()).m5build();
                                R2.c.b(string28, StubApp.getString2(6845) + str2);
                                Intrinsics.checkNotNull(transcribeEvent4);
                                cVar4.b(transcribeEvent4);
                                break;
                            }
                            break;
                        case 4:
                            B3.h hVar6 = this.f8083b;
                            hVar6.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6840));
                            c cVar5 = (c) hVar6.f617h;
                            if (cVar5 != null) {
                                String string29 = StubApp.getString2(6841);
                                String string210 = StubApp.getString2(381);
                                R2.c.b(string210, string29);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder3 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str3 = cVar5.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent5 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.speechStartDetected).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder3.setSessionId(str3).m5build()).m5build();
                                R2.c.b(string210, StubApp.getString2(6842) + str3);
                                Intrinsics.checkNotNull(transcribeEvent5);
                                cVar5.b(transcribeEvent5);
                                break;
                            }
                            break;
                        case 5:
                            B3.h hVar7 = this.f8083b;
                            hVar7.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6837));
                            c cVar6 = (c) hVar7.f617h;
                            if (cVar6 != null) {
                                String string211 = StubApp.getString2(6838);
                                String string212 = StubApp.getString2(381);
                                R2.c.b(string212, string211);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder4 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str4 = cVar6.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent6 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.speechEndDetected).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder4.setSessionId(str4).m5build()).m5build();
                                R2.c.b(string212, StubApp.getString2(6839) + str4);
                                Intrinsics.checkNotNull(transcribeEvent6);
                                cVar6.b(transcribeEvent6);
                                break;
                            }
                            break;
                        default:
                            SpeechRecognitionCanceledEventArgs speechRecognitionCanceledEventArgs = (SpeechRecognitionCanceledEventArgs) obj2;
                            B3.h hVar8 = this.f8083b;
                            hVar8.getClass();
                            R2.c.f(StubApp.getString2(546), StubApp.getString2(6834));
                            c cVar7 = (c) hVar8.f617h;
                            if (cVar7 != null) {
                                String reason3 = speechRecognitionCanceledEventArgs.getReason().toString();
                                Intrinsics.checkNotNullParameter(reason3, "reason");
                                String string213 = StubApp.getString2(6835);
                                String string214 = StubApp.getString2(381);
                                R2.c.b(string214, string213);
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent7 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.canceled).setResult((TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setSessionId(cVar7.f8076b).setReason(reason3).m5build()).m5build();
                                R2.c.b(string214, StubApp.getString2(6836) + reason3);
                                Intrinsics.checkNotNull(transcribeEvent7);
                                cVar7.b(transcribeEvent7);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i15 = 6;
            speechRecognizer.canceled.addEventListener(new EventHandler(hVar) { // from class: W2.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ B3.h f8083b;

                {
                    this.f8083b = hVar;
                }

                @Override // com.microsoft.cognitiveservices.speech.util.EventHandler
                public final void onEvent(Object obj, Object obj2) {
                    switch (i15) {
                        case 0:
                            SpeechRecognitionEventArgs speechRecognitionEventArgs = (SpeechRecognitionEventArgs) obj2;
                            B3.h hVar2 = this.f8083b;
                            hVar2.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6854));
                            c cVar = (c) hVar2.f617h;
                            if (cVar != null) {
                                String text = speechRecognitionEventArgs.getResult().getText();
                                if (text == null) {
                                    text = "";
                                }
                                String reason = speechRecognitionEventArgs.getResult().getReason().toString();
                                Intrinsics.checkNotNullParameter(text, "text");
                                Intrinsics.checkNotNullParameter(reason, "reason");
                                String string2 = StubApp.getString2(6855);
                                String string22 = StubApp.getString2(381);
                                R2.c.b(string22, string2);
                                R2.c.b(string22, StubApp.getString2(6856) + text + StubApp.getString2(6852) + reason + StubApp.getString2(620));
                                TranscribeEventOuterClass.TranscribeResult transcribeResult = (TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setText(text).setReason(reason).setSessionId(cVar.f8076b).setIsFinal(true).setId(cVar.f8080f).m5build();
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.recognized).setResult(transcribeResult).m5build();
                                R2.c.b(string22, StubApp.getString2(6857) + cVar.f8080f + StubApp.getString2(6858) + transcribeResult.getText());
                                Intrinsics.checkNotNull(transcribeEvent);
                                cVar.b(transcribeEvent);
                                long j = cVar.f8080f + 1;
                                cVar.f8080f = j;
                                R2.c.b(string22, StubApp.getString2(6859) + j);
                                break;
                            }
                            break;
                        case 1:
                            SpeechRecognitionEventArgs speechRecognitionEventArgs2 = (SpeechRecognitionEventArgs) obj2;
                            B3.h hVar3 = this.f8083b;
                            hVar3.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6849));
                            c cVar2 = (c) hVar3.f617h;
                            if (cVar2 != null) {
                                String text2 = speechRecognitionEventArgs2.getResult().getText();
                                if (text2 == null) {
                                    text2 = "";
                                }
                                String reason2 = speechRecognitionEventArgs2.getResult().getReason().toString();
                                Intrinsics.checkNotNullParameter(text2, "text");
                                Intrinsics.checkNotNullParameter(reason2, "reason");
                                String string23 = StubApp.getString2(6850);
                                String string24 = StubApp.getString2(381);
                                R2.c.b(string24, string23);
                                R2.c.b(string24, StubApp.getString2(6851) + text2 + StubApp.getString2(6852) + reason2 + StubApp.getString2(620));
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent2 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.recognizing).setResult((TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setText(text2).setReason(reason2).setSessionId(cVar2.f8076b).setIsFinal(false).setId(cVar2.f8080f).m5build()).m5build();
                                R2.c.b(string24, StubApp.getString2(6853).concat(text2));
                                Intrinsics.checkNotNull(transcribeEvent2);
                                cVar2.b(transcribeEvent2);
                                break;
                            }
                            break;
                        case 2:
                            B3.h hVar4 = this.f8083b;
                            hVar4.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6846));
                            c cVar3 = (c) hVar4.f617h;
                            if (cVar3 != null) {
                                String string25 = StubApp.getString2(6847);
                                String string26 = StubApp.getString2(381);
                                R2.c.b(string26, string25);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str = cVar3.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent3 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.sessionStarted).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder.setSessionId(str).m5build()).m5build();
                                R2.c.b(string26, StubApp.getString2(6848) + str);
                                Intrinsics.checkNotNull(transcribeEvent3);
                                cVar3.b(transcribeEvent3);
                                break;
                            }
                            break;
                        case 3:
                            B3.h hVar5 = this.f8083b;
                            hVar5.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6843));
                            c cVar4 = (c) hVar5.f617h;
                            if (cVar4 != null) {
                                String string27 = StubApp.getString2(6844);
                                String string28 = StubApp.getString2(381);
                                R2.c.b(string28, string27);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder2 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str2 = cVar4.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent4 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.sessionStopped).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder2.setSessionId(str2).m5build()).m5build();
                                R2.c.b(string28, StubApp.getString2(6845) + str2);
                                Intrinsics.checkNotNull(transcribeEvent4);
                                cVar4.b(transcribeEvent4);
                                break;
                            }
                            break;
                        case 4:
                            B3.h hVar6 = this.f8083b;
                            hVar6.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6840));
                            c cVar5 = (c) hVar6.f617h;
                            if (cVar5 != null) {
                                String string29 = StubApp.getString2(6841);
                                String string210 = StubApp.getString2(381);
                                R2.c.b(string210, string29);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder3 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str3 = cVar5.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent5 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.speechStartDetected).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder3.setSessionId(str3).m5build()).m5build();
                                R2.c.b(string210, StubApp.getString2(6842) + str3);
                                Intrinsics.checkNotNull(transcribeEvent5);
                                cVar5.b(transcribeEvent5);
                                break;
                            }
                            break;
                        case 5:
                            B3.h hVar7 = this.f8083b;
                            hVar7.getClass();
                            R2.c.b(StubApp.getString2(546), StubApp.getString2(6837));
                            c cVar6 = (c) hVar7.f617h;
                            if (cVar6 != null) {
                                String string211 = StubApp.getString2(6838);
                                String string212 = StubApp.getString2(381);
                                R2.c.b(string212, string211);
                                TranscribeEventOuterClass.TranscribeResult.Builder newBuilder4 = TranscribeEventOuterClass.TranscribeResult.newBuilder();
                                String str4 = cVar6.f8076b;
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent6 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.speechEndDetected).setResult((TranscribeEventOuterClass.TranscribeResult) newBuilder4.setSessionId(str4).m5build()).m5build();
                                R2.c.b(string212, StubApp.getString2(6839) + str4);
                                Intrinsics.checkNotNull(transcribeEvent6);
                                cVar6.b(transcribeEvent6);
                                break;
                            }
                            break;
                        default:
                            SpeechRecognitionCanceledEventArgs speechRecognitionCanceledEventArgs = (SpeechRecognitionCanceledEventArgs) obj2;
                            B3.h hVar8 = this.f8083b;
                            hVar8.getClass();
                            R2.c.f(StubApp.getString2(546), StubApp.getString2(6834));
                            c cVar7 = (c) hVar8.f617h;
                            if (cVar7 != null) {
                                String reason3 = speechRecognitionCanceledEventArgs.getReason().toString();
                                Intrinsics.checkNotNullParameter(reason3, "reason");
                                String string213 = StubApp.getString2(6835);
                                String string214 = StubApp.getString2(381);
                                R2.c.b(string214, string213);
                                TranscribeEventOuterClass.TranscribeEvent transcribeEvent7 = (TranscribeEventOuterClass.TranscribeEvent) TranscribeEventOuterClass.TranscribeEvent.newBuilder().setType(TranscribeEventOuterClass.TranscribeEventType.canceled).setResult((TranscribeEventOuterClass.TranscribeResult) TranscribeEventOuterClass.TranscribeResult.newBuilder().setSessionId(cVar7.f8076b).setReason(reason3).m5build()).m5build();
                                R2.c.b(string214, StubApp.getString2(6836) + reason3);
                                Intrinsics.checkNotNull(transcribeEvent7);
                                cVar7.b(transcribeEvent7);
                                break;
                            }
                            break;
                    }
                }
            });
        }
    }

    public void b(String str, String str2) {
        HashMap hashMap = (HashMap) this.f617h;
        if (hashMap == null) {
            throw new IllegalStateException(StubApp.getString2(549));
        }
        hashMap.put(str, str2);
    }

    public i c() {
        String string2 = ((String) this.f610a) == null ? StubApp.getString2(550) : "";
        if (((m) this.f614e) == null) {
            string2 = string2.concat(StubApp.getString2(551));
        }
        if (((Long) this.f615f) == null) {
            string2 = AbstractC1482f.g(string2, StubApp.getString2(552));
        }
        if (((Long) this.f616g) == null) {
            string2 = AbstractC1482f.g(string2, StubApp.getString2(553));
        }
        if (((HashMap) this.f617h) == null) {
            string2 = AbstractC1482f.g(string2, StubApp.getString2(554));
        }
        if (string2.isEmpty()) {
            return new i((String) this.f610a, (Integer) this.f612c, (m) this.f614e, ((Long) this.f615f).longValue(), ((Long) this.f616g).longValue(), (HashMap) this.f617h, (Integer) this.f613d, (String) this.f611b, (byte[]) this.f618i, (byte[]) this.j);
        }
        throw new IllegalStateException(StubApp.getString2(555).concat(string2));
    }

    public void d() {
        String str = StubApp.getString2(556) + ((V2.g) this.f612c);
        String string2 = StubApp.getString2(546);
        R2.c.d(string2, str);
        if (((V2.g) this.f612c) == V2.g.f7732a) {
            R2.c.f(string2, StubApp.getString2(557));
        } else {
            L.j((Vb.f) this.j, null, new W2.f(this, null), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public void e(Location location) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        Long monotonicTimestamp = location.getMonotonicTimestamp();
        Long valueOf = monotonicTimestamp != null ? Long.valueOf(TimeUnit.MILLISECONDS.convert(elapsedRealtimeNanos - monotonicTimestamp.longValue(), TimeUnit.NANOSECONDS)) : null;
        if (valueOf == null || valueOf.longValue() > 500) {
            D9.l.h(StubApp.getString2(558) + valueOf + StubApp.getString2(559), StubApp.getString2(545));
        }
        ((Lambda) this.f615f).invoke(location);
    }

    public void f() {
        SpeechConfig speechConfig;
        W2.a aVar = (W2.a) this.f610a;
        PushAudioInputStream createPushStream = AudioInputStream.createPushStream(AudioStreamFormat.getWaveFormatPCM(aVar.f8069e & BodyPartID.bodyIdMax, (short) aVar.f8070f, (short) aVar.f8071g));
        this.f613d = createPushStream;
        Intrinsics.checkNotNull(createPushStream);
        this.f614e = AudioConfig.fromStreamInput(createPushStream);
        SpeechConfig fromSubscription = SpeechConfig.fromSubscription(aVar.f8065a, aVar.f8066b);
        this.f615f = fromSubscription;
        if (fromSubscription != null) {
            fromSubscription.setSpeechRecognitionLanguage(aVar.f8067c);
        }
        SpeechConfig speechConfig2 = (SpeechConfig) this.f615f;
        if (speechConfig2 != null) {
            speechConfig2.setProfanity(ProfanityOption.Raw);
        }
        Integer num = aVar.f8073i;
        if (num != null && num.intValue() > 0 && (speechConfig = (SpeechConfig) this.f615f) != null) {
            speechConfig.setProperty(PropertyId.Speech_SegmentationSilenceTimeoutMs, String.valueOf(num));
        }
        R2.c.d(StubApp.getString2(546), StubApp.getString2(560) + num);
        this.f617h = new W2.c((BinaryMessenger) this.f611b, aVar.f8068d);
    }

    public void g() {
        String str = StubApp.getString2(561) + ((V2.g) this.f612c);
        String string2 = StubApp.getString2(546);
        R2.c.d(string2, str);
        if (((V2.g) this.f612c) != V2.g.f7734c) {
            R2.c.c(string2, StubApp.getString2(562));
        } else {
            L.j((Vb.f) this.j, null, new W2.h(this, null), 3);
        }
    }

    public void h() {
        String str = StubApp.getString2(563) + ((V2.g) this.f612c);
        String string2 = StubApp.getString2(546);
        R2.c.d(string2, str);
        if (((V2.g) this.f612c) != V2.g.f7735d) {
            R2.c.c(string2, StubApp.getString2(564));
        } else {
            L.j((Vb.f) this.j, null, new W2.j(this, null), 3);
        }
    }

    public void i(String newLanguage) {
        Intrinsics.checkNotNullParameter(newLanguage, "language");
        R2.c.b(StubApp.getString2(546), StubApp.getString2(565) + newLanguage);
        W2.a aVar = (W2.a) this.f610a;
        Intrinsics.checkNotNullParameter(newLanguage, "newLanguage");
        aVar.f8067c = newLanguage;
        SpeechConfig speechConfig = (SpeechConfig) this.f615f;
        if (speechConfig != null) {
            speechConfig.setSpeechRecognitionLanguage(newLanguage);
        }
    }

    public void j() {
        String str = StubApp.getString2(566) + ((V2.g) this.f612c);
        String string2 = StubApp.getString2(546);
        R2.c.d(string2, str);
        V2.g gVar = (V2.g) this.f612c;
        if (gVar != V2.g.f7732a && gVar != V2.g.f7735d) {
            R2.c.c(string2, StubApp.getString2(567));
        } else {
            L.j((Vb.f) this.j, null, new W2.l(this, null), 3);
        }
    }

    public void k() {
        this.f615f = B.f7798h;
        LocationProvider locationProvider = (LocationProvider) this.f614e;
        if (locationProvider != null) {
            locationProvider.removeLocationObserver((D) this.f618i);
            Cancelable cancelable = (Cancelable) this.j;
            if (cancelable != null) {
                cancelable.cancel();
            }
        }
        this.f614e = null;
    }

    public void l() {
        String str = StubApp.getString2(568) + ((V2.g) this.f612c);
        String string2 = StubApp.getString2(546);
        R2.c.d(string2, str);
        V2.g gVar = (V2.g) this.f612c;
        if (gVar != V2.g.f7734c && gVar != V2.g.f7735d) {
            R2.c.c(string2, StubApp.getString2(569));
        } else {
            L.j((Vb.f) this.j, null, new W2.n(this, null), 3);
        }
    }

    public h(W2.a configuration, BinaryMessenger messenger) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(messenger, "messenger");
        this.f610a = configuration;
        this.f611b = messenger;
        String string2 = StubApp.getString2(546);
        this.f612c = V2.g.f7732a;
        C0227w0 a3 = L.a();
        this.f618i = a3;
        this.j = J.a(CoroutineContext.Element.DefaultImpls.plus(a3, W.f5839b));
        try {
            f();
            R2.c.e(string2, StubApp.getString2("547"));
        } catch (Exception e10) {
            R2.c.c(string2, StubApp.getString2(548) + e10);
            throw e10;
        }
    }
}
