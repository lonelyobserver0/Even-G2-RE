package y9;

import com.mapbox.geojson.FeatureCollection;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.mapbox.navigation.base.route.g f23574a;

    /* renamed from: b, reason: collision with root package name */
    public final FeatureCollection f23575b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23576c;

    public h(com.mapbox.navigation.base.route.g route, FeatureCollection reversedFeatureCollection, int i3) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(reversedFeatureCollection, "reversedFeatureCollection");
        this.f23574a = route;
        this.f23575b = reversedFeatureCollection;
        this.f23576c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f23574a, hVar.f23574a) && Intrinsics.areEqual(this.f23575b, hVar.f23575b) && this.f23576c == hVar.f23576c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23576c) + ((this.f23575b.hashCode() + (this.f23574a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(24691));
        sb2.append(this.f23574a);
        sb2.append(StubApp.getString2(24692));
        sb2.append(this.f23575b);
        sb2.append(StubApp.getString2(24693));
        return com.mapbox.common.b.j(sb2, this.f23576c, ')');
    }
}
