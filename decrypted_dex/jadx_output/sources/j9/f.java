package j9;

import com.mapbox.maps.CameraOptions;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final CameraOptions f15413a;

    /* renamed from: b, reason: collision with root package name */
    public final CameraOptions f15414b;

    public f(CameraOptions cameraForFollowing, CameraOptions cameraForOverview) {
        Intrinsics.checkNotNullParameter(cameraForFollowing, "cameraForFollowing");
        Intrinsics.checkNotNullParameter(cameraForOverview, "cameraForOverview");
        this.f15413a = cameraForFollowing;
        this.f15414b = cameraForOverview;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.camera.data.ViewportData");
        f fVar = (f) obj;
        if (Intrinsics.areEqual(this.f15413a, fVar.f15413a)) {
            return Intrinsics.areEqual(this.f15414b, fVar.f15414b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15414b.hashCode() + (this.f15413a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(19070) + this.f15413a + StubApp.getString2(19071) + this.f15414b + ')';
    }
}
