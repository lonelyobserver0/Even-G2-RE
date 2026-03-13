package f5;

import com.stub.StubApp;

/* renamed from: f5.B, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0884B extends O0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f13809b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13810c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13811d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13812e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13813f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13814g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13815h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13816i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final J f13817k;

    /* renamed from: l, reason: collision with root package name */
    public final G f13818l;

    /* renamed from: m, reason: collision with root package name */
    public final C0886D f13819m;

    public C0884B(String str, String str2, int i3, String str3, String str4, String str5, String str6, String str7, String str8, J j, G g10, C0886D c0886d) {
        this.f13809b = str;
        this.f13810c = str2;
        this.f13811d = i3;
        this.f13812e = str3;
        this.f13813f = str4;
        this.f13814g = str5;
        this.f13815h = str6;
        this.f13816i = str7;
        this.j = str8;
        this.f13817k = j;
        this.f13818l = g10;
        this.f13819m = c0886d;
    }

    public final C0883A a() {
        C0883A c0883a = new C0883A();
        c0883a.f13797a = this.f13809b;
        c0883a.f13798b = this.f13810c;
        c0883a.f13799c = this.f13811d;
        c0883a.f13800d = this.f13812e;
        c0883a.f13801e = this.f13813f;
        c0883a.f13802f = this.f13814g;
        c0883a.f13803g = this.f13815h;
        c0883a.f13804h = this.f13816i;
        c0883a.f13805i = this.j;
        c0883a.j = this.f13817k;
        c0883a.f13806k = this.f13818l;
        c0883a.f13807l = this.f13819m;
        c0883a.f13808m = (byte) 1;
        return c0883a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        C0884B c0884b = (C0884B) ((O0) obj);
        if (!this.f13809b.equals(c0884b.f13809b)) {
            return false;
        }
        if (!this.f13810c.equals(c0884b.f13810c) || this.f13811d != c0884b.f13811d || !this.f13812e.equals(c0884b.f13812e)) {
            return false;
        }
        String str = c0884b.f13813f;
        String str2 = this.f13813f;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = c0884b.f13814g;
        String str4 = this.f13814g;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = c0884b.f13815h;
        String str6 = this.f13815h;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (!this.f13816i.equals(c0884b.f13816i) || !this.j.equals(c0884b.j)) {
            return false;
        }
        J j = c0884b.f13817k;
        J j3 = this.f13817k;
        if (j3 == null) {
            if (j != null) {
                return false;
            }
        } else if (!j3.equals(j)) {
            return false;
        }
        G g10 = c0884b.f13818l;
        G g11 = this.f13818l;
        if (g11 == null) {
            if (g10 != null) {
                return false;
            }
        } else if (!g11.equals(g10)) {
            return false;
        }
        C0886D c0886d = c0884b.f13819m;
        C0886D c0886d2 = this.f13819m;
        return c0886d2 == null ? c0886d == null : c0886d2.equals(c0886d);
    }

    public final int hashCode() {
        int hashCode = (((((((this.f13809b.hashCode() ^ 1000003) * 1000003) ^ this.f13810c.hashCode()) * 1000003) ^ this.f13811d) * 1000003) ^ this.f13812e.hashCode()) * 1000003;
        String str = this.f13813f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f13814g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f13815h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f13816i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        J j = this.f13817k;
        int hashCode5 = (hashCode4 ^ (j == null ? 0 : j.hashCode())) * 1000003;
        G g10 = this.f13818l;
        int hashCode6 = (hashCode5 ^ (g10 == null ? 0 : g10.hashCode())) * 1000003;
        C0886D c0886d = this.f13819m;
        return hashCode6 ^ (c0886d != null ? c0886d.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(17515) + this.f13809b + StubApp.getString2(17516) + this.f13810c + StubApp.getString2(17517) + this.f13811d + StubApp.getString2(17518) + this.f13812e + StubApp.getString2(2588) + this.f13813f + StubApp.getString2(2589) + this.f13814g + StubApp.getString2(17519) + this.f13815h + StubApp.getString2(17520) + this.f13816i + StubApp.getString2(17521) + this.j + StubApp.getString2(17522) + this.f13817k + StubApp.getString2(17523) + this.f13818l + StubApp.getString2(17524) + this.f13819m + StubApp.getString2(265);
    }
}
