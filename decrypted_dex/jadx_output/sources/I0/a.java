package I0;

import H0.m;
import T0.H;
import T0.J;
import T0.q;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import java.math.RoundingMode;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final m f3022a;

    /* renamed from: b, reason: collision with root package name */
    public final J f3023b = new J();

    /* renamed from: c, reason: collision with root package name */
    public final int f3024c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3025d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3026e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3027f;

    /* renamed from: g, reason: collision with root package name */
    public long f3028g;

    /* renamed from: h, reason: collision with root package name */
    public H f3029h;
    public long j;

    public a(m mVar) {
        this.f3022a = mVar;
        this.f3024c = mVar.f2587b;
        String str = (String) mVar.f2589d.get(StubApp.getString2(2774));
        str.getClass();
        if (AbstractC0624h2.i(str, StubApp.getString2(2775))) {
            this.f3025d = 13;
            this.f3026e = 3;
        } else {
            if (!AbstractC0624h2.i(str, StubApp.getString2(2776))) {
                throw new UnsupportedOperationException(StubApp.getString2(2777));
            }
            this.f3025d = 6;
            this.f3026e = 2;
        }
        this.f3027f = this.f3026e + this.f3025d;
    }

    @Override // I0.i
    public final void b(long j, long j3) {
        this.f3028g = j;
        this.j = j3;
    }

    @Override // I0.i
    public final void c(C1553n c1553n, long j, int i3, boolean z2) {
        this.f3029h.getClass();
        short r8 = c1553n.r();
        int i10 = r8 / this.f3027f;
        long B7 = android.support.v4.media.session.b.B(this.j, j, this.f3028g, this.f3024c);
        J j3 = this.f3023b;
        j3.p(c1553n);
        int i11 = this.f3026e;
        int i12 = this.f3025d;
        if (i10 == 1) {
            int i13 = j3.i(i12);
            j3.t(i11);
            this.f3029h.a(c1553n, c1553n.a(), 0);
            if (z2) {
                this.f3029h.c(B7, 1, i13, 0, null);
                return;
            }
            return;
        }
        c1553n.H((r8 + 7) / 8);
        long j10 = B7;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = j3.i(i12);
            j3.t(i11);
            this.f3029h.a(c1553n, i15, 0);
            this.f3029h.c(j10, 1, i15, 0, null);
            j10 += AbstractC1560u.R(i10, 1000000L, this.f3024c, RoundingMode.DOWN);
        }
    }

    @Override // I0.i
    public final void d(long j) {
        this.f3028g = j;
    }

    @Override // I0.i
    public final void e(q qVar, int i3) {
        H w10 = qVar.w(i3, 1);
        this.f3029h = w10;
        w10.d(this.f3022a.f2588c);
    }
}
