package q8;

import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f20095a;

    /* renamed from: b, reason: collision with root package name */
    public final List f20096b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20097c;

    public g(String reason, List navigationRoutes, List ignoredRoutes) {
        Intrinsics.checkNotNullParameter(navigationRoutes, "navigationRoutes");
        Intrinsics.checkNotNullParameter(ignoredRoutes, "ignoredRoutes");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f20095a = navigationRoutes;
        this.f20096b = ignoredRoutes;
        this.f20097c = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.directions.session.RoutesUpdatedResult");
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f20095a, gVar.f20095a) && Intrinsics.areEqual(this.f20097c, gVar.f20097c);
    }

    public final int hashCode() {
        return this.f20097c.hashCode() + (this.f20095a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(22327) + this.f20097c + StubApp.getString2(22328) + this.f20095a + StubApp.getString2(22318) + this.f20096b + ')';
    }
}
