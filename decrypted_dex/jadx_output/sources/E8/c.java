package E8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f1936a;

    /* renamed from: b, reason: collision with root package name */
    public final a f1937b;

    public c(b reason, a origin) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f1936a = reason;
        this.f1937b = origin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1936a == cVar.f1936a && this.f1937b == cVar.f1937b;
    }

    public final int hashCode() {
        return this.f1937b.hashCode() + (this.f1936a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(1885) + this.f1936a + StubApp.getString2(1886) + this.f1937b + ')';
    }
}
