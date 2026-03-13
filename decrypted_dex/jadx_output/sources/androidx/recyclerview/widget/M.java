package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public C0450c f10038a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f10039b;

    /* renamed from: c, reason: collision with root package name */
    public final V6.b f10040c;

    /* renamed from: d, reason: collision with root package name */
    public final V6.b f10041d;

    /* renamed from: e, reason: collision with root package name */
    public C0470x f10042e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10043f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10044g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10045h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10046i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10047k;

    /* renamed from: l, reason: collision with root package name */
    public int f10048l;

    /* renamed from: m, reason: collision with root package name */
    public int f10049m;

    /* renamed from: n, reason: collision with root package name */
    public int f10050n;

    /* renamed from: o, reason: collision with root package name */
    public int f10051o;

    public M() {
        K k3 = new K(this, 0);
        K k4 = new K(this, 1);
        this.f10040c = new V6.b(k3);
        this.f10041d = new V6.b(k4);
        this.f10043f = false;
        this.f10044g = false;
        this.f10045h = true;
        this.f10046i = true;
    }

    public static int C(View view) {
        return ((N) view.getLayoutParams()).f10052a.b();
    }

    public static L D(Context context, AttributeSet attributeSet, int i3, int i10) {
        L l9 = new L();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I1.a.f3102a, i3, i10);
        l9.f10019a = obtainStyledAttributes.getInt(0, 1);
        l9.f10020b = obtainStyledAttributes.getInt(10, 1);
        l9.f10021c = obtainStyledAttributes.getBoolean(9, false);
        l9.f10022d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return l9;
    }

    public static boolean H(int i3, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i3 != i11) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i3;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i3;
        }
        return true;
    }

    public static void I(View view, int i3, int i10, int i11, int i12) {
        N n10 = (N) view.getLayoutParams();
        Rect rect = n10.f10053b;
        view.layout(i3 + rect.left + ((ViewGroup.MarginLayoutParams) n10).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) n10).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) n10).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) n10).bottomMargin);
    }

    public static int g(int i3, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i10, i11) : size : Math.min(size, Math.max(i10, i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r5 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(int r4, int r5, int r6, boolean r7, int r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r5 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r5 == r2) goto L22
            if (r5 == 0) goto L1a
            if (r5 == r3) goto L22
        L1a:
            r5 = r6
            r8 = r5
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r4
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r5 == r2) goto L2e
            if (r5 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r4
            r5 = r6
            goto L30
        L2e:
            r8 = r4
            r5 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.M.w(int, int, int, boolean, int):int");
    }

    public final int A() {
        RecyclerView recyclerView = this.f10039b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int B() {
        RecyclerView recyclerView = this.f10039b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int E(V v2, b0 b0Var) {
        RecyclerView recyclerView = this.f10039b;
        if (recyclerView == null || recyclerView.mAdapter == null || !e()) {
            return 1;
        }
        return this.f10039b.mAdapter.a();
    }

    public final void F(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((N) view.getLayoutParams()).f10053b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f10039b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f10039b.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean G();

    public void J(int i3) {
        RecyclerView recyclerView = this.f10039b;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i3);
        }
    }

    public void K(int i3) {
        RecyclerView recyclerView = this.f10039b;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i3);
        }
    }

    public abstract void L(RecyclerView recyclerView);

    public abstract View M(View view, int i3, V v2, b0 b0Var);

    public void N(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f10039b;
        V v2 = recyclerView.mRecycler;
        b0 b0Var = recyclerView.mState;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f10039b.canScrollVertically(-1) && !this.f10039b.canScrollHorizontally(-1) && !this.f10039b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        C c10 = this.f10039b.mAdapter;
        if (c10 != null) {
            accessibilityEvent.setItemCount(c10.a());
        }
    }

    public final void O(View view, O.e eVar) {
        e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null || childViewHolderInt.h() || this.f10038a.f10123c.contains(childViewHolderInt.f10140a)) {
            return;
        }
        RecyclerView recyclerView = this.f10039b;
        P(recyclerView.mRecycler, recyclerView.mState, view, eVar);
    }

    public void P(V v2, b0 b0Var, View view, O.e eVar) {
        eVar.f5069a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(e() ? C(view) : 0, 1, d() ? C(view) : 0, 1, false, false));
    }

    public void Q(int i3, int i10) {
    }

    public void R() {
    }

    public void S(int i3, int i10) {
    }

    public void T(int i3, int i10) {
    }

    public void U(int i3, int i10) {
    }

    public abstract void V(V v2, b0 b0Var);

    public abstract void W(b0 b0Var);

    public abstract void X(Parcelable parcelable);

    public abstract Parcelable Y();

    public void Z(int i3) {
    }

    public final void a0(V v2) {
        for (int v8 = v() - 1; v8 >= 0; v8--) {
            if (!RecyclerView.getChildViewHolderInt(u(v8)).o()) {
                View u2 = u(v8);
                d0(v8);
                v2.g(u2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r9, android.view.View r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.M.b(int, android.view.View, boolean):void");
    }

    public final void b0(V v2) {
        ArrayList arrayList;
        int size = v2.f10084a.size();
        int i3 = size - 1;
        while (true) {
            arrayList = v2.f10084a;
            if (i3 < 0) {
                break;
            }
            View view = ((e0) arrayList.get(i3)).f10140a;
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.o()) {
                childViewHolderInt.n(false);
                if (childViewHolderInt.j()) {
                    this.f10039b.removeDetachedView(view, false);
                }
                I i10 = this.f10039b.mItemAnimator;
                if (i10 != null) {
                    i10.d(childViewHolderInt);
                }
                childViewHolderInt.n(true);
                e0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt2.f10152n = null;
                childViewHolderInt2.f10153o = false;
                childViewHolderInt2.j &= -33;
                v2.h(childViewHolderInt2);
            }
            i3--;
        }
        arrayList.clear();
        ArrayList arrayList2 = v2.f10085b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f10039b.invalidate();
        }
    }

    public abstract void c(String str);

    public final void c0(View view, V v2) {
        C0450c c0450c = this.f10038a;
        B b2 = c0450c.f10121a;
        int indexOfChild = b2.f9998a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (c0450c.f10122b.L(indexOfChild)) {
                c0450c.j(view);
            }
            b2.b(indexOfChild);
        }
        v2.g(view);
    }

    public abstract boolean d();

    public final void d0(int i3) {
        if (u(i3) != null) {
            C0450c c0450c = this.f10038a;
            int f10 = c0450c.f(i3);
            B b2 = c0450c.f10121a;
            View childAt = b2.f9998a.getChildAt(f10);
            if (childAt == null) {
                return;
            }
            if (c0450c.f10122b.L(f10)) {
                c0450c.j(childAt);
            }
            b2.b(f10);
        }
    }

    public abstract boolean e();

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.z()
            int r1 = r8.B()
            int r2 = r8.f10050n
            int r3 = r8.A()
            int r2 = r2 - r3
            int r3 = r8.f10051o
            int r4 = r8.y()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.f10039b
            java.util.WeakHashMap r7 = N.I.f4732a
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L60
            if (r2 == 0) goto L5b
            goto L68
        L5b:
            int r2 = java.lang.Math.max(r6, r10)
            goto L68
        L60:
            if (r6 == 0) goto L63
            goto L67
        L63:
            int r6 = java.lang.Math.min(r4, r2)
        L67:
            r2 = r6
        L68:
            if (r1 == 0) goto L6b
            goto L6f
        L6b:
            int r1 = java.lang.Math.min(r5, r11)
        L6f:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb2
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L80
            goto Lb7
        L80:
            int r1 = r8.z()
            int r2 = r8.B()
            int r3 = r8.f10050n
            int r4 = r8.A()
            int r3 = r3 - r4
            int r4 = r8.f10051o
            int r5 = r8.y()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f10039b
            android.graphics.Rect r5 = r5.mTempRect
            androidx.recyclerview.widget.RecyclerView.getDecoratedBoundsWithMarginsInt(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb7
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb7
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb7
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lb2
            goto Lb7
        Lb2:
            if (r11 != 0) goto Lb8
            if (r10 == 0) goto Lb7
            goto Lb8
        Lb7:
            return r0
        Lb8:
            if (r12 == 0) goto Lbe
            r9.scrollBy(r11, r10)
            return r7
        Lbe:
            r9.smoothScrollBy(r11, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.M.e0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public boolean f(N n10) {
        return n10 != null;
    }

    public final void f0() {
        RecyclerView recyclerView = this.f10039b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int g0(int i3, V v2, b0 b0Var);

    public abstract void h(int i3, int i10, b0 b0Var, C0462o c0462o);

    public abstract void h0(int i3);

    public void i(int i3, C0462o c0462o) {
    }

    public abstract int i0(int i3, V v2, b0 b0Var);

    public abstract int j(b0 b0Var);

    public final void j0(RecyclerView recyclerView) {
        k0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract int k(b0 b0Var);

    public final void k0(int i3, int i10) {
        this.f10050n = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i3);
        this.f10048l = mode;
        if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.f10050n = 0;
        }
        this.f10051o = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.f10049m = mode2;
        if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            return;
        }
        this.f10051o = 0;
    }

    public abstract int l(b0 b0Var);

    public void l0(Rect rect, int i3, int i10) {
        int A4 = A() + z() + rect.width();
        int y10 = y() + B() + rect.height();
        RecyclerView recyclerView = this.f10039b;
        WeakHashMap weakHashMap = N.I.f4732a;
        this.f10039b.setMeasuredDimension(g(i3, A4, recyclerView.getMinimumWidth()), g(i10, y10, this.f10039b.getMinimumHeight()));
    }

    public abstract int m(b0 b0Var);

    public final void m0(int i3, int i10) {
        int v2 = v();
        if (v2 == 0) {
            this.f10039b.defaultOnMeasure(i3, i10);
            return;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < v2; i15++) {
            View u2 = u(i15);
            Rect rect = this.f10039b.mTempRect;
            RecyclerView.getDecoratedBoundsWithMarginsInt(u2, rect);
            int i16 = rect.left;
            if (i16 < i14) {
                i14 = i16;
            }
            int i17 = rect.right;
            if (i17 > i11) {
                i11 = i17;
            }
            int i18 = rect.top;
            if (i18 < i12) {
                i12 = i18;
            }
            int i19 = rect.bottom;
            if (i19 > i13) {
                i13 = i19;
            }
        }
        this.f10039b.mTempRect.set(i14, i12, i11, i13);
        l0(this.f10039b.mTempRect, i3, i10);
    }

    public abstract int n(b0 b0Var);

    public final void n0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f10039b = null;
            this.f10038a = null;
            this.f10050n = 0;
            this.f10051o = 0;
        } else {
            this.f10039b = recyclerView;
            this.f10038a = recyclerView.mChildHelper;
            this.f10050n = recyclerView.getWidth();
            this.f10051o = recyclerView.getHeight();
        }
        this.f10048l = 1073741824;
        this.f10049m = 1073741824;
    }

    public abstract int o(b0 b0Var);

    public final boolean o0(View view, int i3, int i10, N n10) {
        return (!view.isLayoutRequested() && this.f10045h && H(view.getWidth(), i3, ((ViewGroup.MarginLayoutParams) n10).width) && H(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) n10).height)) ? false : true;
    }

    public final void p(V v2) {
        for (int v8 = v() - 1; v8 >= 0; v8--) {
            View u2 = u(v8);
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(u2);
            if (!childViewHolderInt.o()) {
                if (!childViewHolderInt.f() || childViewHolderInt.h() || this.f10039b.mAdapter.f10000b) {
                    u(v8);
                    this.f10038a.c(v8);
                    v2.i(u2);
                    this.f10039b.mViewInfoStore.c(childViewHolderInt);
                } else {
                    d0(v8);
                    v2.h(childViewHolderInt);
                }
            }
        }
    }

    public boolean p0() {
        return false;
    }

    public View q(int i3) {
        int v2 = v();
        for (int i10 = 0; i10 < v2; i10++) {
            View u2 = u(i10);
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(u2);
            if (childViewHolderInt != null && childViewHolderInt.b() == i3 && !childViewHolderInt.o() && (this.f10039b.mState.f10114g || !childViewHolderInt.h())) {
                return u2;
            }
        }
        return null;
    }

    public final boolean q0(View view, int i3, int i10, N n10) {
        return (this.f10045h && H(view.getMeasuredWidth(), i3, ((ViewGroup.MarginLayoutParams) n10).width) && H(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) n10).height)) ? false : true;
    }

    public abstract N r();

    public abstract void r0(RecyclerView recyclerView, int i3);

    public N s(Context context, AttributeSet attributeSet) {
        return new N(context, attributeSet);
    }

    public final void s0(C0470x c0470x) {
        C0470x c0470x2 = this.f10042e;
        if (c0470x2 != null && c0470x != c0470x2 && c0470x2.f10324e) {
            c0470x2.g();
        }
        this.f10042e = c0470x;
        RecyclerView recyclerView = this.f10039b;
        d0 d0Var = recyclerView.mViewFlinger;
        d0Var.f10133g.removeCallbacks(d0Var);
        d0Var.f10129c.abortAnimation();
        if (c0470x.f10327h) {
            Log.w("RecyclerView", "An instance of " + c0470x.getClass().getSimpleName() + " was started more than once. Each instance of" + c0470x.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0470x.f10321b = recyclerView;
        c0470x.f10322c = this;
        int i3 = c0470x.f10320a;
        if (i3 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.mState.f10108a = i3;
        c0470x.f10324e = true;
        c0470x.f10323d = true;
        c0470x.f10325f = recyclerView.mLayout.q(i3);
        c0470x.f10321b.mViewFlinger.a();
        c0470x.f10327h = true;
    }

    public N t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof N ? new N((N) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new N((ViewGroup.MarginLayoutParams) layoutParams) : new N(layoutParams);
    }

    public abstract boolean t0();

    public final View u(int i3) {
        C0450c c0450c = this.f10038a;
        if (c0450c != null) {
            return c0450c.d(i3);
        }
        return null;
    }

    public final int v() {
        C0450c c0450c = this.f10038a;
        if (c0450c != null) {
            return c0450c.e();
        }
        return 0;
    }

    public int x(V v2, b0 b0Var) {
        RecyclerView recyclerView = this.f10039b;
        if (recyclerView == null || recyclerView.mAdapter == null || !d()) {
            return 1;
        }
        return this.f10039b.mAdapter.a();
    }

    public final int y() {
        RecyclerView recyclerView = this.f10039b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int z() {
        RecyclerView recyclerView = this.f10039b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }
}
