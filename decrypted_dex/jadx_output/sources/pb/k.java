package pb;

import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Long f19786a;

    /* renamed from: b, reason: collision with root package name */
    public Long f19787b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f19786a.equals(kVar.f19786a) && this.f19787b.equals(kVar.f19787b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f19786a, this.f19787b);
    }
}
