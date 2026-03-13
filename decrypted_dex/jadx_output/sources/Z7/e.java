package Z7;

import com.mapbox.geojson.Geometry;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends g {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9025c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ArrayList entries, ArrayList exits, Geometry shape) {
        super(4, shape);
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(exits, "exits");
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f9025c = entries;
        this.f9026d = exits;
    }

    @Override // Z7.g
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(e.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.location.PolygonLocation");
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f9025c, eVar.f9025c) && Intrinsics.areEqual(this.f9026d, eVar.f9026d);
    }

    @Override // Z7.g
    public final int hashCode() {
        return this.f9026d.hashCode() + ((this.f9025c.hashCode() + (super.hashCode() * 31)) * 31);
    }

    @Override // Z7.g
    public final String toString() {
        return StubApp.getString2(7636) + this.f9025c + StubApp.getString2(6631) + this.f9026d + StubApp.getString2(6022) + super.toString();
    }
}
