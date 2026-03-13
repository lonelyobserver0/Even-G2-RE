package H3;

import com.stub.StubApp;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f2704a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2705b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f2706c;

    public c(long j, long j3, Set set) {
        this.f2704a = j;
        this.f2705b = j3;
        this.f2706c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f2704a == cVar.f2704a && this.f2705b == cVar.f2705b && this.f2706c.equals(cVar.f2706c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2704a;
        int i3 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j3 = this.f2705b;
        return ((i3 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f2706c.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(2525) + this.f2704a + StubApp.getString2(2526) + this.f2705b + StubApp.getString2(2527) + this.f2706c + StubApp.getString2(265);
    }
}
