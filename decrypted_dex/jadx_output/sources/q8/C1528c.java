package q8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* renamed from: q8.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1528c {

    /* renamed from: a, reason: collision with root package name */
    public final com.mapbox.navigation.base.route.g f20087a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20088b;

    public C1528c(com.mapbox.navigation.base.route.g navigationRoute, String reason) {
        Intrinsics.checkNotNullParameter(navigationRoute, "navigationRoute");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f20087a = navigationRoute;
        this.f20088b = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C1528c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.directions.session.IgnoredRoute");
        C1528c c1528c = (C1528c) obj;
        return Intrinsics.areEqual(this.f20087a, c1528c.f20087a) && Intrinsics.areEqual(this.f20088b, c1528c.f20088b);
    }

    public final int hashCode() {
        return this.f20088b.hashCode() + (this.f20087a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(22320));
        sb2.append(this.f20087a);
        sb2.append(StubApp.getString2(22321));
        return AbstractC1482f.k(sb2, this.f20088b, StubApp.getString2(2142));
    }
}
