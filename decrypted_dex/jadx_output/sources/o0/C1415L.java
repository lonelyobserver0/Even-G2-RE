package o0;

import M4.Z;
import android.net.Uri;
import com.stub.StubApp;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import r0.AbstractC1560u;

/* renamed from: o0.L, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1415L {

    /* renamed from: q, reason: collision with root package name */
    public static final Object f18049q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final C1447v f18050r;

    /* renamed from: b, reason: collision with root package name */
    public Object f18052b;

    /* renamed from: d, reason: collision with root package name */
    public Object f18054d;

    /* renamed from: e, reason: collision with root package name */
    public long f18055e;

    /* renamed from: f, reason: collision with root package name */
    public long f18056f;

    /* renamed from: g, reason: collision with root package name */
    public long f18057g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18058h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18059i;
    public C1443r j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18060k;

    /* renamed from: l, reason: collision with root package name */
    public long f18061l;

    /* renamed from: m, reason: collision with root package name */
    public long f18062m;

    /* renamed from: n, reason: collision with root package name */
    public int f18063n;

    /* renamed from: o, reason: collision with root package name */
    public int f18064o;

    /* renamed from: p, reason: collision with root package name */
    public long f18065p;

    /* renamed from: a, reason: collision with root package name */
    public Object f18051a = f18049q;

    /* renamed from: c, reason: collision with root package name */
    public C1447v f18053c = f18050r;

    static {
        T0.s sVar = new T0.s();
        M4.G g10 = M4.I.f4549b;
        Z z2 = Z.f4578e;
        List list = Collections.EMPTY_LIST;
        Z z10 = Z.f4578e;
        C1442q c1442q = new C1442q();
        C1445t c1445t = C1445t.f18247a;
        Uri uri = Uri.EMPTY;
        f18050r = new C1447v(StubApp.getString2(21522), new C1441p(sVar), uri != null ? new C1444s(uri, null, null, list, z10, -9223372036854775807L) : null, new C1443r(c1442q), y.f18281B, c1445t);
        i2.u.A(1, 2, 3, 4, 5);
        i2.u.A(6, 7, 8, 9, 10);
        AbstractC1560u.E(11);
        AbstractC1560u.E(12);
        AbstractC1560u.E(13);
    }

    public final boolean a() {
        return this.j != null;
    }

    public final void b(C1447v c1447v, Object obj, long j, long j3, long j10, boolean z2, boolean z10, C1443r c1443r, long j11, long j12, int i3, long j13) {
        this.f18051a = f18049q;
        this.f18053c = c1447v != null ? c1447v : f18050r;
        if (c1447v != null) {
            C1444s c1444s = c1447v.f18249b;
        }
        this.f18052b = null;
        this.f18054d = obj;
        this.f18055e = j;
        this.f18056f = j3;
        this.f18057g = j10;
        this.f18058h = z2;
        this.f18059i = z10;
        this.j = c1443r;
        this.f18061l = j11;
        this.f18062m = j12;
        this.f18063n = 0;
        this.f18064o = i3;
        this.f18065p = j13;
        this.f18060k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C1415L.class.equals(obj.getClass())) {
            return false;
        }
        C1415L c1415l = (C1415L) obj;
        return Objects.equals(this.f18051a, c1415l.f18051a) && Objects.equals(this.f18053c, c1415l.f18053c) && Objects.equals(this.f18054d, c1415l.f18054d) && Objects.equals(this.j, c1415l.j) && this.f18055e == c1415l.f18055e && this.f18056f == c1415l.f18056f && this.f18057g == c1415l.f18057g && this.f18058h == c1415l.f18058h && this.f18059i == c1415l.f18059i && this.f18060k == c1415l.f18060k && this.f18061l == c1415l.f18061l && this.f18062m == c1415l.f18062m && this.f18063n == c1415l.f18063n && this.f18064o == c1415l.f18064o && this.f18065p == c1415l.f18065p;
    }

    public final int hashCode() {
        int hashCode = (this.f18053c.hashCode() + ((this.f18051a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f18054d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C1443r c1443r = this.j;
        int hashCode3 = (hashCode2 + (c1443r != null ? c1443r.hashCode() : 0)) * 31;
        long j = this.f18055e;
        int i3 = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.f18056f;
        int i10 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j10 = this.f18057g;
        int i11 = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f18058h ? 1 : 0)) * 31) + (this.f18059i ? 1 : 0)) * 31) + (this.f18060k ? 1 : 0)) * 31;
        long j11 = this.f18061l;
        int i12 = (i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f18062m;
        int i13 = (((((i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f18063n) * 31) + this.f18064o) * 31;
        long j13 = this.f18065p;
        return i13 + ((int) (j13 ^ (j13 >>> 32)));
    }
}
