package w0;

import L0.B;
import L0.C0123t;
import L0.G;
import M4.I;
import M4.e0;
import R8.C0250h;
import V8.C0352d;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import o0.AbstractC1407D;
import o0.AbstractC1416M;
import o0.C1404A;
import o0.C1408E;
import o0.C1409F;
import o0.C1411H;
import o0.C1414K;
import o0.C1415L;
import o0.C1422T;
import o0.C1425W;
import o0.C1428c;
import o0.C1447v;
import o0.InterfaceC1410G;
import o0.y;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1549j;
import r0.C1555p;
import r0.C1557r;
import r0.InterfaceC1546g;
import sb.C1644e0;
import sb.C1674t0;
import v0.C1817l;
import v0.C1825u;
import v0.C1830z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c implements InterfaceC1410G, G, A0.g {

    /* renamed from: a, reason: collision with root package name */
    public final C1555p f21989a;

    /* renamed from: b, reason: collision with root package name */
    public final C1414K f21990b;

    /* renamed from: c, reason: collision with root package name */
    public final C1415L f21991c;

    /* renamed from: d, reason: collision with root package name */
    public final C0250h f21992d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f21993e;

    /* renamed from: f, reason: collision with root package name */
    public C1549j f21994f;

    /* renamed from: g, reason: collision with root package name */
    public C1830z f21995g;

    /* renamed from: h, reason: collision with root package name */
    public C1557r f21996h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21997i;

    public c(C1555p c1555p) {
        c1555p.getClass();
        this.f21989a = c1555p;
        int i3 = AbstractC1560u.f20190a;
        Looper myLooper = Looper.myLooper();
        this.f21994f = new C1549j(myLooper == null ? Looper.getMainLooper() : myLooper, c1555p, new C1674t0(29));
        C1414K c1414k = new C1414K();
        this.f21990b = c1414k;
        this.f21991c = new C1415L();
        this.f21992d = new C0250h(c1414k);
        this.f21993e = new SparseArray();
    }

    @Override // o0.InterfaceC1410G
    public final void A(int i3, int i10) {
        J(I(), 24, new b(12));
    }

    @Override // L0.G
    public final void B(int i3, B b2, C0123t c0123t, I0.g gVar) {
        J(H(i3, b2), 1001, new b(16));
    }

    @Override // L0.G
    public final void C(int i3, B b2, C0123t c0123t, I0.g gVar) {
        J(H(i3, b2), 1000, new b(25));
    }

    @Override // o0.InterfaceC1410G
    public final void D(boolean z2) {
        J(E(), 7, new C1674t0(20));
    }

    public final a E() {
        return F((B) this.f21992d.f6299d);
    }

    public final a F(B b2) {
        this.f21995g.getClass();
        AbstractC1416M abstractC1416M = b2 == null ? null : (AbstractC1416M) ((e0) this.f21992d.f6298c).get(b2);
        if (b2 != null && abstractC1416M != null) {
            return G(abstractC1416M, abstractC1416M.g(b2.f3881a, this.f21990b).f18044c, b2);
        }
        int q10 = this.f21995g.q();
        AbstractC1416M t3 = this.f21995g.t();
        if (q10 >= t3.o()) {
            t3 = AbstractC1416M.f18066a;
        }
        return G(t3, q10, null);
    }

    public final a G(AbstractC1416M abstractC1416M, int i3, B b2) {
        B b10 = abstractC1416M.p() ? null : b2;
        this.f21989a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = abstractC1416M.equals(this.f21995g.t()) && i3 == this.f21995g.q();
        long j = 0;
        if (b10 == null || !b10.b()) {
            if (z2) {
                C1830z c1830z = this.f21995g;
                c1830z.L();
                j = c1830z.n(c1830z.f21861v0);
            } else if (!abstractC1416M.p()) {
                j = AbstractC1560u.V(abstractC1416M.m(i3, this.f21991c, 0L).f18061l);
            }
        } else if (z2 && this.f21995g.o() == b10.f3882b && this.f21995g.p() == b10.f3883c) {
            j = this.f21995g.r();
        }
        B b11 = (B) this.f21992d.f6299d;
        AbstractC1416M t3 = this.f21995g.t();
        int q10 = this.f21995g.q();
        long r8 = this.f21995g.r();
        C1830z c1830z2 = this.f21995g;
        c1830z2.L();
        return new a(elapsedRealtime, abstractC1416M, i3, b10, j, t3, q10, b11, r8, AbstractC1560u.V(c1830z2.f21861v0.f21674r));
    }

    public final a H(int i3, B b2) {
        this.f21995g.getClass();
        if (b2 != null) {
            return ((AbstractC1416M) ((e0) this.f21992d.f6298c).get(b2)) != null ? F(b2) : G(AbstractC1416M.f18066a, i3, b2);
        }
        AbstractC1416M t3 = this.f21995g.t();
        if (i3 >= t3.o()) {
            t3 = AbstractC1416M.f18066a;
        }
        return G(t3, i3, null);
    }

    public final a I() {
        return F((B) this.f21992d.f6301f);
    }

    public final void J(a aVar, int i3, InterfaceC1546g interfaceC1546g) {
        this.f21993e.put(i3, aVar);
        this.f21994f.e(i3, interfaceC1546g);
    }

    public final void K(C1830z c1830z, Looper looper) {
        AbstractC1550k.g(this.f21995g == null || ((I) this.f21992d.f6297b).isEmpty());
        c1830z.getClass();
        this.f21995g = c1830z;
        this.f21996h = this.f21989a.a(looper, null);
        C1549j c1549j = this.f21994f;
        this.f21994f = new C1549j(c1549j.f20159d, looper, c1549j.f20156a, new kb.e(this, c1830z), c1549j.f20164i);
    }

    @Override // o0.InterfaceC1410G
    public final void a(int i3) {
        J(E(), 6, new C1674t0(23));
    }

    @Override // o0.InterfaceC1410G
    public final void b(C1409F c1409f) {
        J(E(), 13, new b(26));
    }

    @Override // o0.InterfaceC1410G
    public final void c(boolean z2) {
        J(E(), 3, new b(23));
    }

    @Override // o0.InterfaceC1410G
    public final void d(C1422T c1422t) {
        J(E(), 2, new C1674t0(21));
    }

    @Override // o0.InterfaceC1410G
    public final void e(int i3, boolean z2) {
        J(E(), 5, new C1674t0(27));
    }

    @Override // o0.InterfaceC1410G
    public final void f(C1425W c1425w) {
        a I10 = I();
        J(I10, 25, new C1825u(I10, c1425w));
    }

    @Override // o0.InterfaceC1410G
    public final void g(float f10) {
        J(I(), 22, new C1674t0(14));
    }

    @Override // o0.InterfaceC1410G
    public final void h(int i3) {
        J(E(), 4, new b(2));
    }

    @Override // o0.InterfaceC1410G
    public final void i(int i3, C1411H c1411h, C1411H c1411h2) {
        if (i3 == 1) {
            this.f21997i = false;
        }
        C1830z c1830z = this.f21995g;
        c1830z.getClass();
        C0250h c0250h = this.f21992d;
        c0250h.f6299d = C0250h.e(c1830z, (I) c0250h.f6297b, (B) c0250h.f6300e, (C1414K) c0250h.f6296a);
        a E10 = E();
        J(E10, 11, new Ja.b(E10, i3, c1411h, c1411h2));
    }

    @Override // o0.InterfaceC1410G
    public final void j(y yVar) {
        J(E(), 14, new b(17));
    }

    @Override // L0.G
    public final void k(int i3, B b2, C0123t c0123t, I0.g gVar, IOException iOException, boolean z2) {
        a H2 = H(i3, b2);
        J(H2, 1003, new C1644e0(H2, c0123t, gVar, iOException, z2));
    }

    @Override // o0.InterfaceC1410G
    public final void l(int i3) {
        C1830z c1830z = this.f21995g;
        c1830z.getClass();
        C0250h c0250h = this.f21992d;
        c0250h.f6299d = C0250h.e(c1830z, (I) c0250h.f6297b, (B) c0250h.f6300e, (C1414K) c0250h.f6296a);
        c0250h.l(c1830z.t());
        J(E(), 0, new C1674t0(12));
    }

    @Override // L0.G
    public final void m(int i3, B b2, C0123t c0123t, I0.g gVar) {
        J(H(i3, b2), 1002, new b(15));
    }

    @Override // L0.G
    public final void n(int i3, B b2, I0.g gVar) {
        a H2 = H(i3, b2);
        J(H2, 1004, new kb.e(H2, gVar));
    }

    @Override // L0.G
    public final void o(int i3, B b2, I0.g gVar) {
        J(H(i3, b2), 1005, new b(18));
    }

    @Override // o0.InterfaceC1410G
    public final void p(C1428c c1428c) {
        J(I(), 20, new C1674t0(17));
    }

    @Override // o0.InterfaceC1410G
    public final void q(int i3) {
        J(E(), 8, new b(7));
    }

    @Override // o0.InterfaceC1410G
    public final void r(C1447v c1447v, int i3) {
        J(E(), 1, new C1674t0(13));
    }

    @Override // o0.InterfaceC1410G
    public final void s(AbstractC1407D abstractC1407D) {
        B b2;
        J((!(abstractC1407D instanceof C1817l) || (b2 = ((C1817l) abstractC1407D).f21779h) == null) ? E() : F(b2), 10, new C1674t0(26));
    }

    @Override // o0.InterfaceC1410G
    public final void t(boolean z2) {
        J(I(), 23, new b(19));
    }

    @Override // o0.InterfaceC1410G
    public final void u(List list) {
        a E10 = E();
        J(E10, 27, new C0352d(E10, list));
    }

    @Override // o0.InterfaceC1410G
    public final void v(int i3, boolean z2) {
        J(E(), -1, new C1674t0(16));
    }

    @Override // o0.InterfaceC1410G
    public final void w(C1404A c1404a) {
        J(E(), 28, new C1674t0(18));
    }

    @Override // o0.InterfaceC1410G
    public final void x(q0.c cVar) {
        J(E(), 27, new b(8));
    }

    @Override // o0.InterfaceC1410G
    public final void y(C1408E c1408e) {
        J(E(), 12, new C1674t0(11));
    }

    @Override // o0.InterfaceC1410G
    public final void z(AbstractC1407D abstractC1407D) {
        B b2;
        a E10 = (!(abstractC1407D instanceof C1817l) || (b2 = ((C1817l) abstractC1407D).f21779h) == null) ? E() : F(b2);
        J(E10, 10, new C1644e0(E10, abstractC1407D, 12));
    }
}
