package Y6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraAnimationHint;
import com.mapbox.maps.CameraAnimationHintStage;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MercatorCoordinate;
import com.mapbox.maps.ScreenCoordinate;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class k {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.mapbox.geojson.Point, com.mapbox.maps.EdgeInsets, com.mapbox.maps.ScreenCoordinate, java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v4 */
    public static final CameraAnimationHint a(AnimatorSet animatorSet, List list, CameraState cameraState) {
        long totalDuration;
        Object obj;
        long j;
        float coerceIn;
        String string2 = StubApp.getString2(4416);
        Intrinsics.checkNotNullParameter(animatorSet, string2);
        Intrinsics.checkNotNullParameter(list, StubApp.getString2(7565));
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        Intrinsics.checkNotNullExpressionValue(childAnimations, "childAnimations");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : childAnimations) {
            if (obj2 instanceof Z6.d) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int size2 = animatorSet.getChildAnimations().size();
        String string22 = StubApp.getString2(374);
        ?? r72 = 0;
        if (size != size2) {
            MapboxLogger.logW(string22, StubApp.getString2(7566));
            return null;
        }
        long j3 = 0;
        if (animatorSet.getStartDelay() != 0) {
            MapboxLogger.logW(string22, StubApp.getString2(7567));
            return null;
        }
        if (animatorSet.getChildAnimations().isEmpty()) {
            MapboxLogger.logW(string22, StubApp.getString2(7568));
            return null;
        }
        if (animatorSet.getDuration() >= 0) {
            totalDuration = animatorSet.getDuration();
        } else {
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            totalDuration = ((Z6.d) it.next()).getTotalDuration();
            while (it.hasNext()) {
                long totalDuration2 = ((Z6.d) it.next()).getTotalDuration();
                if (totalDuration < totalDuration2) {
                    totalDuration = totalDuration2;
                }
            }
        }
        if (arrayList.isEmpty() || totalDuration == 0) {
            return null;
        }
        if (totalDuration != -1) {
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((Z6.d) it2.next()).getDuration() == -1) {
                    }
                }
            }
            CameraOptions.Builder builder = new CameraOptions.Builder();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.f(list));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                float floatValue = ((Number) it3.next()).floatValue();
                Intrinsics.checkNotNullParameter(builder, string2);
                builder.center(r72);
                builder.padding(r72);
                builder.anchor(r72);
                builder.zoom(r72);
                builder.bearing(r72);
                builder.pitch(r72);
                ArrayList arrayList3 = new ArrayList(CollectionsKt.f(arrayList));
                Iterator it4 = arrayList.iterator();
                Object obj3 = r72;
                while (it4.hasNext()) {
                    Z6.d dVar = (Z6.d) it4.next();
                    long j10 = j3;
                    try {
                        long duration = dVar.getDuration();
                        if (duration <= j10) {
                            coerceIn = 1.0f;
                            obj = obj3;
                            j = totalDuration;
                        } else {
                            obj = obj3;
                            j = totalDuration;
                            try {
                                coerceIn = RangesKt___RangesKt.coerceIn(((totalDuration * floatValue) - dVar.getStartDelay()) / duration, 0.0f, 1.0f);
                            } catch (UnsupportedOperationException e10) {
                                e = e10;
                                MapboxLogger.logW(string22, StubApp.getString2(7569) + dVar.l().name() + StubApp.getString2(994) + e.getMessage());
                                arrayList3.add(Unit.INSTANCE);
                                j3 = j10;
                                obj3 = obj;
                                totalDuration = j;
                            }
                        }
                        try {
                            h(dVar, dVar.k(coerceIn, cameraState), builder);
                        } catch (UnsupportedOperationException e11) {
                            e = e11;
                            MapboxLogger.logW(string22, StubApp.getString2(7569) + dVar.l().name() + StubApp.getString2(994) + e.getMessage());
                            arrayList3.add(Unit.INSTANCE);
                            j3 = j10;
                            obj3 = obj;
                            totalDuration = j;
                        }
                    } catch (UnsupportedOperationException e12) {
                        e = e12;
                        obj = obj3;
                        j = totalDuration;
                    }
                    arrayList3.add(Unit.INSTANCE);
                    j3 = j10;
                    obj3 = obj;
                    totalDuration = j;
                }
                long j11 = j3;
                arrayList2.add(new CameraAnimationHintStage.Builder().camera(builder.build()).progress((long) (totalDuration * floatValue)).build());
                j3 = j11;
                r72 = obj3;
            }
            return new CameraAnimationHint.Builder().stages(arrayList2).build();
        }
        MapboxLogger.logW(string22, StubApp.getString2(7570));
        return null;
    }

    public static Z6.e b(a aVar, m options, Function1 function1) {
        ((j) aVar).getClass();
        Intrinsics.checkNotNullParameter(options, "options");
        return new Z6.e(options, function1);
    }

    public static void d(MapboxMap mapboxMap, CameraOptions cameraOptions, t tVar) {
        Intrinsics.checkNotNullParameter(mapboxMap, "<this>");
        Intrinsics.checkNotNullParameter(cameraOptions, "cameraOptions");
        boolean z2 = mapboxMap.cameraAnimationsPlugin(new E1.b(4, cameraOptions, tVar)) instanceof Cancelable;
    }

    public static final a e(g7.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        X6.j plugin = fVar.getPlugin(StubApp.getString2(7571));
        Intrinsics.checkNotNull(plugin);
        return (a) plugin;
    }

    public static ScreenCoordinate f(MercatorCoordinate mercatorCoordinate, MercatorCoordinate arg) {
        Intrinsics.checkNotNullParameter(mercatorCoordinate, "<this>");
        Intrinsics.checkNotNullParameter(arg, "arg");
        return new ScreenCoordinate(mercatorCoordinate.getX() - arg.getX(), mercatorCoordinate.getY() - arg.getY());
    }

    public static Point g(Point start, Point end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        double abs = Math.abs(end.longitude() - start.longitude());
        if (abs <= 180.0d || abs >= 360.0d) {
            return start;
        }
        double longitude = start.longitude();
        if (start.longitude() > 0.0d && end.longitude() < 0.0d) {
            longitude -= 360;
        } else if (start.longitude() < 0.0d && end.longitude() > 0.0d) {
            longitude += 360;
        }
        Point fromLngLat = Point.fromLngLat(longitude, start.latitude());
        Intrinsics.checkNotNullExpressionValue(fromLngLat, "fromLngLat(lon, start.latitude())");
        return fromLngLat;
    }

    public static final void h(Z6.d cameraAnimator, Object obj, CameraOptions.Builder cameraOptionsBuilder) {
        Intrinsics.checkNotNullParameter(cameraAnimator, "cameraAnimator");
        Intrinsics.checkNotNullParameter(cameraOptionsBuilder, "cameraOptionsBuilder");
        if (cameraAnimator instanceof Z6.f) {
            cameraOptionsBuilder.center(obj instanceof Point ? (Point) obj : null);
            return;
        }
        if (cameraAnimator instanceof Z6.j) {
            cameraOptionsBuilder.zoom(obj instanceof Double ? (Double) obj : null);
            return;
        }
        if (cameraAnimator instanceof Z6.a) {
            cameraOptionsBuilder.anchor(obj instanceof ScreenCoordinate ? (ScreenCoordinate) obj : null);
            return;
        }
        if (cameraAnimator instanceof Z6.g) {
            cameraOptionsBuilder.padding(obj instanceof EdgeInsets ? (EdgeInsets) obj : null);
        } else if (cameraAnimator instanceof Z6.e) {
            cameraOptionsBuilder.bearing(obj instanceof Double ? (Double) obj : null);
        } else if (cameraAnimator instanceof Z6.h) {
            cameraOptionsBuilder.pitch(obj instanceof Double ? (Double) obj : null);
        }
    }

    public static Point i(Point point) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        double longitude = point.longitude();
        double d8 = longitude - 180.0d;
        if (Math.abs(d8) < 1.0E-6d) {
            longitude = -180.0d;
        } else {
            double d10 = longitude - (-180.0d);
            if ((d10 <= 1.0E-6d && Math.abs(d10) >= 1.0E-6d) || d8 >= -1.0E-6d) {
                double d11 = (d10 % 360.0d) - 180.0d;
                longitude = longitude < -180.0d ? d11 + 360.0d : d11;
            }
        }
        if (Double.isNaN(longitude)) {
            Point fromLngLat = Point.fromLngLat(point.longitude(), point.latitude());
            Intrinsics.checkNotNullExpressionValue(fromLngLat, "fromLngLat(this.longitude(), this.latitude())");
            return fromLngLat;
        }
        Point fromLngLat2 = Point.fromLngLat(longitude, point.latitude());
        Intrinsics.checkNotNullExpressionValue(fromLngLat2, "fromLngLat(lng, this.latitude())");
        return fromLngLat2;
    }
}
