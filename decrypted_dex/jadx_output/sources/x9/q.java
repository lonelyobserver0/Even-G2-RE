package x9;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f23043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23044b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, int i3, Continuation continuation) {
        super(2, continuation);
        this.f23043a = tVar;
        this.f23044b = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new q(this.f23043a, this.f23044b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        t tVar = this.f23043a;
        return tVar.f23081t.invoke(Boxing.boxInt(this.f23044b), tVar.f23071i, new y9.d(y9.u.j, y9.u.f23617k, y9.u.f23618l, y9.u.f23619m, y9.u.f23620n, y9.u.f23621p, y9.u.f23622q));
    }
}
