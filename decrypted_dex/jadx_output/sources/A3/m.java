package A3;

import com.stub.StubApp;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m extends x {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f182a;

    public m(ArrayList arrayList) {
        this.f182a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        return this.f182a.equals(((m) ((x) obj)).f182a);
    }

    public final int hashCode() {
        return this.f182a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return StubApp.getString2(266) + this.f182a + StubApp.getString2(265);
    }
}
