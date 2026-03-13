package R7;

import com.mapbox.geojson.Point;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Q7.d f6244a;

    /* renamed from: b, reason: collision with root package name */
    public final Point f6245b;

    public e(Q7.d eHorizonGraphPosition, Point coordinate) {
        Intrinsics.checkNotNullParameter(eHorizonGraphPosition, "eHorizonGraphPosition");
        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
        this.f6244a = eHorizonGraphPosition;
        this.f6245b = coordinate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(e.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.RoadObjectPosition");
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f6244a, eVar.f6244a) && Intrinsics.areEqual(this.f6245b, eVar.f6245b);
    }

    public final int hashCode() {
        return this.f6245b.hashCode() + (this.f6244a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(5750) + this.f6244a + StubApp.getString2(5751) + this.f6245b + ')';
    }
}
