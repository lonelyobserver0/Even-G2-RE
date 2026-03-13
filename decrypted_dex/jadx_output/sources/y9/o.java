package y9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f23592a;

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return Intrinsics.areEqual(this.f23592a, ((o) obj).f23592a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f23592a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return Xa.h.s(new StringBuilder(StubApp.getString2(24705)), this.f23592a, ')');
    }
}
