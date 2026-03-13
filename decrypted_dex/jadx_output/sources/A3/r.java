package A3;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r extends E {

    /* renamed from: a, reason: collision with root package name */
    public final q f188a;

    public r(q qVar) {
        this.f188a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof E) {
            return this.f188a.equals(((r) ((E) obj)).f188a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f188a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return StubApp.getString2(274) + this.f188a + StubApp.getString2(265);
    }
}
