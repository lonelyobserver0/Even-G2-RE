package L8;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f4299a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4300b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4301c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4302d;

    public c(List routesList, ArrayList alternativesMetadata, List originalRoutesList, int i3) {
        Intrinsics.checkNotNullParameter(routesList, "routesList");
        Intrinsics.checkNotNullParameter(alternativesMetadata, "alternativesMetadata");
        Intrinsics.checkNotNullParameter(originalRoutesList, "originalRoutesList");
        this.f4299a = routesList;
        this.f4300b = alternativesMetadata;
        this.f4301c = originalRoutesList;
        this.f4302d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.preview.RoutesPreview");
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f4299a, cVar.f4299a) && Intrinsics.areEqual(this.f4300b, cVar.f4300b) && Intrinsics.areEqual(this.f4301c, cVar.f4301c) && this.f4302d == cVar.f4302d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4302d) + E1.a.g((this.f4300b.hashCode() + (this.f4299a.hashCode() * 31)) * 31, 31, this.f4301c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(3458));
        sb2.append(this.f4299a);
        sb2.append(StubApp.getString2(3459));
        sb2.append(this.f4300b);
        sb2.append(StubApp.getString2(3460));
        sb2.append(this.f4301c);
        sb2.append(StubApp.getString2(3461));
        return com.mapbox.common.b.j(sb2, this.f4302d, ')');
    }
}
