package A1;

import T0.H;
import T0.l;
import T0.q;
import com.stub.StubApp;
import java.math.RoundingMode;
import o0.AbstractC1405B;
import o0.C1406C;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final q f52a;

    /* renamed from: b, reason: collision with root package name */
    public final H f53b;

    /* renamed from: c, reason: collision with root package name */
    public final f f54c;

    /* renamed from: d, reason: collision with root package name */
    public final C1438m f55d;

    /* renamed from: e, reason: collision with root package name */
    public final int f56e;

    /* renamed from: f, reason: collision with root package name */
    public long f57f;

    /* renamed from: g, reason: collision with root package name */
    public int f58g;

    /* renamed from: h, reason: collision with root package name */
    public long f59h;

    public d(q qVar, H h2, f fVar, String str, int i3) {
        this.f52a = qVar;
        this.f53b = h2;
        this.f54c = fVar;
        int i10 = fVar.f70d;
        int i11 = fVar.f67a;
        int i12 = (i10 * i11) / 8;
        int i13 = fVar.f69c;
        if (i13 != i12) {
            throw C1406C.a(StubApp.getString2(79) + i12 + StubApp.getString2(78) + i13, null);
        }
        int i14 = fVar.f68b;
        int i15 = i14 * i12;
        int i16 = i15 * 8;
        int max = Math.max(i12, i15 / 10);
        this.f56e = max;
        C1437l c1437l = new C1437l();
        c1437l.f18177m = AbstractC1405B.m(str);
        c1437l.f18173h = i16;
        c1437l.f18174i = i16;
        c1437l.f18178n = max;
        c1437l.f18156B = i11;
        c1437l.f18157C = i14;
        c1437l.f18158D = i3;
        this.f55d = new C1438m(c1437l);
    }

    @Override // A1.c
    public final void a(long j) {
        this.f57f = j;
        this.f58g = 0;
        this.f59h = 0L;
    }

    @Override // A1.c
    public final boolean b(l lVar, long j) {
        int i3;
        int i10;
        long j3 = j;
        while (j3 > 0 && (i3 = this.f58g) < (i10 = this.f56e)) {
            int b2 = this.f53b.b(lVar, (int) Math.min(i10 - i3, j3), true);
            if (b2 == -1) {
                j3 = 0;
            } else {
                this.f58g += b2;
                j3 -= b2;
            }
        }
        f fVar = this.f54c;
        int i11 = this.f58g;
        int i12 = fVar.f69c;
        int i13 = i11 / i12;
        if (i13 > 0) {
            long j10 = this.f57f;
            long j11 = this.f59h;
            long j12 = fVar.f68b;
            int i14 = AbstractC1560u.f20190a;
            long R10 = j10 + AbstractC1560u.R(j11, 1000000L, j12, RoundingMode.DOWN);
            int i15 = i13 * i12;
            int i16 = this.f58g - i15;
            this.f53b.c(R10, 1, i15, i16, null);
            this.f59h += i13;
            this.f58g = i16;
        }
        return j3 <= 0;
    }

    @Override // A1.c
    public final void c(int i3, long j) {
        this.f52a.D(new h(this.f54c, 1, i3, j));
        this.f53b.d(this.f55d);
    }
}
