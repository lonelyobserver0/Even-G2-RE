package x9;

import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final y9.g f23082a;

    /* renamed from: b, reason: collision with root package name */
    public final RouteLineViewOptionsData f23083b;

    public u(y9.g options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f23082a = options;
        Intrinsics.checkNotNullParameter(options, "<this>");
        this.f23083b = new RouteLineViewOptionsData(options.f23566b, options.f23567c, options.f23568d, 1.0d, 7.0d, false, 30.0d, options.f23569e, options.f23571g, options.f23573i, S6.a.f6593a, S6.b.f6594a, false, null, 0.375d, false, 0.0d, StubApp.getString2(12974), null, 5.0d, false, false, 0.4d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.areEqual(this.f23082a, ((u) obj).f23082a);
    }

    public final int hashCode() {
        return this.f23082a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(24223) + this.f23082a + ')';
    }
}
