package b3;

import D5.C0043g;
import android.content.Context;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.location.GetLocationCallback;
import com.mapbox.common.location.Location;
import com.mapbox.common.location.LocationProviderRequest;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.stub.StubApp;
import e9.InterfaceC0853a;
import java.net.URI;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* renamed from: b3.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0508j implements h7.d, Expected.Transformer, GetLocationCallback, H8.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0498N f10632b;

    public /* synthetic */ C0508j(Qb.I i3, C0498N c0498n) {
        this.f10631a = 8;
        this.f10632b = c0498n;
    }

    @Override // h7.d
    public void a(K6.a it) {
        switch (this.f10631a) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                C0498N c0498n = this.f10632b;
                c0498n.getClass();
                R2.c.b(StubApp.getString2(103), StubApp.getString2(9172));
                if (!c0498n.f10564T) {
                    c0498n.f10564T = false;
                    c0498n.n();
                    break;
                }
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                C0498N c0498n2 = this.f10632b;
                c0498n2.getClass();
                R2.c.b(StubApp.getString2(103), StubApp.getString2(9171));
                if (!c0498n2.f10564T) {
                    c0498n2.f10564T = false;
                    c0498n2.E();
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                C0498N c0498n3 = this.f10632b;
                c0498n3.getClass();
                String string2 = StubApp.getString2(103);
                R2.c.b(string2, StubApp.getString2(9168));
                Location location = c0498n3.f10574g;
                MapView mapView = c0498n3.f10572e;
                if (location != null && mapView != null) {
                    R2.c.b(string2, StubApp.getString2(9169));
                    Location location2 = c0498n3.f10574g;
                    Intrinsics.checkNotNull(location2);
                    double longitude = location2.getLongitude();
                    Location location3 = c0498n3.f10574g;
                    Intrinsics.checkNotNull(location3);
                    c0498n3.w(longitude, location3.getLatitude(), Double.valueOf(c0498n3.f10593t));
                } else if (location == null) {
                    R2.c.b(string2, StubApp.getString2(9170));
                    if (mapView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapView");
                        mapView = null;
                    }
                    MapboxMap mapboxMapDeprecated = mapView.getMapboxMapDeprecated();
                    CameraOptions build = new CameraOptions.Builder().pitch(Double.valueOf(0.0d)).zoom(Double.valueOf(14.5d)).center(Point.fromLngLat(116.4074d, 39.9042d)).bearing(Double.valueOf(0.0d)).build();
                    Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                    mapboxMapDeprecated.setCamera(build);
                }
                if (!c0498n3.f10564T) {
                    c0498n3.n();
                    break;
                }
                break;
        }
    }

    @Override // H8.g
    public L7.i g() {
        Context applicationContext = this.f10632b.f10568a;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Context applicationContext2 = StubApp.getOrigApplicationContext(applicationContext.getApplicationContext());
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Context origApplicationContext = StubApp.getOrigApplicationContext(applicationContext.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(origApplicationContext, "applicationContext.applicationContext");
        Locale t3 = Oc.a.t(applicationContext);
        y7.b bVar = new y7.b(origApplicationContext, t3, Tc.d.l(t3));
        L7.l lVar = new L7.l(new URI(StubApp.getString2(2971)));
        L7.c cVar = new L7.c();
        L7.d dVar = new L7.d(new L7.a());
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long millis = timeUnit.toMillis(5L);
        long j = com.mapbox.navigation.base.route.n.f12513b;
        if (millis < j) {
            StringBuilder m4 = AbstractC1482f.m(millis, StubApp.getString2(2974), StubApp.getString2(2975));
            m4.append(j);
            throw new IllegalStateException(m4.toString().toString());
        }
        com.mapbox.navigation.base.route.n nVar = new com.mapbox.navigation.base.route.n(millis);
        L7.j jVar = new L7.j();
        com.mapbox.navigation.base.route.l lVar2 = new com.mapbox.navigation.base.route.l(timeUnit.toMillis(5L));
        L7.f fVar = new L7.f();
        L7.e eVar = new L7.e();
        LocationProviderRequest request = L7.g.f4273b;
        Intrinsics.checkNotNullExpressionValue(request, "request");
        L7.g gVar = new L7.g(request);
        L7.b bVar2 = new L7.b();
        L7.m mVar = new L7.m(J7.e.f3416a, J7.e.f3417b, J7.e.f3418c, J7.e.f3419d);
        L7.k kVar = new L7.k();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
        return new L7.i(applicationContext2, bVar, lVar, cVar, dVar, nVar, jVar, lVar2, fVar, eVar, bVar2, gVar, mVar, kVar);
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        switch (this.f10631a) {
            case 1:
                F9.c error = (F9.c) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                C0498N c0498n = this.f10632b;
                c0498n.getClass();
                String str = StubApp.getString2(9177) + error.f2337a + StubApp.getString2(9174) + c0498n.f10589r;
                String string2 = StubApp.getString2(103);
                R2.c.b(string2, str);
                if (c0498n.f10589r) {
                    R2.c.b(string2, StubApp.getString2(9176));
                } else {
                    R2.c.b(string2, StubApp.getString2(9178));
                    E9.k kVar = c0498n.f10582n;
                    if (kVar != null) {
                        kVar.i(new F9.e(1.0f));
                    }
                    E9.k kVar2 = c0498n.f10582n;
                    if (kVar2 != null) {
                        kVar2.e(error.f2337a, (InterfaceC0853a) c0498n.f10605z0.getValue());
                    }
                }
                break;
            default:
                F9.d value = (F9.d) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                C0498N c0498n2 = this.f10632b;
                c0498n2.getClass();
                F9.b bVar = value.f2338a;
                String str2 = StubApp.getString2(9173) + bVar.f2334a + StubApp.getString2(6714) + bVar.f2335b + StubApp.getString2(9174) + c0498n2.f10589r;
                String string22 = StubApp.getString2(103);
                R2.c.b(string22, str2);
                if (c0498n2.f10589r) {
                    R2.c.b(string22, StubApp.getString2(9176));
                } else {
                    R2.c.b(string22, StubApp.getString2(9175));
                    E9.k kVar3 = c0498n2.f10582n;
                    if (kVar3 != null) {
                        kVar3.i(new F9.e(1.0f));
                    }
                    E9.k kVar4 = c0498n2.f10582n;
                    if (kVar4 != null) {
                        kVar4.e(value.f2338a, (InterfaceC0853a) c0498n2.f10605z0.getValue());
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // com.mapbox.common.location.GetLocationCallback
    public void run(Location location) {
        switch (this.f10631a) {
            case 3:
                C0498N c0498n = this.f10632b;
                if (location == null) {
                    c0498n.getClass();
                    R2.c.f(StubApp.getString2(103), StubApp.getString2(9185));
                    break;
                } else {
                    c0498n.w(location.getLongitude(), location.getLatitude(), Double.valueOf(14.5d));
                    break;
                }
            case 7:
                String string2 = StubApp.getString2(103);
                C0498N c0498n2 = this.f10632b;
                if (location == null) {
                    c0498n2.getClass();
                    R2.c.b(string2, StubApp.getString2(9184));
                    break;
                } else {
                    c0498n2.getClass();
                    R2.c.b(string2, StubApp.getString2(9181) + location + StubApp.getString2(9182));
                    c0498n2.f10574g = location;
                    MapView mapView = c0498n2.f10572e;
                    if (mapView != null) {
                        c0498n2.w(location.getLongitude(), location.getLatitude(), Double.valueOf(c0498n2.f10593t));
                    } else {
                        if (mapView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mapView");
                            mapView = null;
                        }
                        mapView.getMapboxMapDeprecated().addOnMapLoadedListener(new C0043g(17, c0498n2, location));
                    }
                    X2.f evenLocation = new X2.f(new X2.e(location.getLatitude(), location.getLongitude()), Long.valueOf(location.getTimestamp()), location.getAltitude(), location.getHorizontalAccuracy(), location.getVerticalAccuracy(), location.getSpeed(), location.getSpeedAccuracy(), location.getBearing(), location.getBearingAccuracy(), location.getFloor());
                    F5.c cVar = c0498n2.f10571d;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(evenLocation, "evenLocation");
                    ((X2.w) cVar.f2238b).j = evenLocation;
                    R2.c.b(string2, StubApp.getString2(9183));
                    break;
                }
            default:
                String string22 = StubApp.getString2(103);
                C0498N c0498n3 = this.f10632b;
                if (location == null) {
                    c0498n3.getClass();
                    R2.c.f(string22, StubApp.getString2(9180));
                    break;
                } else {
                    c0498n3.getClass();
                    R2.c.b(string22, StubApp.getString2(9179));
                    c0498n3.w(location.getLongitude(), location.getLatitude(), Double.valueOf(14.5d));
                    break;
                }
        }
    }

    public /* synthetic */ C0508j(C0498N c0498n, int i3) {
        this.f10631a = i3;
        this.f10632b = c0498n;
    }
}
