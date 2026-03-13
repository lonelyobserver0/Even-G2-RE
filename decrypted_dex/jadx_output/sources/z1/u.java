package z1;

import T0.H;
import kotlin.UByte;
import o0.AbstractC1405B;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class u implements InterfaceC2004i {

    /* renamed from: a, reason: collision with root package name */
    public final C1553n f23968a;

    /* renamed from: b, reason: collision with root package name */
    public final T0.z f23969b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23970c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23971d;

    /* renamed from: e, reason: collision with root package name */
    public H f23972e;

    /* renamed from: f, reason: collision with root package name */
    public String f23973f;

    /* renamed from: g, reason: collision with root package name */
    public int f23974g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f23975h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f23976i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f23977k;

    /* renamed from: l, reason: collision with root package name */
    public int f23978l;

    /* renamed from: m, reason: collision with root package name */
    public long f23979m;

    public u(String str, int i3) {
        C1553n c1553n = new C1553n(4);
        this.f23968a = c1553n;
        c1553n.f20176a[0] = -1;
        this.f23969b = new T0.z();
        this.f23979m = -9223372036854775807L;
        this.f23970c = str;
        this.f23971d = i3;
    }

    @Override // z1.InterfaceC2004i
    public final void a() {
        this.f23974g = 0;
        this.f23975h = 0;
        this.j = false;
        this.f23979m = -9223372036854775807L;
    }

    @Override // z1.InterfaceC2004i
    public final void c(C1553n c1553n) {
        AbstractC1550k.h(this.f23972e);
        while (c1553n.a() > 0) {
            int i3 = this.f23974g;
            C1553n c1553n2 = this.f23968a;
            if (i3 == 0) {
                byte[] bArr = c1553n.f20176a;
                int i10 = c1553n.f20177b;
                int i11 = c1553n.f20178c;
                while (true) {
                    if (i10 >= i11) {
                        c1553n.G(i11);
                        break;
                    }
                    byte b2 = bArr[i10];
                    boolean z2 = (b2 & UByte.MAX_VALUE) == 255;
                    boolean z10 = this.j && (b2 & 224) == 224;
                    this.j = z2;
                    if (z10) {
                        c1553n.G(i10 + 1);
                        this.j = false;
                        c1553n2.f20176a[1] = bArr[i10];
                        this.f23975h = 2;
                        this.f23974g = 1;
                        break;
                    }
                    i10++;
                }
            } else if (i3 == 1) {
                int min = Math.min(c1553n.a(), 4 - this.f23975h);
                c1553n.f(this.f23975h, min, c1553n2.f20176a);
                int i12 = this.f23975h + min;
                this.f23975h = i12;
                if (i12 >= 4) {
                    c1553n2.G(0);
                    int h2 = c1553n2.h();
                    T0.z zVar = this.f23969b;
                    if (zVar.d(h2)) {
                        this.f23978l = zVar.f7077b;
                        if (!this.f23976i) {
                            this.f23977k = (zVar.f7081f * 1000000) / zVar.f7078c;
                            C1437l c1437l = new C1437l();
                            c1437l.f18166a = this.f23973f;
                            c1437l.f18177m = AbstractC1405B.m((String) zVar.f7082g);
                            c1437l.f18178n = 4096;
                            c1437l.f18156B = zVar.f7079d;
                            c1437l.f18157C = zVar.f7078c;
                            c1437l.f18169d = this.f23970c;
                            c1437l.f18171f = this.f23971d;
                            this.f23972e.d(new C1438m(c1437l));
                            this.f23976i = true;
                        }
                        c1553n2.G(0);
                        this.f23972e.a(c1553n2, 4, 0);
                        this.f23974g = 2;
                    } else {
                        this.f23975h = 0;
                        this.f23974g = 1;
                    }
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(c1553n.a(), this.f23978l - this.f23975h);
                this.f23972e.a(c1553n, min2, 0);
                int i13 = this.f23975h + min2;
                this.f23975h = i13;
                if (i13 >= this.f23978l) {
                    AbstractC1550k.g(this.f23979m != -9223372036854775807L);
                    this.f23972e.c(this.f23979m, 1, this.f23978l, 0, null);
                    this.f23979m += this.f23977k;
                    this.f23975h = 0;
                    this.f23974g = 0;
                }
            }
        }
    }

    @Override // z1.InterfaceC2004i
    public final void d(boolean z2) {
    }

    @Override // z1.InterfaceC2004i
    public final void e(int i3, long j) {
        this.f23979m = j;
    }

    @Override // z1.InterfaceC2004i
    public final void f(T0.q qVar, C1994F c1994f) {
        c1994f.a();
        c1994f.b();
        this.f23973f = c1994f.f23755e;
        c1994f.b();
        this.f23972e = qVar.w(c1994f.f23754d, 1);
    }
}
