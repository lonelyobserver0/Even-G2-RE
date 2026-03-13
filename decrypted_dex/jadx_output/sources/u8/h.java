package u8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f21467a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21468b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f21469c;

    public h(int i3, int i10, Integer num) {
        this.f21467a = i3;
        this.f21468b = i10;
        this.f21469c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f21467a == hVar.f21467a && this.f21468b == hVar.f21468b && Intrinsics.areEqual(this.f21469c, hVar.f21469c);
    }

    public final int hashCode() {
        int e10 = E1.a.e(this.f21468b, Integer.hashCode(this.f21467a) * 31, 31);
        Integer num = this.f21469c;
        return e10 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return StubApp.getString2(23578) + this.f21467a + StubApp.getString2(2689) + this.f21468b + StubApp.getString2(2690) + this.f21469c + ')';
    }
}
