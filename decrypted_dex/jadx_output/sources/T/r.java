package T;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f6894b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(e0 e0Var, Continuation continuation) {
        super(2, continuation);
        this.f6894b = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        r rVar = new r(this.f6894b, continuation);
        rVar.f6893a = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((e0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        e0 e0Var = (e0) this.f6893a;
        return Boxing.boxBoolean((e0Var instanceof C0288d) && e0Var.f6848a <= this.f6894b.f6848a);
    }
}
