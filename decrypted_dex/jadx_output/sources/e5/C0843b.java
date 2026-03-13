package e5;

import com.stub.StubApp;

/* renamed from: e5.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0843b extends n {

    /* renamed from: b, reason: collision with root package name */
    public final String f13602b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13603c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13604d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13605e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13606f;

    public C0843b(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(17275));
        }
        this.f13602b = str;
        if (str2 == null) {
            throw new NullPointerException(StubApp.getString2(17274));
        }
        this.f13603c = str2;
        if (str3 == null) {
            throw new NullPointerException(StubApp.getString2(17273));
        }
        this.f13604d = str3;
        if (str4 == null) {
            throw new NullPointerException(StubApp.getString2(17272));
        }
        this.f13605e = str4;
        this.f13606f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f13602b.equals(((C0843b) nVar).f13602b)) {
                C0843b c0843b = (C0843b) nVar;
                if (this.f13603c.equals(c0843b.f13603c) && this.f13604d.equals(c0843b.f13604d) && this.f13605e.equals(c0843b.f13605e) && this.f13606f == c0843b.f13606f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f13602b.hashCode() ^ 1000003) * 1000003) ^ this.f13603c.hashCode()) * 1000003) ^ this.f13604d.hashCode()) * 1000003) ^ this.f13605e.hashCode()) * 1000003;
        long j = this.f13606f;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17276));
        sb2.append(this.f13602b);
        sb2.append(StubApp.getString2(17277));
        sb2.append(this.f13603c);
        sb2.append(StubApp.getString2(17278));
        sb2.append(this.f13604d);
        sb2.append(StubApp.getString2(17279));
        sb2.append(this.f13605e);
        sb2.append(StubApp.getString2(17280));
        return Xa.h.q(sb2, this.f13606f, StubApp.getString2(265));
    }
}
