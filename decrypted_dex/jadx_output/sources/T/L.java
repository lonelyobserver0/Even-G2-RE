package T;

import Qb.C0215q;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class L extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6779a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q f6781c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f6782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(Q q10, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f6781c = q10;
        this.f6782d = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        L l9 = new L(this.f6781c, this.f6782d, continuation);
        l9.f6780b = obj;
        return l9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f6779a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Qb.I i10 = (Qb.I) this.f6780b;
        C0215q c0215q = new C0215q(true);
        c0215q.H(null);
        Q q10 = this.f6781c;
        U u2 = new U(this.f6782d, c0215q, q10.f6805h.u(), i10.h());
        Z z2 = q10.f6808l;
        Object j = z2.f6828c.j(u2);
        if (j instanceof Sb.k) {
            Sb.k kVar = (Sb.k) j;
            if (kVar == null) {
                kVar = null;
            }
            Throwable th = kVar != null ? kVar.f6714a : null;
            if (th == null) {
                throw new Sb.q(StubApp.getString2(6083));
            }
            throw th;
        }
        if (j instanceof Sb.l) {
            throw new IllegalStateException(StubApp.getString2(6068));
        }
        if (((AtomicInteger) z2.f6829d.f2238b).getAndIncrement() == 0) {
            Qb.L.j(z2.f6826a, null, new Y(z2, null), 3);
        }
        this.f6779a = 1;
        Object p8 = c0215q.p(this);
        return p8 == coroutine_suspended ? coroutine_suspended : p8;
    }
}
