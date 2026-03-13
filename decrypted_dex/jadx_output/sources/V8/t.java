package V8;

import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t extends s {

    /* renamed from: a, reason: collision with root package name */
    public final List f7896a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7897b;

    public t(List routes, List nativeAlternatives) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(nativeAlternatives, "nativeAlternatives");
        this.f7896a = routes;
        this.f7897b = nativeAlternatives;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(t.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.trip.session.NativeSetRouteValue");
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f7896a, tVar.f7896a) && Intrinsics.areEqual(this.f7897b, tVar.f7897b);
    }

    public final int hashCode() {
        return this.f7897b.hashCode() + (this.f7896a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(6733) + this.f7896a + StubApp.getString2(6734) + this.f7897b + ')';
    }
}
