package H6;

import java.io.Serializable;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f2925a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2926b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2927c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2928d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2929e;

    public a(String str, List list, List list2, List list3, List list4) {
        if (str == null) {
            throw new NullPointerException("Null code");
        }
        this.f2925a = str;
        this.f2926b = list;
        this.f2927c = list2;
        this.f2928d = list3;
        this.f2929e = list4;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        List list3;
        List list4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2925a.equals(aVar.f2925a) && ((list = this.f2926b) != null ? list.equals(aVar.f2926b) : aVar.f2926b == null) && ((list2 = this.f2927c) != null ? list2.equals(aVar.f2927c) : aVar.f2927c == null) && ((list3 = this.f2928d) != null ? list3.equals(aVar.f2928d) : aVar.f2928d == null) && ((list4 = this.f2929e) != null ? list4.equals(aVar.f2929e) : aVar.f2929e == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f2925a.hashCode() ^ 1000003) * 1000003;
        List list = this.f2926b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f2927c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List list3 = this.f2928d;
        int hashCode4 = (hashCode3 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        List list4 = this.f2929e;
        return hashCode4 ^ (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MatrixResponse{code=");
        sb2.append(this.f2925a);
        sb2.append(", destinations=");
        sb2.append(this.f2926b);
        sb2.append(", sources=");
        sb2.append(this.f2927c);
        sb2.append(", durations=");
        sb2.append(this.f2928d);
        sb2.append(", distances=");
        return E1.a.l("}", sb2, this.f2929e);
    }
}
