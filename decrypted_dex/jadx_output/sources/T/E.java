package T;

import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class E extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f6746a;

    /* renamed from: b, reason: collision with root package name */
    public int f6747b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f6748c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f6749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6750e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Q q10, int i3, Continuation continuation) {
        super(2, continuation);
        this.f6749d = q10;
        this.f6750e = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        E e10 = new E(this.f6749d, this.f6750e, continuation);
        e10.f6748c = ((Boolean) obj).booleanValue();
        return e10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((E) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i3;
        boolean z2;
        e0 e0Var;
        boolean z10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z11 = this.f6747b;
        Q q10 = this.f6749d;
        try {
        } catch (Throwable th2) {
            if (z11 != 0) {
                d0 g10 = q10.g();
                this.f6746a = th2;
                this.f6748c = z11;
                this.f6747b = 2;
                Integer a3 = g10.a();
                if (a3 != coroutine_suspended) {
                    z2 = z11;
                    th = th2;
                    obj = a3;
                }
            } else {
                boolean z12 = z11;
                th = th2;
                i3 = this.f6750e;
                z2 = z12;
            }
        }
        if (z11 == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z13 = this.f6748c;
            this.f6748c = z13;
            this.f6747b = 1;
            obj = Q.f(q10, z13, this);
            z11 = z13;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (z11 != 1) {
                if (z11 != 2) {
                    throw new IllegalStateException(StubApp.getString2(275));
                }
                z2 = this.f6748c;
                th = this.f6746a;
                ResultKt.throwOnFailure(obj);
                i3 = ((Number) obj).intValue();
                V v2 = new V(th, i3);
                z10 = z2;
                e0Var = v2;
                return TuplesKt.to(e0Var, Boxing.boxBoolean(z10));
            }
            boolean z14 = this.f6748c;
            ResultKt.throwOnFailure(obj);
            z11 = z14;
        }
        e0Var = (e0) obj;
        z10 = z11;
        return TuplesKt.to(e0Var, Boxing.boxBoolean(z10));
    }
}
