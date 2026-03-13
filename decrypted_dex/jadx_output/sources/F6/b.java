package F6;

import com.stub.StubApp;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2243a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2244b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2245c;

    /* renamed from: d, reason: collision with root package name */
    public final d f2246d;

    public b(LinkedHashMap linkedHashMap, String str, String str2, d dVar) {
        this.f2243a = linkedHashMap;
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(2052));
        }
        this.f2244b = str;
        this.f2245c = str2;
        this.f2246d = dVar;
    }

    @Override // F6.g
    public final Map a() {
        return this.f2243a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        LinkedHashMap linkedHashMap = this.f2243a;
        if (linkedHashMap == null) {
            if (bVar.f2243a != null) {
                return false;
            }
        } else if (!linkedHashMap.equals(bVar.f2243a)) {
            return false;
        }
        if (!this.f2244b.equals(bVar.f2244b)) {
            return false;
        }
        String str = this.f2245c;
        if (str == null) {
            if (bVar.f2245c != null) {
                return false;
            }
        } else if (!str.equals(bVar.f2245c)) {
            return false;
        }
        d dVar = this.f2246d;
        return dVar == null ? bVar.f2246d == null : dVar.equals(bVar.f2246d);
    }

    public final int hashCode() {
        LinkedHashMap linkedHashMap = this.f2243a;
        int hashCode = ((((linkedHashMap == null ? 0 : linkedHashMap.hashCode()) ^ 1000003) * 1000003) ^ this.f2244b.hashCode()) * 1000003;
        String str = this.f2245c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        d dVar = this.f2246d;
        return (dVar != null ? dVar.hashCode() : 0) ^ hashCode2;
    }

    public final String toString() {
        return StubApp.getString2(2060) + this.f2243a + StubApp.getString2(573) + this.f2244b + StubApp.getString2(2061) + this.f2245c + StubApp.getString2(2062) + this.f2246d + StubApp.getString2(265);
    }
}
