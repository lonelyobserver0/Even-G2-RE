package y5;

import Cc.h;
import com.stub.StubApp;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f23513a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23514b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23515c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23516d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23517e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23518f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23519g;

    public a(String str, int i3, String str2, String str3, long j, long j3, String str4) {
        this.f23513a = str;
        this.f23514b = i3;
        this.f23515c = str2;
        this.f23516d = str3;
        this.f23517e = j;
        this.f23518f = j3;
        this.f23519g = str4;
    }

    public final h a() {
        h hVar = new h();
        hVar.f1210d = this.f23513a;
        hVar.f1209c = this.f23514b;
        hVar.f1211e = this.f23515c;
        hVar.f1207a = this.f23516d;
        hVar.f1208b = Long.valueOf(this.f23517e);
        hVar.f1212f = Long.valueOf(this.f23518f);
        hVar.f1213g = this.f23519g;
        return hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f23513a;
        if (str == null) {
            if (aVar.f23513a != null) {
                return false;
            }
        } else if (!str.equals(aVar.f23513a)) {
            return false;
        }
        if (!AbstractC1856e.a(this.f23514b, aVar.f23514b)) {
            return false;
        }
        String str2 = aVar.f23515c;
        String str3 = this.f23515c;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        String str4 = aVar.f23516d;
        String str5 = this.f23516d;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (this.f23517e != aVar.f23517e || this.f23518f != aVar.f23518f) {
            return false;
        }
        String str6 = aVar.f23519g;
        String str7 = this.f23519g;
        return str7 == null ? str6 == null : str7.equals(str6);
    }

    public final int hashCode() {
        String str = this.f23513a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC1856e.c(this.f23514b)) * 1000003;
        String str2 = this.f23515c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f23516d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f23517e;
        int i3 = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j3 = this.f23518f;
        int i10 = (i3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f23519g;
        return (str4 != null ? str4.hashCode() : 0) ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(24644));
        sb2.append(this.f23513a);
        sb2.append(StubApp.getString2(24645));
        int i3 = this.f23514b;
        sb2.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? StubApp.getString2(1116) : StubApp.getString2(24646) : StubApp.getString2(24647) : StubApp.getString2(24648) : StubApp.getString2(24649) : StubApp.getString2(24650));
        sb2.append(StubApp.getString2(9598));
        sb2.append(this.f23515c);
        sb2.append(StubApp.getString2(24651));
        sb2.append(this.f23516d);
        sb2.append(StubApp.getString2(24652));
        sb2.append(this.f23517e);
        sb2.append(StubApp.getString2(24653));
        sb2.append(this.f23518f);
        sb2.append(StubApp.getString2(24654));
        return AbstractC1482f.k(sb2, this.f23519g, StubApp.getString2(265));
    }
}
