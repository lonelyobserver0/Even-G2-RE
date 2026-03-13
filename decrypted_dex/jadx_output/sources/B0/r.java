package B0;

import E0.x;
import L0.C0106b;
import L0.C0123t;
import L0.X;
import L0.b0;
import L0.h0;
import M4.I;
import T0.B;
import T0.H;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.gms.internal.measurement.K1;
import com.stub.StubApp;
import f5.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o0.AbstractC1405B;
import o0.C1404A;
import o0.C1417N;
import o0.C1435j;
import o0.C1437l;
import o0.C1438m;
import p0.AbstractC1482f;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import t0.C1721u;
import t0.C1725y;
import v0.C1805H;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r implements P0.j, P0.m, b0, T0.q, X {

    /* renamed from: s0, reason: collision with root package name */
    public static final Set f519s0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A, reason: collision with root package name */
    public final HashSet f520A;

    /* renamed from: B, reason: collision with root package name */
    public final SparseIntArray f521B;

    /* renamed from: C, reason: collision with root package name */
    public p f522C;

    /* renamed from: D, reason: collision with root package name */
    public int f523D;

    /* renamed from: E, reason: collision with root package name */
    public int f524E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f525F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f526G;

    /* renamed from: H, reason: collision with root package name */
    public int f527H;

    /* renamed from: I, reason: collision with root package name */
    public C1438m f528I;

    /* renamed from: K, reason: collision with root package name */
    public C1438m f529K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f530L;

    /* renamed from: O, reason: collision with root package name */
    public h0 f531O;

    /* renamed from: P, reason: collision with root package name */
    public Set f532P;

    /* renamed from: R, reason: collision with root package name */
    public int[] f533R;

    /* renamed from: T, reason: collision with root package name */
    public int f534T;

    /* renamed from: X, reason: collision with root package name */
    public boolean f535X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean[] f536Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean[] f537Z;

    /* renamed from: a, reason: collision with root package name */
    public final String f538a;

    /* renamed from: b, reason: collision with root package name */
    public final int f539b;

    /* renamed from: c, reason: collision with root package name */
    public final F5.c f540c;

    /* renamed from: d, reason: collision with root package name */
    public final i f541d;

    /* renamed from: e, reason: collision with root package name */
    public final P0.e f542e;

    /* renamed from: f, reason: collision with root package name */
    public final C1438m f543f;

    /* renamed from: g, reason: collision with root package name */
    public final A0.j f544g;

    /* renamed from: h, reason: collision with root package name */
    public final A0.f f545h;
    public long h0;
    public final I4.e j;

    /* renamed from: k, reason: collision with root package name */
    public final P0.o f546k = new P0.o(StubApp.getString2(500));

    /* renamed from: k0, reason: collision with root package name */
    public long f547k0;

    /* renamed from: l, reason: collision with root package name */
    public final A0.f f548l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f549l0;

    /* renamed from: m, reason: collision with root package name */
    public final int f550m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f551m0;

    /* renamed from: n, reason: collision with root package name */
    public final K1 f552n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f553n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f554o0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f555p;

    /* renamed from: p0, reason: collision with root package name */
    public long f556p0;

    /* renamed from: q, reason: collision with root package name */
    public final List f557q;

    /* renamed from: q0, reason: collision with root package name */
    public C1435j f558q0;

    /* renamed from: r, reason: collision with root package name */
    public final n f559r;

    /* renamed from: r0, reason: collision with root package name */
    public j f560r0;

    /* renamed from: s, reason: collision with root package name */
    public final n f561s;

    /* renamed from: t, reason: collision with root package name */
    public final Handler f562t;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f563v;

    /* renamed from: w, reason: collision with root package name */
    public final Map f564w;

    /* renamed from: x, reason: collision with root package name */
    public M0.e f565x;

    /* renamed from: y, reason: collision with root package name */
    public q[] f566y;

    /* renamed from: z, reason: collision with root package name */
    public int[] f567z;

    /* JADX WARN: Type inference failed for: r1v12, types: [B0.n] */
    /* JADX WARN: Type inference failed for: r1v13, types: [B0.n] */
    public r(String str, int i3, F5.c cVar, i iVar, Map map, P0.e eVar, long j, C1438m c1438m, A0.j jVar, A0.f fVar, I4.e eVar2, A0.f fVar2, int i10) {
        this.f538a = str;
        this.f539b = i3;
        this.f540c = cVar;
        this.f541d = iVar;
        this.f564w = map;
        this.f542e = eVar;
        this.f543f = c1438m;
        this.f544g = jVar;
        this.f545h = fVar;
        this.j = eVar2;
        this.f548l = fVar2;
        this.f550m = i10;
        K1 k12 = new K1();
        k12.f11299b = null;
        k12.f11298a = false;
        k12.f11300c = null;
        this.f552n = k12;
        this.f567z = new int[0];
        Set set = f519s0;
        this.f520A = new HashSet(set.size());
        this.f521B = new SparseIntArray(set.size());
        this.f566y = new q[0];
        this.f537Z = new boolean[0];
        this.f536Y = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f555p = arrayList;
        this.f557q = Collections.unmodifiableList(arrayList);
        this.f563v = new ArrayList();
        final int i11 = 0;
        this.f559r = new Runnable(this) { // from class: B0.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f507b;

            {
                this.f507b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f507b.C();
                        break;
                    default:
                        r rVar = this.f507b;
                        rVar.f525F = true;
                        rVar.C();
                        break;
                }
            }
        };
        final int i12 = 1;
        this.f561s = new Runnable(this) { // from class: B0.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f507b;

            {
                this.f507b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f507b.C();
                        break;
                    default:
                        r rVar = this.f507b;
                        rVar.f525F = true;
                        rVar.C();
                        break;
                }
            }
        };
        this.f562t = AbstractC1560u.m(null);
        this.h0 = j;
        this.f547k0 = j;
    }

    public static int A(int i3) {
        if (i3 == 1) {
            return 2;
        }
        if (i3 != 2) {
            return i3 != 3 ? 0 : 1;
        }
        return 3;
    }

    public static T0.n i(int i3, int i10) {
        AbstractC1550k.w(StubApp.getString2(496), StubApp.getString2(501) + i3 + StubApp.getString2(502) + i10);
        return new T0.n();
    }

    public static C1438m x(C1438m c1438m, C1438m c1438m2, boolean z2) {
        String str;
        String str2;
        if (c1438m == null) {
            return c1438m2;
        }
        String str3 = c1438m2.f18216n;
        int h2 = AbstractC1405B.h(str3);
        String str4 = c1438m.f18213k;
        if (AbstractC1560u.s(h2, str4) == 1) {
            str2 = AbstractC1560u.t(h2, str4);
            str = AbstractC1405B.d(str2);
        } else {
            String b2 = AbstractC1405B.b(str4, str3);
            str = str3;
            str2 = b2;
        }
        C1437l a3 = c1438m2.a();
        a3.f18166a = c1438m.f18204a;
        a3.f18167b = c1438m.f18205b;
        a3.f18168c = I.m(c1438m.f18206c);
        a3.f18169d = c1438m.f18207d;
        a3.f18170e = c1438m.f18208e;
        a3.f18171f = c1438m.f18209f;
        a3.f18173h = z2 ? c1438m.f18211h : -1;
        a3.f18174i = z2 ? c1438m.f18212i : -1;
        a3.j = str2;
        if (h2 == 2) {
            a3.f18184t = c1438m.f18223u;
            a3.f18185u = c1438m.f18224v;
            a3.f18186v = c1438m.f18225w;
        }
        if (str != null) {
            a3.f18177m = AbstractC1405B.m(str);
        }
        int i3 = c1438m.f18193C;
        if (i3 != -1 && h2 == 1) {
            a3.f18156B = i3;
        }
        C1404A c1404a = c1438m.f18214l;
        if (c1404a != null) {
            C1404A c1404a2 = c1438m2.f18214l;
            if (c1404a2 != null) {
                c1404a = c1404a2.e(c1404a);
            }
            a3.f18175k = c1404a;
        }
        return new C1438m(a3);
    }

    public final boolean B() {
        return this.f547k0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C() {
        int i3;
        if (!this.f530L && this.f533R == null && this.f525F) {
            int i10 = 0;
            for (q qVar : this.f566y) {
                if (qVar.q() == null) {
                    return;
                }
            }
            h0 h0Var = this.f531O;
            if (h0Var != null) {
                int i11 = h0Var.f4093a;
                int[] iArr = new int[i11];
                this.f533R = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        q[] qVarArr = this.f566y;
                        if (i13 < qVarArr.length) {
                            C1438m q10 = qVarArr[i13].q();
                            AbstractC1550k.h(q10);
                            C1438m c1438m = this.f531O.a(i12).f18070d[0];
                            String str = c1438m.f18216n;
                            String str2 = q10.f18216n;
                            int h2 = AbstractC1405B.h(str2);
                            if (h2 == 3) {
                                int i14 = AbstractC1560u.f20190a;
                                if (Objects.equals(str2, str)) {
                                    if ((!StubApp.getString2(467).equals(str2) && !StubApp.getString2(503).equals(str2)) || q10.f18198H == c1438m.f18198H) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i13++;
                            } else if (h2 == AbstractC1405B.h(str)) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    this.f533R[i12] = i13;
                }
                Iterator it = this.f563v.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).b();
                }
                return;
            }
            int length = this.f566y.length;
            int i15 = 0;
            int i16 = -1;
            int i17 = -2;
            while (true) {
                if (i15 >= length) {
                    break;
                }
                C1438m q11 = this.f566y[i15].q();
                AbstractC1550k.h(q11);
                String str3 = q11.f18216n;
                int i18 = AbstractC1405B.l(str3) ? 2 : AbstractC1405B.i(str3) ? 1 : AbstractC1405B.k(str3) ? 3 : -2;
                if (A(i18) > A(i17)) {
                    i16 = i15;
                    i17 = i18;
                } else if (i18 == i17 && i16 != -1) {
                    i16 = -1;
                }
                i15++;
            }
            C1417N c1417n = this.f541d.f431h;
            int i19 = c1417n.f18067a;
            this.f534T = -1;
            this.f533R = new int[length];
            for (int i20 = 0; i20 < length; i20++) {
                this.f533R[i20] = i20;
            }
            C1417N[] c1417nArr = new C1417N[length];
            int i21 = 0;
            while (i21 < length) {
                C1438m q12 = this.f566y[i21].q();
                AbstractC1550k.h(q12);
                String str4 = this.f538a;
                C1438m c1438m2 = this.f543f;
                if (i21 == i16) {
                    C1438m[] c1438mArr = new C1438m[i19];
                    for (int i22 = i10; i22 < i19; i22++) {
                        C1438m c1438m3 = c1417n.f18070d[i22];
                        if (i17 == 1 && c1438m2 != null) {
                            c1438m3 = c1438m3.d(c1438m2);
                        }
                        c1438mArr[i22] = i19 == 1 ? q12.d(c1438m3) : x(c1438m3, q12, true);
                    }
                    c1417nArr[i21] = new C1417N(str4, c1438mArr);
                    this.f534T = i21;
                    i3 = 0;
                } else {
                    if (i17 != 2 || !AbstractC1405B.i(q12.f18216n)) {
                        c1438m2 = null;
                    }
                    StringBuilder n10 = AbstractC1482f.n(str4, StubApp.getString2(504));
                    n10.append(i21 < i16 ? i21 : i21 - 1);
                    i3 = 0;
                    c1417nArr[i21] = new C1417N(n10.toString(), x(c1438m2, q12, false));
                }
                i21++;
                i10 = i3;
            }
            int i23 = i10;
            this.f531O = m(c1417nArr);
            AbstractC1550k.g(this.f532P == null ? 1 : i23);
            this.f532P = Collections.EMPTY_SET;
            this.f526G = true;
            this.f540c.l();
        }
    }

    @Override // T0.q
    public final void D(B b2) {
    }

    public final void E() {
        this.f546k.a();
        i iVar = this.f541d;
        C0106b c0106b = iVar.f436n;
        if (c0106b != null) {
            throw c0106b;
        }
        Uri uri = iVar.f437o;
        if (uri == null || !iVar.f441s) {
            return;
        }
        C0.b bVar = (C0.b) iVar.f430g.f911d.get(uri);
        bVar.f897b.a();
        IOException iOException = bVar.f904k;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void F(C1417N[] c1417nArr, int... iArr) {
        this.f531O = m(c1417nArr);
        this.f532P = new HashSet();
        for (int i3 : iArr) {
            this.f532P.add(this.f531O.a(i3));
        }
        this.f534T = 0;
        this.f562t.post(new o(this.f540c, 0));
        this.f526G = true;
    }

    public final void G() {
        for (q qVar : this.f566y) {
            qVar.y(this.f549l0);
        }
        this.f549l0 = false;
    }

    public final boolean H(long j, boolean z2) {
        j jVar;
        boolean z10;
        this.h0 = j;
        if (B()) {
            this.f547k0 = j;
            return true;
        }
        boolean z11 = this.f541d.f438p;
        ArrayList arrayList = this.f555p;
        if (z11) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                jVar = (j) arrayList.get(i3);
                if (jVar.f4461g == j) {
                    break;
                }
            }
        }
        jVar = null;
        if (this.f525F && !z2) {
            int length = this.f566y.length;
            for (int i10 = 0; i10 < length; i10++) {
                q qVar = this.f566y[i10];
                if (!(jVar != null ? qVar.z(jVar.e(i10)) : qVar.A(j, false)) && (this.f537Z[i10] || !this.f535X)) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
            if (z10) {
                return false;
            }
        }
        this.f547k0 = j;
        this.f553n0 = false;
        arrayList.clear();
        P0.o oVar = this.f546k;
        if (!oVar.d()) {
            oVar.f5434c = null;
            G();
            return true;
        }
        if (this.f525F) {
            for (q qVar2 : this.f566y) {
                qVar2.g();
            }
        }
        oVar.b();
        return true;
    }

    @Override // L0.X
    public final void a() {
        this.f562t.post(this.f559r);
    }

    @Override // P0.m
    public final void d() {
        for (q qVar : this.f566y) {
            qVar.x();
        }
    }

    @Override // L0.b0
    public final long f() {
        if (B()) {
            return this.f547k0;
        }
        if (this.f553n0) {
            return Long.MIN_VALUE;
        }
        return z().f4462h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x02de, code lost:
    
        if (r15 < r5.f4462h) goto L154;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x030a  */
    @Override // L0.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(v0.I r62) {
        /*
            Method dump skipped, instructions count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.r.g(v0.I):boolean");
    }

    public final void h() {
        AbstractC1550k.g(this.f526G);
        this.f531O.getClass();
        this.f532P.getClass();
    }

    public final h0 m(C1417N[] c1417nArr) {
        for (int i3 = 0; i3 < c1417nArr.length; i3++) {
            C1417N c1417n = c1417nArr[i3];
            C1438m[] c1438mArr = new C1438m[c1417n.f18067a];
            for (int i10 = 0; i10 < c1417n.f18067a; i10++) {
                C1438m c1438m = c1417n.f18070d[i10];
                int a3 = this.f544g.a(c1438m);
                C1437l a9 = c1438m.a();
                a9.f18165K = a3;
                c1438mArr[i10] = new C1438m(a9);
            }
            c1417nArr[i3] = new C1417N(c1417n.f18068b, c1438mArr);
        }
        return new h0(c1417nArr);
    }

    @Override // L0.b0
    public final boolean n() {
        return this.f546k.d();
    }

    @Override // P0.j
    public final void o(P0.l lVar, long j, long j3, boolean z2) {
        M0.e eVar = (M0.e) lVar;
        this.f565x = null;
        long j10 = eVar.f4455a;
        C1725y c1725y = eVar.j;
        Uri uri = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j3);
        this.j.getClass();
        this.f548l.c(c0123t, eVar.f4457c, this.f539b, eVar.f4458d, eVar.f4459e, eVar.f4460f, eVar.f4461g, eVar.f4462h);
        if (z2) {
            return;
        }
        if (B() || this.f527H == 0) {
            G();
        }
        if (this.f527H > 0) {
            this.f540c.h(this);
        }
    }

    @Override // T0.q
    public final void q() {
        this.f554o0 = true;
        this.f562t.post(this.f561s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // P0.j
    public final void r(P0.l lVar, long j, long j3) {
        M0.e eVar = (M0.e) lVar;
        this.f565x = null;
        i iVar = this.f541d;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            iVar.f435m = eVar2.f414k;
            Uri uri = eVar2.f4456b.f21077a;
            byte[] bArr = eVar2.f416m;
            bArr.getClass();
            s2.d dVar = iVar.j;
            dVar.getClass();
            uri.getClass();
        }
        long j10 = eVar.f4455a;
        C1725y c1725y = eVar.j;
        Uri uri2 = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j3);
        this.j.getClass();
        this.f548l.e(c0123t, eVar.f4457c, this.f539b, eVar.f4458d, eVar.f4459e, eVar.f4460f, eVar.f4461g, eVar.f4462h);
        if (this.f526G) {
            this.f540c.h(this);
            return;
        }
        C1805H c1805h = new C1805H();
        c1805h.f21586a = this.h0;
        g(new v0.I(c1805h));
    }

    @Override // P0.j
    public final A1.g t(P0.l lVar, long j, long j3, IOException iOException, int i3) {
        boolean z2;
        A1.g gVar;
        int i10;
        M0.e eVar = (M0.e) lVar;
        boolean z10 = eVar instanceof j;
        if (z10 && !((j) eVar).f456R && (iOException instanceof C1721u) && ((i10 = ((C1721u) iOException).f21114d) == 410 || i10 == 404)) {
            return P0.o.f5429d;
        }
        long j10 = eVar.j.f21124b;
        C1725y c1725y = eVar.j;
        Uri uri = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j3);
        AbstractC1560u.V(eVar.f4461g);
        AbstractC1560u.V(eVar.f4462h);
        x xVar = new x(iOException, i3);
        i iVar = this.f541d;
        P0.i h2 = u0.h(iVar.f439q);
        this.j.getClass();
        A1.g s10 = I4.e.s(h2, xVar);
        if (s10 == null || s10.f72a != 2) {
            z2 = false;
        } else {
            O0.s sVar = iVar.f439q;
            z2 = sVar.p(sVar.u(iVar.f431h.a(eVar.f4458d)), s10.f73b);
        }
        if (z2) {
            if (z10 && j10 == 0) {
                ArrayList arrayList = this.f555p;
                AbstractC1550k.g(((j) arrayList.remove(arrayList.size() - 1)) == eVar);
                if (arrayList.isEmpty()) {
                    this.f547k0 = this.h0;
                } else {
                    ((j) M4.r.j(arrayList)).f455P = true;
                }
            }
            gVar = P0.o.f5430e;
        } else {
            long u2 = I4.e.u(xVar);
            gVar = u2 != -9223372036854775807L ? new A1.g(false, u2, 0) : P0.o.f5431f;
        }
        A1.g gVar2 = gVar;
        boolean a3 = gVar2.a();
        this.f548l.f(c0123t, eVar.f4457c, this.f539b, eVar.f4458d, eVar.f4459e, eVar.f4460f, eVar.f4461g, eVar.f4462h, iOException, !a3);
        if (!a3) {
            this.f565x = null;
        }
        if (z2) {
            if (!this.f526G) {
                C1805H c1805h = new C1805H();
                c1805h.f21586a = this.h0;
                g(new v0.I(c1805h));
                return gVar2;
            }
            this.f540c.h(this);
        }
        return gVar2;
    }

    @Override // L0.b0
    public final long u() {
        if (this.f553n0) {
            return Long.MIN_VALUE;
        }
        if (B()) {
            return this.f547k0;
        }
        long j = this.h0;
        j z2 = z();
        if (!z2.f453L) {
            ArrayList arrayList = this.f555p;
            z2 = arrayList.size() > 1 ? (j) i2.u.j(2, arrayList) : null;
        }
        if (z2 != null) {
            j = Math.max(j, z2.f4462h);
        }
        if (this.f525F) {
            for (q qVar : this.f566y) {
                j = Math.max(j, qVar.l());
            }
        }
        return j;
    }

    @Override // L0.b0
    public final void v(long j) {
        P0.o oVar = this.f546k;
        if (oVar.c() || B()) {
            return;
        }
        boolean d8 = oVar.d();
        i iVar = this.f541d;
        List list = this.f557q;
        if (d8) {
            this.f565x.getClass();
            if (iVar.f436n != null ? false : iVar.f439q.d(j, this.f565x, list)) {
                oVar.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && iVar.b((j) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            y(size);
        }
        int size2 = (iVar.f436n != null || iVar.f439q.length() < 2) ? list.size() : iVar.f439q.j(j, list);
        if (size2 < this.f555p.size()) {
            y(size2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v15, types: [B0.q[]] */
    /* JADX WARN: Type inference failed for: r2v1, types: [B0.q[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [T0.H] */
    /* JADX WARN: Type inference failed for: r6v4, types: [B0.q, L0.Y] */
    /* JADX WARN: Type inference failed for: r6v5, types: [T0.n] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // T0.q
    public final H w(int i3, int i10) {
        Integer valueOf = Integer.valueOf(i10);
        Set set = f519s0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.f520A;
        SparseIntArray sparseIntArray = this.f521B;
        ?? r62 = 0;
        r62 = 0;
        if (contains) {
            AbstractC1550k.c(set.contains(Integer.valueOf(i10)));
            int i11 = sparseIntArray.get(i10, -1);
            if (i11 != -1) {
                if (hashSet.add(Integer.valueOf(i10))) {
                    this.f567z[i11] = i3;
                }
                r62 = this.f567z[i11] == i3 ? this.f566y[i11] : i(i3, i10);
            }
        } else {
            int i12 = 0;
            while (true) {
                ?? r22 = this.f566y;
                if (i12 >= r22.length) {
                    break;
                }
                if (this.f567z[i12] == i3) {
                    r62 = r22[i12];
                    break;
                }
                i12++;
            }
        }
        if (r62 == 0) {
            if (this.f554o0) {
                return i(i3, i10);
            }
            int length = this.f566y.length;
            boolean z2 = i10 == 1 || i10 == 2;
            r62 = new q(this.f542e, this.f544g, this.f545h, this.f564w);
            r62.f4032t = this.h0;
            if (z2) {
                r62.f518I = this.f558q0;
                r62.f4038z = true;
            }
            long j = this.f556p0;
            if (r62.f4012F != j) {
                r62.f4012F = j;
                r62.f4038z = true;
            }
            if (this.f560r0 != null) {
                r62.f4009C = r2.f457l;
            }
            r62.f4019f = this;
            int i13 = length + 1;
            int[] copyOf = Arrays.copyOf(this.f567z, i13);
            this.f567z = copyOf;
            copyOf[length] = i3;
            q[] qVarArr = this.f566y;
            int i14 = AbstractC1560u.f20190a;
            ?? copyOf2 = Arrays.copyOf(qVarArr, qVarArr.length + 1);
            copyOf2[qVarArr.length] = r62;
            this.f566y = (q[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f537Z, i13);
            this.f537Z = copyOf3;
            copyOf3[length] = z2;
            this.f535X |= z2;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (A(i10) > A(this.f523D)) {
                this.f524E = length;
                this.f523D = i10;
            }
            this.f536Y = Arrays.copyOf(this.f536Y, i13);
        }
        if (i10 != 5) {
            return r62;
        }
        if (this.f522C == null) {
            this.f522C = new p(r62, this.f550m);
        }
        return this.f522C;
    }

    public final void y(int i3) {
        ArrayList arrayList;
        AbstractC1550k.g(!this.f546k.d());
        int i10 = i3;
        loop0: while (true) {
            arrayList = this.f555p;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            int i11 = i10;
            while (true) {
                if (i11 >= arrayList.size()) {
                    j jVar = (j) arrayList.get(i10);
                    for (int i12 = 0; i12 < this.f566y.length; i12++) {
                        if (this.f566y[i12].n() > jVar.e(i12)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((j) arrayList.get(i11)).f460p) {
                    break;
                } else {
                    i11++;
                }
            }
            i10++;
        }
        if (i10 == -1) {
            return;
        }
        long j = z().f4462h;
        j jVar2 = (j) arrayList.get(i10);
        AbstractC1560u.O(arrayList, i10, arrayList.size());
        for (int i13 = 0; i13 < this.f566y.length; i13++) {
            this.f566y[i13].i(jVar2.e(i13));
        }
        if (arrayList.isEmpty()) {
            this.f547k0 = this.h0;
        } else {
            ((j) M4.r.j(arrayList)).f455P = true;
        }
        this.f553n0 = false;
        int i14 = this.f523D;
        long j3 = jVar2.f4461g;
        A0.f fVar = this.f548l;
        I0.g gVar = new I0.g(1, i14, null, 3, null, AbstractC1560u.V(j3), AbstractC1560u.V(j));
        L0.B b2 = fVar.f33b;
        b2.getClass();
        fVar.a(new C2.e(fVar, b2, gVar, 7));
    }

    public final j z() {
        return (j) i2.u.j(1, this.f555p);
    }
}
