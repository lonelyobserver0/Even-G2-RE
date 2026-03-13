package F9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f2342a;

    public g(String exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f2342a = exception;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.areEqual(this.f2342a, ((g) obj).f2342a);
    }

    public final int hashCode() {
        return this.f2342a.hashCode();
    }

    public final String toString() {
        return Xa.h.s(new StringBuilder(StubApp.getString2(2192)), this.f2342a, ')');
    }
}
