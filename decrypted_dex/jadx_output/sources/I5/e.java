package I5;

import Xa.h;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3233a;

    public e(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f3233a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f3233a, ((e) obj).f3233a);
    }

    public final int hashCode() {
        return this.f3233a.hashCode();
    }

    public final String toString() {
        return h.s(new StringBuilder(StubApp.getString2(2572)), this.f3233a, ')');
    }
}
