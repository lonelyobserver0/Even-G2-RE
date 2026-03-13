package com.google.android.material.bottomsheet;

import A.b;
import E0.x;
import I4.f;
import I4.g;
import I4.k;
import K4.n;
import N.B;
import N.C0155a;
import N.C0156b;
import N.I;
import O.d;
import S.e;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import i2.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r4.AbstractC1567a;
import w4.C1862a;
import w4.C1863b;
import w4.RunnableC1864c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BottomSheetBehavior<V extends View> extends b {

    /* renamed from: A, reason: collision with root package name */
    public int f11821A;

    /* renamed from: B, reason: collision with root package name */
    public WeakReference f11822B;

    /* renamed from: C, reason: collision with root package name */
    public WeakReference f11823C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f11824D;

    /* renamed from: E, reason: collision with root package name */
    public VelocityTracker f11825E;

    /* renamed from: F, reason: collision with root package name */
    public int f11826F;

    /* renamed from: G, reason: collision with root package name */
    public int f11827G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f11828H;

    /* renamed from: I, reason: collision with root package name */
    public HashMap f11829I;

    /* renamed from: J, reason: collision with root package name */
    public final C1862a f11830J;

    /* renamed from: a, reason: collision with root package name */
    public final int f11831a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11832b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11833c;

    /* renamed from: d, reason: collision with root package name */
    public int f11834d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11835e;

    /* renamed from: f, reason: collision with root package name */
    public int f11836f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11837g;

    /* renamed from: h, reason: collision with root package name */
    public g f11838h;

    /* renamed from: i, reason: collision with root package name */
    public k f11839i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public RunnableC1864c f11840k;

    /* renamed from: l, reason: collision with root package name */
    public final ValueAnimator f11841l;

    /* renamed from: m, reason: collision with root package name */
    public final int f11842m;

    /* renamed from: n, reason: collision with root package name */
    public int f11843n;

    /* renamed from: o, reason: collision with root package name */
    public int f11844o;

    /* renamed from: p, reason: collision with root package name */
    public final float f11845p;

    /* renamed from: q, reason: collision with root package name */
    public int f11846q;

    /* renamed from: r, reason: collision with root package name */
    public final float f11847r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11848s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11849t;

    /* renamed from: u, reason: collision with root package name */
    public int f11850u;

    /* renamed from: v, reason: collision with root package name */
    public e f11851v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f11852w;

    /* renamed from: x, reason: collision with root package name */
    public int f11853x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11854y;

    /* renamed from: z, reason: collision with root package name */
    public int f11855z;

    public BottomSheetBehavior() {
        this.f11831a = 0;
        this.f11832b = true;
        this.f11840k = null;
        this.f11845p = 0.5f;
        this.f11847r = -1.0f;
        this.f11850u = 4;
        this.f11824D = new ArrayList();
        this.f11830J = new C1862a(this);
    }

    public static View x(View view) {
        WeakHashMap weakHashMap = I.f4732a;
        if (B.h(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View x7 = x(viewGroup.getChildAt(i3));
            if (x7 != null) {
                return x7;
            }
        }
        return null;
    }

    public final void A(int i3) {
        if (i3 == this.f11850u) {
            return;
        }
        WeakReference weakReference = this.f11822B;
        if (weakReference == null) {
            if (i3 == 4 || i3 == 3 || i3 == 6 || (this.f11848s && i3 == 5)) {
                this.f11850u = i3;
                return;
            }
            return;
        }
        View view = (View) weakReference.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = I.f4732a;
            if (view.isAttachedToWindow()) {
                view.post(new l2.g(this, view, i3));
                return;
            }
        }
        C(view, i3);
    }

    public final void B(int i3) {
        if (this.f11850u == i3) {
            return;
        }
        this.f11850u = i3;
        WeakReference weakReference = this.f11822B;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i3 == 6 || i3 == 3) {
            H(true);
        } else if (i3 == 5 || i3 == 4) {
            H(false);
        }
        G(i3);
        ArrayList arrayList = this.f11824D;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void C(View view, int i3) {
        int i10;
        int i11;
        if (i3 == 4) {
            i10 = this.f11846q;
        } else if (i3 == 6) {
            i10 = this.f11844o;
            if (this.f11832b && i10 <= (i11 = this.f11843n)) {
                i3 = 3;
                i10 = i11;
            }
        } else if (i3 == 3) {
            i10 = y();
        } else {
            if (!this.f11848s || i3 != 5) {
                throw new IllegalArgumentException(u.p(i3, StubApp.getString2(12456)));
            }
            i10 = this.f11821A;
        }
        E(view, i3, i10, false);
    }

    public final boolean D(View view, float f10) {
        if (this.f11849t) {
            return true;
        }
        if (view.getTop() < this.f11846q) {
            return false;
        }
        return Math.abs(((f10 * 0.1f) + ((float) view.getTop())) - ((float) this.f11846q)) / ((float) this.f11834d) > 0.5f;
    }

    public final void E(View view, int i3, int i10, boolean z2) {
        boolean h2;
        if (z2) {
            h2 = this.f11851v.o(view.getLeft(), i10);
        } else {
            e eVar = this.f11851v;
            int left = view.getLeft();
            eVar.f6441r = view;
            eVar.f6427c = -1;
            h2 = eVar.h(left, i10, 0, 0);
            if (!h2 && eVar.f6425a == 0 && eVar.f6441r != null) {
                eVar.f6441r = null;
            }
        }
        if (!h2) {
            B(i3);
            return;
        }
        B(2);
        G(i3);
        if (this.f11840k == null) {
            this.f11840k = new RunnableC1864c(this, view, i3);
        }
        RunnableC1864c runnableC1864c = this.f11840k;
        if (runnableC1864c.f22114b) {
            runnableC1864c.f22115c = i3;
            return;
        }
        runnableC1864c.f22115c = i3;
        WeakHashMap weakHashMap = I.f4732a;
        view.postOnAnimation(runnableC1864c);
        this.f11840k.f22114b = true;
    }

    public final void F() {
        View view;
        WeakReference weakReference = this.f11822B;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        I.g(view, PKIFailureInfo.signerNotTrusted);
        I.e(view, 0);
        I.g(view, PKIFailureInfo.transactionIdInUse);
        I.e(view, 0);
        I.g(view, PKIFailureInfo.badCertTemplate);
        I.e(view, 0);
        if (this.f11848s && this.f11850u != 5) {
            t(view, d.j, 5);
        }
        int i3 = this.f11850u;
        if (i3 == 3) {
            t(view, d.f5062i, this.f11832b ? 4 : 6);
            return;
        }
        if (i3 == 4) {
            t(view, d.f5061h, this.f11832b ? 3 : 6);
        } else {
            if (i3 != 6) {
                return;
            }
            t(view, d.f5062i, 4);
            t(view, d.f5061h, 3);
        }
    }

    public final void G(int i3) {
        ValueAnimator valueAnimator = this.f11841l;
        if (i3 == 2) {
            return;
        }
        boolean z2 = i3 == 3;
        if (this.j != z2) {
            this.j = z2;
            if (this.f11838h == null || valueAnimator == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            }
            float f10 = z2 ? 0.0f : 1.0f;
            valueAnimator.setFloatValues(1.0f - f10, f10);
            valueAnimator.start();
        }
    }

    public final void H(boolean z2) {
        WeakReference weakReference = this.f11822B;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f11829I != null) {
                    return;
                } else {
                    this.f11829I = new HashMap(childCount);
                }
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = coordinatorLayout.getChildAt(i3);
                if (childAt != this.f11822B.get()) {
                    if (z2) {
                        this.f11829I.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap weakHashMap = I.f4732a;
                        childAt.setImportantForAccessibility(4);
                    } else {
                        HashMap hashMap = this.f11829I;
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            int intValue = ((Integer) this.f11829I.get(childAt)).intValue();
                            WeakHashMap weakHashMap2 = I.f4732a;
                            childAt.setImportantForAccessibility(intValue);
                        }
                    }
                }
            }
            if (z2) {
                return;
            }
            this.f11829I = null;
        }
    }

    @Override // A.b
    public final void c(A.e eVar) {
        this.f11822B = null;
        this.f11851v = null;
    }

    @Override // A.b
    public final void e() {
        this.f11822B = null;
        this.f11851v = null;
    }

    @Override // A.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        if (!view.isShown()) {
            this.f11852w = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f11826F = -1;
            VelocityTracker velocityTracker = this.f11825E;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f11825E = null;
            }
        }
        if (this.f11825E == null) {
            this.f11825E = VelocityTracker.obtain();
        }
        this.f11825E.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x7 = (int) motionEvent.getX();
            this.f11827G = (int) motionEvent.getY();
            if (this.f11850u != 2) {
                WeakReference weakReference = this.f11823C;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x7, this.f11827G)) {
                    this.f11826F = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f11828H = true;
                }
            }
            this.f11852w = this.f11826F == -1 && !coordinatorLayout.o(view, x7, this.f11827G);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f11828H = false;
            this.f11826F = -1;
            if (this.f11852w) {
                this.f11852w = false;
                return false;
            }
        }
        if (this.f11852w || (eVar = this.f11851v) == null || !eVar.p(motionEvent)) {
            WeakReference weakReference2 = this.f11823C;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f11852w || this.f11850u == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f11851v == null || Math.abs(this.f11827G - motionEvent.getY()) <= this.f11851v.f6426b) {
                return false;
            }
        }
        return true;
    }

    @Override // A.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        g gVar;
        WeakHashMap weakHashMap = I.f4732a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f11822B == null) {
            this.f11836f = coordinatorLayout.getResources().getDimensionPixelSize(2131099761);
            this.f11822B = new WeakReference(view);
            if (this.f11837g && (gVar = this.f11838h) != null) {
                view.setBackground(gVar);
            }
            g gVar2 = this.f11838h;
            if (gVar2 != null) {
                float f10 = this.f11847r;
                if (f10 == -1.0f) {
                    f10 = B.e(view);
                }
                gVar2.g(f10);
                boolean z2 = this.f11850u == 3;
                this.j = z2;
                g gVar3 = this.f11838h;
                float f11 = z2 ? 0.0f : 1.0f;
                f fVar = gVar3.f3151a;
                if (fVar.f3143i != f11) {
                    fVar.f3143i = f11;
                    gVar3.f3154d = true;
                    gVar3.invalidateSelf();
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f11851v == null) {
            this.f11851v = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f11830J);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i3);
        this.f11855z = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.f11821A = height;
        this.f11843n = Math.max(0, height - view.getHeight());
        this.f11844o = (int) ((1.0f - this.f11845p) * this.f11821A);
        u();
        int i10 = this.f11850u;
        if (i10 == 3) {
            view.offsetTopAndBottom(y());
        } else if (i10 == 6) {
            view.offsetTopAndBottom(this.f11844o);
        } else if (this.f11848s && i10 == 5) {
            view.offsetTopAndBottom(this.f11821A);
        } else if (i10 == 4) {
            view.offsetTopAndBottom(this.f11846q);
        } else if (i10 == 1 || i10 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        this.f11823C = new WeakReference(x(view));
        return true;
    }

    @Override // A.b
    public final boolean i(View view) {
        WeakReference weakReference = this.f11823C;
        return (weakReference == null || view != weakReference.get() || this.f11850u == 3) ? false : true;
    }

    @Override // A.b
    public final void j(View view, View view2, int i3, int[] iArr, int i10) {
        if (i10 == 1) {
            return;
        }
        WeakReference weakReference = this.f11823C;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i11 = top - i3;
        if (i3 > 0) {
            if (i11 < y()) {
                int y10 = top - y();
                iArr[1] = y10;
                WeakHashMap weakHashMap = I.f4732a;
                view.offsetTopAndBottom(-y10);
                B(3);
            } else {
                iArr[1] = i3;
                WeakHashMap weakHashMap2 = I.f4732a;
                view.offsetTopAndBottom(-i3);
                B(1);
            }
        } else if (i3 < 0 && !view2.canScrollVertically(-1)) {
            int i12 = this.f11846q;
            if (i11 <= i12 || this.f11848s) {
                iArr[1] = i3;
                WeakHashMap weakHashMap3 = I.f4732a;
                view.offsetTopAndBottom(-i3);
                B(1);
            } else {
                int i13 = top - i12;
                iArr[1] = i13;
                WeakHashMap weakHashMap4 = I.f4732a;
                view.offsetTopAndBottom(-i13);
                B(4);
            }
        }
        view.getTop();
        w();
        this.f11853x = i3;
        this.f11854y = true;
    }

    @Override // A.b
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
    }

    @Override // A.b
    public final void n(View view, Parcelable parcelable) {
        C1863b c1863b = (C1863b) parcelable;
        int i3 = this.f11831a;
        if (i3 != 0) {
            if (i3 == -1 || (i3 & 1) == 1) {
                this.f11834d = c1863b.f22109d;
            }
            if (i3 == -1 || (i3 & 2) == 2) {
                this.f11832b = c1863b.f22110e;
            }
            if (i3 == -1 || (i3 & 4) == 4) {
                this.f11848s = c1863b.f22111f;
            }
            if (i3 == -1 || (i3 & 8) == 8) {
                this.f11849t = c1863b.f22112g;
            }
        }
        int i10 = c1863b.f22108c;
        if (i10 == 1 || i10 == 2) {
            this.f11850u = 4;
        } else {
            this.f11850u = i10;
        }
    }

    @Override // A.b
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C1863b(this);
    }

    @Override // A.b
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3, int i10) {
        this.f11853x = 0;
        this.f11854y = false;
        return (i3 & 2) != 0;
    }

    @Override // A.b
    public final void r(View view, View view2, int i3) {
        int i10;
        float yVelocity;
        int i11 = 3;
        if (view.getTop() == y()) {
            B(3);
            return;
        }
        WeakReference weakReference = this.f11823C;
        if (weakReference != null && view2 == weakReference.get() && this.f11854y) {
            if (this.f11853x > 0) {
                i10 = y();
            } else {
                if (this.f11848s) {
                    VelocityTracker velocityTracker = this.f11825E;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.f11833c);
                        yVelocity = this.f11825E.getYVelocity(this.f11826F);
                    }
                    if (D(view, yVelocity)) {
                        i10 = this.f11821A;
                        i11 = 5;
                    }
                }
                if (this.f11853x == 0) {
                    int top = view.getTop();
                    if (!this.f11832b) {
                        int i12 = this.f11844o;
                        if (top < i12) {
                            if (top < Math.abs(top - this.f11846q)) {
                                i10 = this.f11842m;
                            } else {
                                i10 = this.f11844o;
                            }
                        } else if (Math.abs(top - i12) < Math.abs(top - this.f11846q)) {
                            i10 = this.f11844o;
                        } else {
                            i10 = this.f11846q;
                            i11 = 4;
                        }
                        i11 = 6;
                    } else if (Math.abs(top - this.f11843n) < Math.abs(top - this.f11846q)) {
                        i10 = this.f11843n;
                    } else {
                        i10 = this.f11846q;
                        i11 = 4;
                    }
                } else {
                    if (this.f11832b) {
                        i10 = this.f11846q;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - this.f11844o) < Math.abs(top2 - this.f11846q)) {
                            i10 = this.f11844o;
                            i11 = 6;
                        } else {
                            i10 = this.f11846q;
                        }
                    }
                    i11 = 4;
                }
            }
            E(view, i11, i10, false);
            this.f11854y = false;
        }
    }

    @Override // A.b
    public final boolean s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f11850u == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.f11851v;
        if (eVar != null) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f11826F = -1;
            VelocityTracker velocityTracker = this.f11825E;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f11825E = null;
            }
        }
        if (this.f11825E == null) {
            this.f11825E = VelocityTracker.obtain();
        }
        this.f11825E.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f11852w) {
            float abs = Math.abs(this.f11827G - motionEvent.getY());
            e eVar2 = this.f11851v;
            if (abs > eVar2.f6426b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f11852w;
    }

    public final void t(View view, d dVar, int i3) {
        x xVar = new x(this, i3);
        WeakHashMap weakHashMap = I.f4732a;
        d dVar2 = new d(null, dVar.f5066b, xVar, dVar.f5067c);
        View.AccessibilityDelegate c10 = I.c(view);
        C0156b c0156b = c10 != null ? c10 instanceof C0155a ? ((C0155a) c10).f4766a : new C0156b(c10) : null;
        if (c0156b == null) {
            c0156b = new C0156b();
        }
        I.i(view, c0156b);
        I.g(view, ((AccessibilityNodeInfo.AccessibilityAction) dVar2.f5065a).getId());
        ArrayList arrayList = (ArrayList) view.getTag(2131231099);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(2131231099, arrayList);
        }
        arrayList.add(dVar2);
        I.e(view, 0);
    }

    public final void u() {
        int max = this.f11835e ? Math.max(this.f11836f, this.f11821A - ((this.f11855z * 9) / 16)) : this.f11834d;
        if (this.f11832b) {
            this.f11846q = Math.max(this.f11821A - max, this.f11843n);
        } else {
            this.f11846q = this.f11821A - max;
        }
    }

    public final void v(Context context, AttributeSet attributeSet, boolean z2, ColorStateList colorStateList) {
        if (this.f11837g) {
            this.f11839i = k.b(context, attributeSet, 2130903141, 2131821203).a();
            g gVar = new g(this.f11839i);
            this.f11838h = gVar;
            gVar.f(context);
            if (z2 && colorStateList != null) {
                this.f11838h.h(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.f11838h.setTint(typedValue.data);
        }
    }

    public final void w() {
        if (((View) this.f11822B.get()) != null) {
            ArrayList arrayList = this.f11824D;
            if (arrayList.isEmpty() || arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final int y() {
        return this.f11832b ? this.f11843n : this.f11842m;
    }

    public final void z(int i3) {
        View view;
        if (i3 == -1) {
            if (this.f11835e) {
                return;
            } else {
                this.f11835e = true;
            }
        } else {
            if (!this.f11835e && this.f11834d == i3) {
                return;
            }
            this.f11835e = false;
            this.f11834d = Math.max(0, i3);
        }
        if (this.f11822B != null) {
            u();
            if (this.f11850u != 4 || (view = (View) this.f11822B.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i3;
        int i10 = 2;
        this.f11831a = 0;
        this.f11832b = true;
        this.f11840k = null;
        this.f11845p = 0.5f;
        this.f11847r = -1.0f;
        this.f11850u = 4;
        this.f11824D = new ArrayList();
        this.f11830J = new C1862a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1567a.f20322a);
        this.f11837g = obtainStyledAttributes.hasValue(9);
        boolean hasValue = obtainStyledAttributes.hasValue(1);
        if (hasValue) {
            v(context, attributeSet, hasValue, L1.o(context, obtainStyledAttributes, 1));
        } else {
            v(context, attributeSet, hasValue, null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11841l = ofFloat;
        ofFloat.setDuration(500L);
        this.f11841l.addUpdateListener(new n(this, i10));
        this.f11847r = obtainStyledAttributes.getDimension(0, -1.0f);
        TypedValue peekValue = obtainStyledAttributes.peekValue(6);
        if (peekValue != null && (i3 = peekValue.data) == -1) {
            z(i3);
        } else {
            z(obtainStyledAttributes.getDimensionPixelSize(6, -1));
        }
        boolean z2 = obtainStyledAttributes.getBoolean(5, false);
        if (this.f11848s != z2) {
            this.f11848s = z2;
            if (!z2 && this.f11850u == 5) {
                A(4);
            }
            F();
        }
        boolean z10 = obtainStyledAttributes.getBoolean(3, true);
        if (this.f11832b != z10) {
            this.f11832b = z10;
            if (this.f11822B != null) {
                u();
            }
            B((this.f11832b && this.f11850u == 6) ? 3 : this.f11850u);
            F();
        }
        this.f11849t = obtainStyledAttributes.getBoolean(8, false);
        this.f11831a = obtainStyledAttributes.getInt(7, 0);
        float f10 = obtainStyledAttributes.getFloat(4, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f11845p = f10;
            int i11 = obtainStyledAttributes.getInt(2, 0);
            if (i11 >= 0) {
                this.f11842m = i11;
                obtainStyledAttributes.recycle();
                this.f11833c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                return;
            }
            throw new IllegalArgumentException(StubApp.getString2(12454));
        }
        throw new IllegalArgumentException(StubApp.getString2(12455));
    }
}
