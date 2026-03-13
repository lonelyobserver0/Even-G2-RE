package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: androidx.recyclerview.widget.x, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0470x {

    /* renamed from: a, reason: collision with root package name */
    public int f10320a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f10321b;

    /* renamed from: c, reason: collision with root package name */
    public M f10322c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10323d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10324e;

    /* renamed from: f, reason: collision with root package name */
    public View f10325f;

    /* renamed from: g, reason: collision with root package name */
    public final Z f10326g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10327h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f10328i;
    public final DecelerateInterpolator j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f10329k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f10330l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10331m;

    /* renamed from: n, reason: collision with root package name */
    public float f10332n;

    /* renamed from: o, reason: collision with root package name */
    public int f10333o;

    /* renamed from: p, reason: collision with root package name */
    public int f10334p;

    public C0470x(Context context) {
        Z z2 = new Z();
        z2.f10096d = -1;
        z2.f10098f = false;
        z2.f10099g = 0;
        z2.f10093a = 0;
        z2.f10094b = 0;
        z2.f10095c = Integer.MIN_VALUE;
        z2.f10097e = null;
        this.f10326g = z2;
        this.f10328i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.f10331m = false;
        this.f10333o = 0;
        this.f10334p = 0;
        this.f10330l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i3, int i10, int i11, int i12, int i13) {
        if (i13 == -1) {
            return i11 - i3;
        }
        if (i13 != 0) {
            if (i13 == 1) {
                return i12 - i10;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i14 = i11 - i3;
        if (i14 > 0) {
            return i14;
        }
        int i15 = i12 - i10;
        if (i15 < 0) {
            return i15;
        }
        return 0;
    }

    public float b(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public final int c(int i3) {
        float abs = Math.abs(i3);
        if (!this.f10331m) {
            this.f10332n = b(this.f10330l);
            this.f10331m = true;
        }
        return (int) Math.ceil(abs * this.f10332n);
    }

    public final PointF d(int i3) {
        Object obj = this.f10322c;
        if (obj instanceof a0) {
            return ((a0) obj).a(i3);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + a0.class.getCanonicalName());
        return null;
    }

    public final void e(int i3, int i10) {
        PointF d8;
        RecyclerView recyclerView = this.f10321b;
        if (this.f10320a == -1 || recyclerView == null) {
            g();
        }
        if (this.f10323d && this.f10325f == null && this.f10322c != null && (d8 = d(this.f10320a)) != null) {
            float f10 = d8.x;
            if (f10 != 0.0f || d8.y != 0.0f) {
                recyclerView.scrollStep((int) Math.signum(f10), (int) Math.signum(d8.y), null);
            }
        }
        this.f10323d = false;
        View view = this.f10325f;
        Z z2 = this.f10326g;
        if (view != null) {
            if (this.f10321b.getChildLayoutPosition(view) == this.f10320a) {
                View view2 = this.f10325f;
                b0 b0Var = recyclerView.mState;
                f(view2, z2);
                z2.a(recyclerView);
                g();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f10325f = null;
            }
        }
        if (this.f10324e) {
            b0 b0Var2 = recyclerView.mState;
            if (this.f10321b.mLayout.v() == 0) {
                g();
            } else {
                int i11 = this.f10333o;
                int i12 = i11 - i3;
                if (i11 * i12 <= 0) {
                    i12 = 0;
                }
                this.f10333o = i12;
                int i13 = this.f10334p;
                int i14 = i13 - i10;
                if (i13 * i14 <= 0) {
                    i14 = 0;
                }
                this.f10334p = i14;
                if (i12 == 0 && i14 == 0) {
                    PointF d10 = d(this.f10320a);
                    if (d10 != null) {
                        if (d10.x != 0.0f || d10.y != 0.0f) {
                            float f11 = d10.y;
                            float sqrt = (float) Math.sqrt((f11 * f11) + (r9 * r9));
                            float f12 = d10.x / sqrt;
                            d10.x = f12;
                            float f13 = d10.y / sqrt;
                            d10.y = f13;
                            this.f10329k = d10;
                            this.f10333o = (int) (f12 * 10000.0f);
                            this.f10334p = (int) (f13 * 10000.0f);
                            int c10 = c(10000);
                            LinearInterpolator linearInterpolator = this.f10328i;
                            z2.f10093a = (int) (this.f10333o * 1.2f);
                            z2.f10094b = (int) (this.f10334p * 1.2f);
                            z2.f10095c = (int) (c10 * 1.2f);
                            z2.f10097e = linearInterpolator;
                            z2.f10098f = true;
                        }
                    }
                    z2.f10096d = this.f10320a;
                    g();
                }
            }
            boolean z10 = z2.f10096d >= 0;
            z2.a(recyclerView);
            if (z10 && this.f10324e) {
                this.f10323d = true;
                recyclerView.mViewFlinger.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(android.view.View r11, androidx.recyclerview.widget.Z r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0470x.f(android.view.View, androidx.recyclerview.widget.Z):void");
    }

    public final void g() {
        if (this.f10324e) {
            this.f10324e = false;
            this.f10334p = 0;
            this.f10333o = 0;
            this.f10329k = null;
            this.f10321b.mState.f10108a = -1;
            this.f10325f = null;
            this.f10320a = -1;
            this.f10323d = false;
            M m4 = this.f10322c;
            if (m4.f10042e == this) {
                m4.f10042e = null;
            }
            this.f10322c = null;
            this.f10321b = null;
        }
    }
}
