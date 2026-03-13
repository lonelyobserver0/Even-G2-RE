package Nb;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class i extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Exception f4995a;

    public i(Exception throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f4995a = throwable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.areEqual(this.f4995a, ((i) obj).f4995a);
    }

    public final int hashCode() {
        return this.f4995a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(25408) + this.f4995a + StubApp.getString2(74);
    }
}
