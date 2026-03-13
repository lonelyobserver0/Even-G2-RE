package mb;

import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public String f17324a;

    /* renamed from: b, reason: collision with root package name */
    public String f17325b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f17324a.equals(jVar.f17324a) && Objects.equals(this.f17325b, jVar.f17325b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f17324a, this.f17325b);
    }
}
