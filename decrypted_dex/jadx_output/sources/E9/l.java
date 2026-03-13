package E9;

import com.stub.StubApp;
import e9.InterfaceC0853a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final F9.b f2089a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0853a f2090b;

    public l(F9.b announcement, InterfaceC0853a consumer) {
        Intrinsics.checkNotNullParameter(announcement, "announcement");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f2089a = announcement;
        this.f2090b = consumer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f2089a, lVar.f2089a) && Intrinsics.areEqual(this.f2090b, lVar.f2090b);
    }

    public final int hashCode() {
        return this.f2090b.hashCode() + (this.f2089a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(1955) + this.f2089a + StubApp.getString2(1956) + this.f2090b + ')';
    }
}
