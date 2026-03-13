package Q7;

import com.stub.StubApp;
import i2.u;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f5747a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f5748b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5749c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5750d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5751e;

    public b(long j, byte b2, double d8, boolean z2, ArrayList out) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f5747a = j;
        this.f5748b = b2;
        this.f5749c = d8;
        this.f5750d = z2;
        this.f5751e = out;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.eh.EHorizonEdge");
        b bVar = (b) obj;
        return this.f5747a == bVar.f5747a && this.f5748b == bVar.f5748b && this.f5749c == bVar.f5749c && this.f5750d == bVar.f5750d && Intrinsics.areEqual(this.f5751e, bVar.f5751e);
    }

    public final int hashCode() {
        return this.f5751e.hashCode() + u.e(E1.a.d(this.f5749c, ((Long.hashCode(this.f5747a) * 31) + this.f5748b) * 31, 31), 31, this.f5750d);
    }

    public final String toString() {
        return StubApp.getString2(5299) + this.f5747a + StubApp.getString2(5300) + ((int) this.f5748b) + StubApp.getString2(5301) + this.f5749c + StubApp.getString2(5302) + this.f5750d + StubApp.getString2(5303) + this.f5751e + ')';
    }
}
