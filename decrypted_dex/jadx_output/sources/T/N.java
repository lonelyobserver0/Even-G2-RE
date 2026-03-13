package T;

import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class N extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6784a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6785b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q f6786c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Q q10, Continuation continuation) {
        super(2, continuation);
        this.f6786c = q10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        N n10 = new N(this.f6786c, continuation);
        n10.f6785b = obj;
        return n10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((U) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f6784a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            U u2 = (U) this.f6785b;
            this.f6784a = 1;
            if (Q.c(this.f6786c, u2, this) == coroutine_suspended) {
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
