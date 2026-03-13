package l7;

import Tb.C0326g;
import Tb.InterfaceC0327h;
import Tb.InterfaceC0328i;
import Tb.L;
import Tb.d0;
import a0.C0379a;
import com.stub.StubApp;
import i5.C1059c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: l7.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1236f extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public int f16747a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ InterfaceC0328i f16748b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16749c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1059c f16750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0327h f16751e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1236f(Continuation continuation, C1059c c1059c, InterfaceC0327h interfaceC0327h) {
        super(3, continuation);
        this.f16750d = c1059c;
        this.f16751e = interfaceC0327h;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1236f c1236f = new C1236f((Continuation) obj3, this.f16750d, this.f16751e);
        c1236f.f16748b = (InterfaceC0328i) obj;
        c1236f.f16749c = obj2;
        return c1236f.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC0327h interfaceC0327h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f16747a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC0328i interfaceC0328i = this.f16748b;
            X6.s sVar = (X6.s) this.f16749c;
            int i10 = sVar == null ? -1 : AbstractC1235e.f16746a[sVar.ordinal()];
            if (i10 == -1) {
                interfaceC0327h = C0326g.f7360b;
            } else if (i10 == 1) {
                interfaceC0327h = (L) this.f16750d.f14846e;
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC0327h = new C0379a(this.f16751e, 15);
            }
            this.f16747a = 1;
            if (interfaceC0328i instanceof d0) {
                throw ((d0) interfaceC0328i).f7353a;
            }
            Object p8 = interfaceC0327h.p(interfaceC0328i, this);
            if (p8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                p8 = Unit.INSTANCE;
            }
            if (p8 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
