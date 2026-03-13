package S;

import L9.n;
import N.I;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e {

    /* renamed from: v, reason: collision with root package name */
    public static final d f6424v = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public int f6425a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6426b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f6428d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f6429e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f6430f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f6431g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f6432h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f6433i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public int f6434k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f6435l;

    /* renamed from: m, reason: collision with root package name */
    public final float f6436m;

    /* renamed from: n, reason: collision with root package name */
    public final float f6437n;

    /* renamed from: o, reason: collision with root package name */
    public final int f6438o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f6439p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC0624h2 f6440q;

    /* renamed from: r, reason: collision with root package name */
    public View f6441r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6442s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f6443t;

    /* renamed from: c, reason: collision with root package name */
    public int f6427c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final n f6444u = new n(this, 19);

    public e(Context context, CoordinatorLayout coordinatorLayout, AbstractC0624h2 abstractC0624h2) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException(StubApp.getString2(5917));
        }
        if (abstractC0624h2 == null) {
            throw new IllegalArgumentException(StubApp.getString2(5916));
        }
        this.f6443t = coordinatorLayout;
        this.f6440q = abstractC0624h2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f6438o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f6426b = viewConfiguration.getScaledTouchSlop();
        this.f6436m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f6437n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6439p = new OverScroller(context, f6424v);
    }

    public final void a() {
        this.f6427c = -1;
        float[] fArr = this.f6428d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f6429e, 0.0f);
            Arrays.fill(this.f6430f, 0.0f);
            Arrays.fill(this.f6431g, 0.0f);
            Arrays.fill(this.f6432h, 0);
            Arrays.fill(this.f6433i, 0);
            Arrays.fill(this.j, 0);
            this.f6434k = 0;
        }
        VelocityTracker velocityTracker = this.f6435l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6435l = null;
        }
    }

    public final void b(View view, int i3) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f6443t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException(StubApp.getString2(5918) + coordinatorLayout + StubApp.getString2(74));
        }
        this.f6441r = view;
        this.f6427c = i3;
        this.f6440q.r(view, i3);
        n(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            com.google.android.gms.internal.measurement.h2 r1 = r3.f6440q
            int r4 = r1.l(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.m()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.f6426b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f6426b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f6426b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S.e.c(android.view.View, float, float):boolean");
    }

    public final void d(int i3) {
        float[] fArr = this.f6428d;
        if (fArr != null) {
            int i10 = this.f6434k;
            int i11 = 1 << i3;
            if ((i10 & i11) != 0) {
                fArr[i3] = 0.0f;
                this.f6429e[i3] = 0.0f;
                this.f6430f[i3] = 0.0f;
                this.f6431g[i3] = 0.0f;
                this.f6432h[i3] = 0;
                this.f6433i[i3] = 0;
                this.j[i3] = 0;
                this.f6434k = (~i11) & i10;
            }
        }
    }

    public final int e(int i3, int i10, int i11) {
        if (i3 == 0) {
            return 0;
        }
        float width = this.f6443t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i3) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i10);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i3) / i11) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f6425a == 2) {
            OverScroller overScroller = this.f6439p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f6441r.getLeft();
            int top = currY - this.f6441r.getTop();
            if (left != 0) {
                View view = this.f6441r;
                WeakHashMap weakHashMap = I.f4732a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f6441r;
                WeakHashMap weakHashMap2 = I.f4732a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f6440q.t(this.f6441r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f6443t.post(this.f6444u);
            }
        }
        return this.f6425a == 2;
    }

    public final View g(int i3, int i10) {
        CoordinatorLayout coordinatorLayout = this.f6443t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f6440q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i3 >= childAt.getLeft() && i3 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i3, int i10, int i11, int i12) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f6441r.getLeft();
        int top = this.f6441r.getTop();
        int i13 = i3 - left;
        int i14 = i10 - top;
        OverScroller overScroller = this.f6439p;
        if (i13 == 0 && i14 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f6441r;
        int i15 = (int) this.f6437n;
        int i16 = (int) this.f6436m;
        int abs = Math.abs(i11);
        if (abs < i15) {
            i11 = 0;
        } else if (abs > i16) {
            i11 = i11 > 0 ? i16 : -i16;
        }
        int abs2 = Math.abs(i12);
        if (abs2 < i15) {
            i12 = 0;
        } else if (abs2 > i16) {
            i12 = i12 > 0 ? i16 : -i16;
        }
        int abs3 = Math.abs(i13);
        int abs4 = Math.abs(i14);
        int abs5 = Math.abs(i11);
        int abs6 = Math.abs(i12);
        int i17 = abs5 + abs6;
        int i18 = abs3 + abs4;
        if (i11 != 0) {
            f10 = abs5;
            f11 = i17;
        } else {
            f10 = abs3;
            f11 = i18;
        }
        float f14 = f10 / f11;
        if (i12 != 0) {
            f12 = abs6;
            f13 = i17;
        } else {
            f12 = abs4;
            f13 = i18;
        }
        float f15 = f12 / f13;
        AbstractC0624h2 abstractC0624h2 = this.f6440q;
        overScroller.startScroll(left, top, i13, i14, (int) ((e(i14, i12, abstractC0624h2.m()) * f15) + (e(i13, i11, abstractC0624h2.l(view)) * f14)));
        n(2);
        return true;
    }

    public final boolean i(int i3) {
        if ((this.f6434k & (1 << i3)) != 0) {
            return true;
        }
        Log.e(StubApp.getString2(5921), StubApp.getString2(5919) + i3 + StubApp.getString2(5920));
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f6435l == null) {
            this.f6435l = VelocityTracker.obtain();
        }
        this.f6435l.addMovement(motionEvent);
        int i10 = 0;
        if (actionMasked == 0) {
            float x7 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g10 = g((int) x7, (int) y10);
            l(x7, y10, pointerId);
            q(g10, pointerId);
            int i11 = this.f6432h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f6425a == 1) {
                k();
            }
            a();
            return;
        }
        AbstractC0624h2 abstractC0624h2 = this.f6440q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f6425a == 1) {
                    this.f6442s = true;
                    abstractC0624h2.u(this.f6441r, 0.0f, 0.0f);
                    this.f6442s = false;
                    if (this.f6425a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x10 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                l(x10, y11, pointerId2);
                if (this.f6425a == 0) {
                    q(g((int) x10, (int) y11), pointerId2);
                    int i12 = this.f6432h[pointerId2];
                    return;
                }
                int i13 = (int) x10;
                int i14 = (int) y11;
                View view = this.f6441r;
                if (view != null && i13 >= view.getLeft() && i13 < view.getRight() && i14 >= view.getTop() && i14 < view.getBottom()) {
                    q(this.f6441r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f6425a == 1 && pointerId3 == this.f6427c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i10 >= pointerCount) {
                        i3 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i10);
                    if (pointerId4 != this.f6427c) {
                        View g11 = g((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                        View view2 = this.f6441r;
                        if (g11 == view2 && q(view2, pointerId4)) {
                            i3 = this.f6427c;
                            break;
                        }
                    }
                    i10++;
                }
                if (i3 == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f6425a == 1) {
            if (i(this.f6427c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f6427c);
                float x11 = motionEvent.getX(findPointerIndex);
                float y12 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f6430f;
                int i15 = this.f6427c;
                int i16 = (int) (x11 - fArr[i15]);
                int i17 = (int) (y12 - this.f6431g[i15]);
                int left = this.f6441r.getLeft() + i16;
                int top = this.f6441r.getTop() + i17;
                int left2 = this.f6441r.getLeft();
                int top2 = this.f6441r.getTop();
                if (i16 != 0) {
                    left = abstractC0624h2.b(this.f6441r, left);
                    WeakHashMap weakHashMap = I.f4732a;
                    this.f6441r.offsetLeftAndRight(left - left2);
                }
                if (i17 != 0) {
                    top = abstractC0624h2.c(this.f6441r, top);
                    WeakHashMap weakHashMap2 = I.f4732a;
                    this.f6441r.offsetTopAndBottom(top - top2);
                }
                if (i16 != 0 || i17 != 0) {
                    abstractC0624h2.t(this.f6441r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i10 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i10);
            if (i(pointerId5)) {
                float x12 = motionEvent.getX(i10);
                float y13 = motionEvent.getY(i10);
                float f10 = x12 - this.f6428d[pointerId5];
                float f11 = y13 - this.f6429e[pointerId5];
                Math.abs(f10);
                Math.abs(f11);
                int i18 = this.f6432h[pointerId5];
                Math.abs(f11);
                Math.abs(f10);
                int i19 = this.f6432h[pointerId5];
                Math.abs(f10);
                Math.abs(f11);
                int i20 = this.f6432h[pointerId5];
                Math.abs(f11);
                Math.abs(f10);
                int i21 = this.f6432h[pointerId5];
                if (this.f6425a != 1) {
                    View g12 = g((int) x12, (int) y13);
                    if (c(g12, f10, f11) && q(g12, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i10++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f6435l;
        float f10 = this.f6436m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f6435l.getXVelocity(this.f6427c);
        float f11 = this.f6437n;
        float abs = Math.abs(xVelocity);
        if (abs < f11) {
            xVelocity = 0.0f;
        } else if (abs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f6435l.getYVelocity(this.f6427c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f11) {
            f10 = 0.0f;
        } else if (abs2 <= f10) {
            f10 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f10 = -f10;
        }
        this.f6442s = true;
        this.f6440q.u(this.f6441r, xVelocity, f10);
        this.f6442s = false;
        if (this.f6425a == 1) {
            n(0);
        }
    }

    public final void l(float f10, float f11, int i3) {
        float[] fArr = this.f6428d;
        if (fArr == null || fArr.length <= i3) {
            int i10 = i3 + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f6429e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f6430f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f6431g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f6432h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f6433i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f6428d = fArr2;
            this.f6429e = fArr3;
            this.f6430f = fArr4;
            this.f6431g = fArr5;
            this.f6432h = iArr;
            this.f6433i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f6428d;
        this.f6430f[i3] = f10;
        fArr9[i3] = f10;
        float[] fArr10 = this.f6429e;
        this.f6431g[i3] = f11;
        fArr10[i3] = f11;
        int[] iArr7 = this.f6432h;
        int i11 = (int) f10;
        int i12 = (int) f11;
        CoordinatorLayout coordinatorLayout = this.f6443t;
        int left = coordinatorLayout.getLeft();
        int i13 = this.f6438o;
        int i14 = i11 < left + i13 ? 1 : 0;
        if (i12 < coordinatorLayout.getTop() + i13) {
            i14 |= 4;
        }
        if (i11 > coordinatorLayout.getRight() - i13) {
            i14 |= 2;
        }
        if (i12 > coordinatorLayout.getBottom() - i13) {
            i14 |= 8;
        }
        iArr7[i3] = i14;
        this.f6434k |= 1 << i3;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i3 = 0; i3 < pointerCount; i3++) {
            int pointerId = motionEvent.getPointerId(i3);
            if (i(pointerId)) {
                float x7 = motionEvent.getX(i3);
                float y10 = motionEvent.getY(i3);
                this.f6430f[pointerId] = x7;
                this.f6431g[pointerId] = y10;
            }
        }
    }

    public final void n(int i3) {
        this.f6443t.removeCallbacks(this.f6444u);
        if (this.f6425a != i3) {
            this.f6425a = i3;
            this.f6440q.s(i3);
            if (this.f6425a == 0) {
                this.f6441r = null;
            }
        }
    }

    public final boolean o(int i3, int i10) {
        if (this.f6442s) {
            return h(i3, i10, (int) this.f6435l.getXVelocity(this.f6427c), (int) this.f6435l.getYVelocity(this.f6427c));
        }
        throw new IllegalStateException(StubApp.getString2(5922));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S.e.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i3) {
        if (view == this.f6441r && this.f6427c == i3) {
            return true;
        }
        if (view == null || !this.f6440q.A(view, i3)) {
            return false;
        }
        this.f6427c = i3;
        b(view, i3);
        return true;
    }
}
