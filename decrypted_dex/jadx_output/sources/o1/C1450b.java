package o1;

import T0.B;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: o1.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1450b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final f f18309a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18310b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18311c;

    /* renamed from: d, reason: collision with root package name */
    public final i f18312d;

    /* renamed from: e, reason: collision with root package name */
    public int f18313e;

    /* renamed from: f, reason: collision with root package name */
    public long f18314f;

    /* renamed from: g, reason: collision with root package name */
    public long f18315g;

    /* renamed from: h, reason: collision with root package name */
    public long f18316h;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public long f18317k;

    /* renamed from: l, reason: collision with root package name */
    public long f18318l;

    /* renamed from: m, reason: collision with root package name */
    public long f18319m;

    public C1450b(i iVar, long j, long j3, long j10, long j11, boolean z2) {
        AbstractC1550k.c(j >= 0 && j3 > j);
        this.f18312d = iVar;
        this.f18310b = j;
        this.f18311c = j3;
        if (j10 == j3 - j || z2) {
            this.f18314f = j11;
            this.f18313e = 4;
        } else {
            this.f18313e = 0;
        }
        this.f18309a = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // o1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(T0.l r29) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.C1450b.c(T0.l):long");
    }

    @Override // o1.g
    public final B d() {
        if (this.f18314f != 0) {
            return new C1449a(this);
        }
        return null;
    }

    @Override // o1.g
    public final void e(long j) {
        this.f18316h = AbstractC1560u.j(j, 0L, this.f18314f - 1);
        this.f18313e = 2;
        this.j = this.f18310b;
        this.f18317k = this.f18311c;
        this.f18318l = 0L;
        this.f18319m = this.f18314f;
    }
}
