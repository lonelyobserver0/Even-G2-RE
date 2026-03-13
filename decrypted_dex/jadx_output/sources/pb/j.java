package pb;

import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Long f19784a;

    /* renamed from: b, reason: collision with root package name */
    public Long f19785b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f19784a.equals(jVar.f19784a) && this.f19785b.equals(jVar.f19785b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f19784a, this.f19785b);
    }
}
