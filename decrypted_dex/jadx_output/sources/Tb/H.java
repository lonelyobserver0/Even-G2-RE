package Tb;

import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class H extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7278a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0327h f7280c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f7281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(InterfaceC0327h interfaceC0327h, P p8, Continuation continuation) {
        super(2, continuation);
        this.f7280c = interfaceC0327h;
        this.f7281d = p8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        H h2 = new H(this.f7280c, this.f7281d, continuation);
        h2.f7279b = obj;
        return h2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((T) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f7278a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            int ordinal = ((T) this.f7279b).ordinal();
            P p8 = this.f7281d;
            if (ordinal == 0) {
                this.f7278a = 1;
                if (this.f7280c.p(p8, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (ordinal == 2) {
                synchronized (p8) {
                    p8.u(p8.f7308l + p8.m(), p8.f7307k, p8.f7308l + p8.m(), p8.f7309m + p8.m() + p8.f7308l);
                    Unit unit = Unit.INSTANCE;
                }
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
