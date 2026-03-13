package com.even.translate.azure.translation;

import Qb.D0;
import Qb.I;
import Qb.L;
import Qb.W;
import R2.c;
import com.even.translate.azure.basic.AzureRecognizerState;
import com.microsoft.cognitiveservices.speech.audio.PushAudioInputStream;
import com.microsoft.cognitiveservices.speech.translation.TranslationRecognizer;
import com.stub.StubApp;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQb/I;", "", "<anonymous>", "(LQb/I;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "com.even.translate.azure.translation.AzureTranslationRecognizer$close$1", f = "AzureTranslationRecognizer.kt", i = {}, l = {240}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class AzureTranslationRecognizer$close$1 extends SuspendLambda implements Function2<I, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AzureTranslationRecognizer this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQb/I;", "", "<anonymous>", "(LQb/I;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.even.translate.azure.translation.AzureTranslationRecognizer$close$1$1", f = "AzureTranslationRecognizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.even.translate.azure.translation.AzureTranslationRecognizer$close$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<I, Continuation<? super Unit>, Object> {
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
        public final Object invoke(I i3, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TranslationRecognizer translationRecognizer;
            String str;
            Future<Void> stopContinuousRecognitionAsync;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
            translationRecognizer = this.this$0.recognizer;
            if (translationRecognizer != null && (stopContinuousRecognitionAsync = translationRecognizer.stopContinuousRecognitionAsync()) != null) {
                stopContinuousRecognitionAsync.get();
            }
            str = this.this$0.tag;
            c.b(str, StubApp.getString2(10150));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AzureTranslationRecognizer$close$1(AzureTranslationRecognizer azureTranslationRecognizer, Continuation<? super AzureTranslationRecognizer$close$1> continuation) {
        super(2, continuation);
        this.this$0 = azureTranslationRecognizer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AzureTranslationRecognizer$close$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(I i3, Continuation<? super Unit> continuation) {
        return ((AzureTranslationRecognizer$close$1) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineContext.Element element;
        CoroutineContext.Element element2;
        String str2;
        String str3;
        String str4;
        PushAudioInputStream pushAudioInputStream;
        AzureTranslationEventHandler azureTranslationEventHandler;
        TranslationRecognizer translationRecognizer;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String string2 = StubApp.getString2(6861);
        String string22 = StubApp.getString2(6862);
        String string23 = StubApp.getString2(6863);
        String string24 = StubApp.getString2(6864);
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        String string25 = StubApp.getString2(6865);
        try {
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.this$0.getState() == AzureRecognizerState.RUNNING || this.this$0.getState() == AzureRecognizerState.PAUSED) {
                        str4 = this.this$0.tag;
                        c.b(str4, StubApp.getString2("10151"));
                        Xb.c cVar = W.f5839b;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                        this.label = 1;
                        if (L.n(cVar, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException(StubApp.getString2(275));
                    }
                    ResultKt.throwOnFailure(obj);
                }
                pushAudioInputStream = this.this$0.audioInputStream;
                if (pushAudioInputStream != null) {
                    AzureTranslationRecognizer azureTranslationRecognizer = this.this$0;
                    try {
                        pushAudioInputStream.close();
                        str12 = azureTranslationRecognizer.tag;
                        c.b(str12, StubApp.getString2("6867"));
                    } catch (Exception e10) {
                        str11 = azureTranslationRecognizer.tag;
                        c.f(str11, string24 + e10);
                    }
                    azureTranslationRecognizer.audioInputStream = null;
                }
                azureTranslationEventHandler = this.this$0.eventHandler;
                if (azureTranslationEventHandler != null) {
                    AzureTranslationRecognizer azureTranslationRecognizer2 = this.this$0;
                    try {
                        azureTranslationEventHandler.dispose();
                        str10 = azureTranslationRecognizer2.tag;
                        c.b(str10, StubApp.getString2("6868"));
                    } catch (Exception e11) {
                        str9 = azureTranslationRecognizer2.tag;
                        c.f(str9, string23 + e11);
                    }
                    azureTranslationRecognizer2.eventHandler = null;
                }
                this.this$0.audioConfig = null;
                this.this$0.translationConfig = null;
                translationRecognizer = this.this$0.recognizer;
                if (translationRecognizer != null) {
                    AzureTranslationRecognizer azureTranslationRecognizer3 = this.this$0;
                    try {
                        translationRecognizer.close();
                        str8 = azureTranslationRecognizer3.tag;
                        c.b(str8, StubApp.getString2("6869"));
                    } catch (Exception e12) {
                        str7 = azureTranslationRecognizer3.tag;
                        c.f(str7, string22 + e12);
                    }
                    azureTranslationRecognizer3.recognizer = null;
                }
                str5 = this.this$0.tag;
                c.b(str5, StubApp.getString2("10152"));
                this.this$0.setState(AzureRecognizerState.IDLE);
                str6 = this.this$0.tag;
                c.d(str6, StubApp.getString2("6870"));
                element = this.this$0.scopeJob;
            } catch (Throwable th) {
                element2 = this.this$0.scopeJob;
                ((D0) element2).d(null);
                str2 = this.this$0.tag;
                c.b(str2, string25);
                throw th;
            }
        } catch (Exception e13) {
            str = this.this$0.tag;
            c.c(str, string2 + e13);
            this.this$0.setState(AzureRecognizerState.IDLE);
            element = this.this$0.scopeJob;
        }
        ((D0) element).d(null);
        str3 = this.this$0.tag;
        c.b(str3, string25);
        return Unit.INSTANCE;
    }
}
