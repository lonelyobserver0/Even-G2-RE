package R7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f6246a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f6247b;

    public f(b roadObject, Double d8) {
        Intrinsics.checkNotNullParameter(roadObject, "roadObject");
        this.f6246a = roadObject;
        this.f6247b = d8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.UpcomingRoadObject");
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f6246a, fVar.f6246a) && Intrinsics.areEqual(this.f6247b, fVar.f6247b) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        int hashCode = this.f6246a.hashCode() * 31;
        Double d8 = this.f6247b;
        return (hashCode + (d8 != null ? d8.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return StubApp.getString2(5752) + this.f6246a + StubApp.getString2(5753) + this.f6247b + StubApp.getString2(5754);
    }
}
