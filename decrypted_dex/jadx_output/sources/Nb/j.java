package Nb;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import vb.EnumC1846c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Kb.b f4996a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1846c f4997b;

    public j(Kb.b body, EnumC1846c code) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f4996a = body;
        this.f4997b = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f4996a, jVar.f4996a) && this.f4997b == jVar.f4997b;
    }

    public final int hashCode() {
        return this.f4997b.hashCode() + (this.f4996a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(25409) + this.f4996a + StubApp.getString2(573) + this.f4997b + StubApp.getString2(74);
    }
}
