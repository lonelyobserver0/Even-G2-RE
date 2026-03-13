package w9;

import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewEvent;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewInitialOptionsValue;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f22172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RouteLineViewOptionsData f22173b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, RouteLineViewOptionsData routeLineViewOptionsData, Continuation continuation) {
        super(2, continuation);
        this.f22172a = nVar;
        this.f22173b = routeLineViewOptionsData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f22172a, this.f22173b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineContext) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return new RouteLineViewEvent(this.f22172a.f19796a, new RouteLineViewInitialOptionsValue(this.f22173b));
    }
}
