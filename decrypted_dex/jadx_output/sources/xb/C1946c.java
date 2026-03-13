package xb;

import Qb.I;
import Qb.L;
import i5.C1059c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xb.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1946c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1059c f23143b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1946c(C1059c c1059c, Continuation continuation) {
        super(2, continuation);
        this.f23143b = c1059c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1946c c1946c = new C1946c(this.f23143b, continuation);
        c1946c.f23142a = obj;
        return c1946c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1946c) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        I i3 = (I) this.f23142a;
        C1059c c1059c = this.f23143b;
        L.j(i3, null, new C1944a(c1059c, null), 3);
        L.j(i3, null, new C1945b(c1059c, null), 3);
        return Unit.INSTANCE;
    }
}
