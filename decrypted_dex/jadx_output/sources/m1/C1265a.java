package m1;

import T0.A;
import T0.B;
import T0.C;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1265a implements f, B {

    /* renamed from: a, reason: collision with root package name */
    public final long f17005a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17006b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17007c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17008d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17009e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17010f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17011g;

    /* renamed from: h, reason: collision with root package name */
    public final long f17012h;

    /* renamed from: i, reason: collision with root package name */
    public final int f17013i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f17014k;

    /* renamed from: l, reason: collision with root package name */
    public final long f17015l;

    public C1265a(long j, long j3, int i3, int i10, boolean z2) {
        this.f17005a = j;
        this.f17006b = j3;
        this.f17007c = i10 == -1 ? 1 : i10;
        this.f17009e = i3;
        this.f17011g = z2;
        if (j == -1) {
            this.f17008d = -1L;
            this.f17010f = -9223372036854775807L;
        } else {
            long j10 = j - j3;
            this.f17008d = j10;
            this.f17010f = (Math.max(0L, j10) * 8000000) / i3;
        }
        this.f17012h = j3;
        this.f17013i = i3;
        this.j = i10;
        this.f17014k = z2;
        this.f17015l = j == -1 ? -1L : j;
    }

    @Override // m1.f
    public final long a(long j) {
        return (Math.max(0L, j - this.f17006b) * 8000000) / this.f17009e;
    }

    @Override // m1.f
    public final long d() {
        return this.f17015l;
    }

    @Override // T0.B
    public final boolean e() {
        return this.f17008d != -1 || this.f17011g;
    }

    @Override // T0.B
    public final A i(long j) {
        long j3 = this.f17008d;
        long j10 = this.f17006b;
        if (j3 == -1 && !this.f17011g) {
            C c10 = new C(0L, j10);
            return new A(c10, c10);
        }
        int i3 = this.f17009e;
        long j11 = this.f17007c;
        long j12 = (((i3 * j) / 8000000) / j11) * j11;
        if (j3 != -1) {
            j12 = Math.min(j12, j3 - j11);
        }
        long max = Math.max(j12, 0L) + j10;
        long max2 = (Math.max(0L, max - j10) * 8000000) / i3;
        C c11 = new C(max2, max);
        if (j3 != -1 && max2 < j) {
            long j13 = max + j11;
            if (j13 < this.f17005a) {
                return new A(c11, new C((Math.max(0L, j13 - j10) * 8000000) / i3, j13));
            }
        }
        return new A(c11, c11);
    }

    @Override // m1.f
    public final int j() {
        return this.f17013i;
    }

    @Override // T0.B
    public final long k() {
        return this.f17010f;
    }
}
