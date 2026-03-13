package l7;

import Qb.I;
import Qb.L;
import Tb.InterfaceC0327h;
import i5.C1059c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: l7.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1240j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1059c f16763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f16764c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240j(C1059c c1059c, r rVar, Continuation continuation) {
        super(2, continuation);
        this.f16763b = c1059c;
        this.f16764c = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1240j c1240j = new C1240j(this.f16763b, this.f16764c, continuation);
        c1240j.f16762a = obj;
        return c1240j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1240j) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        I i3 = (I) this.f16762a;
        C1059c c1059c = this.f16763b;
        InterfaceC0327h interfaceC0327h = (InterfaceC0327h) c1059c.f14847f;
        r rVar = this.f16764c;
        L.j(i3, null, new C1233c(interfaceC0327h, c1059c, null, rVar), 3);
        L.j(i3, null, new C1238h(interfaceC0327h, c1059c, null, rVar), 3);
        L.j(i3, null, new C1239i(interfaceC0327h, rVar, null), 3);
        return Unit.INSTANCE;
    }
}
