package m1;

import T0.A;
import T0.C;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f17043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17044b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17045c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17046d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17047e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17048f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f17049g;

    public h(long j, int i3, long j3, int i10, long j10, long[] jArr) {
        this.f17043a = j;
        this.f17044b = i3;
        this.f17045c = j3;
        this.f17046d = i10;
        this.f17047e = j10;
        this.f17049g = jArr;
        this.f17048f = j10 != -1 ? j + j10 : -1L;
    }

    @Override // m1.f
    public final long a(long j) {
        long j3 = j - this.f17043a;
        if (!e() || j3 <= this.f17044b) {
            return 0L;
        }
        long[] jArr = this.f17049g;
        AbstractC1550k.h(jArr);
        double d8 = (j3 * 256.0d) / this.f17047e;
        int e10 = AbstractC1560u.e(jArr, (long) d8, true);
        long j10 = this.f17045c;
        long j11 = (e10 * j10) / 100;
        long j12 = jArr[e10];
        int i3 = e10 + 1;
        long j13 = (j10 * i3) / 100;
        return Math.round((j12 == (e10 == 99 ? 256L : jArr[i3]) ? 0.0d : (d8 - j12) / (r0 - j12)) * (j13 - j11)) + j11;
    }

    @Override // m1.f
    public final long d() {
        return this.f17048f;
    }

    @Override // T0.B
    public final boolean e() {
        return this.f17049g != null;
    }

    @Override // T0.B
    public final A i(long j) {
        double d8;
        double d10;
        boolean e10 = e();
        int i3 = this.f17044b;
        long j3 = this.f17043a;
        if (!e10) {
            C c10 = new C(0L, j3 + i3);
            return new A(c10, c10);
        }
        long j10 = AbstractC1560u.j(j, 0L, this.f17045c);
        double d11 = (j10 * 100.0d) / this.f17045c;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d8 = 256.0d;
        } else if (d11 >= 100.0d) {
            d8 = 256.0d;
            d12 = 256.0d;
        } else {
            int i10 = (int) d11;
            long[] jArr = this.f17049g;
            AbstractC1550k.h(jArr);
            double d13 = jArr[i10];
            if (i10 == 99) {
                d8 = 256.0d;
                d10 = 256.0d;
            } else {
                d8 = 256.0d;
                d10 = jArr[i10 + 1];
            }
            d12 = ((d10 - d13) * (d11 - i10)) + d13;
        }
        long j11 = this.f17047e;
        C c11 = new C(j10, j3 + AbstractC1560u.j(Math.round((d12 / d8) * j11), i3, j11 - 1));
        return new A(c11, c11);
    }

    @Override // m1.f
    public final int j() {
        return this.f17046d;
    }

    @Override // T0.B
    public final long k() {
        return this.f17045c;
    }
}
