package w9;

import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineApiEvent;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineApiOptionsEventValue;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: w9.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1872b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f22146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapboxRouteLineApiOptions f22147b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1872b(d dVar, MapboxRouteLineApiOptions mapboxRouteLineApiOptions, Continuation continuation) {
        super(2, continuation);
        this.f22146a = dVar;
        this.f22147b = mapboxRouteLineApiOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1872b(this.f22146a, this.f22147b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1872b) create((CoroutineContext) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return new RouteLineApiEvent(this.f22146a.f19796a, new RouteLineApiOptionsEventValue(this.f22147b));
    }
}
