package Z7;

import com.mapbox.geojson.Point;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends g {

    /* renamed from: c, reason: collision with root package name */
    public final Q7.d f9021c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9022d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9023e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Q7.d position, Point shape, int i3, int i10) {
        super(2, shape);
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f9021c = position;
        this.f9022d = i3;
        this.f9023e = i10;
    }

    @Override // Z7.g
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.location.OpenLRPointLocation");
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f9021c, cVar.f9021c) && this.f9022d == cVar.f9022d && this.f9023e == cVar.f9023e;
    }

    @Override // Z7.g
    public final int hashCode() {
        return ((((this.f9021c.hashCode() + (super.hashCode() * 31)) * 31) + this.f9022d) * 31) + this.f9023e;
    }

    @Override // Z7.g
    public final String toString() {
        return StubApp.getString2(7632) + this.f9021c + StubApp.getString2(7633) + this.f9022d + StubApp.getString2(7634) + this.f9023e + StubApp.getString2(6022) + super.toString();
    }
}
