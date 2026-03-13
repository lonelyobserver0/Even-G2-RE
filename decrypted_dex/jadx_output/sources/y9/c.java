package y9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c extends AbstractC1978a {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23556c;

    public c(int i3, double d8, boolean z2) {
        super(d8, i3);
        this.f23556c = z2;
    }

    @Override // y9.AbstractC1978a
    public final AbstractC1978a a(double d8) {
        return new c(this.f23550b, d8, this.f23556c);
    }

    @Override // y9.AbstractC1978a
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.route.line.model.ExtractedRouteRestrictionData");
        return this.f23556c == ((c) obj).f23556c;
    }

    @Override // y9.AbstractC1978a
    public final int hashCode() {
        return Boolean.hashCode(this.f23556c) + (super.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(24677));
        sb2.append(this.f23556c);
        sb2.append(StubApp.getString2(17603));
        sb2.append(this.f23549a);
        sb2.append(StubApp.getString2(5025));
        return com.mapbox.common.b.j(sb2, this.f23550b, ')');
    }
}
