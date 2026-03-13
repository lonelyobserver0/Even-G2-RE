package P8;

import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final List f5641a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0624h2 f5642b;

    public k(List newRoutes, AbstractC0624h2 type) {
        Intrinsics.checkNotNullParameter(newRoutes, "newRoutes");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f5641a = newRoutes;
        this.f5642b = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f5641a, kVar.f5641a) && Intrinsics.areEqual(this.f5642b, kVar.f5642b);
    }

    public final int hashCode() {
        return this.f5642b.hashCode() + (this.f5641a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(5039) + this.f5641a + StubApp.getString2(2148) + this.f5642b + ')';
    }
}
