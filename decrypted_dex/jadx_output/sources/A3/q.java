package A3;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q extends D {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f187a;

    public q(Integer num) {
        this.f187a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        Integer num = this.f187a;
        q qVar = (q) ((D) obj);
        return num == null ? qVar.f187a == null : num.equals(qVar.f187a);
    }

    public final int hashCode() {
        Integer num = this.f187a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return StubApp.getString2(273) + this.f187a + StubApp.getString2(265);
    }
}
