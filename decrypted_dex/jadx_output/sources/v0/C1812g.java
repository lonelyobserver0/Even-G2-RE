package v0;

import android.text.TextUtils;
import o0.C1438m;
import r0.AbstractC1550k;

/* renamed from: v0.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1812g {

    /* renamed from: a, reason: collision with root package name */
    public final String f21743a;

    /* renamed from: b, reason: collision with root package name */
    public final C1438m f21744b;

    /* renamed from: c, reason: collision with root package name */
    public final C1438m f21745c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21746d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21747e;

    public C1812g(String str, C1438m c1438m, C1438m c1438m2, int i3, int i10) {
        AbstractC1550k.c(i3 == 0 || i10 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f21743a = str;
        c1438m.getClass();
        this.f21744b = c1438m;
        c1438m2.getClass();
        this.f21745c = c1438m2;
        this.f21746d = i3;
        this.f21747e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1812g.class == obj.getClass()) {
            C1812g c1812g = (C1812g) obj;
            if (this.f21746d == c1812g.f21746d && this.f21747e == c1812g.f21747e && this.f21743a.equals(c1812g.f21743a) && this.f21744b.equals(c1812g.f21744b) && this.f21745c.equals(c1812g.f21745c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21745c.hashCode() + ((this.f21744b.hashCode() + i2.u.d((((527 + this.f21746d) * 31) + this.f21747e) * 31, 31, this.f21743a)) * 31);
    }
}
