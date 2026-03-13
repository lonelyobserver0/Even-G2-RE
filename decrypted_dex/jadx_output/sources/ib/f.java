package ib;

import java.util.Map;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public String f14994a;

    /* renamed from: b, reason: collision with root package name */
    public e f14995b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f14996c;

    /* renamed from: d, reason: collision with root package name */
    public Map f14997d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f14994a.equals(fVar.f14994a) && this.f14995b.equals(fVar.f14995b) && Objects.equals(this.f14996c, fVar.f14996c) && this.f14997d.equals(fVar.f14997d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14994a, this.f14995b, this.f14996c, this.f14997d);
    }
}
