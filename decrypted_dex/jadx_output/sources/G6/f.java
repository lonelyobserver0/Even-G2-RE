package G6;

import java.io.Serializable;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Double f2410a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f2411b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2412c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2413d;

    public f(Double d8, Double d10, String str, List list) {
        if (d8 == null) {
            throw new NullPointerException("Null longitude");
        }
        this.f2410a = d8;
        if (d10 == null) {
            throw new NullPointerException("Null latitude");
        }
        this.f2411b = d10;
        this.f2412c = str;
        this.f2413d = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f2410a.equals(fVar.f2410a) && this.f2411b.equals(fVar.f2411b)) {
                String str = fVar.f2412c;
                String str2 = this.f2412c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    List list = fVar.f2413d;
                    List list2 = this.f2413d;
                    if (list2 != null ? list2.equals(list) : list == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f2410a.hashCode() ^ 1000003) * 1000003) ^ this.f2411b.hashCode()) * 1000003;
        String str = this.f2412c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f2413d;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("V6Coordinates{longitude=");
        sb2.append(this.f2410a);
        sb2.append(", latitude=");
        sb2.append(this.f2411b);
        sb2.append(", accuracy=");
        sb2.append(this.f2412c);
        sb2.append(", routablePoints=");
        return E1.a.l("}", sb2, this.f2413d);
    }
}
