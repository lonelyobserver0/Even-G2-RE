package Q7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f5756a;

    /* renamed from: b, reason: collision with root package name */
    public final double f5757b;

    public d(long j, double d8) {
        this.f5756a = j;
        this.f5757b = d8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.eh.EHorizonGraphPosition");
        d dVar = (d) obj;
        return this.f5756a == dVar.f5756a && this.f5757b == dVar.f5757b;
    }

    public final int hashCode() {
        return Double.hashCode(this.f5757b) + (Long.hashCode(this.f5756a) * 31);
    }

    public final String toString() {
        return StubApp.getString2(5308) + this.f5756a + StubApp.getString2(5309) + this.f5757b + ')';
    }
}
