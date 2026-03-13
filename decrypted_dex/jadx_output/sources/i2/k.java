package i2;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k extends n {

    /* renamed from: a, reason: collision with root package name */
    public final g f14743a = g.f14736c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return this.f14743a.equals(((k) obj).f14743a);
    }

    public final int hashCode() {
        return this.f14743a.hashCode() + (k.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(18473) + this.f14743a + '}';
    }
}
