package V0;

import T0.A;
import T0.C;
import T0.H;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final H f7696a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7697b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7698c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7699d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7700e;

    /* renamed from: f, reason: collision with root package name */
    public int f7701f;

    /* renamed from: g, reason: collision with root package name */
    public int f7702g;

    /* renamed from: h, reason: collision with root package name */
    public int f7703h;

    /* renamed from: i, reason: collision with root package name */
    public int f7704i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f7705k;

    /* renamed from: l, reason: collision with root package name */
    public long[] f7706l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f7707m;

    public e(int i3, int i10, long j, int i11, H h2) {
        boolean z2 = true;
        if (i10 != 1 && i10 != 2) {
            z2 = false;
        }
        AbstractC1550k.c(z2);
        this.f7699d = j;
        this.f7700e = i11;
        this.f7696a = h2;
        int i12 = (((i3 % 10) + 48) << 8) | ((i3 / 10) + 48);
        this.f7697b = (i10 == 2 ? 1667497984 : 1651965952) | i12;
        this.f7698c = i10 == 2 ? i12 | 1650720768 : -1;
        this.f7705k = -1L;
        this.f7706l = new long[512];
        this.f7707m = new int[512];
    }

    public final C a(int i3) {
        return new C(((this.f7699d * 1) / this.f7700e) * this.f7707m[i3], this.f7706l[i3]);
    }

    public final A b(long j) {
        if (this.j == 0) {
            C c10 = new C(0L, this.f7705k);
            return new A(c10, c10);
        }
        int i3 = (int) (j / ((this.f7699d * 1) / this.f7700e));
        int d8 = AbstractC1560u.d(this.f7707m, i3, true, true);
        if (this.f7707m[d8] == i3) {
            C a3 = a(d8);
            return new A(a3, a3);
        }
        C a9 = a(d8);
        int i10 = d8 + 1;
        return i10 < this.f7706l.length ? new A(a9, a(i10)) : new A(a9, a9);
    }
}
