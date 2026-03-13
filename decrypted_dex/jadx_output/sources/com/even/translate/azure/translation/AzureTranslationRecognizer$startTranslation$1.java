package com.even.translate.azure.translation;

import Qb.I;
import Qb.L;
import Qb.W;
import R2.c;
import com.even.translate.azure.basic.AzureRecognizerError;
import com.even.translate.azure.basic.AzureRecognizerState;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import com.microsoft.cognitiveservices.speech.translation.SpeechTranslationConfig;
import com.microsoft.cognitiveservices.speech.translation.TranslationRecognizer;
import com.stub.StubApp;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQb/I;", "", "<anonymous>", "(LQb/I;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "com.even.translate.azure.translation.AzureTranslationRecognizer$startTranslation$1", f = "AzureTranslationRecognizer.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class AzureTranslationRecognizer$startTranslation$1 extends SuspendLambda implements Function2<I, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AzureTranslationRecognizer this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQb/I;", "Ljava/lang/Void;", "<anonymous>", "(LQb/I;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.even.translate.azure.translation.AzureTranslationRecognizer$startTranslation$1$1", f = "AzureTranslationRecognizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.even.translate.azure.translation.AzureTranslationRecognizer$startTranslation$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<I, Continuation<? super Void>, Object> {
        int label;
        final /* synthetic */ AzureTranslationRecognizer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AzureTranslationRecognizer azureTranslationRecognizer, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = azureTranslationRecognizer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(I i3, Continuation<? super Void> continuation) {
            return ((AnonymousClass1) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TranslationRecognizer translationRecognizer;
            Future<Void> startContinuousRecognitionAsync;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
            translationRecognizer = this.this$0.recognizer;
            if (translationRecognizer == null || (startContinuousRecognitionAsync = translationRecognizer.startContinuousRecognitionAsync()) == null) {
                return null;
            }
            return startContinuousRecognitionAsync.get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AzureTranslationRecognizer$startTranslation$1(AzureTranslationRecognizer azureTranslationRecognizer, Continuation<? super AzureTranslationRecognizer$startTranslation$1> continuation) {
        super(2, continuation);
        this.this$0 = azureTranslationRecognizer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AzureTranslationRecognizer$startTranslation$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(I i3, Continuation<? super Unit> continuation) {
        return ((AzureTranslationRecognizer$startTranslation$1) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        SpeechTranslationConfig speechTranslationConfig;
        String str2;
        SpeechTranslationConfig speechTranslationConfig2;
        AudioConfig audioConfig;
        SpeechTranslationConfig speechTranslationConfig3;
        AudioConfig audioConfig2;
        AudioConfig audioConfig3;
        String str3;
        SpeechTranslationConfig speechTranslationConfig4;
        AudioConfig audioConfig4;
        String str4;
        String string2 = StubApp.getString2(10153);
        String string22 = StubApp.getString2(10154);
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                speechTranslationConfig = this.this$0.translationConfig;
                if (speechTranslationConfig != null) {
                    audioConfig3 = this.this$0.audioConfig;
                    if (audioConfig3 != null) {
                        str3 = this.this$0.tag;
                        c.b(str3, StubApp.getString2("10155"));
                        this.this$0.setState(AzureRecognizerState.STARTING);
                        speechTranslationConfig4 = this.this$0.translationConfig;
                        Intrinsics.checkNotNull(speechTranslationConfig4);
                        audioConfig4 = this.this$0.audioConfig;
                        Intrinsics.checkNotNull(audioConfig4);
                        this.this$0.recognizer = new TranslationRecognizer(speechTranslationConfig4, audioConfig4);
                        this.this$0.handleRecognizerEvent();
                        Xb.c cVar = W.f5839b;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                        this.label = 1;
                        if (L.n(cVar, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                str2 = this.this$0.tag;
                speechTranslationConfig2 = this.this$0.translationConfig;
                audioConfig = this.this$0.audioConfig;
                c.c(str2, string22 + speechTranslationConfig2 + string2 + audioConfig);
                speechTranslationConfig3 = this.this$0.translationConfig;
                audioConfig2 = this.this$0.audioConfig;
                throw new AzureRecognizerError.ConfigError(string22 + speechTranslationConfig3 + string2 + audioConfig2);
            }
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.setState(AzureRecognizerState.RUNNING);
            str4 = this.this$0.tag;
            c.d(str4, StubApp.getString2("6875"));
            return Unit.INSTANCE;
        } catch (Exception e10) {
            str = this.this$0.tag;
            String string23 = StubApp.getString2(6877);
            c.c(str, string23 + e10);
            this.this$0.setState(AzureRecognizerState.ERROR);
            throw new AzureRecognizerError.StartTranslationError(E1.a.i(string23, e10));
        }
    }
}
