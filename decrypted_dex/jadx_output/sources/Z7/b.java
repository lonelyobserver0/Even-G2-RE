package Z7;

import com.mapbox.geojson.Geometry;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends g {

    /* renamed from: c, reason: collision with root package name */
    public final Q7.c f9020c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Q7.c graphPath, Geometry shape) {
        super(1, shape);
        Intrinsics.checkNotNullParameter(graphPath, "graphPath");
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f9020c = graphPath;
    }

    @Override // Z7.g
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.location.OpenLRLineLocation");
        return Intrinsics.areEqual(this.f9020c, ((b) obj).f9020c);
    }

    @Override // Z7.g
    public final int hashCode() {
        return this.f9020c.hashCode() + (super.hashCode() * 31);
    }

    @Override // Z7.g
    public final String toString() {
        return StubApp.getString2(7631) + this.f9020c + StubApp.getString2(6022) + super.toString();
    }
}
