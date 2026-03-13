package A1;

import T0.A;
import T0.B;
import T0.C;
import java.math.RoundingMode;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements B {

    /* renamed from: a, reason: collision with root package name */
    public final f f74a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75b;

    /* renamed from: c, reason: collision with root package name */
    public final long f76c;

    /* renamed from: d, reason: collision with root package name */
    public final long f77d;

    /* renamed from: e, reason: collision with root package name */
    public final long f78e;

    public h(f fVar, int i3, long j, long j3) {
        this.f74a = fVar;
        this.f75b = i3;
        this.f76c = j;
        long j10 = (j3 - j) / fVar.f69c;
        this.f77d = j10;
        this.f78e = b(j10);
    }

    public final long b(long j) {
        long j3 = j * this.f75b;
        long j10 = this.f74a.f68b;
        int i3 = AbstractC1560u.f20190a;
        return AbstractC1560u.R(j3, 1000000L, j10, RoundingMode.DOWN);
    }

    @Override // T0.B
    public final boolean e() {
        return true;
    }

    @Override // T0.B
    public final A i(long j) {
        f fVar = this.f74a;
        long j3 = this.f77d;
        long j10 = AbstractC1560u.j((fVar.f68b * j) / (this.f75b * 1000000), 0L, j3 - 1);
        long j11 = this.f76c;
        long b2 = b(j10);
        C c10 = new C(b2, (fVar.f69c * j10) + j11);
        if (b2 >= j || j10 == j3 - 1) {
            return new A(c10, c10);
        }
        long j12 = j10 + 1;
        return new A(c10, new C(b(j12), (fVar.f69c * j12) + j11));
    }

    @Override // T0.B
    public final long k() {
        return this.f78e;
    }
}
