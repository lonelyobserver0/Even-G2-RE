package T;

import Tb.InterfaceC0328i;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: T.p, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0300p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f6891b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0300p(Q q10, Continuation continuation) {
        super(2, continuation);
        this.f6891b = q10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0300p(this.f6891b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0300p) create((InterfaceC0328i) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f6890a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f6890a = 1;
            if (Q.d(this.f6891b, this) == coroutine_suspended) {
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
