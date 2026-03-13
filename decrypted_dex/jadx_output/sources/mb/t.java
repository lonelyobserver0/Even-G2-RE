package mb;

import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public Double f17345a;

    /* renamed from: b, reason: collision with root package name */
    public Double f17346b;

    /* renamed from: c, reason: collision with root package name */
    public Long f17347c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (Objects.equals(this.f17345a, tVar.f17345a) && Objects.equals(this.f17346b, tVar.f17346b) && this.f17347c.equals(tVar.f17347c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f17345a, this.f17346b, this.f17347c);
    }
}
