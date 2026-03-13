package y3;

import com.stub.StubApp;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1968a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f23501a;

    /* renamed from: b, reason: collision with root package name */
    public final d f23502b;

    /* renamed from: c, reason: collision with root package name */
    public final C1969b f23503c;

    public C1968a(Object obj, d dVar, C1969b c1969b) {
        this.f23501a = obj;
        this.f23502b = dVar;
        this.f23503c = c1969b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1968a) {
            C1968a c1968a = (C1968a) obj;
            c1968a.getClass();
            if (this.f23501a.equals(c1968a.f23501a) && this.f23502b.equals(c1968a.f23502b)) {
                C1969b c1969b = c1968a.f23503c;
                C1969b c1969b2 = this.f23503c;
                if (c1969b2 != null ? c1969b2.equals(c1969b) : c1969b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((1000003 * 1000003) ^ this.f23501a.hashCode()) * 1000003) ^ this.f23502b.hashCode()) * 1000003;
        C1969b c1969b = this.f23503c;
        return (hashCode ^ (c1969b == null ? 0 : c1969b.hashCode())) * 1000003;
    }

    public final String toString() {
        return StubApp.getString2(24635) + this.f23501a + StubApp.getString2(24636) + this.f23502b + StubApp.getString2(24637) + this.f23503c + StubApp.getString2(24638);
    }
}
