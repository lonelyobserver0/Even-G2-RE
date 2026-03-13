package G6;

import com.stub.StubApp;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends F6.g {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2434a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2435b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2436c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2437d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2438e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2439f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2440g;

    /* renamed from: h, reason: collision with root package name */
    public final b f2441h;
    public final f j;

    /* renamed from: k, reason: collision with root package name */
    public final List f2442k;

    /* renamed from: l, reason: collision with root package name */
    public final h f2443l;

    public j(LinkedHashMap linkedHashMap, String str, String str2, String str3, String str4, String str5, String str6, b bVar, f fVar, List list, h hVar) {
        this.f2434a = linkedHashMap;
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(2312));
        }
        this.f2435b = str;
        if (str2 == null) {
            throw new NullPointerException(StubApp.getString2(2313));
        }
        this.f2436c = str2;
        this.f2437d = str3;
        this.f2438e = str4;
        this.f2439f = str5;
        this.f2440g = str6;
        this.f2441h = bVar;
        this.j = fVar;
        this.f2442k = list;
        this.f2443l = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        LinkedHashMap linkedHashMap = this.f2434a;
        if (linkedHashMap == null) {
            if (jVar.f2434a != null) {
                return false;
            }
        } else if (!linkedHashMap.equals(jVar.f2434a)) {
            return false;
        }
        if (!this.f2435b.equals(jVar.f2435b)) {
            return false;
        }
        if (!this.f2436c.equals(jVar.f2436c)) {
            return false;
        }
        String str = jVar.f2437d;
        String str2 = this.f2437d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = jVar.f2438e;
        String str4 = this.f2438e;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = jVar.f2439f;
        String str6 = this.f2439f;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        String str7 = jVar.f2440g;
        String str8 = this.f2440g;
        if (str8 == null) {
            if (str7 != null) {
                return false;
            }
        } else if (!str8.equals(str7)) {
            return false;
        }
        b bVar = jVar.f2441h;
        b bVar2 = this.f2441h;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        f fVar = jVar.j;
        f fVar2 = this.j;
        if (fVar2 == null) {
            if (fVar != null) {
                return false;
            }
        } else if (!fVar2.equals(fVar)) {
            return false;
        }
        List list = jVar.f2442k;
        List list2 = this.f2442k;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        h hVar = jVar.f2443l;
        h hVar2 = this.f2443l;
        return hVar2 == null ? hVar == null : hVar2.equals(hVar);
    }

    public final int hashCode() {
        LinkedHashMap linkedHashMap = this.f2434a;
        int hashCode = ((((((linkedHashMap == null ? 0 : linkedHashMap.hashCode()) ^ 1000003) * 1000003) ^ this.f2435b.hashCode()) * 1000003) ^ this.f2436c.hashCode()) * 1000003;
        String str = this.f2437d;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f2438e;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2439f;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f2440g;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        b bVar = this.f2441h;
        int hashCode6 = (hashCode5 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        f fVar = this.j;
        int hashCode7 = (hashCode6 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        List list = this.f2442k;
        int hashCode8 = (hashCode7 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        h hVar = this.f2443l;
        return (hVar != null ? hVar.hashCode() : 0) ^ hashCode8;
    }

    public final String toString() {
        return StubApp.getString2(2318) + this.f2434a + StubApp.getString2(2252) + this.f2435b + StubApp.getString2(2319) + this.f2436c + StubApp.getString2(1065) + this.f2437d + StubApp.getString2(2320) + this.f2438e + StubApp.getString2(2321) + this.f2439f + StubApp.getString2(2322) + this.f2440g + StubApp.getString2(2323) + this.f2441h + StubApp.getString2(2324) + this.j + StubApp.getString2(2325) + this.f2442k + StubApp.getString2(2326) + this.f2443l + StubApp.getString2(265);
    }
}
