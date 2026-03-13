package u8;

import com.stub.StubApp;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final h f21470a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f21471b;

    public i(h primary, LinkedHashMap alternatives) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(alternatives, "alternatives");
        this.f21470a = primary;
        this.f21471b = alternatives;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f21470a, iVar.f21470a) && Intrinsics.areEqual(this.f21471b, iVar.f21471b);
    }

    public final int hashCode() {
        return this.f21471b.hashCode() + (this.f21470a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(23579) + this.f21470a + StubApp.getString2(12836) + this.f21471b + ')';
    }
}
