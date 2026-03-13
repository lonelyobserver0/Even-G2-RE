package f5;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class K extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13870a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13871b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13872c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13873d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13874e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13875f;

    public K(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f13870a = str;
        this.f13871b = str2;
        this.f13872c = str3;
        this.f13873d = str4;
        this.f13874e = str5;
        this.f13875f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            if (this.f13870a.equals(((K) v0Var).f13870a)) {
                K k3 = (K) v0Var;
                if (this.f13871b.equals(k3.f13871b)) {
                    String str = k3.f13872c;
                    String str2 = this.f13872c;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        String str3 = k3.f13873d;
                        String str4 = this.f13873d;
                        if (str4 != null ? str4.equals(str3) : str3 == null) {
                            String str5 = k3.f13874e;
                            String str6 = this.f13874e;
                            if (str6 != null ? str6.equals(str5) : str5 == null) {
                                String str7 = k3.f13875f;
                                String str8 = this.f13875f;
                                if (str8 != null ? str8.equals(str7) : str7 == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f13870a.hashCode() ^ 1000003) * 1000003) ^ this.f13871b.hashCode()) * 1000003;
        String str = this.f13872c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f13873d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f13874e;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f13875f;
        return hashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17559));
        sb2.append(this.f13870a);
        sb2.append(StubApp.getString2(2014));
        sb2.append(this.f13871b);
        sb2.append(StubApp.getString2(17521));
        sb2.append(this.f13872c);
        sb2.append(StubApp.getString2(17560));
        sb2.append(this.f13873d);
        sb2.append(StubApp.getString2(17561));
        sb2.append(this.f13874e);
        sb2.append(StubApp.getString2(17562));
        return AbstractC1482f.k(sb2, this.f13875f, StubApp.getString2(265));
    }
}
