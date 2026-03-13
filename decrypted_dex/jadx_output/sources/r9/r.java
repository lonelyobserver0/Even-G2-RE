package r9;

import a.AbstractC0378a;
import android.util.LruCache;
import com.google.android.gms.internal.measurement.F1;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.maps.Style;
import com.mapbox.maps.StyleObjectInfo;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import y9.AbstractC1978a;
import y9.C1979b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f20461a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f20462b;

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f20463c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f20464d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f20465e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f20466f;

    /* renamed from: g, reason: collision with root package name */
    public static final Set f20467g;

    /* renamed from: h, reason: collision with root package name */
    public static final Set f20468h;

    /* renamed from: i, reason: collision with root package name */
    public static final Set f20469i;
    public static final Set j;

    /* renamed from: k, reason: collision with root package name */
    public static final Map f20470k;

    /* renamed from: l, reason: collision with root package name */
    public static final f f20471l;

    /* renamed from: m, reason: collision with root package name */
    public static final A9.i f20472m;

    /* renamed from: n, reason: collision with root package name */
    public static final A9.g f20473n;

    /* renamed from: o, reason: collision with root package name */
    public static final d f20474o;

    /* renamed from: p, reason: collision with root package name */
    public static final A9.g f20475p;

    /* renamed from: q, reason: collision with root package name */
    public static final f f20476q;

    static {
        Lazy lazy = LazyKt.lazy(g.f20428b);
        f20462b = lazy;
        Lazy lazy2 = LazyKt.lazy(g.f20429c);
        f20463c = lazy2;
        String sourceId = StubApp.getString2(22760);
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        f20464d = sourceId;
        Intrinsics.checkNotNullParameter("mapbox-layerGroup:2:Source", "sourceId");
        f20465e = "mapbox-layerGroup:2:Source";
        Intrinsics.checkNotNullParameter("mapbox-layerGroup:3:Source", "sourceId");
        f20466f = "mapbox-layerGroup:3:Source";
        Set of = SetsKt.setOf((Object[]) new String[]{StubApp.getString2(22763), StubApp.getString2(22764), StubApp.getString2(22765), StubApp.getString2(22761), StubApp.getString2(22762), StubApp.getString2(22766), StubApp.getString2(22767)});
        f20467g = of;
        Set of2 = SetsKt.setOf((Object[]) new String[]{StubApp.getString2(22770), StubApp.getString2(22771), StubApp.getString2(22772), StubApp.getString2(22768), StubApp.getString2(22769), StubApp.getString2(22773), StubApp.getString2(22774)});
        f20468h = of2;
        Set of3 = SetsKt.setOf((Object[]) new String[]{StubApp.getString2(22777), StubApp.getString2(22778), StubApp.getString2(22779), StubApp.getString2(22775), StubApp.getString2(22776), StubApp.getString2(22780), StubApp.getString2(22781)});
        f20469i = of3;
        j = SetsKt.setOf((Object[]) new String[]{StubApp.getString2(22784), StubApp.getString2(22785), StubApp.getString2(22782), StubApp.getString2(22783), StubApp.getString2(22786), StubApp.getString2(22787)});
        f20470k = MapsKt.mapOf(new Pair(new y9.r(sourceId), of), new Pair(new y9.r("mapbox-layerGroup:2:Source"), of2), new Pair(new y9.r("mapbox-layerGroup:3:Source"), of3));
        f20471l = f.f20425c;
        LruCache cache = (LruCache) lazy.getValue();
        f fVar = f.f20424b;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(cache, "cache");
        f20472m = new A9.i(fVar, cache);
        d dVar = d.f20409d;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        f20473n = new A9.g(dVar);
        f20474o = d.f20408c;
        LruCache cache2 = (LruCache) lazy2.getValue();
        d dVar2 = d.f20410e;
        Intrinsics.checkNotNullParameter(dVar2, "<this>");
        Intrinsics.checkNotNullParameter(cache2, "cache");
        f20475p = new A9.g(dVar2, cache2);
        f20476q = f.f20426d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final N6.d a(java.util.List r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 0
            if (r10 == 0) goto L86
            java.lang.String r10 = "routeLineExpressionData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r10)
            N6.a r10 = new N6.a
            r1 = 22788(0x5904, float:3.1933E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r10.<init>(r1)
            r10.d()
            r9.g r1 = new r9.g
            r2 = 2
            r1.<init>(r0, r2)
            r2 = 0
            java.util.List r8 = f(r2, r8, r1)
            java.util.Iterator r1 = r8.iterator()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = r0
        L2b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L81
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L3c
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L3c:
            y9.c r4 = (y9.c) r4
            int r6 = kotlin.collections.CollectionsKt.getLastIndex(r8)
            if (r3 != r6) goto L46
        L44:
            r6 = r0
            goto L57
        L46:
            if (r9 < 0) goto L52
            int r6 = r4.f23550b
            if (r6 == r9) goto L52
            boolean r6 = r4.f23556c
            if (r6 == 0) goto L44
            r6 = r12
            goto L57
        L52:
            boolean r6 = r4.f23556c
            if (r6 == 0) goto L44
            r6 = r11
        L57:
            r7 = 2303(0x8ff, float:3.227E-42)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            if (r3 != 0) goto L70
            r10.c(r6)
            r9.h r2 = new r9.h
            r3 = 2
            r2.<init>(r6, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            r2.invoke(r10)
            goto L7e
        L70:
            if (r6 == r2) goto L7f
            i8.b r2 = new i8.b
            r3 = 2
            r2.<init>(r6, r3, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            r2.invoke(r10)
        L7e:
            r2 = r6
        L7f:
            r3 = r5
            goto L2b
        L81:
            N6.d r8 = r10.b()
            return r8
        L86:
            N6.d r8 = a.AbstractC0378a.a(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.r.a(java.util.List, int, boolean, int, int):N6.d");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0110, code lost:
    
        if (java.lang.Math.abs(((java.lang.Number) r4).doubleValue() - ((java.lang.Number) r5).doubleValue()) < 1.0E-6d) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0112, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0114, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0134, code lost:
    
        if (java.lang.Math.abs(((java.lang.Number) r4).floatValue() - ((java.lang.Number) r5).floatValue()) < 1.0E-6f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x025f, code lost:
    
        if (r3 == null) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.mapbox.maps.Style r10, java.lang.String r11, double r12, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.r.b(com.mapbox.maps.Style, java.lang.String, double, boolean, boolean):void");
    }

    public static N6.d c(List scalingValues) {
        Intrinsics.checkNotNullParameter(scalingValues, "scalingValues");
        N6.a aVar = new N6.a(StubApp.getString2(22797));
        d block = d.f20407b;
        Intrinsics.checkNotNullParameter(block, "block");
        N6.a aVar2 = new N6.a(StubApp.getString2(22751));
        block.invoke(aVar2);
        aVar.a(aVar2.b());
        aVar.h();
        Iterator it = scalingValues.iterator();
        while (it.hasNext()) {
            e block2 = new e((y9.q) it.next(), 1);
            Intrinsics.checkNotNullParameter(block2, "block");
            block2.invoke(aVar);
        }
        return aVar.b();
    }

    public static List d(com.mapbox.navigation.base.route.g route, CopyOnWriteArrayList trafficOverrideRoadClasses, boolean z2, MapboxRouteLineApiOptions staticOptions) {
        String str;
        String str2;
        y9.u j3;
        boolean contains;
        List<String> annotationsList;
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(trafficOverrideRoadClasses, "trafficBackfillRoadClasses");
        Intrinsics.checkNotNullParameter(staticOptions, "options");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(staticOptions, "staticOptions");
        RouteOptions routeOptions = route.f12498a.routeOptions();
        List annotationExpressionData = (List) f20471l.invoke(route, (routeOptions == null || (annotationsList = routeOptions.annotationsList()) == null || !annotationsList.contains(StubApp.getString2(370))) ? f20474o : (Function1) f20473n.invoke(staticOptions));
        boolean isEmpty = annotationExpressionData.isEmpty();
        if (isEmpty) {
            if (isEmpty) {
                return CollectionsKt.listOf(new y9.n(0.0d, "", j("", z2), 0));
            }
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(annotationExpressionData, "annotationExpressionData");
        Intrinsics.checkNotNullParameter(trafficOverrideRoadClasses, "trafficOverrideRoadClasses");
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : annotationExpressionData) {
            int i10 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C1979b c1979b = (C1979b) obj;
            if (Intrinsics.areEqual(c1979b.f23552b, "unknown")) {
                contains = CollectionsKt___CollectionsKt.contains(trafficOverrideRoadClasses, c1979b.f23553c);
                if (contains) {
                    str = StubApp.getString2(347);
                    str2 = str;
                    j3 = j(str2, z2);
                    if (i3 != 0 || c1979b.f23555e) {
                        arrayList.add(new y9.n(c1979b.f23551a, str2, j3, c1979b.f23554d));
                    } else if (j3 != ((y9.n) CollectionsKt.last((List) arrayList)).f23591d) {
                        arrayList.add(new y9.n(c1979b.f23551a, str2, j3, c1979b.f23554d));
                    }
                    i3 = i10;
                }
            }
            str = c1979b.f23552b;
            str2 = str;
            j3 = j(str2, z2);
            if (i3 != 0) {
            }
            arrayList.add(new y9.n(c1979b.f23551a, str2, j3, c1979b.f23554d));
            i3 = i10;
        }
        return arrayList;
    }

    public static StylePropertyValue e(double d8, List routeLineExpressionData, int i3, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(routeLineExpressionData, "routeLineExpressionData");
        return k(d8, routeLineExpressionData, i3, i10, i11, new h(i12, 0));
    }

    public static List f(double d8, List routeLineExpressionData, Function0 defaultObjectCreator) {
        List plus;
        Intrinsics.checkNotNullParameter(routeLineExpressionData, "routeLineExpressionData");
        Intrinsics.checkNotNullParameter(defaultObjectCreator, "defaultObjectCreator");
        ArrayList arrayList = new ArrayList();
        Iterator it = routeLineExpressionData.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i10 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            double d10 = ((AbstractC1978a) next).f23549a;
            if (d10 > d8) {
                AbstractC1978a abstractC1978a = (AbstractC1978a) CollectionsKt.getOrNull(routeLineExpressionData, i10);
                if (!Intrinsics.areEqual(d10, abstractC1978a != null ? Double.valueOf(abstractC1978a.f23549a) : null)) {
                    arrayList.add(next);
                }
            }
            i3 = i10;
        }
        boolean isEmpty = arrayList.isEmpty();
        if (isEmpty) {
            boolean isEmpty2 = routeLineExpressionData.isEmpty();
            if (isEmpty2) {
                plus = CollectionsKt.listOf(defaultObjectCreator.invoke());
            } else {
                if (isEmpty2) {
                    throw new NoWhenBranchMatchedException();
                }
                plus = CollectionsKt.listOf(((AbstractC1978a) CollectionsKt.last(routeLineExpressionData)).a(d8));
            }
        } else {
            if (isEmpty) {
                throw new NoWhenBranchMatchedException();
            }
            int indexOf = routeLineExpressionData.indexOf(CollectionsKt.first((List) arrayList));
            plus = CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt.listOf((indexOf == 0 ? (AbstractC1978a) routeLineExpressionData.get(indexOf) : (AbstractC1978a) routeLineExpressionData.get(indexOf - 1)).a(d8)), (Iterable) arrayList);
        }
        List asReversedMutable = CollectionsKt.asReversedMutable(CollectionsKt.toMutableList((Collection) plus));
        double d11 = 1.0d - ((AbstractC1978a) CollectionsKt.last(asReversedMutable)).f23549a;
        for (int lastIndex = CollectionsKt.getLastIndex(asReversedMutable); lastIndex > 0; lastIndex--) {
            asReversedMutable.set(lastIndex, ((AbstractC1978a) asReversedMutable.get(lastIndex)).a(1.0d - ((AbstractC1978a) asReversedMutable.get(lastIndex - 1)).f23549a));
        }
        AbstractC1978a abstractC1978a2 = (AbstractC1978a) CollectionsKt.getOrNull(asReversedMutable, 1);
        if (Intrinsics.areEqual(abstractC1978a2 != null ? Double.valueOf(abstractC1978a2.f23549a) : null, 0.0d)) {
            asReversedMutable.remove(0);
        } else {
            asReversedMutable.set(0, ((AbstractC1978a) asReversedMutable.get(0)).a(0.0d));
        }
        asReversedMutable.add(((AbstractC1978a) defaultObjectCreator.invoke()).a(d11));
        return asReversedMutable;
    }

    public static Set g(Style style, Map sourceLayerMap) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(sourceLayerMap, "sourceLayerMap");
        String n10 = n(style);
        if (n10 != null) {
            Set emptySet = f20467g.contains(n10) ? (Set) sourceLayerMap.get(new y9.r(f20464d)) : f20468h.contains(n10) ? (Set) sourceLayerMap.get(new y9.r(f20465e)) : f20469i.contains(n10) ? (Set) sourceLayerMap.get(new y9.r(f20466f)) : SetsKt.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
        }
        return SetsKt.emptySet();
    }

    public static S6.f h(Style style, String layerId) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        P6.c p8 = F1.p(style, layerId);
        if (p8 != null) {
            return p8.h();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r5 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] i(java.util.List r5) {
        /*
            if (r5 == 0) goto L4e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        Lb:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r5.next()
            com.mapbox.api.directions.v5.models.LegStep r1 = (com.mapbox.api.directions.v5.models.LegStep) r1
            java.util.List r1 = r1.intersections()
            if (r1 == 0) goto Lb
            r0.add(r1)
            goto Lb
        L21:
            java.util.List r5 = kotlin.collections.CollectionsKt.flatten(r0)
            if (r5 == 0) goto L4e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L30:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r5.next()
            r2 = r1
            com.mapbox.api.directions.v5.models.StepIntersection r2 = (com.mapbox.api.directions.v5.models.StepIntersection) r2
            java.lang.Integer r2 = r2.geometryIndex()
            if (r2 == 0) goto L30
            r0.add(r1)
            goto L30
        L47:
            java.util.List r5 = kotlin.collections.CollectionsKt.toList(r0)
            if (r5 == 0) goto L4e
            goto L52
        L4e:
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
        L52:
            boolean r0 = r5.isEmpty()
            r1 = r0 ^ 1
            r2 = 1
            if (r1 != r2) goto Lc2
            java.lang.Object r0 = kotlin.collections.CollectionsKt.last(r5)
            com.mapbox.api.directions.v5.models.StepIntersection r0 = (com.mapbox.api.directions.v5.models.StepIntersection) r0
            java.lang.Integer r0 = r0.geometryIndex()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.intValue()
            int r0 = r0 + r2
            java.lang.String[] r1 = new java.lang.String[r0]
            java.util.Iterator r5 = r5.iterator()
        L73:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto Lc1
            java.lang.Object r2 = r5.next()
            com.mapbox.api.directions.v5.models.StepIntersection r2 = (com.mapbox.api.directions.v5.models.StepIntersection) r2
            com.mapbox.api.directions.v5.models.MapboxStreetsV8 r3 = r2.mapboxStreetsV8()
            if (r3 == 0) goto L8a
            java.lang.String r3 = r3.roadClass()
            goto L8b
        L8a:
            r3 = 0
        L8b:
            if (r3 != 0) goto L94
            r3 = 22798(0x590e, float:3.1947E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
        L94:
            java.lang.Integer r4 = r2.geometryIndex()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r4 = r4.intValue()
            if (r4 >= r0) goto Laf
            java.lang.Integer r2 = r2.geometryIndex()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r2 = r2.intValue()
            r1[r2] = r3
            goto L73
        Laf:
            r2 = 22799(0x590f, float:3.1948E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r3 = 22758(0x58e6, float:3.1891E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            D9.l.e(r2, r3)
            goto L73
        Lc1:
            return r1
        Lc2:
            if (r0 == 0) goto Lc8
            r5 = 0
            java.lang.String[] r5 = new java.lang.String[r5]
            return r5
        Lc8:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.r.i(java.util.List):java.lang.String[]");
    }

    public static y9.u j(String congestionValue, boolean z2) {
        Intrinsics.checkNotNullParameter(congestionValue, "congestionValue");
        String string2 = StubApp.getString2(1551);
        String string22 = StubApp.getString2(18601);
        String string23 = StubApp.getString2(349);
        String string24 = StubApp.getString2(350);
        String string25 = StubApp.getString2(351);
        String string26 = StubApp.getString2(347);
        String string27 = StubApp.getString2(348);
        if (z2) {
            switch (congestionValue.hashCode()) {
                case -1357520532:
                    if (congestionValue.equals(string2)) {
                        return y9.u.f23615g;
                    }
                    break;
                case -1297282981:
                    if (congestionValue.equals(string22)) {
                        return y9.u.f23616h;
                    }
                    break;
                case -905723276:
                    if (congestionValue.equals(string23)) {
                        return y9.u.f23613e;
                    }
                    break;
                case -618857213:
                    if (congestionValue.equals(string24)) {
                        return y9.u.f23611c;
                    }
                    break;
                case -284840886:
                    if (congestionValue.equals(string25)) {
                        return y9.u.f23614f;
                    }
                    break;
                case 107348:
                    if (congestionValue.equals(string26)) {
                        return y9.u.f23610b;
                    }
                    break;
                case 99152071:
                    if (congestionValue.equals(string27)) {
                        return y9.u.f23612d;
                    }
                    break;
            }
            return y9.u.f23609a;
        }
        if (z2) {
            throw new NoWhenBranchMatchedException();
        }
        switch (congestionValue.hashCode()) {
            case -1357520532:
                if (congestionValue.equals(string2)) {
                    return y9.u.f23629y;
                }
                break;
            case -1297282981:
                if (congestionValue.equals(string22)) {
                    return y9.u.f23630z;
                }
                break;
            case -905723276:
                if (congestionValue.equals(string23)) {
                    return y9.u.f23627w;
                }
                break;
            case -618857213:
                if (congestionValue.equals(string24)) {
                    return y9.u.f23625t;
                }
                break;
            case -284840886:
                if (congestionValue.equals(string25)) {
                    return y9.u.f23628x;
                }
                break;
            case 107348:
                if (congestionValue.equals(string26)) {
                    return y9.u.f23624s;
                }
                break;
            case 99152071:
                if (congestionValue.equals(string27)) {
                    return y9.u.f23626v;
                }
                break;
        }
        return y9.u.f23623r;
    }

    public static StylePropertyValue k(double d8, List list, int i3, int i10, int i11, Function1 function1) {
        N6.a aVar = new N6.a(StubApp.getString2(22788));
        aVar.d();
        List f10 = f(d8, list, new n(d8));
        int i12 = IntCompanionObject.MAX_VALUE;
        int i13 = 0;
        for (Object obj : f10) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            y9.n nVar = (y9.n) obj;
            if (nVar.f23549a < 1.0d) {
                int i15 = i13 == CollectionsKt.getLastIndex(f10) ? i3 : ((Boolean) function1.invoke(Integer.valueOf(nVar.f23550b))).booleanValue() ? i11 : i10;
                String string2 = StubApp.getString2(2303);
                if (i13 == 0) {
                    aVar.c(i15);
                    h hVar = new h(i15, 3);
                    Intrinsics.checkNotNullParameter(hVar, string2);
                    hVar.invoke(aVar);
                } else if (i15 != i12) {
                    m mVar = new m(nVar, i15, 0);
                    Intrinsics.checkNotNullParameter(mVar, string2);
                    mVar.invoke(aVar);
                }
                i12 = i15;
            }
            i13 = i14;
        }
        return new StylePropertyValue(aVar.b(), StylePropertyValueKind.EXPRESSION);
    }

    public static StylePropertyValue l(double d8, int i3) {
        N6.d a3;
        if (d8 > 0.0d) {
            N6.a aVar = new N6.a(StubApp.getString2(22788));
            aVar.d();
            aVar.c(i3);
            o block = new o(d8, 0);
            Intrinsics.checkNotNullParameter(block, "block");
            block.invoke(aVar);
            a3 = aVar.b();
        } else {
            a3 = AbstractC0378a.a(i3);
        }
        return new StylePropertyValue(a3, StylePropertyValueKind.EXPRESSION);
    }

    public static StylePropertyValue m(int i3) {
        return new StylePropertyValue(AbstractC0378a.a(i3), StylePropertyValueKind.EXPRESSION);
    }

    public static String n(Style style) {
        Object m40constructorimpl;
        Object next;
        String string2 = StubApp.getString2(5287);
        Intrinsics.checkNotNullParameter(style, "style");
        try {
            Result.Companion companion = Result.INSTANCE;
            List<StyleObjectInfo> styleLayers = style.getStyleLayers();
            List<StyleObjectInfo> subList = styleLayers.subList(styleLayers.indexOf(new StyleObjectInfo(StubApp.getString2("22801"), string2)), styleLayers.indexOf(new StyleObjectInfo(StubApp.getString2("22800"), string2)));
            ArrayList arrayList = new ArrayList();
            for (Object obj : subList) {
                if (!j.contains(((StyleObjectInfo) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Object next2 = it.next();
                int i10 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList2.add(new Pair(Integer.valueOf(i3), ((StyleObjectInfo) next2).getId()));
                i3 = i10;
            }
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int intValue = ((Number) ((Pair) next).getFirst()).intValue();
                    do {
                        Object next3 = it2.next();
                        int intValue2 = ((Number) ((Pair) next3).getFirst()).intValue();
                        if (intValue < intValue2) {
                            next = next3;
                            intValue = intValue2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            Pair pair = (Pair) next;
            m40constructorimpl = Result.m40constructorimpl(pair != null ? (String) pair.getSecond() : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m40constructorimpl = Result.m40constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m46isFailureimpl(m40constructorimpl) ? null : m40constructorimpl);
    }

    public static N6.d o(com.mapbox.navigation.base.route.g route, MapboxRouteLineApiOptions staticOptions, RouteLineViewOptionsData dynamicData, CopyOnWriteArrayList trafficBackfillRoadClasses, double d8) {
        y9.u lineColorType = y9.u.f23628x;
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(staticOptions, "staticOptions");
        Intrinsics.checkNotNullParameter(dynamicData, "dynamicData");
        Intrinsics.checkNotNullParameter(trafficBackfillRoadClasses, "trafficBackfillRoadClasses");
        Intrinsics.checkNotNullParameter(lineColorType, "lineColorType");
        List d10 = d(route, trafficBackfillRoadClasses, false, staticOptions);
        Double distance = route.f12498a.distance();
        Intrinsics.checkNotNullExpressionValue(distance, "route.directionsRoute.distance()");
        return p(dynamicData, d8, lineColorType, d10, distance.doubleValue());
    }

    public static N6.d p(RouteLineViewOptionsData dynamicData, double d8, y9.u lineColorType, List segments, double d10) {
        Intrinsics.checkNotNullParameter(dynamicData, "dynamicData");
        Intrinsics.checkNotNullParameter(lineColorType, "lineColorType");
        Intrinsics.checkNotNullParameter(segments, "segments");
        boolean displaySoftGradientForTraffic = dynamicData.getDisplaySoftGradientForTraffic();
        String string2 = StubApp.getString2(2303);
        if (!displaySoftGradientForTraffic) {
            N6.a aVar = new N6.a(StubApp.getString2(22788));
            aVar.d();
            List f10 = f(d8, segments, new q(d8, lineColorType, 0));
            int i3 = IntCompanionObject.MAX_VALUE;
            int i10 = 0;
            for (Object obj : f10) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                y9.n nVar = (y9.n) obj;
                int a3 = i10 == CollectionsKt.getLastIndex(f10) ? 0 : nVar.f23591d.a(dynamicData);
                if (i10 == 0) {
                    aVar.c(a3);
                    h hVar = new h(a3, 4);
                    Intrinsics.checkNotNullParameter(hVar, string2);
                    hVar.invoke(aVar);
                } else {
                    if (nVar.f23549a < 1.0d && a3 != i3) {
                        m mVar = new m(nVar, a3, 1);
                        Intrinsics.checkNotNullParameter(mVar, string2);
                        mVar.invoke(aVar);
                    }
                    i10 = i11;
                }
                i3 = a3;
                i10 = i11;
            }
            return aVar.b();
        }
        double softGradientTransition = dynamicData.getSoftGradientTransition() / d10;
        Intrinsics.checkNotNullParameter("interpolate", StubApp.getString2(22802));
        N6.c cVar = new N6.c("interpolate");
        cVar.f4929b.add(new N6.a(StubApp.getString2(22803)).b());
        cVar.d();
        List f11 = f(d8, segments, new q(d8, lineColorType, 1));
        int size = f11.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            y9.n nVar2 = (y9.n) f11.get(i13);
            if (i13 == 0) {
                E1.b bVar = new E1.b(6, nVar2, dynamicData);
                Intrinsics.checkNotNullParameter(bVar, string2);
                bVar.invoke(cVar);
            } else {
                int a9 = nVar2.f23591d.a(dynamicData);
                int a10 = ((y9.n) f11.get(i12)).f23591d.a(dynamicData);
                if (a10 != a9 || i13 == CollectionsKt.getLastIndex(f11)) {
                    if (((y9.n) f11.get(i12)).f23549a > 0.0d) {
                        double d11 = ((y9.n) f11.get(i12)).f23549a + softGradientTransition;
                        double d12 = nVar2.f23549a;
                        if (d11 >= d12) {
                            d11 = d12 - 1.0E-11d;
                        }
                        W6.a aVar2 = new W6.a(d11, a10);
                        Intrinsics.checkNotNullParameter(aVar2, string2);
                        aVar2.invoke(cVar);
                    }
                    m mVar2 = new m(nVar2, a10, 2);
                    Intrinsics.checkNotNullParameter(mVar2, string2);
                    mVar2.invoke(cVar);
                    i12 = i13;
                }
            }
        }
        return cVar.b();
    }

    public static double q(double d8) {
        double sin = Math.sin((d8 * 3.141592653589793d) / 180);
        double d10 = 1;
        double log = 0.5d - ((Math.log((d10 + sin) / (d10 - sin)) * 0.25d) / 3.141592653589793d);
        if (log < 0.0d) {
            return 0.0d;
        }
        if (log > 1.0d) {
            return 1.1d;
        }
        return log;
    }
}
