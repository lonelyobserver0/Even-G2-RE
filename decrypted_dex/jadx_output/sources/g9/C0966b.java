package g9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g9.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0966b {

    /* renamed from: a, reason: collision with root package name */
    public final C0965a f14239a;

    public C0966b(C0965a c0965a) {
        this.f14239a = c0965a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0966b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.components.maneuver.model.ManeuverPrimaryOptions");
        C0966b c0966b = (C0966b) obj;
        c0966b.getClass();
        return Intrinsics.areEqual(this.f14239a, c0966b.f14239a);
    }

    public final int hashCode() {
        return this.f14239a.hashCode() + (Integer.hashCode(2131820797) * 31);
    }

    public final String toString() {
        return StubApp.getString2(17813) + this.f14239a + ')';
    }
}
