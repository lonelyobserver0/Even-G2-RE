package o0;

import M4.Z;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import r0.AbstractC1560u;

/* renamed from: o0.v, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1447v {

    /* renamed from: a, reason: collision with root package name */
    public final String f18248a;

    /* renamed from: b, reason: collision with root package name */
    public final C1444s f18249b;

    /* renamed from: c, reason: collision with root package name */
    public final C1443r f18250c;

    /* renamed from: d, reason: collision with root package name */
    public final y f18251d;

    /* renamed from: e, reason: collision with root package name */
    public final C1441p f18252e;

    /* renamed from: f, reason: collision with root package name */
    public final C1445t f18253f;

    static {
        T0.s sVar = new T0.s();
        M4.G g10 = M4.I.f4549b;
        Z z2 = Z.f4578e;
        List list = Collections.EMPTY_LIST;
        Z z10 = Z.f4578e;
        C1442q c1442q = new C1442q();
        C1445t c1445t = C1445t.f18247a;
        sVar.a();
        c1442q.a();
        y yVar = y.f18281B;
        i2.u.A(0, 1, 2, 3, 4);
        AbstractC1560u.E(5);
    }

    public C1447v(String str, C1441p c1441p, C1444s c1444s, C1443r c1443r, y yVar, C1445t c1445t) {
        this.f18248a = str;
        this.f18249b = c1444s;
        this.f18250c = c1443r;
        this.f18251d = yVar;
        this.f18252e = c1441p;
        this.f18253f = c1445t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1447v)) {
            return false;
        }
        C1447v c1447v = (C1447v) obj;
        String str = c1447v.f18248a;
        int i3 = AbstractC1560u.f20190a;
        return Objects.equals(this.f18248a, str) && this.f18252e.equals(c1447v.f18252e) && Objects.equals(this.f18249b, c1447v.f18249b) && this.f18250c.equals(c1447v.f18250c) && Objects.equals(this.f18251d, c1447v.f18251d) && Objects.equals(this.f18253f, c1447v.f18253f);
    }

    public final int hashCode() {
        int hashCode = this.f18248a.hashCode() * 31;
        C1444s c1444s = this.f18249b;
        int hashCode2 = (this.f18251d.hashCode() + ((this.f18252e.hashCode() + ((this.f18250c.hashCode() + ((hashCode + (c1444s != null ? c1444s.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f18253f.getClass();
        return hashCode2;
    }
}
