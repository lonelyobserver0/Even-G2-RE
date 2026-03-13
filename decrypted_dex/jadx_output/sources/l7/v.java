package l7;

import D5.B;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxLocationComponentException;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.util.MathUtils;
import com.stub.StubApp;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DoubleSpreadBuilder;
import kotlin.jvm.internal.Intrinsics;
import n7.C1393c;
import s9.C1606a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public C1393c f16801a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f16802b;

    /* renamed from: c, reason: collision with root package name */
    public final A3.s f16803c;

    /* renamed from: d, reason: collision with root package name */
    public final a5.c f16804d;

    /* renamed from: e, reason: collision with root package name */
    public final p2.h f16805e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16806f;

    /* renamed from: g, reason: collision with root package name */
    public Point f16807g;

    /* renamed from: h, reason: collision with root package name */
    public final u f16808h;

    /* renamed from: i, reason: collision with root package name */
    public double f16809i;
    public final u j;

    /* renamed from: k, reason: collision with root package name */
    public final K4.m f16810k;

    /* renamed from: l, reason: collision with root package name */
    public double f16811l;

    /* renamed from: m, reason: collision with root package name */
    public final u f16812m;

    /* renamed from: n, reason: collision with root package name */
    public t f16813n;

    public v(C1393c settings, WeakReference weakContext, A3.s delegateProvider, a5.c positionManager, p2.h animationManager) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(weakContext, "weakContext");
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        Intrinsics.checkNotNullParameter(positionManager, "positionManager");
        Intrinsics.checkNotNullParameter(animationManager, "animationManager");
        this.f16801a = settings;
        this.f16802b = weakContext;
        this.f16803c = delegateProvider;
        this.f16804d = positionManager;
        this.f16805e = animationManager;
        this.f16806f = true;
        this.f16808h = new u(this, 2);
        this.f16809i = ((MapboxMap) delegateProvider.f190b).getCameraState().getBearing();
        this.j = new u(this, 1);
        this.f16810k = new K4.m(this, 4);
        this.f16812m = new u(this, 0);
        this.f16813n = b(this.f16801a);
    }

    public static void d(v vVar, double[] bearings, C1606a c1606a, int i3) {
        if ((i3 & 2) != 0) {
            c1606a = null;
        }
        boolean z2 = (i3 & 4) == 0;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(bearings, "bearings");
        boolean z10 = vVar.f16801a.f17874k;
        p2.h hVar = vVar.f16805e;
        if (z10) {
            ((m7.f) hVar.f19671a).f17141g = true;
            vVar.a(bearings, c1606a, z2);
        } else if (((m7.f) hVar.f19671a).f17141g) {
            vVar.a(new double[]{0.0d}, new u(vVar, 3), z2);
        }
    }

    public final void a(double[] bearings, Function1 function1, boolean z2) {
        Intrinsics.checkNotNullParameter(bearings, "bearings");
        if (z2 || Math.abs(ArraysKt.last(bearings) - this.f16809i) >= 1.0d) {
            DoubleSpreadBuilder doubleSpreadBuilder = new DoubleSpreadBuilder(2);
            doubleSpreadBuilder.add(this.f16809i);
            doubleSpreadBuilder.addSpread(bearings);
            double[] array = doubleSpreadBuilder.toArray();
            double[] targets = Arrays.copyOf(array, array.length);
            p2.h hVar = this.f16805e;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(targets, "targets");
            Double[] typedArray = ArraysKt.toTypedArray(MathUtils.INSTANCE.prepareOptimalBearingPath(targets));
            ((m7.f) hVar.f19671a).a(Arrays.copyOf(typedArray, typedArray.length), function1);
        }
    }

    public final t b(C1393c c1393c) {
        X6.f fVar = c1393c.f17877n;
        if (!(fVar instanceof X6.d)) {
            if (!(fVar instanceof X6.e)) {
                throw new NoWhenBranchMatchedException();
            }
            X6.e locationModelLayerOptions = (X6.e) fVar;
            Intrinsics.checkNotNullParameter(locationModelLayerOptions, "locationModelLayerOptions");
            return new w(locationModelLayerOptions);
        }
        X6.d puckOptions = (X6.d) fVar;
        Intrinsics.checkNotNullParameter(puckOptions, "puckOptions");
        WeakReference weakContext = this.f16802b;
        Intrinsics.checkNotNullParameter(weakContext, "weakContext");
        Intrinsics.checkNotNullParameter("mapbox-location-indicator-layer", StubApp.getString2(20941));
        s layer = new s("mapbox-location-indicator-layer");
        ((HashMap) layer.f3393b).put(StubApp.getString2(290), new Value("mapbox-location-indicator-layer"));
        ((HashMap) layer.f3393b).put(StubApp.getString2(660), new Value(StubApp.getString2(5280)));
        ((HashMap) layer.f3393b).put(StubApp.getString2(20942), s.f());
        ((HashMap) layer.f3393b).put(StubApp.getString2(20943), s.f());
        ((HashMap) layer.f3393b).put(StubApp.getString2(20944), new Value(0.9d));
        ((HashMap) layer.f3393b).put(StubApp.getString2(20945), new Value(4.0d));
        Intrinsics.checkNotNullParameter(puckOptions, "puckOptions");
        Intrinsics.checkNotNullParameter(weakContext, "weakContext");
        Intrinsics.checkNotNullParameter(layer, "layer");
        B b2 = new B();
        b2.f1340a = puckOptions;
        b2.f1341b = weakContext;
        b2.f1342c = layer;
        return b2;
    }

    public final void c(MapboxMap style) {
        String str;
        Intrinsics.checkNotNullParameter(style, "style");
        if (this.f16813n.c()) {
            return;
        }
        p2.h hVar = this.f16805e;
        String string2 = StubApp.getString2(20946);
        u updateListener = this.f16808h;
        Intrinsics.checkNotNullParameter(updateListener, string2);
        String string22 = StubApp.getString2(20947);
        u updateListener2 = this.j;
        Intrinsics.checkNotNullParameter(updateListener2, string22);
        String string23 = StubApp.getString2(20948);
        u updateListener3 = this.f16812m;
        Intrinsics.checkNotNullParameter(updateListener3, string23);
        m7.g gVar = (m7.g) hVar.f19672b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(updateListener, "updateListener");
        if (!Intrinsics.areEqual(gVar.f17136a, updateListener)) {
            gVar.f17136a = updateListener;
        }
        m7.f fVar = (m7.f) hVar.f19671a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(updateListener2, "updateListener");
        if (!Intrinsics.areEqual(fVar.f17136a, updateListener2)) {
            fVar.f17136a = updateListener2;
        }
        m7.c cVar = (m7.c) hVar.f19673c;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(updateListener3, "updateListener");
        if (!Intrinsics.areEqual(cVar.f17136a, updateListener3)) {
            cVar.f17136a = updateListener3;
        }
        t renderer = this.f16813n;
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        m7.f fVar2 = (m7.f) hVar.f19671a;
        fVar2.getClass();
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        fVar2.f17138c = renderer;
        m7.g gVar2 = (m7.g) hVar.f19672b;
        gVar2.getClass();
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        gVar2.f17138c = renderer;
        m7.h hVar2 = (m7.h) hVar.f19674d;
        hVar2.getClass();
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        hVar2.f17138c = renderer;
        m7.c cVar2 = (m7.c) hVar.f19673c;
        cVar2.getClass();
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        cVar2.f17138c = renderer;
        C1393c settings = this.f16801a;
        Intrinsics.checkNotNullParameter(settings, "settings");
        boolean z2 = settings.f17867b;
        m7.h hVar3 = (m7.h) hVar.f19674d;
        hVar3.f17139d = z2;
        hVar3.f17145g = settings.f17869d;
        hVar3.f17146h = settings.f17868c;
        if (z2) {
            hVar3.d();
        } else {
            hVar3.b();
        }
        m7.c cVar3 = (m7.c) hVar.f19673c;
        cVar3.f17139d = settings.f17870e;
        cVar3.f17131g = settings.f17871f;
        cVar3.f17132h = settings.f17872g;
        Point point = this.f16807g;
        if (point != null) {
            e(new Point[]{point}, null);
        }
        d(this, new double[]{this.f16809i}, null, 2);
        this.f16813n.r(this.f16804d);
        this.f16813n.h(style);
        C1393c settings2 = this.f16801a;
        Intrinsics.checkNotNullParameter(settings2, "settings");
        X6.f fVar3 = settings2.f17877n;
        if (fVar3 instanceof X6.d) {
            str = ((X6.d) fVar3).f8427d;
        } else {
            if (!(fVar3 instanceof X6.e)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((X6.e) fVar3).f8433e;
        }
        if (str != null) {
            t tVar = this.f16813n;
            Expected<String, Value> fromJson = Value.fromJson(str);
            Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(it)");
            String error = fromJson.getError();
            if (error != null) {
                throw new MapboxLocationComponentException(error);
            }
            Value value = fromJson.getValue();
            if (value == null) {
                throw new MapboxLocationComponentException(StubApp.getString2(20949));
            }
            Intrinsics.checkNotNullExpressionValue(value, "fromJson(it).take()");
            tVar.b(value);
        }
        if (this.f16807g == null || !this.f16801a.f17866a) {
            this.f16806f = true;
            this.f16813n.hide();
        } else {
            this.f16806f = false;
            this.f16813n.show();
        }
        if (this.f16801a.f17870e) {
            f(new double[]{this.f16811l});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.mapbox.geojson.Point[] r4, s9.C1606a r5) {
        /*
            r3 = this;
            java.lang.String r0 = "points"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            n7.c r0 = r3.f16801a
            boolean r0 = r0.f17866a
            if (r0 == 0) goto L17
            boolean r0 = r3.f16806f
            if (r0 == 0) goto L17
            r0 = 0
            r3.f16806f = r0
            l7.t r0 = r3.f16813n
            r0.show()
        L17:
            com.mapbox.geojson.Point r0 = r3.f16807g
            r1 = 2
            if (r0 == 0) goto L35
            kotlin.jvm.internal.SpreadBuilder r2 = new kotlin.jvm.internal.SpreadBuilder
            r2.<init>(r1)
            r2.add(r0)
            r2.addSpread(r4)
            int r0 = r2.size()
            com.mapbox.geojson.Point[] r0 = new com.mapbox.geojson.Point[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            com.mapbox.geojson.Point[] r0 = (com.mapbox.geojson.Point[]) r0
            if (r0 != 0) goto L4d
        L35:
            kotlin.jvm.internal.SpreadBuilder r0 = new kotlin.jvm.internal.SpreadBuilder
            r0.<init>(r1)
            r0.addSpread(r4)
            r0.addSpread(r4)
            int r4 = r0.size()
            com.mapbox.geojson.Point[] r4 = new com.mapbox.geojson.Point[r4]
            java.lang.Object[] r4 = r0.toArray(r4)
            r0 = r4
            com.mapbox.geojson.Point[] r0 = (com.mapbox.geojson.Point[]) r0
        L4d:
            int r4 = r0.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r4)
            com.mapbox.geojson.Point[] r4 = (com.mapbox.geojson.Point[]) r4
            p2.h r0 = r3.f16805e
            java.lang.String r1 = "targets"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            int r1 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.Object r0 = r0.f19672b
            m7.g r0 = (m7.g) r0
            r0.a(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.v.e(com.mapbox.geojson.Point[], s9.a):void");
    }

    public final void f(double[] radius) {
        Intrinsics.checkNotNullParameter(radius, "radius");
        DoubleSpreadBuilder doubleSpreadBuilder = new DoubleSpreadBuilder(2);
        doubleSpreadBuilder.add(this.f16811l);
        doubleSpreadBuilder.addSpread(radius);
        double[] array = doubleSpreadBuilder.toArray();
        double[] targets = Arrays.copyOf(array, array.length);
        p2.h hVar = this.f16805e;
        Intrinsics.checkNotNullParameter(targets, "targets");
        Double[] typedArray = ArraysKt.toTypedArray(targets);
        ((m7.c) hVar.f19673c).a(Arrays.copyOf(typedArray, typedArray.length), null);
        double last = ArraysKt.last(radius);
        if (((int) this.f16801a.f17869d) == -1) {
            A3.s sVar = this.f16803c;
            MapboxMap mapboxMap = (MapboxMap) sVar.f191c;
            MapboxMap mapboxMap2 = (MapboxMap) sVar.f190b;
            double metersPerPixelAtLatitude = last / mapboxMap.getMetersPerPixelAtLatitude(mapboxMap2.getCameraState().getCenter().latitude(), mapboxMap2.getCameraState().getZoom());
            C1393c settings = this.f16801a;
            Intrinsics.checkNotNullParameter(settings, "settings");
            boolean z2 = settings.f17867b;
            m7.h hVar2 = (m7.h) hVar.f19674d;
            hVar2.f17139d = z2;
            if (!z2) {
                hVar2.b();
            } else {
                hVar2.f17145g = metersPerPixelAtLatitude;
                hVar2.d();
            }
        }
    }
}
