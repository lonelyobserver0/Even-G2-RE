package f5;

import com.stub.StubApp;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class W extends B0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13932a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13933b;

    /* renamed from: c, reason: collision with root package name */
    public final List f13934c;

    public W(int i3, String str, List list) {
        this.f13932a = str;
        this.f13933b = i3;
        this.f13934c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B0) {
            B0 b02 = (B0) obj;
            if (this.f13932a.equals(((W) b02).f13932a)) {
                W w10 = (W) b02;
                if (this.f13933b == w10.f13933b && this.f13934c.equals(w10.f13934c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f13932a.hashCode() ^ 1000003) * 1000003) ^ this.f13933b) * 1000003) ^ this.f13934c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17596));
        sb2.append(this.f13932a);
        sb2.append(StubApp.getString2(2564));
        sb2.append(this.f13933b);
        sb2.append(StubApp.getString2(17592));
        return E1.a.l(StubApp.getString2(265), sb2, this.f13934c);
    }
}
