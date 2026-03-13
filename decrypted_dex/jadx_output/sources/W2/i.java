package W2;

import Qb.I;
import com.microsoft.cognitiveservices.speech.SpeechRecognizer;
import java.util.concurrent.Future;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B3.h f8090a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(B3.h hVar, Continuation continuation) {
        super(2, continuation);
        this.f8090a = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f8090a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Future<Void> startContinuousRecognitionAsync;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SpeechRecognizer speechRecognizer = (SpeechRecognizer) this.f8090a.f616g;
        if (speechRecognizer == null || (startContinuousRecognitionAsync = speechRecognizer.startContinuousRecognitionAsync()) == null) {
            return null;
        }
        return startContinuousRecognitionAsync.get();
    }
}
