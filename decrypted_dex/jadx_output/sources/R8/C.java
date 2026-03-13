package R8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final com.mapbox.navigation.base.route.g f6256a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6257b;

    /* renamed from: c, reason: collision with root package name */
    public final E f6258c;

    public C(com.mapbox.navigation.base.route.g route, Object obj, E status) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f6256a = route;
        this.f6257b = obj;
        this.f6258c = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return Intrinsics.areEqual(this.f6256a, c10.f6256a) && Intrinsics.areEqual(this.f6257b, c10.f6257b) && this.f6258c == c10.f6258c;
    }

    public final int hashCode() {
        int hashCode = this.f6256a.hashCode() * 31;
        Object obj = this.f6257b;
        return this.f6258c.hashCode() + ((hashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        return StubApp.getString2(5755) + this.f6256a + StubApp.getString2(5756) + this.f6257b + StubApp.getString2(5757) + this.f6258c + ')';
    }
}
