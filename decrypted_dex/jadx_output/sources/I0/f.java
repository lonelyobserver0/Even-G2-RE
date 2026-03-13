package I0;

import H0.C0066i;
import H0.m;
import M4.e0;
import T0.H;
import T0.J;
import T0.q;
import com.stub.StubApp;
import i2.u;
import o0.C1406C;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final m f3066a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3067b;

    /* renamed from: c, reason: collision with root package name */
    public H f3068c;

    /* renamed from: d, reason: collision with root package name */
    public long f3069d;

    /* renamed from: e, reason: collision with root package name */
    public int f3070e;

    /* renamed from: f, reason: collision with root package name */
    public int f3071f;

    /* renamed from: g, reason: collision with root package name */
    public long f3072g;

    /* renamed from: h, reason: collision with root package name */
    public long f3073h;

    public f(m mVar) {
        this.f3066a = mVar;
        try {
            this.f3067b = a(mVar.f2589d);
            this.f3069d = -9223372036854775807L;
            this.f3070e = -1;
            this.f3071f = 0;
            this.f3072g = 0L;
            this.f3073h = -9223372036854775807L;
        } catch (C1406C e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(e0 e0Var) {
        String str = (String) e0Var.get(StubApp.getString2(2448));
        int i3 = 0;
        i3 = 0;
        if (str != null && str.length() % 2 == 0) {
            byte[] r8 = AbstractC1560u.r(str);
            J j = new J(r8, r8.length);
            int i10 = j.i(1);
            if (i10 != 0) {
                throw new C1406C(u.p(i10, StubApp.getString2(2803)), null, true, 0);
            }
            AbstractC1550k.b(StubApp.getString2(2479), j.i(1) == 1);
            int i11 = j.i(6);
            AbstractC1550k.b(StubApp.getString2(2801), j.i(4) == 0);
            AbstractC1550k.b(StubApp.getString2(2802), j.i(3) == 0);
            i3 = i11;
        }
        return i3 + 1;
    }

    @Override // I0.i
    public final void b(long j, long j3) {
        this.f3069d = j;
        this.f3071f = 0;
        this.f3072g = j3;
    }

    @Override // I0.i
    public final void c(C1553n c1553n, long j, int i3, boolean z2) {
        AbstractC1550k.h(this.f3068c);
        int a3 = C0066i.a(this.f3070e);
        if (this.f3071f > 0 && a3 < i3) {
            H h2 = this.f3068c;
            h2.getClass();
            h2.c(this.f3073h, 1, this.f3071f, 0, null);
            this.f3071f = 0;
            this.f3073h = -9223372036854775807L;
        }
        for (int i10 = 0; i10 < this.f3067b; i10++) {
            int i11 = 0;
            while (c1553n.f20177b < c1553n.f20178c) {
                int u2 = c1553n.u();
                i11 += u2;
                if (u2 != 255) {
                    break;
                }
            }
            this.f3068c.a(c1553n, i11, 0);
            this.f3071f += i11;
        }
        this.f3073h = android.support.v4.media.session.b.B(this.f3072g, j, this.f3069d, this.f3066a.f2587b);
        if (z2) {
            H h4 = this.f3068c;
            h4.getClass();
            h4.c(this.f3073h, 1, this.f3071f, 0, null);
            this.f3071f = 0;
            this.f3073h = -9223372036854775807L;
        }
        this.f3070e = i3;
    }

    @Override // I0.i
    public final void d(long j) {
        AbstractC1550k.g(this.f3069d == -9223372036854775807L);
        this.f3069d = j;
    }

    @Override // I0.i
    public final void e(q qVar, int i3) {
        H w10 = qVar.w(i3, 2);
        this.f3068c = w10;
        int i10 = AbstractC1560u.f20190a;
        w10.d(this.f3066a.f2588c);
    }
}
