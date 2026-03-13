package com.mapbox.api.geocoding.v5.models;

import java.io.Serializable;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f12282a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12283b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12284c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12285d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12286e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12287f;

    public a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f12282a = str;
        this.f12283b = str2;
        this.f12284c = str3;
        this.f12285d = str4;
        this.f12286e = str5;
        this.f12287f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            String str = this.f12282a;
            if (str != null ? str.equals(aVar.f12282a) : aVar.f12282a == null) {
                String str2 = this.f12283b;
                if (str2 != null ? str2.equals(aVar.f12283b) : aVar.f12283b == null) {
                    String str3 = this.f12284c;
                    if (str3 != null ? str3.equals(aVar.f12284c) : aVar.f12284c == null) {
                        String str4 = this.f12285d;
                        if (str4 != null ? str4.equals(aVar.f12285d) : aVar.f12285d == null) {
                            String str5 = this.f12286e;
                            if (str5 != null ? str5.equals(aVar.f12286e) : aVar.f12286e == null) {
                                String str6 = this.f12287f;
                                if (str6 != null ? str6.equals(aVar.f12287f) : aVar.f12287f == null) {
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
        String str = this.f12282a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f12283b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12284c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f12285d;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f12286e;
        int hashCode5 = (hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f12287f;
        return (str6 != null ? str6.hashCode() : 0) ^ hashCode5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CarmenContext{id=");
        sb2.append(this.f12282a);
        sb2.append(", text=");
        sb2.append(this.f12283b);
        sb2.append(", shortCode=");
        sb2.append(this.f12284c);
        sb2.append(", wikidata=");
        sb2.append(this.f12285d);
        sb2.append(", category=");
        sb2.append(this.f12286e);
        sb2.append(", maki=");
        return AbstractC1482f.k(sb2, this.f12287f, "}");
    }
}
