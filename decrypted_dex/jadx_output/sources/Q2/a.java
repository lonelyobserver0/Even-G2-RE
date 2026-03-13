package Q2;

import Xa.h;
import com.stub.StubApp;
import i2.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5698a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5699b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5700c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5701d;

    public a(long j, String title, String content, int i3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f5698a = i3;
        this.f5699b = title;
        this.f5700c = content;
        this.f5701d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return this.f5698a == aVar.f5698a && Intrinsics.areEqual(this.f5699b, aVar.f5699b) && Intrinsics.areEqual(this.f5700c, aVar.f5700c) && this.f5701d == aVar.f5701d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5701d) + u.d(u.d(E1.a.e(this.f5698a, Long.hashCode(0L) * 31, 31), 31, this.f5699b), 31, this.f5700c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(5056));
        sb2.append(this.f5698a);
        sb2.append(StubApp.getString2(5057));
        sb2.append(this.f5699b);
        sb2.append(StubApp.getString2(5058));
        sb2.append(this.f5700c);
        sb2.append(StubApp.getString2(5059));
        return h.q(sb2, this.f5701d, StubApp.getString2(74));
    }
}
