package x;

import java.util.ArrayList;
import w.C1853b;
import w.C1855d;
import w.C1857f;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1894a extends C1897d {

    /* renamed from: i0, reason: collision with root package name */
    public C1897d[] f22499i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f22500j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f22501k0;

    /* renamed from: l0, reason: collision with root package name */
    public ArrayList f22502l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f22503m0;

    @Override // x.C1897d
    public final void a(C1855d c1855d) {
        boolean z2;
        int i3;
        C1896c[] c1896cArr = this.f22529A;
        C1896c c1896c = this.f22579s;
        c1896cArr[0] = c1896c;
        C1896c c1896c2 = this.f22580t;
        c1896cArr[2] = c1896c2;
        C1896c c1896c3 = this.f22581u;
        c1896cArr[1] = c1896c3;
        C1896c c1896c4 = this.f22582v;
        c1896cArr[3] = c1896c4;
        for (C1896c c1896c5 : c1896cArr) {
            c1896c5.f22528i = c1855d.j(c1896c5);
        }
        int i10 = this.f22501k0;
        if (i10 < 0 || i10 >= 4) {
            return;
        }
        C1896c c1896c6 = c1896cArr[i10];
        for (int i11 = 0; i11 < this.f22500j0; i11++) {
            C1897d c1897d = this.f22499i0[i11];
            if ((this.f22503m0 || c1897d.b()) && ((((i3 = this.f22501k0) == 0 || i3 == 1) && c1897d.h0[0] == 3) || ((i3 == 2 || i3 == 3) && c1897d.h0[1] == 3))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        int i12 = this.f22501k0;
        if (i12 == 0 || i12 == 1 ? this.f22531C.h0[0] == 2 : this.f22531C.h0[1] == 2) {
            z2 = false;
        }
        for (int i13 = 0; i13 < this.f22500j0; i13++) {
            C1897d c1897d2 = this.f22499i0[i13];
            if (this.f22503m0 || c1897d2.b()) {
                C1857f j = c1855d.j(c1897d2.f22529A[this.f22501k0]);
                int i14 = this.f22501k0;
                c1897d2.f22529A[i14].f22528i = j;
                if (i14 == 0 || i14 == 2) {
                    C1857f c1857f = c1896c6.f22528i;
                    C1853b k3 = c1855d.k();
                    C1857f l9 = c1855d.l();
                    l9.f21972c = 0;
                    k3.d(c1857f, j, l9, 0);
                    if (z2) {
                        k3.f21953c.g(c1855d.i(1), (int) (r10.c(l9) * (-1.0f)));
                    }
                    c1855d.c(k3);
                } else {
                    C1857f c1857f2 = c1896c6.f22528i;
                    C1853b k4 = c1855d.k();
                    C1857f l10 = c1855d.l();
                    l10.f21972c = 0;
                    k4.c(c1857f2, j, l10, 0);
                    if (z2) {
                        k4.f21953c.g(c1855d.i(1), (int) (r14.c(l10) * (-1.0f)));
                    }
                    c1855d.c(k4);
                }
            }
        }
        int i15 = this.f22501k0;
        if (i15 == 0) {
            c1855d.e(c1896c3.f22528i, c1896c.f22528i, 0, 6);
            if (z2) {
                return;
            }
            c1855d.e(c1896c.f22528i, this.f22531C.f22581u.f22528i, 0, 5);
            return;
        }
        if (i15 == 1) {
            c1855d.e(c1896c.f22528i, c1896c3.f22528i, 0, 6);
            if (z2) {
                return;
            }
            c1855d.e(c1896c.f22528i, this.f22531C.f22579s.f22528i, 0, 5);
            return;
        }
        if (i15 == 2) {
            c1855d.e(c1896c4.f22528i, c1896c2.f22528i, 0, 6);
            if (z2) {
                return;
            }
            c1855d.e(c1896c2.f22528i, this.f22531C.f22582v.f22528i, 0, 5);
            return;
        }
        if (i15 == 3) {
            c1855d.e(c1896c2.f22528i, c1896c4.f22528i, 0, 6);
            if (z2) {
                return;
            }
            c1855d.e(c1896c2.f22528i, this.f22531C.f22580t.f22528i, 0, 5);
        }
    }

    @Override // x.C1897d
    public final boolean b() {
        return true;
    }

    @Override // x.C1897d
    public final void c(int i3) {
        C1902i c1902i;
        C1897d c1897d = this.f22531C;
        if (c1897d != null && ((C1898e) c1897d).D(2)) {
            int i10 = this.f22501k0;
            C1896c c1896c = this.f22579s;
            C1896c c1896c2 = this.f22581u;
            C1896c c1896c3 = this.f22580t;
            C1896c c1896c4 = this.f22582v;
            if (i10 == 0) {
                c1902i = c1896c.f22520a;
            } else if (i10 == 1) {
                c1902i = c1896c2.f22520a;
            } else if (i10 == 2) {
                c1902i = c1896c3.f22520a;
            } else if (i10 != 3) {
                return;
            } else {
                c1902i = c1896c4.f22520a;
            }
            c1902i.f22625h = 5;
            if (i10 == 0 || i10 == 1) {
                c1896c3.f22520a.k(null, 0.0f);
                c1896c4.f22520a.k(null, 0.0f);
            } else {
                c1896c.f22520a.k(null, 0.0f);
                c1896c2.f22520a.k(null, 0.0f);
            }
            ArrayList arrayList = this.f22502l0;
            arrayList.clear();
            for (int i11 = 0; i11 < this.f22500j0; i11++) {
                C1897d c1897d2 = this.f22499i0[i11];
                if (this.f22503m0 || c1897d2.b()) {
                    int i12 = this.f22501k0;
                    C1902i c1902i2 = i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? null : c1897d2.f22582v.f22520a : c1897d2.f22580t.f22520a : c1897d2.f22581u.f22520a : c1897d2.f22579s.f22520a;
                    if (c1902i2 != null) {
                        arrayList.add(c1902i2);
                        c1902i2.a(c1902i);
                    }
                }
            }
        }
    }

    @Override // x.C1897d
    public final void p() {
        super.p();
        this.f22502l0.clear();
    }

    @Override // x.C1897d
    public final void r() {
        C1902i c1902i;
        float f10;
        C1902i c1902i2;
        int i3 = this.f22501k0;
        C1896c c1896c = this.f22579s;
        C1896c c1896c2 = this.f22581u;
        C1896c c1896c3 = this.f22580t;
        C1896c c1896c4 = this.f22582v;
        float f11 = Float.MAX_VALUE;
        if (i3 != 0) {
            if (i3 == 1) {
                c1902i = c1896c2.f22520a;
            } else if (i3 == 2) {
                c1902i = c1896c3.f22520a;
            } else if (i3 != 3) {
                return;
            } else {
                c1902i = c1896c4.f22520a;
            }
            f11 = 0.0f;
        } else {
            c1902i = c1896c.f22520a;
        }
        ArrayList arrayList = this.f22502l0;
        int size = arrayList.size();
        C1902i c1902i3 = null;
        for (int i10 = 0; i10 < size; i10++) {
            C1902i c1902i4 = (C1902i) arrayList.get(i10);
            if (c1902i4.f22631b != 1) {
                return;
            }
            int i11 = this.f22501k0;
            if (i11 == 0 || i11 == 2) {
                f10 = c1902i4.f22624g;
                if (f10 < f11) {
                    c1902i2 = c1902i4.f22623f;
                    c1902i3 = c1902i2;
                    f11 = f10;
                }
            } else {
                f10 = c1902i4.f22624g;
                if (f10 > f11) {
                    c1902i2 = c1902i4.f22623f;
                    c1902i3 = c1902i2;
                    f11 = f10;
                }
            }
        }
        c1902i.f22623f = c1902i3;
        c1902i.f22624g = f11;
        c1902i.b();
        int i12 = this.f22501k0;
        if (i12 == 0) {
            c1896c2.f22520a.k(c1902i3, f11);
            return;
        }
        if (i12 == 1) {
            c1896c.f22520a.k(c1902i3, f11);
        } else if (i12 == 2) {
            c1896c4.f22520a.k(c1902i3, f11);
        } else {
            if (i12 != 3) {
                return;
            }
            c1896c3.f22520a.k(c1902i3, f11);
        }
    }
}
