package z0;

import com.stub.StubApp;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f23687a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23688b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23689c;

    /* renamed from: d, reason: collision with root package name */
    public int f23690d;

    public j(long j, String str, long j3) {
        this.f23689c = str == null ? "" : str;
        this.f23687a = j;
        this.f23688b = j3;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String t3 = AbstractC1550k.t(str, this.f23689c);
        if (jVar == null || !t3.equals(AbstractC1550k.t(str, jVar.f23689c))) {
            return null;
        }
        long j = this.f23688b;
        long j3 = jVar.f23688b;
        if (j != -1) {
            long j10 = this.f23687a;
            jVar2 = null;
            if (j10 + j == jVar.f23687a) {
                return new j(j10, t3, j3 != -1 ? j + j3 : -1L);
            }
        } else {
            jVar2 = null;
        }
        if (j3 == -1) {
            return jVar2;
        }
        long j11 = jVar.f23687a;
        if (j11 + j3 == this.f23687a) {
            return new j(j11, t3, j != -1 ? j3 + j : -1L);
        }
        return jVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f23687a == jVar.f23687a && this.f23688b == jVar.f23688b && this.f23689c.equals(jVar.f23689c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f23690d == 0) {
            this.f23690d = this.f23689c.hashCode() + ((((527 + ((int) this.f23687a)) * 31) + ((int) this.f23688b)) * 31);
        }
        return this.f23690d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(24857));
        sb2.append(this.f23689c);
        sb2.append(StubApp.getString2(24858));
        sb2.append(this.f23687a);
        sb2.append(StubApp.getString2(5307));
        return Xa.h.q(sb2, this.f23688b, StubApp.getString2(74));
    }
}
