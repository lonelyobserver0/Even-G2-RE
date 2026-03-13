package T;

import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class J extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f6772b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0288d f6773c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(Function2 function2, C0288d c0288d, Continuation continuation) {
        super(2, continuation);
        this.f6772b = (SuspendLambda) function2;
        this.f6773c = c0288d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new J(this.f6772b, this.f6773c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f6771a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Object obj2 = this.f6773c.f6840b;
        this.f6771a = 1;
        Object invoke = this.f6772b.invoke(obj2, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }
}
