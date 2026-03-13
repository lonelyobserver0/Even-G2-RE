package R4;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f6173a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6174b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6175c;

    public a(long j, long j3, long j10) {
        this.f6173a = j;
        this.f6174b = j3;
        this.f6175c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f6173a == aVar.f6173a && this.f6174b == aVar.f6174b && this.f6175c == aVar.f6175c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f6173a;
        long j3 = this.f6174b;
        int i3 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j10 = this.f6175c;
        return i3 ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(5660));
        sb2.append(this.f6173a);
        sb2.append(StubApp.getString2(5661));
        sb2.append(this.f6174b);
        sb2.append(StubApp.getString2(576));
        return Xa.h.q(sb2, this.f6175c, StubApp.getString2(265));
    }
}
