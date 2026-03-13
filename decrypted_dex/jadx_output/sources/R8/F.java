package R8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class F extends H {

    /* renamed from: a, reason: collision with root package name */
    public final I f6269a;

    public F(I value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f6269a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F) && Intrinsics.areEqual(this.f6269a, ((F) obj).f6269a);
    }

    public final int hashCode() {
        return this.f6269a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(5763) + this.f6269a + ')';
    }
}
