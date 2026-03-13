package x;

import java.util.ArrayList;
import p0.AbstractC1482f;
import w.AbstractC1856e;
import w.C1852a;
import w.C1853b;
import w.C1855d;
import w.C1857f;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1900g extends C1897d {

    /* renamed from: i0, reason: collision with root package name */
    public float f22614i0 = -1.0f;

    /* renamed from: j0, reason: collision with root package name */
    public int f22615j0 = -1;

    /* renamed from: k0, reason: collision with root package name */
    public int f22616k0 = -1;

    /* renamed from: l0, reason: collision with root package name */
    public C1896c f22617l0 = this.f22580t;

    /* renamed from: m0, reason: collision with root package name */
    public int f22618m0 = 0;

    public C1900g() {
        this.f22530B.clear();
        this.f22530B.add(this.f22617l0);
        int length = this.f22529A.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f22529A[i3] = this.f22617l0;
        }
    }

    public final void A(int i3) {
        if (this.f22618m0 == i3) {
            return;
        }
        this.f22618m0 = i3;
        ArrayList arrayList = this.f22530B;
        arrayList.clear();
        if (this.f22618m0 == 1) {
            this.f22617l0 = this.f22579s;
        } else {
            this.f22617l0 = this.f22580t;
        }
        arrayList.add(this.f22617l0);
        C1896c[] c1896cArr = this.f22529A;
        int length = c1896cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            c1896cArr[i10] = this.f22617l0;
        }
    }

    @Override // x.C1897d
    public final void a(C1855d c1855d) {
        C1898e c1898e = (C1898e) this.f22531C;
        if (c1898e == null) {
            return;
        }
        C1896c f10 = c1898e.f(2);
        C1896c f11 = c1898e.f(4);
        C1897d c1897d = this.f22531C;
        boolean z2 = c1897d != null && c1897d.h0[0] == 2;
        if (this.f22618m0 == 0) {
            f10 = c1898e.f(3);
            f11 = c1898e.f(5);
            C1897d c1897d2 = this.f22531C;
            z2 = c1897d2 != null && c1897d2.h0[1] == 2;
        }
        if (this.f22615j0 != -1) {
            C1857f j = c1855d.j(this.f22617l0);
            c1855d.e(j, c1855d.j(f10), this.f22615j0, 6);
            if (z2) {
                c1855d.f(c1855d.j(f11), j, 0, 5);
                return;
            }
            return;
        }
        if (this.f22616k0 != -1) {
            C1857f j3 = c1855d.j(this.f22617l0);
            C1857f j10 = c1855d.j(f11);
            c1855d.e(j3, j10, -this.f22616k0, 6);
            if (z2) {
                c1855d.f(j3, c1855d.j(f10), 0, 5);
                c1855d.f(j10, j3, 0, 5);
                return;
            }
            return;
        }
        if (this.f22614i0 != -1.0f) {
            C1857f j11 = c1855d.j(this.f22617l0);
            C1857f j12 = c1855d.j(f10);
            C1857f j13 = c1855d.j(f11);
            float f12 = this.f22614i0;
            C1853b k3 = c1855d.k();
            C1852a c1852a = k3.f21953c;
            c1852a.g(j11, -1.0f);
            c1852a.g(j12, 1.0f - f12);
            c1852a.g(j13, f12);
            c1855d.c(k3);
        }
    }

    @Override // x.C1897d
    public final boolean b() {
        return true;
    }

    @Override // x.C1897d
    public final void c(int i3) {
        C1897d c1897d = this.f22531C;
        if (c1897d == null) {
            return;
        }
        int i10 = this.f22618m0;
        C1896c c1896c = this.f22581u;
        C1896c c1896c2 = this.f22579s;
        C1896c c1896c3 = this.f22582v;
        C1896c c1896c4 = this.f22580t;
        int[] iArr = c1897d.h0;
        C1896c c1896c5 = c1897d.f22579s;
        C1896c c1896c6 = c1897d.f22580t;
        if (i10 == 1) {
            c1896c4.f22520a.g(c1896c6.f22520a, 0);
            c1896c3.f22520a.g(c1896c6.f22520a, 0);
            int i11 = this.f22615j0;
            if (i11 != -1) {
                c1896c2.f22520a.g(c1896c5.f22520a, i11);
                c1896c.f22520a.g(c1896c5.f22520a, this.f22615j0);
                return;
            }
            int i12 = this.f22616k0;
            if (i12 != -1) {
                C1902i c1902i = c1896c2.f22520a;
                C1896c c1896c7 = c1897d.f22581u;
                c1902i.g(c1896c7.f22520a, -i12);
                c1896c.f22520a.g(c1896c7.f22520a, -this.f22616k0);
                return;
            }
            float f10 = this.f22614i0;
            if (f10 == -1.0f || iArr[0] != 1) {
                return;
            }
            int i13 = (int) (c1897d.f22532D * f10);
            c1896c2.f22520a.g(c1896c5.f22520a, i13);
            c1896c.f22520a.g(c1896c5.f22520a, i13);
            return;
        }
        c1896c2.f22520a.g(c1896c5.f22520a, 0);
        c1896c.f22520a.g(c1896c5.f22520a, 0);
        int i14 = this.f22615j0;
        if (i14 != -1) {
            c1896c4.f22520a.g(c1896c6.f22520a, i14);
            c1896c3.f22520a.g(c1896c6.f22520a, this.f22615j0);
            return;
        }
        int i15 = this.f22616k0;
        if (i15 != -1) {
            C1902i c1902i2 = c1896c4.f22520a;
            C1896c c1896c8 = c1897d.f22582v;
            c1902i2.g(c1896c8.f22520a, -i15);
            c1896c3.f22520a.g(c1896c8.f22520a, -this.f22616k0);
            return;
        }
        float f11 = this.f22614i0;
        if (f11 == -1.0f || iArr[1] != 1) {
            return;
        }
        int i16 = (int) (c1897d.f22533E * f11);
        c1896c4.f22520a.g(c1896c6.f22520a, i16);
        c1896c3.f22520a.g(c1896c6.f22520a, i16);
    }

    @Override // x.C1897d
    public final C1896c f(int i3) {
        switch (AbstractC1856e.c(i3)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f22618m0 == 1) {
                    return this.f22617l0;
                }
                break;
            case 2:
            case 4:
                if (this.f22618m0 == 0) {
                    return this.f22617l0;
                }
                break;
        }
        throw new AssertionError(AbstractC1482f.w(i3));
    }

    @Override // x.C1897d
    public final void z(C1855d c1855d) {
        if (this.f22531C == null) {
            return;
        }
        C1896c c1896c = this.f22617l0;
        c1855d.getClass();
        int m4 = C1855d.m(c1896c);
        if (this.f22618m0 == 1) {
            this.f22536H = m4;
            this.f22537I = 0;
            s(this.f22531C.g());
            x(0);
            return;
        }
        this.f22536H = 0;
        this.f22537I = m4;
        x(this.f22531C.k());
        s(0);
    }
}
