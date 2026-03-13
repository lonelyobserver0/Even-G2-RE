package y0;

import java.util.List;
import o0.AbstractC1416M;
import o0.C1414K;
import o0.C1415L;
import o0.C1427b;
import o0.C1443r;
import o0.C1447v;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import z0.C1985a;
import z0.C1987c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e extends AbstractC1416M {

    /* renamed from: b, reason: collision with root package name */
    public final long f23363b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23364c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23365d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23366e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23367f;

    /* renamed from: g, reason: collision with root package name */
    public final long f23368g;

    /* renamed from: h, reason: collision with root package name */
    public final long f23369h;

    /* renamed from: i, reason: collision with root package name */
    public final C1987c f23370i;
    public final C1447v j;

    /* renamed from: k, reason: collision with root package name */
    public final C1443r f23371k;

    public e(long j, long j3, long j10, int i3, long j11, long j12, long j13, C1987c c1987c, C1447v c1447v, C1443r c1443r) {
        AbstractC1550k.g(c1987c.f23649d == (c1443r != null));
        this.f23363b = j;
        this.f23364c = j3;
        this.f23365d = j10;
        this.f23366e = i3;
        this.f23367f = j11;
        this.f23368g = j12;
        this.f23369h = j13;
        this.f23370i = c1987c;
        this.j = c1447v;
        this.f23371k = c1443r;
    }

    @Override // o0.AbstractC1416M
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f23366e) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // o0.AbstractC1416M
    public final C1414K f(int i3, C1414K c1414k, boolean z2) {
        AbstractC1550k.e(i3, h());
        C1987c c1987c = this.f23370i;
        String str = z2 ? c1987c.b(i3).f23678a : null;
        Integer valueOf = z2 ? Integer.valueOf(this.f23366e + i3) : null;
        long d8 = c1987c.d(i3);
        long J10 = AbstractC1560u.J(c1987c.b(i3).f23679b - c1987c.b(0).f23679b) - this.f23367f;
        c1414k.getClass();
        c1414k.h(str, valueOf, 0, d8, J10, C1427b.f18123c, false);
        return c1414k;
    }

    @Override // o0.AbstractC1416M
    public final int h() {
        return this.f23370i.f23657m.size();
    }

    @Override // o0.AbstractC1416M
    public final Object l(int i3) {
        AbstractC1550k.e(i3, h());
        return Integer.valueOf(this.f23366e + i3);
    }

    @Override // o0.AbstractC1416M
    public final C1415L m(int i3, C1415L c1415l, long j) {
        boolean z2;
        long j3;
        long j10;
        h c10;
        long j11;
        AbstractC1550k.e(i3, 1);
        C1987c c1987c = this.f23370i;
        boolean z10 = c1987c.f23649d && c1987c.f23650e != -9223372036854775807L && c1987c.f23647b == -9223372036854775807L;
        long j12 = this.f23369h;
        if (z10) {
            long j13 = 0;
            if (j > 0) {
                j12 += j;
                if (j12 > this.f23368g) {
                    z2 = true;
                    j11 = -9223372036854775807L;
                    j3 = -9223372036854775807L;
                    Object obj = C1415L.f18049q;
                    c1415l.b(this.j, c1987c, this.f23363b, this.f23364c, this.f23365d, true, (c1987c.f23649d || c1987c.f23650e == j3 || c1987c.f23647b != j3) ? false : z2, this.f23371k, j11, this.f23368g, h() - 1, this.f23367f);
                    return c1415l;
                }
            }
            long j14 = this.f23367f + j12;
            long d8 = c1987c.d(0);
            int i10 = 0;
            while (i10 < c1987c.f23657m.size() - 1 && j14 >= d8) {
                j14 -= d8;
                i10++;
                d8 = c1987c.d(i10);
            }
            z0.h b2 = c1987c.b(i10);
            List list = b2.f23680c;
            z2 = true;
            int size = list.size();
            j3 = -9223372036854775807L;
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    j10 = j13;
                    i11 = -1;
                    break;
                }
                j10 = j13;
                if (((C1985a) list.get(i11)).f23637b == 2) {
                    break;
                }
                i11++;
                j13 = j10;
            }
            if (i11 != -1 && (c10 = ((z0.m) ((C1985a) b2.f23680c.get(i11)).f23638c.get(0)).c()) != null && c10.A(d8) != j10) {
                j12 = (c10.a(c10.p(j14, d8)) + j12) - j14;
            }
        } else {
            z2 = true;
            j3 = -9223372036854775807L;
        }
        j11 = j12;
        Object obj2 = C1415L.f18049q;
        if (c1987c.f23649d) {
        }
        c1415l.b(this.j, c1987c, this.f23363b, this.f23364c, this.f23365d, true, (c1987c.f23649d || c1987c.f23650e == j3 || c1987c.f23647b != j3) ? false : z2, this.f23371k, j11, this.f23368g, h() - 1, this.f23367f);
        return c1415l;
    }

    @Override // o0.AbstractC1416M
    public final int o() {
        return 1;
    }
}
