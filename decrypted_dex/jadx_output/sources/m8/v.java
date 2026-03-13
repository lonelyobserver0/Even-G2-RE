package m8;

import Qb.C0203k;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import q8.AbstractC1526a;
import q8.C1527b;
import q8.C1528c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class v implements V8.C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17252a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f17253b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17254c;

    public v(q8.d directionsSession, d.y currentLegIndex) {
        Intrinsics.checkNotNullParameter(directionsSession, "directionsSession");
        Intrinsics.checkNotNullParameter(currentLegIndex, "currentLegIndex");
        this.f17253b = directionsSession;
        this.f17254c = currentLegIndex;
    }

    @Override // V8.C
    public final void a(P7.b routeProgress) {
        List emptyList;
        List emptyList2;
        switch (this.f17252a) {
            case 0:
                Intrinsics.checkNotNullParameter(routeProgress, "routeProgress");
                P7.a aVar = routeProgress.f5566e;
                u8.h hVar = new u8.h(aVar.f5553a, routeProgress.f5576p, Integer.valueOf(aVar.f5561i));
                Intrinsics.checkNotNullParameter(routeProgress, "<this>");
                Set<Map.Entry> entrySet = routeProgress.f5578r.entrySet();
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.f(entrySet)), 16));
                for (Map.Entry entry : entrySet) {
                    Pair pair = TuplesKt.to(entry.getKey(), new u8.h(((H7.a) entry.getValue()).f2930a, ((H7.a) entry.getValue()).f2932c, Integer.valueOf(((H7.a) entry.getValue()).f2933d)));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                u8.i iVar = new u8.i(hVar, linkedHashMap);
                C0203k c0203k = (C0203k) this.f17254c;
                if (c0203k != null) {
                    c0203k.resumeWith(Result.m40constructorimpl(iVar));
                }
                this.f17254c = null;
                this.f17253b = iVar;
                break;
            default:
                Intrinsics.checkNotNullParameter(routeProgress, "routeProgress");
                q8.d dVar = (q8.d) this.f17253b;
                List v2 = AbstractC1526a.v(dVar);
                if (!v2.isEmpty()) {
                    com.mapbox.navigation.base.route.g gVar = (com.mapbox.navigation.base.route.g) v2.get(0);
                    List drop = CollectionsKt.drop(v2, 1);
                    Intrinsics.checkNotNullParameter(routeProgress, "<this>");
                    LinkedHashMap linkedHashMap2 = routeProgress.f5578r;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        if (((H7.a) entry2.getValue()).f2935f) {
                            linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : drop) {
                        if (linkedHashMap3.containsKey(((com.mapbox.navigation.base.route.g) obj).f12506i)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
                    Iterator it = arrayList.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        String string2 = StubApp.getString2(21159);
                        if (!hasNext) {
                            q8.g gVar2 = dVar.f20092d;
                            if (gVar2 == null || (emptyList = gVar2.f20096b) == null) {
                                emptyList = CollectionsKt.emptyList();
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : emptyList) {
                                if (!Intrinsics.areEqual(((C1528c) obj2).f20088b, string2)) {
                                    arrayList3.add(obj2);
                                }
                            }
                            List plus = CollectionsKt___CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList3);
                            List listOf = CollectionsKt.listOf(gVar);
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj3 : drop) {
                                com.mapbox.navigation.base.route.g gVar3 = (com.mapbox.navigation.base.route.g) obj3;
                                if (plus == null || !plus.isEmpty()) {
                                    Iterator it2 = plus.iterator();
                                    while (it2.hasNext()) {
                                        if (Intrinsics.areEqual(((C1528c) it2.next()).f20087a.f12506i, gVar3.f12506i)) {
                                            break;
                                        }
                                    }
                                }
                                arrayList4.add(obj3);
                            }
                            List plus2 = CollectionsKt___CollectionsKt.plus((Collection) listOf, (Iterable) arrayList4);
                            C1527b c1527b = new C1527b(plus2, plus, new C1277A(((Number) ((d.y) this.f17254c).invoke()).intValue()));
                            q8.g gVar4 = dVar.f20092d;
                            if (gVar4 == null || (emptyList2 = gVar4.f20096b) == null) {
                                emptyList2 = CollectionsKt.emptyList();
                            }
                            if (!Intrinsics.areEqual(plus, emptyList2) || !Intrinsics.areEqual(plus2, dVar.a())) {
                                boolean isEmpty = plus.isEmpty();
                                String string22 = StubApp.getString2(21160);
                                if (!isEmpty) {
                                    D9.l.d(StubApp.getString2(21161) + plus, string22);
                                }
                                if (!Intrinsics.areEqual(plus2, dVar.a())) {
                                    D9.l.d(StubApp.getString2(21162) + plus2, string22);
                                }
                                dVar.c(c1527b);
                                break;
                            }
                        } else {
                            arrayList2.add(new C1528c((com.mapbox.navigation.base.route.g) it.next(), string2));
                        }
                    }
                }
                break;
        }
    }

    public v() {
        new u8.h(0, 0, null);
    }
}
