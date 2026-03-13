package V8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r extends s {

    /* renamed from: a, reason: collision with root package name */
    public final String f7895a;

    public r(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f7895a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(r.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.trip.session.NativeSetRouteError");
        return Intrinsics.areEqual(this.f7895a, ((r) obj).f7895a);
    }

    public final int hashCode() {
        return this.f7895a.hashCode();
    }

    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(6732)), this.f7895a, StubApp.getString2(2142));
    }
}
