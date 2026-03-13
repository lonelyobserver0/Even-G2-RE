package G6;

import com.stub.StubApp;
import java.util.LinkedHashMap;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends F6.g {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2419a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2420b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2421c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2422d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2423e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2424f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2425g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2426h;
    public final String j;

    public h(LinkedHashMap linkedHashMap, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f2419a = linkedHashMap;
        this.f2420b = str;
        this.f2421c = str2;
        this.f2422d = str3;
        this.f2423e = str4;
        this.f2424f = str5;
        this.f2425g = str6;
        this.f2426h = str7;
        this.j = str8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        LinkedHashMap linkedHashMap = this.f2419a;
        if (linkedHashMap == null) {
            if (hVar.f2419a != null) {
                return false;
            }
        } else if (!linkedHashMap.equals(hVar.f2419a)) {
            return false;
        }
        String str = this.f2420b;
        if (str == null) {
            if (hVar.f2420b != null) {
                return false;
            }
        } else if (!str.equals(hVar.f2420b)) {
            return false;
        }
        String str2 = this.f2421c;
        if (str2 == null) {
            if (hVar.f2421c != null) {
                return false;
            }
        } else if (!str2.equals(hVar.f2421c)) {
            return false;
        }
        String str3 = this.f2422d;
        if (str3 == null) {
            if (hVar.f2422d != null) {
                return false;
            }
        } else if (!str3.equals(hVar.f2422d)) {
            return false;
        }
        String str4 = this.f2423e;
        if (str4 == null) {
            if (hVar.f2423e != null) {
                return false;
            }
        } else if (!str4.equals(hVar.f2423e)) {
            return false;
        }
        String str5 = this.f2424f;
        if (str5 == null) {
            if (hVar.f2424f != null) {
                return false;
            }
        } else if (!str5.equals(hVar.f2424f)) {
            return false;
        }
        String str6 = this.f2425g;
        if (str6 == null) {
            if (hVar.f2425g != null) {
                return false;
            }
        } else if (!str6.equals(hVar.f2425g)) {
            return false;
        }
        String str7 = this.f2426h;
        if (str7 == null) {
            if (hVar.f2426h != null) {
                return false;
            }
        } else if (!str7.equals(hVar.f2426h)) {
            return false;
        }
        String str8 = this.j;
        return str8 == null ? hVar.j == null : str8.equals(hVar.j);
    }

    public final int hashCode() {
        LinkedHashMap linkedHashMap = this.f2419a;
        int hashCode = ((linkedHashMap == null ? 0 : linkedHashMap.hashCode()) ^ 1000003) * 1000003;
        String str = this.f2420b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f2421c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2422d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f2423e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f2424f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f2425g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f2426h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.j;
        return (str8 != null ? str8.hashCode() : 0) ^ hashCode8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(2299));
        sb2.append(this.f2419a);
        sb2.append(StubApp.getString2(2253));
        sb2.append(this.f2420b);
        sb2.append(StubApp.getString2(2246));
        sb2.append(this.f2421c);
        sb2.append(StubApp.getString2(2300));
        sb2.append(this.f2422d);
        sb2.append(StubApp.getString2(2248));
        sb2.append(this.f2423e);
        sb2.append(StubApp.getString2(2249));
        sb2.append(this.f2424f);
        sb2.append(StubApp.getString2(2250));
        sb2.append(this.f2425g);
        sb2.append(StubApp.getString2(262));
        sb2.append(this.f2426h);
        sb2.append(StubApp.getString2(2301));
        return AbstractC1482f.k(sb2, this.j, StubApp.getString2(265));
    }
}
