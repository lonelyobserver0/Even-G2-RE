package B0;

import L0.C0117m;
import L0.InterfaceC0128y;
import L0.InterfaceC0129z;
import L0.h0;
import M4.G;
import M4.I;
import M4.Z;
import android.net.Uri;
import android.util.SparseArray;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import o0.AbstractC1405B;
import o0.C1404A;
import o0.C1406C;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1560u;
import t0.InterfaceC1726z;
import v0.C1805H;
import v0.c0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements InterfaceC0129z, C0.q {

    /* renamed from: a, reason: collision with root package name */
    public final c f470a;

    /* renamed from: b, reason: collision with root package name */
    public final C0.c f471b;

    /* renamed from: c, reason: collision with root package name */
    public final Z9.q f472c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1726z f473d;

    /* renamed from: e, reason: collision with root package name */
    public final A0.j f474e;

    /* renamed from: f, reason: collision with root package name */
    public final A0.f f475f;

    /* renamed from: g, reason: collision with root package name */
    public final I4.e f476g;

    /* renamed from: h, reason: collision with root package name */
    public final A0.f f477h;
    public final P0.e j;

    /* renamed from: k, reason: collision with root package name */
    public final IdentityHashMap f478k;

    /* renamed from: l, reason: collision with root package name */
    public final A0.c f479l;

    /* renamed from: m, reason: collision with root package name */
    public final I4.e f480m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f481n;

    /* renamed from: p, reason: collision with root package name */
    public final int f482p;

    /* renamed from: q, reason: collision with root package name */
    public final w0.j f483q;

    /* renamed from: r, reason: collision with root package name */
    public final F5.c f484r = new F5.c(this, 3);

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0128y f485s;

    /* renamed from: t, reason: collision with root package name */
    public int f486t;

    /* renamed from: v, reason: collision with root package name */
    public h0 f487v;

    /* renamed from: w, reason: collision with root package name */
    public r[] f488w;

    /* renamed from: x, reason: collision with root package name */
    public r[] f489x;

    /* renamed from: y, reason: collision with root package name */
    public int f490y;

    /* renamed from: z, reason: collision with root package name */
    public C0117m f491z;

    public k(c cVar, C0.c cVar2, Z9.q qVar, InterfaceC1726z interfaceC1726z, A0.j jVar, A0.f fVar, I4.e eVar, A0.f fVar2, P0.e eVar2, I4.e eVar3, boolean z2, int i3, w0.j jVar2) {
        this.f470a = cVar;
        this.f471b = cVar2;
        this.f472c = qVar;
        this.f473d = interfaceC1726z;
        this.f474e = jVar;
        this.f475f = fVar;
        this.f476g = eVar;
        this.f477h = fVar2;
        this.j = eVar2;
        this.f480m = eVar3;
        this.f481n = z2;
        this.f482p = i3;
        this.f483q = jVar2;
        eVar3.getClass();
        G g10 = I.f4549b;
        Z z10 = Z.f4578e;
        this.f491z = new C0117m(z10, z10);
        this.f478k = new IdentityHashMap();
        this.f479l = new A0.c(2);
        this.f488w = new r[0];
        this.f489x = new r[0];
    }

    public static C1438m i(C1438m c1438m, C1438m c1438m2, boolean z2) {
        C1404A c1404a;
        int i3;
        String str;
        String str2;
        I i10;
        int i11;
        int i12;
        String str3;
        G g10 = I.f4549b;
        Z z10 = Z.f4578e;
        if (c1438m2 != null) {
            str2 = c1438m2.f18213k;
            c1404a = c1438m2.f18214l;
            i11 = c1438m2.f18193C;
            i3 = c1438m2.f18208e;
            i12 = c1438m2.f18209f;
            str = c1438m2.f18207d;
            str3 = c1438m2.f18205b;
            i10 = c1438m2.f18206c;
        } else {
            String t3 = AbstractC1560u.t(1, c1438m.f18213k);
            c1404a = c1438m.f18214l;
            if (z2) {
                i11 = c1438m.f18193C;
                i3 = c1438m.f18208e;
                i12 = c1438m.f18209f;
                str = c1438m.f18207d;
                str3 = c1438m.f18205b;
                str2 = t3;
                i10 = c1438m.f18206c;
            } else {
                i3 = 0;
                str = null;
                str2 = t3;
                i10 = z10;
                i11 = -1;
                i12 = 0;
                str3 = null;
            }
        }
        String d8 = AbstractC1405B.d(str2);
        int i13 = z2 ? c1438m.f18211h : -1;
        int i14 = z2 ? c1438m.f18212i : -1;
        C1437l c1437l = new C1437l();
        c1437l.f18166a = c1438m.f18204a;
        c1437l.f18167b = str3;
        c1437l.f18168c = I.m(i10);
        c1437l.f18176l = AbstractC1405B.m(c1438m.f18215m);
        c1437l.f18177m = AbstractC1405B.m(d8);
        c1437l.j = str2;
        c1437l.f18175k = c1404a;
        c1437l.f18173h = i13;
        c1437l.f18174i = i14;
        c1437l.f18156B = i11;
        c1437l.f18170e = i3;
        c1437l.f18171f = i12;
        c1437l.f18169d = str;
        return new C1438m(c1437l);
    }

    @Override // C0.q
    public final void a() {
        for (r rVar : this.f488w) {
            ArrayList arrayList = rVar.f555p;
            if (!arrayList.isEmpty()) {
                j jVar = (j) M4.r.j(arrayList);
                int b2 = rVar.f541d.b(jVar);
                if (b2 == 1) {
                    jVar.f456R = true;
                } else if (b2 == 0) {
                    rVar.f562t.post(new Ab.b(1, rVar, jVar));
                } else if (b2 == 2 && !rVar.f553n0) {
                    P0.o oVar = rVar.f546k;
                    if (oVar.d()) {
                        oVar.b();
                    }
                }
            }
        }
        this.f485s.h(this);
    }

    @Override // L0.InterfaceC0129z
    public final long b(long j, c0 c0Var) {
        r[] rVarArr = this.f489x;
        int length = rVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            r rVar = rVarArr[i3];
            if (rVar.f523D == 2) {
                i iVar = rVar.f541d;
                int e10 = iVar.f439q.e();
                Uri[] uriArr = iVar.f428e;
                int length2 = uriArr.length;
                C0.c cVar = iVar.f430g;
                C0.i a3 = (e10 >= length2 || e10 == -1) ? null : cVar.a(true, uriArr[iVar.f439q.l()]);
                if (a3 != null) {
                    I i10 = a3.f956r;
                    if (!i10.isEmpty() && a3.f982c) {
                        long j3 = a3.f947h - cVar.f920p;
                        long j10 = j - j3;
                        int c10 = AbstractC1560u.c(i10, Long.valueOf(j10), true);
                        long j11 = ((C0.f) i10.get(c10)).f932e;
                        return c0Var.a(j10, j11, c10 != i10.size() - 1 ? ((C0.f) i10.get(c10 + 1)).f932e : j11) + j3;
                    }
                }
            } else {
                i3++;
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f3, code lost:
    
        if (r15 == r0[0]) goto L163;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x028b  */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15 */
    @Override // L0.InterfaceC0129z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(O0.s[] r36, boolean[] r37, L0.Z[] r38, boolean[] r39, long r40) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.k.c(O0.s[], boolean[], L0.Z[], boolean[], long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
    
        if ((((C0.b) r9.f430g.f911d.get(r18)) != null ? !C0.b.a(r4, r13) : false) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0056 A[SYNTHETIC] */
    @Override // C0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.net.Uri r18, E0.x r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            B0.r[] r2 = r0.f488w
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto La3
            r8 = r2[r6]
            B0.i r9 = r8.f541d
            android.net.Uri[] r10 = r9.f428e
            boolean r11 = r0.AbstractC1560u.k(r10, r1)
            if (r11 != 0) goto L1e
            r8 = r19
            r4 = 1
            r16 = 1
            goto L9e
        L1e:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r20 != 0) goto L40
            O0.s r13 = r9.f439q
            P0.i r13 = f5.u0.h(r13)
            I4.e r8 = r8.j
            r8.getClass()
            r8 = r19
            A1.g r13 = I4.e.s(r13, r8)
            if (r13 == 0) goto L42
            int r14 = r13.f72a
            r15 = 2
            if (r14 != r15) goto L42
            long r13 = r13.f73b
            goto L43
        L40:
            r8 = r19
        L42:
            r13 = r11
        L43:
            r15 = 0
            r16 = 1
        L46:
            int r4 = r10.length
            r5 = -1
            if (r15 >= r4) goto L56
            r4 = r10[r15]
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L53
            goto L57
        L53:
            int r15 = r15 + 1
            goto L46
        L56:
            r15 = r5
        L57:
            if (r15 != r5) goto L5c
        L59:
            r4 = r16
            goto L94
        L5c:
            O0.s r4 = r9.f439q
            int r4 = r4.u(r15)
            if (r4 != r5) goto L65
            goto L59
        L65:
            boolean r5 = r9.f441s
            android.net.Uri r10 = r9.f437o
            boolean r10 = r1.equals(r10)
            r5 = r5 | r10
            r9.f441s = r5
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 == 0) goto L59
            O0.s r5 = r9.f439q
            boolean r4 = r5.p(r4, r13)
            if (r4 == 0) goto L93
            C0.c r4 = r9.f430g
            java.util.HashMap r4 = r4.f911d
            java.lang.Object r4 = r4.get(r1)
            C0.b r4 = (C0.b) r4
            if (r4 == 0) goto L8f
            boolean r4 = C0.b.a(r4, r13)
            r4 = r4 ^ 1
            goto L90
        L8f:
            r4 = 0
        L90:
            if (r4 == 0) goto L93
            goto L59
        L93:
            r4 = 0
        L94:
            if (r4 == 0) goto L9d
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L9d
            r4 = r16
            goto L9e
        L9d:
            r4 = 0
        L9e:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        La3:
            L0.y r1 = r0.f485s
            r1.h(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.k.d(android.net.Uri, E0.x, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        if (r5[r0] != 1) goto L38;
     */
    @Override // L0.InterfaceC0129z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(L0.InterfaceC0128y r24, long r25) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.k.e(L0.y, long):void");
    }

    @Override // L0.b0
    public final long f() {
        return this.f491z.f();
    }

    @Override // L0.b0
    public final boolean g(v0.I i3) {
        if (this.f487v != null) {
            return this.f491z.g(i3);
        }
        for (r rVar : this.f488w) {
            if (!rVar.f526G) {
                C1805H c1805h = new C1805H();
                c1805h.f21586a = rVar.h0;
                rVar.g(new v0.I(c1805h));
            }
        }
        return false;
    }

    public final r h(String str, int i3, Uri[] uriArr, C1438m[] c1438mArr, C1438m c1438m, List list, Map map, long j) {
        i iVar = new i(this.f470a, this.f471b, uriArr, c1438mArr, this.f472c, this.f473d, this.f479l, list, this.f483q);
        A0.f fVar = this.f477h;
        return new r(str, i3, this.f484r, iVar, map, this.j, j, c1438m, this.f474e, this.f475f, this.f476g, fVar, this.f482p);
    }

    @Override // L0.InterfaceC0129z
    public final void j() {
        for (r rVar : this.f488w) {
            rVar.E();
            if (rVar.f553n0 && !rVar.f526G) {
                throw C1406C.a(StubApp.getString2(479), null);
            }
        }
    }

    @Override // L0.InterfaceC0129z
    public final long k(long j) {
        r[] rVarArr = this.f489x;
        if (rVarArr.length > 0) {
            boolean H2 = rVarArr[0].H(j, false);
            int i3 = 1;
            while (true) {
                r[] rVarArr2 = this.f489x;
                if (i3 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i3].H(j, H2);
                i3++;
            }
            if (H2) {
                ((SparseArray) this.f479l.f29a).clear();
            }
        }
        return j;
    }

    @Override // L0.InterfaceC0129z
    public final void l(long j) {
        for (r rVar : this.f489x) {
            if (rVar.f525F && !rVar.B()) {
                int length = rVar.f566y.length;
                for (int i3 = 0; i3 < length; i3++) {
                    rVar.f566y[i3].f(j, rVar.f536Y[i3]);
                }
            }
        }
    }

    @Override // L0.b0
    public final boolean n() {
        return this.f491z.n();
    }

    @Override // L0.InterfaceC0129z
    public final long p() {
        return -9223372036854775807L;
    }

    @Override // L0.InterfaceC0129z
    public final h0 s() {
        h0 h0Var = this.f487v;
        h0Var.getClass();
        return h0Var;
    }

    @Override // L0.b0
    public final long u() {
        return this.f491z.u();
    }

    @Override // L0.b0
    public final void v(long j) {
        this.f491z.v(j);
    }
}
