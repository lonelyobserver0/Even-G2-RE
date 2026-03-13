package G6;

import com.mapbox.geojson.Geometry;
import com.stub.StubApp;
import java.util.LinkedHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends F6.g {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2414a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2415b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2416c;

    /* renamed from: d, reason: collision with root package name */
    public final Geometry f2417d;

    /* renamed from: e, reason: collision with root package name */
    public final j f2418e;

    public g(LinkedHashMap linkedHashMap, String str, String str2, Geometry geometry, j jVar) {
        this.f2414a = linkedHashMap;
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(2281));
        }
        this.f2415b = str;
        if (str2 == null) {
            throw new NullPointerException(StubApp.getString2(2257));
        }
        this.f2416c = str2;
        if (geometry == null) {
            throw new NullPointerException(StubApp.getString2(2280));
        }
        this.f2417d = geometry;
        if (jVar == null) {
            throw new NullPointerException(StubApp.getString2(2282));
        }
        this.f2418e = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        LinkedHashMap linkedHashMap = this.f2414a;
        if (linkedHashMap == null) {
            if (gVar.f2414a != null) {
                return false;
            }
        } else if (!linkedHashMap.equals(gVar.f2414a)) {
            return false;
        }
        if (this.f2415b.equals(gVar.f2415b)) {
            return this.f2416c.equals(gVar.f2416c) && this.f2417d.equals(gVar.f2417d) && this.f2418e.equals(gVar.f2418e);
        }
        return false;
    }

    public final int hashCode() {
        LinkedHashMap linkedHashMap = this.f2414a;
        return (((((((((linkedHashMap == null ? 0 : linkedHashMap.hashCode()) ^ 1000003) * 1000003) ^ this.f2415b.hashCode()) * 1000003) ^ this.f2416c.hashCode()) * 1000003) ^ this.f2417d.hashCode()) * 1000003) ^ this.f2418e.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(2295) + this.f2414a + StubApp.getString2(2296) + this.f2415b + StubApp.getString2(2148) + this.f2416c + StubApp.getString2(2297) + this.f2417d + StubApp.getString2(2298) + this.f2418e + StubApp.getString2(265);
    }
}
