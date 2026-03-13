package T0;

import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class y implements B {

    /* renamed from: a, reason: collision with root package name */
    public final E0.x f7073a;

    /* renamed from: b, reason: collision with root package name */
    public final E0.x f7074b;

    /* renamed from: c, reason: collision with root package name */
    public long f7075c;

    public y(long j, long[] jArr, long[] jArr2) {
        AbstractC1550k.c(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f7073a = new E0.x(length);
            this.f7074b = new E0.x(length);
        } else {
            int i3 = length + 1;
            E0.x xVar = new E0.x(i3);
            this.f7073a = xVar;
            E0.x xVar2 = new E0.x(i3);
            this.f7074b = xVar2;
            xVar.c(0L);
            xVar2.c(0L);
        }
        this.f7073a.d(jArr);
        this.f7074b.d(jArr2);
        this.f7075c = j;
    }

    @Override // T0.B
    public final boolean e() {
        return this.f7074b.f1861a > 0;
    }

    @Override // T0.B
    public final A i(long j) {
        E0.x xVar = this.f7074b;
        if (xVar.f1861a == 0) {
            C c10 = C.f6927c;
            return new A(c10, c10);
        }
        int b2 = AbstractC1560u.b(xVar, j);
        long f10 = xVar.f(b2);
        E0.x xVar2 = this.f7073a;
        C c11 = new C(f10, xVar2.f(b2));
        if (f10 == j || b2 == xVar.f1861a - 1) {
            return new A(c11, c11);
        }
        int i3 = b2 + 1;
        return new A(c11, new C(xVar.f(i3), xVar2.f(i3)));
    }

    @Override // T0.B
    public final long k() {
        return this.f7075c;
    }
}
