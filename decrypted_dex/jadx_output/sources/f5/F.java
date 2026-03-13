package f5;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class F extends r0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13841a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13842b;

    public F(String str, String str2) {
        this.f13841a = str;
        this.f13842b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            if (this.f13841a.equals(((F) r0Var).f13841a) && this.f13842b.equals(((F) r0Var).f13842b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13841a.hashCode() ^ 1000003) * 1000003) ^ this.f13842b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17542));
        sb2.append(this.f13841a);
        sb2.append(StubApp.getString2(12722));
        return AbstractC1482f.k(sb2, this.f13842b, StubApp.getString2(265));
    }
}
