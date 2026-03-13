package O8;

import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final List f5273a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5274b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5275c;

    public r(int i3, String origin, List routes) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f5273a = routes;
        this.f5274b = i3;
        this.f5275c = origin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(r.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.reroute.RerouteResult");
        r rVar = (r) obj;
        if (Intrinsics.areEqual(this.f5273a, rVar.f5273a) && this.f5274b == rVar.f5274b) {
            return Intrinsics.areEqual(this.f5275c, rVar.f5275c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5275c.hashCode() + (((this.f5273a.hashCode() * 31) + this.f5274b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(4464));
        sb2.append(this.f5273a);
        sb2.append(StubApp.getString2(4465));
        sb2.append(this.f5274b);
        sb2.append(StubApp.getString2(1886));
        return Xa.h.s(sb2, this.f5275c, ')');
    }
}
