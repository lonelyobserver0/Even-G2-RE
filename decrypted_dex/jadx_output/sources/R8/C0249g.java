package R8;

import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: R8.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0249g {

    /* renamed from: a, reason: collision with root package name */
    public final List f6293a;

    /* renamed from: b, reason: collision with root package name */
    public final C0245c f6294b;

    /* renamed from: c, reason: collision with root package name */
    public final z f6295c;

    public C0249g(List routes, C0245c startCallback, z finishCallback) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(startCallback, "startCallback");
        Intrinsics.checkNotNullParameter(finishCallback, "finishCallback");
        this.f6293a = routes;
        this.f6294b = startCallback;
        this.f6295c = finishCallback;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0249g)) {
            return false;
        }
        C0249g c0249g = (C0249g) obj;
        return Intrinsics.areEqual(this.f6293a, c0249g.f6293a) && Intrinsics.areEqual(this.f6294b, c0249g.f6294b) && Intrinsics.areEqual(this.f6295c, c0249g.f6295c);
    }

    public final int hashCode() {
        return this.f6295c.hashCode() + ((this.f6294b.hashCode() + (this.f6293a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(5768) + this.f6293a + StubApp.getString2(5769) + this.f6294b + StubApp.getString2(5770) + this.f6295c + ')';
    }
}
