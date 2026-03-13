package m8;

import com.stub.StubApp;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f17264a;

    public z(LinkedHashMap ignoredAlternatives) {
        Intrinsics.checkNotNullParameter(ignoredAlternatives, "ignoredAlternatives");
        this.f17264a = ignoredAlternatives;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(z.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.RoutesSetSuccess");
        return Intrinsics.areEqual(this.f17264a, ((z) obj).f17264a);
    }

    public final int hashCode() {
        return this.f17264a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(21167) + this.f17264a + ')';
    }
}
