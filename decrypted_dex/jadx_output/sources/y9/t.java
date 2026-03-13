package y9;

import com.mapbox.geojson.FeatureCollection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q9.C1529a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final j f23602a;

    /* renamed from: b, reason: collision with root package name */
    public final List f23603b;

    /* renamed from: c, reason: collision with root package name */
    public final FeatureCollection f23604c;

    /* renamed from: d, reason: collision with root package name */
    public final C1529a f23605d;

    /* renamed from: e, reason: collision with root package name */
    public final l f23606e;

    public t(j primaryRouteLineData, List alternativeRouteLinesData, FeatureCollection waypointsSource, C1529a callouts, l lVar) {
        Intrinsics.checkNotNullParameter(primaryRouteLineData, "primaryRouteLineData");
        Intrinsics.checkNotNullParameter(alternativeRouteLinesData, "alternativeRouteLinesData");
        Intrinsics.checkNotNullParameter(waypointsSource, "waypointsSource");
        Intrinsics.checkNotNullParameter(callouts, "callouts");
        this.f23602a = primaryRouteLineData;
        this.f23603b = alternativeRouteLinesData;
        this.f23604c = waypointsSource;
        this.f23605d = callouts;
        this.f23606e = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(t.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.route.line.model.RouteSetValue");
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f23602a, tVar.f23602a) && Intrinsics.areEqual(this.f23603b, tVar.f23603b) && Intrinsics.areEqual(this.f23604c, tVar.f23604c) && Intrinsics.areEqual(this.f23605d, tVar.f23605d) && Intrinsics.areEqual(this.f23606e, tVar.f23606e);
    }

    public final int hashCode() {
        int g10 = E1.a.g((this.f23604c.hashCode() + E1.a.g(this.f23602a.hashCode() * 31, 31, this.f23603b)) * 31, 31, this.f23605d.f20098a);
        l lVar = this.f23606e;
        return g10 + (lVar != null ? lVar.hashCode() : 0);
    }
}
