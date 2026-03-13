package L0;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import o0.AbstractC1405B;
import o0.C1435j;
import o0.C1437l;
import o0.C1438m;
import o0.InterfaceC1432g;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;
import v0.C1803F;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Y implements T0.H {

    /* renamed from: A, reason: collision with root package name */
    public C1438m f4007A;

    /* renamed from: B, reason: collision with root package name */
    public C1438m f4008B;

    /* renamed from: C, reason: collision with root package name */
    public long f4009C;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4011E;

    /* renamed from: F, reason: collision with root package name */
    public long f4012F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4013G;

    /* renamed from: a, reason: collision with root package name */
    public final V f4014a;

    /* renamed from: d, reason: collision with root package name */
    public final A0.j f4017d;

    /* renamed from: e, reason: collision with root package name */
    public final A0.f f4018e;

    /* renamed from: f, reason: collision with root package name */
    public X f4019f;

    /* renamed from: g, reason: collision with root package name */
    public C1438m f4020g;

    /* renamed from: h, reason: collision with root package name */
    public Z9.q f4021h;

    /* renamed from: p, reason: collision with root package name */
    public int f4028p;

    /* renamed from: q, reason: collision with root package name */
    public int f4029q;

    /* renamed from: r, reason: collision with root package name */
    public int f4030r;

    /* renamed from: s, reason: collision with root package name */
    public int f4031s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4035w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4038z;

    /* renamed from: b, reason: collision with root package name */
    public final D0.g f4015b = new D0.g();

    /* renamed from: i, reason: collision with root package name */
    public int f4022i = 1000;
    public long[] j = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    public long[] f4023k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f4026n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f4025m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f4024l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    public T0.G[] f4027o = new T0.G[1000];

    /* renamed from: c, reason: collision with root package name */
    public final Bc.i f4016c = new Bc.i(new A1.a(21));

    /* renamed from: t, reason: collision with root package name */
    public long f4032t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f4033u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f4034v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4037y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4036x = true;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4010D = true;

    public Y(P0.e eVar, A0.j jVar, A0.f fVar) {
        this.f4017d = jVar;
        this.f4018e = fVar;
        this.f4014a = new V(eVar);
    }

    /* JADX WARN: Finally extract failed */
    public final synchronized boolean A(long j, boolean z2) {
        Throwable th;
        Y y10;
        long j3;
        int j10;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f4031s = 0;
                        V v2 = this.f4014a;
                        v2.f4002e = v2.f4001d;
                        int o5 = o(0);
                        int i3 = this.f4031s;
                        int i10 = this.f4028p;
                        if (!(i3 != i10) || j < this.f4026n[o5] || (j > this.f4034v && !z2)) {
                            return false;
                        }
                        if (this.f4010D) {
                            j10 = i10 - i3;
                            int i11 = 0;
                            while (true) {
                                if (i11 < j10) {
                                    try {
                                        if (this.f4026n[o5] >= j) {
                                            j10 = i11;
                                            break;
                                        }
                                        o5++;
                                        if (o5 == this.f4022i) {
                                            o5 = 0;
                                        }
                                        i11++;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } else if (!z2) {
                                    j10 = -1;
                                }
                            }
                            y10 = this;
                            j3 = j;
                        } else {
                            y10 = this;
                            j3 = j;
                            j10 = y10.j(o5, i10 - i3, j3, true);
                        }
                        if (j10 == -1) {
                            return false;
                        }
                        y10.f4032t = j3;
                        y10.f4031s += j10;
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final synchronized void B(int i3) {
        boolean z2;
        if (i3 >= 0) {
            try {
                if (this.f4031s + i3 <= this.f4028p) {
                    z2 = true;
                    AbstractC1550k.c(z2);
                    this.f4031s += i3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z2 = false;
        AbstractC1550k.c(z2);
        this.f4031s += i3;
    }

    @Override // T0.H
    public final void a(C1553n c1553n, int i3, int i10) {
        while (true) {
            V v2 = this.f4014a;
            if (i3 <= 0) {
                v2.getClass();
                return;
            }
            int c10 = v2.c(i3);
            U u2 = v2.f4003f;
            P0.a aVar = (P0.a) u2.f3996c;
            c1553n.f(((int) (v2.f4004g - u2.f3994a)) + aVar.f5377b, c10, aVar.f5376a);
            i3 -= c10;
            long j = v2.f4004g + c10;
            v2.f4004g = j;
            U u10 = v2.f4003f;
            if (j == u10.f3995b) {
                v2.f4003f = (U) u10.f3997d;
            }
        }
    }

    @Override // T0.H
    public final int b(InterfaceC1432g interfaceC1432g, int i3, boolean z2) {
        V v2 = this.f4014a;
        int c10 = v2.c(i3);
        U u2 = v2.f4003f;
        P0.a aVar = (P0.a) u2.f3996c;
        int read = interfaceC1432g.read(aVar.f5376a, ((int) (v2.f4004g - u2.f3994a)) + aVar.f5377b, c10);
        if (read == -1) {
            if (z2) {
                return -1;
            }
            throw new EOFException();
        }
        long j = v2.f4004g + read;
        v2.f4004g = j;
        U u10 = v2.f4003f;
        if (j == u10.f3995b) {
            v2.f4003f = (U) u10.f3997d;
        }
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0147, code lost:
    
        if (((L0.W) r0.valueAt(r0.size() - 1)).f4005a.equals(r16.f4008B) == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // T0.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r17, int r19, int r20, int r21, T0.G r22) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.Y.c(long, int, int, int, T0.G):void");
    }

    @Override // T0.H
    public final void d(C1438m c1438m) {
        C1438m k3 = k(c1438m);
        boolean z2 = false;
        this.f4038z = false;
        this.f4007A = c1438m;
        synchronized (this) {
            try {
                this.f4037y = false;
                C1438m c1438m2 = this.f4008B;
                int i3 = AbstractC1560u.f20190a;
                if (!Objects.equals(k3, c1438m2)) {
                    if (!(((SparseArray) this.f4016c.f767c).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.f4016c.f767c;
                        if (((W) sparseArray.valueAt(sparseArray.size() - 1)).f4005a.equals(k3)) {
                            SparseArray sparseArray2 = (SparseArray) this.f4016c.f767c;
                            this.f4008B = ((W) sparseArray2.valueAt(sparseArray2.size() - 1)).f4005a;
                            boolean z10 = this.f4010D;
                            C1438m c1438m3 = this.f4008B;
                            this.f4010D = z10 & AbstractC1405B.a(c1438m3.f18216n, c1438m3.f18213k);
                            this.f4011E = false;
                            z2 = true;
                        }
                    }
                    this.f4008B = k3;
                    boolean z102 = this.f4010D;
                    C1438m c1438m32 = this.f4008B;
                    this.f4010D = z102 & AbstractC1405B.a(c1438m32.f18216n, c1438m32.f18213k);
                    this.f4011E = false;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        X x7 = this.f4019f;
        if (x7 == null || !z2) {
            return;
        }
        x7.a();
    }

    public final long e(int i3) {
        this.f4033u = Math.max(this.f4033u, m(i3));
        this.f4028p -= i3;
        int i10 = this.f4029q + i3;
        this.f4029q = i10;
        int i11 = this.f4030r + i3;
        this.f4030r = i11;
        int i12 = this.f4022i;
        if (i11 >= i12) {
            this.f4030r = i11 - i12;
        }
        int i13 = this.f4031s - i3;
        this.f4031s = i13;
        int i14 = 0;
        if (i13 < 0) {
            this.f4031s = 0;
        }
        while (true) {
            Bc.i iVar = this.f4016c;
            SparseArray sparseArray = (SparseArray) iVar.f767c;
            if (i14 >= sparseArray.size() - 1) {
                break;
            }
            int i15 = i14 + 1;
            if (i10 < sparseArray.keyAt(i15)) {
                break;
            }
            ((A1.a) iVar.f768d).accept(sparseArray.valueAt(i14));
            sparseArray.removeAt(i14);
            int i16 = iVar.f766b;
            if (i16 > 0) {
                iVar.f766b = i16 - 1;
            }
            i14 = i15;
        }
        if (this.f4028p != 0) {
            return this.f4023k[this.f4030r];
        }
        int i17 = this.f4030r;
        if (i17 == 0) {
            i17 = this.f4022i;
        }
        return this.f4023k[i17 - 1] + this.f4024l[r7];
    }

    public final void f(long j, boolean z2) {
        Throwable th;
        V v2 = this.f4014a;
        synchronized (this) {
            try {
                try {
                    int i3 = this.f4028p;
                    long j3 = -1;
                    if (i3 != 0) {
                        long[] jArr = this.f4026n;
                        int i10 = this.f4030r;
                        if (j >= jArr[i10]) {
                            if (z2) {
                                try {
                                    int i11 = this.f4031s;
                                    if (i11 != i3) {
                                        i3 = i11 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int j10 = j(i10, i3, j, false);
                            if (j10 != -1) {
                                j3 = e(j10);
                            }
                            v2.b(j3);
                        }
                    }
                    v2.b(j3);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final void g() {
        long e10;
        V v2 = this.f4014a;
        synchronized (this) {
            int i3 = this.f4028p;
            e10 = i3 == 0 ? -1L : e(i3);
        }
        v2.b(e10);
    }

    public final long h(int i3) {
        int i10 = this.f4029q;
        int i11 = this.f4028p;
        int i12 = (i10 + i11) - i3;
        boolean z2 = false;
        AbstractC1550k.c(i12 >= 0 && i12 <= i11 - this.f4031s);
        int i13 = this.f4028p - i12;
        this.f4028p = i13;
        this.f4034v = Math.max(this.f4033u, m(i13));
        if (i12 == 0 && this.f4035w) {
            z2 = true;
        }
        this.f4035w = z2;
        Bc.i iVar = this.f4016c;
        SparseArray sparseArray = (SparseArray) iVar.f767c;
        for (int size = sparseArray.size() - 1; size >= 0 && i3 < sparseArray.keyAt(size); size--) {
            ((A1.a) iVar.f768d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        iVar.f766b = sparseArray.size() > 0 ? Math.min(iVar.f766b, sparseArray.size() - 1) : -1;
        int i14 = this.f4028p;
        if (i14 == 0) {
            return 0L;
        }
        return this.f4023k[o(i14 - 1)] + this.f4024l[r9];
    }

    public final void i(int i3) {
        long h2 = h(i3);
        V v2 = this.f4014a;
        AbstractC1550k.c(h2 <= v2.f4004g);
        v2.f4004g = h2;
        int i10 = v2.f3999b;
        if (h2 != 0) {
            U u2 = v2.f4001d;
            if (h2 != u2.f3994a) {
                while (v2.f4004g > u2.f3995b) {
                    u2 = (U) u2.f3997d;
                }
                U u10 = (U) u2.f3997d;
                u10.getClass();
                v2.a(u10);
                U u11 = new U(u2.f3995b, i10);
                u2.f3997d = u11;
                if (v2.f4004g == u2.f3995b) {
                    u2 = u11;
                }
                v2.f4003f = u2;
                if (v2.f4002e == u10) {
                    v2.f4002e = u11;
                    return;
                }
                return;
            }
        }
        v2.a(v2.f4001d);
        U u12 = new U(v2.f4004g, i10);
        v2.f4001d = u12;
        v2.f4002e = u12;
        v2.f4003f = u12;
    }

    public final int j(int i3, int i10, long j, boolean z2) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j3 = this.f4026n[i3];
            if (j3 > j) {
                break;
            }
            if (!z2 || (this.f4025m[i3] & 1) != 0) {
                if (j3 == j) {
                    return i12;
                }
                i11 = i12;
            }
            i3++;
            if (i3 == this.f4022i) {
                i3 = 0;
            }
        }
        return i11;
    }

    public C1438m k(C1438m c1438m) {
        if (this.f4012F == 0 || c1438m.f18221s == LongCompanionObject.MAX_VALUE) {
            return c1438m;
        }
        C1437l a3 = c1438m.a();
        a3.f18182r = c1438m.f18221s + this.f4012F;
        return new C1438m(a3);
    }

    public final synchronized long l() {
        return this.f4034v;
    }

    public final long m(int i3) {
        long j = Long.MIN_VALUE;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int o5 = o(i3 - 1);
        for (int i10 = 0; i10 < i3; i10++) {
            j = Math.max(j, this.f4026n[o5]);
            if ((this.f4025m[o5] & 1) != 0) {
                return j;
            }
            o5--;
            if (o5 == -1) {
                o5 = this.f4022i - 1;
            }
        }
        return j;
    }

    public final int n() {
        return this.f4029q + this.f4031s;
    }

    public final int o(int i3) {
        int i10 = this.f4030r + i3;
        int i11 = this.f4022i;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public final synchronized int p(long j, boolean z2) {
        try {
            try {
                int o5 = o(this.f4031s);
                int i3 = this.f4031s;
                int i10 = this.f4028p;
                if (!(i3 != i10) || j < this.f4026n[o5]) {
                    return 0;
                }
                if (j > this.f4034v && z2) {
                    return i10 - i3;
                }
                int j3 = j(o5, i10 - i3, j, true);
                if (j3 == -1) {
                    return 0;
                }
                return j3;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized C1438m q() {
        return this.f4037y ? null : this.f4008B;
    }

    public final synchronized boolean r(boolean z2) {
        C1438m c1438m;
        boolean z10 = false;
        if (this.f4031s != this.f4028p) {
            if (((W) this.f4016c.i(n())).f4005a != this.f4020g) {
                return true;
            }
            return s(o(this.f4031s));
        }
        if (z2 || this.f4035w || ((c1438m = this.f4008B) != null && c1438m != this.f4020g)) {
            z10 = true;
        }
        return z10;
    }

    public final boolean s(int i3) {
        Z9.q qVar = this.f4021h;
        if (qVar == null || qVar.A() == 4) {
            return true;
        }
        if ((this.f4025m[i3] & 1073741824) != 0) {
            return false;
        }
        this.f4021h.getClass();
        return false;
    }

    public final void t() {
        Z9.q qVar = this.f4021h;
        if (qVar == null || qVar.A() != 1) {
            return;
        }
        A0.d x7 = this.f4021h.x();
        x7.getClass();
        throw x7;
    }

    public final void u(C1438m c1438m, C1803F c1803f) {
        C1438m c1438m2;
        C1438m c1438m3 = this.f4020g;
        boolean z2 = c1438m3 == null;
        C1435j c1435j = c1438m3 == null ? null : c1438m3.f18220r;
        this.f4020g = c1438m;
        C1435j c1435j2 = c1438m.f18220r;
        A0.j jVar = this.f4017d;
        if (jVar != null) {
            int a3 = jVar.a(c1438m);
            C1437l a9 = c1438m.a();
            a9.f18165K = a3;
            c1438m2 = new C1438m(a9);
        } else {
            c1438m2 = c1438m;
        }
        c1803f.f21582b = c1438m2;
        c1803f.f21581a = this.f4021h;
        if (jVar == null) {
            return;
        }
        if (z2 || !Objects.equals(c1435j, c1435j2)) {
            Z9.q qVar = this.f4021h;
            A0.f fVar = this.f4018e;
            Z9.q b2 = jVar.b(fVar, c1438m);
            this.f4021h = b2;
            c1803f.f21581a = b2;
            if (qVar != null) {
                qVar.I(fVar);
            }
        }
    }

    public final synchronized long v() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.f4031s != this.f4028p ? this.j[o(this.f4031s)] : this.f4009C;
    }

    public final int w(C1803F c1803f, u0.e eVar, int i3, boolean z2) {
        int i10;
        boolean z10 = (i3 & 2) != 0;
        D0.g gVar = this.f4015b;
        synchronized (this) {
            try {
                eVar.f21397f = false;
                i10 = -3;
                if (this.f4031s != this.f4028p) {
                    C1438m c1438m = ((W) this.f4016c.i(n())).f4005a;
                    if (!z10 && c1438m == this.f4020g) {
                        int o5 = o(this.f4031s);
                        if (s(o5)) {
                            eVar.f3376b = this.f4025m[o5];
                            if (this.f4031s == this.f4028p - 1 && (z2 || this.f4035w)) {
                                eVar.a(PKIFailureInfo.duplicateCertReq);
                            }
                            eVar.f21398g = this.f4026n[o5];
                            gVar.f1244a = this.f4024l[o5];
                            gVar.f1245b = this.f4023k[o5];
                            gVar.f1246c = this.f4027o[o5];
                            i10 = -4;
                        } else {
                            eVar.f21397f = true;
                        }
                    }
                    u(c1438m, c1803f);
                    i10 = -5;
                } else {
                    if (!z2 && !this.f4035w) {
                        C1438m c1438m2 = this.f4008B;
                        if (c1438m2 == null || (!z10 && c1438m2 == this.f4020g)) {
                        }
                        u(c1438m2, c1803f);
                        i10 = -5;
                    }
                    eVar.f3376b = 4;
                    eVar.f21398g = Long.MIN_VALUE;
                    i10 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 == -4 && !eVar.k(4)) {
            boolean z11 = (i3 & 1) != 0;
            if ((i3 & 4) == 0) {
                if (z11) {
                    V v2 = this.f4014a;
                    V.f(v2.f4002e, eVar, this.f4015b, v2.f4000c);
                } else {
                    V v8 = this.f4014a;
                    v8.f4002e = V.f(v8.f4002e, eVar, this.f4015b, v8.f4000c);
                }
            }
            if (!z11) {
                this.f4031s++;
            }
        }
        return i10;
    }

    public final void x() {
        y(true);
        Z9.q qVar = this.f4021h;
        if (qVar != null) {
            qVar.I(this.f4018e);
            this.f4021h = null;
            this.f4020g = null;
        }
    }

    public final void y(boolean z2) {
        Bc.i iVar;
        SparseArray sparseArray;
        V v2 = this.f4014a;
        v2.a(v2.f4001d);
        U u2 = v2.f4001d;
        int i3 = 0;
        AbstractC1550k.g(((P0.a) u2.f3996c) == null);
        u2.f3994a = 0L;
        u2.f3995b = v2.f3999b;
        U u10 = v2.f4001d;
        v2.f4002e = u10;
        v2.f4003f = u10;
        v2.f4004g = 0L;
        v2.f3998a.b();
        this.f4028p = 0;
        this.f4029q = 0;
        this.f4030r = 0;
        this.f4031s = 0;
        this.f4036x = true;
        this.f4032t = Long.MIN_VALUE;
        this.f4033u = Long.MIN_VALUE;
        this.f4034v = Long.MIN_VALUE;
        this.f4035w = false;
        while (true) {
            iVar = this.f4016c;
            sparseArray = (SparseArray) iVar.f767c;
            if (i3 >= sparseArray.size()) {
                break;
            }
            ((A1.a) iVar.f768d).accept(sparseArray.valueAt(i3));
            i3++;
        }
        iVar.f766b = -1;
        sparseArray.clear();
        if (z2) {
            this.f4007A = null;
            this.f4008B = null;
            this.f4037y = true;
            this.f4010D = true;
        }
    }

    public final synchronized boolean z(int i3) {
        synchronized (this) {
            this.f4031s = 0;
            V v2 = this.f4014a;
            v2.f4002e = v2.f4001d;
        }
        int i10 = this.f4029q;
        if (i3 >= i10 && i3 <= this.f4028p + i10) {
            this.f4032t = Long.MIN_VALUE;
            this.f4031s = i3 - i10;
            return true;
        }
        return false;
    }
}
