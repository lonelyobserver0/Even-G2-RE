package z1;

import T0.AbstractC0311b;
import T0.C0312c;
import T0.H;
import T0.J;
import com.stub.StubApp;
import java.util.Objects;
import o0.AbstractC1405B;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.C1553n;

/* renamed from: z1.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1998c implements InterfaceC2004i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23760a;

    /* renamed from: b, reason: collision with root package name */
    public final J f23761b;

    /* renamed from: c, reason: collision with root package name */
    public final C1553n f23762c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23763d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23764e;

    /* renamed from: f, reason: collision with root package name */
    public String f23765f;

    /* renamed from: g, reason: collision with root package name */
    public H f23766g;

    /* renamed from: h, reason: collision with root package name */
    public int f23767h;

    /* renamed from: i, reason: collision with root package name */
    public int f23768i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f23769k;

    /* renamed from: l, reason: collision with root package name */
    public C1438m f23770l;

    /* renamed from: m, reason: collision with root package name */
    public int f23771m;

    /* renamed from: n, reason: collision with root package name */
    public long f23772n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1998c() {
        this(null, 0, 0);
        this.f23760a = 0;
    }

    private final void b(boolean z2) {
    }

    private final void g(boolean z2) {
    }

    @Override // z1.InterfaceC2004i
    public final void a() {
        switch (this.f23760a) {
            case 0:
                this.f23767h = 0;
                this.f23768i = 0;
                this.j = false;
                this.f23772n = -9223372036854775807L;
                break;
            default:
                this.f23767h = 0;
                this.f23768i = 0;
                this.j = false;
                this.f23772n = -9223372036854775807L;
                break;
        }
    }

    @Override // z1.InterfaceC2004i
    public final void c(C1553n c1553n) {
        switch (this.f23760a) {
            case 0:
                AbstractC1550k.h(this.f23766g);
                while (c1553n.a() > 0) {
                    int i3 = this.f23767h;
                    C1553n c1553n2 = this.f23762c;
                    if (i3 == 0) {
                        while (true) {
                            if (c1553n.a() <= 0) {
                                break;
                            }
                            if (this.j) {
                                int u2 = c1553n.u();
                                if (u2 == 119) {
                                    this.j = false;
                                    this.f23767h = 1;
                                    byte[] bArr = c1553n2.f20176a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f23768i = 2;
                                } else {
                                    this.j = u2 == 11;
                                }
                            } else {
                                this.j = c1553n.u() == 11;
                            }
                        }
                    } else if (i3 == 1) {
                        byte[] bArr2 = c1553n2.f20176a;
                        int min = Math.min(c1553n.a(), 128 - this.f23768i);
                        c1553n.f(this.f23768i, min, bArr2);
                        int i10 = this.f23768i + min;
                        this.f23768i = i10;
                        if (i10 == 128) {
                            J j = this.f23761b;
                            j.q(0);
                            C0312c o5 = AbstractC0311b.o(j);
                            C1438m c1438m = this.f23770l;
                            int i11 = o5.f6981b;
                            int i12 = o5.f6982c;
                            String str = o5.f6980a;
                            if (c1438m == null || i12 != c1438m.f18193C || i11 != c1438m.f18194D || !Objects.equals(str, c1438m.f18216n)) {
                                C1437l c1437l = new C1437l();
                                c1437l.f18166a = this.f23765f;
                                c1437l.f18177m = AbstractC1405B.m(str);
                                c1437l.f18156B = i12;
                                c1437l.f18157C = i11;
                                c1437l.f18169d = this.f23763d;
                                c1437l.f18171f = this.f23764e;
                                int i13 = o5.f6985f;
                                c1437l.f18174i = i13;
                                if (StubApp.getString2(1629).equals(str)) {
                                    c1437l.f18173h = i13;
                                }
                                C1438m c1438m2 = new C1438m(c1437l);
                                this.f23770l = c1438m2;
                                this.f23766g.d(c1438m2);
                            }
                            this.f23771m = o5.f6983d;
                            this.f23769k = (o5.f6984e * 1000000) / this.f23770l.f18194D;
                            c1553n2.G(0);
                            this.f23766g.a(c1553n2, 128, 0);
                            this.f23767h = 2;
                        }
                    } else if (i3 == 2) {
                        int min2 = Math.min(c1553n.a(), this.f23771m - this.f23768i);
                        this.f23766g.a(c1553n, min2, 0);
                        int i14 = this.f23768i + min2;
                        this.f23768i = i14;
                        if (i14 == this.f23771m) {
                            AbstractC1550k.g(this.f23772n != -9223372036854775807L);
                            this.f23766g.c(this.f23772n, 1, this.f23771m, 0, null);
                            this.f23772n += this.f23769k;
                            this.f23767h = 0;
                        }
                    }
                }
                break;
            default:
                AbstractC1550k.h(this.f23766g);
                while (c1553n.a() > 0) {
                    int i15 = this.f23767h;
                    C1553n c1553n3 = this.f23762c;
                    if (i15 == 0) {
                        while (c1553n.a() > 0) {
                            if (this.j) {
                                int u10 = c1553n.u();
                                this.j = u10 == 172;
                                if (u10 == 64 || u10 == 65) {
                                    boolean z2 = u10 == 65;
                                    this.f23767h = 1;
                                    byte[] bArr3 = c1553n3.f20176a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z2 ? 65 : 64);
                                    this.f23768i = 2;
                                }
                            } else {
                                this.j = c1553n.u() == 172;
                            }
                        }
                    } else if (i15 == 1) {
                        byte[] bArr4 = c1553n3.f20176a;
                        int min3 = Math.min(c1553n.a(), 16 - this.f23768i);
                        c1553n.f(this.f23768i, min3, bArr4);
                        int i16 = this.f23768i + min3;
                        this.f23768i = i16;
                        if (i16 == 16) {
                            J j3 = this.f23761b;
                            j3.q(0);
                            R0.d p8 = AbstractC0311b.p(j3);
                            C1438m c1438m3 = this.f23770l;
                            String string2 = StubApp.getString2(3955);
                            int i17 = p8.f5935b;
                            if (c1438m3 == null || 2 != c1438m3.f18193C || i17 != c1438m3.f18194D || !string2.equals(c1438m3.f18216n)) {
                                C1437l c1437l2 = new C1437l();
                                c1437l2.f18166a = this.f23765f;
                                c1437l2.f18177m = AbstractC1405B.m(string2);
                                c1437l2.f18156B = 2;
                                c1437l2.f18157C = i17;
                                c1437l2.f18169d = this.f23763d;
                                c1437l2.f18171f = this.f23764e;
                                C1438m c1438m4 = new C1438m(c1437l2);
                                this.f23770l = c1438m4;
                                this.f23766g.d(c1438m4);
                            }
                            this.f23771m = p8.f5936c;
                            this.f23769k = (p8.f5937d * 1000000) / this.f23770l.f18194D;
                            c1553n3.G(0);
                            this.f23766g.a(c1553n3, 16, 0);
                            this.f23767h = 2;
                        }
                    } else if (i15 == 2) {
                        int min4 = Math.min(c1553n.a(), this.f23771m - this.f23768i);
                        this.f23766g.a(c1553n, min4, 0);
                        int i18 = this.f23768i + min4;
                        this.f23768i = i18;
                        if (i18 == this.f23771m) {
                            AbstractC1550k.g(this.f23772n != -9223372036854775807L);
                            this.f23766g.c(this.f23772n, 1, this.f23771m, 0, null);
                            this.f23772n += this.f23769k;
                            this.f23767h = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // z1.InterfaceC2004i
    public final void d(boolean z2) {
        int i3 = this.f23760a;
    }

    @Override // z1.InterfaceC2004i
    public final void e(int i3, long j) {
        switch (this.f23760a) {
            case 0:
                this.f23772n = j;
                break;
            default:
                this.f23772n = j;
                break;
        }
    }

    @Override // z1.InterfaceC2004i
    public final void f(T0.q qVar, C1994F c1994f) {
        switch (this.f23760a) {
            case 0:
                c1994f.a();
                c1994f.b();
                this.f23765f = c1994f.f23755e;
                c1994f.b();
                this.f23766g = qVar.w(c1994f.f23754d, 1);
                break;
            default:
                c1994f.a();
                c1994f.b();
                this.f23765f = c1994f.f23755e;
                c1994f.b();
                this.f23766g = qVar.w(c1994f.f23754d, 1);
                break;
        }
    }

    public C1998c(String str, int i3, int i10) {
        this.f23760a = i10;
        switch (i10) {
            case 1:
                J j = new J(new byte[16], 16);
                this.f23761b = j;
                this.f23762c = new C1553n(j.f6949b);
                this.f23767h = 0;
                this.f23768i = 0;
                this.j = false;
                this.f23772n = -9223372036854775807L;
                this.f23763d = str;
                this.f23764e = i3;
                break;
            default:
                J j3 = new J(new byte[128], 128);
                this.f23761b = j3;
                this.f23762c = new C1553n(j3.f6949b);
                this.f23767h = 0;
                this.f23772n = -9223372036854775807L;
                this.f23763d = str;
                this.f23764e = i3;
                break;
        }
    }
}
