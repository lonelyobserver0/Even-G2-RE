package O8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class w extends Tc.d {

    /* renamed from: c, reason: collision with root package name */
    public final String f5283c;

    public w(String routerOrigin) {
        Intrinsics.checkNotNullParameter(routerOrigin, "routerOrigin");
        this.f5283c = routerOrigin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(w.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.reroute.RerouteState.RouteFetched");
        return Intrinsics.areEqual(this.f5283c, ((w) obj).f5283c);
    }

    public final int hashCode() {
        return this.f5283c.hashCode();
    }

    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(4470)), this.f5283c, StubApp.getString2(2142));
    }
}
