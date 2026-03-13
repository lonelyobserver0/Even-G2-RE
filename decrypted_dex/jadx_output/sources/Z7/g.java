package Z7;

import com.mapbox.geojson.Geometry;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f9028a;

    /* renamed from: b, reason: collision with root package name */
    public final Geometry f9029b;

    public g(int i3, Geometry shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f9028a = i3;
        this.f9029b = shape;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation");
        g gVar = (g) obj;
        return this.f9028a == gVar.f9028a && Intrinsics.areEqual(this.f9029b, gVar.f9029b);
    }

    public int hashCode() {
        return this.f9029b.hashCode() + (this.f9028a * 31);
    }

    public String toString() {
        return StubApp.getString2(7638) + this.f9028a + StubApp.getString2(7639) + this.f9029b + ')';
    }
}
