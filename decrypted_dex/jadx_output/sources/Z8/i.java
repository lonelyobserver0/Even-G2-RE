package Z8;

import com.mapbox.navigator.NavigationStatus;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.mapbox.navigation.base.route.g f9066a;

    /* renamed from: b, reason: collision with root package name */
    public final NavigationStatus f9067b;

    public i(com.mapbox.navigation.base.route.g gVar, NavigationStatus navigationStatus) {
        Intrinsics.checkNotNullParameter(navigationStatus, "navigationStatus");
        this.f9066a = gVar;
        this.f9067b = navigationStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f9066a, iVar.f9066a) && Intrinsics.areEqual(this.f9067b, iVar.f9067b);
    }

    public final int hashCode() {
        com.mapbox.navigation.base.route.g gVar = this.f9066a;
        return this.f9067b.hashCode() + ((gVar == null ? 0 : gVar.hashCode()) * 31);
    }

    public final String toString() {
        return StubApp.getString2(7667) + this.f9066a + StubApp.getString2(7668) + this.f9067b + ')';
    }
}
