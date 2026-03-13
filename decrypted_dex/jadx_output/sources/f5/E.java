package f5;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class E extends p0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13838a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13839b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13840c;

    public E(String str, String str2, String str3) {
        this.f13838a = str;
        this.f13839b = str2;
        this.f13840c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            if (this.f13838a.equals(((E) p0Var).f13838a)) {
                E e10 = (E) p0Var;
                if (this.f13839b.equals(e10.f13839b) && this.f13840c.equals(e10.f13840c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f13838a.hashCode() ^ 1000003) * 1000003) ^ this.f13839b.hashCode()) * 1000003) ^ this.f13840c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17539));
        sb2.append(this.f13838a);
        sb2.append(StubApp.getString2(17540));
        sb2.append(this.f13839b);
        sb2.append(StubApp.getString2(17541));
        return AbstractC1482f.k(sb2, this.f13840c, StubApp.getString2(265));
    }
}
