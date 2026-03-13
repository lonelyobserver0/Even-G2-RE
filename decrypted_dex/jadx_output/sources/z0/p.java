package z0;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import o0.C1438m;
import sa.C1608a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p extends n {
    public final C1608a j;

    /* renamed from: k, reason: collision with root package name */
    public final C1608a f23705k;

    /* renamed from: l, reason: collision with root package name */
    public final long f23706l;

    public p(j jVar, long j, long j3, long j10, long j11, long j12, List list, long j13, C1608a c1608a, C1608a c1608a2, long j14, long j15) {
        super(jVar, j, j3, j10, j12, list, j13, j14, j15);
        this.j = c1608a;
        this.f23705k = c1608a2;
        this.f23706l = j11;
    }

    @Override // z0.s
    public final j a(m mVar) {
        C1608a c1608a = this.j;
        if (c1608a == null) {
            return this.f23711a;
        }
        C1438m c1438m = mVar.f23694a;
        return new j(0L, c1608a.h(0L, c1438m.f18204a, 0L, c1438m.j), -1L);
    }

    @Override // z0.n
    public final long d(long j) {
        if (this.f23701f != null) {
            return r0.size();
        }
        long j3 = this.f23706l;
        if (j3 != -1) {
            return (j3 - this.f23699d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f23712b));
        BigInteger multiply2 = BigInteger.valueOf(this.f23700e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i3 = O4.a.f5204a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // z0.n
    public final j h(k kVar, long j) {
        long j3 = this.f23699d;
        List list = this.f23701f;
        long j10 = list != null ? ((q) list.get((int) (j - j3))).f23707a : (j - j3) * this.f23700e;
        C1438m c1438m = kVar.f23694a;
        return new j(0L, this.f23705k.h(j, c1438m.f18204a, j10, c1438m.j), -1L);
    }
}
