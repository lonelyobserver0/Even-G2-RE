package L0;

import android.net.Uri;
import android.os.Handler;
import com.stub.StubApp;
import g1.C0951b;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
import o0.AbstractC1405B;
import o0.C1404A;
import o0.C1406C;
import o0.C1417N;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import t0.C1725y;
import t0.InterfaceC1708h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Q implements InterfaceC0129z, T0.q, P0.j, P0.m, X {
    public static final Map h0;

    /* renamed from: k0, reason: collision with root package name */
    public static final C1438m f3937k0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f3938A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3939B;

    /* renamed from: C, reason: collision with root package name */
    public D5.B f3940C;

    /* renamed from: D, reason: collision with root package name */
    public T0.B f3941D;

    /* renamed from: E, reason: collision with root package name */
    public long f3942E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3943F;

    /* renamed from: G, reason: collision with root package name */
    public int f3944G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f3945H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f3946I;

    /* renamed from: K, reason: collision with root package name */
    public boolean f3947K;

    /* renamed from: L, reason: collision with root package name */
    public int f3948L;

    /* renamed from: O, reason: collision with root package name */
    public boolean f3949O;

    /* renamed from: P, reason: collision with root package name */
    public long f3950P;

    /* renamed from: R, reason: collision with root package name */
    public long f3951R;

    /* renamed from: T, reason: collision with root package name */
    public boolean f3952T;

    /* renamed from: X, reason: collision with root package name */
    public int f3953X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f3954Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f3955Z;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3956a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1708h f3957b;

    /* renamed from: c, reason: collision with root package name */
    public final A0.j f3958c;

    /* renamed from: d, reason: collision with root package name */
    public final I4.e f3959d;

    /* renamed from: e, reason: collision with root package name */
    public final A0.f f3960e;

    /* renamed from: f, reason: collision with root package name */
    public final A0.f f3961f;

    /* renamed from: g, reason: collision with root package name */
    public final T f3962g;

    /* renamed from: h, reason: collision with root package name */
    public final P0.e f3963h;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3964k;

    /* renamed from: l, reason: collision with root package name */
    public final long f3965l;

    /* renamed from: m, reason: collision with root package name */
    public final P0.o f3966m;

    /* renamed from: n, reason: collision with root package name */
    public final Q2.g f3967n;

    /* renamed from: p, reason: collision with root package name */
    public final R4.b f3968p;

    /* renamed from: q, reason: collision with root package name */
    public final L f3969q;

    /* renamed from: r, reason: collision with root package name */
    public final L f3970r;

    /* renamed from: s, reason: collision with root package name */
    public final Handler f3971s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0128y f3972t;

    /* renamed from: v, reason: collision with root package name */
    public C0951b f3973v;

    /* renamed from: w, reason: collision with root package name */
    public Y[] f3974w;

    /* renamed from: x, reason: collision with root package name */
    public P[] f3975x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3976y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3977z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(3296), StubApp.getString2(878));
        h0 = Collections.unmodifiableMap(hashMap);
        C1437l c1437l = new C1437l();
        c1437l.f18166a = StubApp.getString2(3297);
        c1437l.f18177m = AbstractC1405B.m(StubApp.getString2(2005));
        f3937k0 = new C1438m(c1437l);
    }

    public Q(Uri uri, InterfaceC1708h interfaceC1708h, Q2.g gVar, A0.j jVar, A0.f fVar, I4.e eVar, A0.f fVar2, T t3, P0.e eVar2, int i3, boolean z2, long j, Q0.a aVar) {
        this.f3956a = uri;
        this.f3957b = interfaceC1708h;
        this.f3958c = jVar;
        this.f3961f = fVar;
        this.f3959d = eVar;
        this.f3960e = fVar2;
        this.f3962g = t3;
        this.f3963h = eVar2;
        this.j = i3;
        this.f3964k = z2;
        this.f3966m = aVar != null ? new P0.o(aVar) : new P0.o(StubApp.getString2(3298));
        this.f3967n = gVar;
        this.f3965l = j;
        this.f3968p = new R4.b(5);
        this.f3969q = new L(this, 1);
        this.f3970r = new L(this, 2);
        this.f3971s = AbstractC1560u.m(null);
        this.f3975x = new P[0];
        this.f3974w = new Y[0];
        this.f3951R = -9223372036854775807L;
        this.f3944G = 1;
    }

    public final void A(int i3) {
        h();
        boolean[] zArr = (boolean[]) this.f3940C.f1341b;
        if (this.f3952T && zArr[i3] && !this.f3974w[i3].r(false)) {
            this.f3951R = 0L;
            this.f3952T = false;
            this.f3946I = true;
            this.f3950P = 0L;
            this.f3953X = 0;
            for (Y y10 : this.f3974w) {
                y10.y(false);
            }
            InterfaceC0128y interfaceC0128y = this.f3972t;
            interfaceC0128y.getClass();
            interfaceC0128y.h(this);
        }
    }

    public final T0.H B(P p8) {
        int length = this.f3974w.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (p8.equals(this.f3975x[i3])) {
                return this.f3974w[i3];
            }
        }
        if (this.f3976y) {
            AbstractC1550k.w(StubApp.getString2(3298), StubApp.getString2(3299) + p8.f3935a + StubApp.getString2(3300));
            return new T0.n();
        }
        A0.f fVar = this.f3961f;
        A0.j jVar = this.f3958c;
        jVar.getClass();
        Y y10 = new Y(this.f3963h, jVar, fVar);
        y10.f4019f = this;
        int i10 = length + 1;
        P[] pArr = (P[]) Arrays.copyOf(this.f3975x, i10);
        pArr[length] = p8;
        int i11 = AbstractC1560u.f20190a;
        this.f3975x = pArr;
        Y[] yArr = (Y[]) Arrays.copyOf(this.f3974w, i10);
        yArr[length] = y10;
        this.f3974w = yArr;
        return y10;
    }

    public final void C(T0.B b2) {
        this.f3941D = this.f3973v == null ? b2 : new T0.t(-9223372036854775807L);
        this.f3942E = b2.k();
        boolean z2 = !this.f3949O && b2.k() == -9223372036854775807L;
        this.f3943F = z2;
        this.f3944G = z2 ? 7 : 1;
        if (!this.f3977z) {
            y();
        } else {
            this.f3962g.x(b2.e(), this.f3943F, this.f3942E);
        }
    }

    @Override // T0.q
    public final void D(T0.B b2) {
        this.f3971s.post(new Ab.b(11, this, b2));
    }

    public final void E() {
        N n10 = new N(this, this.f3956a, this.f3957b, this.f3967n, this, this.f3968p);
        if (this.f3977z) {
            AbstractC1550k.g(x());
            long j = this.f3942E;
            if (j != -9223372036854775807L && this.f3951R > j) {
                this.f3954Y = true;
                this.f3951R = -9223372036854775807L;
                return;
            }
            T0.B b2 = this.f3941D;
            b2.getClass();
            long j3 = b2.i(this.f3951R).f6925a.f6929b;
            long j10 = this.f3951R;
            n10.f3926f.f7043a = j3;
            n10.j = j10;
            n10.f3928h = true;
            n10.f3931m = false;
            for (Y y10 : this.f3974w) {
                y10.f4032t = this.f3951R;
            }
            this.f3951R = -9223372036854775807L;
        }
        this.f3953X = i();
        this.f3966m.f(n10, this, this.f3959d.t(this.f3944G));
        this.f3960e.h(new C0123t(n10.f3929k), 1, -1, null, 0, null, n10.j, this.f3942E);
    }

    public final boolean F() {
        return this.f3946I || x();
    }

    @Override // L0.X
    public final void a() {
        this.f3971s.post(this.f3969q);
    }

    @Override // L0.InterfaceC0129z
    public final long b(long j, v0.c0 c0Var) {
        h();
        if (!this.f3941D.e()) {
            return 0L;
        }
        T0.A i3 = this.f3941D.i(j);
        return c0Var.a(j, i3.f6925a.f6928a, i3.f6926b.f6928a);
    }

    @Override // L0.InterfaceC0129z
    public final long c(O0.s[] sVarArr, boolean[] zArr, Z[] zArr2, boolean[] zArr3, long j) {
        O0.s sVar;
        h();
        D5.B b2 = this.f3940C;
        h0 h0Var = (h0) b2.f1340a;
        boolean[] zArr4 = (boolean[]) b2.f1342c;
        int i3 = this.f3948L;
        int i10 = 0;
        for (int i11 = 0; i11 < sVarArr.length; i11++) {
            Z z2 = zArr2[i11];
            if (z2 != null && (sVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((O) z2).f3933a;
                AbstractC1550k.g(zArr4[i12]);
                this.f3948L--;
                zArr4[i12] = false;
                zArr2[i11] = null;
            }
        }
        boolean z10 = !this.f3945H ? j == 0 || this.f3939B : i3 != 0;
        for (int i13 = 0; i13 < sVarArr.length; i13++) {
            if (zArr2[i13] == null && (sVar = sVarArr[i13]) != null) {
                AbstractC1550k.g(sVar.length() == 1);
                AbstractC1550k.g(sVar.i(0) == 0);
                int b10 = h0Var.b(sVar.c());
                AbstractC1550k.g(!zArr4[b10]);
                this.f3948L++;
                zArr4[b10] = true;
                this.f3947K = sVar.n().f18222t | this.f3947K;
                zArr2[i13] = new O(this, b10);
                zArr3[i13] = true;
                if (!z10) {
                    Y y10 = this.f3974w[b10];
                    z10 = (y10.n() == 0 || y10.A(j, true)) ? false : true;
                }
            }
        }
        if (this.f3948L == 0) {
            this.f3952T = false;
            this.f3946I = false;
            this.f3947K = false;
            P0.o oVar = this.f3966m;
            if (oVar.d()) {
                Y[] yArr = this.f3974w;
                int length = yArr.length;
                while (i10 < length) {
                    yArr[i10].g();
                    i10++;
                }
                oVar.b();
            } else {
                this.f3954Y = false;
                for (Y y11 : this.f3974w) {
                    y11.y(false);
                }
            }
        } else if (z10) {
            j = k(j);
            while (i10 < zArr2.length) {
                if (zArr2[i10] != null) {
                    zArr3[i10] = true;
                }
                i10++;
            }
        }
        this.f3945H = true;
        return j;
    }

    @Override // P0.m
    public final void d() {
        for (Y y10 : this.f3974w) {
            y10.x();
        }
        Q2.g gVar = this.f3967n;
        T0.o oVar = (T0.o) gVar.f5712c;
        if (oVar != null) {
            oVar.release();
            gVar.f5712c = null;
        }
        gVar.f5713d = null;
    }

    @Override // L0.InterfaceC0129z
    public final void e(InterfaceC0128y interfaceC0128y, long j) {
        this.f3972t = interfaceC0128y;
        this.f3968p.a();
        E();
    }

    @Override // L0.b0
    public final long f() {
        return u();
    }

    @Override // L0.b0
    public final boolean g(v0.I i3) {
        if (this.f3954Y) {
            return false;
        }
        P0.o oVar = this.f3966m;
        if (oVar.c() || this.f3952T) {
            return false;
        }
        if (this.f3977z && this.f3948L == 0) {
            return false;
        }
        boolean a3 = this.f3968p.a();
        if (oVar.d()) {
            return a3;
        }
        E();
        return true;
    }

    public final void h() {
        AbstractC1550k.g(this.f3977z);
        this.f3940C.getClass();
        this.f3941D.getClass();
    }

    public final int i() {
        int i3 = 0;
        for (Y y10 : this.f3974w) {
            i3 += y10.f4029q + y10.f4028p;
        }
        return i3;
    }

    @Override // L0.InterfaceC0129z
    public final void j() {
        int t3;
        P0.o oVar;
        IOException iOException;
        try {
            t3 = this.f3959d.t(this.f3944G);
            oVar = this.f3966m;
            iOException = oVar.f5434c;
        } catch (IOException e10) {
            if (!this.f3964k) {
                throw e10;
            }
            AbstractC1550k.l(StubApp.getString2(3298), StubApp.getString2(3301), e10);
            this.f3976y = true;
            C(new T0.t(-9223372036854775807L));
        }
        if (iOException != null) {
            throw iOException;
        }
        P0.k kVar = oVar.f5433b;
        if (kVar != null) {
            if (t3 == Integer.MIN_VALUE) {
                t3 = kVar.f5420a;
            }
            IOException iOException2 = kVar.f5424e;
            if (iOException2 != null && kVar.f5425f > t3) {
                throw iOException2;
            }
        }
        if (this.f3954Y && !this.f3977z) {
            throw C1406C.a(StubApp.getString2(479), null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (r3 != false) goto L49;
     */
    @Override // L0.InterfaceC0129z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k(long r10) {
        /*
            r9 = this;
            r9.h()
            D5.B r0 = r9.f3940C
            java.lang.Object r0 = r0.f1341b
            boolean[] r0 = (boolean[]) r0
            T0.B r1 = r9.f3941D
            boolean r1 = r1.e()
            if (r1 == 0) goto L12
            goto L14
        L12:
            r10 = 0
        L14:
            r1 = 0
            r9.f3946I = r1
            long r2 = r9.f3950P
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L20
            r2 = r3
            goto L21
        L20:
            r2 = r1
        L21:
            r9.f3950P = r10
            boolean r4 = r9.x()
            if (r4 == 0) goto L2c
            r9.f3951R = r10
            return r10
        L2c:
            int r4 = r9.f3944G
            r5 = 7
            P0.o r6 = r9.f3966m
            if (r4 == r5) goto L71
            boolean r4 = r9.f3954Y
            if (r4 != 0) goto L3d
            boolean r4 = r6.d()
            if (r4 == 0) goto L71
        L3d:
            L0.Y[] r4 = r9.f3974w
            int r4 = r4.length
            r5 = r1
        L41:
            if (r5 >= r4) goto L6e
            L0.Y[] r7 = r9.f3974w
            r7 = r7[r5]
            int r8 = r7.n()
            if (r8 != 0) goto L50
            if (r2 == 0) goto L50
            goto L6b
        L50:
            boolean r8 = r9.f3939B
            if (r8 == 0) goto L5b
            int r8 = r7.f4029q
            boolean r7 = r7.z(r8)
            goto L5f
        L5b:
            boolean r7 = r7.A(r10, r1)
        L5f:
            if (r7 != 0) goto L6b
            boolean r7 = r0[r5]
            if (r7 != 0) goto L69
            boolean r7 = r9.f3938A
            if (r7 != 0) goto L6b
        L69:
            r3 = r1
            goto L6e
        L6b:
            int r5 = r5 + 1
            goto L41
        L6e:
            if (r3 == 0) goto L71
            goto La1
        L71:
            r9.f3952T = r1
            r9.f3951R = r10
            r9.f3954Y = r1
            r9.f3947K = r1
            boolean r0 = r6.d()
            if (r0 == 0) goto L90
            L0.Y[] r0 = r9.f3974w
            int r2 = r0.length
        L82:
            if (r1 >= r2) goto L8c
            r3 = r0[r1]
            r3.g()
            int r1 = r1 + 1
            goto L82
        L8c:
            r6.b()
            return r10
        L90:
            r0 = 0
            r6.f5434c = r0
            L0.Y[] r0 = r9.f3974w
            int r2 = r0.length
            r3 = r1
        L97:
            if (r3 >= r2) goto La1
            r4 = r0[r3]
            r4.y(r1)
            int r3 = r3 + 1
            goto L97
        La1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.Q.k(long):long");
    }

    @Override // L0.InterfaceC0129z
    public final void l(long j) {
        if (this.f3939B) {
            return;
        }
        h();
        if (x()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f3940C.f1342c;
        int length = this.f3974w.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f3974w[i3].f(j, zArr[i3]);
        }
    }

    public final long m(boolean z2) {
        int i3;
        long j = Long.MIN_VALUE;
        while (i3 < this.f3974w.length) {
            if (!z2) {
                D5.B b2 = this.f3940C;
                b2.getClass();
                i3 = ((boolean[]) b2.f1342c)[i3] ? 0 : i3 + 1;
            }
            j = Math.max(j, this.f3974w[i3].l());
        }
        return j;
    }

    @Override // L0.b0
    public final boolean n() {
        boolean z2;
        if (!this.f3966m.d()) {
            return false;
        }
        R4.b bVar = this.f3968p;
        synchronized (bVar) {
            z2 = bVar.f6177b;
        }
        return z2;
    }

    @Override // P0.j
    public final void o(P0.l lVar, long j, long j3, boolean z2) {
        N n10 = (N) lVar;
        C1725y c1725y = n10.f3922b;
        Uri uri = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j3);
        this.f3959d.getClass();
        this.f3960e.c(c0123t, 1, -1, null, 0, null, n10.j, this.f3942E);
        if (z2) {
            return;
        }
        for (Y y10 : this.f3974w) {
            y10.y(false);
        }
        if (this.f3948L > 0) {
            InterfaceC0128y interfaceC0128y = this.f3972t;
            interfaceC0128y.getClass();
            interfaceC0128y.h(this);
        }
    }

    @Override // L0.InterfaceC0129z
    public final long p() {
        if (this.f3947K) {
            this.f3947K = false;
            return this.f3950P;
        }
        if (!this.f3946I) {
            return -9223372036854775807L;
        }
        if (!this.f3954Y && i() <= this.f3953X) {
            return -9223372036854775807L;
        }
        this.f3946I = false;
        return this.f3950P;
    }

    @Override // T0.q
    public final void q() {
        this.f3976y = true;
        this.f3971s.post(this.f3969q);
    }

    @Override // P0.j
    public final void r(P0.l lVar, long j, long j3) {
        T0.B b2;
        N n10 = (N) lVar;
        if (this.f3942E == -9223372036854775807L && (b2 = this.f3941D) != null) {
            boolean e10 = b2.e();
            long m4 = m(true);
            long j10 = m4 == Long.MIN_VALUE ? 0L : m4 + 10000;
            this.f3942E = j10;
            this.f3962g.x(e10, this.f3943F, j10);
        }
        C1725y c1725y = n10.f3922b;
        Uri uri = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j3);
        this.f3959d.getClass();
        this.f3960e.e(c0123t, 1, -1, null, 0, null, n10.j, this.f3942E);
        this.f3954Y = true;
        InterfaceC0128y interfaceC0128y = this.f3972t;
        interfaceC0128y.getClass();
        interfaceC0128y.h(this);
    }

    @Override // L0.InterfaceC0129z
    public final h0 s() {
        h();
        return (h0) this.f3940C.f1340a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    @Override // P0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A1.g t(P0.l r15, long r16, long r18, java.io.IOException r20, int r21) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.Q.t(P0.l, long, long, java.io.IOException, int):A1.g");
    }

    @Override // L0.b0
    public final long u() {
        long j;
        boolean z2;
        h();
        if (this.f3954Y || this.f3948L == 0) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.f3951R;
        }
        if (this.f3938A) {
            int length = this.f3974w.length;
            j = Long.MAX_VALUE;
            for (int i3 = 0; i3 < length; i3++) {
                D5.B b2 = this.f3940C;
                if (((boolean[]) b2.f1341b)[i3] && ((boolean[]) b2.f1342c)[i3]) {
                    Y y10 = this.f3974w[i3];
                    synchronized (y10) {
                        z2 = y10.f4035w;
                    }
                    if (!z2) {
                        j = Math.min(j, this.f3974w[i3].l());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            j = m(false);
        }
        return j == Long.MIN_VALUE ? this.f3950P : j;
    }

    @Override // L0.b0
    public final void v(long j) {
    }

    @Override // T0.q
    public final T0.H w(int i3, int i10) {
        return B(new P(i3, false));
    }

    public final boolean x() {
        return this.f3951R != -9223372036854775807L;
    }

    public final void y() {
        long j;
        int i3;
        if (this.f3955Z || this.f3977z || !this.f3976y || this.f3941D == null) {
            return;
        }
        for (Y y10 : this.f3974w) {
            if (y10.q() == null) {
                return;
            }
        }
        R4.b bVar = this.f3968p;
        synchronized (bVar) {
            bVar.f6177b = false;
        }
        int length = this.f3974w.length;
        C1417N[] c1417nArr = new C1417N[length];
        boolean[] zArr = new boolean[length];
        int i10 = 0;
        while (true) {
            j = this.f3965l;
            if (i10 >= length) {
                break;
            }
            C1438m q10 = this.f3974w[i10].q();
            q10.getClass();
            String str = q10.f18216n;
            boolean i11 = AbstractC1405B.i(str);
            boolean z2 = i11 || AbstractC1405B.l(str);
            zArr[i10] = z2;
            this.f3938A = z2 | this.f3938A;
            this.f3939B = j != -9223372036854775807L && length == 1 && AbstractC1405B.j(str);
            C0951b c0951b = this.f3973v;
            if (c0951b != null) {
                if (i11 || this.f3975x[i10].f3936b) {
                    C1404A c1404a = q10.f18214l;
                    C1404A c1404a2 = c1404a == null ? new C1404A(c0951b) : c1404a.d(c0951b);
                    C1437l a3 = q10.a();
                    a3.f18175k = c1404a2;
                    q10 = new C1438m(a3);
                }
                if (i11 && q10.f18211h == -1 && q10.f18212i == -1 && (i3 = c0951b.f14205a) != -1) {
                    C1437l a9 = q10.a();
                    a9.f18173h = i3;
                    q10 = new C1438m(a9);
                }
            }
            int a10 = this.f3958c.a(q10);
            C1437l a11 = q10.a();
            a11.f18165K = a10;
            C1438m c1438m = new C1438m(a11);
            c1417nArr[i10] = new C1417N(Integer.toString(i10), c1438m);
            this.f3947K = c1438m.f18222t | this.f3947K;
            i10++;
        }
        h0 h0Var = new h0(c1417nArr);
        D5.B b2 = new D5.B();
        b2.f1340a = h0Var;
        b2.f1341b = zArr;
        int i12 = h0Var.f4093a;
        b2.f1342c = new boolean[i12];
        b2.f1343d = new boolean[i12];
        this.f3940C = b2;
        if (this.f3939B && this.f3942E == -9223372036854775807L) {
            this.f3942E = j;
            this.f3941D = new M(this, this.f3941D);
        }
        this.f3962g.x(this.f3941D.e(), this.f3943F, this.f3942E);
        this.f3977z = true;
        InterfaceC0128y interfaceC0128y = this.f3972t;
        interfaceC0128y.getClass();
        interfaceC0128y.a(this);
    }

    public final void z(int i3) {
        h();
        D5.B b2 = this.f3940C;
        boolean[] zArr = (boolean[]) b2.f1343d;
        if (zArr[i3]) {
            return;
        }
        C1438m c1438m = ((h0) b2.f1340a).a(i3).f18070d[0];
        this.f3960e.b(AbstractC1405B.h(c1438m.f18216n), c1438m, 0, null, this.f3950P);
        zArr[i3] = true;
    }
}
