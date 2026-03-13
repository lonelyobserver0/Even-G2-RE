package G6;

import java.io.Serializable;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f2388a;

    public a(List list) {
        if (list == null) {
            throw new NullPointerException("Null responses");
        }
        this.f2388a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f2388a.equals(((a) obj).f2388a);
    }

    public final int hashCode() {
        return this.f2388a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return E1.a.l("}", new StringBuilder("V6BatchResponse{responses="), this.f2388a);
    }
}
