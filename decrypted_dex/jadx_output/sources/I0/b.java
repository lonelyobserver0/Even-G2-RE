package I0;

import H0.m;
import T0.AbstractC0311b;
import T0.C0312c;
import T0.H;
import T0.J;
import T0.q;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final m f3030a;

    /* renamed from: c, reason: collision with root package name */
    public H f3032c;

    /* renamed from: d, reason: collision with root package name */
    public int f3033d;

    /* renamed from: f, reason: collision with root package name */
    public long f3035f;

    /* renamed from: g, reason: collision with root package name */
    public long f3036g;

    /* renamed from: b, reason: collision with root package name */
    public final J f3031b = new J();

    /* renamed from: e, reason: collision with root package name */
    public long f3034e = -9223372036854775807L;

    public b(m mVar) {
        this.f3030a = mVar;
    }

    @Override // I0.i
    public final void b(long j, long j3) {
        this.f3034e = j;
        this.f3036g = j3;
    }

    @Override // I0.i
    public final void c(C1553n c1553n, long j, int i3, boolean z2) {
        int u2 = c1553n.u() & 3;
        int u10 = c1553n.u() & 255;
        long B7 = android.support.v4.media.session.b.B(this.f3036g, j, this.f3034e, this.f3030a.f2587b);
        if (u2 != 0) {
            if (u2 == 1 || u2 == 2) {
                int i10 = this.f3033d;
                if (i10 > 0) {
                    H h2 = this.f3032c;
                    int i11 = AbstractC1560u.f20190a;
                    h2.c(this.f3035f, 1, i10, 0, null);
                    this.f3033d = 0;
                }
            } else if (u2 != 3) {
                throw new IllegalArgumentException(String.valueOf(u2));
            }
            int a3 = c1553n.a();
            H h4 = this.f3032c;
            h4.getClass();
            h4.a(c1553n, a3, 0);
            int i12 = this.f3033d + a3;
            this.f3033d = i12;
            this.f3035f = B7;
            if (z2 && u2 == 3) {
                H h5 = this.f3032c;
                int i13 = AbstractC1560u.f20190a;
                h5.c(B7, 1, i12, 0, null);
                this.f3033d = 0;
                return;
            }
            return;
        }
        int i14 = this.f3033d;
        if (i14 > 0) {
            H h9 = this.f3032c;
            int i15 = AbstractC1560u.f20190a;
            h9.c(this.f3035f, 1, i14, 0, null);
            this.f3033d = 0;
        }
        if (u10 == 1) {
            int a9 = c1553n.a();
            H h10 = this.f3032c;
            h10.getClass();
            h10.a(c1553n, a9, 0);
            H h11 = this.f3032c;
            int i16 = AbstractC1560u.f20190a;
            h11.c(B7, 1, a9, 0, null);
            return;
        }
        byte[] bArr = c1553n.f20176a;
        J j3 = this.f3031b;
        j3.getClass();
        j3.o(bArr.length, bArr);
        j3.u(2);
        long j10 = B7;
        for (int i17 = 0; i17 < u10; i17++) {
            C0312c o5 = AbstractC0311b.o(j3);
            H h12 = this.f3032c;
            h12.getClass();
            int i18 = o5.f6983d;
            h12.a(c1553n, i18, 0);
            H h13 = this.f3032c;
            int i19 = AbstractC1560u.f20190a;
            h13.c(j10, 1, o5.f6983d, 0, null);
            j10 = ((o5.f6984e / o5.f6981b) * 1000000) + j10;
            j3.u(i18);
        }
    }

    @Override // I0.i
    public final void d(long j) {
        AbstractC1550k.g(this.f3034e == -9223372036854775807L);
        this.f3034e = j;
    }

    @Override // I0.i
    public final void e(q qVar, int i3) {
        H w10 = qVar.w(i3, 1);
        this.f3032c = w10;
        w10.d(this.f3030a.f2588c);
    }
}
