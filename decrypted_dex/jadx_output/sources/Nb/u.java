package Nb;

import Qb.I;
import Qb.InterfaceC0221t0;
import Qb.L;
import Tb.C0330k;
import Z9.C;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class u extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5032a;

    /* renamed from: b, reason: collision with root package name */
    public long f5033b;

    /* renamed from: c, reason: collision with root package name */
    public int f5034c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f5036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ E0 f5037f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(c cVar, E0 e02, Continuation continuation) {
        super(2, continuation);
        this.f5036e = cVar;
        this.f5037f = e02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        u uVar = new u(this.f5036e, this.f5037f, continuation);
        uVar.f5035d = obj;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC0221t0 j;
        int i3;
        long j3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f5034c;
        c cVar = this.f5036e;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            j = L.j((I) this.f5035d, null, new C0330k(new C(29, cVar.f4981i, new t(this.f5037f, null)), null), 3);
            int length = cVar.f4973a.length;
            long currentTimeMillis = System.currentTimeMillis();
            this.f5035d = j;
            this.f5032a = length;
            this.f5033b = currentTimeMillis;
            this.f5034c = 1;
            if (c.a(cVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i3 = length;
            j3 = currentTimeMillis;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            j3 = this.f5033b;
            i3 = this.f5032a;
            j = (InterfaceC0221t0) this.f5035d;
            ResultKt.throwOnFailure(obj);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - j3;
        cVar.f4978f.n(StubApp.getString2(25420) + i3 + StubApp.getString2(25421) + currentTimeMillis2 + StubApp.getString2(25422) + (i3 / (currentTimeMillis2 + 1.0f)) + StubApp.getString2(25423));
        j.d(null);
        return Unit.INSTANCE;
    }
}
