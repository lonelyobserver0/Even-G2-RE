package z0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f23707a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23708b;

    public q(long j, long j3) {
        this.f23707a = j;
        this.f23708b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f23707a == qVar.f23707a && this.f23708b == qVar.f23708b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f23707a) * 31) + ((int) this.f23708b);
    }
}
