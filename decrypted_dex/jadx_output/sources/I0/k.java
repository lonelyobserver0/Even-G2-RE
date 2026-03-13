package I0;

import H0.C0066i;
import H0.m;
import T0.H;
import T0.q;
import com.stub.StubApp;
import java.util.Locale;
import o0.C1437l;
import o0.C1438m;
import p0.AbstractC1482f;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final m f3093a;

    /* renamed from: b, reason: collision with root package name */
    public H f3094b;

    /* renamed from: c, reason: collision with root package name */
    public long f3095c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public int f3096d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f3097e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f3098f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f3099g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3100h;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3101k;

    public k(m mVar) {
        this.f3093a = mVar;
    }

    @Override // I0.i
    public final void b(long j, long j3) {
        this.f3095c = j;
        this.f3097e = -1;
        this.f3099g = j3;
    }

    @Override // I0.i
    public final void c(C1553n c1553n, long j, int i3, boolean z2) {
        AbstractC1550k.h(this.f3094b);
        int u2 = c1553n.u();
        if ((u2 & 16) == 16 && (u2 & 7) == 0) {
            if (this.f3100h && this.f3097e > 0) {
                H h2 = this.f3094b;
                h2.getClass();
                h2.c(this.f3098f, this.j ? 1 : 0, this.f3097e, 0, null);
                this.f3097e = -1;
                this.f3098f = -9223372036854775807L;
                this.f3100h = false;
            }
            this.f3100h = true;
        } else {
            boolean z10 = this.f3100h;
            String string2 = StubApp.getString2(2814);
            if (!z10) {
                AbstractC1550k.w(string2, StubApp.getString2(2815));
                return;
            }
            int a3 = C0066i.a(this.f3096d);
            if (i3 < a3) {
                int i10 = AbstractC1560u.f20190a;
                Locale locale = Locale.US;
                AbstractC1550k.w(string2, AbstractC1482f.e(a3, StubApp.getString2(2778), i3, StubApp.getString2(2779), StubApp.getString2(2786)));
                return;
            }
        }
        if ((u2 & 128) != 0) {
            int u10 = c1553n.u();
            if ((u10 & 128) != 0 && (c1553n.u() & 128) != 0) {
                c1553n.H(1);
            }
            if ((u10 & 64) != 0) {
                c1553n.H(1);
            }
            if ((u10 & 32) != 0 || (16 & u10) != 0) {
                c1553n.H(1);
            }
        }
        if (this.f3097e == -1 && this.f3100h) {
            this.j = (c1553n.e() & 1) == 0;
        }
        if (!this.f3101k) {
            int i11 = c1553n.f20177b;
            c1553n.G(i11 + 6);
            int n10 = c1553n.n() & 16383;
            int n11 = c1553n.n() & 16383;
            c1553n.G(i11);
            C1438m c1438m = this.f3093a.f2588c;
            if (n10 != c1438m.f18223u || n11 != c1438m.f18224v) {
                H h4 = this.f3094b;
                C1437l a9 = c1438m.a();
                a9.f18184t = n10;
                a9.f18185u = n11;
                E1.a.w(a9, h4);
            }
            this.f3101k = true;
        }
        int a10 = c1553n.a();
        this.f3094b.a(c1553n, a10, 0);
        int i12 = this.f3097e;
        if (i12 == -1) {
            this.f3097e = a10;
        } else {
            this.f3097e = i12 + a10;
        }
        this.f3098f = android.support.v4.media.session.b.B(this.f3099g, j, this.f3095c, 90000);
        if (z2) {
            H h5 = this.f3094b;
            h5.getClass();
            h5.c(this.f3098f, this.j ? 1 : 0, this.f3097e, 0, null);
            this.f3097e = -1;
            this.f3098f = -9223372036854775807L;
            this.f3100h = false;
        }
        this.f3096d = i3;
    }

    @Override // I0.i
    public final void d(long j) {
        AbstractC1550k.g(this.f3095c == -9223372036854775807L);
        this.f3095c = j;
    }

    @Override // I0.i
    public final void e(q qVar, int i3) {
        H w10 = qVar.w(i3, 2);
        this.f3094b = w10;
        w10.d(this.f3093a.f2588c);
    }
}
