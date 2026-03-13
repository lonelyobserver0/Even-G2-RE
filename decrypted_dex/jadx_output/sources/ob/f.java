package ob;

import java.util.Map;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f18648a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f18649b;

    /* renamed from: c, reason: collision with root package name */
    public Map f18650c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f18648a.equals(fVar.f18648a) && this.f18649b.equals(fVar.f18649b) && this.f18650c.equals(fVar.f18650c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f18648a, this.f18649b, this.f18650c);
    }
}
