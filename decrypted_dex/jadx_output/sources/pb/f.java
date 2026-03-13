package pb;

import java.util.Map;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public String f19776a;

    /* renamed from: b, reason: collision with root package name */
    public h f19777b;

    /* renamed from: c, reason: collision with root package name */
    public Map f19778c;

    /* renamed from: d, reason: collision with root package name */
    public String f19779d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f19776a.equals(fVar.f19776a) && Objects.equals(this.f19777b, fVar.f19777b) && this.f19778c.equals(fVar.f19778c) && Objects.equals(this.f19779d, fVar.f19779d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f19776a, this.f19777b, this.f19778c, this.f19779d);
    }
}
