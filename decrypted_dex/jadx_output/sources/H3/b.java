package H3;

import com.stub.StubApp;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final K3.a f2702a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2703b;

    public b(K3.a aVar, HashMap hashMap) {
        this.f2702a = aVar;
        this.f2703b = hashMap;
    }

    public final long a(y3.d dVar, long j, int i3) {
        long f10 = j - this.f2702a.f();
        c cVar = (c) this.f2703b.get(dVar);
        long j3 = cVar.f2704a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i3 - 1) * j3 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j3 > 1 ? j3 : 2L) * r12))), f10), cVar.f2705b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2702a.equals(bVar.f2702a) && this.f2703b.equals(bVar.f2703b);
    }

    public final int hashCode() {
        return ((this.f2702a.hashCode() ^ 1000003) * 1000003) ^ this.f2703b.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(2523) + this.f2702a + StubApp.getString2(2524) + this.f2703b + StubApp.getString2(265);
    }
}
