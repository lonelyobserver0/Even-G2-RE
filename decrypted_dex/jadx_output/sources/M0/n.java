package M0;

import L0.Y;
import T0.H;
import Z9.C;
import kotlin.jvm.internal.IntCompanionObject;
import o0.C1438m;
import r0.AbstractC1550k;
import t0.C1711k;
import t0.C1725y;
import t0.InterfaceC1708h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n extends a {

    /* renamed from: q, reason: collision with root package name */
    public final int f4504q;

    /* renamed from: r, reason: collision with root package name */
    public final C1438m f4505r;

    /* renamed from: s, reason: collision with root package name */
    public long f4506s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4507t;

    public n(InterfaceC1708h interfaceC1708h, C1711k c1711k, C1438m c1438m, int i3, Object obj, long j, long j3, long j10, int i10, C1438m c1438m2) {
        super(interfaceC1708h, c1711k, c1438m, i3, obj, j, j3, -9223372036854775807L, -9223372036854775807L, j10);
        this.f4504q = i10;
        this.f4505r = c1438m2;
    }

    @Override // M0.l
    public final boolean b() {
        return this.f4507t;
    }

    @Override // P0.l
    public final void l() {
        C1725y c1725y = this.j;
        C c10 = this.f4434n;
        AbstractC1550k.h(c10);
        for (Y y10 : (Y[]) c10.f9078c) {
            if (y10.f4012F != 0) {
                y10.f4012F = 0L;
                y10.f4038z = true;
            }
        }
        H H2 = c10.H(this.f4504q);
        H2.d(this.f4505r);
        try {
            long n10 = c1725y.n(this.f4456b.a(this.f4506s));
            if (n10 != -1) {
                n10 += this.f4506s;
            }
            T0.l lVar = new T0.l(this.j, this.f4506s, n10);
            for (int i3 = 0; i3 != -1; i3 = H2.b(lVar, IntCompanionObject.MAX_VALUE, true)) {
                this.f4506s += i3;
            }
            H2.c(this.f4461g, 1, (int) this.f4506s, 0, null);
            W.a.a(c1725y);
            this.f4507t = true;
        } catch (Throwable th) {
            W.a.a(c1725y);
            throw th;
        }
    }

    @Override // P0.l
    public final void o() {
    }
}
