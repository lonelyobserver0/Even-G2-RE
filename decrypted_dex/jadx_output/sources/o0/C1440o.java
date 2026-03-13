package o0;

import r0.AbstractC1560u;

/* renamed from: o0.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1440o {

    /* renamed from: a, reason: collision with root package name */
    public final long f18231a;

    static {
        new C1440o(new T0.s());
        AbstractC1560u.E(0);
        AbstractC1560u.E(1);
        AbstractC1560u.E(2);
        AbstractC1560u.E(3);
        AbstractC1560u.E(4);
        AbstractC1560u.E(5);
        AbstractC1560u.E(6);
    }

    public C1440o(T0.s sVar) {
        sVar.getClass();
        int i3 = AbstractC1560u.f20190a;
        this.f18231a = sVar.f7043a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1440o)) {
            return false;
        }
        C1440o c1440o = (C1440o) obj;
        c1440o.getClass();
        return this.f18231a == c1440o.f18231a;
    }

    public final int hashCode() {
        long j = this.f18231a;
        return ((((int) 0) * 31) + ((int) (j ^ (j >>> 32)))) * 29791;
    }
}
