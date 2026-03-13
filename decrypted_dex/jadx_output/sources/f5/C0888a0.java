package f5;

import com.stub.StubApp;

/* renamed from: f5.a0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0888a0 extends D0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13955a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13956b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13957c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13958d;

    public C0888a0(String str, int i3, int i10, boolean z2) {
        this.f13955a = str;
        this.f13956b = i3;
        this.f13957c = i10;
        this.f13958d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof D0) {
            D0 d02 = (D0) obj;
            if (this.f13955a.equals(((C0888a0) d02).f13955a)) {
                C0888a0 c0888a0 = (C0888a0) d02;
                if (this.f13956b == c0888a0.f13956b && this.f13957c == c0888a0.f13957c && this.f13958d == c0888a0.f13958d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f13955a.hashCode() ^ 1000003) * 1000003) ^ this.f13956b) * 1000003) ^ this.f13957c) * 1000003) ^ (this.f13958d ? 1231 : 1237);
    }

    public final String toString() {
        return StubApp.getString2(17605) + this.f13955a + StubApp.getString2(2563) + this.f13956b + StubApp.getString2(2564) + this.f13957c + StubApp.getString2(17606) + this.f13958d + StubApp.getString2(265);
    }
}
