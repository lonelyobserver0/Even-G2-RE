package x9;

import com.mapbox.maps.Style;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.stub.StubApp;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class y extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f23104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f23105c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Style f23106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RouteLineViewOptionsData f23107e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(I i3, Pair pair, Style style, RouteLineViewOptionsData routeLineViewOptionsData, Continuation continuation) {
        super(2, continuation);
        this.f23104b = i3;
        this.f23105c = pair;
        this.f23106d = style;
        this.f23107e = routeLineViewOptionsData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new y(this.f23104b, this.f23105c, this.f23106d, this.f23107e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f23103a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Pair pair = this.f23105c;
        Intrinsics.checkNotNull(pair);
        Object second = pair.getSecond();
        Intrinsics.checkNotNull(second);
        String str = (String) pair.getFirst();
        I i10 = this.f23104b;
        i10.getClass();
        w wVar = new w((K) second, i10, this.f23107e, this.f23106d, str, null);
        this.f23103a = 1;
        Object invoke = wVar.invoke(this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }
}
