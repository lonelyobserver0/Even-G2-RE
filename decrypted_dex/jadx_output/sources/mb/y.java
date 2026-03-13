package mb;

import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public z f17352a;

    /* renamed from: b, reason: collision with root package name */
    public x f17353b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f17352a.equals(yVar.f17352a) && Objects.equals(this.f17353b, yVar.f17353b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f17352a, this.f17353b);
    }
}
