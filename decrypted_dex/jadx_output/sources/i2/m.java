package i2;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final g f14744a;

    public m(g gVar) {
        this.f14744a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return this.f14744a.equals(((m) obj).f14744a);
    }

    public final int hashCode() {
        return this.f14744a.hashCode() + (m.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(18475) + this.f14744a + '}';
    }
}
