package I0;

import H0.C0066i;
import H0.m;
import T0.AbstractC0311b;
import T0.H;
import T0.q;
import com.stub.StubApp;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import o0.C1437l;
import p0.AbstractC1482f;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final m f3081a;

    /* renamed from: b, reason: collision with root package name */
    public H f3082b;

    /* renamed from: d, reason: collision with root package name */
    public long f3084d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3086f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3087g;

    /* renamed from: c, reason: collision with root package name */
    public long f3083c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f3085e = -1;

    public h(m mVar) {
        this.f3081a = mVar;
    }

    @Override // I0.i
    public final void b(long j, long j3) {
        this.f3083c = j;
        this.f3084d = j3;
    }

    @Override // I0.i
    public final void c(C1553n c1553n, long j, int i3, boolean z2) {
        AbstractC1550k.h(this.f3082b);
        if (!this.f3086f) {
            int i10 = c1553n.f20177b;
            AbstractC1550k.b(StubApp.getString2(2805), c1553n.f20178c > 18);
            AbstractC1550k.b(StubApp.getString2(2807), c1553n.s(8, StandardCharsets.UTF_8).equals(StubApp.getString2(2806)));
            AbstractC1550k.b(StubApp.getString2(2808), c1553n.u() == 1);
            c1553n.G(i10);
            ArrayList c10 = AbstractC0311b.c(c1553n.f20176a);
            C1437l a3 = this.f3081a.f2588c.a();
            a3.f18180p = c10;
            E1.a.w(a3, this.f3082b);
            this.f3086f = true;
        } else if (this.f3087g) {
            int a9 = C0066i.a(this.f3085e);
            if (i3 != a9) {
                int i11 = AbstractC1560u.f20190a;
                Locale locale = Locale.US;
                AbstractC1550k.w(StubApp.getString2(2812), AbstractC1482f.e(a9, StubApp.getString2(2778), i3, StubApp.getString2(2779), StubApp.getString2(1)));
            }
            int a10 = c1553n.a();
            this.f3082b.a(c1553n, a10, 0);
            this.f3082b.c(android.support.v4.media.session.b.B(this.f3084d, j, this.f3083c, 48000), 1, a10, 0, null);
        } else {
            AbstractC1550k.b(StubApp.getString2(2809), c1553n.f20178c >= 8);
            AbstractC1550k.b(StubApp.getString2(2811), c1553n.s(8, StandardCharsets.UTF_8).equals(StubApp.getString2(2810)));
            this.f3087g = true;
        }
        this.f3085e = i3;
    }

    @Override // I0.i
    public final void d(long j) {
        this.f3083c = j;
    }

    @Override // I0.i
    public final void e(q qVar, int i3) {
        H w10 = qVar.w(i3, 1);
        this.f3082b = w10;
        w10.d(this.f3081a.f2588c);
    }
}
