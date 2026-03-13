package Q;

import L9.n;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import n.C1358q0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: t, reason: collision with root package name */
    public static final int f5668t = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f5669a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f5670b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f5671c;

    /* renamed from: d, reason: collision with root package name */
    public n f5672d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f5673e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f5674f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5675g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5676h;
    public final float[] j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f5677k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f5678l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5679m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5680n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5681p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5682q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5683r;

    /* renamed from: s, reason: collision with root package name */
    public final C1358q0 f5684s;

    public d(C1358q0 c1358q0) {
        a aVar = new a();
        aVar.f5663e = Long.MIN_VALUE;
        aVar.f5665g = -1L;
        aVar.f5664f = 0L;
        this.f5669a = aVar;
        this.f5670b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f5673e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5674f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.j = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f5677k = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5678l = fArr5;
        this.f5671c = c1358q0;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f5675g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f5676h = f5668t;
        aVar.f5659a = 500;
        aVar.f5660b = 500;
        this.f5684s = c1358q0;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f5673e
            r0 = r0[r4]
            float[] r1 = r3.f5674f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f5670b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.j
            r0 = r0[r4]
            float[] r1 = r3.f5677k
            r1 = r1[r4]
            float[] r2 = r3.f5678l
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.d.a(int, float, float, float):float");
    }

    public final float c(float f10, float f11) {
        if (f11 != 0.0f) {
            int i3 = this.f5675g;
            if (i3 == 0 || i3 == 1) {
                if (f10 < f11) {
                    if (f10 >= 0.0f) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.f5682q && i3 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i3 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i3 = 0;
        if (this.f5680n) {
            this.f5682q = false;
            return;
        }
        a aVar = this.f5669a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i10 = (int) (currentAnimationTimeMillis - aVar.f5663e);
        int i11 = aVar.f5660b;
        if (i10 > i11) {
            i3 = i11;
        } else if (i10 >= 0) {
            i3 = i10;
        }
        aVar.f5667i = i3;
        aVar.f5666h = aVar.a(currentAnimationTimeMillis);
        aVar.f5665g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C1358q0 c1358q0;
        int count;
        a aVar = this.f5669a;
        float f10 = aVar.f5662d;
        int abs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f5661c);
        if (abs != 0 && (count = (c1358q0 = this.f5684s).getCount()) != 0) {
            int childCount = c1358q0.getChildCount();
            int firstVisiblePosition = c1358q0.getFirstVisiblePosition();
            int i3 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && c1358q0.getChildAt(0).getTop() >= 0)) : !(i3 >= count && c1358q0.getChildAt(childCount - 1).getBottom() <= c1358q0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f5683r
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.d()
            return r1
        L1b:
            r7.f5681p = r2
            r7.f5679m = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f5671c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            Q.a r9 = r7.f5669a
            r9.f5661c = r0
            r9.f5662d = r8
            boolean r8 = r7.f5682q
            if (r8 != 0) goto L7e
            boolean r8 = r7.e()
            if (r8 == 0) goto L7e
            L9.n r8 = r7.f5672d
            if (r8 != 0) goto L62
            L9.n r8 = new L9.n
            r9 = 15
            r8.<init>(r7, r9)
            r7.f5672d = r8
        L62:
            r7.f5682q = r2
            r7.f5680n = r2
            boolean r8 = r7.f5679m
            if (r8 != 0) goto L77
            int r8 = r7.f5676h
            if (r8 <= 0) goto L77
            L9.n r9 = r7.f5672d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = N.I.f4732a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L77:
            L9.n r8 = r7.f5672d
            r8.run()
        L7c:
            r7.f5679m = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
