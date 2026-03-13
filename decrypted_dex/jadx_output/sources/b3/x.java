package b3;

import V8.C0350b;
import com.mapbox.common.location.Location;
import com.mapbox.geojson.Point;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o9.C1467c;
import s.C1590a;
import s9.C1606a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0498N f10658a;

    public x(C0498N c0498n) {
        this.f10658a = c0498n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.ArrayList] */
    public final void a(C0350b locationMatcherResult) {
        j9.e eVar;
        Point[] pointArr;
        ?? listOf;
        List filterNotNull;
        double[] doubleArray;
        String string2 = StubApp.getString2(9227);
        Intrinsics.checkNotNullParameter(locationMatcherResult, "locationMatcherResult");
        Location location = locationMatcherResult.f7807a;
        long currentTimeMillis = System.currentTimeMillis() - location.getTimestamp();
        C0498N c0498n = this.f10658a;
        c0498n.getClass();
        String str = StubApp.getString2(9228) + location.getLatitude() + StubApp.getString2(6638) + location.getLongitude() + StubApp.getString2(6639) + location.getSpeed() + StubApp.getString2(6640) + location.getHorizontalAccuracy() + StubApp.getString2(6641) + currentTimeMillis + StubApp.getString2(6642);
        String string22 = StubApp.getString2(103);
        R2.c.b(string22, str);
        try {
            Double bearing = location.getBearing();
            if (bearing != null) {
                double doubleValue = bearing.doubleValue();
                if (doubleValue >= 0.0d && doubleValue <= 360.0d) {
                    c0498n.f10563R = bearing;
                    ((X2.w) c0498n.f10571d.f2238b).f8338k = bearing;
                    R2.c.b(string22, string2 + doubleValue + StubApp.getString2("9229"));
                }
            }
        } catch (Exception e10) {
            R2.c.f(string22, StubApp.getString2(9230) + e10.getMessage());
        }
        C1590a c1590a = c0498n.f10580m;
        c1590a.getClass();
        Intrinsics.checkNotNullParameter(location, "location");
        ArrayList keyPoints = locationMatcherResult.f7808b;
        Intrinsics.checkNotNullParameter(keyPoints, "keyPoints");
        Iterator it = ((CopyOnWriteArraySet) c1590a.f20574a).iterator();
        while (true) {
            eVar = null;
            if (!it.hasNext()) {
                break;
            }
            l7.r it2 = (l7.r) it.next();
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            if (keyPoints.isEmpty()) {
                pointArr = new Point[]{Point.fromLngLat(location.getLongitude(), location.getLatitude())};
            } else {
                ArrayList arrayList = new ArrayList(CollectionsKt.f(keyPoints));
                for (Iterator it3 = keyPoints.iterator(); it3.hasNext(); it3 = it3) {
                    Location location2 = (Location) it3.next();
                    arrayList.add(Point.fromLngLat(location2.getLongitude(), location2.getLatitude()));
                }
                Object[] array = arrayList.toArray(new Point[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                pointArr = (Point[]) array;
            }
            if (keyPoints.isEmpty()) {
                listOf = CollectionsKt.listOf(location.getBearing());
            } else {
                listOf = new ArrayList(CollectionsKt.f(keyPoints));
                Iterator it4 = keyPoints.iterator();
                while (it4.hasNext()) {
                    listOf.add(((Location) it4.next()).getBearing());
                }
            }
            filterNotNull = CollectionsKt___CollectionsKt.filterNotNull(listOf);
            doubleArray = CollectionsKt___CollectionsKt.toDoubleArray(filterNotNull);
            C1467c c1467c = new C1467c(pointArr);
            Point[] location3 = (Point[]) Arrays.copyOf(pointArr, pointArr.length);
            C1606a c1606a = new C1606a(c1467c, null, 0);
            it2.getClass();
            Intrinsics.checkNotNullParameter(location3, "location");
            l7.v vVar = it2.f16789c;
            if (vVar != null) {
                vVar.e((Point[]) Arrays.copyOf(location3, location3.length), c1606a);
            }
            if (doubleArray.length != 0) {
                double[] bearing2 = Arrays.copyOf(doubleArray, doubleArray.length);
                C1606a c1606a2 = new C1606a(c1467c, null, 1);
                Intrinsics.checkNotNullParameter(bearing2, "bearing");
                l7.v vVar2 = it2.f16789c;
                if (vVar2 != null) {
                    l7.v.d(vVar2, Arrays.copyOf(bearing2, bearing2.length), c1606a2, 4);
                }
            }
        }
        c1590a.f20575b = keyPoints;
        j9.e eVar2 = c0498n.f10575h;
        String string23 = StubApp.getString2(9024);
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string23);
            eVar2 = null;
        }
        eVar2.getClass();
        Intrinsics.checkNotNullParameter(location, "location");
        eVar2.f15400h = location;
        m9.e eVar3 = eVar2.f15394b;
        eVar3.getClass();
        Intrinsics.checkNotNullParameter(location, "location");
        eVar3.f17279h = location;
        j9.e eVar4 = c0498n.f10575h;
        if (eVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string23);
        } else {
            eVar = eVar4;
        }
        eVar.c();
        c0498n.B(false);
    }

    public final void b(Location rawLocation) {
        Intrinsics.checkNotNullParameter(rawLocation, "rawLocation");
        long currentTimeMillis = System.currentTimeMillis() - rawLocation.getTimestamp();
        C0498N c0498n = this.f10658a;
        c0498n.getClass();
        R2.c.b(StubApp.getString2(103), StubApp.getString2(9231) + rawLocation.getLatitude() + StubApp.getString2(6638) + rawLocation.getLongitude() + StubApp.getString2(6639) + rawLocation.getSpeed() + StubApp.getString2(6640) + rawLocation.getHorizontalAccuracy() + StubApp.getString2(6641) + currentTimeMillis + StubApp.getString2(6642));
        c0498n.f10574g = rawLocation;
    }
}
