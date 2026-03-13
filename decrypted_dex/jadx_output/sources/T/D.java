package T;

import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class D extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f6743a;

    /* renamed from: b, reason: collision with root package name */
    public int f6744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q f6745c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Q q10, Continuation continuation) {
        super(1, continuation);
        this.f6745c = q10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new D(this.f6745c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((D) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        e0 e0Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f6744b;
        Q q10 = this.f6745c;
        try {
        } catch (Throwable th2) {
            d0 g10 = q10.g();
            this.f6743a = th2;
            this.f6744b = 2;
            Integer a3 = g10.a();
            if (a3 != coroutine_suspended) {
                th = th2;
                obj = a3;
            }
        }
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f6744b = 1;
            obj = Q.f(q10, true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException(StubApp.getString2(275));
                }
                th = this.f6743a;
                ResultKt.throwOnFailure(obj);
                e0Var = new V(th, ((Number) obj).intValue());
                return TuplesKt.to(e0Var, Boxing.boxBoolean(true));
            }
            ResultKt.throwOnFailure(obj);
        }
        e0Var = (e0) obj;
        return TuplesKt.to(e0Var, Boxing.boxBoolean(true));
    }
}
