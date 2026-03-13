package y9;

import com.mapbox.geojson.FeatureCollection;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final FeatureCollection f23577a;

    /* renamed from: b, reason: collision with root package name */
    public final l f23578b;

    public j(FeatureCollection featureCollection, l lVar) {
        Intrinsics.checkNotNullParameter(featureCollection, "featureCollection");
        this.f23577a = featureCollection;
        this.f23578b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f23577a, jVar.f23577a) && Intrinsics.areEqual(this.f23578b, jVar.f23578b);
    }

    public final int hashCode() {
        int hashCode = this.f23577a.hashCode() * 31;
        l lVar = this.f23578b;
        return hashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public final String toString() {
        return StubApp.getString2(24694) + this.f23577a + StubApp.getString2(14756) + this.f23578b + ')';
    }
}
