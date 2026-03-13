package mb;

import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public l f17326a;

    /* renamed from: b, reason: collision with root package name */
    public j f17327b;

    /* renamed from: c, reason: collision with root package name */
    public List f17328c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f17326a.equals(kVar.f17326a) && Objects.equals(this.f17327b, kVar.f17327b) && this.f17328c.equals(kVar.f17328c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f17326a, this.f17327b, this.f17328c);
    }
}
