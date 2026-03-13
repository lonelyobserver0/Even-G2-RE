package v9;

import com.mapbox.navigation.base.route.g;
import com.stub.StubApp;
import i2.u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* renamed from: v9.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1839a {

    /* renamed from: a, reason: collision with root package name */
    public final g f21889a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21890b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21891c;

    public C1839a(g gVar, boolean z2, long j) {
        this.f21889a = gVar;
        this.f21890b = z2;
        this.f21891c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C1839a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.route.callout.model.RouteCallout");
        C1839a c1839a = (C1839a) obj;
        return Intrinsics.areEqual(this.f21889a, c1839a.f21889a) && this.f21890b == c1839a.f21890b && Duration.m1373equalsimpl0(this.f21891c, c1839a.f21891c);
    }

    public final int hashCode() {
        return Duration.m1389hashCodeimpl(this.f21891c) + u.e(this.f21889a.hashCode() * 31, 31, this.f21890b);
    }

    public final String toString() {
        return StubApp.getString2(23679) + this.f21889a + StubApp.getString2(23680) + this.f21890b + StubApp.getString2(23681) + ((Object) Duration.m1408toStringimpl(this.f21891c)) + ')';
    }
}
