package com.mapbox.api.geocoding.v6;

import com.stub.StubApp;
import java.util.List;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f12319a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12320b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12321c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12322d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12323e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12324f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12325g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12326h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12327i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f12328k;

    /* renamed from: l, reason: collision with root package name */
    public final List f12329l;

    /* renamed from: m, reason: collision with root package name */
    public final String f12330m;

    /* renamed from: n, reason: collision with root package name */
    public final String f12331n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f12332o;

    /* renamed from: p, reason: collision with root package name */
    public final String f12333p;

    /* renamed from: q, reason: collision with root package name */
    public final List f12334q;

    /* renamed from: r, reason: collision with root package name */
    public final String f12335r;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, List list, String str11, String str12, Integer num, String str13, List list2, String str14) {
        this.f12319a = str;
        this.f12320b = str2;
        this.f12321c = str3;
        this.f12322d = str4;
        this.f12323e = str5;
        this.f12324f = str6;
        this.f12325g = str7;
        this.f12326h = str8;
        this.f12327i = str9;
        this.j = str10;
        this.f12328k = bool;
        this.f12329l = list;
        this.f12330m = str11;
        this.f12331n = str12;
        this.f12332o = num;
        this.f12333p = str13;
        this.f12334q = list2;
        this.f12335r = str14;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            String str = this.f12319a;
            if (str != null ? str.equals(aVar.f12319a) : aVar.f12319a == null) {
                String str2 = this.f12320b;
                if (str2 != null ? str2.equals(aVar.f12320b) : aVar.f12320b == null) {
                    String str3 = this.f12321c;
                    if (str3 != null ? str3.equals(aVar.f12321c) : aVar.f12321c == null) {
                        String str4 = this.f12322d;
                        if (str4 != null ? str4.equals(aVar.f12322d) : aVar.f12322d == null) {
                            String str5 = this.f12323e;
                            if (str5 != null ? str5.equals(aVar.f12323e) : aVar.f12323e == null) {
                                String str6 = this.f12324f;
                                if (str6 != null ? str6.equals(aVar.f12324f) : aVar.f12324f == null) {
                                    String str7 = this.f12325g;
                                    if (str7 != null ? str7.equals(aVar.f12325g) : aVar.f12325g == null) {
                                        String str8 = this.f12326h;
                                        if (str8 != null ? str8.equals(aVar.f12326h) : aVar.f12326h == null) {
                                            String str9 = this.f12327i;
                                            if (str9 != null ? str9.equals(aVar.f12327i) : aVar.f12327i == null) {
                                                String str10 = this.j;
                                                if (str10 != null ? str10.equals(aVar.j) : aVar.j == null) {
                                                    Boolean bool = this.f12328k;
                                                    if (bool != null ? bool.equals(aVar.f12328k) : aVar.f12328k == null) {
                                                        List list = this.f12329l;
                                                        if (list != null ? list.equals(aVar.f12329l) : aVar.f12329l == null) {
                                                            String str11 = this.f12330m;
                                                            if (str11 != null ? str11.equals(aVar.f12330m) : aVar.f12330m == null) {
                                                                String str12 = this.f12331n;
                                                                if (str12 != null ? str12.equals(aVar.f12331n) : aVar.f12331n == null) {
                                                                    Integer num = this.f12332o;
                                                                    if (num != null ? num.equals(aVar.f12332o) : aVar.f12332o == null) {
                                                                        String str13 = this.f12333p;
                                                                        if (str13 != null ? str13.equals(aVar.f12333p) : aVar.f12333p == null) {
                                                                            List list2 = this.f12334q;
                                                                            if (list2 != null ? list2.equals(aVar.f12334q) : aVar.f12334q == null) {
                                                                                String str14 = this.f12335r;
                                                                                if (str14 != null ? str14.equals(aVar.f12335r) : aVar.f12335r == null) {
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
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12319a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f12320b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12321c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f12322d;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f12323e;
        int hashCode5 = (hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f12324f;
        int hashCode6 = (hashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f12325g;
        int hashCode7 = (hashCode6 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f12326h;
        int hashCode8 = (hashCode7 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f12327i;
        int hashCode9 = (hashCode8 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.j;
        int hashCode10 = (hashCode9 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        Boolean bool = this.f12328k;
        int hashCode11 = (hashCode10 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        List list = this.f12329l;
        int hashCode12 = (hashCode11 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        String str11 = this.f12330m;
        int hashCode13 = (hashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        String str12 = this.f12331n;
        int hashCode14 = (hashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
        Integer num = this.f12332o;
        int hashCode15 = (hashCode14 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str13 = this.f12333p;
        int hashCode16 = (hashCode15 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
        List list2 = this.f12334q;
        int hashCode17 = (hashCode16 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        String str14 = this.f12335r;
        return (str14 != null ? str14.hashCode() : 0) ^ hashCode17;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(13163));
        sb2.append(this.f12319a);
        sb2.append(StubApp.getString2(13164));
        sb2.append(this.f12320b);
        sb2.append(StubApp.getString2(2253));
        sb2.append(this.f12321c);
        sb2.append(StubApp.getString2(2246));
        sb2.append(this.f12322d);
        sb2.append(StubApp.getString2(13165));
        sb2.append(this.f12323e);
        sb2.append(StubApp.getString2(2248));
        sb2.append(this.f12324f);
        sb2.append(StubApp.getString2(2250));
        sb2.append(this.f12325g);
        sb2.append(StubApp.getString2(2249));
        sb2.append(this.f12326h);
        sb2.append(StubApp.getString2(2300));
        sb2.append(this.f12327i);
        sb2.append(StubApp.getString2(2247));
        sb2.append(this.j);
        sb2.append(StubApp.getString2(13166));
        sb2.append(this.f12328k);
        sb2.append(StubApp.getString2(2325));
        sb2.append(this.f12329l);
        sb2.append(StubApp.getString2(262));
        sb2.append(this.f12330m);
        sb2.append(StubApp.getString2(6716));
        sb2.append(this.f12331n);
        sb2.append(StubApp.getString2(13167));
        sb2.append(this.f12332o);
        sb2.append(StubApp.getString2(13168));
        sb2.append(this.f12333p);
        sb2.append(StubApp.getString2(13169));
        sb2.append(this.f12334q);
        sb2.append(StubApp.getString2(13170));
        return AbstractC1482f.k(sb2, this.f12335r, StubApp.getString2(265));
    }
}
