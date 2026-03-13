package L7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.options.RerouteOptions");
        ((j) obj).getClass();
        h hVar = h.f4276b;
        return Intrinsics.areEqual(hVar, hVar);
    }

    public final int hashCode() {
        return ((h.f4276b.hashCode() + 248) * 31) - 1;
    }

    public final String toString() {
        return StubApp.getString2(3448) + h.f4276b + StubApp.getString2(3449);
    }
}
