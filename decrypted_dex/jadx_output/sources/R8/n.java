package R8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n extends p {

    /* renamed from: a, reason: collision with root package name */
    public final E8.d f6307a;

    public n(E8.d error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f6307a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.areEqual(this.f6307a, ((n) obj).f6307a);
    }

    public final int hashCode() {
        return this.f6307a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(5793) + this.f6307a + ')';
    }
}
