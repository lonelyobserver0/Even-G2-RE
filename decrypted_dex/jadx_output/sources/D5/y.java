package D5;

import android.net.Uri;
import android.text.TextUtils;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f1469a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1470b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f1471c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1472d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1473e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f1474f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1475g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1476h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1477i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f1478k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1479l;

    /* renamed from: m, reason: collision with root package name */
    public final String f1480m;

    /* renamed from: n, reason: collision with root package name */
    public final Uri f1481n;

    /* renamed from: o, reason: collision with root package name */
    public final String f1482o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f1483p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f1484q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f1485r;

    public y(s2.d dVar) {
        String[] strArr;
        String[] strArr2;
        String string2 = StubApp.getString2(1495);
        this.f1469a = dVar.v(string2);
        this.f1470b = dVar.q(string2);
        Object[] p8 = dVar.p(string2);
        if (p8 == null) {
            strArr = null;
        } else {
            strArr = new String[p8.length];
            for (int i3 = 0; i3 < p8.length; i3++) {
                strArr[i3] = String.valueOf(p8[i3]);
            }
        }
        this.f1471c = strArr;
        String string22 = StubApp.getString2(1496);
        this.f1472d = dVar.v(string22);
        this.f1473e = dVar.q(string22);
        Object[] p9 = dVar.p(string22);
        if (p9 == null) {
            strArr2 = null;
        } else {
            strArr2 = new String[p9.length];
            for (int i10 = 0; i10 < p9.length; i10++) {
                strArr2[i10] = String.valueOf(p9[i10]);
            }
        }
        this.f1474f = strArr2;
        this.f1475g = dVar.v(StubApp.getString2(1497));
        String v2 = dVar.v(StubApp.getString2(1498));
        this.f1477i = TextUtils.isEmpty(v2) ? dVar.v(StubApp.getString2(1499)) : v2;
        this.j = dVar.v(StubApp.getString2(1500));
        this.f1478k = dVar.v(StubApp.getString2(1501));
        this.f1479l = dVar.v(StubApp.getString2(1502));
        this.f1480m = dVar.v(StubApp.getString2(1503));
        String v8 = dVar.v(StubApp.getString2(1504));
        v8 = TextUtils.isEmpty(v8) ? dVar.v(StubApp.getString2(1505)) : v8;
        this.f1481n = TextUtils.isEmpty(v8) ? null : Uri.parse(v8);
        this.f1476h = dVar.v(StubApp.getString2(1506));
        this.f1482o = dVar.v(StubApp.getString2(1507));
        this.f1483p = dVar.k(StubApp.getString2(1508));
        this.f1484q = dVar.k(StubApp.getString2(1509));
        this.f1485r = dVar.k(StubApp.getString2(1510));
        dVar.c(StubApp.getString2(1511));
        dVar.c(StubApp.getString2(1512));
        dVar.c(StubApp.getString2(1513));
        dVar.c(StubApp.getString2(1514));
        dVar.c(StubApp.getString2(1515));
        dVar.s();
        dVar.n();
        dVar.w();
    }
}
