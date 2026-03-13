package f5;

import com.stub.StubApp;

/* renamed from: f5.c0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0892c0 extends F0 {

    /* renamed from: a, reason: collision with root package name */
    public final Double f13978a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13979b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13980c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13981d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13982e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13983f;

    public C0892c0(Double d8, int i3, boolean z2, int i10, long j, long j3) {
        this.f13978a = d8;
        this.f13979b = i3;
        this.f13980c = z2;
        this.f13981d = i10;
        this.f13982e = j;
        this.f13983f = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F0) {
            F0 f02 = (F0) obj;
            Double d8 = this.f13978a;
            if (d8 != null ? d8.equals(((C0892c0) f02).f13978a) : ((C0892c0) f02).f13978a == null) {
                if (this.f13979b == ((C0892c0) f02).f13979b) {
                    C0892c0 c0892c0 = (C0892c0) f02;
                    if (this.f13980c == c0892c0.f13980c && this.f13981d == c0892c0.f13981d && this.f13982e == c0892c0.f13982e && this.f13983f == c0892c0.f13983f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d8 = this.f13978a;
        int hashCode = ((((((((d8 == null ? 0 : d8.hashCode()) ^ 1000003) * 1000003) ^ this.f13979b) * 1000003) ^ (this.f13980c ? 1231 : 1237)) * 1000003) ^ this.f13981d) * 1000003;
        long j = this.f13982e;
        long j3 = this.f13983f;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17617));
        sb2.append(this.f13978a);
        sb2.append(StubApp.getString2(17618));
        sb2.append(this.f13979b);
        sb2.append(StubApp.getString2(17619));
        sb2.append(this.f13980c);
        sb2.append(StubApp.getString2(17620));
        sb2.append(this.f13981d);
        sb2.append(StubApp.getString2(17621));
        sb2.append(this.f13982e);
        sb2.append(StubApp.getString2(17622));
        return Xa.h.q(sb2, this.f13983f, StubApp.getString2(265));
    }
}
