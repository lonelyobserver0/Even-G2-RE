package X8;

import com.mapbox.common.location.Location;
import com.stub.StubApp;
import i2.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Location f8502a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8503b;

    /* renamed from: c, reason: collision with root package name */
    public final c f8504c;

    public a(Location location, boolean z2, c cVar) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f8502a = location;
        this.f8503b = z2;
        this.f8504c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.trip.session.location.CorrectedLocationData");
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f8502a, aVar.f8502a) && this.f8503b == aVar.f8503b && Intrinsics.areEqual(this.f8504c, aVar.f8504c);
    }

    public final int hashCode() {
        int e10 = u.e(this.f8502a.hashCode() * 31, 31, this.f8503b);
        c cVar = this.f8504c;
        return e10 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(7313) + this.f8502a + StubApp.getString2(7314) + this.f8503b + StubApp.getString2(7315) + this.f8504c + ')';
    }
}
