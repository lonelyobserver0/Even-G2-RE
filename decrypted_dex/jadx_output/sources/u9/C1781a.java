package u9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;
import v9.C1839a;

/* renamed from: u9.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1781a {

    /* renamed from: a, reason: collision with root package name */
    public final C1839a f21476a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21477b;

    public C1781a(C1839a routeCallout, String layerId) {
        Intrinsics.checkNotNullParameter(routeCallout, "routeCallout");
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        this.f21476a = routeCallout;
        this.f21477b = layerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C1781a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.route.callout.api.RouteCalloutUiState");
        C1781a c1781a = (C1781a) obj;
        return Intrinsics.areEqual(this.f21476a, c1781a.f21476a) && Intrinsics.areEqual(this.f21477b, c1781a.f21477b);
    }

    public final int hashCode() {
        return this.f21477b.hashCode() + (this.f21476a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(23582));
        sb2.append(this.f21476a);
        sb2.append(StubApp.getString2(23583));
        return AbstractC1482f.k(sb2, this.f21477b, StubApp.getString2(2142));
    }
}
