package i2;

import android.net.Uri;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f14726a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14727b;

    public c(boolean z2, Uri uri) {
        this.f14726a = uri;
        this.f14727b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f14727b == cVar.f14727b && this.f14726a.equals(cVar.f14726a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f14726a.hashCode() * 31) + (this.f14727b ? 1 : 0);
    }
}
