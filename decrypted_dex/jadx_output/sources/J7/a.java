package J7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final p f3413a;

    public a(p routeResponseInfo) {
        Intrinsics.checkNotNullParameter(routeResponseInfo, "routeResponseInfo");
        this.f3413a = routeResponseInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f3413a, ((a) obj).f3413a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3413a.f3451a);
    }

    public final String toString() {
        return StubApp.getString2(3024) + this.f3413a + ')';
    }
}
