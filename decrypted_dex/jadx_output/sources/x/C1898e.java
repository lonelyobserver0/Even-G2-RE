package x;

import java.util.ArrayList;
import java.util.Arrays;
import sa.C1608a;
import w.C1855d;
import w.C1857f;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1898e extends C1897d {

    /* renamed from: i0, reason: collision with root package name */
    public ArrayList f22587i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f22588j0;

    /* renamed from: k0, reason: collision with root package name */
    public C1855d f22589k0;

    /* renamed from: l0, reason: collision with root package name */
    public A1.f f22590l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f22591m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f22592n0;

    /* renamed from: o0, reason: collision with root package name */
    public C1895b[] f22593o0;

    /* renamed from: p0, reason: collision with root package name */
    public C1895b[] f22594p0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f22595q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f22596r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f22597s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f22598t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f22599u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f22600v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f22601w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f22602x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f22603y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f22604z0;

    public final void A(C1897d c1897d, int i3) {
        if (i3 == 0) {
            int i10 = this.f22591m0 + 1;
            C1895b[] c1895bArr = this.f22594p0;
            if (i10 >= c1895bArr.length) {
                this.f22594p0 = (C1895b[]) Arrays.copyOf(c1895bArr, c1895bArr.length * 2);
            }
            C1895b[] c1895bArr2 = this.f22594p0;
            int i11 = this.f22591m0;
            c1895bArr2[i11] = new C1895b(c1897d, 0, this.f22588j0);
            this.f22591m0 = i11 + 1;
            return;
        }
        if (i3 == 1) {
            int i12 = this.f22592n0 + 1;
            C1895b[] c1895bArr3 = this.f22593o0;
            if (i12 >= c1895bArr3.length) {
                this.f22593o0 = (C1895b[]) Arrays.copyOf(c1895bArr3, c1895bArr3.length * 2);
            }
            C1895b[] c1895bArr4 = this.f22593o0;
            int i13 = this.f22592n0;
            c1895bArr4[i13] = new C1895b(c1897d, 1, this.f22588j0);
            this.f22592n0 = i13 + 1;
        }
    }

    public final void B(C1855d c1855d) {
        a(c1855d);
        int size = this.f22587i0.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1897d c1897d = (C1897d) this.f22587i0.get(i3);
            if (c1897d instanceof C1898e) {
                int[] iArr = c1897d.h0;
                int i10 = iArr[0];
                int i11 = iArr[1];
                if (i10 == 2) {
                    c1897d.t(1);
                }
                if (i11 == 2) {
                    c1897d.w(1);
                }
                c1897d.a(c1855d);
                if (i10 == 2) {
                    c1897d.t(i10);
                }
                if (i11 == 2) {
                    c1897d.w(i11);
                }
            } else {
                int[] iArr2 = this.h0;
                if (iArr2[0] != 2 && c1897d.h0[0] == 4) {
                    C1896c c1896c = c1897d.f22579s;
                    int i12 = c1896c.f22524e;
                    int k3 = k();
                    C1896c c1896c2 = c1897d.f22581u;
                    int i13 = k3 - c1896c2.f22524e;
                    c1896c.f22528i = c1855d.j(c1896c);
                    c1896c2.f22528i = c1855d.j(c1896c2);
                    c1855d.d(c1896c.f22528i, i12);
                    c1855d.d(c1896c2.f22528i, i13);
                    c1897d.f22555a = 2;
                    c1897d.f22536H = i12;
                    int i14 = i13 - i12;
                    c1897d.f22532D = i14;
                    int i15 = c1897d.f22545Q;
                    if (i14 < i15) {
                        c1897d.f22532D = i15;
                    }
                }
                if (iArr2[1] != 2 && c1897d.h0[1] == 4) {
                    C1896c c1896c3 = c1897d.f22580t;
                    int i16 = c1896c3.f22524e;
                    int g10 = g();
                    C1896c c1896c4 = c1897d.f22582v;
                    int i17 = g10 - c1896c4.f22524e;
                    c1896c3.f22528i = c1855d.j(c1896c3);
                    c1896c4.f22528i = c1855d.j(c1896c4);
                    c1855d.d(c1896c3.f22528i, i16);
                    c1855d.d(c1896c4.f22528i, i17);
                    if (c1897d.f22544P > 0 || c1897d.f22552X == 8) {
                        C1896c c1896c5 = c1897d.f22583w;
                        C1857f j = c1855d.j(c1896c5);
                        c1896c5.f22528i = j;
                        c1855d.d(j, c1897d.f22544P + i16);
                    }
                    c1897d.f22557b = 2;
                    c1897d.v(i16, i17);
                }
                c1897d.a(c1855d);
            }
        }
        if (this.f22591m0 > 0) {
            AbstractC1901h.a(this, c1855d, 0);
        }
        if (this.f22592n0 > 0) {
            AbstractC1901h.a(this, c1855d, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0300  */
    /* JADX WARN: Type inference failed for: r0v10, types: [x.d] */
    /* JADX WARN: Type inference failed for: r3v2, types: [x.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() {
        /*
            Method dump skipped, instructions count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1898e.C():void");
    }

    public final boolean D(int i3) {
        return (this.f22601w0 & i3) == i3;
    }

    public final void E() {
        C1902i c1902i = f(2).f22520a;
        C1902i c1902i2 = f(3).f22520a;
        c1902i.k(null, 0.0f);
        c1902i2.k(null, 0.0f);
    }

    @Override // x.C1897d
    public final void c(int i3) {
        super.c(i3);
        int size = this.f22587i0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C1897d) this.f22587i0.get(i10)).c(i3);
        }
    }

    @Override // x.C1897d
    public final void o() {
        this.f22589k0.q();
        this.f22595q0.clear();
        this.f22602x0 = false;
        this.f22587i0.clear();
        super.o();
    }

    @Override // x.C1897d
    public final void q(C1608a c1608a) {
        super.q(c1608a);
        int size = this.f22587i0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C1897d) this.f22587i0.get(i3)).q(c1608a);
        }
    }

    @Override // x.C1897d
    public final void u(int i3, int i10) {
        this.f22542N = i3;
        this.f22543O = i10;
        int size = this.f22587i0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((C1897d) this.f22587i0.get(i11)).u(this.f22536H + this.f22542N, this.f22537I + this.f22543O);
        }
    }

    @Override // x.C1897d
    public final void y() {
        super.y();
        ArrayList arrayList = this.f22587i0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1897d c1897d = (C1897d) this.f22587i0.get(i3);
            c1897d.u(this.f22540L + this.f22542N, this.f22541M + this.f22543O);
            if (!(c1897d instanceof C1898e)) {
                c1897d.y();
            }
        }
    }
}
