package Z7;

import com.mapbox.geojson.Geometry;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends g {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9019c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ArrayList positions, Geometry shape) {
        super(0, shape);
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f9019c = positions;
    }

    @Override // Z7.g
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.location.GantryLocation");
        return Intrinsics.areEqual(this.f9019c, ((a) obj).f9019c);
    }

    @Override // Z7.g
    public final int hashCode() {
        return this.f9019c.hashCode() + (super.hashCode() * 31);
    }

    @Override // Z7.g
    public final String toString() {
        return StubApp.getString2(7630) + this.f9019c + StubApp.getString2(6022) + super.toString();
    }
}
