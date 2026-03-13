package i8;

import android.util.LruCache;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.utils.PolylineUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f14937a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final LruCache f14938b = new LruCache(3);

    /* renamed from: c, reason: collision with root package name */
    public static final LruCache f14939c = new LruCache(1);

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f14940d = new ArrayList();

    public static void a(DirectionsRoute directionsRoute, int i3) {
        int i10;
        int i11;
        int i12 = 0;
        List<RouteLeg> legs = directionsRoute.legs();
        if (legs != null) {
            Iterator<T> it = legs.iterator();
            i10 = 0;
            while (it.hasNext()) {
                List<LegStep> steps = ((RouteLeg) it.next()).steps();
                if (steps != null) {
                    Intrinsics.checkNotNullExpressionValue(steps, "steps()");
                    if (!steps.isEmpty()) {
                        Iterator<T> it2 = steps.iterator();
                        i11 = 0;
                        while (it2.hasNext()) {
                            if (((LegStep) it2.next()).geometry() != null && (i11 = i11 + 1) < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                        i10 += i11;
                    }
                }
                i11 = 0;
                i10 += i11;
            }
        } else {
            i10 = 0;
        }
        LruCache lruCache = f14939c;
        synchronized (lruCache) {
            try {
                ArrayList arrayList = f14940d;
                CollectionsKt__MutableCollectionsKt.removeAll((List) arrayList, (Function1) new C1064b(i3, 0, directionsRoute));
                if (arrayList.size() > 2) {
                    arrayList.remove(0);
                }
                arrayList.add(new C1063a(directionsRoute, i3, i10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    i12 += ((C1063a) it3.next()).f14930c;
                }
                lruCache.resize(RangesKt.coerceAtLeast(i12, 1));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static List b(LruCache lruCache, String str, int i3) {
        List<Point> list;
        String str2;
        if (str == null) {
            return CollectionsKt.emptyList();
        }
        synchronized (lruCache) {
            try {
                Pair pair = TuplesKt.to(str, Integer.valueOf(i3));
                list = (List) lruCache.get(pair);
                if (list == null) {
                    list = PolylineUtils.decode(str, i3);
                    lruCache.put(pair, list);
                    str2 = "decode(geometry, precision).also { put(key, it) }";
                } else {
                    str2 = "get(key) ?: PolylineUtil…on).also { put(key, it) }";
                }
                Intrinsics.checkNotNullExpressionValue(list, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    public static int c(DirectionsRoute directionsRoute) {
        RouteOptions routeOptions = directionsRoute.routeOptions();
        return Intrinsics.areEqual(routeOptions != null ? routeOptions.geometries() : null, "polyline") ? 5 : 6;
    }

    public static String d(DirectionsRoute directionsRoute) {
        return directionsRoute.requestUuid() + '#' + directionsRoute.routeIndex();
    }

    public static final List e(DirectionsRoute directionsRoute, LegStep legStep) {
        Intrinsics.checkNotNullParameter(directionsRoute, "<this>");
        Intrinsics.checkNotNullParameter(legStep, "legStep");
        int c10 = c(directionsRoute);
        a(directionsRoute, c10);
        return b(f14939c, legStep.geometry(), c10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    public static final List f(DirectionsRoute directionsRoute) {
        ?? r42;
        Intrinsics.checkNotNullParameter(directionsRoute, "<this>");
        int c10 = c(directionsRoute);
        a(directionsRoute, c10);
        List<RouteLeg> legs = directionsRoute.legs();
        ArrayList arrayList = null;
        if (legs != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.f(legs));
            Iterator it = legs.iterator();
            while (it.hasNext()) {
                List<LegStep> steps = ((RouteLeg) it.next()).steps();
                if (steps != null) {
                    Intrinsics.checkNotNullExpressionValue(steps, "steps()");
                    r42 = new ArrayList(CollectionsKt.f(steps));
                    Iterator it2 = steps.iterator();
                    while (it2.hasNext()) {
                        r42.add(b(f14939c, ((LegStep) it2.next()).geometry(), c10));
                    }
                } else {
                    r42 = 0;
                }
                if (r42 == 0) {
                    r42 = CollectionsKt.emptyList();
                }
                arrayList2.add(r42);
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }
}
