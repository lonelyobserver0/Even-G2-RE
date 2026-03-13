package o0;

import android.net.Uri;
import java.util.List;
import java.util.Objects;
import r0.AbstractC1560u;

/* renamed from: o0.s, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1444s {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f18242a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18243b;

    /* renamed from: c, reason: collision with root package name */
    public final List f18244c;

    /* renamed from: d, reason: collision with root package name */
    public final M4.I f18245d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18246e;

    static {
        i2.u.A(0, 1, 2, 3, 4);
        AbstractC1560u.E(5);
        AbstractC1560u.E(6);
        AbstractC1560u.E(7);
    }

    public C1444s(Uri uri, String str, Ec.d dVar, List list, M4.I i3, long j) {
        this.f18242a = uri;
        this.f18243b = AbstractC1405B.m(str);
        this.f18244c = list;
        this.f18245d = i3;
        M4.F l9 = M4.I.l();
        for (int i10 = 0; i10 < i3.size(); i10++) {
            ((C1446u) i3.get(i10)).getClass();
            l9.a(new C1446u());
        }
        l9.g();
        this.f18246e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1444s)) {
            return false;
        }
        C1444s c1444s = (C1444s) obj;
        return this.f18242a.equals(c1444s.f18242a) && Objects.equals(this.f18243b, c1444s.f18243b) && Objects.equals(null, null) && this.f18244c.equals(c1444s.f18244c) && this.f18245d.equals(c1444s.f18245d) && Long.valueOf(this.f18246e).equals(Long.valueOf(c1444s.f18246e));
    }

    public final int hashCode() {
        int hashCode = this.f18242a.hashCode() * 31;
        return (int) (((this.f18245d.hashCode() + ((this.f18244c.hashCode() + ((hashCode + (this.f18243b == null ? 0 : r1.hashCode())) * 29791)) * 961)) * 31 * 31) + this.f18246e);
    }
}
