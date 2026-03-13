package Z7;

import com.mapbox.geojson.Point;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends g {

    /* renamed from: c, reason: collision with root package name */
    public final R7.e f9024c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(R7.e position, Point shape) {
        super(3, shape);
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f9024c = position;
    }

    @Override // Z7.g
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(d.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.location.PointLocation");
        return Intrinsics.areEqual(this.f9024c, ((d) obj).f9024c);
    }

    @Override // Z7.g
    public final int hashCode() {
        return this.f9024c.hashCode() + (super.hashCode() * 31);
    }

    @Override // Z7.g
    public final String toString() {
        return StubApp.getString2(7635) + this.f9024c + StubApp.getString2(6022) + super.toString();
    }
}
