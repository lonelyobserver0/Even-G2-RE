package k9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f15509a;

    public g(long j) {
        this.f15509a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.camera.transition.NavigationCameraTransitionOptions");
        return this.f15509a == ((g) obj).f15509a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15509a);
    }

    public final String toString() {
        return StubApp.getString2(19136) + this.f15509a + ')';
    }
}
