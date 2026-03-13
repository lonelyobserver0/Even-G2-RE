package L7;

import com.stub.StubApp;
import i2.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.options.AlertServiceOptions");
        ((a) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + u.e(u.e(u.e(Boolean.hashCode(true) * 31, 31, true), 31, false), 31, false);
    }

    public final String toString() {
        return StubApp.getString2(3424);
    }
}
