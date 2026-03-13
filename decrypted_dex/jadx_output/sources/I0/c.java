package I0;

import H0.C0066i;
import H0.m;
import T0.H;
import T0.q;
import com.stub.StubApp;
import java.util.Locale;
import p0.AbstractC1482f;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f3037h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] j = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: a, reason: collision with root package name */
    public final m f3038a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3039b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3040c;

    /* renamed from: d, reason: collision with root package name */
    public H f3041d;

    /* renamed from: e, reason: collision with root package name */
    public long f3042e;

    /* renamed from: f, reason: collision with root package name */
    public long f3043f;

    /* renamed from: g, reason: collision with root package name */
    public int f3044g;

    public c(m mVar) {
        this.f3038a = mVar;
        String str = mVar.f2588c.f18216n;
        str.getClass();
        this.f3039b = StubApp.getString2(1625).equals(str);
        this.f3040c = mVar.f2587b;
        this.f3042e = -9223372036854775807L;
        this.f3044g = -1;
        this.f3043f = 0L;
    }

    @Override // I0.i
    public final void b(long j3, long j10) {
        this.f3042e = j3;
        this.f3043f = j10;
    }

    @Override // I0.i
    public final void c(C1553n c1553n, long j3, int i3, boolean z2) {
        int a3;
        AbstractC1550k.h(this.f3041d);
        int i10 = this.f3044g;
        if (i10 != -1 && i3 != (a3 = C0066i.a(i10))) {
            int i11 = AbstractC1560u.f20190a;
            Locale locale = Locale.US;
            AbstractC1550k.w(StubApp.getString2(2780), AbstractC1482f.e(a3, StubApp.getString2(2778), i3, StubApp.getString2(2779), StubApp.getString2(1)));
        }
        c1553n.H(1);
        int e10 = (c1553n.e() >> 3) & 15;
        boolean z10 = (e10 >= 0 && e10 <= 8) || e10 == 15;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(2781));
        boolean z11 = this.f3039b;
        sb2.append(z11 ? StubApp.getString2(2782) : StubApp.getString2(2783));
        sb2.append(StubApp.getString2(2784));
        sb2.append(e10);
        AbstractC1550k.b(sb2.toString(), z10);
        int i12 = z11 ? j[e10] : f3037h[e10];
        int a9 = c1553n.a();
        AbstractC1550k.b(StubApp.getString2(2785), a9 == i12);
        this.f3041d.a(c1553n, a9, 0);
        this.f3041d.c(android.support.v4.media.session.b.B(this.f3043f, j3, this.f3042e, this.f3040c), 1, a9, 0, null);
        this.f3044g = i3;
    }

    @Override // I0.i
    public final void d(long j3) {
        this.f3042e = j3;
    }

    @Override // I0.i
    public final void e(q qVar, int i3) {
        H w10 = qVar.w(i3, 1);
        this.f3041d = w10;
        w10.d(this.f3038a.f2588c);
    }
}
