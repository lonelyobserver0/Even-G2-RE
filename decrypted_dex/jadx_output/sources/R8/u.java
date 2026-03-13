package R8;

import com.stub.StubApp;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f6330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f6331c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f6332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Pair pair, long j, y yVar, Continuation continuation) {
        super(2, continuation);
        this.f6330b = pair;
        this.f6331c = j;
        this.f6332d = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.f6330b, this.f6331c, this.f6332d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f6329a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Pair pair = this.f6330b;
        u8.h hVar = (u8.h) pair.getSecond();
        C c10 = new C((com.mapbox.navigation.base.route.g) pair.getFirst(), hVar, E.f6265b);
        G8.b bVar = G8.b.f2456a;
        t tVar = new t(hVar, this.f6332d, pair, null);
        this.f6329a = 1;
        Object a3 = bVar.a(this.f6331c, c10, tVar, this);
        return a3 == coroutine_suspended ? coroutine_suspended : a3;
    }
}
