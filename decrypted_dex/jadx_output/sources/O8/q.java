package O8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f5271a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5272b;

    public q(String message, boolean z2) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f5271a = message;
        this.f5272b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f5271a, qVar.f5271a) && this.f5272b == qVar.f5272b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f5271a.hashCode() * 31;
        boolean z2 = this.f5272b;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        return hashCode + i3;
    }

    public final String toString() {
        return StubApp.getString2(4462) + this.f5271a + StubApp.getString2(4463) + this.f5272b + ')';
    }
}
