package P8;

import Qb.L;
import com.stub.StubApp;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f5618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f5619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5620c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f5621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, long j, i iVar, Continuation continuation) {
        super(1, continuation);
        this.f5619b = list;
        this.f5620c = j;
        this.f5621d = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new g(this.f5619b, this.f5620c, this.f5621d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((g) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f5618a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Xb.d dVar = D9.h.f1516d;
        f fVar = new f(this.f5619b, this.f5620c, this.f5621d, null);
        this.f5618a = 1;
        Object n10 = L.n(dVar, fVar, this);
        return n10 == coroutine_suspended ? coroutine_suspended : n10;
    }
}
