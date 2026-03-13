package x5;

import com.stub.StubApp;

/* renamed from: x5.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1910a {

    /* renamed from: a, reason: collision with root package name */
    public final String f22866a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22867b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22868c;

    public C1910a(long j, String str, long j3) {
        this.f22866a = str;
        this.f22867b = j;
        this.f22868c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1910a) {
            C1910a c1910a = (C1910a) obj;
            if (this.f22866a.equals(c1910a.f22866a) && this.f22867b == c1910a.f22867b && this.f22868c == c1910a.f22868c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f22866a.hashCode() ^ 1000003) * 1000003;
        long j = this.f22867b;
        long j3 = this.f22868c;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(24155));
        sb2.append(this.f22866a);
        sb2.append(StubApp.getString2(24156));
        sb2.append(this.f22867b);
        sb2.append(StubApp.getString2(24157));
        return Xa.h.q(sb2, this.f22868c, StubApp.getString2(265));
    }
}
