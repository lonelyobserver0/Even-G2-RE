package C3;

import Xa.h;
import com.stub.StubApp;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1104a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1105b;

    public a(int i3, long j) {
        if (i3 == 0) {
            throw new NullPointerException(StubApp.getString2(1114));
        }
        this.f1104a = i3;
        this.f1105b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC1856e.a(this.f1104a, aVar.f1104a) && this.f1105b == aVar.f1105b;
    }

    public final int hashCode() {
        int c10 = (AbstractC1856e.c(this.f1104a) ^ 1000003) * 1000003;
        long j = this.f1105b;
        return c10 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1115));
        int i3 = this.f1104a;
        sb2.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? StubApp.getString2(1116) : StubApp.getString2(1117) : StubApp.getString2(1118) : StubApp.getString2(1119) : StubApp.getString2(421));
        sb2.append(StubApp.getString2(1120));
        return h.q(sb2, this.f1105b, StubApp.getString2(265));
    }
}
