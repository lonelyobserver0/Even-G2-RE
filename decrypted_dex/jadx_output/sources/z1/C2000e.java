package z1;

import T0.J;
import r0.AbstractC1550k;
import r0.C1553n;

/* renamed from: z1.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C2000e implements T0.o {

    /* renamed from: c, reason: collision with root package name */
    public final C1553n f23778c;

    /* renamed from: d, reason: collision with root package name */
    public final J f23779d;

    /* renamed from: e, reason: collision with root package name */
    public T0.q f23780e;

    /* renamed from: f, reason: collision with root package name */
    public long f23781f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23783h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f23784i;

    /* renamed from: a, reason: collision with root package name */
    public final C2001f f23776a = new C2001f(0, null, true);

    /* renamed from: b, reason: collision with root package name */
    public final C1553n f23777b = new C1553n(2048);

    /* renamed from: g, reason: collision with root package name */
    public long f23782g = -1;

    public C2000e() {
        C1553n c1553n = new C1553n(10);
        this.f23778c = c1553n;
        byte[] bArr = c1553n.f20176a;
        this.f23779d = new J(bArr, bArr.length);
    }

    @Override // T0.o
    public final void b(long j, long j3) {
        this.f23783h = false;
        this.f23776a.a();
        this.f23781f = j3;
    }

    @Override // T0.o
    public final int c(T0.p pVar, T0.s sVar) {
        AbstractC1550k.h(this.f23780e);
        long j = ((T0.l) pVar).f7029c;
        C1553n c1553n = this.f23777b;
        int read = ((T0.l) pVar).read(c1553n.f20176a, 0, 2048);
        boolean z2 = read == -1;
        if (!this.f23784i) {
            this.f23780e.D(new T0.t(-9223372036854775807L));
            this.f23784i = true;
        }
        if (z2) {
            return -1;
        }
        c1553n.G(0);
        c1553n.F(read);
        boolean z10 = this.f23783h;
        C2001f c2001f = this.f23776a;
        if (!z10) {
            c2001f.f23804t = this.f23781f;
            this.f23783h = true;
        }
        c2001f.c(c1553n);
        return 0;
    }

    @Override // T0.o
    public final void f(T0.q qVar) {
        this.f23780e = qVar;
        this.f23776a.f(qVar, new C1994F(0, 1));
        qVar.q();
    }

    @Override // T0.o
    public final boolean h(T0.p pVar) {
        T0.l lVar = (T0.l) pVar;
        int i3 = 0;
        while (true) {
            C1553n c1553n = this.f23778c;
            lVar.i(c1553n.f20176a, 0, 10, false);
            c1553n.G(0);
            if (c1553n.x() != 4801587) {
                break;
            }
            c1553n.H(3);
            int t3 = c1553n.t();
            i3 += t3 + 10;
            lVar.a(t3, false);
        }
        lVar.f7032f = 0;
        lVar.a(i3, false);
        if (this.f23782g == -1) {
            this.f23782g = i3;
        }
        int i10 = i3;
        int i11 = 0;
        int i12 = 0;
        do {
            C1553n c1553n2 = this.f23778c;
            lVar.i(c1553n2.f20176a, 0, 2, false);
            c1553n2.G(0);
            if ((c1553n2.A() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.i(c1553n2.f20176a, 0, 4, false);
                J j = this.f23779d;
                j.q(14);
                int i13 = j.i(13);
                if (i13 <= 6) {
                    i10++;
                    lVar.f7032f = 0;
                    lVar.a(i10, false);
                } else {
                    lVar.a(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                lVar.f7032f = 0;
                lVar.a(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - i3 < 8192);
        return false;
    }

    @Override // T0.o
    public final void release() {
    }
}
