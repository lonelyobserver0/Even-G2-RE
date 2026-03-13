package Z7;

import com.mapbox.geojson.Geometry;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends g {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9035c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9036d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f9037e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ArrayList entries, ArrayList exits, LinkedHashMap edges, Geometry shape) {
        super(7, shape);
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(exits, "exits");
        Intrinsics.checkNotNullParameter(edges, "edges");
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f9035c = entries;
        this.f9036d = exits;
        this.f9037e = edges;
    }

    @Override // Z7.g
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(j.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.location.SubgraphLocation");
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f9035c, jVar.f9035c) && Intrinsics.areEqual(this.f9036d, jVar.f9036d) && Intrinsics.areEqual(this.f9037e, jVar.f9037e);
    }

    @Override // Z7.g
    public final int hashCode() {
        return this.f9037e.hashCode() + ((this.f9036d.hashCode() + ((this.f9035c.hashCode() + (super.hashCode() * 31)) * 31)) * 31);
    }

    @Override // Z7.g
    public final String toString() {
        return StubApp.getString2(7643) + this.f9035c + StubApp.getString2(6631) + this.f9036d + StubApp.getString2(7644) + this.f9037e + ')';
    }
}
