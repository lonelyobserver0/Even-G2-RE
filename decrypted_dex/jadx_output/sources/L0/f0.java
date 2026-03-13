package L0;

import v0.C1805H;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f0 implements InterfaceC0129z, InterfaceC0128y {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0129z f4077a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4078b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0128y f4079c;

    public f0(InterfaceC0129z interfaceC0129z, long j) {
        this.f4077a = interfaceC0129z;
        this.f4078b = j;
    }

    @Override // L0.InterfaceC0128y
    public final void a(InterfaceC0129z interfaceC0129z) {
        InterfaceC0128y interfaceC0128y = this.f4079c;
        interfaceC0128y.getClass();
        interfaceC0128y.a(this);
    }

    @Override // L0.InterfaceC0129z
    public final long b(long j, v0.c0 c0Var) {
        long j3 = this.f4078b;
        return this.f4077a.b(j - j3, c0Var) + j3;
    }

    @Override // L0.InterfaceC0129z
    public final long c(O0.s[] sVarArr, boolean[] zArr, Z[] zArr2, boolean[] zArr3, long j) {
        Z[] zArr4 = new Z[zArr2.length];
        int i3 = 0;
        while (true) {
            Z z2 = null;
            if (i3 >= zArr2.length) {
                break;
            }
            e0 e0Var = (e0) zArr2[i3];
            if (e0Var != null) {
                z2 = e0Var.f4075a;
            }
            zArr4[i3] = z2;
            i3++;
        }
        long j3 = this.f4078b;
        long c10 = this.f4077a.c(sVarArr, zArr, zArr4, zArr3, j - j3);
        for (int i10 = 0; i10 < zArr2.length; i10++) {
            Z z10 = zArr4[i10];
            if (z10 == null) {
                zArr2[i10] = null;
            } else {
                Z z11 = zArr2[i10];
                if (z11 == null || ((e0) z11).f4075a != z10) {
                    zArr2[i10] = new e0(z10, j3);
                }
            }
        }
        return c10 + j3;
    }

    @Override // L0.InterfaceC0129z
    public final void e(InterfaceC0128y interfaceC0128y, long j) {
        this.f4079c = interfaceC0128y;
        this.f4077a.e(this, j - this.f4078b);
    }

    @Override // L0.b0
    public final long f() {
        long f10 = this.f4077a.f();
        if (f10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return f10 + this.f4078b;
    }

    @Override // L0.b0
    public final boolean g(v0.I i3) {
        C1805H c1805h = new C1805H();
        c1805h.f21587b = i3.f21590b;
        c1805h.f21588c = i3.f21591c;
        c1805h.f21586a = i3.f21589a - this.f4078b;
        return this.f4077a.g(new v0.I(c1805h));
    }

    @Override // L0.a0
    public final void h(b0 b0Var) {
        InterfaceC0128y interfaceC0128y = this.f4079c;
        interfaceC0128y.getClass();
        interfaceC0128y.h(this);
    }

    @Override // L0.InterfaceC0129z
    public final void j() {
        this.f4077a.j();
    }

    @Override // L0.InterfaceC0129z
    public final long k(long j) {
        long j3 = this.f4078b;
        return this.f4077a.k(j - j3) + j3;
    }

    @Override // L0.InterfaceC0129z
    public final void l(long j) {
        this.f4077a.l(j - this.f4078b);
    }

    @Override // L0.b0
    public final boolean n() {
        return this.f4077a.n();
    }

    @Override // L0.InterfaceC0129z
    public final long p() {
        long p8 = this.f4077a.p();
        if (p8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return p8 + this.f4078b;
    }

    @Override // L0.InterfaceC0129z
    public final h0 s() {
        return this.f4077a.s();
    }

    @Override // L0.b0
    public final long u() {
        long u2 = this.f4077a.u();
        if (u2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return u2 + this.f4078b;
    }

    @Override // L0.b0
    public final void v(long j) {
        this.f4077a.v(j - this.f4078b);
    }
}
