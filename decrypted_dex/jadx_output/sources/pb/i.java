package pb;

import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public Long f19783a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return this.f19783a.equals(((i) obj).f19783a);
    }

    public final int hashCode() {
        return Objects.hash(this.f19783a);
    }
}
