package z1;

import T0.J;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0.C1406C;
import r0.AbstractC1550k;
import r0.C1553n;
import r0.C1558s;
import s.C1590a;

/* renamed from: z1.D, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1992D implements T0.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f23730a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23731b;

    /* renamed from: c, reason: collision with root package name */
    public final List f23732c;

    /* renamed from: d, reason: collision with root package name */
    public final C1553n f23733d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f23734e;

    /* renamed from: f, reason: collision with root package name */
    public final K.i f23735f;

    /* renamed from: g, reason: collision with root package name */
    public final q1.j f23736g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f23737h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f23738i;
    public final SparseBooleanArray j;

    /* renamed from: k, reason: collision with root package name */
    public final y f23739k;

    /* renamed from: l, reason: collision with root package name */
    public Y0.b f23740l;

    /* renamed from: m, reason: collision with root package name */
    public T0.q f23741m;

    /* renamed from: n, reason: collision with root package name */
    public int f23742n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f23743o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f23744p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f23745q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC1995G f23746r;

    /* renamed from: s, reason: collision with root package name */
    public int f23747s;

    /* renamed from: t, reason: collision with root package name */
    public int f23748t;

    public C1992D(int i3, int i10, q1.j jVar, C1558s c1558s, K.i iVar) {
        this.f23735f = iVar;
        this.f23730a = i3;
        this.f23731b = i10;
        this.f23736g = jVar;
        if (i3 == 1 || i3 == 2) {
            this.f23732c = Collections.singletonList(c1558s);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f23732c = arrayList;
            arrayList.add(c1558s);
        }
        this.f23733d = new C1553n(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f23738i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f23737h = sparseArray;
        this.f23734e = new SparseIntArray();
        this.f23739k = new y(1);
        this.f23741m = T0.q.f7042N;
        this.f23748t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (InterfaceC1995G) sparseArray2.valueAt(i11));
        }
        C1590a c1590a = new C1590a();
        c1590a.f20575b = this;
        c1590a.f20574a = new J(new byte[4], 4);
        sparseArray.put(0, new C1991C(c1590a));
        this.f23746r = null;
    }

    @Override // T0.o
    public final void b(long j, long j3) {
        Y0.b bVar;
        long j10;
        AbstractC1550k.g(this.f23730a != 2);
        List list = this.f23732c;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1558s c1558s = (C1558s) list.get(i3);
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
        }
        if (j3 != 0 && (bVar = this.f23740l) != null) {
            bVar.d(j3);
        }
        this.f23733d.D(0);
        this.f23734e.clear();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f23737h;
            if (i10 >= sparseArray.size()) {
                this.f23747s = 0;
                return;
            } else {
                ((InterfaceC1995G) sparseArray.valueAt(i10)).a();
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // T0.o
    public final int c(T0.p pVar, T0.s sVar) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        long j;
        long j3;
        long j10 = ((T0.l) pVar).f7029c;
        int i14 = this.f23730a;
        boolean z2 = i14 == 2;
        if (this.f23743o) {
            y yVar = this.f23739k;
            if (j10 != -1 && !z2 && !yVar.f24017d) {
                int i15 = this.f23748t;
                if (i15 <= 0) {
                    yVar.a((T0.l) pVar);
                    return 0;
                }
                boolean z10 = yVar.f24019f;
                C1553n c1553n = yVar.f24016c;
                if (z10) {
                    if (yVar.f24021h == -9223372036854775807L) {
                        yVar.a((T0.l) pVar);
                        return 0;
                    }
                    if (yVar.f24018e) {
                        long j11 = yVar.f24020g;
                        if (j11 == -9223372036854775807L) {
                            yVar.a((T0.l) pVar);
                            return 0;
                        }
                        C1558s c1558s = yVar.f24015b;
                        yVar.f24022i = c1558s.c(yVar.f24021h) - c1558s.b(j11);
                        yVar.a((T0.l) pVar);
                        return 0;
                    }
                    T0.l lVar = (T0.l) pVar;
                    int min = (int) Math.min(112800, lVar.f7029c);
                    long j12 = 0;
                    if (lVar.f7030d != j12) {
                        sVar.f7043a = j12;
                        return 1;
                    }
                    c1553n.D(min);
                    lVar.f7032f = 0;
                    lVar.i(c1553n.f20176a, 0, min, false);
                    int i16 = c1553n.f20177b;
                    int i17 = c1553n.f20178c;
                    while (true) {
                        if (i16 >= i17) {
                            j = -9223372036854775807L;
                            break;
                        }
                        if (c1553n.f20176a[i16] == 71) {
                            j = W.a.s(c1553n, i16, i15);
                            if (j != -9223372036854775807L) {
                                break;
                            }
                        }
                        i16++;
                    }
                    yVar.f24020g = j;
                    yVar.f24018e = true;
                    return 0;
                }
                T0.l lVar2 = (T0.l) pVar;
                long j13 = lVar2.f7029c;
                int min2 = (int) Math.min(112800, j13);
                long j14 = j13 - min2;
                if (lVar2.f7030d != j14) {
                    sVar.f7043a = j14;
                    return 1;
                }
                c1553n.D(min2);
                lVar2.f7032f = 0;
                lVar2.i(c1553n.f20176a, 0, min2, false);
                int i18 = c1553n.f20177b;
                int i19 = c1553n.f20178c;
                int i20 = i19 - 188;
                while (true) {
                    if (i20 < i18) {
                        j3 = -9223372036854775807L;
                        break;
                    }
                    byte[] bArr = c1553n.f20176a;
                    int i21 = -4;
                    int i22 = 0;
                    while (true) {
                        if (i21 > 4) {
                            break;
                        }
                        int i23 = (i21 * 188) + i20;
                        if (i23 < i18 || i23 >= i19 || bArr[i23] != 71) {
                            i22 = 0;
                        } else {
                            i22++;
                            if (i22 == 5) {
                                long s10 = W.a.s(c1553n, i20, i15);
                                if (s10 != -9223372036854775807L) {
                                    j3 = s10;
                                    break;
                                }
                            }
                        }
                        i21++;
                    }
                    i20--;
                }
                yVar.f24021h = j3;
                yVar.f24019f = true;
                return 0;
            }
            if (this.f23744p) {
                i10 = i14;
            } else {
                this.f23744p = true;
                long j15 = yVar.f24022i;
                if (j15 != -9223372036854775807L) {
                    i10 = i14;
                    Y0.b bVar = new Y0.b(new C2.i(), new Bc.i(this.f23748t, yVar.f24015b), j15, 1 + j15, 0L, j10, 188L, 940);
                    this.f23740l = bVar;
                    this.f23741m.D(bVar.f8711a);
                } else {
                    i10 = i14;
                    this.f23741m.D(new T0.t(j15));
                }
            }
            if (this.f23745q) {
                this.f23745q = false;
                b(0L, 0L);
                if (((T0.l) pVar).f7030d != 0) {
                    sVar.f7043a = 0L;
                    return 1;
                }
            }
            i3 = 1;
            Y0.b bVar2 = this.f23740l;
            if (bVar2 != null && bVar2.f8713c != null) {
                return bVar2.b((T0.l) pVar, sVar);
            }
        } else {
            i3 = 1;
            i10 = i14;
        }
        C1553n c1553n2 = this.f23733d;
        byte[] bArr2 = c1553n2.f20176a;
        if (9400 - c1553n2.f20177b < 188) {
            int a3 = c1553n2.a();
            if (a3 > 0) {
                System.arraycopy(bArr2, c1553n2.f20177b, bArr2, 0, a3);
            }
            c1553n2.E(a3, bArr2);
        }
        while (true) {
            int a9 = c1553n2.a();
            SparseArray sparseArray = this.f23737h;
            if (a9 >= 188) {
                int i24 = c1553n2.f20177b;
                int i25 = c1553n2.f20178c;
                byte[] bArr3 = c1553n2.f20176a;
                int i26 = i24;
                while (i26 < i25 && bArr3[i26] != 71) {
                    i26++;
                }
                c1553n2.G(i26);
                int i27 = i26 + 188;
                if (i27 > i25) {
                    int i28 = (i26 - i24) + this.f23747s;
                    this.f23747s = i28;
                    i11 = i10;
                    i12 = 2;
                    if (i11 == 2 && i28 > 376) {
                        throw C1406C.a(StubApp.getString2(24859), null);
                    }
                } else {
                    i11 = i10;
                    i12 = 2;
                    this.f23747s = 0;
                }
                int i29 = c1553n2.f20178c;
                if (i27 > i29) {
                    return 0;
                }
                int h2 = c1553n2.h();
                if ((8388608 & h2) != 0) {
                    c1553n2.G(i27);
                    return 0;
                }
                int i30 = (4194304 & h2) != 0 ? i3 : 0;
                int i31 = (2096896 & h2) >> 8;
                int i32 = (h2 & 32) != 0 ? i3 : 0;
                InterfaceC1995G interfaceC1995G = (h2 & 16) != 0 ? (InterfaceC1995G) sparseArray.get(i31) : null;
                if (interfaceC1995G == null) {
                    c1553n2.G(i27);
                    return 0;
                }
                if (i11 != i12) {
                    int i33 = h2 & 15;
                    SparseIntArray sparseIntArray = this.f23734e;
                    i13 = i3;
                    int i34 = sparseIntArray.get(i31, i33 - 1);
                    sparseIntArray.put(i31, i33);
                    if (i34 == i33) {
                        c1553n2.G(i27);
                        return 0;
                    }
                    if (i33 != ((i34 + 1) & 15)) {
                        interfaceC1995G.a();
                    }
                } else {
                    i13 = i3;
                }
                if (i32 != 0) {
                    int u2 = c1553n2.u();
                    i30 |= (c1553n2.u() & 64) != 0 ? i12 : 0;
                    c1553n2.H(u2 - 1);
                }
                boolean z11 = this.f23743o;
                if (i11 == i12 || z11 || !this.j.get(i31, false)) {
                    c1553n2.F(i27);
                    interfaceC1995G.c(i30, c1553n2);
                    c1553n2.F(i29);
                }
                if (i11 != i12 && !z11 && this.f23743o && j10 != -1) {
                    this.f23745q = i13;
                }
                c1553n2.G(i27);
                return 0;
            }
            int i35 = c1553n2.f20178c;
            int read = ((T0.l) pVar).read(bArr2, i35, 9400 - i35);
            if (read == -1) {
                for (int i36 = 0; i36 < sparseArray.size(); i36++) {
                    InterfaceC1995G interfaceC1995G2 = (InterfaceC1995G) sparseArray.valueAt(i36);
                    if (interfaceC1995G2 instanceof x) {
                        x xVar = (x) interfaceC1995G2;
                        if (xVar.f24005c == 3 && xVar.j == -1 && (!z2 || !(xVar.f24003a instanceof k))) {
                            xVar.c(i3, new C1553n());
                        }
                    }
                }
                return -1;
            }
            c1553n2.F(i35 + read);
        }
    }

    @Override // T0.o
    public final void f(T0.q qVar) {
        if ((this.f23731b & 1) == 0) {
            qVar = new a5.c(qVar, this.f23736g);
        }
        this.f23741m = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // T0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(T0.p r7) {
        /*
            r6 = this;
            r0.n r0 = r6.f23733d
            byte[] r0 = r0.f20176a
            T0.l r7 = (T0.l) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.i(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.u(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.C1992D.h(T0.p):boolean");
    }

    @Override // T0.o
    public final void release() {
    }
}
