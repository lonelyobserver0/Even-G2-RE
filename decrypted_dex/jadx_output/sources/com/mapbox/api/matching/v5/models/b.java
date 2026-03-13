package com.mapbox.api.matching.v5.models;

import com.mapbox.api.directions.v5.models.RouteOptions;
import com.stub.StubApp;
import java.util.List;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final String f12345a;

    /* renamed from: b, reason: collision with root package name */
    public final double f12346b;

    /* renamed from: c, reason: collision with root package name */
    public final double f12347c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12348d;

    /* renamed from: e, reason: collision with root package name */
    public final double f12349e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12350f;

    /* renamed from: g, reason: collision with root package name */
    public final List f12351g;

    /* renamed from: h, reason: collision with root package name */
    public final double f12352h;
    public final RouteOptions j;

    /* renamed from: k, reason: collision with root package name */
    public final String f12353k;

    /* renamed from: l, reason: collision with root package name */
    public final String f12354l;

    public b(String str, double d8, double d10, String str2, double d11, String str3, List list, double d12, RouteOptions routeOptions, String str4, String str5) {
        this.f12345a = str;
        this.f12346b = d8;
        this.f12347c = d10;
        this.f12348d = str2;
        this.f12349e = d11;
        if (str3 == null) {
            throw new NullPointerException(StubApp.getString2(2097));
        }
        this.f12350f = str3;
        if (list == null) {
            throw new NullPointerException(StubApp.getString2(2094));
        }
        this.f12351g = list;
        this.f12352h = d12;
        this.j = routeOptions;
        this.f12353k = str4;
        this.f12354l = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            String str = this.f12345a;
            if (str != null ? str.equals(((b) eVar).f12345a) : ((b) eVar).f12345a == null) {
                if (Double.doubleToLongBits(this.f12346b) == Double.doubleToLongBits(((b) eVar).f12346b)) {
                    b bVar = (b) eVar;
                    if (Double.doubleToLongBits(this.f12347c) == Double.doubleToLongBits(bVar.f12347c)) {
                        String str2 = bVar.f12348d;
                        String str3 = this.f12348d;
                        if (str3 != null ? str3.equals(str2) : str2 == null) {
                            if (Double.doubleToLongBits(this.f12349e) == Double.doubleToLongBits(bVar.f12349e) && this.f12350f.equals(bVar.f12350f) && this.f12351g.equals(bVar.f12351g) && Double.doubleToLongBits(this.f12352h) == Double.doubleToLongBits(bVar.f12352h)) {
                                RouteOptions routeOptions = bVar.j;
                                RouteOptions routeOptions2 = this.j;
                                if (routeOptions2 != null ? routeOptions2.equals(routeOptions) : routeOptions == null) {
                                    String str4 = bVar.f12353k;
                                    String str5 = this.f12353k;
                                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                                        String str6 = bVar.f12354l;
                                        String str7 = this.f12354l;
                                        if (str7 != null ? str7.equals(str6) : str6 == null) {
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
        return false;
    }

    public final int hashCode() {
        String str = this.f12345a;
        int hashCode = str == null ? 0 : str.hashCode();
        double d8 = this.f12346b;
        int doubleToLongBits = (((hashCode ^ 1000003) * 1000003) ^ ((int) (Double.doubleToLongBits(d8) ^ (Double.doubleToLongBits(d8) >>> 32)))) * 1000003;
        double d10 = this.f12347c;
        int doubleToLongBits2 = (doubleToLongBits ^ ((int) (Double.doubleToLongBits(d10) ^ (Double.doubleToLongBits(d10) >>> 32)))) * 1000003;
        String str2 = this.f12348d;
        int hashCode2 = (doubleToLongBits2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        double d11 = this.f12349e;
        int doubleToLongBits3 = (((((hashCode2 ^ ((int) (Double.doubleToLongBits(d11) ^ (Double.doubleToLongBits(d11) >>> 32)))) * 1000003) ^ this.f12350f.hashCode()) * 1000003) ^ this.f12351g.hashCode()) * 1000003;
        double d12 = this.f12352h;
        int doubleToLongBits4 = (doubleToLongBits3 ^ ((int) (Double.doubleToLongBits(d12) ^ (Double.doubleToLongBits(d12) >>> 32)))) * 1000003;
        RouteOptions routeOptions = this.j;
        int hashCode3 = (doubleToLongBits4 ^ (routeOptions == null ? 0 : routeOptions.hashCode())) * 1000003;
        String str3 = this.f12353k;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f12354l;
        return (str4 != null ? str4.hashCode() : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(13172));
        sb2.append(this.f12345a);
        sb2.append(StubApp.getString2(6624));
        sb2.append(this.f12346b);
        sb2.append(StubApp.getString2(5021));
        sb2.append(this.f12347c);
        sb2.append(StubApp.getString2(2297));
        sb2.append(this.f12348d);
        sb2.append(StubApp.getString2(12741));
        sb2.append(this.f12349e);
        sb2.append(StubApp.getString2(12742));
        sb2.append(this.f12350f);
        sb2.append(StubApp.getString2(2086));
        sb2.append(this.f12351g);
        sb2.append(StubApp.getString2(2301));
        sb2.append(this.f12352h);
        sb2.append(StubApp.getString2(12743));
        sb2.append(this.j);
        sb2.append(StubApp.getString2(12744));
        sb2.append(this.f12353k);
        sb2.append(StubApp.getString2(12745));
        return AbstractC1482f.k(sb2, this.f12354l, StubApp.getString2(265));
    }
}
