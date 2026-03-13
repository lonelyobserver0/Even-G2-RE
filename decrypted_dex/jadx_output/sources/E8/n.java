package E8;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.measurement.L1;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.api.directions.v5.models.Closure;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import com.mapbox.api.directions.v5.models.Incident;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.Notification;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BillingServiceError;
import com.mapbox.common.BillingServiceErrorCode;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.OnBillingServiceError;
import com.mapbox.common.SessionSKUIdentifier;
import com.mapbox.navigator.RouteRefreshOptions;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import q8.AbstractC1526a;
import z7.C2014b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class n implements Expected.Transformer, J3.b, X4.g, OnBillingServiceError {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1990c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1992e;

    public /* synthetic */ n(Object obj, Object obj2, long j, Object obj3, int i3) {
        this.f1988a = i3;
        this.f1990c = obj;
        this.f1991d = obj2;
        this.f1989b = j;
        this.f1992e = obj3;
    }

    @Override // X4.g
    public ScheduledFuture a(final A0.c cVar) {
        switch (this.f1988a) {
            case 2:
                X4.f fVar = (X4.f) this.f1990c;
                return fVar.f8397b.schedule(new X4.d(fVar, (Runnable) this.f1991d, cVar, 1), this.f1989b, (TimeUnit) this.f1992e);
            default:
                final X4.f fVar2 = (X4.f) this.f1990c;
                final Callable callable = (Callable) this.f1991d;
                return fVar2.f8397b.schedule(new Callable() { // from class: X4.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        f fVar3 = f.this;
                        int i3 = 24;
                        return fVar3.f8396a.submit(new Ab.b(i3, callable, cVar));
                    }
                }, this.f1989b, (TimeUnit) this.f1992e);
        }
    }

    @Override // J3.b
    public Object f() {
        H3.i iVar = (H3.i) this.f1990c;
        I3.h hVar = (I3.h) iVar.f2726c;
        hVar.getClass();
        Iterable iterable = (Iterable) this.f1991d;
        if (iterable.iterator().hasNext()) {
            String str = StubApp.getString2(1910) + I3.h.v(iterable);
            String string2 = StubApp.getString2(1911);
            SQLiteDatabase a3 = hVar.a();
            a3.beginTransaction();
            try {
                a3.compileStatement(str).execute();
                Cursor rawQuery = a3.rawQuery(string2, null);
                while (rawQuery.moveToNext()) {
                    try {
                        hVar.k(rawQuery.getInt(0), E3.c.f1887f, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                a3.compileStatement(StubApp.getString2("1912")).execute();
                a3.setTransactionSuccessful();
            } finally {
                a3.endTransaction();
            }
        }
        hVar.e(new I3.e(iVar.f2730g.f() + this.f1989b, (B3.j) this.f1992e));
        return null;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        boolean z2;
        ArrayList arrayList6;
        int i3;
        int i10;
        C2014b c2014b;
        ArrayList arrayList7;
        Integer num;
        ArrayList arrayList8;
        ArrayList arrayList9;
        String str;
        com.mapbox.navigation.base.route.g gVar;
        ArrayList arrayList10;
        int i11;
        F7.e eVar;
        ArrayList arrayList11;
        int i12;
        LegAnnotation build;
        ArrayList arrayList12;
        List<Notification> b2;
        Double duration;
        ArrayList arrayList13;
        com.mapbox.navigation.base.route.g gVar2;
        String str2;
        List<LegStep> list;
        ArrayList arrayList14;
        List<LegStep> list2;
        List<Double> duration2;
        double sumOfDouble;
        List<Double> duration3;
        Integer num2;
        JsonElement jsonElement;
        JsonObject asJsonObject;
        DirectionsWaypoint fromJson;
        F6.d routeRefresh = (F6.d) obj;
        Intrinsics.checkNotNullExpressionValue(routeRefresh, "routeRefresh");
        int legIndex = ((RouteRefreshOptions) this.f1991d).getLegIndex();
        C2014b c2014b2 = (C2014b) this.f1992e;
        com.mapbox.navigation.base.route.g gVar3 = (com.mapbox.navigation.base.route.g) this.f1990c;
        Intrinsics.checkNotNullParameter(gVar3, "<this>");
        Intrinsics.checkNotNullParameter(routeRefresh, "routeRefresh");
        HashMap c10 = E6.c.c(routeRefresh.a());
        JsonElement jsonElement2 = c10 != null ? (JsonElement) c10.get(StubApp.getString2(1913)) : null;
        if (jsonElement2 == null || !jsonElement2.isJsonArray()) {
            arrayList = null;
        } else {
            JsonArray array = jsonElement2.getAsJsonArray();
            Intrinsics.checkNotNullExpressionValue(array, "array");
            arrayList = new ArrayList(CollectionsKt.f(array));
            for (JsonElement waypointJson : array) {
                Intrinsics.checkNotNullExpressionValue(waypointJson, "waypointJson");
                if (waypointJson.isJsonObject()) {
                    asJsonObject = waypointJson.getAsJsonObject();
                    Intrinsics.checkNotNullExpressionValue(asJsonObject, "asJsonObject");
                } else {
                    F7.l.f2323a.getClass();
                    asJsonObject = new JsonObject();
                }
                if (asJsonObject.size() != 0) {
                    try {
                        fromJson = DirectionsWaypoint.fromJson(waypointJson.toString());
                    } catch (Throwable th) {
                        D9.l.e(StubApp.getString2(1914) + th.getLocalizedMessage(), null);
                    }
                    arrayList.add(fromJson);
                }
                fromJson = null;
                arrayList.add(fromJson);
            }
        }
        List list3 = routeRefresh.f2251b;
        if (list3 != null) {
            arrayList2 = new ArrayList(CollectionsKt.f(list3));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((F6.f) it.next()).f2260c);
            }
        } else {
            arrayList2 = null;
        }
        if (list3 != null) {
            arrayList3 = new ArrayList(CollectionsKt.f(list3));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((F6.f) it2.next()).f2259b);
            }
        } else {
            arrayList3 = null;
        }
        if (list3 != null) {
            arrayList4 = new ArrayList(CollectionsKt.f(list3));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((F6.f) it3.next()).f2261d);
            }
        } else {
            arrayList4 = null;
        }
        if (list3 != null) {
            arrayList5 = new ArrayList(CollectionsKt.f(list3));
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList5.add(((F6.f) it4.next()).f2262e);
            }
        } else {
            arrayList5 = null;
        }
        HashMap c11 = E6.c.c(routeRefresh.a());
        Integer valueOf = (c11 == null || (jsonElement = (JsonElement) c11.get(StubApp.getString2(1915))) == null) ? null : Integer.valueOf(jsonElement.getAsInt());
        F7.e incidentsRefresher = new F7.e(F7.a.f2274p, F7.a.f2275q, F7.a.f2276r, F7.a.f2277s, F7.d.f2285d, F7.d.f2286e);
        F7.e closuresRefresher = new F7.e(F7.a.f2270k, F7.a.f2271l, F7.a.f2272m, F7.a.f2273n, F7.d.f2283b, F7.d.f2284c);
        F7.c notificationsRefresher = new F7.c();
        String str3 = "RouteRefresh";
        Intrinsics.checkNotNullParameter(gVar3, "<this>");
        Intrinsics.checkNotNullParameter(incidentsRefresher, "incidentsRefresher");
        Intrinsics.checkNotNullParameter(closuresRefresher, "closuresRefresher");
        Intrinsics.checkNotNullParameter(notificationsRefresher, "notificationsRefresher");
        List<RouteLeg> legs = gVar3.f12498a.legs();
        if (legs != null) {
            z2 = true;
            arrayList6 = new ArrayList(CollectionsKt.f(legs));
            int i13 = 0;
            for (Object obj2 : legs) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                RouteLeg routeLeg = (RouteLeg) obj2;
                if (i13 < legIndex) {
                    num = valueOf;
                    i3 = legIndex;
                    c2014b = c2014b2;
                    arrayList14 = arrayList6;
                    str2 = str3;
                    arrayList8 = arrayList;
                    arrayList7 = arrayList2;
                    arrayList12 = arrayList4;
                    arrayList13 = arrayList5;
                    gVar2 = gVar3;
                } else {
                    LegAnnotation legAnnotation = arrayList2 != null ? (LegAnnotation) CollectionsKt.getOrNull(arrayList2, i13) : null;
                    int intValue = (i13 != legIndex || (num2 = c2014b2.f24132c) == null) ? 0 : num2.intValue();
                    try {
                        i10 = (intValue + hc.b.W(legAnnotation)) - 1;
                        i3 = legIndex;
                    } catch (IllegalArgumentException e10) {
                        i3 = legIndex;
                        if (D9.l.a(D9.l.g(), LoggingLevel.ERROR)) {
                            String message = e10.getMessage();
                            if (message == null) {
                                message = StubApp.getString2(440);
                            }
                            D9.l.e(message, str3);
                        }
                        i10 = intValue;
                    }
                    LegAnnotation annotation = routeLeg.annotation();
                    if (annotation == null) {
                        i12 = i10;
                        num = valueOf;
                        c2014b = c2014b2;
                        arrayList9 = arrayList6;
                        gVar = gVar3;
                        str = str3;
                        arrayList8 = arrayList;
                        arrayList7 = arrayList2;
                        arrayList11 = arrayList4;
                        arrayList10 = arrayList5;
                        i11 = intValue;
                        build = null;
                        eVar = closuresRefresher;
                    } else {
                        ArrayList c12 = F7.c.c(annotation, legAnnotation, intValue, 0, 0, F7.a.f2264c);
                        c2014b = c2014b2;
                        ArrayList c13 = F7.c.c(annotation, legAnnotation, intValue, 0, 0, F7.a.f2263b);
                        arrayList7 = arrayList2;
                        ArrayList c14 = F7.c.c(annotation, legAnnotation, intValue, 0, 0, F7.a.f2266e);
                        ArrayList c15 = F7.c.c(annotation, legAnnotation, intValue, 0, 0, F7.a.f2267f);
                        num = valueOf;
                        ArrayList c16 = F7.c.c(annotation, legAnnotation, intValue, 0, 0, F7.a.j);
                        arrayList8 = arrayList;
                        ArrayList c17 = F7.c.c(annotation, legAnnotation, intValue, 0, 0, F7.a.f2269h);
                        arrayList9 = arrayList6;
                        ArrayList c18 = F7.c.c(annotation, legAnnotation, intValue, 0, 0, F7.a.f2268g);
                        str = str3;
                        ArrayList c19 = F7.c.c(annotation, legAnnotation, intValue, 0, 0, F7.a.f2265d);
                        gVar = gVar3;
                        LegAnnotation legAnnotation2 = legAnnotation;
                        arrayList10 = arrayList5;
                        i11 = intValue;
                        eVar = closuresRefresher;
                        Set<String> unrecognizedPropertiesNames = annotation.getUnrecognizedPropertiesNames();
                        arrayList11 = arrayList4;
                        Intrinsics.checkNotNullExpressionValue(unrecognizedPropertiesNames, "oldAnnotation.unrecognizedPropertiesNames");
                        Set<String> unrecognizedPropertiesNames2 = legAnnotation2 != null ? legAnnotation2.getUnrecognizedPropertiesNames() : null;
                        if (unrecognizedPropertiesNames2 == null) {
                            unrecognizedPropertiesNames2 = SetsKt.emptySet();
                        }
                        Set union = CollectionsKt.union(unrecognizedPropertiesNames, unrecognizedPropertiesNames2);
                        F7.b bVar = new F7.b(annotation, legAnnotation2, i11);
                        HashMap hashMap = new HashMap();
                        Iterator it5 = union.iterator();
                        while (it5.hasNext()) {
                            Iterator it6 = it5;
                            Object next = it6.next();
                            int i15 = i10;
                            Object invoke = bVar.invoke(next);
                            if (invoke != null) {
                                hashMap.put(next, invoke);
                            }
                            it5 = it6;
                            i10 = i15;
                        }
                        i12 = i10;
                        if (hashMap.isEmpty()) {
                            hashMap = null;
                        }
                        build = LegAnnotation.builder().unrecognizedJsonProperties(hashMap).congestion(c13).congestionNumeric(c12).maxspeed(c17).distance(c14).duration(c15).speed(c16).freeflowSpeed(c18).currentSpeed(c19).build();
                    }
                    int i16 = i12;
                    List<Incident> a3 = incidentsRefresher.a(routeLeg.incidents(), arrayList3 != null ? (List) CollectionsKt.getOrNull(arrayList3, i13) : null, i11, i16);
                    arrayList12 = arrayList11;
                    closuresRefresher = eVar;
                    List<Closure> a9 = closuresRefresher.a(routeLeg.closures(), arrayList11 != null ? (List) CollectionsKt.getOrNull(arrayList12, i13) : null, i11, i16);
                    List<Notification> notifications = routeLeg.notifications();
                    ArrayList arrayList15 = arrayList10;
                    List list4 = arrayList10 != null ? (List) CollectionsKt.getOrNull(arrayList15, i13) : null;
                    if (notifications == null && list4 == null) {
                        b2 = null;
                    } else if (notifications == null) {
                        if (list4 == null) {
                            list4 = CollectionsKt.emptyList();
                        }
                        b2 = F7.c.a(i11, list4);
                    } else {
                        b2 = list4 == null ? F7.c.b(i11, i16, notifications) : CollectionsKt___CollectionsKt.plus((Collection) F7.c.b(i11, i16, notifications), (Iterable) F7.c.a(i11, list4));
                    }
                    if (b2 == null || b2.isEmpty()) {
                        b2 = null;
                    }
                    RouteLeg.Builder builder = routeLeg.toBuilder();
                    if (build == null || (duration3 = build.duration()) == null) {
                        duration = routeLeg.duration();
                    } else {
                        Intrinsics.checkNotNullExpressionValue(duration3, "duration()");
                        double d8 = 0.0d;
                        for (Double it7 : duration3) {
                            Intrinsics.checkNotNullExpressionValue(it7, "it");
                            d8 += it7.doubleValue();
                        }
                        duration = Double.valueOf(d8);
                    }
                    RouteLeg.Builder notifications2 = builder.duration(duration).annotation(build).incidents(a3).closures(a9).notifications(b2);
                    List<LegStep> steps = routeLeg.steps();
                    if (steps != null) {
                        Intrinsics.checkNotNullExpressionValue(steps, "steps()");
                        if (build == null || (duration2 = build.duration()) == null) {
                            list2 = steps;
                            arrayList13 = arrayList15;
                            gVar2 = gVar;
                            str2 = str;
                        } else {
                            ArrayList arrayList16 = new ArrayList();
                            Iterator it8 = steps.iterator();
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                if (!it8.hasNext()) {
                                    arrayList13 = arrayList15;
                                    gVar2 = gVar;
                                    str2 = str;
                                    list2 = arrayList16;
                                    break;
                                }
                                Object next2 = it8.next();
                                int i19 = i17 + 1;
                                if (i17 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                LegStep legStep = (LegStep) next2;
                                gVar2 = gVar;
                                int size = i8.d.e(gVar2.f12498a, legStep).size();
                                list2 = steps;
                                if (size < 2) {
                                    str2 = str;
                                    D9.l.e(StubApp.getString2(1916) + i17 + StubApp.getString2(1917), str2);
                                    arrayList13 = arrayList15;
                                    break;
                                }
                                int i20 = size - 1;
                                Iterator it9 = it8;
                                sumOfDouble = CollectionsKt___CollectionsKt.sumOfDouble(CollectionsKt.take(CollectionsKt.drop(duration2, i18), i20));
                                LegStep build2 = legStep.toBuilder().duration(sumOfDouble).build();
                                Intrinsics.checkNotNullExpressionValue(build2, "step.toBuilder().duration(updatedDuration).build()");
                                arrayList16.add(build2);
                                i18 += i20;
                                i17 = i19;
                                gVar = gVar2;
                                steps = list2;
                                arrayList15 = arrayList15;
                                it8 = it9;
                            }
                        }
                        list = list2;
                    } else {
                        arrayList13 = arrayList15;
                        gVar2 = gVar;
                        str2 = str;
                        list = null;
                    }
                    routeLeg = notifications2.steps(list).build();
                    arrayList14 = arrayList9;
                }
                arrayList14.add(routeLeg);
                arrayList6 = arrayList14;
                gVar3 = gVar2;
                c2014b2 = c2014b;
                arrayList2 = arrayList7;
                arrayList = arrayList8;
                i13 = i14;
                arrayList5 = arrayList13;
                legIndex = i3;
                arrayList4 = arrayList12;
                str3 = str2;
                valueOf = num;
            }
        } else {
            z2 = true;
            arrayList6 = null;
        }
        Integer num3 = valueOf;
        com.mapbox.navigation.base.route.g gVar4 = gVar3;
        ArrayList arrayList17 = arrayList;
        F7.f fVar = new F7.f(arrayList6, arrayList17, gVar4, num3);
        A8.a aVar = new A8.a(arrayList17, 3);
        Long valueOf2 = num3 != null ? Long.valueOf(num3.intValue() + this.f1989b) : null;
        if (valueOf2 == null) {
            valueOf2 = gVar4.f12503f;
        }
        return AbstractC1526a.N(gVar4, fVar, aVar, valueOf2, null, new com.mapbox.navigation.base.route.m(z2), 8);
    }

    @Override // com.mapbox.common.OnBillingServiceError
    public void run(BillingServiceError it) {
        B6.a this$0 = (B6.a) this.f1990c;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SessionSKUIdentifier skuId = (SessionSKUIdentifier) this.f1991d;
        Intrinsics.checkNotNullParameter(skuId, "$skuId");
        String reason = (String) this.f1992e;
        Intrinsics.checkNotNullParameter(reason, "$reason");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.getClass();
        B6.a.k(it);
        BillingServiceErrorCode code = it.getCode();
        BillingServiceErrorCode billingServiceErrorCode = BillingServiceErrorCode.RESUME_FAILED;
        String string2 = StubApp.getString2(647);
        if (code != billingServiceErrorCode) {
            if (D9.l.a(D9.l.g(), LoggingLevel.INFO)) {
                D9.l.f(L1.h(skuId) + StubApp.getString2(1921) + reason, string2);
                return;
            }
            return;
        }
        D9.l.h(StubApp.getString2(1918), StubApp.getString2(644));
        if (D9.l.a(D9.l.g(), LoggingLevel.INFO)) {
            D9.l.f(StubApp.getString2(1919) + L1.h(skuId) + '(' + it.getMessage() + StubApp.getString2(1920), string2);
        }
        this$0.b(skuId, this.f1989b, reason);
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, long j, int i3) {
        this.f1988a = i3;
        this.f1990c = obj;
        this.f1991d = obj2;
        this.f1992e = obj3;
        this.f1989b = j;
    }
}
