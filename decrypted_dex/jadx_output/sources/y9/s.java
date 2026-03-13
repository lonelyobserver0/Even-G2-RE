package y9;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final double f23601a;

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return Double.compare(this.f23601a, ((s) obj).f23601a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f23601a);
    }

    public final String toString() {
        return StubApp.getString2(24713) + this.f23601a + ')';
    }
}
