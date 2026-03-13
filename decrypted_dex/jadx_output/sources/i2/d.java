package i2;

import java.util.HashSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f14728a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f14728a.equals(((d) obj).f14728a);
    }

    public final int hashCode() {
        return this.f14728a.hashCode();
    }
}
