package f5;

import com.stub.StubApp;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class S extends C0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f13915a;

    /* renamed from: b, reason: collision with root package name */
    public final U f13916b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f13917c;

    /* renamed from: d, reason: collision with root package name */
    public final V f13918d;

    /* renamed from: e, reason: collision with root package name */
    public final List f13919e;

    public S(List list, U u2, q0 q0Var, V v2, List list2) {
        this.f13915a = list;
        this.f13916b = u2;
        this.f13917c = q0Var;
        this.f13918d = v2;
        this.f13919e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        List list = this.f13915a;
        if (list == null) {
            if (((S) c02).f13915a != null) {
                return false;
            }
        } else if (!list.equals(((S) c02).f13915a)) {
            return false;
        }
        U u2 = this.f13916b;
        if (u2 == null) {
            if (((S) c02).f13916b != null) {
                return false;
            }
        } else if (!u2.equals(((S) c02).f13916b)) {
            return false;
        }
        q0 q0Var = this.f13917c;
        if (q0Var == null) {
            if (((S) c02).f13917c != null) {
                return false;
            }
        } else if (!q0Var.equals(((S) c02).f13917c)) {
            return false;
        }
        S s10 = (S) c02;
        return this.f13918d.equals(s10.f13918d) && this.f13919e.equals(s10.f13919e);
    }

    public final int hashCode() {
        List list = this.f13915a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        U u2 = this.f13916b;
        int hashCode2 = (hashCode ^ (u2 == null ? 0 : u2.hashCode())) * 1000003;
        q0 q0Var = this.f13917c;
        return (((((q0Var != null ? q0Var.hashCode() : 0) ^ hashCode2) * 1000003) ^ this.f13918d.hashCode()) * 1000003) ^ this.f13919e.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17586));
        sb2.append(this.f13915a);
        sb2.append(StubApp.getString2(17587));
        sb2.append(this.f13916b);
        sb2.append(StubApp.getString2(17524));
        sb2.append(this.f13917c);
        sb2.append(StubApp.getString2(17588));
        sb2.append(this.f13918d);
        sb2.append(StubApp.getString2(17589));
        return E1.a.l(StubApp.getString2(265), sb2, this.f13919e);
    }
}
