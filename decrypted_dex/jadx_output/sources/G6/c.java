package G6;

import com.stub.StubApp;
import java.util.LinkedHashMap;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends F6.g {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2397a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2398b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2399c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2400d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2401e;

    public c(LinkedHashMap linkedHashMap, String str, String str2, String str3, String str4) {
        this.f2397a = linkedHashMap;
        this.f2398b = str;
        this.f2399c = str2;
        this.f2400d = str3;
        this.f2401e = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        LinkedHashMap linkedHashMap = this.f2397a;
        if (linkedHashMap == null) {
            if (cVar.f2397a != null) {
                return false;
            }
        } else if (!linkedHashMap.equals(cVar.f2397a)) {
            return false;
        }
        String str = this.f2398b;
        if (str == null) {
            if (cVar.f2398b != null) {
                return false;
            }
        } else if (!str.equals(cVar.f2398b)) {
            return false;
        }
        String str2 = this.f2399c;
        if (str2 == null) {
            if (cVar.f2399c != null) {
                return false;
            }
        } else if (!str2.equals(cVar.f2399c)) {
            return false;
        }
        String str3 = this.f2400d;
        if (str3 == null) {
            if (cVar.f2400d != null) {
                return false;
            }
        } else if (!str3.equals(cVar.f2400d)) {
            return false;
        }
        String str4 = this.f2401e;
        return str4 == null ? cVar.f2401e == null : str4.equals(cVar.f2401e);
    }

    public final int hashCode() {
        LinkedHashMap linkedHashMap = this.f2397a;
        int hashCode = ((linkedHashMap == null ? 0 : linkedHashMap.hashCode()) ^ 1000003) * 1000003;
        String str = this.f2398b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f2399c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2400d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f2401e;
        return (str4 != null ? str4.hashCode() : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(2251));
        sb2.append(this.f2397a);
        sb2.append(StubApp.getString2(2252));
        sb2.append(this.f2398b);
        sb2.append(StubApp.getString2(1065));
        sb2.append(this.f2399c);
        sb2.append(StubApp.getString2(2253));
        sb2.append(this.f2400d);
        sb2.append(StubApp.getString2(2254));
        return AbstractC1482f.k(sb2, this.f2401e, StubApp.getString2(265));
    }
}
