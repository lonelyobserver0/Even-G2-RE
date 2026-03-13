package f5;

import com.stub.StubApp;
import java.util.List;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class J extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13859a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13860b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13861c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13862d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f13863e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13864f;

    /* renamed from: g, reason: collision with root package name */
    public final K f13865g;

    /* renamed from: h, reason: collision with root package name */
    public final C0908k0 f13866h;

    /* renamed from: i, reason: collision with root package name */
    public final C0906j0 f13867i;
    public final N j;

    /* renamed from: k, reason: collision with root package name */
    public final List f13868k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13869l;

    public J(String str, String str2, String str3, long j, Long l9, boolean z2, K k3, C0908k0 c0908k0, C0906j0 c0906j0, N n10, List list, int i3) {
        this.f13859a = str;
        this.f13860b = str2;
        this.f13861c = str3;
        this.f13862d = j;
        this.f13863e = l9;
        this.f13864f = z2;
        this.f13865g = k3;
        this.f13866h = c0908k0;
        this.f13867i = c0906j0;
        this.j = n10;
        this.f13868k = list;
        this.f13869l = i3;
    }

    public final I a() {
        I i3 = new I();
        i3.f13847a = this.f13859a;
        i3.f13848b = this.f13860b;
        i3.f13849c = this.f13861c;
        i3.f13850d = this.f13862d;
        i3.f13851e = this.f13863e;
        i3.f13852f = this.f13864f;
        i3.f13853g = this.f13865g;
        i3.f13854h = this.f13866h;
        i3.f13855i = this.f13867i;
        i3.j = this.j;
        i3.f13856k = this.f13868k;
        i3.f13857l = this.f13869l;
        i3.f13858m = (byte) 7;
        return i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        J j = (J) ((N0) obj);
        if (!this.f13859a.equals(j.f13859a)) {
            return false;
        }
        if (!this.f13860b.equals(j.f13860b)) {
            return false;
        }
        String str = j.f13861c;
        String str2 = this.f13861c;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f13862d != j.f13862d) {
            return false;
        }
        Long l9 = j.f13863e;
        Long l10 = this.f13863e;
        if (l10 == null) {
            if (l9 != null) {
                return false;
            }
        } else if (!l10.equals(l9)) {
            return false;
        }
        if (this.f13864f != j.f13864f || !this.f13865g.equals(j.f13865g)) {
            return false;
        }
        C0908k0 c0908k0 = j.f13866h;
        C0908k0 c0908k02 = this.f13866h;
        if (c0908k02 == null) {
            if (c0908k0 != null) {
                return false;
            }
        } else if (!c0908k02.equals(c0908k0)) {
            return false;
        }
        C0906j0 c0906j0 = j.f13867i;
        C0906j0 c0906j02 = this.f13867i;
        if (c0906j02 == null) {
            if (c0906j0 != null) {
                return false;
            }
        } else if (!c0906j02.equals(c0906j0)) {
            return false;
        }
        N n10 = j.j;
        N n11 = this.j;
        if (n11 == null) {
            if (n10 != null) {
                return false;
            }
        } else if (!n11.equals(n10)) {
            return false;
        }
        List list = j.f13868k;
        List list2 = this.f13868k;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        return this.f13869l == j.f13869l;
    }

    public final int hashCode() {
        int hashCode = (((this.f13859a.hashCode() ^ 1000003) * 1000003) ^ this.f13860b.hashCode()) * 1000003;
        String str = this.f13861c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.f13862d;
        int i3 = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l9 = this.f13863e;
        int hashCode3 = (((((i3 ^ (l9 == null ? 0 : l9.hashCode())) * 1000003) ^ (this.f13864f ? 1231 : 1237)) * 1000003) ^ this.f13865g.hashCode()) * 1000003;
        C0908k0 c0908k0 = this.f13866h;
        int hashCode4 = (hashCode3 ^ (c0908k0 == null ? 0 : c0908k0.hashCode())) * 1000003;
        C0906j0 c0906j0 = this.f13867i;
        int hashCode5 = (hashCode4 ^ (c0906j0 == null ? 0 : c0906j0.hashCode())) * 1000003;
        N n10 = this.j;
        int hashCode6 = (hashCode5 ^ (n10 == null ? 0 : n10.hashCode())) * 1000003;
        List list = this.f13868k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f13869l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17552));
        sb2.append(this.f13859a);
        sb2.append(StubApp.getString2(14828));
        sb2.append(this.f13860b);
        sb2.append(StubApp.getString2(17519));
        sb2.append(this.f13861c);
        sb2.append(StubApp.getString2(17553));
        sb2.append(this.f13862d);
        sb2.append(StubApp.getString2(17554));
        sb2.append(this.f13863e);
        sb2.append(StubApp.getString2(17555));
        sb2.append(this.f13864f);
        sb2.append(StubApp.getString2(17556));
        sb2.append(this.f13865g);
        sb2.append(StubApp.getString2(12835));
        sb2.append(this.f13866h);
        sb2.append(StubApp.getString2(17557));
        sb2.append(this.f13867i);
        sb2.append(StubApp.getString2(256));
        sb2.append(this.j);
        sb2.append(StubApp.getString2(17558));
        sb2.append(this.f13868k);
        sb2.append(StubApp.getString2(10813));
        return AbstractC1482f.f(this.f13869l, StubApp.getString2(265), sb2);
    }
}
