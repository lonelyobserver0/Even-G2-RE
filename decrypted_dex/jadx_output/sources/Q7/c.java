package Q7;

import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f5752a;

    /* renamed from: b, reason: collision with root package name */
    public final double f5753b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5754c;

    /* renamed from: d, reason: collision with root package name */
    public final double f5755d;

    public c(List edges, double d8, double d10, double d11) {
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.f5752a = edges;
        this.f5753b = d8;
        this.f5754c = d10;
        this.f5755d = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.eh.EHorizonGraphPath");
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f5752a, cVar.f5752a) && this.f5753b == cVar.f5753b && this.f5754c == cVar.f5754c && this.f5755d == cVar.f5755d;
    }

    public final int hashCode() {
        return Double.hashCode(this.f5755d) + E1.a.d(this.f5754c, E1.a.d(this.f5753b, this.f5752a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return StubApp.getString2(5304) + this.f5752a + StubApp.getString2(5305) + this.f5753b + StubApp.getString2(5306) + this.f5754c + StubApp.getString2(5307) + this.f5755d + ')';
    }
}
