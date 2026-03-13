package f5;

import com.stub.StubApp;
import java.util.List;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class G extends t0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f13843a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13844b;

    public G(List list, String str) {
        this.f13843a = list;
        this.f13844b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            if (this.f13843a.equals(((G) t0Var).f13843a) && ((str = this.f13844b) != null ? str.equals(((G) t0Var).f13844b) : ((G) t0Var).f13844b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f13843a.hashCode() ^ 1000003) * 1000003;
        String str = this.f13844b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17543));
        sb2.append(this.f13843a);
        sb2.append(StubApp.getString2(17544));
        return AbstractC1482f.k(sb2, this.f13844b, StubApp.getString2(265));
    }
}
