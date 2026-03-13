package m8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class D extends G {

    /* renamed from: a, reason: collision with root package name */
    public final u8.h f17150a;

    public D(u8.h routeProgressData) {
        Intrinsics.checkNotNullParameter(routeProgressData, "routeProgressData");
        this.f17150a = routeProgressData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            return Intrinsics.areEqual(this.f17150a, ((D) obj).f17150a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17150a.hashCode() * 31;
    }

    public final String toString() {
        return StubApp.getString2(21092) + this.f17150a + StubApp.getString2(21093);
    }
}
