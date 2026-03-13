package z0;

import java.math.RoundingMode;
import java.util.List;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class n extends s {

    /* renamed from: d, reason: collision with root package name */
    public final long f23699d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23700e;

    /* renamed from: f, reason: collision with root package name */
    public final List f23701f;

    /* renamed from: g, reason: collision with root package name */
    public final long f23702g;

    /* renamed from: h, reason: collision with root package name */
    public final long f23703h;

    /* renamed from: i, reason: collision with root package name */
    public final long f23704i;

    public n(j jVar, long j, long j3, long j10, long j11, List list, long j12, long j13, long j14) {
        super(jVar, j, j3);
        this.f23699d = j10;
        this.f23700e = j11;
        this.f23701f = list;
        this.f23704i = j12;
        this.f23702g = j13;
        this.f23703h = j14;
    }

    public final long b(long j, long j3) {
        long d8 = d(j);
        return d8 != -1 ? d8 : (int) (f((j3 - this.f23703h) + this.f23704i, j) - c(j, j3));
    }

    public final long c(long j, long j3) {
        long d8 = d(j);
        long j10 = this.f23699d;
        if (d8 == -1) {
            long j11 = this.f23702g;
            if (j11 != -9223372036854775807L) {
                return Math.max(j10, f((j3 - this.f23703h) - j11, j));
            }
        }
        return j10;
    }

    public abstract long d(long j);

    public final long e(long j, long j3) {
        long j10 = this.f23712b;
        long j11 = this.f23699d;
        List list = this.f23701f;
        if (list != null) {
            return (((q) list.get((int) (j - j11))).f23708b * 1000000) / j10;
        }
        long d8 = d(j3);
        return (d8 == -1 || j != (j11 + d8) - 1) ? (this.f23700e * 1000000) / j10 : j3 - g(j);
    }

    public final long f(long j, long j3) {
        long d8 = d(j3);
        long j10 = this.f23699d;
        if (d8 != 0) {
            if (this.f23701f != null) {
                long j11 = (d8 + j10) - 1;
                long j12 = j10;
                while (j12 <= j11) {
                    long j13 = ((j11 - j12) / 2) + j12;
                    long g10 = g(j13);
                    if (g10 < j) {
                        j12 = j13 + 1;
                    } else {
                        if (g10 <= j) {
                            return j13;
                        }
                        j11 = j13 - 1;
                    }
                }
                return j12 == j10 ? j12 : j11;
            }
            long j14 = (j / ((this.f23700e * 1000000) / this.f23712b)) + j10;
            if (j14 >= j10) {
                return d8 == -1 ? j14 : Math.min(j14, (j10 + d8) - 1);
            }
        }
        return j10;
    }

    public final long g(long j) {
        long j3 = this.f23699d;
        List list = this.f23701f;
        long j10 = list != null ? ((q) list.get((int) (j - j3))).f23707a - this.f23713c : (j - j3) * this.f23700e;
        int i3 = AbstractC1560u.f20190a;
        return AbstractC1560u.R(j10, 1000000L, this.f23712b, RoundingMode.DOWN);
    }

    public abstract j h(k kVar, long j);

    public boolean i() {
        return this.f23701f != null;
    }
}
