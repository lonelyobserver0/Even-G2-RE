package j9;

import A9.l;
import Y.m;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.StepIntersection;
import com.mapbox.common.location.Location;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxMap;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import m9.C1287a;
import m9.C1289c;
import m9.EnumC1288b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e {

    /* renamed from: v, reason: collision with root package name */
    public static final Point f15391v = Point.fromLngLat(0.0d, 0.0d);

    /* renamed from: w, reason: collision with root package name */
    public static final EdgeInsets f15392w = new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final MapboxMap f15393a;

    /* renamed from: b, reason: collision with root package name */
    public final m9.e f15394b;

    /* renamed from: c, reason: collision with root package name */
    public final m f15395c;

    /* renamed from: d, reason: collision with root package name */
    public List f15396d;

    /* renamed from: e, reason: collision with root package name */
    public List f15397e;

    /* renamed from: f, reason: collision with root package name */
    public List f15398f;

    /* renamed from: g, reason: collision with root package name */
    public List f15399g;

    /* renamed from: h, reason: collision with root package name */
    public Location f15400h;

    /* renamed from: i, reason: collision with root package name */
    public List f15401i;
    public final g j;

    /* renamed from: k, reason: collision with root package name */
    public final g f15402k;

    /* renamed from: l, reason: collision with root package name */
    public final g f15403l;

    /* renamed from: m, reason: collision with root package name */
    public final g f15404m;

    /* renamed from: n, reason: collision with root package name */
    public final g f15405n;

    /* renamed from: o, reason: collision with root package name */
    public EdgeInsets f15406o;

    /* renamed from: p, reason: collision with root package name */
    public EdgeInsets f15407p;

    /* renamed from: q, reason: collision with root package name */
    public final List f15408q;

    /* renamed from: r, reason: collision with root package name */
    public f f15409r;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArraySet f15410s;

    /* renamed from: t, reason: collision with root package name */
    public final s2.d f15411t;

    /* renamed from: u, reason: collision with root package name */
    public l f15412u;

    public e(MapboxMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        EnumC1288b overviewMode = EnumC1288b.f17265a;
        Intrinsics.checkNotNullParameter(overviewMode, "overviewMode");
        m9.e overviewViewportDataSource = new m9.e(mapboxMap, new C1287a());
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(overviewViewportDataSource, "overviewViewportDataSource");
        this.f15393a = mapboxMap;
        this.f15394b = overviewViewportDataSource;
        m mVar = overviewViewportDataSource.f17275d;
        this.f15395c = mVar;
        this.f15396d = CollectionsKt.emptyList();
        this.f15397e = CollectionsKt.emptyList();
        this.f15398f = CollectionsKt.emptyList();
        this.f15399g = CollectionsKt.emptyList();
        this.f15401i = CollectionsKt.emptyList();
        Point NULL_ISLAND_POINT = f15391v;
        Intrinsics.checkNotNullExpressionValue(NULL_ISLAND_POINT, "NULL_ISLAND_POINT");
        g gVar = new g(NULL_ISLAND_POINT);
        this.j = gVar;
        ((C1099d) mVar.f8674b).getClass();
        g gVar2 = new g(4);
        this.f15402k = gVar2;
        g gVar3 = new g(0);
        this.f15403l = gVar3;
        ((C1099d) mVar.f8674b).getClass();
        g gVar4 = new g(45.0d);
        this.f15404m = gVar4;
        this.f15405n = new g(Boolean.FALSE);
        EdgeInsets edgeInsets = f15392w;
        this.f15406o = edgeInsets;
        this.f15407p = edgeInsets;
        this.f15408q = CollectionsKt.emptyList();
        CameraOptions build = new CameraOptions.Builder().center((Point) gVar.f()).zoom((Double) gVar2.f()).bearing((Double) gVar3.f()).pitch((Double) gVar4.f()).padding(this.f15407p).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .c…ing)\n            .build()");
        this.f15409r = new f(build, overviewViewportDataSource.f17286p);
        this.f15410s = new CopyOnWriteArraySet();
        this.f15411t = new s2.d(mapboxMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0346  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(j9.e r38) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.e.a(j9.e):void");
    }

    public final void b() {
        l lVar = this.f15412u;
        if (lVar != null) {
            lVar.cancel();
        }
        this.f15412u = null;
        this.f15396d = CollectionsKt.emptyList();
        this.f15397e = CollectionsKt.emptyList();
        this.f15401i = CollectionsKt.emptyList();
        m9.e eVar = this.f15394b;
        eVar.getClass();
        eVar.f17276e = CollectionsKt.emptyList();
        eVar.f17273b.z(CollectionsKt.emptyList());
        m9.d dVar = new m9.d(eVar, 1);
        if (eVar.f17285o) {
            dVar.invoke();
        }
        ((C1099d) this.f15395c.f8674b).getClass();
        this.f15404m.f10728b = Double.valueOf(45.0d);
        this.f15398f = CollectionsKt.emptyList();
        this.f15399g = CollectionsKt.emptyList();
        new HashMap();
        m9.d dVar2 = new m9.d(eVar, 0);
        if (eVar.f17285o) {
            dVar2.invoke();
        }
    }

    public final void c() {
        l lVar = this.f15412u;
        if (lVar != null) {
            lVar.cancel();
        }
        Ac.m action = new Ac.m(this, 16);
        s2.d dVar = this.f15411t;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        l lVar2 = new l();
        ((MapboxMap) dVar.f20712b).whenSizeReady(new A9.m(0, lVar2, action));
        this.f15412u = lVar2;
    }

    public final void d(com.mapbox.navigation.base.route.g route) {
        Intrinsics.checkNotNullParameter(route, "route");
        E7.a aVar = E7.a.f1927a;
        if (!E7.a.a()) {
            e(CollectionsKt.listOf(route));
            return;
        }
        String string2 = StubApp.getString2(19064);
        E7.a.c(string2);
        try {
            long m1480markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
            e(CollectionsKt.listOf(route));
            Unit unit = Unit.INSTANCE;
            Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto));
        } finally {
            E7.a.b(string2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    public final void e(List routes) {
        ?? emptyList;
        ?? emptyList2;
        Iterator it;
        List list;
        int i3;
        String str;
        ?? emptyList3;
        List list2;
        int i10;
        RouteLeg routeLeg;
        int i11;
        String str2;
        LineString lineString;
        Iterator it2;
        ?? emptyList4;
        double d8;
        int i12;
        Iterator it3;
        Intrinsics.checkNotNullParameter(routes, "routes");
        if (routes.isEmpty()) {
            b();
            return;
        }
        if (Oc.a.d(routes, this.f15396d)) {
            return;
        }
        b();
        this.f15396d = routes;
        m9.e eVar = this.f15394b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(routes, "routes");
        if (!Oc.a.d(eVar.f17276e, routes)) {
            eVar.f17276e = routes;
            C1289c c1289c = new C1289c(routes, eVar);
            if (eVar.f17285o) {
                c1289c.invoke();
            }
        }
        com.mapbox.navigation.base.route.g gVar = (com.mapbox.navigation.base.route.g) CollectionsKt.firstOrNull(routes);
        if (gVar == null) {
            return;
        }
        DirectionsRoute route = gVar.f12498a;
        Intrinsics.checkNotNullParameter(route, "route");
        List completeRoutePoints = i8.d.f(route);
        m mVar = this.f15395c;
        ((C1099d) mVar.f8674b).f15384c.getClass();
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(completeRoutePoints, "completeRoutePoints");
        List<RouteLeg> legs = route.legs();
        String string2 = StubApp.getString2(19065);
        if (legs != null) {
            emptyList = new ArrayList(CollectionsKt.f(legs));
            Iterator it4 = legs.iterator();
            int i13 = 0;
            while (it4.hasNext()) {
                Object next = it4.next();
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                List<LegStep> steps = ((RouteLeg) next).steps();
                if (steps != null) {
                    Intrinsics.checkNotNullExpressionValue(steps, string2);
                    emptyList4 = new ArrayList(CollectionsKt.f(steps));
                    Iterator it5 = steps.iterator();
                    int i15 = 0;
                    while (it5.hasNext()) {
                        Object next2 = it5.next();
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        List list3 = (List) ((List) completeRoutePoints.get(i13)).get(i15);
                        List createListBuilder = CollectionsKt.createListBuilder();
                        List<StepIntersection> intersections = ((LegStep) next2).intersections();
                        Iterator it6 = it4;
                        if (intersections != null) {
                            Intrinsics.checkNotNullExpressionValue(intersections, "intersections()");
                            Iterator it7 = intersections.iterator();
                            while (it7.hasNext()) {
                                createListBuilder.add(((StepIntersection) it7.next()).location());
                            }
                        }
                        createListBuilder.add(CollectionsKt.last(list3));
                        List build = CollectionsKt.build(createListBuilder);
                        List createListBuilder2 = CollectionsKt.createListBuilder();
                        createListBuilder2.add(CollectionsKt.first(list3));
                        createListBuilder2.addAll(build);
                        List build2 = CollectionsKt.build(createListBuilder2);
                        ArrayList arrayList = new ArrayList(CollectionsKt.f(build));
                        int i17 = 0;
                        for (Iterator it8 = build.iterator(); it8.hasNext(); it8 = it8) {
                            Object next3 = it8.next();
                            int i18 = i17 + 1;
                            if (i17 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            arrayList.add(Double.valueOf(Y3.a.i((Point) next3, (Point) build2.get(i17), StubApp.getString2(2709)) * 1000.0d));
                            build2 = build2;
                            i17 = i18;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            d8 = 20.0d;
                            if (!it9.hasNext()) {
                                break;
                            }
                            Object next4 = it9.next();
                            if (((Number) next4).doubleValue() > 20.0d) {
                                arrayList2.add(next4);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            i12 = i13;
                            it3 = it5;
                        } else {
                            Iterator it10 = arrayList2.iterator();
                            if (!it10.hasNext()) {
                                throw new UnsupportedOperationException(StubApp.getString2(19066));
                            }
                            Object next5 = it10.next();
                            while (it10.hasNext()) {
                                next5 = Double.valueOf(((Number) next5).doubleValue() + ((Number) it10.next()).doubleValue());
                            }
                            i12 = i13;
                            it3 = it5;
                            d8 = ((Number) next5).doubleValue() / arrayList2.size();
                        }
                        emptyList4.add(Double.valueOf(d8));
                        i13 = i12;
                        i15 = i16;
                        it4 = it6;
                        it5 = it3;
                    }
                    it2 = it4;
                } else {
                    it2 = it4;
                    emptyList4 = CollectionsKt.emptyList();
                }
                emptyList.add(emptyList4);
                i13 = i14;
                it4 = it2;
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        this.f15401i = emptyList;
        ((C1099d) mVar.f8674b).f15385d.getClass();
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(completeRoutePoints, "completeRoutePoints");
        List<RouteLeg> legs2 = route.legs();
        if (legs2 != null) {
            emptyList2 = new ArrayList(CollectionsKt.f(legs2));
            Iterator it11 = legs2.iterator();
            int i19 = 0;
            loop6: while (true) {
                if (!it11.hasNext()) {
                    break;
                }
                Object next6 = it11.next();
                int i20 = i19 + 1;
                if (i19 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                RouteLeg routeLeg2 = (RouteLeg) next6;
                List<LegStep> steps2 = routeLeg2.steps();
                if (steps2 != null) {
                    Intrinsics.checkNotNullExpressionValue(steps2, string2);
                    emptyList3 = new ArrayList(CollectionsKt.f(steps2));
                    int i21 = 0;
                    for (Object obj : steps2) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        List<LegStep> steps3 = routeLeg2.steps();
                        if (steps3 == null) {
                            steps3 = CollectionsKt.emptyList();
                        } else {
                            Intrinsics.checkNotNullExpressionValue(steps3, "leg.steps() ?: emptyList()");
                        }
                        List list4 = (List) completeRoutePoints.get(i19);
                        if (steps3.size() != list4.size()) {
                            D9.l.e(StubApp.getString2(19067), StubApp.getString2(19063));
                            emptyList2 = CollectionsKt.emptyList();
                            break loop6;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        int size = list4.size();
                        Iterator it12 = it11;
                        int i23 = i21;
                        int i24 = i22;
                        while (i24 < size && steps3.get(i24).distance() <= 150.0d) {
                            arrayList3.addAll((Collection) list4.get(i24));
                            int i25 = i24;
                            i24++;
                            i23 = i25;
                        }
                        List<Point> emptyList5 = CollectionsKt.emptyList();
                        if (i23 < list4.size() - 1) {
                            List<Point> coordinates = LineString.fromLngLats((List<Point>) list4.get(i23 + 1)).coordinates();
                            if (coordinates.size() < 2) {
                                throw new H9.b(StubApp.getString2(19069) + coordinates.size() + StubApp.getString2(1));
                            }
                            ArrayList arrayList4 = new ArrayList(2);
                            double d10 = 0.0d;
                            int i26 = 0;
                            while (i26 < coordinates.size() && (0.0d < d10 || i26 != coordinates.size() - 1)) {
                                if (d10 <= 0.0d || arrayList4.size() != 0) {
                                    list2 = completeRoutePoints;
                                    i10 = i19;
                                    routeLeg = routeLeg2;
                                    i11 = i20;
                                    str2 = string2;
                                } else {
                                    list2 = completeRoutePoints;
                                    i10 = i19;
                                    double d11 = 0.0d - d10;
                                    if (d11 == 0.0d) {
                                        arrayList4.add(coordinates.get(i26));
                                        lineString = LineString.fromLngLats(arrayList4);
                                        routeLeg = routeLeg2;
                                        i11 = i20;
                                        str2 = string2;
                                        break;
                                    }
                                    routeLeg = routeLeg2;
                                    i11 = i20;
                                    str2 = string2;
                                    arrayList4.add(Y3.a.h(coordinates.get(i26), d11, Y3.a.b(coordinates.get(i26), coordinates.get(i26 - 1)) - 180.0d));
                                }
                                if (d10 >= 100.0d) {
                                    double d12 = 100.0d - d10;
                                    if (d12 == 0.0d) {
                                        arrayList4.add(coordinates.get(i26));
                                        lineString = LineString.fromLngLats(arrayList4);
                                    } else {
                                        arrayList4.add(Y3.a.h(coordinates.get(i26), d12, Y3.a.b(coordinates.get(i26), coordinates.get(i26 - 1)) - 180.0d));
                                        lineString = LineString.fromLngLats(arrayList4);
                                    }
                                } else {
                                    if (d10 >= 0.0d) {
                                        arrayList4.add(coordinates.get(i26));
                                    }
                                    if (i26 == coordinates.size() - 1) {
                                        lineString = LineString.fromLngLats(arrayList4);
                                        break;
                                    }
                                    Point point = coordinates.get(i26);
                                    i26++;
                                    d10 = Y3.a.i(point, coordinates.get(i26), StubApp.getString2(2707)) + d10;
                                    completeRoutePoints = list2;
                                    i19 = i10;
                                    i20 = i11;
                                    routeLeg2 = routeLeg;
                                    string2 = str2;
                                }
                            }
                            list2 = completeRoutePoints;
                            i10 = i19;
                            routeLeg = routeLeg2;
                            i11 = i20;
                            str2 = string2;
                            if (d10 < 0.0d) {
                                throw new H9.b(StubApp.getString2(19068));
                            }
                            lineString = LineString.fromLngLats(arrayList4);
                            emptyList5 = lineString.coordinates();
                            Intrinsics.checkNotNullExpressionValue(emptyList5, "lineSliceAlong(\n        …          ).coordinates()");
                        } else {
                            list2 = completeRoutePoints;
                            i10 = i19;
                            routeLeg = routeLeg2;
                            i11 = i20;
                            str2 = string2;
                        }
                        emptyList3.add(CollectionsKt___CollectionsKt.plus((Collection) arrayList3, (Iterable) emptyList5));
                        i21 = i22;
                        completeRoutePoints = list2;
                        it11 = it12;
                        i19 = i10;
                        i20 = i11;
                        routeLeg2 = routeLeg;
                        string2 = str2;
                    }
                    it = it11;
                    list = completeRoutePoints;
                    i3 = i20;
                    str = string2;
                } else {
                    it = it11;
                    list = completeRoutePoints;
                    i3 = i20;
                    str = string2;
                    emptyList3 = CollectionsKt.emptyList();
                }
                emptyList2.add(emptyList3);
                completeRoutePoints = list;
                it11 = it;
                i19 = i3;
                string2 = str;
            }
        } else {
            emptyList2 = CollectionsKt.emptyList();
        }
        this.f15397e = emptyList2;
    }
}
