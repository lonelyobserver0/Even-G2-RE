package G6;

import java.io.Serializable;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Double f2447a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f2448b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2449c;

    public l(Double d8, Double d10, String str) {
        if (d8 == null) {
            throw new NullPointerException("Null longitude");
        }
        this.f2447a = d8;
        if (d10 == null) {
            throw new NullPointerException("Null latitude");
        }
        this.f2448b = d10;
        this.f2449c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f2447a.equals(lVar.f2447a) && this.f2448b.equals(lVar.f2448b)) {
                String str = lVar.f2449c;
                String str2 = this.f2449c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f2447a.hashCode() ^ 1000003) * 1000003) ^ this.f2448b.hashCode()) * 1000003;
        String str = this.f2449c;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("V6RoutablePoint{longitude=");
        sb2.append(this.f2447a);
        sb2.append(", latitude=");
        sb2.append(this.f2448b);
        sb2.append(", name=");
        return AbstractC1482f.k(sb2, this.f2449c, "}");
    }
}
