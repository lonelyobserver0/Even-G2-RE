package B6;

import Y6.t;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.util.CoreGesturesHandler;
import com.stub.StubApp;
import f0.C0868a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends i {

    /* renamed from: y, reason: collision with root package name */
    public static final HashSet f714y;

    /* renamed from: v, reason: collision with root package name */
    public float f715v;

    /* renamed from: w, reason: collision with root package name */
    public float f716w;

    /* renamed from: x, reason: collision with root package name */
    public float f717x;

    static {
        HashSet hashSet = new HashSet();
        f714y = hashSet;
        hashSet.add(2);
    }

    @Override // B6.f, B6.b
    public final boolean b(int i3) {
        return Math.abs(this.f716w) >= this.f715v && super.b(2);
    }

    @Override // B6.f
    public final boolean c() {
        HashMap hashMap = this.f700m;
        ArrayList arrayList = this.f699l;
        e eVar = (e) hashMap.get(new h((Integer) arrayList.get(0), (Integer) arrayList.get(1)));
        float degrees = (float) Math.toDegrees(Math.atan2(eVar.f693b, eVar.f692a) - Math.atan2(eVar.f695d, eVar.f694c));
        this.f717x = degrees;
        this.f716w += degrees;
        boolean z2 = this.f709q;
        a aVar = null;
        Y6.a aVar2 = null;
        String string2 = StubApp.getString2(685);
        if (!z2 || degrees == 0.0f) {
            if (b(2)) {
                i7.f fVar = (i7.f) this.f682h;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(this, string2);
                i7.o oVar = fVar.f14863a;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(this, string2);
                if (oVar.f14919r0.f15358a) {
                    float abs = Math.abs(this.f717x);
                    double eventTime = this.f678d.getEventTime();
                    double eventTime2 = this.f679e.getEventTime();
                    if (eventTime != eventTime2) {
                        double d8 = abs / (eventTime - eventTime2);
                        float abs2 = Math.abs(this.f716w);
                        if (d8 >= 0.04d && ((d8 <= 0.07d || abs2 >= 5.0f) && ((d8 <= 0.15d || abs2 >= 7.0f) && (d8 <= 0.5d || abs2 >= 15.0f)))) {
                            a aVar3 = oVar.f14902f;
                            String string22 = StubApp.getString2(688);
                            if (aVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string22);
                                aVar3 = null;
                            }
                            if (!((q) aVar3.f670d).f709q || abs2 >= 16.0f) {
                                if (oVar.f14919r0.f15371q) {
                                    a aVar4 = oVar.f14902f;
                                    if (aVar4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string22);
                                        aVar4 = null;
                                    }
                                    ((q) aVar4.f670d).f735E = oVar.f14895R;
                                    a aVar5 = oVar.f14902f;
                                    if (aVar5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string22);
                                    } else {
                                        aVar = aVar5;
                                    }
                                    q qVar = (q) aVar.f670d;
                                    if (qVar.f709q) {
                                        qVar.f710r = true;
                                    }
                                }
                                oVar.I();
                                Iterator it = oVar.f14923w.iterator();
                                if (it.hasNext()) {
                                    throw com.mapbox.common.b.e(it);
                                }
                                h();
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        i7.f fVar2 = (i7.f) this.f682h;
        fVar2.getClass();
        Intrinsics.checkNotNullParameter(this, string2);
        i7.o oVar2 = fVar2.f14863a;
        oVar2.getClass();
        Intrinsics.checkNotNullParameter(this, string2);
        MapboxMap mapboxMap = oVar2.f14909m;
        if (mapboxMap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapCameraManagerDelegate");
            mapboxMap = null;
        }
        double bearing = mapboxMap.getCameraState().getBearing();
        Y6.a aVar6 = oVar2.f14914p;
        String string23 = StubApp.getString2(686);
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string23);
            aVar6 = null;
        }
        oVar2.h0 = ((Y6.j) aVar6).i();
        double d10 = bearing + degrees;
        ScreenCoordinate screenCoordinate = oVar2.f14919r0.f15366k;
        if (screenCoordinate == null) {
            PointF pointF = this.f701n;
            screenCoordinate = new ScreenCoordinate(pointF.x, pointF.y);
        }
        CoreGesturesHandler coreGesturesHandler = oVar2.f14913o0;
        if (coreGesturesHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coreGesturesHandler");
            coreGesturesHandler = null;
        }
        coreGesturesHandler.notifyCoreGestureStarted();
        if (oVar2.f14919r0.f15361d) {
            Y6.a aVar7 = oVar2.f14914p;
            if (aVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string23);
                aVar7 = null;
            }
            Object[] targets = Arrays.copyOf(new Double[]{Double.valueOf(d10)}, 1);
            Intrinsics.checkNotNullParameter(targets, "targets");
            String owner = StubApp.getString2(687);
            Intrinsics.checkNotNullParameter(owner, "owner");
            Z6.e b2 = Y6.k.b(aVar7, new Y6.m(Arrays.copyOf(targets, targets.length), null, owner), i7.m.f14875c);
            Y6.a aVar8 = oVar2.f14914p;
            if (aVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string23);
                aVar8 = null;
            }
            Object[] targets2 = Arrays.copyOf(new ScreenCoordinate[]{screenCoordinate}, 1);
            Intrinsics.checkNotNullParameter(targets2, "targets");
            Intrinsics.checkNotNullParameter(owner, "owner");
            Y6.m options = new Y6.m(Arrays.copyOf(targets2, targets2.length), null, owner);
            ((Y6.j) aVar8).getClass();
            Intrinsics.checkNotNullParameter(options, "options");
            Z6.a aVar9 = new Z6.a(options, i7.m.f14874b);
            Y6.a aVar10 = oVar2.f14914p;
            if (aVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string23);
                aVar10 = null;
            }
            ((Y6.j) aVar10).j(aVar9, b2);
        } else {
            Y6.a aVar11 = oVar2.f14914p;
            if (aVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string23);
                aVar11 = null;
            }
            CameraOptions build = new CameraOptions.Builder().anchor(screenCoordinate).bearing(Double.valueOf(d10)).build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder()\n          .anc…aring)\n          .build()");
            t tVar = i7.o.f14881s0;
            ((Y6.j) aVar11).e(build, i7.o.f14881s0, null);
        }
        Y6.a aVar12 = oVar2.f14914p;
        if (aVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string23);
        } else {
            aVar2 = aVar12;
        }
        ((Y6.j) aVar2).l(oVar2.h0);
        Iterator it2 = oVar2.f14923w.iterator();
        if (it2.hasNext()) {
            throw com.mapbox.common.b.e(it2);
        }
        return true;
    }

    @Override // B6.f
    public final void g() {
        this.f716w = 0.0f;
    }

    @Override // B6.i
    public final void i() {
        float coerceAtMost;
        Y6.a aVar;
        super.i();
        if (this.f717x == 0.0f) {
            this.f712t = 0.0f;
            this.f713u = 0.0f;
        }
        float f10 = this.f712t;
        float f11 = this.f713u;
        float abs = Math.abs((float) (((r7.y * f10) + (f11 * r8)) / (Math.pow(this.f701n.y, 2.0d) + Math.pow(this.f701n.x, 2.0d))));
        if (this.f717x < 0.0f) {
            abs = -abs;
        }
        i7.f fVar = (i7.f) this.f682h;
        float f12 = this.f712t;
        float f13 = this.f713u;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(this, "detector");
        i7.o oVar = fVar.f14863a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(this, "detector");
        boolean z2 = oVar.f14919r0.f15371q;
        String string2 = StubApp.getString2(688);
        if (z2) {
            a aVar2 = oVar.f14902f;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                aVar2 = null;
            }
            ((q) aVar2.f670d).f735E = oVar.f14899Z;
        }
        Iterator it = oVar.f14923w.iterator();
        if (it.hasNext()) {
            throw com.mapbox.common.b.e(it);
        }
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(30.0f, abs * oVar.f14896T);
        float coerceAtLeast = RangesKt.coerceAtLeast(-30.0f, coerceAtMost);
        double abs2 = Math.abs(this.f717x) / (Math.abs(f13) + Math.abs(f12));
        if (!oVar.f14919r0.f15368m || Math.abs(coerceAtLeast) < oVar.f14897X) {
            return;
        }
        a aVar3 = oVar.f14902f;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            aVar3 = null;
        }
        if (!((q) aVar3.f670d).f709q || abs2 >= oVar.f14898Y) {
            long log = (long) ((Math.log((1 / Math.pow(2.718281828459045d, 2.0d)) + Math.abs(coerceAtLeast)) + 2) * 150.0d);
            ScreenCoordinate screenCoordinate = oVar.f14919r0.f15366k;
            if (screenCoordinate == null) {
                PointF pointF = this.f701n;
                screenCoordinate = new ScreenCoordinate(pointF.x, pointF.y);
            }
            long j = (log / 16) + 1;
            C0868a c0868a = oVar.f14912n0;
            if (1 <= j) {
                float f14 = coerceAtLeast;
                long j3 = 1;
                while (true) {
                    f14 = E1.a.c(1, c0868a.getInterpolation(j3 / j), coerceAtLeast, f14);
                    if (j3 == j) {
                        break;
                    } else {
                        j3++;
                    }
                }
                coerceAtLeast = f14;
            }
            MapboxMap mapboxMap = oVar.f14909m;
            if (mapboxMap == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapCameraManagerDelegate");
                mapboxMap = null;
            }
            double bearing = mapboxMap.getCameraState().getBearing();
            double d8 = coerceAtLeast + bearing;
            Y6.a aVar4 = oVar.f14914p;
            String string22 = StubApp.getString2(686);
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string22);
                aVar4 = null;
            }
            Object[] targets = Arrays.copyOf(new Double[]{Double.valueOf(d8)}, 1);
            Intrinsics.checkNotNullParameter(targets, "targets");
            String owner = StubApp.getString2(687);
            Intrinsics.checkNotNullParameter(owner, "owner");
            Z6.e b2 = Y6.k.b(aVar4, new Y6.m(Arrays.copyOf(targets, targets.length), Double.valueOf(bearing), owner), new i7.l(c0868a, log, 1));
            CoreGesturesHandler coreGesturesHandler = oVar.f14913o0;
            if (coreGesturesHandler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coreGesturesHandler");
                coreGesturesHandler = null;
            }
            b2.addListener(coreGesturesHandler.getCoreGestureAnimatorHandler());
            ScreenCoordinate screenCoordinate2 = new ScreenCoordinate(screenCoordinate.getX(), screenCoordinate.getY());
            Y6.a aVar5 = oVar.f14914p;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string22);
                aVar = null;
            } else {
                aVar = aVar5;
            }
            Object[] targets2 = Arrays.copyOf(new ScreenCoordinate[]{screenCoordinate2}, 1);
            Intrinsics.checkNotNullParameter(targets2, "targets");
            Intrinsics.checkNotNullParameter(owner, "owner");
            Y6.m options = new Y6.m(Arrays.copyOf(targets2, targets2.length), screenCoordinate2, owner);
            i7.l lVar = new i7.l(c0868a, log, 0);
            ((Y6.j) aVar).getClass();
            Intrinsics.checkNotNullParameter(options, "options");
            Z6.a aVar6 = new Z6.a(options, lVar);
            aVar6.addListener(new i7.k(oVar, 0));
            ValueAnimator[] valueAnimatorArr = {b2, aVar6};
            oVar.f14908l0 = valueAnimatorArr;
            oVar.O(valueAnimatorArr);
        }
    }

    @Override // B6.i
    public final HashSet j() {
        return f714y;
    }
}
