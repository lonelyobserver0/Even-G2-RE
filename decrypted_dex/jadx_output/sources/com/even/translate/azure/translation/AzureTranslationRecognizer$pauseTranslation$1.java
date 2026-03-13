package com.even.translate.azure.translation;

import Qb.I;
import Qb.L;
import Qb.W;
import Xb.c;
import com.even.translate.azure.basic.AzureRecognizerError;
import com.even.translate.azure.basic.AzureRecognizerState;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQb/I;", "", "<anonymous>", "(LQb/I;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "com.even.translate.azure.translation.AzureTranslationRecognizer$pauseTranslation$1", f = "AzureTranslationRecognizer.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class AzureTranslationRecognizer$pauseTranslation$1 extends SuspendLambda implements Function2<I, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AzureTranslationRecognizer this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQb/I;", "Ljava/lang/Void;", "<anonymous>", "(LQb/I;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.even.translate.azure.translation.AzureTranslationRecognizer$pauseTranslation$1$1", f = "AzureTranslationRecognizer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.even.translate.azure.translation.AzureTranslationRecognizer$pauseTranslation$1$1, reason: invalid class name */
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
            Future<Void> stopContinuousRecognitionAsync;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
            translationRecognizer = this.this$0.recognizer;
            if (translationRecognizer == null || (stopContinuousRecognitionAsync = translationRecognizer.stopContinuousRecognitionAsync()) == null) {
                return null;
            }
            return stopContinuousRecognitionAsync.get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AzureTranslationRecognizer$pauseTranslation$1(AzureTranslationRecognizer azureTranslationRecognizer, Continuation<? super AzureTranslationRecognizer$pauseTranslation$1> continuation) {
        super(2, continuation);
        this.this$0 = azureTranslationRecognizer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AzureTranslationRecognizer$pauseTranslation$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(I i3, Continuation<? super Unit> continuation) {
        return ((AzureTranslationRecognizer$pauseTranslation$1) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                c cVar = W.f5839b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (L.n(cVar, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException(StubApp.getString2(275));
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.setState(AzureRecognizerState.PAUSED);
            str2 = this.this$0.tag;
            R2.c.d(str2, StubApp.getString2("6871"));
            return Unit.INSTANCE;
        } catch (Exception e10) {
            str = this.this$0.tag;
            String string2 = StubApp.getString2(6872);
            R2.c.c(str, string2 + e10);
            this.this$0.setState(AzureRecognizerState.ERROR);
            throw new AzureRecognizerError.PauseTranslationError(E1.a.i(string2, e10));
        }
    }
}
