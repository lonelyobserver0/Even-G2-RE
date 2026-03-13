package Q7;

import Xa.h;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final d f5763a;

    /* renamed from: b, reason: collision with root package name */
    public final a f5764b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5765c;

    public f(d eHorizonGraphPosition, a eHorizon, String eHorizonResultType) {
        Intrinsics.checkNotNullParameter(eHorizonGraphPosition, "eHorizonGraphPosition");
        Intrinsics.checkNotNullParameter(eHorizon, "eHorizon");
        Intrinsics.checkNotNullParameter(eHorizonResultType, "eHorizonResultType");
        this.f5763a = eHorizonGraphPosition;
        this.f5764b = eHorizon;
        this.f5765c = eHorizonResultType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.eh.EHorizonPosition");
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f5763a, fVar.f5763a) && Intrinsics.areEqual(this.f5764b, fVar.f5764b) && Intrinsics.areEqual(this.f5765c, fVar.f5765c);
    }

    public final int hashCode() {
        return this.f5765c.hashCode() + ((this.f5764b.f5746a.hashCode() + (this.f5763a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(5310));
        sb2.append(this.f5763a);
        sb2.append(StubApp.getString2(5311));
        sb2.append(this.f5764b);
        sb2.append(StubApp.getString2(5312));
        return h.s(sb2, this.f5765c, ')');
    }
}
