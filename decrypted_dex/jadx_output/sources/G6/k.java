package G6;

import java.io.Serializable;
import java.util.List;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f2444a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2445b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2446c;

    public k(String str, String str2, List list) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.f2444a = str;
        if (list == null) {
            throw new NullPointerException("Null features");
        }
        this.f2445b = list;
        if (str2 == null) {
            throw new NullPointerException("Null attribution");
        }
        this.f2446c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f2444a.equals(kVar.f2444a) && this.f2445b.equals(kVar.f2445b) && this.f2446c.equals(kVar.f2446c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2444a.hashCode() ^ 1000003) * 1000003) ^ this.f2445b.hashCode()) * 1000003) ^ this.f2446c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("V6Response{type=");
        sb2.append(this.f2444a);
        sb2.append(", features=");
        sb2.append(this.f2445b);
        sb2.append(", attribution=");
        return AbstractC1482f.k(sb2, this.f2446c, "}");
    }
}
