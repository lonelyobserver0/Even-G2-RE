package L0;

import o0.AbstractC1416M;
import o0.C1414K;
import o0.C1415L;
import o0.C1427b;
import r0.AbstractC1560u;

/* renamed from: L0.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0109e extends r {

    /* renamed from: c, reason: collision with root package name */
    public final long f4071c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4072d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4073e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4074f;

    public C0109e(AbstractC1416M abstractC1416M, long j, long j3) {
        super(abstractC1416M);
        boolean z2 = false;
        if (abstractC1416M.h() != 1) {
            throw new C0110f(0);
        }
        C1415L m4 = abstractC1416M.m(0, new C1415L(), 0L);
        long max = Math.max(0L, j);
        if (!m4.f18060k && max != 0 && !m4.f18058h) {
            throw new C0110f(1);
        }
        long max2 = j3 == Long.MIN_VALUE ? m4.f18062m : Math.max(0L, j3);
        long j10 = m4.f18062m;
        if (j10 != -9223372036854775807L) {
            max2 = max2 > j10 ? j10 : max2;
            if (max > max2) {
                throw new C0110f(max, 2, max2);
            }
        }
        this.f4071c = max;
        this.f4072d = max2;
        this.f4073e = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
        if (m4.f18059i && (max2 == -9223372036854775807L || (j10 != -9223372036854775807L && max2 == j10))) {
            z2 = true;
        }
        this.f4074f = z2;
    }

    @Override // L0.r, o0.AbstractC1416M
    public final C1414K f(int i3, C1414K c1414k, boolean z2) {
        this.f4123b.f(0, c1414k, z2);
        long j = c1414k.f18046e - this.f4071c;
        long j3 = this.f4073e;
        c1414k.h(c1414k.f18042a, c1414k.f18043b, 0, j3 != -9223372036854775807L ? j3 - j : -9223372036854775807L, j, C1427b.f18123c, false);
        return c1414k;
    }

    @Override // L0.r, o0.AbstractC1416M
    public final C1415L m(int i3, C1415L c1415l, long j) {
        this.f4123b.m(0, c1415l, 0L);
        long j3 = c1415l.f18065p;
        long j10 = this.f4071c;
        c1415l.f18065p = j3 + j10;
        c1415l.f18062m = this.f4073e;
        c1415l.f18059i = this.f4074f;
        long j11 = c1415l.f18061l;
        if (j11 != -9223372036854775807L) {
            long max = Math.max(j11, j10);
            c1415l.f18061l = max;
            long j12 = this.f4072d;
            if (j12 != -9223372036854775807L) {
                max = Math.min(max, j12);
            }
            c1415l.f18061l = max - j10;
        }
        long V10 = AbstractC1560u.V(j10);
        long j13 = c1415l.f18055e;
        if (j13 != -9223372036854775807L) {
            c1415l.f18055e = j13 + V10;
        }
        long j14 = c1415l.f18056f;
        if (j14 != -9223372036854775807L) {
            c1415l.f18056f = j14 + V10;
        }
        return c1415l;
    }
}
