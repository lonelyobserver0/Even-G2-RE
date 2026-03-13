package K;

import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f3539a;

    /* renamed from: b, reason: collision with root package name */
    public String f3540b;

    /* renamed from: c, reason: collision with root package name */
    public List f3541c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f3539a, bVar.f3539a) && Objects.equals(this.f3540b, bVar.f3540b) && Objects.equals(this.f3541c, bVar.f3541c);
    }

    public final int hashCode() {
        return Objects.hash(this.f3539a, this.f3540b, this.f3541c);
    }
}
