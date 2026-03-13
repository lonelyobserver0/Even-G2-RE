package u9;

import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u9.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1782b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21478a;

    public C1782b(ArrayList callouts) {
        Intrinsics.checkNotNullParameter(callouts, "callouts");
        this.f21478a = callouts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C1782b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.route.callout.api.RouteCalloutUiStateData");
        return Intrinsics.areEqual(this.f21478a, ((C1782b) obj).f21478a);
    }

    public final int hashCode() {
        return this.f21478a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(23584) + this.f21478a + ')';
    }
}
