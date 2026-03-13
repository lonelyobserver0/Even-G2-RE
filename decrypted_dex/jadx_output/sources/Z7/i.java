package Z7;

import com.mapbox.geojson.Geometry;
import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f9030a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9031b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9032c;

    /* renamed from: d, reason: collision with root package name */
    public final Geometry f9033d;

    /* renamed from: e, reason: collision with root package name */
    public final double f9034e;

    public i(long j, List innerEdgeIds, List outerEdgeIds, Geometry shape, double d8) {
        Intrinsics.checkNotNullParameter(innerEdgeIds, "innerEdgeIds");
        Intrinsics.checkNotNullParameter(outerEdgeIds, "outerEdgeIds");
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f9030a = j;
        this.f9031b = innerEdgeIds;
        this.f9032c = outerEdgeIds;
        this.f9033d = shape;
        this.f9034e = d8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.location.SubgraphEdge");
        i iVar = (i) obj;
        return this.f9030a == iVar.f9030a && Intrinsics.areEqual(this.f9031b, iVar.f9031b) && Intrinsics.areEqual(this.f9032c, iVar.f9032c) && Intrinsics.areEqual(this.f9033d, iVar.f9033d) && this.f9034e == iVar.f9034e;
    }

    public final int hashCode() {
        return Double.hashCode(this.f9034e) + ((this.f9033d.hashCode() + E1.a.g(E1.a.g(Long.hashCode(this.f9030a) * 31, 31, this.f9031b), 31, this.f9032c)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(7640) + this.f9030a + StubApp.getString2(7641) + this.f9031b + StubApp.getString2(7642) + this.f9032c + StubApp.getString2(7639) + this.f9033d + StubApp.getString2(5307) + this.f9034e + ')';
    }
}
