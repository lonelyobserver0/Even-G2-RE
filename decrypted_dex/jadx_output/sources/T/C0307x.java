package T;

import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: T.x, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0307x extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f6913b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0307x(H h2, Continuation continuation) {
        super(1, continuation);
        this.f6913b = h2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C0307x(this.f6913b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0307x) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f6912a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        this.f6912a = 1;
        Object invoke = this.f6913b.invoke(this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }
}
