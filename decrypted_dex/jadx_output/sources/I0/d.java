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
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3045a;

    /* renamed from: b, reason: collision with root package name */
    public final m f3046b;

    /* renamed from: c, reason: collision with root package name */
    public H f3047c;

    /* renamed from: d, reason: collision with root package name */
    public long f3048d;

    /* renamed from: e, reason: collision with root package name */
    public long f3049e;

    /* renamed from: f, reason: collision with root package name */
    public int f3050f;

    /* renamed from: g, reason: collision with root package name */
    public int f3051g;

    /* renamed from: h, reason: collision with root package name */
    public long f3052h;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f3053k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3054l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3055m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3056n;

    public d(m mVar, int i3) {
        this.f3045a = i3;
        switch (i3) {
            case 1:
                this.f3046b = mVar;
                this.f3048d = -9223372036854775807L;
                this.f3051g = -1;
                this.f3052h = -9223372036854775807L;
                this.f3049e = 0L;
                this.f3050f = -1;
                this.j = -1;
                this.f3053k = -1;
                break;
            default:
                this.f3046b = mVar;
                this.f3048d = -9223372036854775807L;
                this.f3051g = -1;
                break;
        }
    }

    @Override // I0.i
    public final void b(long j, long j3) {
        switch (this.f3045a) {
            case 0:
                this.f3048d = j;
                this.f3050f = 0;
                this.f3049e = j3;
                break;
            default:
                this.f3048d = j;
                this.f3051g = -1;
                this.f3049e = j3;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // I0.i
    public final void c(C1553n c1553n, long j, int i3, boolean z2) {
        int i10;
        int i11;
        m mVar = this.f3046b;
        String string2 = StubApp.getString2(2786);
        String string22 = StubApp.getString2(2779);
        String string23 = StubApp.getString2(2778);
        switch (this.f3045a) {
            case 0:
                AbstractC1550k.h(this.f3047c);
                int i12 = c1553n.f20177b;
                int A4 = c1553n.A();
                Object[] objArr = (A4 & 1024) > 0;
                int i13 = A4 & 512;
                String string24 = StubApp.getString2(2790);
                if (i13 != 0 || (A4 & 504) != 0 || (A4 & 7) != 0) {
                    AbstractC1550k.w(string24, StubApp.getString2(2793));
                    break;
                } else {
                    if (objArr == true) {
                        if (this.f3056n && this.f3050f > 0) {
                            H h2 = this.f3047c;
                            h2.getClass();
                            h2.c(this.f3052h, this.f3054l ? 1 : 0, this.f3050f, 0, null);
                            this.f3050f = 0;
                            this.f3052h = -9223372036854775807L;
                            this.f3054l = false;
                            this.f3056n = false;
                        }
                        this.f3056n = true;
                        if ((c1553n.e() & 252) < 128) {
                            AbstractC1550k.w(string24, StubApp.getString2(2791));
                            break;
                        } else {
                            byte[] bArr = c1553n.f20176a;
                            bArr[i12] = 0;
                            bArr[i12 + 1] = 0;
                            c1553n.G(i12);
                        }
                    } else if (this.f3056n) {
                        int a3 = C0066i.a(this.f3051g);
                        if (i3 < a3) {
                            int i14 = AbstractC1560u.f20190a;
                            Locale locale = Locale.US;
                            AbstractC1550k.w(string24, AbstractC1482f.e(a3, string23, i3, string22, string2));
                            break;
                        }
                    } else {
                        AbstractC1550k.w(string24, StubApp.getString2(2792));
                        break;
                    }
                    if (this.f3050f == 0) {
                        boolean z10 = this.f3055m;
                        int i15 = c1553n.f20177b;
                        if (((c1553n.w() >> 10) & 63) == 32) {
                            int e10 = c1553n.e();
                            int i16 = (e10 >> 1) & 1;
                            if (!z10 && i16 == 0) {
                                int i17 = (e10 >> 2) & 7;
                                if (i17 == 1) {
                                    this.j = 128;
                                    this.f3053k = 96;
                                } else {
                                    int i18 = i17 - 2;
                                    this.j = 176 << i18;
                                    this.f3053k = 144 << i18;
                                }
                            }
                            c1553n.G(i15);
                            this.f3054l = i16 == 0;
                        } else {
                            c1553n.G(i15);
                            this.f3054l = false;
                        }
                        if (!this.f3055m && this.f3054l) {
                            int i19 = this.j;
                            C1438m c1438m = mVar.f2588c;
                            if (i19 != c1438m.f18223u || this.f3053k != c1438m.f18224v) {
                                H h4 = this.f3047c;
                                C1437l a9 = c1438m.a();
                                a9.f18184t = this.j;
                                a9.f18185u = this.f3053k;
                                E1.a.w(a9, h4);
                            }
                            this.f3055m = true;
                        }
                    }
                    int a10 = c1553n.a();
                    this.f3047c.a(c1553n, a10, 0);
                    this.f3050f += a10;
                    this.f3052h = android.support.v4.media.session.b.B(this.f3049e, j, this.f3048d, 90000);
                    if (z2) {
                        H h5 = this.f3047c;
                        h5.getClass();
                        h5.c(this.f3052h, this.f3054l ? 1 : 0, this.f3050f, 0, null);
                        this.f3050f = 0;
                        this.f3052h = -9223372036854775807L;
                        this.f3054l = false;
                        this.f3056n = false;
                    }
                    this.f3051g = i3;
                    break;
                }
                break;
            default:
                AbstractC1550k.h(this.f3047c);
                int u2 = c1553n.u();
                if ((u2 & 8) != 8) {
                    boolean z11 = this.f3054l;
                    String string25 = StubApp.getString2(2787);
                    if (z11) {
                        int a11 = C0066i.a(this.f3050f);
                        if (i3 < a11) {
                            int i20 = AbstractC1560u.f20190a;
                            Locale locale2 = Locale.US;
                            AbstractC1550k.w(string25, AbstractC1482f.e(a11, string23, i3, string22, string2));
                            break;
                        }
                    } else {
                        AbstractC1550k.w(string25, StubApp.getString2(2789));
                        break;
                    }
                } else {
                    if (this.f3054l && this.f3051g > 0) {
                        H h9 = this.f3047c;
                        h9.getClass();
                        h9.c(this.f3052h, this.f3056n ? 1 : 0, this.f3051g, 0, null);
                        this.f3051g = -1;
                        this.f3052h = -9223372036854775807L;
                        this.f3054l = false;
                    }
                    this.f3054l = true;
                }
                if ((u2 & 128) == 0 || (c1553n.u() & 128) == 0 || c1553n.a() >= 1) {
                    int i21 = u2 & 16;
                    AbstractC1550k.b(StubApp.getString2(2788), i21 == 0);
                    if ((u2 & 32) != 0) {
                        c1553n.H(1);
                        if (c1553n.a() >= 1) {
                            if (i21 == 0) {
                                c1553n.H(1);
                            }
                        }
                    }
                    if ((u2 & 2) != 0) {
                        int u10 = c1553n.u();
                        int i22 = (u10 >> 5) & 7;
                        if ((u10 & 16) != 0) {
                            int i23 = i22 + 1;
                            if (c1553n.a() >= i23 * 4) {
                                for (int i24 = 0; i24 < i23; i24++) {
                                    this.j = c1553n.A();
                                    this.f3053k = c1553n.A();
                                }
                            }
                        }
                        if ((u10 & 8) != 0) {
                            int u11 = c1553n.u();
                            if (c1553n.a() >= u11) {
                                for (int i25 = 0; i25 < u11; i25++) {
                                    int A5 = (c1553n.A() & 12) >> 2;
                                    if (c1553n.a() < A5) {
                                        break;
                                    } else {
                                        c1553n.H(A5);
                                    }
                                }
                            }
                        }
                    }
                    if (this.f3051g == -1 && this.f3054l) {
                        this.f3056n = (c1553n.e() & 4) == 0;
                    }
                    if (!this.f3055m && (i10 = this.j) != -1 && (i11 = this.f3053k) != -1) {
                        C1438m c1438m2 = mVar.f2588c;
                        if (i10 != c1438m2.f18223u || i11 != c1438m2.f18224v) {
                            H h10 = this.f3047c;
                            C1437l a12 = c1438m2.a();
                            a12.f18184t = this.j;
                            a12.f18185u = this.f3053k;
                            E1.a.w(a12, h10);
                        }
                        this.f3055m = true;
                    }
                    int a13 = c1553n.a();
                    this.f3047c.a(c1553n, a13, 0);
                    int i26 = this.f3051g;
                    if (i26 == -1) {
                        this.f3051g = a13;
                    } else {
                        this.f3051g = i26 + a13;
                    }
                    this.f3052h = android.support.v4.media.session.b.B(this.f3049e, j, this.f3048d, 90000);
                    if (z2) {
                        H h11 = this.f3047c;
                        h11.getClass();
                        h11.c(this.f3052h, this.f3056n ? 1 : 0, this.f3051g, 0, null);
                        this.f3051g = -1;
                        this.f3052h = -9223372036854775807L;
                        this.f3054l = false;
                    }
                    this.f3050f = i3;
                    break;
                }
                break;
        }
    }

    @Override // I0.i
    public final void d(long j) {
        switch (this.f3045a) {
            case 0:
                AbstractC1550k.g(this.f3048d == -9223372036854775807L);
                this.f3048d = j;
                break;
            default:
                AbstractC1550k.g(this.f3048d == -9223372036854775807L);
                this.f3048d = j;
                break;
        }
    }

    @Override // I0.i
    public final void e(q qVar, int i3) {
        switch (this.f3045a) {
            case 0:
                H w10 = qVar.w(i3, 2);
                this.f3047c = w10;
                w10.d(this.f3046b.f2588c);
                break;
            default:
                H w11 = qVar.w(i3, 2);
                this.f3047c = w11;
                w11.d(this.f3046b.f2588c);
                break;
        }
    }
}
