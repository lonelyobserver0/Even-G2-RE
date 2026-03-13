package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import f5.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class StaggeredGridLayoutManager extends M implements a0 {

    /* renamed from: B, reason: collision with root package name */
    public final Y.m f10057B;

    /* renamed from: C, reason: collision with root package name */
    public final int f10058C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f10059D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f10060E;

    /* renamed from: F, reason: collision with root package name */
    public m0 f10061F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f10062G;

    /* renamed from: H, reason: collision with root package name */
    public final j0 f10063H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f10064I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f10065J;

    /* renamed from: K, reason: collision with root package name */
    public final RunnableC0458k f10066K;

    /* renamed from: p, reason: collision with root package name */
    public final int f10067p;

    /* renamed from: q, reason: collision with root package name */
    public final n0[] f10068q;

    /* renamed from: r, reason: collision with root package name */
    public final Y.e f10069r;

    /* renamed from: s, reason: collision with root package name */
    public final Y.e f10070s;

    /* renamed from: t, reason: collision with root package name */
    public final int f10071t;

    /* renamed from: u, reason: collision with root package name */
    public int f10072u;

    /* renamed from: v, reason: collision with root package name */
    public final C0465s f10073v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10074w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f10076y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10075x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f10077z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f10056A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i10) {
        this.f10067p = -1;
        this.f10074w = false;
        Y.m mVar = new Y.m(4, false);
        this.f10057B = mVar;
        this.f10058C = 2;
        this.f10062G = new Rect();
        this.f10063H = new j0(this);
        this.f10064I = true;
        this.f10066K = new RunnableC0458k(this, 1);
        L D6 = M.D(context, attributeSet, i3, i10);
        int i11 = D6.f10019a;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i11 != this.f10071t) {
            this.f10071t = i11;
            Y.e eVar = this.f10069r;
            this.f10069r = this.f10070s;
            this.f10070s = eVar;
            f0();
        }
        int i12 = D6.f10020b;
        c(null);
        if (i12 != this.f10067p) {
            int[] iArr = (int[]) mVar.f8674b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            mVar.f8675c = null;
            f0();
            this.f10067p = i12;
            this.f10076y = new BitSet(this.f10067p);
            this.f10068q = new n0[this.f10067p];
            for (int i13 = 0; i13 < this.f10067p; i13++) {
                this.f10068q[i13] = new n0(this, i13);
            }
            f0();
        }
        boolean z2 = D6.f10021c;
        c(null);
        m0 m0Var = this.f10061F;
        if (m0Var != null && m0Var.f10221h != z2) {
            m0Var.f10221h = z2;
        }
        this.f10074w = z2;
        f0();
        C0465s c0465s = new C0465s();
        c0465s.f10287a = true;
        c0465s.f10292f = 0;
        c0465s.f10293g = 0;
        this.f10073v = c0465s;
        this.f10069r = Y.e.a(this, this.f10071t);
        this.f10070s = Y.e.a(this, 1 - this.f10071t);
    }

    public static int W0(int i3, int i10, int i11) {
        int mode;
        return (!(i10 == 0 && i11 == 0) && ((mode = View.MeasureSpec.getMode(i3)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - i10) - i11), mode) : i3;
    }

    public final View A0(boolean z2) {
        int k3 = this.f10069r.k();
        int g10 = this.f10069r.g();
        int v2 = v();
        View view = null;
        for (int i3 = 0; i3 < v2; i3++) {
            View u2 = u(i3);
            int e10 = this.f10069r.e(u2);
            if (this.f10069r.b(u2) > k3 && e10 < g10) {
                if (e10 >= k3 || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final void B0(V v2, b0 b0Var, boolean z2) {
        int g10;
        int F02 = F0(Integer.MIN_VALUE);
        if (F02 != Integer.MIN_VALUE && (g10 = this.f10069r.g() - F02) > 0) {
            int i3 = g10 - (-S0(-g10, v2, b0Var));
            if (!z2 || i3 <= 0) {
                return;
            }
            this.f10069r.o(i3);
        }
    }

    public final void C0(V v2, b0 b0Var, boolean z2) {
        int k3;
        int G02 = G0(IntCompanionObject.MAX_VALUE);
        if (G02 != Integer.MAX_VALUE && (k3 = G02 - this.f10069r.k()) > 0) {
            int S02 = k3 - S0(k3, v2, b0Var);
            if (!z2 || S02 <= 0) {
                return;
            }
            this.f10069r.o(-S02);
        }
    }

    public final int D0() {
        if (v() == 0) {
            return 0;
        }
        return M.C(u(0));
    }

    @Override // androidx.recyclerview.widget.M
    public final int E(V v2, b0 b0Var) {
        return this.f10071t == 0 ? this.f10067p : super.E(v2, b0Var);
    }

    public final int E0() {
        int v2 = v();
        if (v2 == 0) {
            return 0;
        }
        return M.C(u(v2 - 1));
    }

    public final int F0(int i3) {
        int f10 = this.f10068q[0].f(i3);
        for (int i10 = 1; i10 < this.f10067p; i10++) {
            int f11 = this.f10068q[i10].f(i3);
            if (f11 > f10) {
                f10 = f11;
            }
        }
        return f10;
    }

    @Override // androidx.recyclerview.widget.M
    public final boolean G() {
        return this.f10058C != 0;
    }

    public final int G0(int i3) {
        int h2 = this.f10068q[0].h(i3);
        for (int i10 = 1; i10 < this.f10067p; i10++) {
            int h4 = this.f10068q[i10].h(i3);
            if (h4 < h2) {
                h2 = h4;
            }
        }
        return h2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.H0(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View I0() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.I0():android.view.View");
    }

    @Override // androidx.recyclerview.widget.M
    public final void J(int i3) {
        super.J(i3);
        for (int i10 = 0; i10 < this.f10067p; i10++) {
            n0 n0Var = this.f10068q[i10];
            int i11 = n0Var.f10253b;
            if (i11 != Integer.MIN_VALUE) {
                n0Var.f10253b = i11 + i3;
            }
            int i12 = n0Var.f10254c;
            if (i12 != Integer.MIN_VALUE) {
                n0Var.f10254c = i12 + i3;
            }
        }
    }

    public final boolean J0() {
        RecyclerView recyclerView = this.f10039b;
        WeakHashMap weakHashMap = N.I.f4732a;
        return recyclerView.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.M
    public final void K(int i3) {
        super.K(i3);
        for (int i10 = 0; i10 < this.f10067p; i10++) {
            n0 n0Var = this.f10068q[i10];
            int i11 = n0Var.f10253b;
            if (i11 != Integer.MIN_VALUE) {
                n0Var.f10253b = i11 + i3;
            }
            int i12 = n0Var.f10254c;
            if (i12 != Integer.MIN_VALUE) {
                n0Var.f10254c = i12 + i3;
            }
        }
    }

    public final void K0(View view, int i3, int i10) {
        RecyclerView recyclerView = this.f10039b;
        Rect rect = this.f10062G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
        k0 k0Var = (k0) view.getLayoutParams();
        int W0 = W0(i3, ((ViewGroup.MarginLayoutParams) k0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) k0Var).rightMargin + rect.right);
        int W02 = W0(i10, ((ViewGroup.MarginLayoutParams) k0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) k0Var).bottomMargin + rect.bottom);
        if (o0(view, W0, W02, k0Var)) {
            view.measure(W0, W02);
        }
    }

    @Override // androidx.recyclerview.widget.M
    public final void L(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10039b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f10066K);
        }
        for (int i3 = 0; i3 < this.f10067p; i3++) {
            this.f10068q[i3].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if ((r12 < D0()) != r16.f10075x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x041c, code lost:
    
        if (u0() != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.f10075x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r12 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L0(androidx.recyclerview.widget.V r17, androidx.recyclerview.widget.b0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.L0(androidx.recyclerview.widget.V, androidx.recyclerview.widget.b0, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x004f, code lost:
    
        if (r8.f10071t == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0055, code lost:
    
        if (r8.f10071t == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0061, code lost:
    
        if (J0() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006d, code lost:
    
        if (J0() == false) goto L37;
     */
    @Override // androidx.recyclerview.widget.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View M(android.view.View r9, int r10, androidx.recyclerview.widget.V r11, androidx.recyclerview.widget.b0 r12) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.M(android.view.View, int, androidx.recyclerview.widget.V, androidx.recyclerview.widget.b0):android.view.View");
    }

    public final boolean M0(int i3) {
        if (this.f10071t == 0) {
            return (i3 == -1) != this.f10075x;
        }
        return ((i3 == -1) == this.f10075x) == J0();
    }

    @Override // androidx.recyclerview.widget.M
    public final void N(AccessibilityEvent accessibilityEvent) {
        super.N(accessibilityEvent);
        if (v() > 0) {
            View A02 = A0(false);
            View z02 = z0(false);
            if (A02 == null || z02 == null) {
                return;
            }
            int C10 = M.C(A02);
            int C11 = M.C(z02);
            if (C10 < C11) {
                accessibilityEvent.setFromIndex(C10);
                accessibilityEvent.setToIndex(C11);
            } else {
                accessibilityEvent.setFromIndex(C11);
                accessibilityEvent.setToIndex(C10);
            }
        }
    }

    public final void N0(int i3, b0 b0Var) {
        int D02;
        int i10;
        if (i3 > 0) {
            D02 = E0();
            i10 = 1;
        } else {
            D02 = D0();
            i10 = -1;
        }
        C0465s c0465s = this.f10073v;
        c0465s.f10287a = true;
        U0(D02, b0Var);
        T0(i10);
        c0465s.f10289c = D02 + c0465s.f10290d;
        c0465s.f10288b = Math.abs(i3);
    }

    public final void O0(V v2, C0465s c0465s) {
        if (!c0465s.f10287a || c0465s.f10295i) {
            return;
        }
        if (c0465s.f10288b == 0) {
            if (c0465s.f10291e == -1) {
                P0(v2, c0465s.f10293g);
                return;
            } else {
                Q0(v2, c0465s.f10292f);
                return;
            }
        }
        int i3 = 1;
        if (c0465s.f10291e == -1) {
            int i10 = c0465s.f10292f;
            int h2 = this.f10068q[0].h(i10);
            while (i3 < this.f10067p) {
                int h4 = this.f10068q[i3].h(i10);
                if (h4 > h2) {
                    h2 = h4;
                }
                i3++;
            }
            int i11 = i10 - h2;
            P0(v2, i11 < 0 ? c0465s.f10293g : c0465s.f10293g - Math.min(i11, c0465s.f10288b));
            return;
        }
        int i12 = c0465s.f10293g;
        int f10 = this.f10068q[0].f(i12);
        while (i3 < this.f10067p) {
            int f11 = this.f10068q[i3].f(i12);
            if (f11 < f10) {
                f10 = f11;
            }
            i3++;
        }
        int i13 = f10 - c0465s.f10293g;
        Q0(v2, i13 < 0 ? c0465s.f10292f : Math.min(i13, c0465s.f10288b) + c0465s.f10292f);
    }

    @Override // androidx.recyclerview.widget.M
    public final void P(V v2, b0 b0Var, View view, O.e eVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof k0)) {
            O(view, eVar);
            return;
        }
        k0 k0Var = (k0) layoutParams;
        int i3 = this.f10071t;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f5069a;
        if (i3 == 0) {
            n0 n0Var = k0Var.f10207e;
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(n0Var != null ? n0Var.f10256e : -1, 1, -1, -1, false, false));
        } else {
            n0 n0Var2 = k0Var.f10207e;
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(-1, -1, n0Var2 != null ? n0Var2.f10256e : -1, 1, false, false));
        }
    }

    public final void P0(V v2, int i3) {
        for (int v8 = v() - 1; v8 >= 0; v8--) {
            View u2 = u(v8);
            if (this.f10069r.e(u2) < i3 || this.f10069r.n(u2) < i3) {
                return;
            }
            k0 k0Var = (k0) u2.getLayoutParams();
            k0Var.getClass();
            if (k0Var.f10207e.f10252a.size() == 1) {
                return;
            }
            n0 n0Var = k0Var.f10207e;
            ArrayList arrayList = n0Var.f10252a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            k0 k0Var2 = (k0) view.getLayoutParams();
            k0Var2.f10207e = null;
            if (k0Var2.f10052a.h() || k0Var2.f10052a.k()) {
                n0Var.f10255d -= n0Var.f10257f.f10069r.c(view);
            }
            if (size == 1) {
                n0Var.f10253b = Integer.MIN_VALUE;
            }
            n0Var.f10254c = Integer.MIN_VALUE;
            c0(u2, v2);
        }
    }

    @Override // androidx.recyclerview.widget.M
    public final void Q(int i3, int i10) {
        H0(i3, i10, 1);
    }

    public final void Q0(V v2, int i3) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f10069r.b(u2) > i3 || this.f10069r.m(u2) > i3) {
                return;
            }
            k0 k0Var = (k0) u2.getLayoutParams();
            k0Var.getClass();
            if (k0Var.f10207e.f10252a.size() == 1) {
                return;
            }
            n0 n0Var = k0Var.f10207e;
            ArrayList arrayList = n0Var.f10252a;
            View view = (View) arrayList.remove(0);
            k0 k0Var2 = (k0) view.getLayoutParams();
            k0Var2.f10207e = null;
            if (arrayList.size() == 0) {
                n0Var.f10254c = Integer.MIN_VALUE;
            }
            if (k0Var2.f10052a.h() || k0Var2.f10052a.k()) {
                n0Var.f10255d -= n0Var.f10257f.f10069r.c(view);
            }
            n0Var.f10253b = Integer.MIN_VALUE;
            c0(u2, v2);
        }
    }

    @Override // androidx.recyclerview.widget.M
    public final void R() {
        Y.m mVar = this.f10057B;
        int[] iArr = (int[]) mVar.f8674b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        mVar.f8675c = null;
        f0();
    }

    public final void R0() {
        if (this.f10071t == 1 || !J0()) {
            this.f10075x = this.f10074w;
        } else {
            this.f10075x = !this.f10074w;
        }
    }

    @Override // androidx.recyclerview.widget.M
    public final void S(int i3, int i10) {
        H0(i3, i10, 8);
    }

    public final int S0(int i3, V v2, b0 b0Var) {
        if (v() == 0 || i3 == 0) {
            return 0;
        }
        N0(i3, b0Var);
        C0465s c0465s = this.f10073v;
        int y02 = y0(v2, c0465s, b0Var);
        if (c0465s.f10288b >= y02) {
            i3 = i3 < 0 ? -y02 : y02;
        }
        this.f10069r.o(-i3);
        this.f10059D = this.f10075x;
        c0465s.f10288b = 0;
        O0(v2, c0465s);
        return i3;
    }

    @Override // androidx.recyclerview.widget.M
    public final void T(int i3, int i10) {
        H0(i3, i10, 2);
    }

    public final void T0(int i3) {
        C0465s c0465s = this.f10073v;
        c0465s.f10291e = i3;
        c0465s.f10290d = this.f10075x != (i3 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.M
    public final void U(int i3, int i10) {
        H0(i3, i10, 4);
    }

    public final void U0(int i3, b0 b0Var) {
        int i10;
        int i11;
        int i12;
        C0465s c0465s = this.f10073v;
        boolean z2 = false;
        c0465s.f10288b = 0;
        c0465s.f10289c = i3;
        C0470x c0470x = this.f10042e;
        if (!(c0470x != null && c0470x.f10324e) || (i12 = b0Var.f10108a) == -1) {
            i10 = 0;
            i11 = 0;
        } else {
            if (this.f10075x == (i12 < i3)) {
                i10 = this.f10069r.l();
                i11 = 0;
            } else {
                i11 = this.f10069r.l();
                i10 = 0;
            }
        }
        RecyclerView recyclerView = this.f10039b;
        if (recyclerView == null || !recyclerView.mClipToPadding) {
            c0465s.f10293g = this.f10069r.f() + i10;
            c0465s.f10292f = -i11;
        } else {
            c0465s.f10292f = this.f10069r.k() - i11;
            c0465s.f10293g = this.f10069r.g() + i10;
        }
        c0465s.f10294h = false;
        c0465s.f10287a = true;
        if (this.f10069r.i() == 0 && this.f10069r.f() == 0) {
            z2 = true;
        }
        c0465s.f10295i = z2;
    }

    @Override // androidx.recyclerview.widget.M
    public final void V(V v2, b0 b0Var) {
        L0(v2, b0Var, true);
    }

    public final void V0(n0 n0Var, int i3, int i10) {
        int i11 = n0Var.f10255d;
        int i12 = n0Var.f10256e;
        if (i3 != -1) {
            int i13 = n0Var.f10254c;
            if (i13 == Integer.MIN_VALUE) {
                n0Var.a();
                i13 = n0Var.f10254c;
            }
            if (i13 - i11 >= i10) {
                this.f10076y.set(i12, false);
                return;
            }
            return;
        }
        int i14 = n0Var.f10253b;
        if (i14 == Integer.MIN_VALUE) {
            View view = (View) n0Var.f10252a.get(0);
            k0 k0Var = (k0) view.getLayoutParams();
            n0Var.f10253b = n0Var.f10257f.f10069r.e(view);
            k0Var.getClass();
            i14 = n0Var.f10253b;
        }
        if (i14 + i11 <= i10) {
            this.f10076y.set(i12, false);
        }
    }

    @Override // androidx.recyclerview.widget.M
    public final void W(b0 b0Var) {
        this.f10077z = -1;
        this.f10056A = Integer.MIN_VALUE;
        this.f10061F = null;
        this.f10063H.a();
    }

    @Override // androidx.recyclerview.widget.M
    public final void X(Parcelable parcelable) {
        if (parcelable instanceof m0) {
            this.f10061F = (m0) parcelable;
            f0();
        }
    }

    @Override // androidx.recyclerview.widget.M
    public final Parcelable Y() {
        int h2;
        int k3;
        int[] iArr;
        m0 m0Var = this.f10061F;
        if (m0Var != null) {
            m0 m0Var2 = new m0();
            m0Var2.f10216c = m0Var.f10216c;
            m0Var2.f10214a = m0Var.f10214a;
            m0Var2.f10215b = m0Var.f10215b;
            m0Var2.f10217d = m0Var.f10217d;
            m0Var2.f10218e = m0Var.f10218e;
            m0Var2.f10219f = m0Var.f10219f;
            m0Var2.f10221h = m0Var.f10221h;
            m0Var2.j = m0Var.j;
            m0Var2.f10222k = m0Var.f10222k;
            m0Var2.f10220g = m0Var.f10220g;
            return m0Var2;
        }
        m0 m0Var3 = new m0();
        m0Var3.f10221h = this.f10074w;
        m0Var3.j = this.f10059D;
        m0Var3.f10222k = this.f10060E;
        Y.m mVar = this.f10057B;
        if (mVar == null || (iArr = (int[]) mVar.f8674b) == null) {
            m0Var3.f10218e = 0;
        } else {
            m0Var3.f10219f = iArr;
            m0Var3.f10218e = iArr.length;
            m0Var3.f10220g = (ArrayList) mVar.f8675c;
        }
        if (v() <= 0) {
            m0Var3.f10214a = -1;
            m0Var3.f10215b = -1;
            m0Var3.f10216c = 0;
            return m0Var3;
        }
        m0Var3.f10214a = this.f10059D ? E0() : D0();
        View z02 = this.f10075x ? z0(true) : A0(true);
        m0Var3.f10215b = z02 != null ? M.C(z02) : -1;
        int i3 = this.f10067p;
        m0Var3.f10216c = i3;
        m0Var3.f10217d = new int[i3];
        for (int i10 = 0; i10 < this.f10067p; i10++) {
            if (this.f10059D) {
                h2 = this.f10068q[i10].f(Integer.MIN_VALUE);
                if (h2 != Integer.MIN_VALUE) {
                    k3 = this.f10069r.g();
                    h2 -= k3;
                    m0Var3.f10217d[i10] = h2;
                } else {
                    m0Var3.f10217d[i10] = h2;
                }
            } else {
                h2 = this.f10068q[i10].h(Integer.MIN_VALUE);
                if (h2 != Integer.MIN_VALUE) {
                    k3 = this.f10069r.k();
                    h2 -= k3;
                    m0Var3.f10217d[i10] = h2;
                } else {
                    m0Var3.f10217d[i10] = h2;
                }
            }
        }
        return m0Var3;
    }

    @Override // androidx.recyclerview.widget.M
    public final void Z(int i3) {
        if (i3 == 0) {
            u0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < D0()) != r3.f10075x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f10075x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // androidx.recyclerview.widget.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f10075x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.D0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f10075x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f10071t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    @Override // androidx.recyclerview.widget.M
    public final void c(String str) {
        RecyclerView recyclerView;
        if (this.f10061F != null || (recyclerView = this.f10039b) == null) {
            return;
        }
        recyclerView.assertNotInLayoutOrScroll(str);
    }

    @Override // androidx.recyclerview.widget.M
    public final boolean d() {
        return this.f10071t == 0;
    }

    @Override // androidx.recyclerview.widget.M
    public final boolean e() {
        return this.f10071t == 1;
    }

    @Override // androidx.recyclerview.widget.M
    public final boolean f(N n10) {
        return n10 instanceof k0;
    }

    @Override // androidx.recyclerview.widget.M
    public final int g0(int i3, V v2, b0 b0Var) {
        return S0(i3, v2, b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public final void h(int i3, int i10, b0 b0Var, C0462o c0462o) {
        C0465s c0465s;
        int f10;
        int i11;
        if (this.f10071t != 0) {
            i3 = i10;
        }
        if (v() == 0 || i3 == 0) {
            return;
        }
        N0(i3, b0Var);
        int[] iArr = this.f10065J;
        if (iArr == null || iArr.length < this.f10067p) {
            this.f10065J = new int[this.f10067p];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f10067p;
            c0465s = this.f10073v;
            if (i12 >= i14) {
                break;
            }
            if (c0465s.f10290d == -1) {
                f10 = c0465s.f10292f;
                i11 = this.f10068q[i12].h(f10);
            } else {
                f10 = this.f10068q[i12].f(c0465s.f10293g);
                i11 = c0465s.f10293g;
            }
            int i15 = f10 - i11;
            if (i15 >= 0) {
                this.f10065J[i13] = i15;
                i13++;
            }
            i12++;
        }
        Arrays.sort(this.f10065J, 0, i13);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = c0465s.f10289c;
            if (i17 < 0 || i17 >= b0Var.b()) {
                return;
            }
            c0462o.a(c0465s.f10289c, this.f10065J[i16]);
            c0465s.f10289c += c0465s.f10290d;
        }
    }

    @Override // androidx.recyclerview.widget.M
    public final void h0(int i3) {
        m0 m0Var = this.f10061F;
        if (m0Var != null && m0Var.f10214a != i3) {
            m0Var.f10217d = null;
            m0Var.f10216c = 0;
            m0Var.f10214a = -1;
            m0Var.f10215b = -1;
        }
        this.f10077z = i3;
        this.f10056A = Integer.MIN_VALUE;
        f0();
    }

    @Override // androidx.recyclerview.widget.M
    public final int i0(int i3, V v2, b0 b0Var) {
        return S0(i3, v2, b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public final int j(b0 b0Var) {
        return v0(b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public final int k(b0 b0Var) {
        return w0(b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public final int l(b0 b0Var) {
        return x0(b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public final void l0(Rect rect, int i3, int i10) {
        int g10;
        int g11;
        int i11 = this.f10067p;
        int A4 = A() + z();
        int y10 = y() + B();
        if (this.f10071t == 1) {
            int height = rect.height() + y10;
            RecyclerView recyclerView = this.f10039b;
            WeakHashMap weakHashMap = N.I.f4732a;
            g11 = M.g(i10, height, recyclerView.getMinimumHeight());
            g10 = M.g(i3, (this.f10072u * i11) + A4, this.f10039b.getMinimumWidth());
        } else {
            int width = rect.width() + A4;
            RecyclerView recyclerView2 = this.f10039b;
            WeakHashMap weakHashMap2 = N.I.f4732a;
            g10 = M.g(i3, width, recyclerView2.getMinimumWidth());
            g11 = M.g(i10, (this.f10072u * i11) + y10, this.f10039b.getMinimumHeight());
        }
        this.f10039b.setMeasuredDimension(g10, g11);
    }

    @Override // androidx.recyclerview.widget.M
    public final int m(b0 b0Var) {
        return v0(b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public final int n(b0 b0Var) {
        return w0(b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public final int o(b0 b0Var) {
        return x0(b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public final N r() {
        return this.f10071t == 0 ? new k0(-2, -1) : new k0(-1, -2);
    }

    @Override // androidx.recyclerview.widget.M
    public final void r0(RecyclerView recyclerView, int i3) {
        C0470x c0470x = new C0470x(recyclerView.getContext());
        c0470x.f10320a = i3;
        s0(c0470x);
    }

    @Override // androidx.recyclerview.widget.M
    public final N s(Context context, AttributeSet attributeSet) {
        return new k0(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.M
    public final N t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new k0((ViewGroup.MarginLayoutParams) layoutParams) : new k0(layoutParams);
    }

    @Override // androidx.recyclerview.widget.M
    public final boolean t0() {
        return this.f10061F == null;
    }

    public final boolean u0() {
        int D02;
        if (v() != 0 && this.f10058C != 0 && this.f10044g) {
            if (this.f10075x) {
                D02 = E0();
                D0();
            } else {
                D02 = D0();
                E0();
            }
            Y.m mVar = this.f10057B;
            if (D02 == 0 && I0() != null) {
                int[] iArr = (int[]) mVar.f8674b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                mVar.f8675c = null;
                this.f10043f = true;
                f0();
                return true;
            }
        }
        return false;
    }

    public final int v0(b0 b0Var) {
        if (v() == 0) {
            return 0;
        }
        Y.e eVar = this.f10069r;
        boolean z2 = !this.f10064I;
        return u0.d(b0Var, eVar, A0(z2), z0(z2), this, this.f10064I);
    }

    public final int w0(b0 b0Var) {
        if (v() == 0) {
            return 0;
        }
        Y.e eVar = this.f10069r;
        boolean z2 = !this.f10064I;
        return u0.e(b0Var, eVar, A0(z2), z0(z2), this, this.f10064I, this.f10075x);
    }

    @Override // androidx.recyclerview.widget.M
    public final int x(V v2, b0 b0Var) {
        return this.f10071t == 1 ? this.f10067p : super.x(v2, b0Var);
    }

    public final int x0(b0 b0Var) {
        if (v() == 0) {
            return 0;
        }
        Y.e eVar = this.f10069r;
        boolean z2 = !this.f10064I;
        return u0.f(b0Var, eVar, A0(z2), z0(z2), this, this.f10064I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int y0(V v2, C0465s c0465s, b0 b0Var) {
        n0 n0Var;
        ?? r62;
        int i3;
        int h2;
        int c10;
        int k3;
        int c11;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 1;
        this.f10076y.set(0, this.f10067p, true);
        C0465s c0465s2 = this.f10073v;
        int i15 = c0465s2.f10295i ? c0465s.f10291e == 1 ? IntCompanionObject.MAX_VALUE : Integer.MIN_VALUE : c0465s.f10291e == 1 ? c0465s.f10293g + c0465s.f10288b : c0465s.f10292f - c0465s.f10288b;
        int i16 = c0465s.f10291e;
        for (int i17 = 0; i17 < this.f10067p; i17++) {
            if (!this.f10068q[i17].f10252a.isEmpty()) {
                V0(this.f10068q[i17], i16, i15);
            }
        }
        int g10 = this.f10075x ? this.f10069r.g() : this.f10069r.k();
        boolean z2 = false;
        while (true) {
            int i18 = c0465s.f10289c;
            if (((i18 < 0 || i18 >= b0Var.b()) ? i13 : i14) == 0 || (!c0465s2.f10295i && this.f10076y.isEmpty())) {
                break;
            }
            View view = v2.j(c0465s.f10289c, LongCompanionObject.MAX_VALUE).f10140a;
            c0465s.f10289c += c0465s.f10290d;
            k0 k0Var = (k0) view.getLayoutParams();
            int b2 = k0Var.f10052a.b();
            Y.m mVar = this.f10057B;
            int[] iArr = (int[]) mVar.f8674b;
            int i19 = (iArr == null || b2 >= iArr.length) ? -1 : iArr[b2];
            if (i19 == -1) {
                if (M0(c0465s.f10291e)) {
                    i12 = this.f10067p - i14;
                    i11 = -1;
                    i10 = -1;
                } else {
                    i10 = i14;
                    i11 = this.f10067p;
                    i12 = i13;
                }
                n0 n0Var2 = null;
                if (c0465s.f10291e == i14) {
                    int k4 = this.f10069r.k();
                    int i20 = IntCompanionObject.MAX_VALUE;
                    while (i12 != i11) {
                        n0 n0Var3 = this.f10068q[i12];
                        int f10 = n0Var3.f(k4);
                        if (f10 < i20) {
                            i20 = f10;
                            n0Var2 = n0Var3;
                        }
                        i12 += i10;
                    }
                } else {
                    int g11 = this.f10069r.g();
                    int i21 = Integer.MIN_VALUE;
                    while (i12 != i11) {
                        n0 n0Var4 = this.f10068q[i12];
                        int h4 = n0Var4.h(g11);
                        if (h4 > i21) {
                            n0Var2 = n0Var4;
                            i21 = h4;
                        }
                        i12 += i10;
                    }
                }
                n0Var = n0Var2;
                mVar.m(b2);
                ((int[]) mVar.f8674b)[b2] = n0Var.f10256e;
            } else {
                n0Var = this.f10068q[i19];
            }
            k0Var.f10207e = n0Var;
            if (c0465s.f10291e == 1) {
                r62 = 0;
                b(-1, view, false);
            } else {
                r62 = 0;
                b(0, view, false);
            }
            if (this.f10071t == 1) {
                i3 = 1;
                K0(view, M.w(this.f10072u, this.f10048l, r62, r62, ((ViewGroup.MarginLayoutParams) k0Var).width), M.w(this.f10051o, this.f10049m, y() + B(), true, ((ViewGroup.MarginLayoutParams) k0Var).height));
            } else {
                i3 = 1;
                K0(view, M.w(this.f10050n, this.f10048l, A() + z(), true, ((ViewGroup.MarginLayoutParams) k0Var).width), M.w(this.f10072u, this.f10049m, 0, false, ((ViewGroup.MarginLayoutParams) k0Var).height));
            }
            if (c0465s.f10291e == i3) {
                c10 = n0Var.f(g10);
                h2 = this.f10069r.c(view) + c10;
            } else {
                h2 = n0Var.h(g10);
                c10 = h2 - this.f10069r.c(view);
            }
            if (c0465s.f10291e == 1) {
                n0 n0Var5 = k0Var.f10207e;
                n0Var5.getClass();
                k0 k0Var2 = (k0) view.getLayoutParams();
                k0Var2.f10207e = n0Var5;
                ArrayList arrayList = n0Var5.f10252a;
                arrayList.add(view);
                n0Var5.f10254c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    n0Var5.f10253b = Integer.MIN_VALUE;
                }
                if (k0Var2.f10052a.h() || k0Var2.f10052a.k()) {
                    n0Var5.f10255d = n0Var5.f10257f.f10069r.c(view) + n0Var5.f10255d;
                }
            } else {
                n0 n0Var6 = k0Var.f10207e;
                n0Var6.getClass();
                k0 k0Var3 = (k0) view.getLayoutParams();
                k0Var3.f10207e = n0Var6;
                ArrayList arrayList2 = n0Var6.f10252a;
                arrayList2.add(0, view);
                n0Var6.f10253b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    n0Var6.f10254c = Integer.MIN_VALUE;
                }
                if (k0Var3.f10052a.h() || k0Var3.f10052a.k()) {
                    n0Var6.f10255d = n0Var6.f10257f.f10069r.c(view) + n0Var6.f10255d;
                }
            }
            if (J0() && this.f10071t == 1) {
                c11 = this.f10070s.g() - (((this.f10067p - 1) - n0Var.f10256e) * this.f10072u);
                k3 = c11 - this.f10070s.c(view);
            } else {
                k3 = this.f10070s.k() + (n0Var.f10256e * this.f10072u);
                c11 = this.f10070s.c(view) + k3;
            }
            if (this.f10071t == 1) {
                M.I(view, k3, c10, c11, h2);
            } else {
                M.I(view, c10, k3, h2, c11);
            }
            V0(n0Var, c0465s2.f10291e, i15);
            O0(v2, c0465s2);
            if (c0465s2.f10294h && view.hasFocusable()) {
                this.f10076y.set(n0Var.f10256e, false);
            }
            i14 = 1;
            z2 = true;
            i13 = 0;
        }
        if (!z2) {
            O0(v2, c0465s2);
        }
        int k10 = c0465s2.f10291e == -1 ? this.f10069r.k() - G0(this.f10069r.k()) : F0(this.f10069r.g()) - this.f10069r.g();
        if (k10 > 0) {
            return Math.min(c0465s.f10288b, k10);
        }
        return 0;
    }

    public final View z0(boolean z2) {
        int k3 = this.f10069r.k();
        int g10 = this.f10069r.g();
        View view = null;
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            int e10 = this.f10069r.e(u2);
            int b2 = this.f10069r.b(u2);
            if (b2 > k3 && e10 < g10) {
                if (b2 <= g10 || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }
}
