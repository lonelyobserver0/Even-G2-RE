package Nb;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f4992a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4993b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4994c;

    public h(int i3, int i10, long j) {
        this.f4992a = i3;
        this.f4993b = i10;
        this.f4994c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f4992a == hVar.f4992a && this.f4993b == hVar.f4993b && this.f4994c == hVar.f4994c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4994c) + E1.a.e(this.f4993b, Integer.hashCode(this.f4992a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(25407));
        sb2.append(this.f4992a);
        sb2.append(StubApp.getString2(14652));
        sb2.append(this.f4993b);
        sb2.append(StubApp.getString2(5059));
        return Xa.h.q(sb2, this.f4994c, StubApp.getString2(74));
    }
}
