package E8;

import android.os.SystemClock;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigator.RouterOrigin;
import com.stub.StubApp;
import i5.C1059c;
import java.net.URL;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f2007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataRef f2008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2009c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RouterOrigin f2010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q2.g f2011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ URL f2012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RouteOptions f2013g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1059c f2014h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(DataRef dataRef, String str, RouterOrigin routerOrigin, Q2.g gVar, URL url, RouteOptions routeOptions, C1059c c1059c, Continuation continuation) {
        super(1, continuation);
        this.f2008b = dataRef;
        this.f2009c = str;
        this.f2010d = routerOrigin;
        this.f2011e = gVar;
        this.f2012f = url;
        this.f2013g = routeOptions;
        this.f2014h = c1059c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new q(this.f2008b, this.f2009c, this.f2010d, this.f2011e, this.f2012f, this.f2013g, this.f2014h, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((q) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q qVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f2007a;
        RouterOrigin routerOrigin = this.f2010d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Xb.d dVar = D9.h.f1516d;
            DataRef responseBody = this.f2008b;
            Intrinsics.checkNotNullExpressionValue(responseBody, "responseBody");
            String p8 = Y3.a.p(routerOrigin);
            this.f2007a = 1;
            qVar = this;
            obj = Ec.l.s(dVar, responseBody, this.f2009c, p8, elapsedRealtime, qVar);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
            qVar = this;
        }
        Q2.g gVar = qVar.f2011e;
        ((Expected) obj).fold(new k(gVar, qVar.f2012f, routerOrigin, qVar.f2013g), new C2.e(routerOrigin, qVar.f2014h, gVar, 2));
        return Unit.INSTANCE;
    }
}
