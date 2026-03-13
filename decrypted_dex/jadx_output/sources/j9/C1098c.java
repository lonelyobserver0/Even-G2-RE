package j9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j9.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1098c {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C1098c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.camera.data.FollowingFrameOptions.FocalPoint");
        Double valueOf = Double.valueOf(0.5d);
        ((C1098c) obj).getClass();
        if (Tc.d.s(valueOf, Double.valueOf(0.5d))) {
            return Tc.d.s(Double.valueOf(1.0d), Double.valueOf(1.0d));
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(1.0d) + (Double.hashCode(0.5d) * 31);
    }

    public final String toString() {
        return StubApp.getString2(19058);
    }
}
