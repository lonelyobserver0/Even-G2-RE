package X7;

import com.stub.StubApp;
import i2.u;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f8481a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8482b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8483c;

    /* renamed from: d, reason: collision with root package name */
    public final b f8484d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8485e;

    /* renamed from: f, reason: collision with root package name */
    public final Date f8486f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f8487g;

    /* renamed from: h, reason: collision with root package name */
    public final Date f8488h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8489i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f8490k;

    /* renamed from: l, reason: collision with root package name */
    public final List f8491l;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f8492m;

    /* renamed from: n, reason: collision with root package name */
    public final String f8493n;

    /* renamed from: o, reason: collision with root package name */
    public final String f8494o;

    /* renamed from: p, reason: collision with root package name */
    public final List f8495p;

    /* renamed from: q, reason: collision with root package name */
    public final String f8496q;

    /* renamed from: r, reason: collision with root package name */
    public final String f8497r;

    /* renamed from: s, reason: collision with root package name */
    public final Long f8498s;

    /* renamed from: t, reason: collision with root package name */
    public final List f8499t;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f8500u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f8501v;

    public c(String id, int i3, String impact, b bVar, boolean z2, Date date, Date date2, Date date3, String str, String str2, String str3, List list, HashMap trafficCodes, String str4, String str5, List lanesBlocked, String str6, String str7, Long l9, List list2, HashMap multilingualAffectedRoadNames, Integer num) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(impact, "impact");
        Intrinsics.checkNotNullParameter(trafficCodes, "trafficCodes");
        Intrinsics.checkNotNullParameter(lanesBlocked, "lanesBlocked");
        Intrinsics.checkNotNullParameter(multilingualAffectedRoadNames, "multilingualAffectedRoadNames");
        this.f8481a = id;
        this.f8482b = i3;
        this.f8483c = impact;
        this.f8484d = bVar;
        this.f8485e = z2;
        this.f8486f = date;
        this.f8487g = date2;
        this.f8488h = date3;
        this.f8489i = str;
        this.j = str2;
        this.f8490k = str3;
        this.f8491l = list;
        this.f8492m = trafficCodes;
        this.f8493n = str4;
        this.f8494o = str5;
        this.f8495p = lanesBlocked;
        this.f8496q = str6;
        this.f8497r = str7;
        this.f8498s = l9;
        this.f8499t = list2;
        this.f8500u = multilingualAffectedRoadNames;
        this.f8501v = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.incident.IncidentInfo");
        c cVar = (c) obj;
        return this.f8482b == cVar.f8482b && Intrinsics.areEqual(this.f8481a, cVar.f8481a) && Intrinsics.areEqual(this.f8483c, cVar.f8483c) && Intrinsics.areEqual(this.f8484d, cVar.f8484d) && this.f8485e == cVar.f8485e && Intrinsics.areEqual(this.f8486f, cVar.f8486f) && Intrinsics.areEqual(this.f8487g, cVar.f8487g) && Intrinsics.areEqual(this.f8488h, cVar.f8488h) && Intrinsics.areEqual(this.f8489i, cVar.f8489i) && Intrinsics.areEqual(this.j, cVar.j) && Intrinsics.areEqual(this.f8490k, cVar.f8490k) && Intrinsics.areEqual(this.f8491l, cVar.f8491l) && Intrinsics.areEqual(this.f8492m, cVar.f8492m) && Intrinsics.areEqual(this.f8493n, cVar.f8493n) && Intrinsics.areEqual(this.f8494o, cVar.f8494o) && Intrinsics.areEqual(this.f8495p, cVar.f8495p) && Intrinsics.areEqual(this.f8496q, cVar.f8496q) && Intrinsics.areEqual(this.f8497r, cVar.f8497r) && Intrinsics.areEqual(this.f8498s, cVar.f8498s) && Intrinsics.areEqual(this.f8499t, cVar.f8499t) && Intrinsics.areEqual(this.f8500u, cVar.f8500u) && Intrinsics.areEqual(this.f8501v, cVar.f8501v);
    }

    public final int hashCode() {
        int d8 = u.d(E1.a.e(this.f8482b, this.f8481a.hashCode() * 31, 31), 31, this.f8483c);
        b bVar = this.f8484d;
        int e10 = u.e((d8 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.f8485e);
        Date date = this.f8486f;
        int hashCode = (e10 + (date != null ? date.hashCode() : 0)) * 31;
        Date date2 = this.f8487g;
        int hashCode2 = (hashCode + (date2 != null ? date2.hashCode() : 0)) * 31;
        Date date3 = this.f8488h;
        int hashCode3 = (hashCode2 + (date3 != null ? date3.hashCode() : 0)) * 31;
        String str = this.f8489i;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.j;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8490k;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List list = this.f8491l;
        int hashCode7 = (this.f8492m.hashCode() + ((hashCode6 + (list != null ? list.hashCode() : 0)) * 31)) * 31;
        String str4 = this.f8493n;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f8494o;
        int g10 = E1.a.g((hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.f8495p);
        String str6 = this.f8496q;
        int hashCode9 = (g10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f8497r;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Long l9 = this.f8498s;
        int hashCode11 = (hashCode10 + (l9 != null ? l9.hashCode() : 0)) * 31;
        List list2 = this.f8499t;
        int hashCode12 = (this.f8500u.hashCode() + ((hashCode11 + (list2 != null ? list2.hashCode() : 0)) * 31)) * 31;
        Integer num = this.f8501v;
        return hashCode12 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(7292) + this.f8481a + StubApp.getString2(7293) + this.f8482b + StubApp.getString2(7294) + this.f8483c + StubApp.getString2(7295) + this.f8484d + StubApp.getString2(7296) + this.f8485e + StubApp.getString2(7297) + this.f8486f + StubApp.getString2(7298) + this.f8487g + StubApp.getString2(7299) + this.f8488h + StubApp.getString2(7300) + this.f8489i + StubApp.getString2(7301) + this.j + StubApp.getString2(7302) + this.f8490k + StubApp.getString2(7303) + this.f8491l + StubApp.getString2(7304) + this.f8492m + StubApp.getString2(7305) + this.f8493n + StubApp.getString2(7306) + this.f8494o + StubApp.getString2(7307) + this.f8495p + StubApp.getString2(7308) + this.f8496q + StubApp.getString2(7309) + this.f8497r + StubApp.getString2(7310) + this.f8498s + StubApp.getString2(7311) + this.f8499t + StubApp.getString2(7312) + this.f8500u + StubApp.getString2(5307) + this.f8501v + ')';
    }
}
