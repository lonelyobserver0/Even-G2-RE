package Sb;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f6714a;

    public k(Throwable th) {
        this.f6714a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return Intrinsics.areEqual(this.f6714a, ((k) obj).f6714a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f6714a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // Sb.l
    public final String toString() {
        return StubApp.getString2(25652) + this.f6714a + ')';
    }
}
