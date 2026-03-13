package x9;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: x9.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1931j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y9.h f23019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f23020b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1931j(y9.h hVar, t tVar, Continuation continuation) {
        super(2, continuation);
        this.f23019a = hVar;
        this.f23020b = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1931j(this.f23019a, this.f23020b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1931j) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        y9.h hVar = this.f23019a;
        r9.r rVar = r9.r.f20461a;
        t tVar = this.f23020b;
        return r9.r.d(hVar.f23574a, tVar.f23076o, true, tVar.f23063a);
    }
}
