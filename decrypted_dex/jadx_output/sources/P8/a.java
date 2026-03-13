package P8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f5598a;

    /* renamed from: b, reason: collision with root package name */
    public final double f5599b;

    public a(double d8, double d10) {
        this.f5598a = d8;
        this.f5599b = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.routealternatives.AlternativeRouteInfo");
        a aVar = (a) obj;
        return this.f5598a == aVar.f5598a && this.f5599b == aVar.f5599b;
    }

    public final int hashCode() {
        return Double.hashCode(this.f5599b) + (Double.hashCode(this.f5598a) * 31);
    }

    public final String toString() {
        return StubApp.getString2(5020) + this.f5598a + StubApp.getString2(5021) + this.f5599b + ')';
    }
}
