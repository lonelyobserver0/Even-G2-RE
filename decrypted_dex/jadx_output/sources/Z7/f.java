package Z7;

import com.mapbox.geojson.Geometry;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends g {

    /* renamed from: c, reason: collision with root package name */
    public final Q7.c f9027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Q7.c path, Geometry shape) {
        super(5, shape);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f9027c = path;
    }

    @Override // Z7.g
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(f.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.location.PolylineLocation");
        return Intrinsics.areEqual(this.f9027c, ((f) obj).f9027c);
    }

    @Override // Z7.g
    public final int hashCode() {
        return this.f9027c.hashCode() + (super.hashCode() * 31);
    }

    @Override // Z7.g
    public final String toString() {
        return StubApp.getString2(7637) + this.f9027c + StubApp.getString2(6022) + super.toString();
    }
}
