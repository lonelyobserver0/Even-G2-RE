package S7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f6603a;

    /* renamed from: b, reason: collision with root package name */
    public final b f6604b;

    public c(b from, b to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        this.f6603a = from;
        this.f6604b = to;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.border.CountryBorderCrossingInfo");
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f6603a, cVar.f6603a) && Intrinsics.areEqual(this.f6604b, cVar.f6604b);
    }

    public final int hashCode() {
        return this.f6604b.hashCode() + (this.f6603a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(6025) + this.f6603a + StubApp.getString2(6026) + this.f6604b + ')';
    }
}
