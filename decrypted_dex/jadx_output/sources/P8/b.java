package P8;

import com.mapbox.geojson.Point;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Point f5600a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5601b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5602c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5603d;

    public b(Point location, int i3, int i10, int i11) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f5600a = location;
        this.f5601b = i3;
        this.f5602c = i10;
        this.f5603d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.routealternatives.AlternativeRouteIntersection");
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f5600a, bVar.f5600a) && this.f5601b == bVar.f5601b && this.f5602c == bVar.f5602c && this.f5603d == bVar.f5603d;
    }

    public final int hashCode() {
        return (((((this.f5600a.hashCode() * 31) + this.f5601b) * 31) + this.f5602c) * 31) + this.f5603d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(5022));
        sb2.append(this.f5600a);
        sb2.append(StubApp.getString2(5023));
        sb2.append(this.f5601b);
        sb2.append(StubApp.getString2(5024));
        sb2.append(this.f5602c);
        sb2.append(StubApp.getString2(5025));
        return com.mapbox.common.b.j(sb2, this.f5603d, ')');
    }
}
