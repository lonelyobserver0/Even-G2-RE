package com.even.translate.azure.translation;

import B0.o;
import R2.c;
import android.os.Handler;
import android.os.Looper;
import com.even.translate.TranslationEventOuterClass;
import com.even.translate.azure.translation.AzureTranslationEventHandler;
import com.microsoft.cognitiveservices.speech.PropertyCollection;
import com.microsoft.cognitiveservices.speech.RecognitionEventArgs;
import com.microsoft.cognitiveservices.speech.SessionEventArgs;
import com.microsoft.cognitiveservices.speech.translation.TranslationRecognitionCanceledEventArgs;
import com.microsoft.cognitiveservices.speech.translation.TranslationRecognitionEventArgs;
import com.microsoft.cognitiveservices.speech.translation.TranslationSynthesisEventArgs;
import com.stub.StubApp;
import i2.u;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0019J\u0012\u0010\u001b\u001a\u00020\u00132\n\u0010\u001c\u001a\u00060\u001dj\u0002`\u001eJ\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020 J\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020%J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020'H\u0002J\u001c\u0010(\u001a\u00020\u00132\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010,\u001a\u00020\u00132\b\u0010)\u001a\u0004\u0018\u00010*H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/even/translate/azure/translation/AzureTranslationEventHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "sessionID", "", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V", "eventChannel", "Lio/flutter/plugin/common/EventChannel;", "eventSink", "Lio/flutter/plugin/common/EventChannel$EventSink;", "isDisposed", "", "sentenceID", "", "eventHandler", "Lcom/even/translate/azure/translation/AzureTranslationEventHandler$EventHandler;", "dispose", "", "handleRecognizing", "event", "Lcom/microsoft/cognitiveservices/speech/translation/TranslationRecognitionEventArgs;", "handleRecognized", "handleSessionStarted", "Lcom/microsoft/cognitiveservices/speech/SessionEventArgs;", "handleSessionStopped", "handleError", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "handleSpeechStartDetected", "Lcom/microsoft/cognitiveservices/speech/RecognitionEventArgs;", "handleSpeechEndDetected", "handleCanceled", "Lcom/microsoft/cognitiveservices/speech/translation/TranslationRecognitionCanceledEventArgs;", "handleSynthesizing", "Lcom/microsoft/cognitiveservices/speech/translation/TranslationSynthesisEventArgs;", "sendEvent", "Lcom/even/translate/TranslationEventOuterClass$TranslationEvent;", "onListen", "arguments", "", "events", "onCancel", "EventHandler", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class AzureTranslationEventHandler implements EventChannel.StreamHandler {
    private final EventChannel eventChannel;
    private final EventHandler eventHandler;
    private EventChannel.EventSink eventSink;
    private boolean isDisposed;
    private final BinaryMessenger messenger;
    private long sentenceID;
    private final String sessionID;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/even/translate/azure/translation/AzureTranslationEventHandler$EventHandler;", "Landroid/os/Handler;", "handler", "Lcom/even/translate/azure/translation/AzureTranslationEventHandler;", "<init>", "(Lcom/even/translate/azure/translation/AzureTranslationEventHandler;)V", "handlerRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "postEvent", "", "event", "Lcom/even/translate/TranslationEventOuterClass$TranslationEvent;", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EventHandler extends Handler {
        private final WeakReference<AzureTranslationEventHandler> handlerRef;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EventHandler(AzureTranslationEventHandler handler) {
            super(Looper.getMainLooper());
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.handlerRef = new WeakReference<>(handler);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void postEvent$lambda$1(EventHandler eventHandler, TranslationEventOuterClass.TranslationEvent translationEvent) {
            AzureTranslationEventHandler azureTranslationEventHandler = eventHandler.handlerRef.get();
            if (azureTranslationEventHandler != null) {
                boolean z2 = azureTranslationEventHandler.isDisposed;
                String string2 = StubApp.getString2(10128);
                if (z2) {
                    c.f(string2, StubApp.getString2(KyberEngine.KyberPolyBytes));
                    return;
                }
                try {
                    EventChannel.EventSink eventSink = azureTranslationEventHandler.eventSink;
                    if (eventSink != null) {
                        eventSink.success(translationEvent.toByteArray());
                    }
                    c.b(string2, StubApp.getString2("10129"));
                } catch (Exception e10) {
                    E1.a.u(StubApp.getString2(10130), e10.getMessage(), string2);
                }
            }
        }

        public final void postEvent(final TranslationEventOuterClass.TranslationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            post(new Runnable() { // from class: com.even.translate.azure.translation.a
                @Override // java.lang.Runnable
                public final void run() {
                    AzureTranslationEventHandler.EventHandler.postEvent$lambda$1(AzureTranslationEventHandler.EventHandler.this, event);
                }
            });
        }
    }

    public AzureTranslationEventHandler(BinaryMessenger messenger, String sessionID) {
        Intrinsics.checkNotNullParameter(messenger, "messenger");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        this.messenger = messenger;
        this.sessionID = sessionID;
        EventChannel eventChannel = new EventChannel(messenger, StubApp.getString2(10131));
        this.eventChannel = eventChannel;
        String string2 = StubApp.getString2(10128);
        c.d(string2, StubApp.getString2(10132));
        c.b(string2, StubApp.getString2(6825) + sessionID);
        eventChannel.setStreamHandler(this);
        c.d(string2, StubApp.getString2(10133));
        this.eventHandler = new EventHandler(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispose$lambda$0(AzureTranslationEventHandler azureTranslationEventHandler) {
        String string2 = StubApp.getString2(10128);
        c.b(string2, StubApp.getString2(488));
        azureTranslationEventHandler.isDisposed = true;
        azureTranslationEventHandler.eventSink = null;
        azureTranslationEventHandler.eventHandler.removeCallbacksAndMessages(null);
        azureTranslationEventHandler.eventChannel.setStreamHandler(null);
        c.d(string2, StubApp.getString2(489));
    }

    private final void sendEvent(TranslationEventOuterClass.TranslationEvent event) {
        boolean z2 = this.isDisposed;
        String string2 = StubApp.getString2(10128);
        if (z2) {
            c.f(string2, StubApp.getString2(6828));
            return;
        }
        c.b(string2, StubApp.getString2(6829) + event.getType() + StubApp.getString2(10134) + event.toByteArray().length);
        this.eventHandler.postEvent(event);
    }

    public final void dispose() {
        c.d(StubApp.getString2(10128), StubApp.getString2(6827));
        new Handler(Looper.getMainLooper()).post(new o(this, 16));
    }

    public final void handleCanceled(TranslationRecognitionCanceledEventArgs event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String string2 = StubApp.getString2(10128);
        c.b(string2, StubApp.getString2(6835));
        TranslationEventOuterClass.TranslationResult translationResult = (TranslationEventOuterClass.TranslationResult) TranslationEventOuterClass.TranslationResult.newBuilder().setSessionId(this.sessionID).setReason(event.getReason().toString()).m5build();
        TranslationEventOuterClass.TranslationEvent translationEvent = (TranslationEventOuterClass.TranslationEvent) TranslationEventOuterClass.TranslationEvent.newBuilder().setType(TranslationEventOuterClass.TranslationEventType.canceled).setResult(translationResult).m5build();
        c.b(string2, StubApp.getString2(6836) + translationResult.getSessionId() + StubApp.getString2(81) + translationResult.getReason());
        Intrinsics.checkNotNull(translationEvent);
        sendEvent(translationEvent);
    }

    public final void handleError(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String str = StubApp.getString2(10135) + error.getMessage();
        String string2 = StubApp.getString2(10128);
        c.c(string2, str);
        TranslationEventOuterClass.TranslationResult.Builder sessionId = TranslationEventOuterClass.TranslationResult.newBuilder().setSessionId(this.sessionID);
        String message = error.getMessage();
        if (message == null) {
            message = StubApp.getString2(10136);
        }
        TranslationEventOuterClass.TranslationResult translationResult = (TranslationEventOuterClass.TranslationResult) sessionId.setReason(message).m5build();
        TranslationEventOuterClass.TranslationEvent translationEvent = (TranslationEventOuterClass.TranslationEvent) TranslationEventOuterClass.TranslationEvent.newBuilder().setType(TranslationEventOuterClass.TranslationEventType.error).setResult(translationResult).m5build();
        c.b(string2, StubApp.getString2(10137) + translationResult.getSessionId() + StubApp.getString2(81) + translationResult.getReason());
        Intrinsics.checkNotNull(translationEvent);
        sendEvent(translationEvent);
    }

    public final void handleRecognized(TranslationRecognitionEventArgs event) {
        Object firstOrNull;
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        String string2 = StubApp.getString2(10128);
        c.b(string2, StubApp.getString2(6855));
        String text = event.getResult().getText();
        String str2 = "";
        if (text == null) {
            text = "";
        }
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(event.getResult().getTranslations().entrySet());
        Map.Entry entry = (Map.Entry) firstOrNull;
        if (entry != null && (str = (String) entry.getValue()) != null) {
            str2 = str;
        }
        String obj = event.getResult().getReason().toString();
        String resultId = event.getResult().getResultId();
        long longValue = event.getResult().getDuration().longValue();
        long longValue2 = event.getResult().getOffset().longValue();
        PropertyCollection properties = event.getResult().getProperties();
        StringBuilder t3 = u.t(StubApp.getString2(10138), text, StubApp.getString2(10139), str2, StubApp.getString2(6852));
        E1.a.v(t3, obj, StubApp.getString2(10140), resultId, StubApp.getString2(10141));
        t3.append(longValue);
        t3.append(StubApp.getString2(10142));
        t3.append(longValue2);
        t3.append(StubApp.getString2(10143));
        t3.append(properties);
        t3.append(StubApp.getString2(620));
        c.b(string2, t3.toString());
        long j = 10000;
        TranslationEventOuterClass.TranslationResult translationResult = (TranslationEventOuterClass.TranslationResult) TranslationEventOuterClass.TranslationResult.newBuilder().setOriginal(text).setTarget(str2).setReason(obj).setSessionId(this.sessionID).setIsFinal(true).setId(this.sentenceID).setOffset(event.getResult().getOffset().longValue() / j).setDuration(event.getResult().getDuration().longValue() / j).m5build();
        TranslationEventOuterClass.TranslationEvent translationEvent = (TranslationEventOuterClass.TranslationEvent) TranslationEventOuterClass.TranslationEvent.newBuilder().setType(TranslationEventOuterClass.TranslationEventType.recognized).setResult(translationResult).m5build();
        c.b(string2, StubApp.getString2(10144) + this.sentenceID + StubApp.getString2(6858) + translationResult.getTarget() + StubApp.getString2(438) + translationResult.getOriginal());
        Intrinsics.checkNotNull(translationEvent);
        sendEvent(translationEvent);
        long j3 = this.sentenceID + 1;
        this.sentenceID = j3;
        c.b(string2, StubApp.getString2(10145) + j3);
    }

    public final void handleRecognizing(TranslationRecognitionEventArgs event) {
        Object firstOrNull;
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        String string2 = StubApp.getString2(10128);
        c.b(string2, StubApp.getString2(6850));
        String text = event.getResult().getText();
        String str2 = "";
        if (text == null) {
            text = "";
        }
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(event.getResult().getTranslations().entrySet());
        Map.Entry entry = (Map.Entry) firstOrNull;
        if (entry != null && (str = (String) entry.getValue()) != null) {
            str2 = str;
        }
        String obj = event.getResult().getReason().toString();
        String resultId = event.getResult().getResultId();
        long longValue = event.getResult().getDuration().longValue();
        long longValue2 = event.getResult().getOffset().longValue();
        PropertyCollection properties = event.getResult().getProperties();
        StringBuilder t3 = u.t(StubApp.getString2(10146), text, StubApp.getString2(10139), str2, StubApp.getString2(6852));
        E1.a.v(t3, obj, StubApp.getString2(10140), resultId, StubApp.getString2(10141));
        t3.append(longValue);
        t3.append(StubApp.getString2(10142));
        t3.append(longValue2);
        t3.append(StubApp.getString2(10143));
        t3.append(properties);
        t3.append(StubApp.getString2(620));
        c.b(string2, t3.toString());
        long j = 10000;
        TranslationEventOuterClass.TranslationResult translationResult = (TranslationEventOuterClass.TranslationResult) TranslationEventOuterClass.TranslationResult.newBuilder().setOriginal(text).setTarget(str2).setReason(obj).setSessionId(this.sessionID).setIsFinal(false).setId(this.sentenceID).setOffset(event.getResult().getOffset().longValue() / j).setDuration(event.getResult().getDuration().longValue() / j).m5build();
        TranslationEventOuterClass.TranslationEvent translationEvent = (TranslationEventOuterClass.TranslationEvent) TranslationEventOuterClass.TranslationEvent.newBuilder().setType(TranslationEventOuterClass.TranslationEventType.recognizing).setResult(translationResult).m5build();
        c.b(string2, StubApp.getString2(6853) + translationResult.getTarget() + StubApp.getString2(81) + translationResult.getOriginal());
        Intrinsics.checkNotNull(translationEvent);
        sendEvent(translationEvent);
    }

    public final void handleSessionStarted(SessionEventArgs event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String string2 = StubApp.getString2(10128);
        c.b(string2, StubApp.getString2(6847));
        TranslationEventOuterClass.TranslationResult translationResult = (TranslationEventOuterClass.TranslationResult) TranslationEventOuterClass.TranslationResult.newBuilder().setSessionId(this.sessionID).m5build();
        TranslationEventOuterClass.TranslationEvent translationEvent = (TranslationEventOuterClass.TranslationEvent) TranslationEventOuterClass.TranslationEvent.newBuilder().setType(TranslationEventOuterClass.TranslationEventType.sessionStarted).setResult(translationResult).m5build();
        c.b(string2, StubApp.getString2(6848) + translationResult.getSessionId());
        Intrinsics.checkNotNull(translationEvent);
        sendEvent(translationEvent);
    }

    public final void handleSessionStopped(SessionEventArgs event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String string2 = StubApp.getString2(10128);
        c.b(string2, StubApp.getString2(6844));
        TranslationEventOuterClass.TranslationResult translationResult = (TranslationEventOuterClass.TranslationResult) TranslationEventOuterClass.TranslationResult.newBuilder().setSessionId(this.sessionID).m5build();
        TranslationEventOuterClass.TranslationEvent translationEvent = (TranslationEventOuterClass.TranslationEvent) TranslationEventOuterClass.TranslationEvent.newBuilder().setType(TranslationEventOuterClass.TranslationEventType.sessionStopped).setResult(translationResult).m5build();
        c.b(string2, StubApp.getString2(6845) + translationResult.getSessionId());
        Intrinsics.checkNotNull(translationEvent);
        sendEvent(translationEvent);
    }

    public final void handleSpeechEndDetected(RecognitionEventArgs event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String string2 = StubApp.getString2(10128);
        c.b(string2, StubApp.getString2(6838));
        TranslationEventOuterClass.TranslationResult translationResult = (TranslationEventOuterClass.TranslationResult) TranslationEventOuterClass.TranslationResult.newBuilder().setSessionId(this.sessionID).m5build();
        TranslationEventOuterClass.TranslationEvent translationEvent = (TranslationEventOuterClass.TranslationEvent) TranslationEventOuterClass.TranslationEvent.newBuilder().setType(TranslationEventOuterClass.TranslationEventType.speechEndDetected).setResult(translationResult).m5build();
        c.b(string2, StubApp.getString2(6839) + translationResult.getSessionId());
        Intrinsics.checkNotNull(translationEvent);
        sendEvent(translationEvent);
    }

    public final void handleSpeechStartDetected(RecognitionEventArgs event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String string2 = StubApp.getString2(10128);
        c.b(string2, StubApp.getString2(6841));
        TranslationEventOuterClass.TranslationResult translationResult = (TranslationEventOuterClass.TranslationResult) TranslationEventOuterClass.TranslationResult.newBuilder().setSessionId(this.sessionID).m5build();
        TranslationEventOuterClass.TranslationEvent translationEvent = (TranslationEventOuterClass.TranslationEvent) TranslationEventOuterClass.TranslationEvent.newBuilder().setType(TranslationEventOuterClass.TranslationEventType.speechStartDetected).setResult(translationResult).m5build();
        c.b(string2, StubApp.getString2(6842) + translationResult.getSessionId());
        Intrinsics.checkNotNull(translationEvent);
        sendEvent(translationEvent);
    }

    public final void handleSynthesizing(TranslationSynthesisEventArgs event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String string2 = StubApp.getString2(10128);
        c.b(string2, StubApp.getString2(10147));
        TranslationEventOuterClass.TranslationResult translationResult = (TranslationEventOuterClass.TranslationResult) TranslationEventOuterClass.TranslationResult.newBuilder().setSessionId(this.sessionID).m5build();
        TranslationEventOuterClass.TranslationEvent translationEvent = (TranslationEventOuterClass.TranslationEvent) TranslationEventOuterClass.TranslationEvent.newBuilder().setType(TranslationEventOuterClass.TranslationEventType.synthesizing).setResult(translationResult).m5build();
        c.b(string2, StubApp.getString2(10148) + translationResult.getSessionId());
        Intrinsics.checkNotNull(translationEvent);
        sendEvent(translationEvent);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object arguments) {
        String string2 = StubApp.getString2(10128);
        c.d(string2, StubApp.getString2(6830));
        this.eventSink = null;
        c.b(string2, StubApp.getString2(10149));
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object arguments, EventChannel.EventSink events) {
        String string2 = StubApp.getString2(10128);
        c.d(string2, StubApp.getString2(6832));
        this.eventSink = events;
        c.b(string2, StubApp.getString2(6833));
    }
}
