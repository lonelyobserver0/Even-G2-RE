package Z0;

import T0.l;
import T0.n;
import T0.o;
import T0.p;
import T0.q;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final C1553n f8920a = new C1553n(4);

    /* renamed from: b, reason: collision with root package name */
    public final C1553n f8921b = new C1553n(9);

    /* renamed from: c, reason: collision with root package name */
    public final C1553n f8922c = new C1553n(11);

    /* renamed from: d, reason: collision with root package name */
    public final C1553n f8923d = new C1553n();

    /* renamed from: e, reason: collision with root package name */
    public final c f8924e;

    /* renamed from: f, reason: collision with root package name */
    public q f8925f;

    /* renamed from: g, reason: collision with root package name */
    public int f8926g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8927h;

    /* renamed from: i, reason: collision with root package name */
    public long f8928i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f8929k;

    /* renamed from: l, reason: collision with root package name */
    public int f8930l;

    /* renamed from: m, reason: collision with root package name */
    public long f8931m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8932n;

    /* renamed from: o, reason: collision with root package name */
    public a f8933o;

    /* renamed from: p, reason: collision with root package name */
    public d f8934p;

    public b() {
        c cVar = new c(new n());
        cVar.f8935b = -9223372036854775807L;
        cVar.f8936c = new long[0];
        cVar.f8937d = new long[0];
        this.f8924e = cVar;
        this.f8926g = 1;
    }

    public final C1553n a(l lVar) {
        int i3 = this.f8930l;
        C1553n c1553n = this.f8923d;
        byte[] bArr = c1553n.f20176a;
        if (i3 > bArr.length) {
            c1553n.E(0, new byte[Math.max(bArr.length * 2, i3)]);
        } else {
            c1553n.G(0);
        }
        c1553n.F(this.f8930l);
        lVar.e(c1553n.f20176a, 0, this.f8930l, false);
        return c1553n;
    }

    @Override // T0.o
    public final void b(long j, long j3) {
        if (j == 0) {
            this.f8926g = 1;
            this.f8927h = false;
        } else {
            this.f8926g = 3;
        }
        this.j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0007 A[SYNTHETIC] */
    @Override // T0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(T0.p r32, T0.s r33) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.b.c(T0.p, T0.s):int");
    }

    @Override // T0.o
    public final void f(q qVar) {
        this.f8925f = qVar;
    }

    @Override // T0.o
    public final boolean h(p pVar) {
        C1553n c1553n = this.f8920a;
        l lVar = (l) pVar;
        lVar.i(c1553n.f20176a, 0, 3, false);
        c1553n.G(0);
        if (c1553n.x() == 4607062) {
            lVar.i(c1553n.f20176a, 0, 2, false);
            c1553n.G(0);
            if ((c1553n.A() & 250) == 0) {
                lVar.i(c1553n.f20176a, 0, 4, false);
                c1553n.G(0);
                int h2 = c1553n.h();
                lVar.f7032f = 0;
                lVar.a(h2, false);
                lVar.i(c1553n.f20176a, 0, 4, false);
                c1553n.G(0);
                if (c1553n.h() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // T0.o
    public final void release() {
    }
}
