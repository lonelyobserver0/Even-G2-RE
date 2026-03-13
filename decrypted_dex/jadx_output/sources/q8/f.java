package q8;

import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f20094a;

    public f(List routes) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        this.f20094a = routes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f20094a, ((f) obj).f20094a);
    }

    public final int hashCode() {
        return this.f20094a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(22326) + this.f20094a + ')';
    }
}
