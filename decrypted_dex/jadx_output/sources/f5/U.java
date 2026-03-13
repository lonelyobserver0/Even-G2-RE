package f5;

import com.stub.StubApp;
import java.util.List;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class U extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13924a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13925b;

    /* renamed from: c, reason: collision with root package name */
    public final List f13926c;

    /* renamed from: d, reason: collision with root package name */
    public final y0 f13927d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13928e;

    public U(String str, String str2, List list, y0 y0Var, int i3) {
        this.f13924a = str;
        this.f13925b = str2;
        this.f13926c = list;
        this.f13927d = y0Var;
        this.f13928e = i3;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            if (this.f13924a.equals(((U) y0Var).f13924a) && ((str = this.f13925b) != null ? str.equals(((U) y0Var).f13925b) : ((U) y0Var).f13925b == null)) {
                U u2 = (U) y0Var;
                if (this.f13926c.equals(u2.f13926c)) {
                    y0 y0Var2 = u2.f13927d;
                    y0 y0Var3 = this.f13927d;
                    if (y0Var3 != null ? y0Var3.equals(y0Var2) : y0Var2 == null) {
                        if (this.f13928e == u2.f13928e) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f13924a.hashCode() ^ 1000003) * 1000003;
        String str = this.f13925b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f13926c.hashCode()) * 1000003;
        y0 y0Var = this.f13927d;
        return ((hashCode2 ^ (y0Var != null ? y0Var.hashCode() : 0)) * 1000003) ^ this.f13928e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17591));
        sb2.append(this.f13924a);
        sb2.append(StubApp.getString2(5317));
        sb2.append(this.f13925b);
        sb2.append(StubApp.getString2(17592));
        sb2.append(this.f13926c);
        sb2.append(StubApp.getString2(17593));
        sb2.append(this.f13927d);
        sb2.append(StubApp.getString2(17594));
        return AbstractC1482f.f(this.f13928e, StubApp.getString2(265), sb2);
    }
}
