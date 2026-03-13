package X8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f8506a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f8507b;

    /* renamed from: c, reason: collision with root package name */
    public final byte f8508c;

    public c(String state, byte b2, byte b10) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f8506a = state;
        this.f8507b = b2;
        this.f8508c = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.trip.session.location.DRSensorFusionStatus");
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f8506a, cVar.f8506a) && this.f8507b == cVar.f8507b && this.f8508c == cVar.f8508c;
    }

    public final int hashCode() {
        return (((this.f8506a.hashCode() * 31) + this.f8507b) * 31) + this.f8508c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(7316));
        sb2.append(this.f8506a);
        sb2.append(StubApp.getString2(7317));
        sb2.append((int) this.f8507b);
        sb2.append(StubApp.getString2(7318));
        return com.mapbox.common.b.j(sb2, this.f8508c, ')');
    }
}
