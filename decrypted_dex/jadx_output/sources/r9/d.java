package r9;

import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f20407b = new d(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f20408c = new d(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f20409d = new d(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f20410e = new d(1, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final d f20411f = new d(1, 4);

    /* renamed from: g, reason: collision with root package name */
    public static final d f20412g = new d(1, 5);

    /* renamed from: h, reason: collision with root package name */
    public static final d f20413h = new d(1, 6);
    public static final d j = new d(1, 7);

    /* renamed from: k, reason: collision with root package name */
    public static final d f20414k = new d(1, 8);

    /* renamed from: l, reason: collision with root package name */
    public static final d f20415l = new d(1, 9);

    /* renamed from: m, reason: collision with root package name */
    public static final d f20416m = new d(1, 10);

    /* renamed from: n, reason: collision with root package name */
    public static final d f20417n = new d(1, 11);

    /* renamed from: p, reason: collision with root package name */
    public static final d f20418p = new d(1, 12);

    /* renamed from: q, reason: collision with root package name */
    public static final d f20419q = new d(1, 13);

    /* renamed from: r, reason: collision with root package name */
    public static final d f20420r = new d(1, 14);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20421a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, int i10) {
        super(i3);
        this.f20421a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i3;
        int i10;
        int i11;
        char c10;
        int i12 = 0;
        String string2 = StubApp.getString2(22748);
        String string22 = StubApp.getString2(22749);
        String string23 = StubApp.getString2(2303);
        int i13 = -1;
        String string24 = StubApp.getString2(22750);
        switch (this.f20421a) {
            case 0:
                N6.a aVar = (N6.a) obj;
                Intrinsics.checkNotNullParameter(aVar, string22);
                aVar.e(1.5d);
                break;
            case 1:
                RouteLeg routeLeg = (RouteLeg) obj;
                Intrinsics.checkNotNullParameter(routeLeg, "routeLeg");
                LegAnnotation annotation = routeLeg.annotation();
                List<String> congestion = annotation != null ? annotation.congestion() : null;
                if (congestion == null) {
                    break;
                }
                break;
            case 2:
                MapboxRouteLineApiOptions options = (MapboxRouteLineApiOptions) obj;
                Intrinsics.checkNotNullParameter(options, "options");
                break;
            case 3:
                com.mapbox.navigation.base.route.g route = (com.mapbox.navigation.base.route.g) obj;
                Intrinsics.checkNotNullParameter(route, "route");
                List f10 = i8.d.f(route.f12498a);
                r rVar = r.f20461a;
                ArrayList arrayList = new ArrayList(CollectionsKt.f(f10));
                Iterator it = f10.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    String string25 = StubApp.getString2(11601);
                    if (!hasNext) {
                        Object[] array = arrayList.toArray(new y9.k[0][][]);
                        Intrinsics.checkNotNull(array, string25);
                        y9.k[][][] kVarArr = (y9.k[][][]) array;
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        double d8 = 0.0d;
                        for (int lastIndex = CollectionsKt.getLastIndex(f10); i13 < lastIndex; lastIndex--) {
                            List list = (List) f10.get(lastIndex);
                            int lastIndex2 = CollectionsKt.getLastIndex(list);
                            while (i13 < lastIndex2) {
                                List list2 = (List) list.get(lastIndex2);
                                if (list2.isEmpty()) {
                                    i11 = i13;
                                    c10 = 1;
                                } else {
                                    i11 = i13;
                                    c10 = 1;
                                    kVarArr[lastIndex][lastIndex2][CollectionsKt.getLastIndex(list2)] = new y9.k((Point) CollectionsKt.last(list2), d8);
                                }
                                int lastIndex3 = CollectionsKt.getLastIndex(list2);
                                while (lastIndex3 > 0) {
                                    Point point1 = (Point) list2.get(lastIndex3);
                                    int i14 = lastIndex3 - 1;
                                    int i15 = i12;
                                    Point point2 = (Point) list2.get(i14);
                                    List list3 = f10;
                                    Intrinsics.checkNotNullParameter(point1, "point1");
                                    Intrinsics.checkNotNullParameter(point2, "point2");
                                    double longitude = ((point1.longitude() / 360.0d) + 0.5d) - ((point2.longitude() / 360.0d) + 0.5d);
                                    double q10 = r.q(point1.latitude()) - r.q(point2.latitude());
                                    double[] dArr = new double[2];
                                    dArr[i15] = longitude;
                                    dArr[c10] = q10;
                                    double d10 = dArr[i15];
                                    double d11 = dArr[c10];
                                    d8 = Math.sqrt((d11 * d11) + (d10 * d10)) + d8;
                                    kVarArr[lastIndex][lastIndex2][i14] = new y9.k(point2, d8);
                                    lastIndex3--;
                                    f10 = list3;
                                    i12 = i15;
                                }
                                lastIndex2--;
                                i13 = i11;
                            }
                        }
                        int i16 = i12;
                        int i17 = 1;
                        int length = kVarArr.length;
                        int i18 = i16;
                        int i19 = i18;
                        while (i18 < length) {
                            y9.k[][] kVarArr2 = kVarArr[i18];
                            int i20 = i19 + 1;
                            ArrayList arrayList4 = new ArrayList();
                            int length2 = kVarArr2.length;
                            int i21 = i16;
                            int i22 = i21;
                            while (i21 < length2) {
                                int i23 = length;
                                y9.k[] kVarArr3 = kVarArr2[i21];
                                int i24 = i22 + 1;
                                if (i22 == 0) {
                                    i3 = i18;
                                } else {
                                    i3 = i18;
                                    if (i22 == ArraysKt.getLastIndex(kVarArr2)) {
                                        kVarArr3 = new y9.k[i16];
                                    } else {
                                        i10 = i17;
                                        kVarArr3 = (y9.k[]) ArraysKt.copyOfRange(kVarArr3, i10, kVarArr3.length);
                                        Intrinsics.checkNotNull(kVarArr3, "null cannot be cast to non-null type kotlin.Array<com.mapbox.navigation.ui.maps.route.line.model.RouteLineDistancesIndex>");
                                        CollectionsKt.addAll(arrayList4, kVarArr3);
                                        i21 += i10;
                                        i17 = i10;
                                        length = i23;
                                        i22 = i24;
                                        i18 = i3;
                                        i16 = 0;
                                    }
                                }
                                i10 = i17;
                                Intrinsics.checkNotNull(kVarArr3, "null cannot be cast to non-null type kotlin.Array<com.mapbox.navigation.ui.maps.route.line.model.RouteLineDistancesIndex>");
                                CollectionsKt.addAll(arrayList4, kVarArr3);
                                i21 += i10;
                                i17 = i10;
                                length = i23;
                                i22 = i24;
                                i18 = i3;
                                i16 = 0;
                            }
                            int i25 = length;
                            Object[] array2 = arrayList4.toArray(new y9.k[i16]);
                            Intrinsics.checkNotNull(array2, string25);
                            arrayList2.add(i19, array2);
                            i19 = i20;
                            i16 = 0;
                            i18++;
                            length = i25;
                        }
                        int i26 = i17;
                        Iterator it2 = arrayList2.iterator();
                        int i27 = 0;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i28 = i27 + 1;
                            if (i27 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            y9.k[] kVarArr4 = (y9.k[]) next;
                            if (i27 != 0) {
                                kVarArr4 = (y9.k[]) ArraysKt.copyOfRange(kVarArr4, i26, kVarArr4.length);
                            }
                            CollectionsKt.addAll(arrayList3, kVarArr4);
                            i27 = i28;
                        }
                        Object[] array3 = arrayList3.toArray(new y9.k[0]);
                        Intrinsics.checkNotNull(array3, string25);
                        Object[] array4 = arrayList2.toArray(new y9.k[0][]);
                        Intrinsics.checkNotNull(array4, string25);
                        Intrinsics.checkNotNull(kVarArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Array<kotlin.Array<com.mapbox.navigation.ui.maps.route.line.model.RouteLineDistancesIndex>>>");
                        break;
                    } else {
                        List list4 = (List) it.next();
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.f(list4));
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(new y9.k[((List) it3.next()).size()]);
                        }
                        Object[] array5 = arrayList5.toArray(new y9.k[0][]);
                        Intrinsics.checkNotNull(array5, string25);
                        arrayList.add((y9.k[][]) array5);
                    }
                }
            case 4:
                N6.a get = (N6.a) obj;
                Intrinsics.checkNotNullParameter(get, "$this$get");
                get.f(StubApp.getString2(22755));
                break;
            case 5:
                N6.a toString = (N6.a) obj;
                Intrinsics.checkNotNullParameter(toString, "$this$toString");
                toString.getClass();
                d dVar = f20411f;
                Intrinsics.checkNotNullParameter(dVar, string23);
                ArrayList arrayList6 = toString.f4929b;
                Intrinsics.checkNotNullParameter(dVar, string23);
                N6.a aVar2 = new N6.a(StubApp.getString2(6443));
                dVar.invoke(aVar2);
                arrayList6.add(aVar2.b());
                break;
            case 6:
                N6.a aVar3 = (N6.a) obj;
                Intrinsics.checkNotNullParameter(aVar3, string24);
                aVar3.f(StubApp.getString2(3353));
                aVar3.f(string2);
                break;
            case 7:
                N6.a aVar4 = (N6.a) obj;
                Intrinsics.checkNotNullParameter(aVar4, string24);
                aVar4.f(StubApp.getString2(22753));
                aVar4.f(StubApp.getString2(22754));
                break;
            case 8:
                N6.a match = (N6.a) obj;
                Intrinsics.checkNotNullParameter(match, "$this$match");
                match.getClass();
                d dVar2 = f20412g;
                Intrinsics.checkNotNullParameter(dVar2, string23);
                ArrayList arrayList7 = match.f4929b;
                Intrinsics.checkNotNullParameter(dVar2, string23);
                N6.a aVar5 = new N6.a(StubApp.getString2(22752));
                dVar2.invoke(aVar5);
                arrayList7.add(aVar5.b());
                match.g(f20413h);
                match.g(j);
                match.f(string2);
                break;
            case 9:
                N6.a aVar6 = (N6.a) obj;
                Intrinsics.checkNotNullParameter(aVar6, string22);
                aVar6.e(1.5d);
                break;
            case 10:
                N6.a aVar7 = (N6.a) obj;
                Intrinsics.checkNotNullParameter(aVar7, string24);
                aVar7.e(0.0d);
                aVar7.e(0.6d);
                break;
            case 11:
                N6.a aVar8 = (N6.a) obj;
                Intrinsics.checkNotNullParameter(aVar8, string24);
                aVar8.e(10.0d);
                aVar8.e(0.8d);
                break;
            case 12:
                N6.a aVar9 = (N6.a) obj;
                Intrinsics.checkNotNullParameter(aVar9, string24);
                aVar9.e(12.0d);
                aVar9.e(1.3d);
                break;
            case 13:
                N6.a aVar10 = (N6.a) obj;
                Intrinsics.checkNotNullParameter(aVar10, string24);
                aVar10.e(22.0d);
                aVar10.e(2.8d);
                break;
            default:
                N6.c interpolate = (N6.c) obj;
                Intrinsics.checkNotNullParameter(interpolate, "$this$interpolate");
                interpolate.getClass();
                d dVar3 = f20415l;
                Intrinsics.checkNotNullParameter(dVar3, string23);
                ArrayList arrayList8 = interpolate.f4929b;
                Intrinsics.checkNotNullParameter(dVar3, string23);
                N6.a aVar11 = new N6.a(StubApp.getString2(22751));
                dVar3.invoke(aVar11);
                arrayList8.add(aVar11.b());
                interpolate.h();
                interpolate.g(f20416m);
                interpolate.g(f20417n);
                interpolate.g(f20418p);
                interpolate.g(f20419q);
                break;
        }
        return Unit.INSTANCE;
    }
}
