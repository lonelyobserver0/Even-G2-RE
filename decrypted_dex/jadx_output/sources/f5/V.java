package f5;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class V extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13929a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13930b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13931c;

    public V(long j, String str, String str2) {
        this.f13929a = str;
        this.f13930b = str2;
        this.f13931c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (this.f13929a.equals(((V) z0Var).f13929a)) {
                V v2 = (V) z0Var;
                if (this.f13930b.equals(v2.f13930b) && this.f13931c == v2.f13931c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f13929a.hashCode() ^ 1000003) * 1000003) ^ this.f13930b.hashCode()) * 1000003;
        long j = this.f13931c;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17595));
        sb2.append(this.f13929a);
        sb2.append(StubApp.getString2(573));
        sb2.append(this.f13930b);
        sb2.append(StubApp.getString2(2245));
        return Xa.h.q(sb2, this.f13931c, StubApp.getString2(265));
    }
}
