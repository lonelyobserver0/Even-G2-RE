package P8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.mapbox.navigation.base.route.g f5604a;

    /* renamed from: b, reason: collision with root package name */
    public final b f5605b;

    /* renamed from: c, reason: collision with root package name */
    public final b f5606c;

    /* renamed from: d, reason: collision with root package name */
    public final a f5607d;

    /* renamed from: e, reason: collision with root package name */
    public final a f5608e;

    public c(com.mapbox.navigation.base.route.g navigationRoute, b forkIntersectionOfAlternativeRoute, b forkIntersectionOfPrimaryRoute, a infoFromFork, a infoFromStartOfPrimary) {
        Intrinsics.checkNotNullParameter(navigationRoute, "navigationRoute");
        Intrinsics.checkNotNullParameter(forkIntersectionOfAlternativeRoute, "forkIntersectionOfAlternativeRoute");
        Intrinsics.checkNotNullParameter(forkIntersectionOfPrimaryRoute, "forkIntersectionOfPrimaryRoute");
        Intrinsics.checkNotNullParameter(infoFromFork, "infoFromFork");
        Intrinsics.checkNotNullParameter(infoFromStartOfPrimary, "infoFromStartOfPrimary");
        this.f5604a = navigationRoute;
        this.f5605b = forkIntersectionOfAlternativeRoute;
        this.f5606c = forkIntersectionOfPrimaryRoute;
        this.f5607d = infoFromFork;
        this.f5608e = infoFromStartOfPrimary;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.routealternatives.AlternativeRouteMetadata");
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f5604a.f12506i, cVar.f5604a.f12506i) && Intrinsics.areEqual(this.f5605b, cVar.f5605b) && Intrinsics.areEqual(this.f5606c, cVar.f5606c) && Intrinsics.areEqual(this.f5607d, cVar.f5607d) && Intrinsics.areEqual(this.f5608e, cVar.f5608e);
    }

    public final int hashCode() {
        return this.f5608e.hashCode() + ((this.f5607d.hashCode() + ((this.f5606c.hashCode() + ((this.f5605b.hashCode() + (this.f5604a.f12506i.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(5026) + this.f5604a.f12506i + StubApp.getString2(5027) + this.f5605b + StubApp.getString2(5028) + this.f5606c + StubApp.getString2(5029) + this.f5607d + StubApp.getString2(5030) + this.f5608e + ')';
    }
}
