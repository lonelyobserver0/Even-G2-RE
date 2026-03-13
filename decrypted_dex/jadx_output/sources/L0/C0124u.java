package L0;

import r0.AbstractC1560u;

/* renamed from: L0.u, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0124u implements InterfaceC0129z, InterfaceC0128y {

    /* renamed from: a, reason: collision with root package name */
    public final B f4132a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4133b;

    /* renamed from: c, reason: collision with root package name */
    public final P0.e f4134c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0105a f4135d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0129z f4136e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0128y f4137f;

    /* renamed from: g, reason: collision with root package name */
    public long f4138g = -9223372036854775807L;

    public C0124u(B b2, P0.e eVar, long j) {
        this.f4132a = b2;
        this.f4134c = eVar;
        this.f4133b = j;
    }

    @Override // L0.InterfaceC0128y
    public final void a(InterfaceC0129z interfaceC0129z) {
        InterfaceC0128y interfaceC0128y = this.f4137f;
        int i3 = AbstractC1560u.f20190a;
        interfaceC0128y.a(this);
    }

    @Override // L0.InterfaceC0129z
    public final long b(long j, v0.c0 c0Var) {
        InterfaceC0129z interfaceC0129z = this.f4136e;
        int i3 = AbstractC1560u.f20190a;
        return interfaceC0129z.b(j, c0Var);
    }

    @Override // L0.InterfaceC0129z
    public final long c(O0.s[] sVarArr, boolean[] zArr, Z[] zArr2, boolean[] zArr3, long j) {
        long j3 = this.f4138g;
        long j10 = (j3 == -9223372036854775807L || j != this.f4133b) ? j : j3;
        this.f4138g = -9223372036854775807L;
        InterfaceC0129z interfaceC0129z = this.f4136e;
        int i3 = AbstractC1560u.f20190a;
        return interfaceC0129z.c(sVarArr, zArr, zArr2, zArr3, j10);
    }

    public final void d(B b2) {
        long j = this.f4138g;
        if (j == -9223372036854775807L) {
            j = this.f4133b;
        }
        AbstractC0105a abstractC0105a = this.f4135d;
        abstractC0105a.getClass();
        InterfaceC0129z b10 = abstractC0105a.b(b2, this.f4134c, j);
        this.f4136e = b10;
        if (this.f4137f != null) {
            b10.e(this, j);
        }
    }

    @Override // L0.InterfaceC0129z
    public final void e(InterfaceC0128y interfaceC0128y, long j) {
        this.f4137f = interfaceC0128y;
        InterfaceC0129z interfaceC0129z = this.f4136e;
        if (interfaceC0129z != null) {
            long j3 = this.f4138g;
            if (j3 == -9223372036854775807L) {
                j3 = this.f4133b;
            }
            interfaceC0129z.e(this, j3);
        }
    }

    @Override // L0.b0
    public final long f() {
        InterfaceC0129z interfaceC0129z = this.f4136e;
        int i3 = AbstractC1560u.f20190a;
        return interfaceC0129z.f();
    }

    @Override // L0.b0
    public final boolean g(v0.I i3) {
        InterfaceC0129z interfaceC0129z = this.f4136e;
        return interfaceC0129z != null && interfaceC0129z.g(i3);
    }

    @Override // L0.a0
    public final void h(b0 b0Var) {
        InterfaceC0128y interfaceC0128y = this.f4137f;
        int i3 = AbstractC1560u.f20190a;
        interfaceC0128y.h(this);
    }

    @Override // L0.InterfaceC0129z
    public final void j() {
        InterfaceC0129z interfaceC0129z = this.f4136e;
        if (interfaceC0129z != null) {
            interfaceC0129z.j();
            return;
        }
        AbstractC0105a abstractC0105a = this.f4135d;
        if (abstractC0105a != null) {
            abstractC0105a.j();
        }
    }

    @Override // L0.InterfaceC0129z
    public final long k(long j) {
        InterfaceC0129z interfaceC0129z = this.f4136e;
        int i3 = AbstractC1560u.f20190a;
        return interfaceC0129z.k(j);
    }

    @Override // L0.InterfaceC0129z
    public final void l(long j) {
        InterfaceC0129z interfaceC0129z = this.f4136e;
        int i3 = AbstractC1560u.f20190a;
        interfaceC0129z.l(j);
    }

    @Override // L0.b0
    public final boolean n() {
        InterfaceC0129z interfaceC0129z = this.f4136e;
        return interfaceC0129z != null && interfaceC0129z.n();
    }

    @Override // L0.InterfaceC0129z
    public final long p() {
        InterfaceC0129z interfaceC0129z = this.f4136e;
        int i3 = AbstractC1560u.f20190a;
        return interfaceC0129z.p();
    }

    @Override // L0.InterfaceC0129z
    public final h0 s() {
        InterfaceC0129z interfaceC0129z = this.f4136e;
        int i3 = AbstractC1560u.f20190a;
        return interfaceC0129z.s();
    }

    @Override // L0.b0
    public final long u() {
        InterfaceC0129z interfaceC0129z = this.f4136e;
        int i3 = AbstractC1560u.f20190a;
        return interfaceC0129z.u();
    }

    @Override // L0.b0
    public final void v(long j) {
        InterfaceC0129z interfaceC0129z = this.f4136e;
        int i3 = AbstractC1560u.f20190a;
        interfaceC0129z.v(j);
    }
}
