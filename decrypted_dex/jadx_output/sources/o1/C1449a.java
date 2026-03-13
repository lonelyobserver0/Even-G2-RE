package o1;

import T0.A;
import T0.B;
import T0.C;
import java.math.BigInteger;
import r0.AbstractC1560u;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1449a implements B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1450b f18308a;

    public C1449a(C1450b c1450b) {
        this.f18308a = c1450b;
    }

    @Override // T0.B
    public final boolean e() {
        return true;
    }

    @Override // T0.B
    public final A i(long j) {
        C1450b c1450b = this.f18308a;
        BigInteger valueOf = BigInteger.valueOf((c1450b.f18312d.f18348i * j) / 1000000);
        long j3 = c1450b.f18311c;
        long j10 = c1450b.f18310b;
        C c10 = new C(j, AbstractC1560u.j((valueOf.multiply(BigInteger.valueOf(j3 - j10)).divide(BigInteger.valueOf(c1450b.f18314f)).longValue() + j10) - 30000, c1450b.f18310b, j3 - 1));
        return new A(c10, c10);
    }

    @Override // T0.B
    public final long k() {
        return (this.f18308a.f18314f * 1000000) / r0.f18312d.f18348i;
    }
}
