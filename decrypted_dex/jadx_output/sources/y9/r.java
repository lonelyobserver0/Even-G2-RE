package y9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f23600a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return Intrinsics.areEqual(this.f23600a, ((r) obj).f23600a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23600a.hashCode();
    }

    public final String toString() {
        return Xa.h.s(new StringBuilder(StubApp.getString2(24712)), this.f23600a, ')');
    }
}
