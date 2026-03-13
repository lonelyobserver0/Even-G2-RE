package r2;

import com.stub.StubApp;
import i2.o;
import i2.u;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f {

    /* renamed from: s, reason: collision with root package name */
    public static final String f20301s = o.g(StubApp.getString2(4819));

    /* renamed from: a, reason: collision with root package name */
    public String f20302a;

    /* renamed from: b, reason: collision with root package name */
    public int f20303b = 1;

    /* renamed from: c, reason: collision with root package name */
    public String f20304c;

    /* renamed from: d, reason: collision with root package name */
    public String f20305d;

    /* renamed from: e, reason: collision with root package name */
    public i2.g f20306e;

    /* renamed from: f, reason: collision with root package name */
    public i2.g f20307f;

    /* renamed from: g, reason: collision with root package name */
    public long f20308g;

    /* renamed from: h, reason: collision with root package name */
    public long f20309h;

    /* renamed from: i, reason: collision with root package name */
    public long f20310i;
    public i2.b j;

    /* renamed from: k, reason: collision with root package name */
    public int f20311k;

    /* renamed from: l, reason: collision with root package name */
    public int f20312l;

    /* renamed from: m, reason: collision with root package name */
    public long f20313m;

    /* renamed from: n, reason: collision with root package name */
    public long f20314n;

    /* renamed from: o, reason: collision with root package name */
    public long f20315o;

    /* renamed from: p, reason: collision with root package name */
    public long f20316p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20317q;

    /* renamed from: r, reason: collision with root package name */
    public int f20318r;

    public f(String str, String str2) {
        i2.g gVar = i2.g.f14736c;
        this.f20306e = gVar;
        this.f20307f = gVar;
        this.j = i2.b.f14717i;
        this.f20312l = 1;
        this.f20313m = 30000L;
        this.f20316p = -1L;
        this.f20318r = 1;
        this.f20302a = str;
        this.f20304c = str2;
    }

    public final long a() {
        int i3;
        if (this.f20303b == 1 && (i3 = this.f20311k) > 0) {
            return Math.min(18000000L, this.f20312l == 2 ? this.f20313m * i3 : (long) Math.scalb(this.f20313m, i3 - 1)) + this.f20314n;
        }
        if (!c()) {
            long j = this.f20314n;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            return j + this.f20308g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = this.f20314n;
        if (j3 == 0) {
            j3 = this.f20308g + currentTimeMillis;
        }
        long j10 = this.f20310i;
        long j11 = this.f20309h;
        if (j10 != j11) {
            return j3 + j11 + (j3 == 0 ? j10 * (-1) : 0L);
        }
        return j3 + (j3 != 0 ? j11 : 0L);
    }

    public final boolean b() {
        return !i2.b.f14717i.equals(this.j);
    }

    public final boolean c() {
        return this.f20309h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f20308g != fVar.f20308g || this.f20309h != fVar.f20309h || this.f20310i != fVar.f20310i || this.f20311k != fVar.f20311k || this.f20313m != fVar.f20313m || this.f20314n != fVar.f20314n || this.f20315o != fVar.f20315o || this.f20316p != fVar.f20316p || this.f20317q != fVar.f20317q || !this.f20302a.equals(fVar.f20302a) || this.f20303b != fVar.f20303b || !this.f20304c.equals(fVar.f20304c)) {
            return false;
        }
        String str = this.f20305d;
        if (str != null) {
            if (!str.equals(fVar.f20305d)) {
                return false;
            }
        } else if (fVar.f20305d != null) {
            return false;
        }
        return this.f20306e.equals(fVar.f20306e) && this.f20307f.equals(fVar.f20307f) && this.j.equals(fVar.j) && this.f20312l == fVar.f20312l && this.f20318r == fVar.f20318r;
    }

    public final int hashCode() {
        int d8 = u.d((AbstractC1856e.c(this.f20303b) + (this.f20302a.hashCode() * 31)) * 31, 31, this.f20304c);
        String str = this.f20305d;
        int hashCode = (this.f20307f.hashCode() + ((this.f20306e.hashCode() + ((d8 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.f20308g;
        int i3 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.f20309h;
        int i10 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j10 = this.f20310i;
        int c10 = (AbstractC1856e.c(this.f20312l) + ((((this.j.hashCode() + ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31) + this.f20311k) * 31)) * 31;
        long j11 = this.f20313m;
        int i11 = (c10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f20314n;
        int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f20315o;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f20316p;
        return AbstractC1856e.c(this.f20318r) + ((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.f20317q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(22678)), this.f20302a, StubApp.getString2(265));
    }
}
