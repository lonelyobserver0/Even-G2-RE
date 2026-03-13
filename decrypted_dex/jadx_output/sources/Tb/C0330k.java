package Tb;

import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: Tb.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0330k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z9.C f7369b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0330k(Z9.C c10, Continuation continuation) {
        super(2, continuation);
        this.f7369b = c10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0330k(this.f7369b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0330k) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f7368a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f7368a = 1;
            Object p8 = this.f7369b.p(Ub.t.f7614a, this);
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
