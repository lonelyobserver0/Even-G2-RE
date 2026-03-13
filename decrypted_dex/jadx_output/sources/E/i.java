package E;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f1711a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f1712b;

    public i(Resources resources, Resources.Theme theme) {
        this.f1711a = resources;
        this.f1712b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f1711a.equals(iVar.f1711a) && Objects.equals(this.f1712b, iVar.f1712b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1711a, this.f1712b);
    }
}
