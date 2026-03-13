package A3;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o extends B {

    /* renamed from: a, reason: collision with root package name */
    public final r f184a;

    public o(r rVar) {
        A a3 = A.f116a;
        this.f184a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b2 = (B) obj;
        if (!this.f184a.equals(((o) b2).f184a)) {
            return false;
        }
        Object obj2 = A.f116a;
        ((o) b2).getClass();
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f184a.hashCode() ^ 1000003) * 1000003) ^ A.f116a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(269) + this.f184a + StubApp.getString2(270) + A.f116a + StubApp.getString2(265);
    }
}
