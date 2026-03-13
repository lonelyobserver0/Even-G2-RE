package I3;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f3110a;

    /* renamed from: b, reason: collision with root package name */
    public final B3.j f3111b;

    /* renamed from: c, reason: collision with root package name */
    public final B3.i f3112c;

    public b(long j, B3.j jVar, B3.i iVar) {
        this.f3110a = j;
        this.f3111b = jVar;
        this.f3112c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f3110a == bVar.f3110a && this.f3111b.equals(bVar.f3111b) && this.f3112c.equals(bVar.f3112c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3110a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f3111b.hashCode()) * 1000003) ^ this.f3112c.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(2823) + this.f3110a + StubApp.getString2(2824) + this.f3111b + StubApp.getString2(2825) + this.f3112c + StubApp.getString2(265);
    }
}
