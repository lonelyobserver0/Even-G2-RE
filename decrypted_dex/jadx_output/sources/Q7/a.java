package Q7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f5746a;

    public a(b start) {
        Intrinsics.checkNotNullParameter(start, "start");
        this.f5746a = start;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.eh.EHorizon");
        return Intrinsics.areEqual(this.f5746a, ((a) obj).f5746a);
    }

    public final int hashCode() {
        return this.f5746a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(5298) + this.f5746a + ')';
    }
}
