package F7;

import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2306a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2307b;

    public h(ArrayList routes, g meta) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.f2306a = routes;
        this.f2307b = meta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f2306a, hVar.f2306a) && Intrinsics.areEqual(this.f2307b, hVar.f2307b);
    }

    public final int hashCode() {
        return this.f2307b.hashCode() + (this.f2306a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(2137) + this.f2306a + StubApp.getString2(2138) + this.f2307b + ')';
    }
}
