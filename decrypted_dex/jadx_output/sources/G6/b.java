package G6;

import com.stub.StubApp;
import java.util.LinkedHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends F6.g {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2389a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2390b;

    /* renamed from: c, reason: collision with root package name */
    public final d f2391c;

    /* renamed from: d, reason: collision with root package name */
    public final d f2392d;

    /* renamed from: e, reason: collision with root package name */
    public final d f2393e;

    /* renamed from: f, reason: collision with root package name */
    public final d f2394f;

    /* renamed from: g, reason: collision with root package name */
    public final d f2395g;

    /* renamed from: h, reason: collision with root package name */
    public final d f2396h;

    public b(LinkedHashMap linkedHashMap, c cVar, d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6) {
        this.f2389a = linkedHashMap;
        this.f2390b = cVar;
        this.f2391c = dVar;
        this.f2392d = dVar2;
        this.f2393e = dVar3;
        this.f2394f = dVar4;
        this.f2395g = dVar5;
        this.f2396h = dVar6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        LinkedHashMap linkedHashMap = this.f2389a;
        if (linkedHashMap == null) {
            if (bVar.f2389a != null) {
                return false;
            }
        } else if (!linkedHashMap.equals(bVar.f2389a)) {
            return false;
        }
        c cVar = this.f2390b;
        if (cVar == null) {
            if (bVar.f2390b != null) {
                return false;
            }
        } else if (!cVar.equals(bVar.f2390b)) {
            return false;
        }
        d dVar = this.f2391c;
        if (dVar == null) {
            if (bVar.f2391c != null) {
                return false;
            }
        } else if (!dVar.equals(bVar.f2391c)) {
            return false;
        }
        d dVar2 = this.f2392d;
        if (dVar2 == null) {
            if (bVar.f2392d != null) {
                return false;
            }
        } else if (!dVar2.equals(bVar.f2392d)) {
            return false;
        }
        d dVar3 = this.f2393e;
        if (dVar3 == null) {
            if (bVar.f2393e != null) {
                return false;
            }
        } else if (!dVar3.equals(bVar.f2393e)) {
            return false;
        }
        d dVar4 = this.f2394f;
        if (dVar4 == null) {
            if (bVar.f2394f != null) {
                return false;
            }
        } else if (!dVar4.equals(bVar.f2394f)) {
            return false;
        }
        d dVar5 = this.f2395g;
        if (dVar5 == null) {
            if (bVar.f2395g != null) {
                return false;
            }
        } else if (!dVar5.equals(bVar.f2395g)) {
            return false;
        }
        d dVar6 = this.f2396h;
        return dVar6 == null ? bVar.f2396h == null : dVar6.equals(bVar.f2396h);
    }

    public final int hashCode() {
        LinkedHashMap linkedHashMap = this.f2389a;
        int hashCode = ((linkedHashMap == null ? 0 : linkedHashMap.hashCode()) ^ 1000003) * 1000003;
        c cVar = this.f2390b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        d dVar = this.f2391c;
        int hashCode3 = (hashCode2 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        d dVar2 = this.f2392d;
        int hashCode4 = (hashCode3 ^ (dVar2 == null ? 0 : dVar2.hashCode())) * 1000003;
        d dVar3 = this.f2393e;
        int hashCode5 = (hashCode4 ^ (dVar3 == null ? 0 : dVar3.hashCode())) * 1000003;
        d dVar4 = this.f2394f;
        int hashCode6 = (hashCode5 ^ (dVar4 == null ? 0 : dVar4.hashCode())) * 1000003;
        d dVar5 = this.f2395g;
        int hashCode7 = (hashCode6 ^ (dVar5 == null ? 0 : dVar5.hashCode())) * 1000003;
        d dVar6 = this.f2396h;
        return (dVar6 != null ? dVar6.hashCode() : 0) ^ hashCode7;
    }

    public final String toString() {
        return StubApp.getString2(2244) + this.f2389a + StubApp.getString2(2245) + this.f2390b + StubApp.getString2(2246) + this.f2391c + StubApp.getString2(2247) + this.f2392d + StubApp.getString2(2248) + this.f2393e + StubApp.getString2(2249) + this.f2394f + StubApp.getString2(2250) + this.f2395g + StubApp.getString2(262) + this.f2396h + StubApp.getString2(265);
    }
}
