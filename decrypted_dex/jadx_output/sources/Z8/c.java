package Z8;

import Qb.I;
import com.google.gson.GsonBuilder;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directionsrefresh.v1.DirectionsRefreshAdapterFactory;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.PointAsCoordinatesTypeAdapter;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F6.b f9044a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(F6.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f9044a = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f9044a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        F6.b bVar = this.f9044a;
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        gsonBuilder.registerTypeAdapter(Point.class, new PointAsCoordinatesTypeAdapter());
        gsonBuilder.registerTypeAdapterFactory(DirectionsRefreshAdapterFactory.a());
        return gsonBuilder.create().toJson(bVar);
    }
}
