package G6;

import com.stub.StubApp;
import java.util.LinkedHashMap;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends F6.g {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2402a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2403b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2404c;

    public d(LinkedHashMap linkedHashMap, String str, String str2) {
        this.f2402a = linkedHashMap;
        this.f2403b = str;
        this.f2404c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        LinkedHashMap linkedHashMap = this.f2402a;
        if (linkedHashMap == null) {
            if (dVar.f2402a != null) {
                return false;
            }
        } else if (!linkedHashMap.equals(dVar.f2402a)) {
            return false;
        }
        String str = this.f2403b;
        if (str == null) {
            if (dVar.f2403b != null) {
                return false;
            }
        } else if (!str.equals(dVar.f2403b)) {
            return false;
        }
        String str2 = this.f2404c;
        return str2 == null ? dVar.f2404c == null : str2.equals(dVar.f2404c);
    }

    public final int hashCode() {
        LinkedHashMap linkedHashMap = this.f2402a;
        int hashCode = ((linkedHashMap == null ? 0 : linkedHashMap.hashCode()) ^ 1000003) * 1000003;
        String str = this.f2403b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f2404c;
        return (str2 != null ? str2.hashCode() : 0) ^ hashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(2255));
        sb2.append(this.f2402a);
        sb2.append(StubApp.getString2(2252));
        sb2.append(this.f2403b);
        sb2.append(StubApp.getString2(1065));
        return AbstractC1482f.k(sb2, this.f2404c, StubApp.getString2(265));
    }
}
