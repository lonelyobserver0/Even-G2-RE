package b3;

import Qb.K0;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b3.J, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0494J implements com.mapbox.navigation.base.route.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0498N f10521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K0 f10522b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0510l f10523c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RouteOptions f10524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f10525e;

    public C0494J(C0498N c0498n, K0 k02, C0510l c0510l, RouteOptions routeOptions, boolean z2) {
        this.f10521a = c0498n;
        this.f10522b = k02;
        this.f10523c = c0510l;
        this.f10524d = routeOptions;
        this.f10525e = z2;
    }

    @Override // com.mapbox.navigation.base.route.j
    public final void d(ArrayList routes, String routerOrigin) {
        Long valueOf;
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(routerOrigin, "routerOrigin");
        this.f10522b.d(null);
        boolean isEmpty = routes.isEmpty();
        C0510l c0510l = this.f10523c;
        if (isEmpty) {
            if (c0510l != null) {
                Result.Companion companion = Result.INSTANCE;
                c0510l.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(8944))))));
                return;
            }
            return;
        }
        com.mapbox.navigation.base.route.g gVar = (com.mapbox.navigation.base.route.g) CollectionsKt.firstOrNull((List) routes);
        DirectionsRoute directionsRoute = gVar != null ? gVar.f12498a : null;
        if (directionsRoute == null) {
            if (c0510l != null) {
                Result.Companion companion2 = Result.INSTANCE;
                c0510l.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(8945))))));
                return;
            }
            return;
        }
        Double distance = directionsRoute.distance();
        Long valueOf2 = distance != null ? Long.valueOf((long) distance.doubleValue()) : null;
        List<RouteLeg> legs = directionsRoute.legs();
        if (legs == null || legs.isEmpty()) {
            Double duration = directionsRoute.duration();
            valueOf = duration != null ? Long.valueOf((long) duration.doubleValue()) : null;
        } else {
            Iterator<T> it = legs.iterator();
            long j = 0;
            while (it.hasNext()) {
                Double duration2 = ((RouteLeg) it.next()).duration();
                j += duration2 != null ? (long) duration2.doubleValue() : 0L;
            }
            valueOf = Long.valueOf(j);
        }
        C0498N c0498n = this.f10521a;
        c0498n.getClass();
        String str = StubApp.getString2(8946) + this.f10524d.profile() + StubApp.getString2(8947) + c0498n.f10596v + StubApp.getString2(8948) + valueOf2 + StubApp.getString2(8949) + valueOf + StubApp.getString2(1313);
        String string2 = StubApp.getString2(103);
        R2.c.b(string2, str);
        c0498n.s().k(routes, 0, null);
        c0498n.f10598w = Y2.a.f8730a;
        if (this.f10525e) {
            R2.c.b(string2, StubApp.getString2(8950));
            Qb.L.j(c0498n.f10587q, null, new C0493I(c0498n, c0510l, null), 3);
            return;
        }
        R2.c.b(string2, StubApp.getString2(8951));
        if (c0510l != null) {
            Result.Companion companion3 = Result.INSTANCE;
            c0510l.invoke(Result.m39boximpl(Result.m40constructorimpl(Boolean.TRUE)));
        }
        c0498n.f10571d.n(new X2.i(c0498n.f10596v, valueOf, valueOf2));
    }

    @Override // com.mapbox.navigation.base.route.j
    public final void g(RouteOptions routeOptions, String routerOrigin) {
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        Intrinsics.checkNotNullParameter(routerOrigin, "routerOrigin");
        this.f10521a.getClass();
        R2.c.f(StubApp.getString2(103), StubApp.getString2(8952));
        this.f10522b.d(null);
        C0510l c0510l = this.f10523c;
        if (c0510l != null) {
            Result.Companion companion = Result.INSTANCE;
            c0510l.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(8953))))));
        }
    }

    @Override // com.mapbox.navigation.base.route.j
    public final void q(List reasons, RouteOptions routeOptions) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        this.f10521a.getClass();
        R2.c.f(StubApp.getString2(103), StubApp.getString2(8954) + ((com.mapbox.navigation.base.route.o) CollectionsKt.last(reasons)).f12518d + StubApp.getString2(397) + ((com.mapbox.navigation.base.route.o) CollectionsKt.last(reasons)).f12517c);
        this.f10522b.d(null);
        C0510l c0510l = this.f10523c;
        if (c0510l != null) {
            Result.Companion companion = Result.INSTANCE;
            c0510l.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new Exception(((com.mapbox.navigation.base.route.o) CollectionsKt.last(reasons)).f12517c)))));
        }
    }
}
