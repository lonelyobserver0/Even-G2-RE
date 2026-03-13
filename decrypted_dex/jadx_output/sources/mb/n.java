package mb;

import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f17334a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f17335b;

    /* renamed from: c, reason: collision with root package name */
    public Long f17336c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f17334a.equals(nVar.f17334a) && this.f17335b.equals(nVar.f17335b) && Objects.equals(this.f17336c, nVar.f17336c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f17334a, this.f17335b, this.f17336c);
    }
}
