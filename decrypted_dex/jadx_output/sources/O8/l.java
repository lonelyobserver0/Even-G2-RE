package O8;

import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5253a;

    public l(ArrayList newRoutes) {
        Intrinsics.checkNotNullParameter(newRoutes, "newRoutes");
        this.f5253a = newRoutes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return Intrinsics.areEqual(this.f5253a, ((l) obj).f5253a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (this.f5253a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(4457) + this.f5253a + StubApp.getString2(4458);
    }
}
