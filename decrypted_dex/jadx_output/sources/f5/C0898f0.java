package f5;

import com.stub.StubApp;

/* renamed from: f5.f0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0898f0 extends I0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0900g0 f14008a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14009b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14010c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14011d;

    public C0898f0(C0900g0 c0900g0, String str, String str2, long j) {
        this.f14008a = c0900g0;
        this.f14009b = str;
        this.f14010c = str2;
        this.f14011d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        C0898f0 c0898f0 = (C0898f0) ((I0) obj);
        if (this.f14008a.equals(c0898f0.f14008a)) {
            return this.f14009b.equals(c0898f0.f14009b) && this.f14010c.equals(c0898f0.f14010c) && this.f14011d == c0898f0.f14011d;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.f14008a.hashCode() ^ 1000003) * 1000003) ^ this.f14009b.hashCode()) * 1000003) ^ this.f14010c.hashCode()) * 1000003;
        long j = this.f14011d;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17637));
        sb2.append(this.f14008a);
        sb2.append(StubApp.getString2(17277));
        sb2.append(this.f14009b);
        sb2.append(StubApp.getString2(17278));
        sb2.append(this.f14010c);
        sb2.append(StubApp.getString2(17280));
        return Xa.h.q(sb2, this.f14011d, StubApp.getString2(265));
    }
}
