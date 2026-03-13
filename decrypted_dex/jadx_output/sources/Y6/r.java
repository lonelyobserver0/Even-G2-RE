package Y6;

import android.animation.TypeEvaluator;
import android.view.animation.PathInterpolator;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MercatorCoordinate;
import com.mapbox.maps.Size;
import com.stub.StubApp;
import f0.C0868a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final C0868a f8819d;

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f8820e;

    /* renamed from: a, reason: collision with root package name */
    public final MapboxMap f8821a;

    /* renamed from: b, reason: collision with root package name */
    public final MapboxMap f8822b;

    /* renamed from: c, reason: collision with root package name */
    public final MapboxMap f8823c;

    static {
        Intrinsics.checkNotNullExpressionValue(new PathInterpolator(0.0f, 0.0f, 0.25f, 1.0f), "create(\n      0.0f,\n    …  0.25f,\n      1.0f\n    )");
        f8819d = new C0868a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(n.f8793e, p.f8805b);
        hashMap.put(n.f8791c, p.f8806c);
        hashMap.put(n.f8794f, p.f8807d);
        hashMap.put(n.f8792d, p.f8808e);
        hashMap.put(n.f8789a, p.f8809f);
        hashMap.put(n.f8790b, p.f8810g);
        f8820e = hashMap;
    }

    public r(A3.s mapDelegateProvider) {
        Intrinsics.checkNotNullParameter(mapDelegateProvider, "mapDelegateProvider");
        this.f8821a = (MapboxMap) mapDelegateProvider.f192d;
        this.f8822b = (MapboxMap) mapDelegateProvider.f191c;
        this.f8823c = (MapboxMap) mapDelegateProvider.f190b;
    }

    public static final double b(double d8, double d10, double d11, int i3) {
        double d12 = ((i3 == 0 ? 1 : -1) * 2.0164d * 2.0164d * d11 * d11) + ((d8 * d8) - (d10 * d10));
        double d13 = 2;
        if (i3 == 0) {
            d8 = d10;
        }
        double d14 = d12 / (((d13 * d8) * 2.0164d) * d11);
        return Math.log(Math.sqrt((d14 * d14) + 1) - d14);
    }

    public final Z6.d[] a(CameraOptions cameraOptions, String str) {
        double max;
        Point point;
        final boolean z2;
        Intrinsics.checkNotNullParameter(cameraOptions, StubApp.getString2(7578));
        MapboxMap mapboxMap = this.f8823c;
        CameraState cameraState = mapboxMap.getCameraState();
        EdgeInsets padding = cameraState.getPadding();
        Intrinsics.checkNotNullExpressionValue(padding, "currentCameraState.padding");
        EdgeInsets padding2 = cameraOptions.getPadding();
        if (padding2 == null) {
            padding2 = padding;
        }
        Point center = cameraOptions.getCenter();
        if (center == null) {
            center = cameraState.getCenter();
        }
        Intrinsics.checkNotNullExpressionValue(center, "cameraOptions.center ?: currentCameraState.center");
        Point i3 = k.i(center);
        Double zoom = cameraOptions.getZoom();
        if (zoom == null) {
            zoom = Double.valueOf(cameraState.getZoom());
        }
        double doubleValue = zoom.doubleValue();
        Double bearing = cameraOptions.getBearing();
        if (bearing == null) {
            bearing = Double.valueOf(cameraState.getBearing());
        }
        double doubleValue2 = bearing.doubleValue();
        double pitch = cameraState.getPitch();
        Double pitch2 = cameraOptions.getPitch();
        if (pitch2 == null) {
            pitch2 = Double.valueOf(pitch);
        }
        double doubleValue3 = pitch2.doubleValue();
        double bearing2 = cameraState.getBearing();
        final double pow = Math.pow(2.0d, cameraState.getZoom());
        double log2 = MathKt.log2(pow);
        double coerceIn = RangesKt.coerceIn(doubleValue, mapboxMap.getBounds().getMinZoom(), mapboxMap.getBounds().getMaxZoom());
        Point center2 = cameraState.getCenter();
        Intrinsics.checkNotNullExpressionValue(center2, "currentCameraState.center");
        Point g10 = k.g(k.i(center2), i3);
        MapboxMap mapboxMap2 = this.f8822b;
        final MercatorCoordinate project = mapboxMap2.project(g10, pow);
        final MercatorCoordinate project2 = mapboxMap2.project(i3, pow);
        MapboxMap mapboxMap3 = this.f8821a;
        Size size = mapboxMap3.getSize();
        float pixelRatio = mapboxMap3.getMapOptions().getPixelRatio();
        if (size.getWidth() == padding2.getRight() + padding2.getLeft() || size.getHeight() == padding2.getTop() + padding2.getBottom()) {
            double d8 = pixelRatio;
            max = Math.max(size.getWidth() / d8, size.getHeight() / d8);
        } else {
            double d10 = pixelRatio;
            max = Math.max(((size.getWidth() - padding2.getLeft()) - padding2.getRight()) / d10, ((size.getHeight() - padding2.getTop()) - padding2.getBottom()) / d10);
        }
        final double d11 = max;
        double pow2 = d11 / Math.pow(2.0d, coerceIn - log2);
        final double hypot = Math.hypot(k.f(project2, project).getX(), k.f(project2, project).getY());
        final double b2 = hypot == 0.0d ? Double.POSITIVE_INFINITY : b(pow2, d11, hypot, 0);
        double b10 = hypot != 0.0d ? b(pow2, d11, hypot, 1) : Double.POSITIVE_INFINITY;
        if (Math.abs(hypot) < 1.0E-6d || Double.isInfinite(b2) || Double.isInfinite(b10)) {
            point = i3;
            z2 = true;
        } else {
            point = i3;
            z2 = false;
        }
        final double abs = (z2 ? Math.abs(Math.log(pow2 / d11)) : b10 - b2) / 1.42d;
        Point point2 = point;
        EdgeInsets edgeInsets = padding2;
        TypeEvaluator typeEvaluator = new TypeEvaluator() { // from class: Y6.o
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f10, Object obj, Object obj2) {
                double tanh;
                r this$0 = r.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MercatorCoordinate startPoint = project;
                Intrinsics.checkNotNullParameter(startPoint, "$startPoint");
                MercatorCoordinate endPoint = project2;
                Intrinsics.checkNotNullParameter(endPoint, "$endPoint");
                this$0.getClass();
                if (Float.isNaN(f10)) {
                    f10 = 0.0f;
                }
                double d12 = f10 * abs;
                if (f10 == 1.0f) {
                    tanh = 1.0d;
                } else if (z2) {
                    tanh = 0.0d;
                } else {
                    double d13 = b2;
                    tanh = ((((Math.tanh((1.42d * d12) + d13) * Math.cosh(d13)) - Math.sinh(d13)) * d11) / 2.0164d) / hypot;
                }
                return this$0.f8822b.unproject(new MercatorCoordinate(((endPoint.getX() - startPoint.getX()) * tanh) + startPoint.getX(), ((endPoint.getY() - startPoint.getY()) * tanh) + startPoint.getY()), pow);
            }
        };
        boolean z10 = z2;
        Object[] targets = Arrays.copyOf(new Point[]{point2}, 1);
        Intrinsics.checkNotNullParameter(targets, "targets");
        Unit unit = Unit.INSTANCE;
        m mVar = new m(Arrays.copyOf(targets, targets.length), g10, null);
        HashMap hashMap = f8820e;
        Z6.f fVar = new Z6.f(typeEvaluator, mVar, true, (Function1) hashMap.get(n.f8789a));
        if (str != null) {
            fVar.f8994b = str;
        }
        q qVar = new q(abs, this, log2, z10, pow2, d11, b2);
        Object[] targets2 = Arrays.copyOf(new Double[]{Double.valueOf(coerceIn)}, 1);
        Intrinsics.checkNotNullParameter(targets2, "targets");
        Z6.j jVar = new Z6.j(qVar, new m(Arrays.copyOf(targets2, targets2.length), Double.valueOf(log2), null), (Function1) hashMap.get(n.f8790b));
        if (str != null) {
            jVar.f8994b = str;
        }
        List mutableListOf = CollectionsKt.mutableListOf(fVar, jVar);
        if (doubleValue2 != bearing2) {
            Object[] targets3 = Arrays.copyOf(new Double[]{Double.valueOf(doubleValue2)}, 1);
            Intrinsics.checkNotNullParameter(targets3, "targets");
            Z6.e eVar = new Z6.e(new m(Arrays.copyOf(targets3, targets3.length), Double.valueOf(bearing2), null), (Function1) hashMap.get(n.f8791c));
            if (str != null) {
                eVar.f8994b = str;
            }
            mutableListOf.add(eVar);
        }
        if (doubleValue3 != pitch) {
            Object[] targets4 = Arrays.copyOf(new Double[]{Double.valueOf(doubleValue3)}, 1);
            Intrinsics.checkNotNullParameter(targets4, "targets");
            Z6.h hVar = new Z6.h(new m(Arrays.copyOf(targets4, targets4.length), Double.valueOf(pitch), null), (Function1) hashMap.get(n.f8792d));
            if (str != null) {
                hVar.f8994b = str;
            }
            mutableListOf.add(hVar);
        }
        if (!Intrinsics.areEqual(edgeInsets, padding)) {
            Object[] targets5 = Arrays.copyOf(new EdgeInsets[]{edgeInsets}, 1);
            Intrinsics.checkNotNullParameter(targets5, "targets");
            Z6.g gVar = new Z6.g(new m(Arrays.copyOf(targets5, targets5.length), padding, null), (Function1) hashMap.get(n.f8794f));
            if (str != null) {
                gVar.f8994b = str;
            }
            mutableListOf.add(gVar);
        }
        Object[] array = mutableListOf.toArray(new Z6.d[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (Z6.d[]) array;
    }
}
