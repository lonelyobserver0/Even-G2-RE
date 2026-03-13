package f5;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class T extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f13920a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13921b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13922c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13923d;

    public T(long j, long j3, String str, String str2) {
        this.f13920a = j;
        this.f13921b = j3;
        this.f13922c = str;
        this.f13923d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            if (this.f13920a == ((T) x0Var).f13920a) {
                T t3 = (T) x0Var;
                if (this.f13921b == t3.f13921b && this.f13922c.equals(t3.f13922c)) {
                    String str = t3.f13923d;
                    String str2 = this.f13923d;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f13920a;
        long j3 = this.f13921b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f13922c.hashCode()) * 1000003;
        String str = this.f13923d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17590));
        sb2.append(this.f13920a);
        sb2.append(StubApp.getString2(14652));
        sb2.append(this.f13921b);
        sb2.append(StubApp.getString2(1065));
        sb2.append(this.f13922c);
        sb2.append(StubApp.getString2(11360));
        return AbstractC1482f.k(sb2, this.f13923d, StubApp.getString2(265));
    }
}
