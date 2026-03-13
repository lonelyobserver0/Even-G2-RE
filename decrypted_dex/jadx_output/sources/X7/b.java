package X7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f8480a;

    public b(Integer num) {
        this.f8480a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.incident.IncidentCongestion");
        return Intrinsics.areEqual(this.f8480a, ((b) obj).f8480a);
    }

    public final int hashCode() {
        Integer num = this.f8480a;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return StubApp.getString2(7291) + this.f8480a + ')';
    }
}
