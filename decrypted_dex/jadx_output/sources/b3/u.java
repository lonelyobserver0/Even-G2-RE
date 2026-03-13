package b3;

import a.AbstractC0378a;
import com.google.android.gms.internal.measurement.F1;
import com.mapbox.bindgen.Value;
import com.mapbox.common.location.Location;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.mapbox.maps.SnapshotStyleListener;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u implements SnapshotStyleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0498N f10655a;

    public u(C0498N c0498n) {
        this.f10655a = c0498n;
    }

    @Override // com.mapbox.maps.SnapshotStyleListener
    public final void onDidFailLoadingStyle(String str) {
        SnapshotStyleListener.DefaultImpls.onDidFailLoadingStyle(this, str);
    }

    @Override // com.mapbox.maps.SnapshotStyleListener
    public final void onDidFinishLoadingStyle(Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        C0498N c0498n = this.f10655a;
        if (c0498n.f10559O == null) {
            c0498n.f10559O = LineString.fromLngLats((List<Point>) CollectionsKt.listOf((Object[]) new Point[]{Point.fromLngLat(0.0d, 0.0d), Point.fromLngLat(0.01d, 0.01d)}));
        }
        EnumC0505g[] enumC0505gArr = EnumC0505g.f10624a;
        String q10 = C0498N.q();
        String string2 = StubApp.getString2(9192);
        String j = E1.a.j(string2, q10);
        LineString lineString = c0498n.f10559O;
        Intrinsics.checkNotNull(lineString);
        String json = lineString.toJson();
        U6.a aVar = new U6.a(j);
        Intrinsics.checkNotNull(json);
        U6.a.c(aVar, json);
        Value H2 = AbstractC0378a.H(Boolean.TRUE);
        String string22 = StubApp.getString2(9211);
        aVar.f7461b.put(string22, new R6.a(string22, H2));
        F1.e(style, aVar.a());
        EnumC0504f[] enumC0504fArr = EnumC0504f.f10622a;
        String q11 = C0498N.q();
        String string23 = StubApp.getString2(9197);
        Q6.a aVar2 = new Q6.a(6, E1.a.j(string23, q11), j);
        aVar2.o(4.0d);
        aVar2.l(-65536);
        aVar2.k();
        aVar2.n();
        F1.c(style, aVar2);
        String j3 = E1.a.j(string2, C0498N.q());
        Location location = c0498n.f10574g;
        double longitude = location != null ? location.getLongitude() : 0.0d;
        Location location2 = c0498n.f10574g;
        Feature fromGeometry = Feature.fromGeometry(Point.fromLngLat(longitude, location2 != null ? location2.getLatitude() : 0.0d));
        U6.a aVar3 = new U6.a(j3);
        String json2 = fromGeometry.toJson();
        Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
        U6.a.c(aVar3, json2);
        aVar3.b(true);
        F1.e(style, aVar3.a());
        Q6.c cVar = new Q6.c(E1.a.j(string23, C0498N.q()), j3);
        Intrinsics.checkNotNullParameter("my_location_mark_image", StubApp.getString2(9212));
        cVar.i(new R6.a(StubApp.getString2(8521), "my_location_mark_image"));
        cVar.k();
        cVar.l(false);
        F1.c(style, cVar);
        c0498n.f10555L = style;
        R2.c.b(StubApp.getString2(103), StubApp.getString2(9213));
    }

    @Override // com.mapbox.maps.SnapshotStyleListener
    public final void onDidFullyLoadStyle(Style style) {
        SnapshotStyleListener.DefaultImpls.onDidFullyLoadStyle(this, style);
    }

    @Override // com.mapbox.maps.SnapshotStyleListener
    public final void onStyleImageMissing(String str) {
        SnapshotStyleListener.DefaultImpls.onStyleImageMissing(this, str);
    }
}
