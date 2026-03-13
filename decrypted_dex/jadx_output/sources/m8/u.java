package m8;

import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f17251a;

    public u(ArrayList invalidatedRoutes) {
        Intrinsics.checkNotNullParameter(invalidatedRoutes, "invalidatedRoutes");
        this.f17251a = invalidatedRoutes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(u.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.RoutesInvalidatedParams");
        return Intrinsics.areEqual(this.f17251a, ((u) obj).f17251a);
    }

    public final int hashCode() {
        return this.f17251a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(21158) + this.f17251a + ')';
    }
}
