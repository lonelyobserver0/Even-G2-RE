package L0;

import android.os.Looper;
import o0.AbstractC1416M;
import o0.C1444s;
import o0.C1447v;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import t0.C1712l;
import t0.InterfaceC1708h;
import t0.InterfaceC1726z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class T extends AbstractC0105a {

    /* renamed from: h, reason: collision with root package name */
    public final Y.m f3983h;
    public final C2.d j;

    /* renamed from: k, reason: collision with root package name */
    public final A0.j f3984k;

    /* renamed from: l, reason: collision with root package name */
    public final I4.e f3985l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3986m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3987n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3988p = true;

    /* renamed from: q, reason: collision with root package name */
    public long f3989q = -9223372036854775807L;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3990r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3991s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1726z f3992t;

    /* renamed from: v, reason: collision with root package name */
    public C1447v f3993v;

    public T(C1447v c1447v, Y.m mVar, C2.d dVar, A0.j jVar, I4.e eVar, int i3, boolean z2) {
        this.f3993v = c1447v;
        this.f3983h = mVar;
        this.j = dVar;
        this.f3984k = jVar;
        this.f3985l = eVar;
        this.f3986m = i3;
        this.f3987n = z2;
    }

    @Override // L0.AbstractC0105a
    public final InterfaceC0129z b(B b2, P0.e eVar, long j) {
        InterfaceC1708h g10 = this.f3983h.g();
        InterfaceC1726z interfaceC1726z = this.f3992t;
        if (interfaceC1726z != null) {
            ((C1712l) g10).y(interfaceC1726z);
        }
        C1444s c1444s = h().f18249b;
        c1444s.getClass();
        AbstractC1550k.h(this.f4045g);
        Q2.g gVar = new Q2.g((T0.r) this.j.f1057b);
        A0.f fVar = new A0.f(this.f4042d.f34c, 0, b2);
        A0.f a3 = a(b2);
        long J10 = AbstractC1560u.J(c1444s.f18246e);
        return new Q(c1444s.f18242a, g10, gVar, this.f3984k, fVar, this.f3985l, a3, this, eVar, this.f3986m, this.f3987n, J10, null);
    }

    @Override // L0.AbstractC0105a
    public final synchronized C1447v h() {
        return this.f3993v;
    }

    @Override // L0.AbstractC0105a
    public final void j() {
    }

    @Override // L0.AbstractC0105a
    public final void l(InterfaceC1726z interfaceC1726z) {
        this.f3992t = interfaceC1726z;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        w0.j jVar = this.f4045g;
        AbstractC1550k.h(jVar);
        A0.j jVar2 = this.f3984k;
        jVar2.c(myLooper, jVar);
        jVar2.prepare();
        w();
    }

    @Override // L0.AbstractC0105a
    public final void n(InterfaceC0129z interfaceC0129z) {
        Q q10 = (Q) interfaceC0129z;
        if (q10.f3977z) {
            for (Y y10 : q10.f3974w) {
                y10.g();
                Z9.q qVar = y10.f4021h;
                if (qVar != null) {
                    qVar.I(y10.f4018e);
                    y10.f4021h = null;
                    y10.f4020g = null;
                }
            }
        }
        q10.f3966m.e(q10);
        q10.f3971s.removeCallbacksAndMessages(null);
        q10.f3972t = null;
        q10.f3955Z = true;
    }

    @Override // L0.AbstractC0105a
    public final void q() {
        this.f3984k.release();
    }

    @Override // L0.AbstractC0105a
    public final synchronized void v(C1447v c1447v) {
        this.f3993v = c1447v;
    }

    public final void w() {
        AbstractC1416M d0Var = new d0(this.f3989q, this.f3990r, this.f3991s, h());
        if (this.f3988p) {
            d0Var = new H0.u(d0Var, 1);
        }
        m(d0Var);
    }

    public final void x(boolean z2, boolean z10, long j) {
        if (j == -9223372036854775807L) {
            j = this.f3989q;
        }
        if (!this.f3988p && this.f3989q == j && this.f3990r == z2 && this.f3991s == z10) {
            return;
        }
        this.f3989q = j;
        this.f3990r = z2;
        this.f3991s = z10;
        this.f3988p = false;
        w();
    }
}
