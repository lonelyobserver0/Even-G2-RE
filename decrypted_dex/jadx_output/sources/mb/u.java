package mb;

import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public t f17348a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        return this.f17348a.equals(((u) obj).f17348a);
    }

    public final int hashCode() {
        return Objects.hash(this.f17348a);
    }
}
