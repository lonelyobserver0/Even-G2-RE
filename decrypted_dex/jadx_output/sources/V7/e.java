package V7;

import com.stub.StubApp;
import i2.u;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends f {

    /* renamed from: d, reason: collision with root package name */
    public final List f7777d;

    /* renamed from: e, reason: collision with root package name */
    public final List f7778e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7779f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f7780g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String roadObjectId, int i3, List entrances, List exits, boolean z2) {
        super(roadObjectId, i3, 3);
        Intrinsics.checkNotNullParameter(roadObjectId, "roadObjectId");
        Intrinsics.checkNotNullParameter(entrances, "entrances");
        Intrinsics.checkNotNullParameter(exits, "exits");
        this.f7777d = entrances;
        this.f7778e = exits;
        this.f7779f = z2;
        b bVar = (b) CollectionsKt.firstOrNull(entrances);
        this.f7780g = bVar != null ? Double.valueOf(bVar.f7769d) : null;
    }

    @Override // V7.f
    public final Double a() {
        return this.f7780g;
    }

    @Override // V7.f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(e.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.PolygonDistanceInfo");
        e eVar = (e) obj;
        if (Intrinsics.areEqual(this.f7777d, eVar.f7777d) && Intrinsics.areEqual(this.f7778e, eVar.f7778e) && this.f7779f == eVar.f7779f) {
            return Intrinsics.areEqual(this.f7780g, eVar.f7780g);
        }
        return false;
    }

    @Override // V7.f
    public final int hashCode() {
        int e10 = u.e(E1.a.g(E1.a.g(super.hashCode() * 31, 31, this.f7777d), 31, this.f7778e), 31, this.f7779f);
        Double d8 = this.f7780g;
        return e10 + (d8 != null ? d8.hashCode() : 0);
    }

    @Override // V7.f
    public final String toString() {
        return StubApp.getString2(6630) + this.f7777d + StubApp.getString2(6631) + this.f7778e + StubApp.getString2(6632) + this.f7779f + StubApp.getString2(5753) + this.f7780g + StubApp.getString2(6022) + super.toString();
    }
}
