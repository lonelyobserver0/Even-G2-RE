package R8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o extends p {

    /* renamed from: a, reason: collision with root package name */
    public final com.mapbox.navigation.base.route.g f6308a;

    public o(com.mapbox.navigation.base.route.g route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f6308a = route;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.areEqual(this.f6308a, ((o) obj).f6308a);
    }

    public final int hashCode() {
        return this.f6308a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(5794) + this.f6308a + ')';
    }
}
