package y3;

import com.stub.StubApp;

/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1969b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f23504a;

    public C1969b(Integer num) {
        this.f23504a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1969b)) {
            return false;
        }
        C1969b c1969b = (C1969b) obj;
        Integer num = this.f23504a;
        return num == null ? c1969b.f23504a == null : num.equals(c1969b.f23504a);
    }

    public final int hashCode() {
        Integer num = this.f23504a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return StubApp.getString2(24639) + this.f23504a + StubApp.getString2(265);
    }
}
