package A3;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l extends AbstractC0013a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f171a;

    /* renamed from: b, reason: collision with root package name */
    public final String f172b;

    /* renamed from: c, reason: collision with root package name */
    public final String f173c;

    /* renamed from: d, reason: collision with root package name */
    public final String f174d;

    /* renamed from: e, reason: collision with root package name */
    public final String f175e;

    /* renamed from: f, reason: collision with root package name */
    public final String f176f;

    /* renamed from: g, reason: collision with root package name */
    public final String f177g;

    /* renamed from: h, reason: collision with root package name */
    public final String f178h;

    /* renamed from: i, reason: collision with root package name */
    public final String f179i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f180k;

    /* renamed from: l, reason: collision with root package name */
    public final String f181l;

    public l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f171a = num;
        this.f172b = str;
        this.f173c = str2;
        this.f174d = str3;
        this.f175e = str4;
        this.f176f = str5;
        this.f177g = str6;
        this.f178h = str7;
        this.f179i = str8;
        this.j = str9;
        this.f180k = str10;
        this.f181l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0013a) {
            AbstractC0013a abstractC0013a = (AbstractC0013a) obj;
            Integer num = this.f171a;
            if (num != null ? num.equals(((l) abstractC0013a).f171a) : ((l) abstractC0013a).f171a == null) {
                String str = this.f172b;
                if (str != null ? str.equals(((l) abstractC0013a).f172b) : ((l) abstractC0013a).f172b == null) {
                    String str2 = this.f173c;
                    if (str2 != null ? str2.equals(((l) abstractC0013a).f173c) : ((l) abstractC0013a).f173c == null) {
                        String str3 = this.f174d;
                        if (str3 != null ? str3.equals(((l) abstractC0013a).f174d) : ((l) abstractC0013a).f174d == null) {
                            String str4 = this.f175e;
                            if (str4 != null ? str4.equals(((l) abstractC0013a).f175e) : ((l) abstractC0013a).f175e == null) {
                                String str5 = this.f176f;
                                if (str5 != null ? str5.equals(((l) abstractC0013a).f176f) : ((l) abstractC0013a).f176f == null) {
                                    String str6 = this.f177g;
                                    if (str6 != null ? str6.equals(((l) abstractC0013a).f177g) : ((l) abstractC0013a).f177g == null) {
                                        String str7 = this.f178h;
                                        if (str7 != null ? str7.equals(((l) abstractC0013a).f178h) : ((l) abstractC0013a).f178h == null) {
                                            String str8 = this.f179i;
                                            if (str8 != null ? str8.equals(((l) abstractC0013a).f179i) : ((l) abstractC0013a).f179i == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(((l) abstractC0013a).j) : ((l) abstractC0013a).j == null) {
                                                    String str10 = this.f180k;
                                                    if (str10 != null ? str10.equals(((l) abstractC0013a).f180k) : ((l) abstractC0013a).f180k == null) {
                                                        String str11 = this.f181l;
                                                        if (str11 != null ? str11.equals(((l) abstractC0013a).f181l) : ((l) abstractC0013a).f181l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
        Integer num = this.f171a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f172b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f173c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f174d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f175e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f176f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f177g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f178h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f179i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f180k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f181l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(253));
        sb2.append(this.f171a);
        sb2.append(StubApp.getString2(254));
        sb2.append(this.f172b);
        sb2.append(StubApp.getString2(255));
        sb2.append(this.f173c);
        sb2.append(StubApp.getString2(256));
        sb2.append(this.f174d);
        sb2.append(StubApp.getString2(257));
        sb2.append(this.f175e);
        sb2.append(StubApp.getString2(258));
        sb2.append(this.f176f);
        sb2.append(StubApp.getString2(259));
        sb2.append(this.f177g);
        sb2.append(StubApp.getString2(260));
        sb2.append(this.f178h);
        sb2.append(StubApp.getString2(261));
        sb2.append(this.f179i);
        sb2.append(StubApp.getString2(262));
        sb2.append(this.j);
        sb2.append(StubApp.getString2(263));
        sb2.append(this.f180k);
        sb2.append(StubApp.getString2(264));
        return AbstractC1482f.k(sb2, this.f181l, StubApp.getString2(265));
    }
}
