package A9;

import Xa.o;
import Z9.C0366a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import c2.C0550b;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.location.DeviceLocationProvider;
import com.mapbox.common.location.Location;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.ExtensionUtils;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.threading.AnimationThreadController;
import com.mapbox.maps.util.CameraOptionsUtils;
import com.stub.StubApp;
import d2.InterfaceC0798a;
import i5.C1059c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import l7.C1241k;
import l7.C1243m;
import m9.C1289c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i3, Object obj, Object obj2) {
        super(0);
        this.f239a = i3;
        this.f240b = obj;
        this.f241c = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v49, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        m9.e eVar;
        double d8;
        CameraOptions cameraOptions$default;
        switch (this.f239a) {
            case 0:
                AtomicBoolean atomicBoolean = ((l) this.f240b).f238a;
                if (!atomicBoolean.get()) {
                    ((Ac.m) this.f241c).invoke();
                }
                atomicBoolean.set(true);
                break;
            case 1:
                ((Ref.BooleanRef) this.f240b).element = false;
                ((Function0) this.f241c).invoke();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                ((P8.i) this.f240b).f5637k = new s2.d((C9.e) this.f241c);
                break;
            case 5:
                Context applicationContext = (Context) this.f240b;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                break;
            case 6:
                ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) this.f240b;
                int length = valueAnimatorArr.length;
                int i3 = 0;
                while (true) {
                    Y6.j jVar = (Y6.j) this.f241c;
                    if (i3 < length) {
                        ValueAnimator valueAnimator = valueAnimatorArr[i3];
                        if (valueAnimator instanceof Z6.d) {
                            jVar.getClass();
                            AnimationThreadController.INSTANCE.postOnAnimatorThread(new Y6.g((Z6.d) valueAnimator, jVar));
                            i3++;
                        } else {
                            MapboxLogger.logE(StubApp.getString2(374), StubApp.getString2(375));
                        }
                    } else {
                        HashSet hashSet = jVar.f8764a;
                        ArrayList arrayList = new ArrayList(valueAnimatorArr.length);
                        for (ValueAnimator valueAnimator2 : valueAnimatorArr) {
                            Intrinsics.checkNotNull(valueAnimator2, "null cannot be cast to non-null type com.mapbox.maps.plugin.animation.animator.CameraAnimator<*>");
                            arrayList.add((Z6.d) valueAnimator2);
                        }
                        hashSet.addAll(arrayList);
                    }
                }
                break;
            case 7:
                ((InterfaceC0798a) ((C0550b) this.f240b).f10786b).b((o) this.f241c);
                break;
            case 8:
                ((DeviceLocationProvider) this.f240b).removeLocationObserver((C1243m) this.f241c);
                break;
            case 9:
                l7.o oVar = (l7.o) ((C1059c) this.f240b).f14842a;
                oVar.getClass();
                C1241k compassListener = (C1241k) this.f241c;
                Intrinsics.checkNotNullParameter(compassListener, "compassListener");
                LinkedHashSet linkedHashSet = oVar.f16775c;
                if (linkedHashSet.remove(compassListener) && linkedHashSet.isEmpty()) {
                    Sensor sensor = oVar.f16777e;
                    boolean z2 = sensor != null;
                    SensorManager sensorManager = oVar.f16774b;
                    if (z2) {
                        sensorManager.unregisterListener(oVar, sensor);
                    } else {
                        sensorManager.unregisterListener(oVar, oVar.f16778f);
                        sensorManager.unregisterListener(oVar, oVar.f16779g);
                    }
                }
                break;
            case 10:
                ValueAnimator valueAnimator3 = (ValueAnimator) this.f240b;
                Object animatedValue = valueAnimator3.getAnimatedValue();
                float animatedFraction = valueAnimator3.getAnimatedFraction();
                m7.e eVar2 = (m7.e) this.f241c;
                eVar2.c(animatedValue, animatedFraction);
                ?? r12 = eVar2.f17136a;
                if (r12 != 0) {
                    r12.invoke(animatedValue);
                }
                break;
            default:
                m9.e eVar3 = (m9.e) this.f240b;
                List<Point> mutableList = CollectionsKt.toMutableList((Collection) eVar3.f17278g);
                Location location = eVar3.f17279h;
                if (location != null) {
                    Intrinsics.checkNotNullParameter(location, "<this>");
                    Point fromLngLat = Point.fromLngLat(location.getLongitude(), location.getLatitude());
                    Intrinsics.checkNotNullExpressionValue(fromLngLat, "fromLngLat(this.longitude, this.latitude)");
                    mutableList.add(0, fromLngLat);
                }
                mutableList.addAll(eVar3.f17284n);
                boolean isEmpty = mutableList.isEmpty();
                EdgeInsets edgeInsets = eVar3.f17283m;
                j9.g gVar = eVar3.j;
                j9.g gVar2 = eVar3.f17280i;
                j9.g gVar3 = eVar3.f17282l;
                Y.m mVar = eVar3.f17275d;
                j9.g gVar4 = eVar3.f17281k;
                CameraState cameraState = (CameraState) this.f241c;
                if (isEmpty) {
                    C0366a c0366a = (C0366a) mVar.f8675c;
                    gVar4.f10728b = Double.valueOf(cameraState.getBearing());
                    gVar3.f10728b = Double.valueOf(cameraState.getPitch());
                    Point center = cameraState.getCenter();
                    Intrinsics.checkNotNullExpressionValue(center, "cameraState.center");
                    gVar2.f10728b = center;
                    double zoom = cameraState.getZoom();
                    c0366a.getClass();
                    gVar.f10728b = Double.valueOf(Math.min(zoom, 16.35d));
                    eVar = eVar3;
                } else {
                    double bearing = cameraState.getBearing();
                    gVar4.f10728b = Double.valueOf(MathKt.roundToInt((((((0.0d - bearing) + 540) % 360) - 180) + bearing) * r5) / Math.pow(10.0d, 6));
                    if (mutableList.isEmpty()) {
                        eVar = eVar3;
                        d8 = 16.35d;
                        cameraOptions$default = ExtensionUtils.toCameraOptions$default(cameraState, null, 1, null);
                    } else {
                        CameraOptions build = new CameraOptions.Builder().padding(edgeInsets).bearing((Double) gVar4.f()).pitch((Double) gVar3.f()).build();
                        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …                 .build()");
                        eVar = eVar3;
                        d8 = 16.35d;
                        cameraOptions$default = eVar3.f17272a.cameraForCoordinates(mutableList, build, null, null, null);
                    }
                    if (!CameraOptionsUtils.isEmpty(cameraOptions$default)) {
                        Point center2 = cameraOptions$default.getCenter();
                        Intrinsics.checkNotNull(center2);
                        gVar2.f10728b = center2;
                        Double zoom2 = cameraOptions$default.getZoom();
                        Intrinsics.checkNotNull(zoom2);
                        double doubleValue = zoom2.doubleValue();
                        ((C0366a) mVar.f8675c).getClass();
                        gVar.f10728b = Double.valueOf(Math.min(doubleValue, d8));
                    } else if (D9.l.a(D9.l.g(), LoggingLevel.WARNING)) {
                        D9.l.h(StubApp.getString2(373), null);
                    }
                }
                C1289c c1289c = new C1289c(eVar, mutableList);
                if (eVar.f17285o) {
                    c1289c.invoke();
                }
                C0366a c0366a2 = (C0366a) mVar.f8675c;
                CameraOptions.Builder builder = new CameraOptions.Builder();
                c0366a2.getClass();
                builder.center((Point) gVar2.f());
                builder.zoom((Double) gVar.f());
                builder.bearing((Double) gVar4.f());
                builder.pitch((Double) gVar3.f());
                builder.padding(edgeInsets);
                CameraOptions build2 = builder.build();
                Intrinsics.checkNotNullExpressionValue(build2, "Builder().apply {\n      …                }.build()");
                eVar.f17286p = build2;
                break;
        }
        return Unit.INSTANCE;
    }
}
