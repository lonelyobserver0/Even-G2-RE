package g9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final C0965a f14241a;

    public d(C0965a c0965a) {
        this.f14241a = c0965a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.components.maneuver.model.ManeuverSubOptions");
        d dVar = (d) obj;
        dVar.getClass();
        return Intrinsics.areEqual(this.f14241a, dVar.f14241a);
    }

    public final int hashCode() {
        return this.f14241a.hashCode() + (Integer.hashCode(2131820812) * 31);
    }

    public final String toString() {
        return StubApp.getString2(17815) + this.f14241a + ')';
    }
}
