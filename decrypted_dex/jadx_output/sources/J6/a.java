package J6;

import Xa.h;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3411a;

    public a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f3411a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f3411a, ((a) obj).f3411a);
    }

    public final int hashCode() {
        return this.f3411a.hashCode();
    }

    public final String toString() {
        return h.s(new StringBuilder(StubApp.getString2(3022)), this.f3411a, ')');
    }
}
