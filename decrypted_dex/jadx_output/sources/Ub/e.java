package Ub;

import Qb.AbstractC0231z;
import Qb.I;
import Tb.InterfaceC0328i;
import Tb.Q;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7578a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328i f7580c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f7581d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC0328i interfaceC0328i, g gVar, Continuation continuation) {
        super(2, continuation);
        this.f7580c = interfaceC0328i;
        this.f7581d = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f7580c, this.f7581d, continuation);
        eVar.f7579b = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f7578a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            I i10 = (I) this.f7579b;
            g gVar = this.f7581d;
            int i11 = gVar.f7586b;
            if (i11 == -3) {
                i11 = -2;
            }
            Function2 fVar = new f(gVar, null);
            Sb.u uVar = new Sb.u(AbstractC0231z.b(i10, gVar.f7585a), Ec.l.a(i11, gVar.f7587c, 4));
            uVar.Y(3, uVar, fVar);
            this.f7578a = 1;
            Object h2 = Q.h(this.f7580c, uVar, true, this);
            if (h2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                h2 = Unit.INSTANCE;
            }
            if (h2 == coroutine_suspended) {
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
