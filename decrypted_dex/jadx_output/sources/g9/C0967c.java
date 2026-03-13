package g9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g9.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0967c {

    /* renamed from: a, reason: collision with root package name */
    public final C0965a f14240a;

    public C0967c(C0965a c0965a) {
        this.f14240a = c0965a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0967c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.components.maneuver.model.ManeuverSecondaryOptions");
        C0967c c0967c = (C0967c) obj;
        c0967c.getClass();
        return Intrinsics.areEqual(this.f14240a, c0967c.f14240a);
    }

    public final int hashCode() {
        return this.f14240a.hashCode() + (Integer.hashCode(2131820806) * 31);
    }

    public final String toString() {
        return StubApp.getString2(17814) + this.f14240a + ')';
    }
}
