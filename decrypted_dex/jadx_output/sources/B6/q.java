package B6;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import i7.EnumC1061a;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q extends i {

    /* renamed from: H, reason: collision with root package name */
    public static final HashSet f730H;

    /* renamed from: A, reason: collision with root package name */
    public float f731A;

    /* renamed from: B, reason: collision with root package name */
    public float f732B;

    /* renamed from: C, reason: collision with root package name */
    public float f733C;

    /* renamed from: D, reason: collision with root package name */
    public float f734D;

    /* renamed from: E, reason: collision with root package name */
    public float f735E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f736F;

    /* renamed from: G, reason: collision with root package name */
    public float f737G;

    /* renamed from: v, reason: collision with root package name */
    public final GestureDetector f738v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f739w;

    /* renamed from: x, reason: collision with root package name */
    public PointF f740x;

    /* renamed from: y, reason: collision with root package name */
    public float f741y;

    /* renamed from: z, reason: collision with root package name */
    public float f742z;

    static {
        HashSet hashSet = new HashSet();
        f730H = hashSet;
        hashSet.add(1);
        hashSet.add(15);
    }

    public q(Context context, a aVar) {
        super(context, aVar);
        this.f738v = new GestureDetector(context, new p(this, 0));
    }

    @Override // B6.i, B6.f, B6.b
    public final boolean a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f739w) {
            if (actionMasked == 5 || actionMasked == 3) {
                boolean z2 = this.f709q;
                if (!z2) {
                    this.f739w = false;
                } else if (z2) {
                    this.f710r = true;
                }
            } else if (!this.f709q && actionMasked == 1) {
                this.f739w = false;
            }
        }
        return this.f738v.onTouchEvent(motionEvent) | super.a(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    @Override // B6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B6.q.c():boolean");
    }

    @Override // B6.f
    public final int d() {
        return (!this.f709q || this.f739w) ? 1 : 2;
    }

    @Override // B6.f
    public final boolean e() {
        if (super.e()) {
            return true;
        }
        return !this.f739w && this.f699l.size() < 2;
    }

    @Override // B6.f
    public final void g() {
        this.f741y = 0.0f;
        this.f734D = 0.0f;
        this.f742z = 0.0f;
        this.f733C = 0.0f;
        this.f737G = 1.0f;
    }

    @Override // B6.i
    public final void i() {
        double coerceAtLeast;
        ScreenCoordinate screenCoordinate;
        super.i();
        i7.g gVar = (i7.g) this.f682h;
        float f10 = this.f712t;
        float f11 = this.f713u;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(this, "detector");
        i7.o oVar = gVar.f14864a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(this, "detector");
        Y.m mVar = oVar.f14904h;
        MapboxMap mapboxMap = null;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gestureState");
            mVar = null;
        }
        mVar.w(oVar.f14890I ? EnumC1061a.f14856c : EnumC1061a.f14855b);
        Iterator it = oVar.f14924x.iterator();
        if (it.hasNext()) {
            throw com.mapbox.common.b.e(it);
        }
        float abs = Math.abs(f11) + Math.abs(f10);
        if (oVar.f14919r0.f15367l && abs >= oVar.f14888G && oVar.f14891K / abs >= oVar.f14889H) {
            boolean z2 = this.f736F;
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(0.0d, RangesKt.coerceAtMost(2.5d, abs * 2.5d * 1.0E-4d));
            if (z2) {
                coerceAtLeast = -coerceAtLeast;
            }
            double d8 = coerceAtLeast;
            MapboxMap mapboxMap2 = oVar.f14909m;
            if (mapboxMap2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapCameraManagerDelegate");
            } else {
                mapboxMap = mapboxMap2;
            }
            double zoom = mapboxMap.getCameraState().getZoom();
            ScreenCoordinate screenCoordinate2 = oVar.f14919r0.f15366k;
            if (screenCoordinate2 == null) {
                if (oVar.f14890I) {
                    screenCoordinate2 = oVar.f14926z;
                } else {
                    PointF pointF = this.f701n;
                    screenCoordinate = new ScreenCoordinate(pointF.x, pointF.y);
                    ValueAnimator[] J10 = oVar.J(zoom, d8, screenCoordinate, (long) ((Math.log((1 / Math.pow(2.718281828459045d, 2.0d)) + Math.abs(d8)) + 2) * 150.0d));
                    oVar.f14906k0 = J10;
                    oVar.O(J10);
                }
            }
            screenCoordinate = screenCoordinate2;
            ValueAnimator[] J102 = oVar.J(zoom, d8, screenCoordinate, (long) ((Math.log((1 / Math.pow(2.718281828459045d, 2.0d)) + Math.abs(d8)) + 2) * 150.0d));
            oVar.f14906k0 = J102;
            oVar.O(J102);
        }
        this.f739w = false;
    }

    @Override // B6.i
    public final HashSet j() {
        return f730H;
    }
}
