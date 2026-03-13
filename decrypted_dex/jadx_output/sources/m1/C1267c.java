package m1;

import T0.A;
import T0.C;
import android.util.Pair;
import r0.AbstractC1560u;

/* renamed from: m1.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1267c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f17016a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f17017b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17018c;

    public C1267c(long j, long[] jArr, long[] jArr2) {
        this.f17016a = jArr;
        this.f17017b = jArr2;
        this.f17018c = j == -9223372036854775807L ? AbstractC1560u.J(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair b(long j, long[] jArr, long[] jArr2) {
        int e10 = AbstractC1560u.e(jArr, j, true);
        long j3 = jArr[e10];
        long j10 = jArr2[e10];
        int i3 = e10 + 1;
        if (i3 == jArr.length) {
            return Pair.create(Long.valueOf(j3), Long.valueOf(j10));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i3] == j3 ? 0.0d : (j - j3) / (r6 - j3)) * (jArr2[i3] - j10))) + j10));
    }

    @Override // m1.f
    public final long a(long j) {
        return AbstractC1560u.J(((Long) b(j, this.f17016a, this.f17017b).second).longValue());
    }

    @Override // m1.f
    public final long d() {
        return -1L;
    }

    @Override // T0.B
    public final boolean e() {
        return true;
    }

    @Override // T0.B
    public final A i(long j) {
        Pair b2 = b(AbstractC1560u.V(AbstractC1560u.j(j, 0L, this.f17018c)), this.f17017b, this.f17016a);
        C c10 = new C(AbstractC1560u.J(((Long) b2.first).longValue()), ((Long) b2.second).longValue());
        return new A(c10, c10);
    }

    @Override // m1.f
    public final int j() {
        return -2147483647;
    }

    @Override // T0.B
    public final long k() {
        return this.f17018c;
    }
}
