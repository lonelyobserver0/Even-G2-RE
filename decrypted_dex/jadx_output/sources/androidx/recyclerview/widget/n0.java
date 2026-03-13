package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10252a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f10253b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f10254c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f10255d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f10256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f10257f;

    public n0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i3) {
        this.f10257f = staggeredGridLayoutManager;
        this.f10256e = i3;
    }

    public final void a() {
        View view = (View) i2.u.j(1, this.f10252a);
        k0 k0Var = (k0) view.getLayoutParams();
        this.f10254c = this.f10257f.f10069r.b(view);
        k0Var.getClass();
    }

    public final void b() {
        this.f10252a.clear();
        this.f10253b = Integer.MIN_VALUE;
        this.f10254c = Integer.MIN_VALUE;
        this.f10255d = 0;
    }

    public final int c() {
        return this.f10257f.f10074w ? e(r1.size() - 1, -1) : e(0, this.f10252a.size());
    }

    public final int d() {
        return this.f10257f.f10074w ? e(0, this.f10252a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i3, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f10257f;
        int k3 = staggeredGridLayoutManager.f10069r.k();
        int g10 = staggeredGridLayoutManager.f10069r.g();
        int i11 = i10 > i3 ? 1 : -1;
        while (i3 != i10) {
            View view = (View) this.f10252a.get(i3);
            int e10 = staggeredGridLayoutManager.f10069r.e(view);
            int b2 = staggeredGridLayoutManager.f10069r.b(view);
            boolean z2 = e10 <= g10;
            boolean z10 = b2 >= k3;
            if (z2 && z10 && (e10 < k3 || b2 > g10)) {
                return M.C(view);
            }
            i3 += i11;
        }
        return -1;
    }

    public final int f(int i3) {
        int i10 = this.f10254c;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (this.f10252a.size() == 0) {
            return i3;
        }
        a();
        return this.f10254c;
    }

    public final View g(int i3, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f10257f;
        ArrayList arrayList = this.f10252a;
        View view = null;
        if (i10 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f10074w && M.C(view2) >= i3) || ((!staggeredGridLayoutManager.f10074w && M.C(view2) <= i3) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            View view3 = (View) arrayList.get(i11);
            if ((staggeredGridLayoutManager.f10074w && M.C(view3) <= i3) || ((!staggeredGridLayoutManager.f10074w && M.C(view3) >= i3) || !view3.hasFocusable())) {
                break;
            }
            i11++;
            view = view3;
        }
        return view;
    }

    public final int h(int i3) {
        int i10 = this.f10253b;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (this.f10252a.size() == 0) {
            return i3;
        }
        View view = (View) this.f10252a.get(0);
        k0 k0Var = (k0) view.getLayoutParams();
        this.f10253b = this.f10257f.f10069r.e(view);
        k0Var.getClass();
        return this.f10253b;
    }
}
