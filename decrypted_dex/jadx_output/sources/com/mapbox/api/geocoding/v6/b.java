package com.mapbox.api.geocoding.v6;

import com.stub.StubApp;
import java.util.List;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Double f12336a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f12337b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12338c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12339d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f12340e;

    /* renamed from: f, reason: collision with root package name */
    public final List f12341f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12342g;

    public b(Double d8, Double d10, String str, String str2, Integer num, List list, String str3) {
        if (d8 == null) {
            throw new NullPointerException(StubApp.getString2(2107));
        }
        this.f12336a = d8;
        if (d10 == null) {
            throw new NullPointerException(StubApp.getString2(2108));
        }
        this.f12337b = d10;
        this.f12338c = str;
        this.f12339d = str2;
        this.f12340e = num;
        this.f12341f = list;
        this.f12342g = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f12336a.equals(bVar.f12336a) && this.f12337b.equals(bVar.f12337b)) {
                String str = bVar.f12338c;
                String str2 = this.f12338c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = bVar.f12339d;
                    String str4 = this.f12339d;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        Integer num = bVar.f12340e;
                        Integer num2 = this.f12340e;
                        if (num2 != null ? num2.equals(num) : num == null) {
                            List list = bVar.f12341f;
                            List list2 = this.f12341f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                String str5 = bVar.f12342g;
                                String str6 = this.f12342g;
                                if (str6 != null ? str6.equals(str5) : str5 == null) {
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
        int hashCode = (((this.f12336a.hashCode() ^ 1000003) * 1000003) ^ this.f12337b.hashCode()) * 1000003;
        String str = this.f12338c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f12339d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Integer num = this.f12340e;
        int hashCode4 = (hashCode3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        List list = this.f12341f;
        int hashCode5 = (hashCode4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        String str3 = this.f12342g;
        return hashCode5 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(13171));
        sb2.append(this.f12336a);
        sb2.append(StubApp.getString2(7087));
        sb2.append(this.f12337b);
        sb2.append(StubApp.getString2(262));
        sb2.append(this.f12338c);
        sb2.append(StubApp.getString2(6716));
        sb2.append(this.f12339d);
        sb2.append(StubApp.getString2(13167));
        sb2.append(this.f12340e);
        sb2.append(StubApp.getString2(13169));
        sb2.append(this.f12341f);
        sb2.append(StubApp.getString2(13170));
        return AbstractC1482f.k(sb2, this.f12342g, StubApp.getString2(265));
    }
}
