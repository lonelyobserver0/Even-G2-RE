package I5;

import c5.i;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Zb.e f3218a;

    /* renamed from: b, reason: collision with root package name */
    public i f3219b;

    public a(Zb.e mutex) {
        Intrinsics.checkNotNullParameter(mutex, "mutex");
        this.f3218a = mutex;
        this.f3219b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f3218a, aVar.f3218a) && Intrinsics.areEqual(this.f3219b, aVar.f3219b);
    }

    public final int hashCode() {
        int hashCode = this.f3218a.hashCode() * 31;
        i iVar = this.f3219b;
        return hashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        return StubApp.getString2(2867) + this.f3218a + StubApp.getString2(2868) + this.f3219b + ')';
    }
}
