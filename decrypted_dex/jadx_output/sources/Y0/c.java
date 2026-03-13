package Y0;

import C2.d;
import M4.I;
import T0.AbstractC0311b;
import T0.B;
import T0.H;
import T0.J;
import T0.l;
import T0.o;
import T0.p;
import T0.q;
import T0.s;
import T0.t;
import T0.u;
import com.stub.StubApp;
import f1.C0870a;
import h1.C1005h;
import java.util.Arrays;
import o0.C1404A;
import o0.C1406C;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements o {

    /* renamed from: e, reason: collision with root package name */
    public q f8719e;

    /* renamed from: f, reason: collision with root package name */
    public H f8720f;

    /* renamed from: h, reason: collision with root package name */
    public C1404A f8722h;

    /* renamed from: i, reason: collision with root package name */
    public u f8723i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f8724k;

    /* renamed from: l, reason: collision with root package name */
    public b f8725l;

    /* renamed from: m, reason: collision with root package name */
    public int f8726m;

    /* renamed from: n, reason: collision with root package name */
    public long f8727n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8715a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final C1553n f8716b = new C1553n(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8717c = false;

    /* renamed from: d, reason: collision with root package name */
    public final s f8718d = new s();

    /* renamed from: g, reason: collision with root package name */
    public int f8721g = 0;

    @Override // T0.o
    public final void b(long j, long j3) {
        if (j == 0) {
            this.f8721g = 0;
        } else {
            b bVar = this.f8725l;
            if (bVar != null) {
                bVar.d(j3);
            }
        }
        this.f8727n = j3 != 0 ? -1L : 0L;
        this.f8726m = 0;
        this.f8716b.D(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // T0.o
    public final int c(p pVar, s sVar) {
        u uVar;
        int i3;
        B tVar;
        long j;
        long j3;
        boolean z2;
        long j10;
        boolean z10;
        boolean z11 = true;
        int i10 = this.f8721g;
        C1404A c1404a = null;
        if (i10 == 0) {
            ((l) pVar).f7032f = 0;
            l lVar = (l) pVar;
            long l9 = lVar.l();
            C1404A p8 = new F5.c(21).p(lVar, !this.f8717c ? null : C1005h.f14445b);
            if (p8 != null && p8.f18017a.length != 0) {
                c1404a = p8;
            }
            lVar.u((int) (lVar.l() - l9));
            this.f8722h = c1404a;
            this.f8721g = 1;
            return 0;
        }
        byte[] bArr = this.f8715a;
        if (i10 == 1) {
            ((l) pVar).i(bArr, 0, bArr.length, false);
            ((l) pVar).f7032f = 0;
            this.f8721g = 2;
            return 0;
        }
        int i11 = 3;
        if (i10 == 2) {
            C1553n c1553n = new C1553n(4);
            ((l) pVar).e(c1553n.f20176a, 0, 4, false);
            if (c1553n.w() != 1716281667) {
                throw C1406C.a(StubApp.getString2(7496), null);
            }
            this.f8721g = 3;
            return 0;
        }
        if (i10 == 3) {
            ?? r12 = 0;
            u uVar2 = this.f8723i;
            boolean z12 = false;
            while (!z12) {
                ((l) pVar).f7032f = r12;
                byte[] bArr2 = new byte[4];
                J j11 = new J(bArr2, 4);
                l lVar2 = (l) pVar;
                lVar2.i(bArr2, r12, 4, r12);
                boolean h2 = j11.h();
                int i12 = j11.i(r9);
                int i13 = j11.i(24) + 4;
                if (i12 == 0) {
                    byte[] bArr3 = new byte[38];
                    lVar2.e(bArr3, r12, 38, r12);
                    uVar2 = new u(bArr3, 4);
                } else {
                    if (uVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (i12 == i11) {
                        C1553n c1553n2 = new C1553n(i13);
                        lVar2.e(c1553n2.f20176a, 0, i13, false);
                        uVar2 = new u(uVar2.f7047a, uVar2.f7048b, uVar2.f7049c, uVar2.f7050d, uVar2.f7051e, uVar2.f7053g, uVar2.f7054h, uVar2.j, AbstractC0311b.w(c1553n2), uVar2.f7057l);
                    } else {
                        C1404A c1404a2 = uVar2.f7057l;
                        if (i12 == 4) {
                            C1553n c1553n3 = new C1553n(i13);
                            lVar2.e(c1553n3.f20176a, 0, i13, false);
                            c1553n3.H(4);
                            C1404A u2 = AbstractC0311b.u(Arrays.asList((String[]) AbstractC0311b.x(c1553n3, false, false).f29a));
                            if (c1404a2 != null) {
                                u2 = c1404a2.e(u2);
                            }
                            uVar = new u(uVar2.f7047a, uVar2.f7048b, uVar2.f7049c, uVar2.f7050d, uVar2.f7051e, uVar2.f7053g, uVar2.f7054h, uVar2.j, uVar2.f7056k, u2);
                        } else if (i12 == 6) {
                            C1553n c1553n4 = new C1553n(i13);
                            lVar2.e(c1553n4.f20176a, 0, i13, false);
                            c1553n4.H(4);
                            C1404A c1404a3 = new C1404A(I.q(C0870a.d(c1553n4)));
                            if (c1404a2 != null) {
                                c1404a3 = c1404a2.e(c1404a3);
                            }
                            uVar = new u(uVar2.f7047a, uVar2.f7048b, uVar2.f7049c, uVar2.f7050d, uVar2.f7051e, uVar2.f7053g, uVar2.f7054h, uVar2.j, uVar2.f7056k, c1404a3);
                        } else {
                            lVar2.u(i13);
                        }
                        uVar2 = uVar;
                    }
                }
                int i14 = AbstractC1560u.f20190a;
                this.f8723i = uVar2;
                z12 = h2;
                r12 = 0;
                i11 = 3;
                r9 = 7;
            }
            this.f8723i.getClass();
            this.j = Math.max(this.f8723i.f7049c, 6);
            H h4 = this.f8720f;
            int i15 = AbstractC1560u.f20190a;
            h4.d(this.f8723i.c(bArr, this.f8722h));
            this.f8721g = 4;
            return 0;
        }
        long j12 = 0;
        if (i10 == 4) {
            ((l) pVar).f7032f = 0;
            C1553n c1553n5 = new C1553n(2);
            l lVar3 = (l) pVar;
            lVar3.i(c1553n5.f20176a, 0, 2, false);
            int A4 = c1553n5.A();
            if ((A4 >> 2) != 16382) {
                lVar3.f7032f = 0;
                throw C1406C.a(StubApp.getString2(7495), null);
            }
            lVar3.f7032f = 0;
            this.f8724k = A4;
            q qVar = this.f8719e;
            int i16 = AbstractC1560u.f20190a;
            long j13 = lVar3.f7030d;
            this.f8723i.getClass();
            u uVar3 = this.f8723i;
            if (uVar3.f7056k != null) {
                tVar = new t(uVar3, j13, 0);
                i3 = 0;
            } else {
                long j14 = lVar3.f7029c;
                if (j14 == -1 || uVar3.j <= 0) {
                    i3 = 0;
                    tVar = new t(uVar3.b());
                } else {
                    int i17 = this.f8724k;
                    d dVar = new d(uVar3, 26);
                    a aVar = new a(uVar3, i17);
                    long b2 = uVar3.b();
                    int i18 = uVar3.f7049c;
                    int i19 = uVar3.f7050d;
                    if (i19 > 0) {
                        i3 = 0;
                        j = j13;
                        j3 = ((i19 + i18) / 2) + 1;
                    } else {
                        i3 = 0;
                        j = j13;
                        int i20 = uVar3.f7048b;
                        int i21 = uVar3.f7047a;
                        j3 = 64 + (((((i21 != i20 || i21 <= 0) ? 4096L : i21) * uVar3.f7053g) * uVar3.f7054h) / 8);
                    }
                    b bVar = new b(dVar, aVar, b2, uVar3.j, j, j14, j3, Math.max(6, i18));
                    this.f8725l = bVar;
                    tVar = bVar.f8711a;
                }
            }
            qVar.D(tVar);
            this.f8721g = 5;
            return i3;
        }
        if (i10 != 5) {
            throw new IllegalStateException();
        }
        this.f8720f.getClass();
        this.f8723i.getClass();
        b bVar2 = this.f8725l;
        if (bVar2 != null && bVar2.f8713c != null) {
            return bVar2.b((l) pVar, sVar);
        }
        if (this.f8727n == -1) {
            u uVar4 = this.f8723i;
            ((l) pVar).f7032f = 0;
            l lVar4 = (l) pVar;
            lVar4.a(1, false);
            byte[] bArr4 = new byte[1];
            lVar4.i(bArr4, 0, 1, false);
            boolean z13 = (bArr4[0] & 1) == 1;
            lVar4.a(2, false);
            r9 = z13 ? 7 : 6;
            C1553n c1553n6 = new C1553n(r9);
            byte[] bArr5 = c1553n6.f20176a;
            int i22 = 0;
            while (i22 < r9) {
                int g10 = lVar4.g(i22, r9 - i22, bArr5);
                if (g10 == -1) {
                    break;
                }
                i22 += g10;
            }
            c1553n6.F(i22);
            lVar4.f7032f = 0;
            try {
                long B7 = c1553n6.B();
                if (!z13) {
                    B7 *= uVar4.f7048b;
                }
                j12 = B7;
            } catch (NumberFormatException unused) {
                z11 = false;
            }
            if (!z11) {
                throw C1406C.a(null, null);
            }
            this.f8727n = j12;
        } else {
            C1553n c1553n7 = this.f8716b;
            int i23 = c1553n7.f20178c;
            if (i23 < 32768) {
                int read = ((l) pVar).read(c1553n7.f20176a, i23, 32768 - i23);
                z2 = read == -1;
                if (!z2) {
                    c1553n7.F(i23 + read);
                } else if (c1553n7.a() == 0) {
                    long j15 = this.f8727n * 1000000;
                    u uVar5 = this.f8723i;
                    int i24 = AbstractC1560u.f20190a;
                    this.f8720f.c(j15 / uVar5.f7051e, 1, this.f8726m, 0, null);
                    return -1;
                }
            } else {
                z2 = false;
            }
            int i25 = c1553n7.f20177b;
            int i26 = this.f8726m;
            int i27 = this.j;
            if (i26 < i27) {
                c1553n7.H(Math.min(i27 - i26, c1553n7.a()));
            }
            this.f8723i.getClass();
            int i28 = c1553n7.f20177b;
            while (true) {
                int i29 = c1553n7.f20178c - 16;
                s sVar2 = this.f8718d;
                if (i28 <= i29) {
                    c1553n7.G(i28);
                    if (AbstractC0311b.d(c1553n7, this.f8723i, this.f8724k, sVar2)) {
                        c1553n7.G(i28);
                        j10 = sVar2.f7043a;
                        break;
                    }
                    i28++;
                } else {
                    if (z2) {
                        while (true) {
                            int i30 = c1553n7.f20178c;
                            if (i28 > i30 - this.j) {
                                c1553n7.G(i30);
                                break;
                            }
                            c1553n7.G(i28);
                            try {
                                z10 = AbstractC0311b.d(c1553n7, this.f8723i, this.f8724k, sVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                z10 = false;
                            }
                            if (c1553n7.f20177b > c1553n7.f20178c) {
                                z10 = false;
                            }
                            if (z10) {
                                c1553n7.G(i28);
                                j10 = sVar2.f7043a;
                                break;
                            }
                            i28++;
                        }
                    } else {
                        c1553n7.G(i28);
                    }
                    j10 = -1;
                }
            }
            int i31 = c1553n7.f20177b - i25;
            c1553n7.G(i25);
            this.f8720f.a(c1553n7, i31, 0);
            int i32 = this.f8726m + i31;
            this.f8726m = i32;
            if (j10 != -1) {
                long j16 = this.f8727n * 1000000;
                u uVar6 = this.f8723i;
                int i33 = AbstractC1560u.f20190a;
                this.f8720f.c(j16 / uVar6.f7051e, 1, i32, 0, null);
                this.f8726m = 0;
                this.f8727n = j10;
            }
            if (c1553n7.a() < 16) {
                int a3 = c1553n7.a();
                byte[] bArr6 = c1553n7.f20176a;
                System.arraycopy(bArr6, c1553n7.f20177b, bArr6, 0, a3);
                c1553n7.G(0);
                c1553n7.F(a3);
            }
        }
        return 0;
    }

    @Override // T0.o
    public final void f(q qVar) {
        this.f8719e = qVar;
        this.f8720f = qVar.w(0, 1);
        qVar.q();
    }

    @Override // T0.o
    public final boolean h(p pVar) {
        l lVar = (l) pVar;
        C1404A p8 = new F5.c(21).p(lVar, C1005h.f14445b);
        if (p8 != null) {
            int length = p8.f18017a.length;
        }
        C1553n c1553n = new C1553n(4);
        lVar.i(c1553n.f20176a, 0, 4, false);
        return c1553n.w() == 1716281667;
    }

    @Override // T0.o
    public final void release() {
    }
}
