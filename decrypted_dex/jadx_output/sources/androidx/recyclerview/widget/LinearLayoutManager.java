package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import f5.u0;
import java.util.WeakHashMap;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class LinearLayoutManager extends M implements a0 {

    /* renamed from: A, reason: collision with root package name */
    public final C0466t f10023A;

    /* renamed from: B, reason: collision with root package name */
    public final C0467u f10024B;

    /* renamed from: C, reason: collision with root package name */
    public final int f10025C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f10026D;

    /* renamed from: p, reason: collision with root package name */
    public int f10027p;

    /* renamed from: q, reason: collision with root package name */
    public C0468v f10028q;

    /* renamed from: r, reason: collision with root package name */
    public Y.e f10029r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10030s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f10031t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10032u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10033v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f10034w;

    /* renamed from: x, reason: collision with root package name */
    public int f10035x;

    /* renamed from: y, reason: collision with root package name */
    public int f10036y;

    /* renamed from: z, reason: collision with root package name */
    public C0469w f10037z;

    public LinearLayoutManager(int i3) {
        this.f10027p = 1;
        this.f10031t = false;
        this.f10032u = false;
        this.f10033v = false;
        this.f10034w = true;
        this.f10035x = -1;
        this.f10036y = Integer.MIN_VALUE;
        this.f10037z = null;
        this.f10023A = new C0466t();
        this.f10024B = new C0467u();
        this.f10025C = 2;
        this.f10026D = new int[2];
        T0(i3);
        c(null);
        if (this.f10031t) {
            this.f10031t = false;
            f0();
        }
    }

    public final void A0() {
        if (this.f10028q == null) {
            C0468v c0468v = new C0468v();
            c0468v.f10306a = true;
            c0468v.f10313h = 0;
            c0468v.f10314i = 0;
            c0468v.f10315k = null;
            this.f10028q = c0468v;
        }
    }

    public final int B0(V v2, C0468v c0468v, b0 b0Var, boolean z2) {
        int i3;
        int i10 = c0468v.f10308c;
        int i11 = c0468v.f10312g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                c0468v.f10312g = i11 + i10;
            }
            P0(v2, c0468v);
        }
        int i12 = c0468v.f10308c + c0468v.f10313h;
        while (true) {
            if ((!c0468v.f10316l && i12 <= 0) || (i3 = c0468v.f10309d) < 0 || i3 >= b0Var.b()) {
                break;
            }
            C0467u c0467u = this.f10024B;
            c0467u.f10302a = 0;
            c0467u.f10303b = false;
            c0467u.f10304c = false;
            c0467u.f10305d = false;
            N0(v2, b0Var, c0468v, c0467u);
            if (!c0467u.f10303b) {
                int i13 = c0468v.f10307b;
                int i14 = c0467u.f10302a;
                c0468v.f10307b = (c0468v.f10311f * i14) + i13;
                if (!c0467u.f10304c || c0468v.f10315k != null || !b0Var.f10114g) {
                    c0468v.f10308c -= i14;
                    i12 -= i14;
                }
                int i15 = c0468v.f10312g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    c0468v.f10312g = i16;
                    int i17 = c0468v.f10308c;
                    if (i17 < 0) {
                        c0468v.f10312g = i16 + i17;
                    }
                    P0(v2, c0468v);
                }
                if (z2 && c0467u.f10305d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - c0468v.f10308c;
    }

    public final View C0(boolean z2) {
        return this.f10032u ? G0(0, v(), z2) : G0(v() - 1, -1, z2);
    }

    public final View D0(boolean z2) {
        return this.f10032u ? G0(v() - 1, -1, z2) : G0(0, v(), z2);
    }

    public final int E0() {
        View G02 = G0(v() - 1, -1, false);
        if (G02 == null) {
            return -1;
        }
        return M.C(G02);
    }

    public final View F0(int i3, int i10) {
        int i11;
        int i12;
        A0();
        if (i10 <= i3 && i10 >= i3) {
            return u(i3);
        }
        if (this.f10029r.e(u(i3)) < this.f10029r.k()) {
            i11 = 16644;
            i12 = 16388;
        } else {
            i11 = 4161;
            i12 = DfuBaseService.ERROR_FILE_NOT_FOUND;
        }
        return this.f10027p == 0 ? this.f10040c.A(i3, i10, i11, i12) : this.f10041d.A(i3, i10, i11, i12);
    }

    @Override // androidx.recyclerview.widget.M
    public final boolean G() {
        return true;
    }

    public final View G0(int i3, int i10, boolean z2) {
        A0();
        int i11 = z2 ? 24579 : 320;
        return this.f10027p == 0 ? this.f10040c.A(i3, i10, i11, DilithiumEngine.DilithiumPolyT1PackedBytes) : this.f10041d.A(i3, i10, i11, DilithiumEngine.DilithiumPolyT1PackedBytes);
    }

    public View H0(V v2, b0 b0Var, int i3, int i10, int i11) {
        A0();
        int k3 = this.f10029r.k();
        int g10 = this.f10029r.g();
        int i12 = i10 > i3 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i3 != i10) {
            View u2 = u(i3);
            int C10 = M.C(u2);
            if (C10 >= 0 && C10 < i11) {
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

    public final int I0(int i3, V v2, b0 b0Var, boolean z2) {
        int g10;
        int g11 = this.f10029r.g() - i3;
        if (g11 <= 0) {
            return 0;
        }
        int i10 = -S0(-g11, v2, b0Var);
        int i11 = i3 + i10;
        if (!z2 || (g10 = this.f10029r.g() - i11) <= 0) {
            return i10;
        }
        this.f10029r.o(g10);
        return g10 + i10;
    }

    public final int J0(int i3, V v2, b0 b0Var, boolean z2) {
        int k3;
        int k4 = i3 - this.f10029r.k();
        if (k4 <= 0) {
            return 0;
        }
        int i10 = -S0(k4, v2, b0Var);
        int i11 = i3 + i10;
        if (!z2 || (k3 = i11 - this.f10029r.k()) <= 0) {
            return i10;
        }
        this.f10029r.o(-k3);
        return i10 - k3;
    }

    public final View K0() {
        return u(this.f10032u ? 0 : v() - 1);
    }

    @Override // androidx.recyclerview.widget.M
    public final void L(RecyclerView recyclerView) {
    }

    public final View L0() {
        return u(this.f10032u ? v() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.M
    public View M(View view, int i3, V v2, b0 b0Var) {
        int z02;
        R0();
        if (v() != 0 && (z02 = z0(i3)) != Integer.MIN_VALUE) {
            A0();
            V0(z02, (int) (this.f10029r.l() * 0.33333334f), false, b0Var);
            C0468v c0468v = this.f10028q;
            c0468v.f10312g = Integer.MIN_VALUE;
            c0468v.f10306a = false;
            B0(v2, c0468v, b0Var, true);
            View F02 = z02 == -1 ? this.f10032u ? F0(v() - 1, -1) : F0(0, v()) : this.f10032u ? F0(0, v()) : F0(v() - 1, -1);
            View L02 = z02 == -1 ? L0() : K0();
            if (!L02.hasFocusable()) {
                return F02;
            }
            if (F02 != null) {
                return L02;
            }
        }
        return null;
    }

    public final boolean M0() {
        RecyclerView recyclerView = this.f10039b;
        WeakHashMap weakHashMap = N.I.f4732a;
        return recyclerView.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.M
    public final void N(AccessibilityEvent accessibilityEvent) {
        super.N(accessibilityEvent);
        if (v() > 0) {
            View G02 = G0(0, v(), false);
            accessibilityEvent.setFromIndex(G02 == null ? -1 : M.C(G02));
            accessibilityEvent.setToIndex(E0());
        }
    }

    public void N0(V v2, b0 b0Var, C0468v c0468v, C0467u c0467u) {
        int i3;
        int i10;
        int i11;
        int i12;
        View b2 = c0468v.b(v2);
        if (b2 == null) {
            c0467u.f10303b = true;
            return;
        }
        N n10 = (N) b2.getLayoutParams();
        if (c0468v.f10315k == null) {
            if (this.f10032u == (c0468v.f10311f == -1)) {
                b(-1, b2, false);
            } else {
                b(0, b2, false);
            }
        } else {
            if (this.f10032u == (c0468v.f10311f == -1)) {
                b(-1, b2, true);
            } else {
                b(0, b2, true);
            }
        }
        N n11 = (N) b2.getLayoutParams();
        Rect itemDecorInsetsForChild = this.f10039b.getItemDecorInsetsForChild(b2);
        int i13 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
        int i14 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
        int w10 = M.w(this.f10050n, this.f10048l, A() + z() + ((ViewGroup.MarginLayoutParams) n11).leftMargin + ((ViewGroup.MarginLayoutParams) n11).rightMargin + i13, d(), ((ViewGroup.MarginLayoutParams) n11).width);
        int w11 = M.w(this.f10051o, this.f10049m, y() + B() + ((ViewGroup.MarginLayoutParams) n11).topMargin + ((ViewGroup.MarginLayoutParams) n11).bottomMargin + i14, e(), ((ViewGroup.MarginLayoutParams) n11).height);
        if (o0(b2, w10, w11, n11)) {
            b2.measure(w10, w11);
        }
        c0467u.f10302a = this.f10029r.c(b2);
        if (this.f10027p == 1) {
            if (M0()) {
                i12 = this.f10050n - A();
                i3 = i12 - this.f10029r.d(b2);
            } else {
                i3 = z();
                i12 = this.f10029r.d(b2) + i3;
            }
            if (c0468v.f10311f == -1) {
                i10 = c0468v.f10307b;
                i11 = i10 - c0467u.f10302a;
            } else {
                i11 = c0468v.f10307b;
                i10 = c0467u.f10302a + i11;
            }
        } else {
            int B7 = B();
            int d8 = this.f10029r.d(b2) + B7;
            if (c0468v.f10311f == -1) {
                int i15 = c0468v.f10307b;
                int i16 = i15 - c0467u.f10302a;
                i12 = i15;
                i10 = d8;
                i3 = i16;
                i11 = B7;
            } else {
                int i17 = c0468v.f10307b;
                int i18 = c0467u.f10302a + i17;
                i3 = i17;
                i10 = d8;
                i11 = B7;
                i12 = i18;
            }
        }
        M.I(b2, i3, i11, i12, i10);
        if (n10.f10052a.h() || n10.f10052a.k()) {
            c0467u.f10304c = true;
        }
        c0467u.f10305d = b2.hasFocusable();
    }

    public void O0(V v2, b0 b0Var, C0466t c0466t, int i3) {
    }

    public final void P0(V v2, C0468v c0468v) {
        if (!c0468v.f10306a || c0468v.f10316l) {
            return;
        }
        int i3 = c0468v.f10312g;
        int i10 = c0468v.f10314i;
        if (c0468v.f10311f == -1) {
            int v8 = v();
            if (i3 < 0) {
                return;
            }
            int f10 = (this.f10029r.f() - i3) + i10;
            if (this.f10032u) {
                for (int i11 = 0; i11 < v8; i11++) {
                    View u2 = u(i11);
                    if (this.f10029r.e(u2) < f10 || this.f10029r.n(u2) < f10) {
                        Q0(v2, 0, i11);
                        return;
                    }
                }
                return;
            }
            int i12 = v8 - 1;
            for (int i13 = i12; i13 >= 0; i13--) {
                View u10 = u(i13);
                if (this.f10029r.e(u10) < f10 || this.f10029r.n(u10) < f10) {
                    Q0(v2, i12, i13);
                    return;
                }
            }
            return;
        }
        if (i3 < 0) {
            return;
        }
        int i14 = i3 - i10;
        int v10 = v();
        if (!this.f10032u) {
            for (int i15 = 0; i15 < v10; i15++) {
                View u11 = u(i15);
                if (this.f10029r.b(u11) > i14 || this.f10029r.m(u11) > i14) {
                    Q0(v2, 0, i15);
                    return;
                }
            }
            return;
        }
        int i16 = v10 - 1;
        for (int i17 = i16; i17 >= 0; i17--) {
            View u12 = u(i17);
            if (this.f10029r.b(u12) > i14 || this.f10029r.m(u12) > i14) {
                Q0(v2, i16, i17);
                return;
            }
        }
    }

    public final void Q0(V v2, int i3, int i10) {
        if (i3 == i10) {
            return;
        }
        if (i10 <= i3) {
            while (i3 > i10) {
                View u2 = u(i3);
                d0(i3);
                v2.g(u2);
                i3--;
            }
            return;
        }
        for (int i11 = i10 - 1; i11 >= i3; i11--) {
            View u10 = u(i11);
            d0(i11);
            v2.g(u10);
        }
    }

    public final void R0() {
        if (this.f10027p == 1 || !M0()) {
            this.f10032u = this.f10031t;
        } else {
            this.f10032u = !this.f10031t;
        }
    }

    public final int S0(int i3, V v2, b0 b0Var) {
        if (v() != 0 && i3 != 0) {
            A0();
            this.f10028q.f10306a = true;
            int i10 = i3 > 0 ? 1 : -1;
            int abs = Math.abs(i3);
            V0(i10, abs, true, b0Var);
            C0468v c0468v = this.f10028q;
            int B02 = B0(v2, c0468v, b0Var, false) + c0468v.f10312g;
            if (B02 >= 0) {
                if (abs > B02) {
                    i3 = i10 * B02;
                }
                this.f10029r.o(-i3);
                this.f10028q.j = i3;
                return i3;
            }
        }
        return 0;
    }

    public final void T0(int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException(i2.u.p(i3, "invalid orientation:"));
        }
        c(null);
        if (i3 != this.f10027p || this.f10029r == null) {
            Y.e a3 = Y.e.a(this, i3);
            this.f10029r = a3;
            this.f10023A.f10301f = a3;
            this.f10027p = i3;
            f0();
        }
    }

    public void U0(boolean z2) {
        c(null);
        if (this.f10033v == z2) {
            return;
        }
        this.f10033v = z2;
        f0();
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x023f  */
    @Override // androidx.recyclerview.widget.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V(androidx.recyclerview.widget.V r18, androidx.recyclerview.widget.b0 r19) {
        /*
            Method dump skipped, instructions count: 1169
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.V(androidx.recyclerview.widget.V, androidx.recyclerview.widget.b0):void");
    }

    public final void V0(int i3, int i10, boolean z2, b0 b0Var) {
        int k3;
        this.f10028q.f10316l = this.f10029r.i() == 0 && this.f10029r.f() == 0;
        this.f10028q.f10311f = i3;
        int[] iArr = this.f10026D;
        iArr[0] = 0;
        iArr[1] = 0;
        u0(b0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z10 = i3 == 1;
        C0468v c0468v = this.f10028q;
        int i11 = z10 ? max2 : max;
        c0468v.f10313h = i11;
        if (!z10) {
            max = max2;
        }
        c0468v.f10314i = max;
        if (z10) {
            c0468v.f10313h = this.f10029r.h() + i11;
            View K02 = K0();
            C0468v c0468v2 = this.f10028q;
            c0468v2.f10310e = this.f10032u ? -1 : 1;
            int C10 = M.C(K02);
            C0468v c0468v3 = this.f10028q;
            c0468v2.f10309d = C10 + c0468v3.f10310e;
            c0468v3.f10307b = this.f10029r.b(K02);
            k3 = this.f10029r.b(K02) - this.f10029r.g();
        } else {
            View L02 = L0();
            C0468v c0468v4 = this.f10028q;
            c0468v4.f10313h = this.f10029r.k() + c0468v4.f10313h;
            C0468v c0468v5 = this.f10028q;
            c0468v5.f10310e = this.f10032u ? 1 : -1;
            int C11 = M.C(L02);
            C0468v c0468v6 = this.f10028q;
            c0468v5.f10309d = C11 + c0468v6.f10310e;
            c0468v6.f10307b = this.f10029r.e(L02);
            k3 = (-this.f10029r.e(L02)) + this.f10029r.k();
        }
        C0468v c0468v7 = this.f10028q;
        c0468v7.f10308c = i10;
        if (z2) {
            c0468v7.f10308c = i10 - k3;
        }
        c0468v7.f10312g = k3;
    }

    @Override // androidx.recyclerview.widget.M
    public void W(b0 b0Var) {
        this.f10037z = null;
        this.f10035x = -1;
        this.f10036y = Integer.MIN_VALUE;
        this.f10023A.g();
    }

    public final void W0(int i3, int i10) {
        this.f10028q.f10308c = this.f10029r.g() - i10;
        C0468v c0468v = this.f10028q;
        c0468v.f10310e = this.f10032u ? -1 : 1;
        c0468v.f10309d = i3;
        c0468v.f10311f = 1;
        c0468v.f10307b = i10;
        c0468v.f10312g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.M
    public final void X(Parcelable parcelable) {
        if (parcelable instanceof C0469w) {
            this.f10037z = (C0469w) parcelable;
            f0();
        }
    }

    public final void X0(int i3, int i10) {
        this.f10028q.f10308c = i10 - this.f10029r.k();
        C0468v c0468v = this.f10028q;
        c0468v.f10309d = i3;
        c0468v.f10310e = this.f10032u ? 1 : -1;
        c0468v.f10311f = -1;
        c0468v.f10307b = i10;
        c0468v.f10312g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.M
    public final Parcelable Y() {
        C0469w c0469w = this.f10037z;
        if (c0469w != null) {
            C0469w c0469w2 = new C0469w();
            c0469w2.f10317a = c0469w.f10317a;
            c0469w2.f10318b = c0469w.f10318b;
            c0469w2.f10319c = c0469w.f10319c;
            return c0469w2;
        }
        C0469w c0469w3 = new C0469w();
        if (v() <= 0) {
            c0469w3.f10317a = -1;
            return c0469w3;
        }
        A0();
        boolean z2 = this.f10030s ^ this.f10032u;
        c0469w3.f10319c = z2;
        if (z2) {
            View K02 = K0();
            c0469w3.f10318b = this.f10029r.g() - this.f10029r.b(K02);
            c0469w3.f10317a = M.C(K02);
            return c0469w3;
        }
        View L02 = L0();
        c0469w3.f10317a = M.C(L02);
        c0469w3.f10318b = this.f10029r.e(L02) - this.f10029r.k();
        return c0469w3;
    }

    @Override // androidx.recyclerview.widget.a0
    public final PointF a(int i3) {
        if (v() == 0) {
            return null;
        }
        int i10 = (i3 < M.C(u(0))) != this.f10032u ? -1 : 1;
        return this.f10027p == 0 ? new PointF(i10, 0.0f) : new PointF(0.0f, i10);
    }

    @Override // androidx.recyclerview.widget.M
    public final void c(String str) {
        RecyclerView recyclerView;
        if (this.f10037z != null || (recyclerView = this.f10039b) == null) {
            return;
        }
        recyclerView.assertNotInLayoutOrScroll(str);
    }

    @Override // androidx.recyclerview.widget.M
    public final boolean d() {
        return this.f10027p == 0;
    }

    @Override // androidx.recyclerview.widget.M
    public final boolean e() {
        return this.f10027p == 1;
    }

    @Override // androidx.recyclerview.widget.M
    public int g0(int i3, V v2, b0 b0Var) {
        if (this.f10027p == 1) {
            return 0;
        }
        return S0(i3, v2, b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public final void h(int i3, int i10, b0 b0Var, C0462o c0462o) {
        if (this.f10027p != 0) {
            i3 = i10;
        }
        if (v() == 0 || i3 == 0) {
            return;
        }
        A0();
        V0(i3 > 0 ? 1 : -1, Math.abs(i3), true, b0Var);
        v0(b0Var, this.f10028q, c0462o);
    }

    @Override // androidx.recyclerview.widget.M
    public final void h0(int i3) {
        this.f10035x = i3;
        this.f10036y = Integer.MIN_VALUE;
        C0469w c0469w = this.f10037z;
        if (c0469w != null) {
            c0469w.f10317a = -1;
        }
        f0();
    }

    @Override // androidx.recyclerview.widget.M
    public final void i(int i3, C0462o c0462o) {
        boolean z2;
        int i10;
        C0469w c0469w = this.f10037z;
        if (c0469w == null || (i10 = c0469w.f10317a) < 0) {
            R0();
            z2 = this.f10032u;
            i10 = this.f10035x;
            if (i10 == -1) {
                i10 = z2 ? i3 - 1 : 0;
            }
        } else {
            z2 = c0469w.f10319c;
        }
        int i11 = z2 ? -1 : 1;
        for (int i12 = 0; i12 < this.f10025C && i10 >= 0 && i10 < i3; i12++) {
            c0462o.a(i10, 0);
            i10 += i11;
        }
    }

    @Override // androidx.recyclerview.widget.M
    public int i0(int i3, V v2, b0 b0Var) {
        if (this.f10027p == 0) {
            return 0;
        }
        return S0(i3, v2, b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public final int j(b0 b0Var) {
        return w0(b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public int k(b0 b0Var) {
        return x0(b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public int l(b0 b0Var) {
        return y0(b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public final int m(b0 b0Var) {
        return w0(b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public int n(b0 b0Var) {
        return x0(b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public int o(b0 b0Var) {
        return y0(b0Var);
    }

    @Override // androidx.recyclerview.widget.M
    public final boolean p0() {
        if (this.f10049m != 1073741824 && this.f10048l != 1073741824) {
            int v2 = v();
            for (int i3 = 0; i3 < v2; i3++) {
                ViewGroup.LayoutParams layoutParams = u(i3).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.M
    public final View q(int i3) {
        int v2 = v();
        if (v2 == 0) {
            return null;
        }
        int C10 = i3 - M.C(u(0));
        if (C10 >= 0 && C10 < v2) {
            View u2 = u(C10);
            if (M.C(u2) == i3) {
                return u2;
            }
        }
        return super.q(i3);
    }

    @Override // androidx.recyclerview.widget.M
    public N r() {
        return new N(-2, -2);
    }

    @Override // androidx.recyclerview.widget.M
    public void r0(RecyclerView recyclerView, int i3) {
        C0470x c0470x = new C0470x(recyclerView.getContext());
        c0470x.f10320a = i3;
        s0(c0470x);
    }

    @Override // androidx.recyclerview.widget.M
    public boolean t0() {
        return this.f10037z == null && this.f10030s == this.f10033v;
    }

    public void u0(b0 b0Var, int[] iArr) {
        int i3;
        int l9 = b0Var.f10108a != -1 ? this.f10029r.l() : 0;
        if (this.f10028q.f10311f == -1) {
            i3 = 0;
        } else {
            i3 = l9;
            l9 = 0;
        }
        iArr[0] = l9;
        iArr[1] = i3;
    }

    public void v0(b0 b0Var, C0468v c0468v, C0462o c0462o) {
        int i3 = c0468v.f10309d;
        if (i3 < 0 || i3 >= b0Var.b()) {
            return;
        }
        c0462o.a(i3, Math.max(0, c0468v.f10312g));
    }

    public final int w0(b0 b0Var) {
        if (v() == 0) {
            return 0;
        }
        A0();
        Y.e eVar = this.f10029r;
        boolean z2 = !this.f10034w;
        return u0.d(b0Var, eVar, D0(z2), C0(z2), this, this.f10034w);
    }

    public final int x0(b0 b0Var) {
        if (v() == 0) {
            return 0;
        }
        A0();
        Y.e eVar = this.f10029r;
        boolean z2 = !this.f10034w;
        return u0.e(b0Var, eVar, D0(z2), C0(z2), this, this.f10034w, this.f10032u);
    }

    public final int y0(b0 b0Var) {
        if (v() == 0) {
            return 0;
        }
        A0();
        Y.e eVar = this.f10029r;
        boolean z2 = !this.f10034w;
        return u0.f(b0Var, eVar, D0(z2), C0(z2), this, this.f10034w);
    }

    public final int z0(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 17 ? i3 != 33 ? i3 != 66 ? (i3 == 130 && this.f10027p == 1) ? 1 : Integer.MIN_VALUE : this.f10027p == 0 ? 1 : Integer.MIN_VALUE : this.f10027p == 1 ? -1 : Integer.MIN_VALUE : this.f10027p == 0 ? -1 : Integer.MIN_VALUE : (this.f10027p != 1 && M0()) ? -1 : 1 : (this.f10027p != 1 && M0()) ? 1 : -1;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i3, int i10) {
        this.f10027p = 1;
        this.f10031t = false;
        this.f10032u = false;
        this.f10033v = false;
        this.f10034w = true;
        this.f10035x = -1;
        this.f10036y = Integer.MIN_VALUE;
        this.f10037z = null;
        this.f10023A = new C0466t();
        this.f10024B = new C0467u();
        this.f10025C = 2;
        this.f10026D = new int[2];
        L D6 = M.D(context, attributeSet, i3, i10);
        T0(D6.f10019a);
        boolean z2 = D6.f10021c;
        c(null);
        if (z2 != this.f10031t) {
            this.f10031t = z2;
            f0();
        }
        U0(D6.f10022d);
    }
}
