package w;

import java.util.Arrays;
import sa.C1608a;
import x.C1896c;

/* renamed from: w.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1855d {

    /* renamed from: o, reason: collision with root package name */
    public static int f21955o = 1000;

    /* renamed from: b, reason: collision with root package name */
    public final C1854c f21957b;

    /* renamed from: e, reason: collision with root package name */
    public C1853b[] f21960e;

    /* renamed from: k, reason: collision with root package name */
    public final C1608a f21965k;

    /* renamed from: n, reason: collision with root package name */
    public final C1853b f21968n;

    /* renamed from: a, reason: collision with root package name */
    public int f21956a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f21958c = 32;

    /* renamed from: d, reason: collision with root package name */
    public int f21959d = 32;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21961f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f21962g = new boolean[32];

    /* renamed from: h, reason: collision with root package name */
    public int f21963h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f21964i = 0;
    public int j = 32;

    /* renamed from: l, reason: collision with root package name */
    public C1857f[] f21966l = new C1857f[f21955o];

    /* renamed from: m, reason: collision with root package name */
    public int f21967m = 0;

    public C1855d() {
        int i3 = 0;
        this.f21960e = null;
        this.f21960e = new C1853b[32];
        while (true) {
            C1853b[] c1853bArr = this.f21960e;
            if (i3 >= c1853bArr.length) {
                C1608a c1608a = new C1608a();
                c1608a.f20820a = new M.b();
                c1608a.f20821b = new M.b();
                c1608a.f20822c = new C1857f[32];
                this.f21965k = c1608a;
                this.f21957b = new C1854c(c1608a);
                this.f21968n = new C1853b(c1608a);
                return;
            }
            C1853b c1853b = c1853bArr[i3];
            if (c1853b != null) {
                M.b bVar = (M.b) this.f21965k.f20820a;
                int i10 = bVar.f4428b;
                Object[] objArr = bVar.f4427a;
                if (i10 < objArr.length) {
                    objArr[i10] = c1853b;
                    bVar.f4428b = i10 + 1;
                }
            }
            c1853bArr[i3] = null;
            i3++;
        }
    }

    public static int m(Object obj) {
        C1857f c1857f = ((C1896c) obj).f22528i;
        if (c1857f != null) {
            return (int) (c1857f.f21973d + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C1857f a(int i3) {
        M.b bVar = (M.b) this.f21965k.f20821b;
        int i10 = bVar.f4428b;
        C1857f c1857f = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            ?? r32 = bVar.f4427a;
            ?? r42 = r32[i11];
            r32[i11] = 0;
            bVar.f4428b = i11;
            c1857f = r42;
        }
        C1857f c1857f2 = c1857f;
        if (c1857f2 == null) {
            c1857f2 = new C1857f(i3);
            c1857f2.f21975f = i3;
        } else {
            c1857f2.c();
            c1857f2.f21975f = i3;
        }
        int i12 = this.f21967m;
        int i13 = f21955o;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            f21955o = i14;
            this.f21966l = (C1857f[]) Arrays.copyOf(this.f21966l, i14);
        }
        C1857f[] c1857fArr = this.f21966l;
        int i15 = this.f21967m;
        this.f21967m = i15 + 1;
        c1857fArr[i15] = c1857f2;
        return c1857f2;
    }

    public final void b(C1857f c1857f, C1857f c1857f2, int i3, float f10, C1857f c1857f3, C1857f c1857f4, int i10, int i11) {
        C1853b k3 = k();
        C1852a c1852a = k3.f21953c;
        if (c1857f2 == c1857f3) {
            c1852a.g(c1857f, 1.0f);
            c1852a.g(c1857f4, 1.0f);
            c1852a.g(c1857f2, -2.0f);
        } else if (f10 == 0.5f) {
            c1852a.g(c1857f, 1.0f);
            c1852a.g(c1857f2, -1.0f);
            c1852a.g(c1857f3, -1.0f);
            c1852a.g(c1857f4, 1.0f);
            if (i3 > 0 || i10 > 0) {
                k3.f21952b = (-i3) + i10;
            }
        } else if (f10 <= 0.0f) {
            c1852a.g(c1857f, -1.0f);
            c1852a.g(c1857f2, 1.0f);
            k3.f21952b = i3;
        } else if (f10 >= 1.0f) {
            c1852a.g(c1857f3, -1.0f);
            c1852a.g(c1857f4, 1.0f);
            k3.f21952b = i10;
        } else {
            float f11 = 1.0f - f10;
            c1852a.g(c1857f, f11 * 1.0f);
            c1852a.g(c1857f2, f11 * (-1.0f));
            c1852a.g(c1857f3, (-1.0f) * f10);
            c1852a.g(c1857f4, 1.0f * f10);
            if (i3 > 0 || i10 > 0) {
                k3.f21952b = (i10 * f10) + ((-i3) * f11);
            }
        }
        if (i11 != 6) {
            k3.a(this, i11);
        }
        c(k3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        if (r6.f21978i <= 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b0, code lost:
    
        if (r6.f21978i <= 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c5, code lost:
    
        if (r6.f21978i <= 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c8, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d3, code lost:
    
        if (r6.f21978i <= 1) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(w.C1853b r19) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1855d.c(w.b):void");
    }

    public final void d(C1857f c1857f, int i3) {
        int i10 = c1857f.f21971b;
        if (i10 == -1) {
            C1853b k3 = k();
            k3.f21951a = c1857f;
            float f10 = i3;
            c1857f.f21973d = f10;
            k3.f21952b = f10;
            k3.f21954d = true;
            c(k3);
            return;
        }
        C1853b c1853b = this.f21960e[i10];
        if (c1853b.f21954d) {
            c1853b.f21952b = i3;
            return;
        }
        if (c1853b.f21953c.f21942a == 0) {
            c1853b.f21954d = true;
            c1853b.f21952b = i3;
            return;
        }
        C1853b k4 = k();
        C1852a c1852a = k4.f21953c;
        if (i3 < 0) {
            k4.f21952b = i3 * (-1);
            c1852a.g(c1857f, 1.0f);
        } else {
            k4.f21952b = i3;
            c1852a.g(c1857f, -1.0f);
        }
        c(k4);
    }

    public final void e(C1857f c1857f, C1857f c1857f2, int i3, int i10) {
        C1853b k3 = k();
        boolean z2 = false;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z2 = true;
            }
            k3.f21952b = i3;
        }
        C1852a c1852a = k3.f21953c;
        if (z2) {
            c1852a.g(c1857f, 1.0f);
            c1852a.g(c1857f2, -1.0f);
        } else {
            c1852a.g(c1857f, -1.0f);
            c1852a.g(c1857f2, 1.0f);
        }
        if (i10 != 6) {
            k3.a(this, i10);
        }
        c(k3);
    }

    public final void f(C1857f c1857f, C1857f c1857f2, int i3, int i10) {
        C1853b k3 = k();
        C1857f l9 = l();
        l9.f21972c = 0;
        k3.c(c1857f, c1857f2, l9, i3);
        if (i10 != 6) {
            k3.f21953c.g(i(i10), (int) (r4.c(l9) * (-1.0f)));
        }
        c(k3);
    }

    public final void g(C1857f c1857f, C1857f c1857f2, int i3, int i10) {
        C1853b k3 = k();
        C1857f l9 = l();
        l9.f21972c = 0;
        k3.d(c1857f, c1857f2, l9, i3);
        if (i10 != 6) {
            k3.f21953c.g(i(i10), (int) (r4.c(l9) * (-1.0f)));
        }
        c(k3);
    }

    public final void h(C1853b c1853b) {
        C1853b[] c1853bArr = this.f21960e;
        int i3 = this.f21964i;
        C1853b c1853b2 = c1853bArr[i3];
        if (c1853b2 != null) {
            M.b bVar = (M.b) this.f21965k.f20820a;
            int i10 = bVar.f4428b;
            Object[] objArr = bVar.f4427a;
            if (i10 < objArr.length) {
                objArr[i10] = c1853b2;
                bVar.f4428b = i10 + 1;
            }
        }
        c1853bArr[i3] = c1853b;
        C1857f c1857f = c1853b.f21951a;
        c1857f.f21971b = i3;
        this.f21964i = i3 + 1;
        c1857f.d(c1853b);
    }

    public final C1857f i(int i3) {
        if (this.f21963h + 1 >= this.f21959d) {
            n();
        }
        C1857f a3 = a(4);
        int i10 = this.f21956a + 1;
        this.f21956a = i10;
        this.f21963h++;
        a3.f21970a = i10;
        a3.f21972c = i3;
        ((C1857f[]) this.f21965k.f20822c)[i10] = a3;
        this.f21957b.b(a3);
        return a3;
    }

    public final C1857f j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f21963h + 1 >= this.f21959d) {
            n();
        }
        if (!(obj instanceof C1896c)) {
            return null;
        }
        C1896c c1896c = (C1896c) obj;
        C1857f c1857f = c1896c.f22528i;
        if (c1857f == null) {
            c1896c.e();
            c1857f = c1896c.f22528i;
        }
        int i3 = c1857f.f21970a;
        C1608a c1608a = this.f21965k;
        if (i3 != -1 && i3 <= this.f21956a && ((C1857f[]) c1608a.f20822c)[i3] != null) {
            return c1857f;
        }
        if (i3 != -1) {
            c1857f.c();
        }
        int i10 = this.f21956a + 1;
        this.f21956a = i10;
        this.f21963h++;
        c1857f.f21970a = i10;
        c1857f.f21975f = 1;
        ((C1857f[]) c1608a.f20822c)[i10] = c1857f;
        return c1857f;
    }

    public final C1853b k() {
        Object obj;
        C1608a c1608a = this.f21965k;
        M.b bVar = (M.b) c1608a.f20820a;
        int i3 = bVar.f4428b;
        if (i3 > 0) {
            int i10 = i3 - 1;
            Object[] objArr = bVar.f4427a;
            obj = objArr[i10];
            objArr[i10] = null;
            bVar.f4428b = i10;
        } else {
            obj = null;
        }
        C1853b c1853b = (C1853b) obj;
        if (c1853b == null) {
            return new C1853b(c1608a);
        }
        c1853b.f21951a = null;
        c1853b.f21953c.b();
        c1853b.f21952b = 0.0f;
        c1853b.f21954d = false;
        return c1853b;
    }

    public final C1857f l() {
        if (this.f21963h + 1 >= this.f21959d) {
            n();
        }
        C1857f a3 = a(3);
        int i3 = this.f21956a + 1;
        this.f21956a = i3;
        this.f21963h++;
        a3.f21970a = i3;
        ((C1857f[]) this.f21965k.f20822c)[i3] = a3;
        return a3;
    }

    public final void n() {
        int i3 = this.f21958c * 2;
        this.f21958c = i3;
        this.f21960e = (C1853b[]) Arrays.copyOf(this.f21960e, i3);
        C1608a c1608a = this.f21965k;
        c1608a.f20822c = (C1857f[]) Arrays.copyOf((C1857f[]) c1608a.f20822c, this.f21958c);
        int i10 = this.f21958c;
        this.f21962g = new boolean[i10];
        this.f21959d = i10;
        this.j = i10;
    }

    public final void o(C1854c c1854c) {
        C1608a c1608a;
        r(c1854c);
        int i3 = 0;
        while (true) {
            if (i3 >= this.f21964i) {
                break;
            }
            C1853b c1853b = this.f21960e[i3];
            int i10 = 1;
            if (c1853b.f21951a.f21975f != 1) {
                float f10 = 0.0f;
                if (c1853b.f21952b < 0.0f) {
                    boolean z2 = false;
                    int i11 = 0;
                    while (!z2) {
                        i11 += i10;
                        float f11 = Float.MAX_VALUE;
                        int i12 = -1;
                        int i13 = -1;
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            int i16 = this.f21964i;
                            c1608a = this.f21965k;
                            if (i14 >= i16) {
                                break;
                            }
                            C1853b c1853b2 = this.f21960e[i14];
                            if (c1853b2.f21951a.f21975f != i10 && !c1853b2.f21954d && c1853b2.f21952b < f10) {
                                int i17 = i10;
                                while (i17 < this.f21963h) {
                                    C1857f c1857f = ((C1857f[]) c1608a.f20822c)[i17];
                                    float c10 = c1853b2.f21953c.c(c1857f);
                                    if (c10 > f10) {
                                        for (int i18 = 0; i18 < 7; i18++) {
                                            float f12 = c1857f.f21974e[i18] / c10;
                                            if ((f12 < f11 && i18 == i15) || i18 > i15) {
                                                i15 = i18;
                                                f11 = f12;
                                                i12 = i14;
                                                i13 = i17;
                                            }
                                        }
                                    }
                                    i17++;
                                    f10 = 0.0f;
                                }
                            }
                            i14++;
                            f10 = 0.0f;
                            i10 = 1;
                        }
                        if (i12 != -1) {
                            C1853b c1853b3 = this.f21960e[i12];
                            c1853b3.f21951a.f21971b = -1;
                            c1853b3.e(((C1857f[]) c1608a.f20822c)[i13]);
                            C1857f c1857f2 = c1853b3.f21951a;
                            c1857f2.f21971b = i12;
                            c1857f2.d(c1853b3);
                        } else {
                            z2 = true;
                        }
                        if (i11 > this.f21963h / 2) {
                            z2 = true;
                        }
                        f10 = 0.0f;
                        i10 = 1;
                    }
                }
            }
            i3++;
        }
        p(c1854c);
        for (int i19 = 0; i19 < this.f21964i; i19++) {
            C1853b c1853b4 = this.f21960e[i19];
            c1853b4.f21951a.f21973d = c1853b4.f21952b;
        }
    }

    public final void p(C1853b c1853b) {
        C1852a c1852a;
        int i3;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f21963h; i11++) {
            this.f21962g[i11] = false;
        }
        boolean z2 = false;
        int i12 = 0;
        while (!z2) {
            i12++;
            if (i12 >= this.f21963h * 2) {
                return;
            }
            C1857f c1857f = c1853b.f21951a;
            if (c1857f != null) {
                this.f21962g[c1857f.f21970a] = true;
            }
            C1857f d8 = c1853b.f21953c.d(this.f21962g, null);
            if (d8 != null) {
                boolean[] zArr = this.f21962g;
                int i13 = d8.f21970a;
                if (zArr[i13]) {
                    return;
                } else {
                    zArr[i13] = true;
                }
            }
            if (d8 != null) {
                float f10 = Float.MAX_VALUE;
                int i14 = i10;
                int i15 = -1;
                while (i14 < this.f21964i) {
                    C1853b c1853b2 = this.f21960e[i14];
                    if (c1853b2.f21951a.f21975f != 1 && !c1853b2.f21954d && (i3 = (c1852a = c1853b2.f21953c).f21949h) != -1) {
                        int i16 = i10;
                        while (true) {
                            if (i3 != -1 && i16 < c1852a.f21942a) {
                                if (c1852a.f21946e[i3] == d8.f21970a) {
                                    float c10 = c1852a.c(d8);
                                    if (c10 < 0.0f) {
                                        float f11 = (-c1853b2.f21952b) / c10;
                                        if (f11 < f10) {
                                            i15 = i14;
                                            f10 = f11;
                                        }
                                    }
                                } else {
                                    i3 = c1852a.f21947f[i3];
                                    i16++;
                                }
                            }
                        }
                    }
                    i14++;
                    i10 = 0;
                }
                if (i15 > -1) {
                    C1853b c1853b3 = this.f21960e[i15];
                    c1853b3.f21951a.f21971b = -1;
                    c1853b3.e(d8);
                    C1857f c1857f2 = c1853b3.f21951a;
                    c1857f2.f21971b = i15;
                    c1857f2.d(c1853b3);
                    i10 = 0;
                }
            }
            z2 = true;
            i10 = 0;
        }
    }

    public final void q() {
        C1608a c1608a;
        int i3 = 0;
        while (true) {
            c1608a = this.f21965k;
            C1857f[] c1857fArr = (C1857f[]) c1608a.f20822c;
            if (i3 >= c1857fArr.length) {
                break;
            }
            C1857f c1857f = c1857fArr[i3];
            if (c1857f != null) {
                c1857f.c();
            }
            i3++;
        }
        M.b bVar = (M.b) c1608a.f20821b;
        C1857f[] c1857fArr2 = this.f21966l;
        int i10 = this.f21967m;
        bVar.getClass();
        if (i10 > c1857fArr2.length) {
            i10 = c1857fArr2.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            C1857f c1857f2 = c1857fArr2[i11];
            int i12 = bVar.f4428b;
            Object[] objArr = bVar.f4427a;
            if (i12 < objArr.length) {
                objArr[i12] = c1857f2;
                bVar.f4428b = i12 + 1;
            }
        }
        this.f21967m = 0;
        Arrays.fill((C1857f[]) c1608a.f20822c, (Object) null);
        this.f21956a = 0;
        C1854c c1854c = this.f21957b;
        c1854c.f21953c.b();
        c1854c.f21951a = null;
        c1854c.f21952b = 0.0f;
        this.f21963h = 1;
        for (int i13 = 0; i13 < this.f21964i; i13++) {
            this.f21960e[i13].getClass();
        }
        int i14 = 0;
        while (true) {
            C1853b[] c1853bArr = this.f21960e;
            if (i14 >= c1853bArr.length) {
                this.f21964i = 0;
                return;
            }
            C1853b c1853b = c1853bArr[i14];
            if (c1853b != null) {
                M.b bVar2 = (M.b) c1608a.f20820a;
                int i15 = bVar2.f4428b;
                Object[] objArr2 = bVar2.f4427a;
                if (i15 < objArr2.length) {
                    objArr2[i15] = c1853b;
                    bVar2.f4428b = i15 + 1;
                }
            }
            c1853bArr[i14] = null;
            i14++;
        }
    }

    public final void r(C1853b c1853b) {
        if (this.f21964i > 0) {
            C1852a c1852a = c1853b.f21953c;
            C1853b[] c1853bArr = this.f21960e;
            int i3 = c1852a.f21949h;
            loop0: while (true) {
                for (int i10 = 0; i3 != -1 && i10 < c1852a.f21942a; i10++) {
                    C1608a c1608a = c1852a.f21944c;
                    C1857f c1857f = ((C1857f[]) c1608a.f20822c)[c1852a.f21946e[i3]];
                    if (c1857f.f21971b != -1) {
                        float f10 = c1852a.f21948g[i3];
                        c1852a.h(c1857f, true);
                        C1853b c1853b2 = c1853bArr[c1857f.f21971b];
                        if (!c1853b2.f21954d) {
                            C1852a c1852a2 = c1853b2.f21953c;
                            int i11 = c1852a2.f21949h;
                            for (int i12 = 0; i11 != -1 && i12 < c1852a2.f21942a; i12++) {
                                c1852a.a(((C1857f[]) c1608a.f20822c)[c1852a2.f21946e[i11]], c1852a2.f21948g[i11] * f10, true);
                                i11 = c1852a2.f21947f[i11];
                            }
                        }
                        c1853b.f21952b = (c1853b2.f21952b * f10) + c1853b.f21952b;
                        c1853b2.f21951a.b(c1853b);
                        i3 = c1852a.f21949h;
                    } else {
                        i3 = c1852a.f21947f[i3];
                    }
                }
            }
            if (c1853b.f21953c.f21942a == 0) {
                c1853b.f21954d = true;
            }
        }
    }
}
