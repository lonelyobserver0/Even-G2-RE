package G2;

import java.io.Serializable;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f2373a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f2374b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2375c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2376d;

    public a(List list, Boolean bool, String str, List list2) {
        this.f2373a = list;
        this.f2374b = bool;
        this.f2375c = str;
        this.f2376d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            List list = aVar.f2373a;
            List list2 = this.f2373a;
            if (list2 == null ? list != null : !list2.equals(list)) {
                return false;
            }
            Boolean bool = aVar.f2374b;
            Boolean bool2 = this.f2374b;
            if (bool2 == null ? bool != null : !bool2.equals(bool)) {
                return false;
            }
            String str = aVar.f2375c;
            String str2 = this.f2375c;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            List list3 = aVar.f2376d;
            List list4 = this.f2376d;
            if (list4 != null) {
                return list4.equals(list3);
            }
            if (list3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f2373a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Boolean bool = this.f2374b;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.f2375c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        List list2 = this.f2376d;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }
}
