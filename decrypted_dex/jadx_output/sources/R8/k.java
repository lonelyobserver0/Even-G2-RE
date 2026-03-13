package R8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f6305a;

    public k(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f6305a = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.areEqual(this.f6305a, ((k) obj).f6305a);
    }

    public final int hashCode() {
        return this.f6305a.hashCode();
    }

    public final String toString() {
        return Xa.h.s(new StringBuilder(StubApp.getString2(5792)), this.f6305a, ')');
    }
}
