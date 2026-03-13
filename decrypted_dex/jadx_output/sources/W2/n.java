package W2;

import Qb.I;
import Qb.L;
import Qb.W;
import com.microsoft.cognitiveservices.speech.SpeechRecognizer;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B3.h f8098b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(B3.h hVar, Continuation continuation) {
        super(2, continuation);
        this.f8098b = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f8098b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f8097a;
        String string2 = StubApp.getString2(546);
        B3.h hVar = this.f8098b;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                hVar.f612c = V2.g.f7736e;
                Xb.c cVar = W.f5839b;
                m mVar = new m(hVar, null);
                this.f8097a = 1;
                if (L.n(cVar, mVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException(StubApp.getString2(275));
                }
                ResultKt.throwOnFailure(obj);
            }
            SpeechRecognizer speechRecognizer = (SpeechRecognizer) hVar.f616g;
            if (speechRecognizer != null) {
                speechRecognizer.close();
            }
            hVar.f616g = null;
            hVar.f612c = V2.g.f7732a;
            R2.c.d(string2, StubApp.getString2("6878"));
            return Unit.INSTANCE;
        } catch (Exception e10) {
            hVar.getClass();
            String string22 = StubApp.getString2(6879);
            R2.c.c(string2, string22 + e10);
            hVar.f612c = V2.g.f7737f;
            throw new V2.e(E1.a.i(string22, e10));
        }
    }
}
