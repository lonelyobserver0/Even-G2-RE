package T0;

import r0.AbstractC1560u;

/* renamed from: T0.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0316g {

    /* renamed from: a, reason: collision with root package name */
    public final long f7009a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7010b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7011c;

    /* renamed from: d, reason: collision with root package name */
    public long f7012d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f7013e;

    /* renamed from: f, reason: collision with root package name */
    public long f7014f;

    /* renamed from: g, reason: collision with root package name */
    public long f7015g;

    /* renamed from: h, reason: collision with root package name */
    public long f7016h;

    public C0316g(long j, long j3, long j10, long j11, long j12, long j13) {
        this.f7009a = j;
        this.f7010b = j3;
        this.f7013e = j10;
        this.f7014f = j11;
        this.f7015g = j12;
        this.f7011c = j13;
        this.f7016h = a(j3, 0L, j10, j11, j12, j13);
    }

    public static long a(long j, long j3, long j10, long j11, long j12, long j13) {
        if (j11 + 1 >= j12 || j3 + 1 >= j10) {
            return j11;
        }
        long j14 = (long) ((j - j3) * ((j12 - j11) / (j10 - j3)));
        return AbstractC1560u.j(((j14 + j11) - j13) - (j14 / 20), j11, j12 - 1);
    }
}
