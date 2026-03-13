package q9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: q9.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1529a {

    /* renamed from: a, reason: collision with root package name */
    public final List f20098a;

    public C1529a(List callouts) {
        Intrinsics.checkNotNullParameter(callouts, "callouts");
        this.f20098a = callouts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C1529a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.internal.route.callout.model.RouteCalloutData");
        return Intrinsics.areEqual(this.f20098a, ((C1529a) obj).f20098a);
    }

    public final int hashCode() {
        return this.f20098a.hashCode();
    }
}
