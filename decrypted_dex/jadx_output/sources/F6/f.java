package F6;

import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.stub.StubApp;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2258a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2259b;

    /* renamed from: c, reason: collision with root package name */
    public final LegAnnotation f2260c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2261d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2262e;

    public f(LinkedHashMap linkedHashMap, List list, LegAnnotation legAnnotation, List list2, List list3) {
        this.f2258a = linkedHashMap;
        this.f2259b = list;
        this.f2260c = legAnnotation;
        this.f2261d = list2;
        this.f2262e = list3;
    }

    @Override // F6.g
    public final Map a() {
        return this.f2258a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        LinkedHashMap linkedHashMap = this.f2258a;
        if (linkedHashMap == null) {
            if (fVar.f2258a != null) {
                return false;
            }
        } else if (!linkedHashMap.equals(fVar.f2258a)) {
            return false;
        }
        List list = this.f2259b;
        if (list == null) {
            if (fVar.f2259b != null) {
                return false;
            }
        } else if (!list.equals(fVar.f2259b)) {
            return false;
        }
        LegAnnotation legAnnotation = this.f2260c;
        if (legAnnotation == null) {
            if (fVar.f2260c != null) {
                return false;
            }
        } else if (!legAnnotation.equals(fVar.f2260c)) {
            return false;
        }
        List list2 = this.f2261d;
        if (list2 == null) {
            if (fVar.f2261d != null) {
                return false;
            }
        } else if (!list2.equals(fVar.f2261d)) {
            return false;
        }
        List list3 = this.f2262e;
        return list3 == null ? fVar.f2262e == null : list3.equals(fVar.f2262e);
    }

    public final int hashCode() {
        LinkedHashMap linkedHashMap = this.f2258a;
        int hashCode = ((linkedHashMap == null ? 0 : linkedHashMap.hashCode()) ^ 1000003) * 1000003;
        List list = this.f2259b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        LegAnnotation legAnnotation = this.f2260c;
        int hashCode3 = (hashCode2 ^ (legAnnotation == null ? 0 : legAnnotation.hashCode())) * 1000003;
        List list2 = this.f2261d;
        int hashCode4 = (hashCode3 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List list3 = this.f2262e;
        return (list3 != null ? list3.hashCode() : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(2118));
        sb2.append(this.f2258a);
        sb2.append(StubApp.getString2(2119));
        sb2.append(this.f2259b);
        sb2.append(StubApp.getString2(2120));
        sb2.append(this.f2260c);
        sb2.append(StubApp.getString2(2121));
        sb2.append(this.f2261d);
        sb2.append(StubApp.getString2(2122));
        return E1.a.l(StubApp.getString2(265), sb2, this.f2262e);
    }
}
