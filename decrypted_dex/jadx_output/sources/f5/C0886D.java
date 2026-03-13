package f5;

import com.stub.StubApp;
import java.util.List;

/* renamed from: f5.D, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0886D extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13829a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13830b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13831c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13832d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13833e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13834f;

    /* renamed from: g, reason: collision with root package name */
    public final long f13835g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13836h;

    /* renamed from: i, reason: collision with root package name */
    public final List f13837i;

    public C0886D(int i3, String str, int i10, int i11, long j, long j3, long j10, String str2, List list) {
        this.f13829a = i3;
        this.f13830b = str;
        this.f13831c = i10;
        this.f13832d = i11;
        this.f13833e = j;
        this.f13834f = j3;
        this.f13835g = j10;
        this.f13836h = str2;
        this.f13837i = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            if (this.f13829a == ((C0886D) q0Var).f13829a) {
                C0886D c0886d = (C0886D) q0Var;
                if (this.f13830b.equals(c0886d.f13830b) && this.f13831c == c0886d.f13831c && this.f13832d == c0886d.f13832d && this.f13833e == c0886d.f13833e && this.f13834f == c0886d.f13834f && this.f13835g == c0886d.f13835g) {
                    String str = c0886d.f13836h;
                    String str2 = this.f13836h;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        List list = c0886d.f13837i;
                        List list2 = this.f13837i;
                        if (list2 != null ? list2.equals(list) : list == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f13829a ^ 1000003) * 1000003) ^ this.f13830b.hashCode()) * 1000003) ^ this.f13831c) * 1000003) ^ this.f13832d) * 1000003;
        long j = this.f13833e;
        int i3 = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j3 = this.f13834f;
        int i10 = (i3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j10 = this.f13835g;
        int i11 = (i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str = this.f13836h;
        int hashCode2 = (i11 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f13837i;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17532));
        sb2.append(this.f13829a);
        sb2.append(StubApp.getString2(17533));
        sb2.append(this.f13830b);
        sb2.append(StubApp.getString2(17534));
        sb2.append(this.f13831c);
        sb2.append(StubApp.getString2(2564));
        sb2.append(this.f13832d);
        sb2.append(StubApp.getString2(17535));
        sb2.append(this.f13833e);
        sb2.append(StubApp.getString2(17536));
        sb2.append(this.f13834f);
        sb2.append(StubApp.getString2(5059));
        sb2.append(this.f13835g);
        sb2.append(StubApp.getString2(17537));
        sb2.append(this.f13836h);
        sb2.append(StubApp.getString2(17538));
        return E1.a.l(StubApp.getString2(265), sb2, this.f13837i);
    }
}
