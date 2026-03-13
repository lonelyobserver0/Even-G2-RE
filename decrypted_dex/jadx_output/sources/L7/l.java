package L7;

import com.stub.StubApp;
import java.net.URI;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final URI f4290a;

    public l(URI uri) {
        this.f4290a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.options.RoutingTilesOptions");
        return Intrinsics.areEqual(this.f4290a, ((l) obj).f4290a) && Intrinsics.areEqual("mapbox", "mapbox") && Intrinsics.areEqual("driving-traffic", "driving-traffic") && Intrinsics.areEqual("", "") && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return ((((((this.f4290a.hashCode() * 31) - 1081373969) * 31) - 1040922121) * 923521) + 56) * 961;
    }

    public final String toString() {
        return StubApp.getString2(3452) + this.f4290a + StubApp.getString2(3453);
    }
}
