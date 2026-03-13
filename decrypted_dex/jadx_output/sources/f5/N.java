package f5;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class N extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13885a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13886b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13887c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13888d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13889e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13890f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13891g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13892h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13893i;

    public N(int i3, String str, int i10, long j, long j3, boolean z2, int i11, String str2, String str3) {
        this.f13885a = i3;
        this.f13886b = str;
        this.f13887c = i10;
        this.f13888d = j;
        this.f13889e = j3;
        this.f13890f = z2;
        this.f13891g = i11;
        this.f13892h = str2;
        this.f13893i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f13885a == ((N) w0Var).f13885a) {
                N n10 = (N) w0Var;
                if (this.f13886b.equals(n10.f13886b) && this.f13887c == n10.f13887c && this.f13888d == n10.f13888d && this.f13889e == n10.f13889e && this.f13890f == n10.f13890f && this.f13891g == n10.f13891g && this.f13892h.equals(n10.f13892h) && this.f13893i.equals(n10.f13893i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.f13885a ^ 1000003) * 1000003) ^ this.f13886b.hashCode()) * 1000003) ^ this.f13887c) * 1000003;
        long j = this.f13888d;
        int i3 = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j3 = this.f13889e;
        return ((((((((i3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f13890f ? 1231 : 1237)) * 1000003) ^ this.f13891g) * 1000003) ^ this.f13892h.hashCode()) * 1000003) ^ this.f13893i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17571));
        sb2.append(this.f13885a);
        sb2.append(StubApp.getString2(254));
        sb2.append(this.f13886b);
        sb2.append(StubApp.getString2(17572));
        sb2.append(this.f13887c);
        sb2.append(StubApp.getString2(17573));
        sb2.append(this.f13888d);
        sb2.append(StubApp.getString2(17574));
        sb2.append(this.f13889e);
        sb2.append(StubApp.getString2(17575));
        sb2.append(this.f13890f);
        sb2.append(StubApp.getString2(9384));
        sb2.append(this.f13891g);
        sb2.append(StubApp.getString2(259));
        sb2.append(this.f13892h);
        sb2.append(StubApp.getString2(17576));
        return AbstractC1482f.k(sb2, this.f13893i, StubApp.getString2(265));
    }
}
