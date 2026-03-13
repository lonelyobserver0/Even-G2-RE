package F6;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends g {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2250a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2251b;

    public d(HashMap hashMap, List list) {
        this.f2250a = hashMap;
        this.f2251b = list;
    }

    @Override // F6.g
    public final Map a() {
        return this.f2250a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        HashMap hashMap = this.f2250a;
        if (hashMap == null) {
            if (dVar.f2250a != null) {
                return false;
            }
        } else if (!hashMap.equals(dVar.f2250a)) {
            return false;
        }
        List list = this.f2251b;
        return list == null ? dVar.f2251b == null : list.equals(dVar.f2251b);
    }

    public final int hashCode() {
        HashMap hashMap = this.f2250a;
        int hashCode = ((hashMap == null ? 0 : hashMap.hashCode()) ^ 1000003) * 1000003;
        List list = this.f2251b;
        return (list != null ? list.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(2085));
        sb2.append(this.f2250a);
        sb2.append(StubApp.getString2(2086));
        return E1.a.l(StubApp.getString2(265), sb2, this.f2251b);
    }
}
