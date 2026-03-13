package O8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final E8.c f5285a;

    public y(E8.c signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f5285a = signature;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.areEqual(this.f5285a, ((y) obj).f5285a);
    }

    public final int hashCode() {
        return this.f5285a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(4471) + this.f5285a + ')';
    }
}
