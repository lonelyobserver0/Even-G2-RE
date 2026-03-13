package V7;

import com.stub.StubApp;
import i2.u;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends f {

    /* renamed from: d, reason: collision with root package name */
    public final List f7784d;

    /* renamed from: e, reason: collision with root package name */
    public final List f7785e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7786f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f7787g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String roadObjectId, int i3, List entrances, List exits, boolean z2) {
        super(roadObjectId, i3, 4);
        Intrinsics.checkNotNullParameter(roadObjectId, "roadObjectId");
        Intrinsics.checkNotNullParameter(entrances, "entrances");
        Intrinsics.checkNotNullParameter(exits, "exits");
        this.f7784d = entrances;
        this.f7785e = exits;
        this.f7786f = z2;
        b bVar = (b) CollectionsKt.firstOrNull(entrances);
        this.f7787g = bVar != null ? Double.valueOf(bVar.f7769d) : null;
    }

    @Override // V7.f
    public final Double a() {
        return this.f7787g;
    }

    @Override // V7.f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(g.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.SubGraphDistanceInfo");
        g gVar = (g) obj;
        if (Intrinsics.areEqual(this.f7784d, gVar.f7784d) && Intrinsics.areEqual(this.f7785e, gVar.f7785e) && this.f7786f == gVar.f7786f) {
            return Intrinsics.areEqual(this.f7787g, gVar.f7787g);
        }
        return false;
    }

    @Override // V7.f
    public final int hashCode() {
        int e10 = u.e(E1.a.g(E1.a.g(super.hashCode() * 31, 31, this.f7784d), 31, this.f7785e), 31, this.f7786f);
        Double d8 = this.f7787g;
        return e10 + (d8 != null ? d8.hashCode() : 0);
    }

    @Override // V7.f
    public final String toString() {
        return StubApp.getString2(6636) + this.f7784d + StubApp.getString2(6631) + this.f7785e + StubApp.getString2(6632) + this.f7786f + StubApp.getString2(5753) + this.f7787g + StubApp.getString2(6022) + super.toString();
    }
}
