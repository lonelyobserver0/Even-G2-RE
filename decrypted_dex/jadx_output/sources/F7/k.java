package F7;

import com.mapbox.geojson.Point;
import com.stub.StubApp;
import i2.u;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Point f2316a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2317b;

    /* renamed from: c, reason: collision with root package name */
    public final Point f2318c;

    /* renamed from: d, reason: collision with root package name */
    public final j f2319d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f2320e;

    /* renamed from: f, reason: collision with root package name */
    public final i f2321f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2322g;

    public k(Point location, String name, Point point, j internalType, Map map, i iVar) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(internalType, "internalType");
        this.f2316a = location;
        this.f2317b = name;
        this.f2318c = point;
        this.f2319d = internalType;
        this.f2320e = map;
        this.f2321f = iVar;
        int ordinal = internalType.ordinal();
        int i3 = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                i3 = 3;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 4;
                }
            } else {
                i3 = 2;
            }
        }
        this.f2322g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.internal.route.Waypoint");
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f2316a, kVar.f2316a) && this.f2322g == kVar.f2322g && Intrinsics.areEqual(this.f2317b, kVar.f2317b) && Intrinsics.areEqual(this.f2318c, kVar.f2318c) && Intrinsics.areEqual(this.f2320e, kVar.f2320e) && Intrinsics.areEqual(this.f2321f, kVar.f2321f);
    }

    public final int hashCode() {
        int d8 = u.d(((this.f2316a.hashCode() * 31) + this.f2322g) * 31, 31, this.f2317b);
        Point point = this.f2318c;
        int hashCode = (d8 + (point != null ? point.hashCode() : 0)) * 31;
        Map map = this.f2320e;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        i iVar = this.f2321f;
        return hashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(2147) + this.f2316a + StubApp.getString2(2148) + this.f2322g + StubApp.getString2(2149) + this.f2317b + StubApp.getString2(2150) + this.f2318c + StubApp.getString2(2151) + this.f2320e + StubApp.getString2(2152) + this.f2321f + ')';
    }
}
