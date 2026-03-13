package A2;

import C2.j;
import C2.r;
import D5.C0043g;
import X2.z;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import b3.C0498N;
import b3.RunnableC0511m;
import com.google.android.gms.internal.measurement.F1;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.SnapshotResultCallback;
import com.mapbox.maps.Snapshotter;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class f implements r, B2.a, SnapshotResultCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f95a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f96b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f97c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f98d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f99e;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f95a = obj;
        this.f96b = obj2;
        this.f97c = obj3;
        this.f98d = obj4;
        this.f99e = obj5;
    }

    @Override // C2.r
    public void a(Location location) {
        h hVar = (h) this.f95a;
        boolean[] zArr = (boolean[]) this.f96b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        j jVar = (j) this.f97c;
        hVar.f103b.f1074a.remove(jVar);
        jVar.d();
        hVar.f105d.remove((String) this.f98d);
        ((MethodChannel.Result) this.f99e).success(android.support.v4.media.session.b.A(location));
    }

    @Override // B2.a
    public void b(int i3) {
        h hVar = (h) this.f95a;
        boolean[] zArr = (boolean[]) this.f96b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        j jVar = (j) this.f97c;
        hVar.f103b.f1074a.remove(jVar);
        jVar.d();
        hVar.f105d.remove((String) this.f98d);
        ((MethodChannel.Result) this.f99e).error(E1.a.b(i3), E1.a.a(i3), null);
    }

    @Override // com.mapbox.maps.SnapshotResultCallback
    public void onSnapshotResult(Bitmap bitmap, String str) {
        T6.d q10;
        T6.d q11;
        boolean contains$default;
        int i3;
        C0498N c0498n = (C0498N) this.f95a;
        z zVar = (z) this.f96b;
        LineString lineString = (LineString) this.f97c;
        List list = (List) this.f98d;
        CameraOptions cameraOptions = (CameraOptions) this.f99e;
        if (str != null) {
            c0498n.getClass();
            R2.c.c(StubApp.getString2(103), StubApp.getString2(104).concat(str));
            contains$default = StringsKt__StringsKt.contains$default(str, (CharSequence) StubApp.getString2(105), false, 2, (Object) null);
            if (!contains$default || (i3 = c0498n.f10552J0) >= c0498n.f10554K0) {
                synchronized (c0498n.f10556L0) {
                    c0498n.f10549H0 = false;
                    c0498n.f10551I0 = null;
                    Unit unit = Unit.INSTANCE;
                }
                c0498n.f10552J0 = 0;
                Result.Companion companion = Result.INSTANCE;
                zVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(107).concat(str))))));
                return;
            }
            int i10 = i3 + 1;
            c0498n.f10552J0 = i10;
            R2.c.b(StubApp.getString2(103), StubApp.getString2(106) + i10);
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0511m(c0498n, zVar, 1), 2000L);
            return;
        }
        c0498n.f10552J0 = 0;
        if (bitmap == null) {
            R2.c.c(StubApp.getString2(103), StubApp.getString2(108));
            synchronized (c0498n.f10556L0) {
                c0498n.f10549H0 = false;
                c0498n.f10551I0 = null;
                Unit unit2 = Unit.INSTANCE;
            }
            Result.Companion companion2 = Result.INSTANCE;
            zVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(109))))));
            return;
        }
        Snapshotter snapshotter = c0498n.f10566Y;
        if (snapshotter == null) {
            R2.c.c(StubApp.getString2(103), StubApp.getString2(124));
            synchronized (c0498n.f10556L0) {
                c0498n.f10549H0 = false;
                c0498n.f10551I0 = null;
                Unit unit3 = Unit.INSTANCE;
            }
            Result.Companion companion3 = Result.INSTANCE;
            zVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(125))))));
            return;
        }
        synchronized (c0498n.f10556L0) {
            c0498n.f10551I0 = snapshotter;
            Unit unit4 = Unit.INSTANCE;
        }
        String json = lineString.toJson();
        R2.c.b(StubApp.getString2(103), StubApp.getString2(110) + list.size() + StubApp.getString2(111));
        Style style = c0498n.f10567Z;
        if (style != null && (q11 = F1.q(style, StubApp.getString2(112))) != null) {
            Intrinsics.checkNotNull(q11, "null cannot be cast to non-null type com.mapbox.maps.extension.style.sources.generated.GeoJsonSource");
            Intrinsics.checkNotNull(json);
            U6.c.g((U6.c) q11, json);
            R2.c.b(StubApp.getString2(103), StubApp.getString2(113));
        }
        if (!list.isEmpty()) {
            Point point = (Point) CollectionsKt.last(list);
            Feature fromGeometry = Feature.fromGeometry(point);
            Style style2 = c0498n.f10567Z;
            if (style2 != null && (q10 = F1.q(style2, StubApp.getString2(114))) != null) {
                Intrinsics.checkNotNull(q10, "null cannot be cast to non-null type com.mapbox.maps.extension.style.sources.generated.GeoJsonSource");
                String json2 = fromGeometry.toJson();
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                U6.c.g((U6.c) q10, json2);
                R2.c.b(StubApp.getString2(103), StubApp.getString2(115) + point.toJson());
            }
        }
        if (list.size() >= 2) {
            Point point2 = (Point) CollectionsKt.first(list);
            Point point3 = (Point) list.get(1);
            Intrinsics.checkNotNull(point2);
            Intrinsics.checkNotNull(point3);
            double j = C0498N.j(point2, point3);
            Style style3 = c0498n.f10567Z;
            if (style3 != null) {
                P6.c p8 = F1.p(style3, StubApp.getString2(116));
                if (p8 instanceof Q6.c) {
                    double d8 = 180;
                    double d10 = ((j + d8) % 360) - d8;
                    Q6.c cVar = (Q6.c) p8;
                    cVar.getClass();
                    cVar.i(new R6.a(StubApp.getString2(117), Double.valueOf(d10)));
                    R2.c.b(StubApp.getString2(103), StubApp.getString2(118) + d10 + StubApp.getString2(119) + j + StubApp.getString2(120) + j + StubApp.getString2(121));
                } else {
                    R2.c.f(StubApp.getString2(103), StubApp.getString2(122));
                }
            }
        } else {
            R2.c.f(StubApp.getString2(103), StubApp.getString2(123) + list.size());
        }
        snapshotter.cancel();
        snapshotter.setCamera(cameraOptions);
        Snapshotter.start$default(snapshotter, null, new C0043g(18, c0498n, zVar), 1, null);
    }
}
