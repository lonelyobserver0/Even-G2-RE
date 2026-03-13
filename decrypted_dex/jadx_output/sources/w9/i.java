package w9;

import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewRenderRouteLineClearDataValue;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineClearValue;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22165a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        i iVar = new i(2, continuation);
        iVar.f22165a = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((RouteLineClearValue) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        RouteLineClearValue routeLineClearValue = (RouteLineClearValue) this.f22165a;
        Intrinsics.checkNotNullParameter(routeLineClearValue, "<this>");
        return new RouteLineViewRenderRouteLineClearDataValue(routeLineClearValue.getPrimaryRouteSource(), routeLineClearValue.getAlternativeRoutesSources$ui_maps_release(), routeLineClearValue.getWaypointsSource());
    }
}
