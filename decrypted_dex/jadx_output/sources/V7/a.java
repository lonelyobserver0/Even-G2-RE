package V7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends f {

    /* renamed from: d, reason: collision with root package name */
    public final double f7765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String roadObjectId, int i3, double d8) {
        super(roadObjectId, i3, 0);
        Intrinsics.checkNotNullParameter(roadObjectId, "roadObjectId");
        this.f7765d = d8;
    }

    @Override // V7.f
    public final Double a() {
        return Double.valueOf(this.f7765d);
    }

    @Override // V7.f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.GantryDistanceInfo");
        return this.f7765d == ((a) obj).f7765d;
    }

    @Override // V7.f
    public final int hashCode() {
        return Double.hashCode(this.f7765d) + (super.hashCode() * 31);
    }

    @Override // V7.f
    public final String toString() {
        return StubApp.getString2(6622) + this.f7765d + StubApp.getString2(6022) + super.toString();
    }
}
