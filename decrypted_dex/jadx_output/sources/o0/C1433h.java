package o0;

import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: o0.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1433h {

    /* renamed from: a, reason: collision with root package name */
    public final int f18143a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18144b;

    static {
        Z9.n nVar = new Z9.n(4);
        AbstractC1550k.c(nVar.f9136b <= nVar.f9137c);
        new C1433h(nVar);
        AbstractC1560u.E(0);
        AbstractC1560u.E(1);
        AbstractC1560u.E(2);
        AbstractC1560u.E(3);
    }

    public C1433h(Z9.n nVar) {
        nVar.getClass();
        this.f18143a = nVar.f9136b;
        this.f18144b = nVar.f9137c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1433h)) {
            return false;
        }
        C1433h c1433h = (C1433h) obj;
        c1433h.getClass();
        if (this.f18143a != c1433h.f18143a || this.f18144b != c1433h.f18144b) {
            return false;
        }
        int i3 = AbstractC1560u.f20190a;
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f18143a) * 31) + this.f18144b) * 31;
    }
}
