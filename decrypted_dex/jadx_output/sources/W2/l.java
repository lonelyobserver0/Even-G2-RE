package W2;

import Qb.I;
import Qb.L;
import Qb.W;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.SpeechRecognizer;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B3.h f8095b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(B3.h hVar, Continuation continuation) {
        super(2, continuation);
        this.f8095b = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f8095b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f8094a;
        String string2 = StubApp.getString2(546);
        B3.h hVar = this.f8095b;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                if (((SpeechConfig) hVar.f615f) == null || ((AudioConfig) hVar.f614e) == null) {
                    R2.c.c(string2, StubApp.getString2("6876"));
                    throw new V2.a();
                }
                hVar.f612c = V2.g.f7733b;
                hVar.f616g = new SpeechRecognizer((SpeechConfig) hVar.f615f, (AudioConfig) hVar.f614e);
                B3.h.a(hVar);
                Xb.c cVar = W.f5839b;
                k kVar = new k(hVar, null);
                this.f8094a = 1;
                if (L.n(cVar, kVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException(StubApp.getString2(275));
                }
                ResultKt.throwOnFailure(obj);
            }
            hVar.f612c = V2.g.f7734c;
            R2.c.d(string2, StubApp.getString2("6875"));
            return Unit.INSTANCE;
        } catch (Exception e10) {
            hVar.getClass();
            String string22 = StubApp.getString2(6877);
            R2.c.c(string2, string22 + e10);
            hVar.f612c = V2.g.f7737f;
            throw new V2.d(E1.a.i(string22, e10));
        }
    }
}
