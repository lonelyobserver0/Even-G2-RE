package q8;

import Ac.t;
import D9.l;
import Qb.L;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.MapboxOptionsImpl;
import com.mapbox.navigation.base.route.j;
import com.mapbox.navigator.GetRouteOptions;
import com.mapbox.navigator.GetRouteOrigin;
import com.mapbox.navigator.GetRouteReason;
import com.mapbox.navigator.GetRouteSignature;
import com.mapbox.navigator.RouterDataRefCallback;
import com.mapbox.navigator.RouterInterface;
import com.mapbox.navigator.RouterOrigin;
import com.stub.StubApp;
import i5.C1059c;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import m8.G;
import wc.m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final C1059c f20089a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f20090b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet f20091c;

    /* renamed from: d, reason: collision with root package name */
    public g f20092d;

    /* renamed from: e, reason: collision with root package name */
    public int f20093e;

    public d(C1059c router) {
        Intrinsics.checkNotNullParameter(router, "router");
        this.f20089a = router;
        this.f20090b = new CopyOnWriteArraySet();
        this.f20091c = new CopyOnWriteArraySet();
    }

    public final List a() {
        List list;
        g gVar = this.f20092d;
        return (gVar == null || (list = gVar.f20095a) == null) ? CollectionsKt.emptyList() : list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Long, java.lang.Object] */
    public final long b(final RouteOptions routeOptions, E8.c signature, final j callback) {
        IntProgression step;
        int i3;
        String str;
        C1059c c1059c;
        GetRouteReason getRouteReason;
        GetRouteOrigin getRouteOrigin;
        int i10;
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(callback, "routerCallback");
        C1059c c1059c2 = this.f20089a;
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String service = StubApp.getString2(2878);
        Intrinsics.checkNotNullParameter(service, "service");
        String tokenForService = MapboxOptionsImpl.getTokenForService(service);
        Intrinsics.checkNotNullExpressionValue(tokenForService, "getTokenForService(service)");
        final String url = routeOptions.toUrl(tokenForService).toString();
        Intrinsics.checkNotNullExpressionValue(url, "routeOptions.toUrl(accessToken).toString()");
        GetRouteOptions getRouteOptions = new GetRouteOptions(null);
        Intrinsics.checkNotNullParameter(url, "<this>");
        String name = StubApp.getString2(5151);
        Intrinsics.checkNotNullParameter(name, "queryParameterName");
        Intrinsics.checkNotNullParameter(url, "<this>");
        t tVar = new t();
        tVar.e(null, url);
        wc.t a3 = tVar.a();
        Intrinsics.checkNotNullParameter(a3, "<this>");
        Intrinsics.checkNotNullParameter(name, "queryParameterName");
        Intrinsics.checkNotNullParameter(name, "name");
        ArrayList arrayList = a3.f22423f;
        if (arrayList == null) {
            str = null;
            i3 = 2;
        } else {
            step = RangesKt___RangesKt.step(RangesKt.until(0, arrayList.size()), 2);
            i3 = 2;
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
                while (true) {
                    int i11 = first + step2;
                    if (Intrinsics.areEqual(name, arrayList.get(first))) {
                        str = (String) arrayList.get(first + 1);
                        break;
                    }
                    if (first == last) {
                        break;
                    }
                    first = i11;
                }
            }
            str = null;
        }
        if (str != null) {
            t f10 = a3.f();
            Intrinsics.checkNotNullParameter(name, "name");
            ArrayList arrayList2 = (ArrayList) f10.f396h;
            String string2 = StubApp.getString2(22322);
            if (arrayList2 == null) {
                c1059c = c1059c2;
            } else {
                String b2 = m.b(name, 0, 0, string2, 219);
                ArrayList arrayList3 = (ArrayList) f10.f396h;
                Intrinsics.checkNotNull(arrayList3);
                int size = arrayList3.size() - 2;
                c1059c = c1059c2;
                int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
                if (progressionLastElement <= size) {
                    while (true) {
                        int i12 = size - 2;
                        ArrayList arrayList4 = (ArrayList) f10.f396h;
                        Intrinsics.checkNotNull(arrayList4);
                        if (Intrinsics.areEqual(b2, arrayList4.get(size))) {
                            ArrayList arrayList5 = (ArrayList) f10.f396h;
                            Intrinsics.checkNotNull(arrayList5);
                            i10 = i12;
                            arrayList5.remove(size + 1);
                            ArrayList arrayList6 = (ArrayList) f10.f396h;
                            Intrinsics.checkNotNull(arrayList6);
                            arrayList6.remove(size);
                            ArrayList arrayList7 = (ArrayList) f10.f396h;
                            Intrinsics.checkNotNull(arrayList7);
                            if (arrayList7.isEmpty()) {
                                f10.f396h = null;
                                break;
                            }
                        } else {
                            i10 = i12;
                        }
                        if (size == progressionLastElement) {
                            break;
                        }
                        size = i10;
                    }
                }
            }
            Intrinsics.checkNotNullParameter(name, "name");
            if (((ArrayList) f10.f396h) == null) {
                f10.f396h = new ArrayList();
            }
            ArrayList arrayList8 = (ArrayList) f10.f396h;
            Intrinsics.checkNotNull(arrayList8);
            arrayList8.add(m.b(name, 0, 0, string2, 219));
            ArrayList arrayList9 = (ArrayList) f10.f396h;
            Intrinsics.checkNotNull(arrayList9);
            arrayList9.add(m.b(StubApp.getString2(22323), 0, 0, string2, 219));
            a3 = f10.a();
        } else {
            c1059c = c1059c2;
        }
        final URL url2 = new URL(a3.f22425h);
        if (l.a(l.g(), LoggingLevel.DEBUG)) {
            l.d(StubApp.getString2(22324) + url2, StubApp.getString2(1068));
        }
        final RouterInterface j = c1059c.j();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        E7.a aVar = E7.a.f1927a;
        E7.a.c(StubApp.getString2(1928));
        final long m1480markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
        signature.getClass();
        int ordinal = signature.f1936a.ordinal();
        if (ordinal == 0) {
            getRouteReason = GetRouteReason.NEW_ROUTE;
        } else if (ordinal == 1) {
            getRouteReason = GetRouteReason.REROUTE_BY_DEVIATION;
        } else {
            if (ordinal != i3) {
                throw new NoWhenBranchMatchedException();
            }
            getRouteReason = GetRouteReason.REROUTE_OTHER;
        }
        int ordinal2 = signature.f1937b.ordinal();
        if (ordinal2 == 0) {
            getRouteOrigin = GetRouteOrigin.PLATFORM_SDK;
        } else {
            if (ordinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            getRouteOrigin = GetRouteOrigin.CUSTOMER;
        }
        final C1059c c1059c3 = c1059c;
        ?? valueOf = Long.valueOf(j.getRoute(url, getRouteOptions, new GetRouteSignature(getRouteReason, getRouteOrigin, ""), new RouterDataRefCallback() { // from class: E8.j
            @Override // com.mapbox.navigator.RouterDataRefCallback
            public final void run(Expected result, RouterOrigin origin) {
                Ref.BooleanRef callbackInvoked = Ref.BooleanRef.this;
                Intrinsics.checkNotNullParameter(callbackInvoked, "$callbackInvoked");
                C1059c this$0 = c1059c3;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                URL urlWithoutToken = url2;
                Intrinsics.checkNotNullParameter(urlWithoutToken, "$urlWithoutToken");
                Ref.ObjectRef id = objectRef;
                Intrinsics.checkNotNullParameter(id, "$id");
                RouteOptions routeOptions2 = routeOptions;
                Intrinsics.checkNotNullParameter(routeOptions2, "$routeOptions");
                String routeUrl = url;
                Intrinsics.checkNotNullParameter(routeUrl, "$routeUrl");
                RouterInterface originRouter = j;
                Intrinsics.checkNotNullParameter(originRouter, "$originRouter");
                com.mapbox.navigation.base.route.j callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(origin, "origin");
                callbackInvoked.element = true;
                if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
                    D9.l.d(StubApp.getString2(1902) + urlWithoutToken + StubApp.getString2(1903) + origin, StubApp.getString2(1068));
                }
                L.j(((D9.f) ((Lazy) this$0.f14847f).getValue()).f1513b, null, new s(m1480markNowz9LOYto, this$0, id, routeOptions2, routeUrl, urlWithoutToken, originRouter, result, origin, callback2, null), 3);
            }
        }));
        objectRef.element = valueOf;
        if (!booleanRef.element) {
            ((LinkedHashMap) c1059c3.f14845d).put(valueOf, new E8.e(new E8.t(m1480markNowz9LOYto, callback, routeOptions)));
        }
        return ((Number) objectRef.element).longValue();
    }

    public final void c(C1527b routes) {
        List list;
        Intrinsics.checkNotNullParameter(routes, "routes");
        G g10 = routes.f20086c;
        this.f20093e = Ec.l.p(g10);
        g gVar = this.f20092d;
        List list2 = routes.f20084a;
        if (gVar == null || (list = gVar.f20095a) == null || !list.isEmpty() || !list2.isEmpty()) {
            g gVar2 = new g(Ec.l.r(g10), list2, routes.f20085b);
            this.f20092d = gVar2;
            E7.a aVar = E7.a.f1927a;
            boolean a3 = E7.a.a();
            CopyOnWriteArraySet copyOnWriteArraySet = this.f20090b;
            if (!a3) {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a(gVar2);
                }
                return;
            }
            String string2 = StubApp.getString2(22325);
            E7.a.c(string2);
            try {
                long m1480markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                Iterator it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).a(gVar2);
                }
                Unit unit = Unit.INSTANCE;
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto));
                E7.a.b(string2);
            } catch (Throwable th) {
                E7.a.b(string2);
                throw th;
            }
        }
    }
}
