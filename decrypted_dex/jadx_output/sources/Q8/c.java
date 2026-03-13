package Q8;

import Tc.d;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    public final RouteOptions f5771c;

    public c(RouteOptions routeOptions) {
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        this.f5771c = routeOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.routeoptions.RouteOptionsUpdater.RouteOptionsResult.Success");
        return Intrinsics.areEqual(this.f5771c, ((c) obj).f5771c);
    }

    public final int hashCode() {
        return this.f5771c.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(5318) + this.f5771c + ')';
    }
}
