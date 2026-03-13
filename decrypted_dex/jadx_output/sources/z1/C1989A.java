package z1;

import T0.J;
import android.util.SparseArray;
import kotlin.UByte;
import org.bouncycastle.asn1.BERTags;
import r0.AbstractC1550k;
import r0.C1553n;
import r0.C1558s;
import v0.C1803F;

/* renamed from: z1.A, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1989A implements T0.o {

    /* renamed from: e, reason: collision with root package name */
    public boolean f23718e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23719f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23720g;

    /* renamed from: h, reason: collision with root package name */
    public long f23721h;

    /* renamed from: i, reason: collision with root package name */
    public Y0.b f23722i;
    public T0.q j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23723k;

    /* renamed from: a, reason: collision with root package name */
    public final C1558s f23714a = new C1558s(0);

    /* renamed from: c, reason: collision with root package name */
    public final C1553n f23716c = new C1553n(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f23715b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final y f23717d = new y(0);

    @Override // T0.o
    public final void b(long j, long j3) {
        long j10;
        C1558s c1558s = this.f23714a;
        synchronized (c1558s) {
            j10 = c1558s.f20187b;
        }
        boolean z2 = j10 == -9223372036854775807L;
        if (!z2) {
            long d8 = c1558s.d();
            z2 = (d8 == -9223372036854775807L || d8 == 0 || d8 == j3) ? false : true;
        }
        if (z2) {
            c1558s.f(j3);
        }
        Y0.b bVar = this.f23722i;
        if (bVar != null) {
            bVar.d(j3);
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f23715b;
            if (i3 >= sparseArray.size()) {
                return;
            }
            z zVar = (z) sparseArray.valueAt(i3);
            zVar.f24028f = false;
            zVar.f24023a.a();
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    @Override // T0.o
    public final int c(T0.p pVar, T0.s sVar) {
        int i3;
        ?? r22;
        C1553n c1553n;
        InterfaceC2004i interfaceC2004i;
        AbstractC1550k.h(this.j);
        long j = ((T0.l) pVar).f7029c;
        int i10 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        long j3 = -9223372036854775807L;
        y yVar = this.f23717d;
        if (i10 != 0 && !yVar.f24017d) {
            boolean z2 = yVar.f24019f;
            C1553n c1553n2 = yVar.f24016c;
            if (!z2) {
                T0.l lVar = (T0.l) pVar;
                long j10 = lVar.f7029c;
                int min = (int) Math.min(20000L, j10);
                long j11 = j10 - min;
                if (lVar.f7030d != j11) {
                    sVar.f7043a = j11;
                    return 1;
                }
                c1553n2.D(min);
                lVar.f7032f = 0;
                lVar.i(c1553n2.f20176a, 0, min, false);
                int i11 = c1553n2.f20177b;
                int i12 = c1553n2.f20178c - 4;
                while (true) {
                    if (i12 < i11) {
                        break;
                    }
                    if (y.b(i12, c1553n2.f20176a) == 442) {
                        c1553n2.G(i12 + 4);
                        long c10 = y.c(c1553n2);
                        if (c10 != -9223372036854775807L) {
                            j3 = c10;
                            break;
                        }
                    }
                    i12--;
                }
                yVar.f24021h = j3;
                yVar.f24019f = true;
                return 0;
            }
            if (yVar.f24021h == -9223372036854775807L) {
                yVar.a((T0.l) pVar);
                return 0;
            }
            if (yVar.f24018e) {
                long j12 = yVar.f24020g;
                if (j12 == -9223372036854775807L) {
                    yVar.a((T0.l) pVar);
                    return 0;
                }
                C1558s c1558s = yVar.f24015b;
                yVar.f24022i = c1558s.c(yVar.f24021h) - c1558s.b(j12);
                yVar.a((T0.l) pVar);
                return 0;
            }
            T0.l lVar2 = (T0.l) pVar;
            int min2 = (int) Math.min(20000L, lVar2.f7029c);
            long j13 = 0;
            if (lVar2.f7030d != j13) {
                sVar.f7043a = j13;
                return 1;
            }
            c1553n2.D(min2);
            lVar2.f7032f = 0;
            lVar2.i(c1553n2.f20176a, 0, min2, false);
            int i13 = c1553n2.f20177b;
            int i14 = c1553n2.f20178c;
            while (true) {
                if (i13 >= i14 - 3) {
                    break;
                }
                if (y.b(i13, c1553n2.f20176a) == 442) {
                    c1553n2.G(i13 + 4);
                    long c11 = y.c(c1553n2);
                    if (c11 != -9223372036854775807L) {
                        j3 = c11;
                        break;
                    }
                }
                i13++;
            }
            yVar.f24020g = j3;
            yVar.f24018e = true;
            return 0;
        }
        if (this.f23723k) {
            i3 = i10;
            r22 = 0;
        } else {
            this.f23723k = true;
            long j14 = yVar.f24022i;
            if (j14 != -9223372036854775807L) {
                C2.i iVar = new C2.i();
                C1558s c1558s2 = yVar.f24015b;
                C1803F c1803f = new C1803F();
                c1803f.f21581a = c1558s2;
                c1803f.f21582b = new C1553n();
                i3 = i10;
                r22 = 0;
                Y0.b bVar = new Y0.b(iVar, c1803f, j14, j14 + 1, 0L, j, 188L, 1000);
                this.f23722i = bVar;
                this.j.D(bVar.f8711a);
            } else {
                i3 = i10;
                r22 = 0;
                this.j.D(new T0.t(j14));
            }
        }
        Y0.b bVar2 = this.f23722i;
        if (bVar2 != null && bVar2.f8713c != null) {
            return bVar2.b((T0.l) pVar, sVar);
        }
        T0.l lVar3 = (T0.l) pVar;
        lVar3.f7032f = r22;
        long l9 = i3 != 0 ? j - lVar3.l() : -1L;
        if (l9 != -1 && l9 < 4) {
            return -1;
        }
        C1553n c1553n3 = this.f23716c;
        if (!lVar3.i(c1553n3.f20176a, r22, 4, true)) {
            return -1;
        }
        c1553n3.G(r22);
        int h2 = c1553n3.h();
        if (h2 == 441) {
            return -1;
        }
        if (h2 == 442) {
            lVar3.i(c1553n3.f20176a, r22, 10, r22);
            c1553n3.G(9);
            lVar3.u((c1553n3.u() & 7) + 14);
            return r22;
        }
        if (h2 == 443) {
            lVar3.i(c1553n3.f20176a, r22, 2, r22);
            c1553n3.G(r22);
            lVar3.u(c1553n3.A() + 6);
            return r22;
        }
        if (((h2 & (-256)) >> 8) != 1) {
            lVar3.u(1);
            return r22;
        }
        int i15 = h2 & 255;
        SparseArray sparseArray = this.f23715b;
        z zVar = (z) sparseArray.get(i15);
        if (!this.f23718e) {
            if (zVar == null) {
                if (i15 == 189) {
                    interfaceC2004i = new C1998c();
                    this.f23719f = true;
                    this.f23721h = lVar3.f7030d;
                } else if ((h2 & BERTags.FLAGS) == 192) {
                    interfaceC2004i = new u(null, r22);
                    this.f23719f = true;
                    this.f23721h = lVar3.f7030d;
                } else if ((h2 & 240) == 224) {
                    interfaceC2004i = new k(null);
                    this.f23720g = true;
                    this.f23721h = lVar3.f7030d;
                } else {
                    interfaceC2004i = null;
                }
                if (interfaceC2004i != null) {
                    interfaceC2004i.f(this.j, new C1994F(i15, 256));
                    zVar = new z(interfaceC2004i, this.f23714a);
                    sparseArray.put(i15, zVar);
                }
            }
            if (lVar3.f7030d > ((this.f23719f && this.f23720g) ? this.f23721h + 8192 : 1048576L)) {
                this.f23718e = true;
                this.j.q();
            }
        }
        lVar3.i(c1553n3.f20176a, r22, 2, r22);
        c1553n3.G(r22);
        int A4 = c1553n3.A() + 6;
        if (zVar == null) {
            lVar3.u(A4);
            return r22;
        }
        c1553n3.D(A4);
        lVar3.e(c1553n3.f20176a, r22, A4, r22);
        c1553n3.G(6);
        J j15 = zVar.f24025c;
        c1553n3.f(r22, 3, j15.f6949b);
        j15.q(r22);
        j15.t(8);
        zVar.f24026d = j15.h();
        zVar.f24027e = j15.h();
        j15.t(6);
        c1553n3.f(r22, j15.i(8), j15.f6949b);
        j15.q(r22);
        zVar.f24029g = 0L;
        if (zVar.f24026d) {
            j15.t(4);
            j15.t(1);
            j15.t(1);
            long i16 = (j15.i(3) << 30) | (j15.i(15) << 15) | j15.i(15);
            j15.t(1);
            boolean z10 = zVar.f24028f;
            C1558s c1558s3 = zVar.f24024b;
            if (z10 || !zVar.f24027e) {
                c1553n = c1553n3;
            } else {
                j15.t(4);
                j15.t(1);
                c1553n = c1553n3;
                j15.t(1);
                j15.t(1);
                c1558s3.b((j15.i(15) << 15) | (j15.i(3) << 30) | j15.i(15));
                zVar.f24028f = true;
            }
            zVar.f24029g = c1558s3.b(i16);
        } else {
            c1553n = c1553n3;
        }
        long j16 = zVar.f24029g;
        InterfaceC2004i interfaceC2004i2 = zVar.f24023a;
        interfaceC2004i2.e(4, j16);
        interfaceC2004i2.c(c1553n);
        interfaceC2004i2.d(false);
        c1553n.F(c1553n.f20176a.length);
        return 0;
    }

    @Override // T0.o
    public final void f(T0.q qVar) {
        this.j = qVar;
    }

    @Override // T0.o
    public final boolean h(T0.p pVar) {
        byte[] bArr = new byte[14];
        T0.l lVar = (T0.l) pVar;
        lVar.i(bArr, 0, 14, false);
        if (442 == (((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.a(bArr[13] & 7, false);
            lVar.i(bArr, 0, 3, false);
            if (1 == (((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8) | (bArr[2] & UByte.MAX_VALUE))) {
                return true;
            }
        }
        return false;
    }

    @Override // T0.o
    public final void release() {
    }
}
