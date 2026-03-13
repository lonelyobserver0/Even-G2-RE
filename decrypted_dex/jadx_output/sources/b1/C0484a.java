package b1;

import T0.l;
import T0.o;
import T0.p;
import T0.q;
import T0.t;
import i1.C1032a;
import n1.k;
import r0.C1553n;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0484a implements o {

    /* renamed from: b, reason: collision with root package name */
    public q f10480b;

    /* renamed from: c, reason: collision with root package name */
    public int f10481c;

    /* renamed from: d, reason: collision with root package name */
    public int f10482d;

    /* renamed from: e, reason: collision with root package name */
    public int f10483e;

    /* renamed from: g, reason: collision with root package name */
    public C1032a f10485g;

    /* renamed from: h, reason: collision with root package name */
    public l f10486h;

    /* renamed from: i, reason: collision with root package name */
    public Cc.a f10487i;
    public k j;

    /* renamed from: a, reason: collision with root package name */
    public final C1553n f10479a = new C1553n(6);

    /* renamed from: f, reason: collision with root package name */
    public long f10484f = -1;

    public final void a() {
        q qVar = this.f10480b;
        qVar.getClass();
        qVar.q();
        this.f10480b.D(new t(-9223372036854775807L));
        this.f10481c = 6;
    }

    @Override // T0.o
    public final void b(long j, long j3) {
        if (j == 0) {
            this.f10481c = 0;
            this.j = null;
        } else if (this.f10481c == 5) {
            k kVar = this.j;
            kVar.getClass();
            kVar.b(j, j3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x019d  */
    @Override // T0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(T0.p r26, T0.s r27) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C0484a.c(T0.p, T0.s):int");
    }

    @Override // T0.o
    public final void f(q qVar) {
        this.f10480b = qVar;
    }

    @Override // T0.o
    public final boolean h(p pVar) {
        l lVar = (l) pVar;
        C1553n c1553n = this.f10479a;
        c1553n.D(2);
        lVar.i(c1553n.f20176a, 0, 2, false);
        if (c1553n.A() == 65496) {
            c1553n.D(2);
            lVar.i(c1553n.f20176a, 0, 2, false);
            int A4 = c1553n.A();
            this.f10482d = A4;
            if (A4 == 65504) {
                c1553n.D(2);
                lVar.i(c1553n.f20176a, 0, 2, false);
                lVar.a(c1553n.A() - 2, false);
                c1553n.D(2);
                lVar.i(c1553n.f20176a, 0, 2, false);
                this.f10482d = c1553n.A();
            }
            if (this.f10482d == 65505) {
                lVar.a(2, false);
                c1553n.D(6);
                lVar.i(c1553n.f20176a, 0, 6, false);
                if (c1553n.w() == 1165519206 && c1553n.A() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // T0.o
    public final void release() {
        k kVar = this.j;
        if (kVar != null) {
            kVar.getClass();
        }
    }
}
