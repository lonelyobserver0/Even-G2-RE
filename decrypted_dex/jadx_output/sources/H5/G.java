package H5;

import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class G extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f2766b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(N n10, Continuation continuation) {
        super(2, continuation);
        this.f2766b = n10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new G(this.f2766b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f2765a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            N n10 = this.f2766b;
            Z9.C c10 = n10.f2785d;
            F f10 = new F(n10, 0);
            this.f2765a = 1;
            if (c10.p(f10, this) == coroutine_suspended) {
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
