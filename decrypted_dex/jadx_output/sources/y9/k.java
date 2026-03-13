package y9;

import com.mapbox.geojson.Point;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Point f23579a;

    /* renamed from: b, reason: collision with root package name */
    public final double f23580b;

    public k(Point point, double d8) {
        Intrinsics.checkNotNullParameter(point, "point");
        this.f23579a = point;
        this.f23580b = d8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.route.line.model.RouteLineDistancesIndex");
        k kVar = (k) obj;
        if (Intrinsics.areEqual(this.f23579a, kVar.f23579a)) {
            return Tc.d.s(Double.valueOf(this.f23580b), Double.valueOf(kVar.f23580b));
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f23580b) + (this.f23579a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(24695) + this.f23579a + StubApp.getString2(4989) + this.f23580b + ')';
    }
}
