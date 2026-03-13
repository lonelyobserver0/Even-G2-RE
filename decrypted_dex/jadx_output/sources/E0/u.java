package E0;

import android.text.TextUtils;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f1858a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1859b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1860c;

    public u(String str, boolean z2, boolean z10) {
        this.f1858a = str;
        this.f1859b = z2;
        this.f1860c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == u.class) {
            u uVar = (u) obj;
            if (TextUtils.equals(this.f1858a, uVar.f1858a) && this.f1859b == uVar.f1859b && this.f1860c == uVar.f1860c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((i2.u.d(31, 31, this.f1858a) + (this.f1859b ? 1231 : 1237)) * 31) + (this.f1860c ? 1231 : 1237);
    }
}
