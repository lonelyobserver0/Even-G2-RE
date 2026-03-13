package L7;

import com.stub.StubApp;
import i2.u;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.options.CopilotOptions");
        ((b) obj).getClass();
        return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return u.e(u.e(com.mapbox.common.b.b((((Long.hashCode(LongCompanionObject.MAX_VALUE) + (Boolean.hashCode(false) * 31)) * 31) + IntCompanionObject.MAX_VALUE) * 31, 31, LongCompanionObject.MAX_VALUE), 31, true), 961, false);
    }

    public final String toString() {
        return StubApp.getString2(3425);
    }
}
