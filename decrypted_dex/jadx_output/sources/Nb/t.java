package Nb;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class t extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E0 f5031b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(E0 e02, Continuation continuation) {
        super(2, continuation);
        this.f5031b = e02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        t tVar = new t(this.f5031b, continuation);
        tVar.f5030a = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((h) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h hVar = (h) this.f5030a;
        ((Ab.j) ((Mb.b) ((Mb.a) this.f5031b.f16037b).f4727f)).f295b.J(hVar.f4992a, hVar.f4993b, hVar.f4994c);
        return Unit.INSTANCE;
    }
}
