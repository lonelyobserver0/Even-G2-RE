package L5;

import Qb.I;
import Tb.InterfaceC0327h;
import Tb.Q;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public n f4236a;

    /* renamed from: b, reason: collision with root package name */
    public int f4237b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f4238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, Continuation continuation) {
        super(2, continuation);
        this.f4238c = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f4238c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n nVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f4237b;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            n nVar2 = this.f4238c;
            InterfaceC0327h data = nVar2.f4251a.getData();
            this.f4236a = nVar2;
            this.f4237b = 1;
            Object i10 = Q.i(data, this);
            if (i10 == coroutine_suspended) {
                return coroutine_suspended;
            }
            nVar = nVar2;
            obj = i10;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            nVar = this.f4236a;
            ResultKt.throwOnFailure(obj);
        }
        n.a(nVar, new X.b(MapsKt.toMutableMap(((X.b) obj).a()), true));
        return Unit.INSTANCE;
    }
}
