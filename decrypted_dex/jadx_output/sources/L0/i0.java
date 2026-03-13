package L0;

import o0.AbstractC1416M;
import o0.C1447v;
import r0.AbstractC1560u;
import t0.InterfaceC1726z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class i0 extends AbstractC0115k {

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0105a f4100l;

    public i0(AbstractC0105a abstractC0105a) {
        this.f4100l = abstractC0105a;
    }

    public B B(B b2) {
        return b2;
    }

    public abstract void C(AbstractC1416M abstractC1416M);

    public final void D() {
        A(null, this.f4100l);
    }

    public void E() {
        D();
    }

    @Override // L0.AbstractC0105a
    public final AbstractC1416M g() {
        return this.f4100l.g();
    }

    @Override // L0.AbstractC0105a
    public final C1447v h() {
        return this.f4100l.h();
    }

    @Override // L0.AbstractC0105a
    public final boolean i() {
        return this.f4100l.i();
    }

    @Override // L0.AbstractC0105a
    public final void l(InterfaceC1726z interfaceC1726z) {
        this.f4105k = interfaceC1726z;
        this.j = AbstractC1560u.m(null);
        E();
    }

    @Override // L0.AbstractC0105a
    public void v(C1447v c1447v) {
        this.f4100l.v(c1447v);
    }

    @Override // L0.AbstractC0115k
    public final B w(Object obj, B b2) {
        return B(b2);
    }

    @Override // L0.AbstractC0115k
    public final long x(long j, Object obj) {
        return j;
    }

    @Override // L0.AbstractC0115k
    public final int y(int i3, Object obj) {
        return i3;
    }

    @Override // L0.AbstractC0115k
    public final void z(Object obj, AbstractC0105a abstractC0105a, AbstractC1416M abstractC1416M) {
        C(abstractC1416M);
    }
}
