package B6;

import Y6.t;
import android.view.MotionEvent;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.util.CoreGesturesHandler;
import com.stub.StubApp;
import i7.EnumC1061a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k extends i {

    /* renamed from: y, reason: collision with root package name */
    public static final HashSet f718y;

    /* renamed from: v, reason: collision with root package name */
    public float f719v;

    /* renamed from: w, reason: collision with root package name */
    public float f720w;

    /* renamed from: x, reason: collision with root package name */
    public float f721x;

    static {
        HashSet hashSet = new HashSet();
        f718y = hashSet;
        hashSet.add(3);
    }

    @Override // B6.f, B6.b
    public final boolean b(int i3) {
        return Math.abs(this.f721x) >= this.f720w && super.b(3);
    }

    @Override // B6.f
    public final boolean c() {
        double coerceAtLeast;
        MotionEvent motionEvent = this.f679e;
        ArrayList arrayList = this.f699l;
        float y10 = motionEvent.getY(motionEvent.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent2 = this.f679e;
        float y11 = (motionEvent2.getY(motionEvent2.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + y10) / 2.0f;
        MotionEvent motionEvent3 = this.f678d;
        float y12 = motionEvent3.getY(motionEvent3.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent4 = this.f678d;
        float y13 = ((motionEvent4.getY(motionEvent4.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + y12) / 2.0f) - y11;
        this.f721x += y13;
        boolean z2 = this.f709q;
        Y.m mVar = null;
        Y6.a aVar = null;
        String string2 = StubApp.getString2(685);
        if (!z2 || y13 == 0.0f) {
            if (b(3)) {
                i7.h hVar = (i7.h) this.f682h;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(this, string2);
                i7.o oVar = hVar.f14865a;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(this, string2);
                if (oVar.f14919r0.f15362e) {
                    oVar.I();
                    Y.m mVar2 = oVar.f14904h;
                    if (mVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("gestureState");
                    } else {
                        mVar = mVar2;
                    }
                    mVar.x(EnumC1061a.f14857d);
                    Iterator it = oVar.f14925y.iterator();
                    if (it.hasNext()) {
                        throw com.mapbox.common.b.e(it);
                    }
                    h();
                    return true;
                }
            }
            return false;
        }
        i7.h hVar2 = (i7.h) this.f682h;
        hVar2.getClass();
        Intrinsics.checkNotNullParameter(this, string2);
        i7.o oVar2 = hVar2.f14865a;
        oVar2.getClass();
        Intrinsics.checkNotNullParameter(this, string2);
        MapboxMap mapboxMap = oVar2.f14909m;
        String string22 = StubApp.getString2(689);
        if (mapboxMap == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string22);
            mapboxMap = null;
        }
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(0.0d, RangesKt.coerceAtMost(85.0d, mapboxMap.getCameraState().getPitch() - (y13 * 0.1f)));
        if (oVar2.f14885D || oVar2.f14884C) {
            MapboxMap mapboxMap2 = oVar2.f14909m;
            if (mapboxMap2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string22);
                mapboxMap2 = null;
            }
            MapboxMap mapboxMap3 = oVar2.f14909m;
            if (mapboxMap3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string22);
                mapboxMap3 = null;
            }
            Point center = mapboxMap3.getCameraState().getCenter();
            Intrinsics.checkNotNullExpressionValue(center, "mapCameraManagerDelegate.cameraState.center");
            oVar2.f14883B = mapboxMap2.pixelForCoordinate(center);
            oVar2.f14885D = false;
            oVar2.f14884C = false;
        }
        CoreGesturesHandler coreGesturesHandler = oVar2.f14913o0;
        if (coreGesturesHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coreGesturesHandler");
            coreGesturesHandler = null;
        }
        coreGesturesHandler.notifyCoreGestureStarted();
        Y6.a aVar2 = oVar2.f14914p;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraAnimationsPlugin");
        } else {
            aVar = aVar2;
        }
        CameraOptions build = new CameraOptions.Builder().anchor(oVar2.f14883B).pitch(Double.valueOf(coerceAtLeast)).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().anchor(cameraC…ate).pitch(pitch).build()");
        t tVar = i7.o.f14881s0;
        ((Y6.j) aVar).e(build, i7.o.f14881s0, null);
        Iterator it2 = oVar2.f14925y.iterator();
        if (it2.hasNext()) {
            throw com.mapbox.common.b.e(it2);
        }
        return true;
    }

    @Override // B6.f
    public final boolean e() {
        if (!super.e()) {
            HashMap hashMap = this.f700m;
            ArrayList arrayList = this.f699l;
            e eVar = (e) hashMap.get(new h((Integer) arrayList.get(0), (Integer) arrayList.get(1)));
            double degrees = Math.toDegrees(Math.abs(Math.atan2(eVar.f695d, eVar.f694c)));
            double d8 = this.f719v;
            if (degrees <= d8 || 180.0d - degrees <= d8) {
                return false;
            }
        }
        return true;
    }

    @Override // B6.f
    public final void g() {
        this.f721x = 0.0f;
    }

    @Override // B6.i
    public final void i() {
        super.i();
        i7.h hVar = (i7.h) this.f682h;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(this, "detector");
        i7.o oVar = hVar.f14865a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(this, "detector");
        Y.m mVar = oVar.f14904h;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gestureState");
            mVar = null;
        }
        mVar.w(EnumC1061a.f14857d);
        Iterator it = oVar.f14925y.iterator();
        if (it.hasNext()) {
            throw com.mapbox.common.b.e(it);
        }
    }

    @Override // B6.i
    public final HashSet j() {
        return f718y;
    }
}
