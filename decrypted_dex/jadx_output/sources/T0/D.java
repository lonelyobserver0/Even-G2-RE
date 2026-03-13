package T0;

import o0.AbstractC1405B;
import o0.C1437l;
import r0.AbstractC1550k;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class D implements o {

    /* renamed from: a, reason: collision with root package name */
    public final int f6930a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6931b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6932c;

    /* renamed from: d, reason: collision with root package name */
    public int f6933d;

    /* renamed from: e, reason: collision with root package name */
    public int f6934e;

    /* renamed from: f, reason: collision with root package name */
    public q f6935f;

    /* renamed from: g, reason: collision with root package name */
    public H f6936g;

    public D(int i3, int i10, String str) {
        this.f6930a = i3;
        this.f6931b = i10;
        this.f6932c = str;
    }

    @Override // T0.o
    public final void b(long j, long j3) {
        if (j == 0 || this.f6934e == 1) {
            this.f6934e = 1;
            this.f6933d = 0;
        }
    }

    @Override // T0.o
    public final int c(p pVar, s sVar) {
        int i3 = this.f6934e;
        if (i3 != 1) {
            if (i3 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        H h2 = this.f6936g;
        h2.getClass();
        int b2 = h2.b(pVar, 1024, true);
        if (b2 != -1) {
            this.f6933d += b2;
            return 0;
        }
        this.f6934e = 2;
        this.f6936g.c(0L, 1, this.f6933d, 0, null);
        this.f6933d = 0;
        return 0;
    }

    @Override // T0.o
    public final void f(q qVar) {
        this.f6935f = qVar;
        H w10 = qVar.w(1024, 4);
        this.f6936g = w10;
        C1437l c1437l = new C1437l();
        c1437l.f18177m = AbstractC1405B.m(this.f6932c);
        E1.a.w(c1437l, w10);
        this.f6935f.q();
        this.f6935f.D(new E());
        this.f6934e = 1;
    }

    @Override // T0.o
    public final boolean h(p pVar) {
        int i3 = this.f6931b;
        int i10 = this.f6930a;
        AbstractC1550k.g((i10 == -1 || i3 == -1) ? false : true);
        C1553n c1553n = new C1553n(i3);
        ((l) pVar).i(c1553n.f20176a, 0, i3, false);
        return c1553n.A() == i10;
    }

    @Override // T0.o
    public final void release() {
    }
}
