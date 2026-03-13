package f5;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* renamed from: f5.g0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0900g0 extends H0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14020a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14021b;

    public C0900g0(String str, String str2) {
        this.f14020a = str;
        this.f14021b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H0) {
            H0 h0 = (H0) obj;
            if (this.f14020a.equals(((C0900g0) h0).f14020a) && this.f14021b.equals(((C0900g0) h0).f14021b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14020a.hashCode() ^ 1000003) * 1000003) ^ this.f14021b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17639));
        sb2.append(this.f14020a);
        sb2.append(StubApp.getString2(17279));
        return AbstractC1482f.k(sb2, this.f14021b, StubApp.getString2(265));
    }
}
