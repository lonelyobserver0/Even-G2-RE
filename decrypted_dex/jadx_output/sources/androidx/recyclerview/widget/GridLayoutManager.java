package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f10001E;

    /* renamed from: F, reason: collision with root package name */
    public int f10002F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f10003G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f10004H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f10005I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f10006J;

    /* renamed from: K, reason: collision with root package name */
    public final V6.b f10007K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f10008L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i10) {
        super(context, attributeSet, i3, i10);
        this.f10001E = false;
        this.f10002F = -1;
        this.f10005I = new SparseIntArray();
        this.f10006J = new SparseIntArray();
        this.f10007K = new V6.b(5);
        this.f10008L = new Rect();
        f1(M.D(context, attributeSet, i3, i10).f10020b);
    }

    @Override // androidx.recyclerview.widget.M
    public final int E(V v2, b0 b0Var) {
        if (this.f10027p == 0) {
            return this.f10002F;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return b1(b0Var.b() - 1, v2, b0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View H0(V v2, b0 b0Var, int i3, int i10, int i11) {
        A0();
        int k3 = this.f10029r.k();
        int g10 = this.f10029r.g();
        int i12 = i10 > i3 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i3 != i10) {
            View u2 = u(i3);
            int C10 = M.C(u2);
            if (C10 >= 0 && C10 < i11 && c1(C10, v2, b0Var) == 0) {
                if (((N) u2.getLayoutParams()).f10052a.h()) {
                    if (view2 == null) {
                        view2 = u2;
                    }
                } else {
                    if (this.f10029r.e(u2) < g10 && this.f10029r.b(u2) >= k3) {
                        return u2;
                    }
                    if (view == null) {
                        view = u2;
                    }
                }
            }
            i3 += i12;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0105, code lost:
    
        if (r13 == (r2 > r8)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x001f, code lost:
    
        if (r22.f10038a.f10123c.contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View M(android.view.View r23, int r24, androidx.recyclerview.widget.V r25, androidx.recyclerview.widget.b0 r26) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.M(android.view.View, int, androidx.recyclerview.widget.V, androidx.recyclerview.widget.b0):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        r22.f10303b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v39 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0(androidx.recyclerview.widget.V r19, androidx.recyclerview.widget.b0 r20, androidx.recyclerview.widget.C0468v r21, androidx.recyclerview.widget.C0467u r22) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.N0(androidx.recyclerview.widget.V, androidx.recyclerview.widget.b0, androidx.recyclerview.widget.v, androidx.recyclerview.widget.u):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void O0(V v2, b0 b0Var, C0466t c0466t, int i3) {
        g1();
        if (b0Var.b() > 0 && !b0Var.f10114g) {
            boolean z2 = i3 == 1;
            int c12 = c1(c0466t.f10298c, v2, b0Var);
            if (z2) {
                while (c12 > 0) {
                    int i10 = c0466t.f10298c;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    c0466t.f10298c = i11;
                    c12 = c1(i11, v2, b0Var);
                }
            } else {
                int b2 = b0Var.b() - 1;
                int i12 = c0466t.f10298c;
                while (i12 < b2) {
                    int i13 = i12 + 1;
                    int c13 = c1(i13, v2, b0Var);
                    if (c13 <= c12) {
                        break;
                    }
                    i12 = i13;
                    c12 = c13;
                }
                c0466t.f10298c = i12;
            }
        }
        Z0();
    }

    @Override // androidx.recyclerview.widget.M
    public final void P(V v2, b0 b0Var, View view, O.e eVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof r)) {
            O(view, eVar);
            return;
        }
        r rVar = (r) layoutParams;
        int b12 = b1(rVar.f10052a.b(), v2, b0Var);
        int i3 = this.f10027p;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f5069a;
        if (i3 == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(rVar.f10283e, rVar.f10284f, b12, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(b12, 1, rVar.f10283e, rVar.f10284f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.M
    public final void Q(int i3, int i10) {
        V6.b bVar = this.f10007K;
        bVar.H();
        ((SparseIntArray) bVar.f7762c).clear();
    }

    @Override // androidx.recyclerview.widget.M
    public final void R() {
        V6.b bVar = this.f10007K;
        bVar.H();
        ((SparseIntArray) bVar.f7762c).clear();
    }

    @Override // androidx.recyclerview.widget.M
    public final void S(int i3, int i10) {
        V6.b bVar = this.f10007K;
        bVar.H();
        ((SparseIntArray) bVar.f7762c).clear();
    }

    @Override // androidx.recyclerview.widget.M
    public final void T(int i3, int i10) {
        V6.b bVar = this.f10007K;
        bVar.H();
        ((SparseIntArray) bVar.f7762c).clear();
    }

    @Override // androidx.recyclerview.widget.M
    public final void U(int i3, int i10) {
        V6.b bVar = this.f10007K;
        bVar.H();
        ((SparseIntArray) bVar.f7762c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.U0(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.M
    public final void V(V v2, b0 b0Var) {
        boolean z2 = b0Var.f10114g;
        SparseIntArray sparseIntArray = this.f10006J;
        SparseIntArray sparseIntArray2 = this.f10005I;
        if (z2) {
            int v8 = v();
            for (int i3 = 0; i3 < v8; i3++) {
                r rVar = (r) u(i3).getLayoutParams();
                int b2 = rVar.f10052a.b();
                sparseIntArray2.put(b2, rVar.f10284f);
                sparseIntArray.put(b2, rVar.f10283e);
            }
        }
        super.V(v2, b0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.M
    public final void W(b0 b0Var) {
        super.W(b0Var);
        this.f10001E = false;
    }

    public final void Y0(int i3) {
        int i10;
        int[] iArr = this.f10003G;
        int i11 = this.f10002F;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i3) {
            iArr = new int[i11 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i3 / i11;
        int i14 = i3 % i11;
        int i15 = 0;
        for (int i16 = 1; i16 <= i11; i16++) {
            i12 += i14;
            if (i12 <= 0 || i11 - i12 >= i14) {
                i10 = i13;
            } else {
                i10 = i13 + 1;
                i12 -= i11;
            }
            i15 += i10;
            iArr[i16] = i15;
        }
        this.f10003G = iArr;
    }

    public final void Z0() {
        View[] viewArr = this.f10004H;
        if (viewArr == null || viewArr.length != this.f10002F) {
            this.f10004H = new View[this.f10002F];
        }
    }

    public final int a1(int i3, int i10) {
        if (this.f10027p != 1 || !M0()) {
            int[] iArr = this.f10003G;
            return iArr[i10 + i3] - iArr[i3];
        }
        int[] iArr2 = this.f10003G;
        int i11 = this.f10002F;
        return iArr2[i11 - i3] - iArr2[(i11 - i3) - i10];
    }

    public final int b1(int i3, V v2, b0 b0Var) {
        boolean z2 = b0Var.f10114g;
        V6.b bVar = this.f10007K;
        if (!z2) {
            int i10 = this.f10002F;
            bVar.getClass();
            return V6.b.E(i3, i10);
        }
        int b2 = v2.b(i3);
        if (b2 != -1) {
            int i11 = this.f10002F;
            bVar.getClass();
            return V6.b.E(b2, i11);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i3);
        return 0;
    }

    public final int c1(int i3, V v2, b0 b0Var) {
        boolean z2 = b0Var.f10114g;
        V6.b bVar = this.f10007K;
        if (!z2) {
            int i10 = this.f10002F;
            bVar.getClass();
            return i3 % i10;
        }
        int i11 = this.f10006J.get(i3, -1);
        if (i11 != -1) {
            return i11;
        }
        int b2 = v2.b(i3);
        if (b2 != -1) {
            int i12 = this.f10002F;
            bVar.getClass();
            return b2 % i12;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i3);
        return 0;
    }

    public final int d1(int i3, V v2, b0 b0Var) {
        boolean z2 = b0Var.f10114g;
        V6.b bVar = this.f10007K;
        if (!z2) {
            bVar.getClass();
            return 1;
        }
        int i10 = this.f10005I.get(i3, -1);
        if (i10 != -1) {
            return i10;
        }
        if (v2.b(i3) != -1) {
            bVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i3);
        return 1;
    }

    public final void e1(int i3, View view, boolean z2) {
        int i10;
        int i11;
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.f10053b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        int a1 = a1(rVar.f10283e, rVar.f10284f);
        if (this.f10027p == 1) {
            i11 = M.w(a1, i3, i13, false, ((ViewGroup.MarginLayoutParams) rVar).width);
            i10 = M.w(this.f10029r.l(), this.f10049m, i12, true, ((ViewGroup.MarginLayoutParams) rVar).height);
        } else {
            int w10 = M.w(a1, i3, i12, false, ((ViewGroup.MarginLayoutParams) rVar).height);
            int w11 = M.w(this.f10029r.l(), this.f10048l, i13, true, ((ViewGroup.MarginLayoutParams) rVar).width);
            i10 = w10;
            i11 = w11;
        }
        N n10 = (N) view.getLayoutParams();
        if (z2 ? q0(view, i11, i10, n10) : o0(view, i11, i10, n10)) {
            view.measure(i11, i10);
        }
    }

    @Override // androidx.recyclerview.widget.M
    public final boolean f(N n10) {
        return n10 instanceof r;
    }

    public final void f1(int i3) {
        if (i3 == this.f10002F) {
            return;
        }
        this.f10001E = true;
        if (i3 < 1) {
            throw new IllegalArgumentException(i2.u.p(i3, "Span count should be at least 1. Provided "));
        }
        this.f10002F = i3;
        this.f10007K.H();
        f0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.M
    public final int g0(int i3, V v2, b0 b0Var) {
        g1();
        Z0();
        return super.g0(i3, v2, b0Var);
    }

    public final void g1() {
        int y10;
        int B7;
        if (this.f10027p == 1) {
            y10 = this.f10050n - A();
            B7 = z();
        } else {
            y10 = this.f10051o - y();
            B7 = B();
        }
        Y0(y10 - B7);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.M
    public final int i0(int i3, V v2, b0 b0Var) {
        g1();
        Z0();
        return super.i0(i3, v2, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.M
    public final int k(b0 b0Var) {
        return x0(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.M
    public final int l(b0 b0Var) {
        return y0(b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public final void l0(Rect rect, int i3, int i10) {
        int g10;
        int g11;
        if (this.f10003G == null) {
            super.l0(rect, i3, i10);
        }
        int A4 = A() + z();
        int y10 = y() + B();
        if (this.f10027p == 1) {
            int height = rect.height() + y10;
            RecyclerView recyclerView = this.f10039b;
            WeakHashMap weakHashMap = N.I.f4732a;
            g11 = M.g(i10, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f10003G;
            g10 = M.g(i3, iArr[iArr.length - 1] + A4, this.f10039b.getMinimumWidth());
        } else {
            int width = rect.width() + A4;
            RecyclerView recyclerView2 = this.f10039b;
            WeakHashMap weakHashMap2 = N.I.f4732a;
            g10 = M.g(i3, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f10003G;
            g11 = M.g(i10, iArr2[iArr2.length - 1] + y10, this.f10039b.getMinimumHeight());
        }
        this.f10039b.setMeasuredDimension(g10, g11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.M
    public final int n(b0 b0Var) {
        return x0(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.M
    public final int o(b0 b0Var) {
        return y0(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.M
    public final N r() {
        return this.f10027p == 0 ? new r(-2, -1) : new r(-1, -2);
    }

    @Override // androidx.recyclerview.widget.M
    public final N s(Context context, AttributeSet attributeSet) {
        r rVar = new r(context, attributeSet);
        rVar.f10283e = -1;
        rVar.f10284f = 0;
        return rVar;
    }

    @Override // androidx.recyclerview.widget.M
    public final N t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            r rVar = new r((ViewGroup.MarginLayoutParams) layoutParams);
            rVar.f10283e = -1;
            rVar.f10284f = 0;
            return rVar;
        }
        r rVar2 = new r(layoutParams);
        rVar2.f10283e = -1;
        rVar2.f10284f = 0;
        return rVar2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.M
    public final boolean t0() {
        return this.f10037z == null && !this.f10001E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void v0(b0 b0Var, C0468v c0468v, C0462o c0462o) {
        int i3;
        int i10 = this.f10002F;
        for (int i11 = 0; i11 < this.f10002F && (i3 = c0468v.f10309d) >= 0 && i3 < b0Var.b() && i10 > 0; i11++) {
            c0462o.a(c0468v.f10309d, Math.max(0, c0468v.f10312g));
            this.f10007K.getClass();
            i10--;
            c0468v.f10309d += c0468v.f10310e;
        }
    }

    @Override // androidx.recyclerview.widget.M
    public final int x(V v2, b0 b0Var) {
        if (this.f10027p == 1) {
            return this.f10002F;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return b1(b0Var.b() - 1, v2, b0Var) + 1;
    }

    public GridLayoutManager(int i3) {
        super(1);
        this.f10001E = false;
        this.f10002F = -1;
        this.f10005I = new SparseIntArray();
        this.f10006J = new SparseIntArray();
        this.f10007K = new V6.b(5);
        this.f10008L = new Rect();
        f1(i3);
    }
}
