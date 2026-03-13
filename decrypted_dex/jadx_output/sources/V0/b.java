package V0;

import T0.l;
import T0.o;
import T0.p;
import T0.q;
import l4.C1145A;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final C1553n f7673a;

    /* renamed from: b, reason: collision with root package name */
    public final R0.d f7674b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7675c;

    /* renamed from: d, reason: collision with root package name */
    public final C1145A f7676d;

    /* renamed from: e, reason: collision with root package name */
    public int f7677e;

    /* renamed from: f, reason: collision with root package name */
    public q f7678f;

    /* renamed from: g, reason: collision with root package name */
    public c f7679g;

    /* renamed from: h, reason: collision with root package name */
    public long f7680h;

    /* renamed from: i, reason: collision with root package name */
    public e[] f7681i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public e f7682k;

    /* renamed from: l, reason: collision with root package name */
    public int f7683l;

    /* renamed from: m, reason: collision with root package name */
    public long f7684m;

    /* renamed from: n, reason: collision with root package name */
    public long f7685n;

    /* renamed from: o, reason: collision with root package name */
    public int f7686o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7687p;

    public b(int i3, C1145A c1145a) {
        this.f7676d = c1145a;
        this.f7675c = (i3 & 1) == 0;
        this.f7673a = new C1553n(12);
        this.f7674b = new R0.d(2);
        this.f7678f = new u5.d(19);
        this.f7681i = new e[0];
        this.f7684m = -1L;
        this.f7685n = -1L;
        this.f7683l = -1;
        this.f7680h = -9223372036854775807L;
    }

    @Override // T0.o
    public final void b(long j, long j3) {
        this.j = -1L;
        this.f7682k = null;
        for (e eVar : this.f7681i) {
            if (eVar.j == 0) {
                eVar.f7703h = 0;
            } else {
                eVar.f7703h = eVar.f7707m[AbstractC1560u.e(eVar.f7706l, j, true)];
            }
        }
        if (j != 0) {
            this.f7677e = 6;
        } else if (this.f7681i.length == 0) {
            this.f7677e = 0;
        } else {
            this.f7677e = 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c  */
    @Override // T0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(T0.p r23, T0.s r24) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.b.c(T0.p, T0.s):int");
    }

    @Override // T0.o
    public final void f(q qVar) {
        this.f7677e = 0;
        if (this.f7675c) {
            qVar = new a5.c(qVar, this.f7676d);
        }
        this.f7678f = qVar;
        this.j = -1L;
    }

    @Override // T0.o
    public final boolean h(p pVar) {
        C1553n c1553n = this.f7673a;
        ((l) pVar).i(c1553n.f20176a, 0, 12, false);
        c1553n.G(0);
        if (c1553n.j() == 1179011410) {
            c1553n.H(4);
            if (c1553n.j() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // T0.o
    public final void release() {
    }
}
