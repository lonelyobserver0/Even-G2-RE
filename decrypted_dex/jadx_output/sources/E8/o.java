package E8;

import Qb.I;
import com.google.gson.GsonBuilder;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directionsrefresh.v1.DirectionsRefreshAdapterFactory;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.navigator.RouteRefreshOptions;
import com.stub.StubApp;
import java.nio.ByteBuffer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import z7.C2014b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataRef f1993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.mapbox.navigation.base.route.g f1994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RouteRefreshOptions f1995c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2014b f1996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f1997e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(DataRef dataRef, com.mapbox.navigation.base.route.g gVar, RouteRefreshOptions routeRefreshOptions, C2014b c2014b, long j, Continuation continuation) {
        super(2, continuation);
        this.f1993a = dataRef;
        this.f1994b = gVar;
        this.f1995c = routeRefreshOptions;
        this.f1996d = c2014b;
        this.f1997e = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f1993a, this.f1994b, this.f1995c, this.f1996d, this.f1997e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Expected createError;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DataRef dataRef = this.f1993a;
        Intrinsics.checkNotNullExpressionValue(dataRef, "it");
        Intrinsics.checkNotNullParameter(dataRef, "dataRef");
        try {
            Intrinsics.checkNotNullParameter(dataRef, "<this>");
            ByteBuffer it = dataRef.getBuffer();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            String decodeToString = StringsKt.decodeToString(ByteStreamsKt.readBytes(new D9.c(it)));
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapterFactory(DirectionsRefreshAdapterFactory.a()).registerTypeAdapterFactory(DirectionsAdapterFactory.a());
            F6.d dVar = ((F6.b) gsonBuilder.create().fromJson(decodeToString, F6.b.class)).f2246d;
            createError = dVar != null ? ExpectedFactory.createValue(dVar) : ExpectedFactory.createError(new IllegalStateException(StubApp.getString2("1922")));
            Intrinsics.checkNotNullExpressionValue(createError, "{\n        /**\n         *…turned\"))\n        }\n    }");
        } catch (Throwable th) {
            createError = ExpectedFactory.createError(th);
            Intrinsics.checkNotNullExpressionValue(createError, "{\n        ExpectedFactory.createError(ex)\n    }");
        }
        final com.mapbox.navigation.base.route.g gVar = this.f1994b;
        final int i3 = 0;
        Expected onValue = createError.onValue(new Expected.Action() { // from class: E8.m
            @Override // com.mapbox.bindgen.Expected.Action
            public final void run(Object obj2) {
                switch (i3) {
                    case 0:
                        D9.l.d(StubApp.getString2(1909) + gVar.f12506i + ')', StubApp.getString2(1068));
                        break;
                    default:
                        D9.l.d(StubApp.getString2(1908) + gVar.f12506i + ')', StubApp.getString2(1068));
                        break;
                }
            }
        });
        final int i10 = 1;
        return onValue.onError(new Expected.Action() { // from class: E8.m
            @Override // com.mapbox.bindgen.Expected.Action
            public final void run(Object obj2) {
                switch (i10) {
                    case 0:
                        D9.l.d(StubApp.getString2(1909) + gVar.f12506i + ')', StubApp.getString2(1068));
                        break;
                    default:
                        D9.l.d(StubApp.getString2(1908) + gVar.f12506i + ')', StubApp.getString2(1068));
                        break;
                }
            }
        }).mapValue(new n(this.f1994b, this.f1995c, this.f1996d, this.f1997e, 0));
    }
}
