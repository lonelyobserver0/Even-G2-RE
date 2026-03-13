package b3;

import a.AbstractC0378a;
import android.graphics.Bitmap;
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
public final class w implements SnapshotStyleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0498N f10657a;

    public w(C0498N c0498n) {
        this.f10657a = c0498n;
    }

    @Override // com.mapbox.maps.SnapshotStyleListener
    public final void onDidFailLoadingStyle(String str) {
        SnapshotStyleListener.DefaultImpls.onDidFailLoadingStyle(this, str);
    }

    @Override // com.mapbox.maps.SnapshotStyleListener
    public final void onDidFinishLoadingStyle(Style style) {
        String iconImage = StubApp.getString2(9215);
        String iconImage2 = StubApp.getString2(9216);
        String string2 = StubApp.getString2(103);
        Intrinsics.checkNotNullParameter(style, "style");
        C0498N c0498n = this.f10657a;
        c0498n.f10558N0 = true;
        LineString fromLngLats = LineString.fromLngLats((List<Point>) CollectionsKt.listOf((Object[]) new Point[]{Point.fromLngLat(0.0d, 0.0d), Point.fromLngLat(0.001d, 0.001d)}));
        String string22 = StubApp.getString2(112);
        U6.a aVar = new U6.a(string22);
        String json = fromLngLats.toJson();
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        U6.a.c(aVar, json);
        Value H2 = AbstractC0378a.H(Boolean.TRUE);
        String string23 = StubApp.getString2(9211);
        aVar.f7461b.put(string23, new R6.a(string23, H2));
        F1.e(style, aVar.a());
        Q6.a aVar2 = new Q6.a(6, StubApp.getString2(9217), string22);
        aVar2.o(4.0d);
        aVar2.l(-65536);
        aVar2.k();
        aVar2.n();
        F1.c(style, aVar2);
        try {
            Bitmap a3 = C0498N.a(c0498n, 2131558402);
            if (a3 != null) {
                style.addImage(iconImage2, a3);
                R2.c.b(string2, StubApp.getString2("9218"));
            } else {
                R2.c.f(string2, StubApp.getString2("9219"));
            }
        } catch (Exception e10) {
            E1.a.u(StubApp.getString2(9220), e10.getMessage(), string2);
        }
        try {
            Bitmap a9 = C0498N.a(c0498n, 2131558404);
            if (a9 != null) {
                style.addImage(iconImage, a9);
                R2.c.b(string2, StubApp.getString2("9221"));
            } else {
                R2.c.f(string2, StubApp.getString2("9222"));
            }
        } catch (Exception e11) {
            E1.a.u(StubApp.getString2(9223), e11.getMessage(), string2);
        }
        Location location = c0498n.f10574g;
        double longitude = location != null ? location.getLongitude() : 0.0d;
        Location location2 = c0498n.f10574g;
        Feature fromGeometry = Feature.fromGeometry(Point.fromLngLat(longitude, location2 != null ? location2.getLatitude() : 0.0d));
        String string24 = StubApp.getString2(9224);
        U6.a aVar3 = new U6.a(string24);
        String json2 = fromGeometry.toJson();
        Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
        U6.a.c(aVar3, json2);
        aVar3.b(false);
        F1.e(style, aVar3.a());
        Q6.c cVar = new Q6.c(StubApp.getString2(116), string24);
        Intrinsics.checkNotNullParameter(iconImage2, "iconImage");
        String string25 = StubApp.getString2(8521);
        cVar.i(new R6.a(string25, iconImage2));
        cVar.k();
        cVar.l(false);
        Double valueOf = Double.valueOf(0.67d);
        String string26 = StubApp.getString2(8523);
        cVar.i(new R6.a(string26, valueOf));
        F1.c(style, cVar);
        String string27 = StubApp.getString2(114);
        U6.a aVar4 = new U6.a(string27);
        String json3 = fromLngLats.toJson();
        Intrinsics.checkNotNullExpressionValue(json3, "toJson(...)");
        U6.a.c(aVar4, json3);
        aVar4.b(true);
        F1.e(style, aVar4.a());
        Q6.c cVar2 = new Q6.c(StubApp.getString2(9225), string27);
        Intrinsics.checkNotNullParameter(iconImage, "iconImage");
        cVar2.i(new R6.a(string25, iconImage));
        cVar2.k();
        cVar2.l(false);
        cVar2.i(new R6.a(string26, Double.valueOf(0.375d)));
        F1.c(style, cVar2);
        c0498n.f10567Z = style;
        R2.c.b(string2, StubApp.getString2(9226));
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
