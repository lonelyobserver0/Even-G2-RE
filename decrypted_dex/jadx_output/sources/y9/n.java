package y9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n extends AbstractC1978a {

    /* renamed from: c, reason: collision with root package name */
    public final String f23590c;

    /* renamed from: d, reason: collision with root package name */
    public final u f23591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(double d8, String congestionValue, u segmentColorType, int i3) {
        super(d8, i3);
        Intrinsics.checkNotNullParameter(congestionValue, "congestionValue");
        Intrinsics.checkNotNullParameter(segmentColorType, "segmentColorType");
        this.f23590c = congestionValue;
        this.f23591d = segmentColorType;
    }

    @Override // y9.AbstractC1978a
    public final AbstractC1978a a(double d8) {
        return new n(d8, this.f23590c, this.f23591d, this.f23550b);
    }

    @Override // y9.AbstractC1978a
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(n.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.route.line.model.RouteLineExpressionData");
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f23590c, nVar.f23590c) && this.f23591d == nVar.f23591d;
    }

    @Override // y9.AbstractC1978a
    public final int hashCode() {
        return this.f23591d.hashCode() + i2.u.d(super.hashCode() * 31, 31, this.f23590c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(24703));
        sb2.append(this.f23590c);
        sb2.append(StubApp.getString2(24704));
        sb2.append(this.f23591d);
        sb2.append(StubApp.getString2(17603));
        sb2.append(this.f23549a);
        sb2.append(StubApp.getString2(5025));
        return com.mapbox.common.b.j(sb2, this.f23550b, ')');
    }
}
