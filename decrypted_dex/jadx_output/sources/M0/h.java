package M0;

import L0.B;
import L0.C0123t;
import L0.Y;
import L0.Z;
import L0.a0;
import L0.b0;
import P0.o;
import Z9.C;
import Z9.q;
import aa.C0398e;
import android.net.Uri;
import com.stub.StubApp;
import i2.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0.AbstractC1405B;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import t0.C1725y;
import v0.C1803F;
import v0.I;
import y0.C1964b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements Z, b0, P0.j, P0.m {

    /* renamed from: A, reason: collision with root package name */
    public boolean f4468A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4469B;

    /* renamed from: a, reason: collision with root package name */
    public final int f4470a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4471b;

    /* renamed from: c, reason: collision with root package name */
    public final C1438m[] f4472c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f4473d;

    /* renamed from: e, reason: collision with root package name */
    public final i f4474e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4475f;

    /* renamed from: g, reason: collision with root package name */
    public final A0.f f4476g;

    /* renamed from: h, reason: collision with root package name */
    public final I4.e f4477h;
    public final o j;

    /* renamed from: k, reason: collision with root package name */
    public final C0398e f4478k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4479l;

    /* renamed from: m, reason: collision with root package name */
    public final List f4480m;

    /* renamed from: n, reason: collision with root package name */
    public final Y f4481n;

    /* renamed from: p, reason: collision with root package name */
    public final Y[] f4482p;

    /* renamed from: q, reason: collision with root package name */
    public final C f4483q;

    /* renamed from: r, reason: collision with root package name */
    public e f4484r;

    /* renamed from: s, reason: collision with root package name */
    public C1438m f4485s;

    /* renamed from: t, reason: collision with root package name */
    public C1964b f4486t;

    /* renamed from: v, reason: collision with root package name */
    public long f4487v;

    /* renamed from: w, reason: collision with root package name */
    public long f4488w;

    /* renamed from: x, reason: collision with root package name */
    public int f4489x;

    /* renamed from: y, reason: collision with root package name */
    public a f4490y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4491z;

    public h(int i3, int[] iArr, C1438m[] c1438mArr, i iVar, a0 a0Var, P0.e eVar, long j, A0.j jVar, A0.f fVar, I4.e eVar2, A0.f fVar2, boolean z2) {
        this.f4470a = i3;
        int i10 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f4471b = iArr;
        this.f4472c = c1438mArr == null ? new C1438m[0] : c1438mArr;
        this.f4474e = iVar;
        this.f4475f = a0Var;
        this.f4476g = fVar2;
        this.f4477h = eVar2;
        this.f4491z = z2;
        this.j = new o(StubApp.getString2(3478));
        this.f4478k = new C0398e();
        ArrayList arrayList = new ArrayList();
        this.f4479l = arrayList;
        this.f4480m = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f4482p = new Y[length];
        this.f4473d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        Y[] yArr = new Y[i11];
        jVar.getClass();
        Y y10 = new Y(eVar, jVar, fVar);
        this.f4481n = y10;
        iArr2[0] = i3;
        yArr[0] = y10;
        while (i10 < length) {
            Y y11 = new Y(eVar, null, null);
            this.f4482p[i10] = y11;
            int i12 = i10 + 1;
            yArr[i12] = y11;
            iArr2[i12] = this.f4471b[i10];
            i10 = i12;
        }
        this.f4483q = new C(17, iArr2, yArr);
        this.f4487v = j;
        this.f4488w = j;
    }

    public final int A(int i3, int i10) {
        ArrayList arrayList;
        do {
            i10++;
            arrayList = this.f4479l;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i10)).c(0) <= i3);
        return i10 - 1;
    }

    public final void B(C1964b c1964b) {
        this.f4486t = c1964b;
        Y y10 = this.f4481n;
        y10.g();
        q qVar = y10.f4021h;
        if (qVar != null) {
            qVar.I(y10.f4018e);
            y10.f4021h = null;
            y10.f4020g = null;
        }
        for (Y y11 : this.f4482p) {
            y11.g();
            q qVar2 = y11.f4021h;
            if (qVar2 != null) {
                qVar2.I(y11.f4018e);
                y11.f4021h = null;
                y11.f4020g = null;
            }
        }
        this.j.e(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0036, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(long r11) {
        /*
            r10 = this;
            r10.f4488w = r11
            r0 = 0
            r10.f4491z = r0
            boolean r1 = r10.y()
            if (r1 == 0) goto Le
            r10.f4487v = r11
            return
        Le:
            r1 = r0
        Lf:
            java.util.ArrayList r2 = r10.f4479l
            int r3 = r2.size()
            r4 = 0
            if (r1 >= r3) goto L36
            java.lang.Object r3 = r2.get(r1)
            M0.a r3 = (M0.a) r3
            long r5 = r3.f4461g
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 != 0) goto L30
            long r6 = r3.f4432l
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L30
            goto L37
        L30:
            if (r5 <= 0) goto L33
            goto L36
        L33:
            int r1 = r1 + 1
            goto Lf
        L36:
            r3 = r4
        L37:
            L0.Y r1 = r10.f4481n
            r5 = 1
            if (r3 == 0) goto L45
            int r3 = r3.c(r0)
            boolean r3 = r1.z(r3)
            goto L54
        L45:
            long r6 = r10.f()
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L4f
            r3 = r5
            goto L50
        L4f:
            r3 = r0
        L50:
            boolean r3 = r1.A(r11, r3)
        L54:
            L0.Y[] r6 = r10.f4482p
            if (r3 == 0) goto L6d
            int r1 = r1.n()
            int r1 = r10.A(r1, r0)
            r10.f4489x = r1
            int r1 = r6.length
        L63:
            if (r0 >= r1) goto La1
            r2 = r6[r0]
            r2.A(r11, r5)
            int r0 = r0 + 1
            goto L63
        L6d:
            r10.f4487v = r11
            r10.f4469B = r0
            r2.clear()
            r10.f4489x = r0
            P0.o r11 = r10.j
            boolean r12 = r11.d()
            if (r12 == 0) goto L90
            r1.g()
            int r12 = r6.length
        L82:
            if (r0 >= r12) goto L8c
            r1 = r6[r0]
            r1.g()
            int r0 = r0 + 1
            goto L82
        L8c:
            r11.b()
            return
        L90:
            r11.f5434c = r4
            r1.y(r0)
            int r11 = r6.length
            r12 = r0
        L97:
            if (r12 >= r11) goto La1
            r1 = r6[r12]
            r1.y(r0)
            int r12 = r12 + 1
            goto L97
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.h.C(long):void");
    }

    @Override // L0.Z
    public final void a() {
        o oVar = this.j;
        oVar.a();
        this.f4481n.t();
        if (oVar.d()) {
            return;
        }
        this.f4474e.a();
    }

    @Override // P0.m
    public final void d() {
        this.f4481n.x();
        for (Y y10 : this.f4482p) {
            y10.x();
        }
        this.f4474e.release();
        C1964b c1964b = this.f4486t;
        if (c1964b != null) {
            synchronized (c1964b) {
                y0.l lVar = (y0.l) c1964b.f23350p.remove(this);
                if (lVar != null) {
                    lVar.f23429a.x();
                }
            }
        }
    }

    @Override // L0.b0
    public final long f() {
        if (y()) {
            return this.f4487v;
        }
        if (this.f4469B) {
            return Long.MIN_VALUE;
        }
        return w().f4462h;
    }

    @Override // L0.b0
    public final boolean g(I i3) {
        long j;
        List list;
        if (!this.f4469B) {
            o oVar = this.j;
            if (!oVar.d() && !oVar.c()) {
                boolean y10 = y();
                if (y10) {
                    list = Collections.EMPTY_LIST;
                    j = this.f4487v;
                } else {
                    j = w().f4462h;
                    list = this.f4480m;
                }
                this.f4474e.c(i3, j, list, this.f4478k);
                C0398e c0398e = this.f4478k;
                boolean z2 = c0398e.f9343a;
                e eVar = (e) c0398e.f9344b;
                c0398e.f9344b = null;
                c0398e.f9343a = false;
                if (z2) {
                    this.f4487v = -9223372036854775807L;
                    this.f4469B = true;
                    return true;
                }
                if (eVar != null) {
                    this.f4484r = eVar;
                    boolean z10 = eVar instanceof a;
                    C c10 = this.f4483q;
                    if (z10) {
                        a aVar = (a) eVar;
                        if (y10) {
                            long j3 = this.f4487v;
                            if (aVar.f4461g < j3) {
                                this.f4481n.f4032t = j3;
                                for (Y y11 : this.f4482p) {
                                    y11.f4032t = this.f4487v;
                                }
                                if (this.f4491z) {
                                    C1438m c1438m = aVar.f4458d;
                                    this.f4468A = !AbstractC1405B.a(c1438m.f18216n, c1438m.f18213k);
                                }
                            }
                            this.f4491z = false;
                            this.f4487v = -9223372036854775807L;
                        }
                        aVar.f4434n = c10;
                        Y[] yArr = (Y[]) c10.f9078c;
                        int[] iArr = new int[yArr.length];
                        for (int i10 = 0; i10 < yArr.length; i10++) {
                            Y y12 = yArr[i10];
                            iArr[i10] = y12.f4029q + y12.f4028p;
                        }
                        aVar.f4435p = iArr;
                        this.f4479l.add(aVar);
                    } else if (eVar instanceof k) {
                        ((k) eVar).f4499l = c10;
                    }
                    oVar.f(eVar, this, this.f4477h.t(eVar.f4457c));
                    this.f4476g.h(new C0123t(eVar.f4456b), eVar.f4457c, this.f4470a, eVar.f4458d, eVar.f4459e, eVar.f4460f, eVar.f4461g, eVar.f4462h);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // L0.Z
    public final boolean h() {
        return !y() && this.f4481n.r(this.f4469B);
    }

    @Override // L0.Z
    public final int i(C1803F c1803f, u0.e eVar, int i3) {
        if (y()) {
            return -3;
        }
        a aVar = this.f4490y;
        Y y10 = this.f4481n;
        if (aVar != null && aVar.c(0) <= y10.n()) {
            return -3;
        }
        z();
        return y10.w(c1803f, eVar, i3, this.f4469B);
    }

    public final void l(long j) {
        long j3;
        if (y()) {
            return;
        }
        Y y10 = this.f4481n;
        int i3 = y10.f4029q;
        y10.f(j, true);
        Y y11 = this.f4481n;
        int i10 = y11.f4029q;
        if (i10 > i3) {
            synchronized (y11) {
                j3 = y11.f4028p == 0 ? Long.MIN_VALUE : y11.f4026n[y11.f4030r];
            }
            int i11 = 0;
            while (true) {
                Y[] yArr = this.f4482p;
                if (i11 >= yArr.length) {
                    break;
                }
                yArr[i11].f(j3, this.f4473d[i11]);
                i11++;
            }
        }
        int min = Math.min(A(i10, 0), this.f4489x);
        if (min > 0) {
            AbstractC1560u.O(this.f4479l, 0, min);
            this.f4489x -= min;
        }
    }

    @Override // L0.Z
    public final int m(long j) {
        if (y()) {
            return 0;
        }
        Y y10 = this.f4481n;
        int p8 = y10.p(j, this.f4469B);
        a aVar = this.f4490y;
        if (aVar != null) {
            p8 = Math.min(p8, aVar.c(0) - y10.n());
        }
        y10.B(p8);
        z();
        return p8;
    }

    @Override // L0.b0
    public final boolean n() {
        return this.j.d();
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [L0.a0, java.lang.Object] */
    @Override // P0.j
    public final void o(P0.l lVar, long j, long j3, boolean z2) {
        e eVar = (e) lVar;
        this.f4484r = null;
        this.f4490y = null;
        long j10 = eVar.f4455a;
        C1725y c1725y = eVar.j;
        Uri uri = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j3);
        this.f4477h.getClass();
        this.f4476g.c(c0123t, eVar.f4457c, this.f4470a, eVar.f4458d, eVar.f4459e, eVar.f4460f, eVar.f4461g, eVar.f4462h);
        if (z2) {
            return;
        }
        if (y()) {
            this.f4481n.y(false);
            for (Y y10 : this.f4482p) {
                y10.y(false);
            }
        } else if (eVar instanceof a) {
            ArrayList arrayList = this.f4479l;
            q(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f4487v = this.f4488w;
            }
        }
        this.f4475f.h(this);
    }

    public final a q(int i3) {
        ArrayList arrayList = this.f4479l;
        a aVar = (a) arrayList.get(i3);
        AbstractC1560u.O(arrayList, i3, arrayList.size());
        this.f4489x = Math.max(this.f4489x, arrayList.size());
        int i10 = 0;
        this.f4481n.i(aVar.c(0));
        while (true) {
            Y[] yArr = this.f4482p;
            if (i10 >= yArr.length) {
                return aVar;
            }
            Y y10 = yArr[i10];
            i10++;
            y10.i(aVar.c(i10));
        }
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [L0.a0, java.lang.Object] */
    @Override // P0.j
    public final void r(P0.l lVar, long j, long j3) {
        e eVar = (e) lVar;
        this.f4484r = null;
        this.f4474e.g(eVar);
        long j10 = eVar.f4455a;
        C1725y c1725y = eVar.j;
        Uri uri = c1725y.f21125c;
        C0123t c0123t = new C0123t(c1725y.f21126d, j3);
        this.f4477h.getClass();
        this.f4476g.e(c0123t, eVar.f4457c, this.f4470a, eVar.f4458d, eVar.f4459e, eVar.f4460f, eVar.f4461g, eVar.f4462h);
        this.f4475f.h(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Type inference failed for: r1v4, types: [L0.a0, java.lang.Object] */
    @Override // P0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A1.g t(P0.l r22, long r23, long r25, java.io.IOException r27, int r28) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            M0.e r1 = (M0.e) r1
            t0.y r2 = r1.j
            long r2 = r2.f21124b
            boolean r4 = r1 instanceof M0.a
            java.util.ArrayList r5 = r0.f4479l
            int r6 = r5.size()
            r7 = 1
            int r6 = r6 - r7
            r8 = 0
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L26
            if (r4 == 0) goto L26
            boolean r2 = r0.x(r6)
            if (r2 != 0) goto L24
            goto L26
        L24:
            r2 = r3
            goto L27
        L26:
            r2 = r7
        L27:
            L0.t r9 = new L0.t
            t0.y r8 = r1.j
            android.net.Uri r10 = r8.f21125c
            java.util.Map r8 = r8.f21126d
            r10 = r25
            r9.<init>(r8, r10)
            long r10 = r1.f4461g
            r0.AbstractC1560u.V(r10)
            long r10 = r1.f4462h
            r0.AbstractC1560u.V(r10)
            E0.x r8 = new E0.x
            r10 = r27
            r11 = r28
            r8.<init>(r10, r11)
            M0.i r11 = r0.f4474e
            I4.e r12 = r0.f4477h
            boolean r11 = r11.e(r1, r2, r8, r12)
            r13 = 0
            if (r11 == 0) goto L7f
            if (r2 == 0) goto L6e
            if (r4 == 0) goto L6b
            M0.a r2 = r0.q(r6)
            if (r2 != r1) goto L5d
            goto L5e
        L5d:
            r7 = r3
        L5e:
            r0.AbstractC1550k.g(r7)
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L6b
            long r4 = r0.f4488w
            r0.f4487v = r4
        L6b:
            A1.g r2 = P0.o.f5430e
            goto L80
        L6e:
            r2 = 3478(0xd96, float:4.874E-42)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r4 = 3479(0xd97, float:4.875E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            r0.AbstractC1550k.w(r2, r4)
        L7f:
            r2 = r13
        L80:
            if (r2 != 0) goto L9b
            r12.getClass()
            long r4 = I4.e.u(r8)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L99
            A1.g r2 = new A1.g
            r6 = 0
            r2.<init>(r6, r4, r3)
            goto L9b
        L99:
            A1.g r2 = P0.o.f5431f
        L9b:
            boolean r3 = r2.a()
            r20 = r3 ^ 1
            A0.f r8 = r0.f4476g
            long r4 = r1.f4461g
            long r6 = r1.f4462h
            int r10 = r1.f4457c
            int r11 = r0.f4470a
            r14 = r12
            o0.m r12 = r1.f4458d
            r15 = r13
            int r13 = r1.f4459e
            java.lang.Object r1 = r1.f4460f
            r16 = r14
            r14 = r1
            r1 = r16
            r17 = r4
            r4 = r15
            r15 = r17
            r19 = r27
            r17 = r6
            r8.f(r9, r10, r11, r12, r13, r14, r15, r17, r19, r20)
            if (r3 != 0) goto Ld0
            r0.f4484r = r4
            r1.getClass()
            java.lang.Object r1 = r0.f4475f
            r1.h(r0)
        Ld0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.h.t(P0.l, long, long, java.io.IOException, int):A1.g");
    }

    @Override // L0.b0
    public final long u() {
        if (this.f4469B) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.f4487v;
        }
        long j = this.f4488w;
        a w10 = w();
        if (!w10.b()) {
            ArrayList arrayList = this.f4479l;
            w10 = arrayList.size() > 1 ? (a) u.j(2, arrayList) : null;
        }
        if (w10 != null) {
            j = Math.max(j, w10.f4462h);
        }
        return Math.max(j, this.f4481n.l());
    }

    @Override // L0.b0
    public final void v(long j) {
        o oVar = this.j;
        if (oVar.c() || y()) {
            return;
        }
        boolean d8 = oVar.d();
        i iVar = this.f4474e;
        ArrayList arrayList = this.f4479l;
        List list = this.f4480m;
        if (d8) {
            e eVar = this.f4484r;
            eVar.getClass();
            boolean z2 = eVar instanceof a;
            if (!(z2 && x(arrayList.size() - 1)) && iVar.d(j, eVar, list)) {
                oVar.b();
                if (z2) {
                    this.f4490y = (a) eVar;
                    return;
                }
                return;
            }
            return;
        }
        int f10 = iVar.f(j, list);
        if (f10 < arrayList.size()) {
            AbstractC1550k.g(!oVar.d());
            int size = arrayList.size();
            while (true) {
                if (f10 >= size) {
                    f10 = -1;
                    break;
                } else if (!x(f10)) {
                    break;
                } else {
                    f10++;
                }
            }
            if (f10 == -1) {
                return;
            }
            long j3 = w().f4462h;
            a q10 = q(f10);
            if (arrayList.isEmpty()) {
                this.f4487v = this.f4488w;
            }
            this.f4469B = false;
            A0.f fVar = this.f4476g;
            I0.g gVar = new I0.g(1, this.f4470a, null, 3, null, AbstractC1560u.V(q10.f4461g), AbstractC1560u.V(j3));
            B b2 = fVar.f33b;
            b2.getClass();
            fVar.a(new C2.e(fVar, b2, gVar, 7));
        }
    }

    public final a w() {
        return (a) u.j(1, this.f4479l);
    }

    public final boolean x(int i3) {
        int n10;
        a aVar = (a) this.f4479l.get(i3);
        if (this.f4481n.n() > aVar.c(0)) {
            return true;
        }
        int i10 = 0;
        do {
            Y[] yArr = this.f4482p;
            if (i10 >= yArr.length) {
                return false;
            }
            n10 = yArr[i10].n();
            i10++;
        } while (n10 <= aVar.c(i10));
        return true;
    }

    public final boolean y() {
        return this.f4487v != -9223372036854775807L;
    }

    public final void z() {
        int A4 = A(this.f4481n.n(), this.f4489x - 1);
        while (true) {
            int i3 = this.f4489x;
            if (i3 > A4) {
                return;
            }
            this.f4489x = i3 + 1;
            a aVar = (a) this.f4479l.get(i3);
            C1438m c1438m = aVar.f4458d;
            if (!c1438m.equals(this.f4485s)) {
                this.f4476g.b(this.f4470a, c1438m, aVar.f4459e, aVar.f4460f, aVar.f4461g);
            }
            this.f4485s = c1438m;
        }
    }
}
