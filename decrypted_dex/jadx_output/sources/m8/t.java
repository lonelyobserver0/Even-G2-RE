package m8;

import android.util.LruCache;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.common.LoggingLevel;
import com.stub.StubApp;
import i8.C1063a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class t implements q8.e {

    /* renamed from: a, reason: collision with root package name */
    public List f17249a;

    /* renamed from: b, reason: collision with root package name */
    public List f17250b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Collection] */
    @Override // q8.e
    public final void a(q8.g result) {
        ?? r22;
        String joinToString$default;
        String joinToString$default2;
        List list;
        Intrinsics.checkNotNullParameter(result, "result");
        List list2 = result.f20095a;
        this.f17249a = list2;
        if (list2.isEmpty() && ((list = this.f17250b) == null || list.isEmpty())) {
            i8.d dVar = i8.d.f14937a;
            android.support.v4.media.session.b.i();
            return;
        }
        i8.d dVar2 = i8.d.f14937a;
        List list3 = result.f20095a;
        ArrayList arrayList = new ArrayList(CollectionsKt.f(list3));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.mapbox.navigation.base.route.g) it.next()).f12498a);
        }
        List list4 = this.f17250b;
        if (list4 != null) {
            r22 = new ArrayList(CollectionsKt.f(list4));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                r22.add(((com.mapbox.navigation.base.route.g) it2.next()).f12498a);
            }
        } else {
            r22 = 0;
        }
        if (r22 == 0) {
            r22 = CollectionsKt.emptyList();
        }
        List routes = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) r22);
        Intrinsics.checkNotNullParameter(dVar2, "<this>");
        Intrinsics.checkNotNullParameter(routes, "routes");
        i8.d dVar3 = i8.d.f14937a;
        Intrinsics.checkNotNullParameter(routes, "routes");
        String string2 = StubApp.getString2(21153);
        synchronized (i8.d.f14939c) {
            try {
                String string22 = StubApp.getString2("21154");
                if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
                    StringBuilder sb2 = new StringBuilder(string2);
                    joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(i8.d.f14940d, StubApp.getString2("321"), null, null, 0, null, i8.c.f14934b, 30, null);
                    sb2.append(joinToString$default);
                    sb2.append(StubApp.getString2("21155"));
                    joinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(routes, StubApp.getString2("321"), null, null, 0, null, i8.c.f14935c, 30, null);
                    sb2.append(joinToString$default2);
                    sb2.append(StubApp.getString2("21156"));
                    D9.l.d(sb2.toString(), string22);
                }
                ArrayList arrayList2 = i8.d.f14940d;
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    C1063a c1063a = (C1063a) next;
                    if (routes == null || !routes.isEmpty()) {
                        Iterator it4 = routes.iterator();
                        while (it4.hasNext()) {
                            if (Oc.a.x(c1063a.f14928a, (DirectionsRoute) it4.next())) {
                                break;
                            }
                        }
                    }
                    arrayList3.add(next);
                }
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    C1063a c1063a2 = (C1063a) it5.next();
                    String string23 = StubApp.getString2("21154");
                    if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(StubApp.getString2("21157"));
                        i8.d dVar4 = i8.d.f14937a;
                        sb3.append(i8.d.d(c1063a2.f14928a));
                        D9.l.d(sb3.toString(), string23);
                    }
                    DirectionsRoute directionsRoute = c1063a2.f14928a;
                    List<RouteLeg> legs = directionsRoute.legs();
                    if (legs != null) {
                        Intrinsics.checkNotNullExpressionValue(legs, "legs()");
                        Iterator it6 = legs.iterator();
                        while (it6.hasNext()) {
                            List<LegStep> steps = ((RouteLeg) it6.next()).steps();
                            if (steps != null) {
                                Intrinsics.checkNotNullExpressionValue(steps, "steps()");
                                Iterator it7 = steps.iterator();
                                while (it7.hasNext()) {
                                    String geometry = ((LegStep) it7.next()).geometry();
                                    if (geometry != null) {
                                        LruCache lruCache = i8.d.f14939c;
                                        i8.d dVar5 = i8.d.f14937a;
                                        lruCache.remove(TuplesKt.to(geometry, Integer.valueOf(i8.d.c(directionsRoute))));
                                    }
                                }
                            }
                        }
                    }
                    i8.d.f14940d.remove(c1063a2);
                }
                LruCache lruCache2 = i8.d.f14939c;
                Iterator it8 = i8.d.f14940d.iterator();
                int i3 = 0;
                while (it8.hasNext()) {
                    i3 += ((C1063a) it8.next()).f14930c;
                }
                lruCache2.resize(RangesKt.coerceAtLeast(i3, 1));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(L8.f update) {
        Intrinsics.checkNotNullParameter(update, "update");
        L8.c cVar = update.f4318b;
        this.f17250b = cVar != null ? cVar.f4299a : null;
        List list = cVar != null ? cVar.f4299a : null;
        if ((list == null || list.isEmpty()) && this.f17249a.isEmpty()) {
            i8.d dVar = i8.d.f14937a;
            android.support.v4.media.session.b.i();
        }
    }
}
