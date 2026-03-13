package f5;

import com.stub.StubApp;

/* renamed from: f5.j0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0906j0 extends L0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14050a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14051b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14052c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14053d;

    public C0906j0(String str, String str2, int i3, boolean z2) {
        this.f14050a = i3;
        this.f14051b = str;
        this.f14052c = str2;
        this.f14053d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof L0) {
            L0 l02 = (L0) obj;
            if (this.f14050a == ((C0906j0) l02).f14050a) {
                C0906j0 c0906j0 = (C0906j0) l02;
                if (this.f14051b.equals(c0906j0.f14051b) && this.f14052c.equals(c0906j0.f14052c) && this.f14053d == c0906j0.f14053d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f14050a ^ 1000003) * 1000003) ^ this.f14051b.hashCode()) * 1000003) ^ this.f14052c.hashCode()) * 1000003) ^ (this.f14053d ? 1231 : 1237);
    }

    public final String toString() {
        return StubApp.getString2(17651) + this.f14050a + StubApp.getString2(2014) + this.f14051b + StubApp.getString2(17520) + this.f14052c + StubApp.getString2(17652) + this.f14053d + StubApp.getString2(265);
    }
}
