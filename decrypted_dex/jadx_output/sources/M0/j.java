package M0;

import L0.Y;
import T0.H;
import Z9.C;
import o0.AbstractC1405B;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.C1553n;
import t0.C1711k;
import t0.C1725y;
import t0.InterfaceC1708h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends a {

    /* renamed from: q, reason: collision with root package name */
    public final int f4492q;

    /* renamed from: r, reason: collision with root package name */
    public final long f4493r;

    /* renamed from: s, reason: collision with root package name */
    public final f f4494s;

    /* renamed from: t, reason: collision with root package name */
    public long f4495t;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f4496v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4497w;

    public j(InterfaceC1708h interfaceC1708h, C1711k c1711k, C1438m c1438m, int i3, Object obj, long j, long j3, long j10, long j11, long j12, int i10, long j13, f fVar) {
        super(interfaceC1708h, c1711k, c1438m, i3, obj, j, j3, j10, j11, j12);
        this.f4492q = i10;
        this.f4493r = j13;
        this.f4494s = fVar;
    }

    @Override // M0.l
    public final long a() {
        return this.f4502k + this.f4492q;
    }

    @Override // M0.l
    public final boolean b() {
        return this.f4497w;
    }

    @Override // P0.l
    public final void l() {
        C c10 = this.f4434n;
        AbstractC1550k.h(c10);
        if (this.f4495t == 0) {
            long j = this.f4493r;
            for (Y y10 : (Y[]) c10.f9078c) {
                if (y10.f4012F != j) {
                    y10.f4012F = j;
                    y10.f4038z = true;
                }
            }
            f fVar = this.f4494s;
            long j3 = this.f4432l;
            long j10 = j3 == -9223372036854775807L ? -9223372036854775807L : j3 - this.f4493r;
            long j11 = this.f4433m;
            ((d) fVar).a(c10, j10, j11 != -9223372036854775807L ? j11 - this.f4493r : -9223372036854775807L);
        }
        try {
            C1711k a3 = this.f4456b.a(this.f4495t);
            C1725y c1725y = this.j;
            T0.l lVar = new T0.l(c1725y, a3.f21081e, c1725y.n(a3));
            while (!this.f4496v) {
                try {
                    int c11 = ((d) this.f4494s).f4447a.c(lVar, d.f4446l);
                    AbstractC1550k.g(c11 != 1);
                    if (!(c11 == 0)) {
                        break;
                    }
                } finally {
                    this.f4495t = lVar.f7030d - this.f4456b.f21081e;
                }
            }
            C1438m c1438m = this.f4458d;
            if (AbstractC1405B.j(c1438m.f18215m)) {
                int i3 = c1438m.f18200J;
                int i10 = c1438m.f18201K;
                if ((i3 > 1 || i10 > 1) && i3 != -1 && i10 != -1) {
                    H H2 = c10.H(4);
                    int i11 = i3 * i10;
                    long j12 = (this.f4462h - this.f4461g) / i11;
                    for (int i12 = 1; i12 < i11; i12++) {
                        H2.a(new C1553n(), 0, 0);
                        H2.c(i12 * j12, 0, 0, 0, null);
                    }
                }
            }
            W.a.a(this.j);
            this.f4497w = !this.f4496v;
        } catch (Throwable th) {
            W.a.a(this.j);
            throw th;
        }
    }

    @Override // P0.l
    public final void o() {
        this.f4496v = true;
    }
}
