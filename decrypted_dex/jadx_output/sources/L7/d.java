package L7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f4272a;

    public d(a aVar) {
        this.f4272a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.options.EHorizonOptions");
        d dVar = (d) obj;
        dVar.getClass();
        return Intrinsics.areEqual((Double) null, (Double) null) && Intrinsics.areEqual(this.f4272a, dVar.f4272a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f4272a.hashCode() + E1.a.d(50.0d, E1.a.e(0, Double.hashCode(500.0d) * 31, 31), 961)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(3428) + this.f4272a + StubApp.getString2(3429);
    }
}
