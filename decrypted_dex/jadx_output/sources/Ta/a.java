package Ta;

import com.stub.StubApp;
import i2.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7223a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7224b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7225c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f7226d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f7227e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f7228f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f7229g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f7230h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f7231i;
    public final Boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f7232k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f7233l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f7234m;

    /* renamed from: n, reason: collision with root package name */
    public final Long f7235n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f7236o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f7237p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f7238q;

    public a(String address, String str, String filePath, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, Integer num2, Integer num3, Long l9, Integer num4, Integer num5, Integer num6) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f7223a = address;
        this.f7224b = str;
        this.f7225c = filePath;
        this.f7226d = bool;
        this.f7227e = bool2;
        this.f7228f = bool3;
        this.f7229g = bool4;
        this.f7230h = bool5;
        this.f7231i = bool6;
        this.j = bool7;
        this.f7232k = num;
        this.f7233l = num2;
        this.f7234m = num3;
        this.f7235n = l9;
        this.f7236o = num4;
        this.f7237p = num5;
        this.f7238q = num6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f7223a, aVar.f7223a) && Intrinsics.areEqual(this.f7224b, aVar.f7224b) && Intrinsics.areEqual(this.f7225c, aVar.f7225c) && Intrinsics.areEqual(this.f7226d, aVar.f7226d) && Intrinsics.areEqual(this.f7227e, aVar.f7227e) && Intrinsics.areEqual(this.f7228f, aVar.f7228f) && Intrinsics.areEqual(this.f7229g, aVar.f7229g) && Intrinsics.areEqual(this.f7230h, aVar.f7230h) && Intrinsics.areEqual(this.f7231i, aVar.f7231i) && Intrinsics.areEqual(this.j, aVar.j) && Intrinsics.areEqual(this.f7232k, aVar.f7232k) && Intrinsics.areEqual(this.f7233l, aVar.f7233l) && Intrinsics.areEqual(this.f7234m, aVar.f7234m) && Intrinsics.areEqual(this.f7235n, aVar.f7235n) && Intrinsics.areEqual(this.f7236o, aVar.f7236o) && Intrinsics.areEqual(this.f7237p, aVar.f7237p) && Intrinsics.areEqual(this.f7238q, aVar.f7238q);
    }

    public final int hashCode() {
        int hashCode = this.f7223a.hashCode() * 31;
        String str = this.f7224b;
        int d8 = u.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f7225c);
        Boolean bool = this.f7226d;
        int hashCode2 = (d8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f7227e;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f7228f;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f7229g;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f7230h;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f7231i;
        int hashCode7 = (hashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.j;
        int hashCode8 = (hashCode7 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Integer num = this.f7232k;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f7233l;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f7234m;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l9 = this.f7235n;
        int hashCode12 = (hashCode11 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Integer num4 = this.f7236o;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f7237p;
        int hashCode14 = (hashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f7238q;
        return hashCode14 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(6222) + this.f7223a + StubApp.getString2(1065) + this.f7224b + StubApp.getString2(6223) + this.f7225c + StubApp.getString2(6224) + this.f7226d + StubApp.getString2(6225) + this.f7227e + StubApp.getString2(6226) + this.f7228f + StubApp.getString2(6227) + this.f7229g + StubApp.getString2(6228) + this.f7230h + StubApp.getString2(6229) + this.f7231i + StubApp.getString2(6230) + this.j + StubApp.getString2(6231) + this.f7232k + StubApp.getString2(6232) + this.f7233l + StubApp.getString2(6233) + this.f7234m + StubApp.getString2(6234) + this.f7235n + StubApp.getString2(6235) + this.f7236o + StubApp.getString2(1556) + this.f7237p + StubApp.getString2(6236) + this.f7238q + StubApp.getString2(74);
    }
}
