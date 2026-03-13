package wa;

import android.util.Log;
import com.stub.StubApp;
import fa.C0935a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1471d;
import oa.C1473f;
import sa.C1608a;
import sa.C1610c;
import ta.C1747g;
import xa.AbstractC1935c;
import xa.C1934b;
import xa.C1936d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class v extends q {

    /* renamed from: p, reason: collision with root package name */
    public sa.f f22272p;

    /* renamed from: q, reason: collision with root package name */
    public C1471d f22273q;

    /* renamed from: r, reason: collision with root package name */
    public Ia.b f22274r;

    /* renamed from: s, reason: collision with root package name */
    public C0935a f22275s;

    /* renamed from: t, reason: collision with root package name */
    public final C1608a f22276t;

    public v(C1471d c1471d, C1608a c1608a) {
        super(c1471d);
        this.f22276t = c1608a;
        u();
    }

    @Override // wa.m, wa.o
    public final Ia.b a() {
        Ia.b bVar;
        if (this.f22274r == null) {
            C1468a F3 = this.f22230a.F(oa.j.f18588r1);
            if (F3 != null) {
                ArrayList arrayList = F3.f18393a;
                if (arrayList.size() == 6) {
                    Iterator it = new ArrayList(arrayList).iterator();
                    while (it.hasNext()) {
                        if (!(((AbstractC1469b) it.next()) instanceof oa.l)) {
                        }
                    }
                    bVar = Ia.b.c(F3);
                    this.f22274r = bVar;
                }
            }
            bVar = m.j;
            this.f22274r = bVar;
        }
        return this.f22274r;
    }

    @Override // wa.o
    public final C0935a b() {
        C0935a c0935a;
        if (this.f22275s == null) {
            oa.j jVar = oa.j.f18560l1;
            C1471d c1471d = this.f22230a;
            AbstractC1469b J10 = c1471d.J(jVar);
            C1747g c1747g = J10 instanceof C1468a ? new C1747g((C1468a) J10) : null;
            if (c1747g == null) {
                Log.w(StubApp.getString2(948), StubApp.getString2(24053));
                c0935a = new C0935a();
            } else {
                C1468a c1468a = c1747g.f21255a;
                if (c1747g.a() == 0.0f && c1747g.b() == 0.0f && c1747g.c() == 0.0f && c1747g.d() == 0.0f) {
                    if (this.f22273q == null) {
                        this.f22273q = c1471d.G(oa.j.f18500T);
                    }
                    C1471d c1471d2 = this.f22273q;
                    if (c1471d2 != null) {
                        Iterator it = c1471d2.f18397a.keySet().iterator();
                        while (it.hasNext()) {
                            AbstractC1469b J11 = c1471d2.J((oa.j) it.next());
                            oa.p pVar = J11 instanceof oa.p ? (oa.p) J11 : null;
                            if (pVar != null) {
                                try {
                                    C1747g f10 = new C1610c(this, pVar).f();
                                    if (f10 != null) {
                                        c1468a.J(0, new C1473f(Math.min(c1747g.a(), f10.a())));
                                        c1468a.J(1, new C1473f(Math.min(c1747g.b(), f10.b())));
                                        c1468a.J(2, new C1473f(Math.max(c1747g.c(), f10.c())));
                                        c1468a.J(3, new C1473f(Math.max(c1747g.d(), f10.d())));
                                    }
                                } catch (IOException unused) {
                                }
                            }
                        }
                    }
                }
                c0935a = new C0935a(c1747g.a(), c1747g.b(), c1747g.c(), c1747g.d());
            }
            this.f22275s = c0935a;
        }
        return this.f22275s;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7 A[ORIG_RETURN, RETURN] */
    @Override // wa.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float c(int r5) {
        /*
            r4 = this;
            xa.c r0 = r4.f22241k
            r1 = 0
            if (r0 == 0) goto L44
            oa.d r0 = r4.f22273q
            oa.d r2 = r4.f22230a
            if (r0 != 0) goto L13
            oa.j r0 = oa.j.f18500T
            oa.d r0 = r2.G(r0)
            r4.f22273q = r0
        L13:
            oa.d r0 = r4.f22273q
            if (r0 != 0) goto L18
            goto L44
        L18:
            xa.c r0 = r4.f22241k
            java.lang.String r5 = r0.c(r5)
            oa.d r0 = r4.f22273q
            if (r0 != 0) goto L2a
            oa.j r0 = oa.j.f18500T
            oa.d r0 = r2.G(r0)
            r4.f22273q = r0
        L2a:
            oa.d r0 = r4.f22273q
            oa.j r5 = oa.j.a(r5)
            oa.b r5 = r0.J(r5)
            boolean r0 = r5 instanceof oa.p
            if (r0 == 0) goto L3b
            oa.p r5 = (oa.p) r5
            goto L3c
        L3b:
            r5 = r1
        L3c:
            if (r5 == 0) goto L44
            sa.c r0 = new sa.c
            r0.<init>(r4, r5)
            goto L45
        L44:
            r0 = r1
        L45:
            if (r0 == 0) goto Ld7
            oa.j r5 = oa.j.f18495R1
            java.lang.Object r2 = r0.f20830c
            oa.p r2 = (oa.p) r2
            r3 = 0
            int r5 = r2.N(r5, r1, r3)
            if (r5 != 0) goto L56
            goto Ld7
        L56:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            ra.f r1 = new ra.f
            r1.<init>(r0)
            java.lang.Object r0 = r1.w()
        L64:
            if (r0 == 0) goto Lca
            boolean r2 = r0 instanceof la.C1251c
            if (r2 == 0) goto Lc0
            la.c r0 = (la.C1251c) r0
            r1 = 24054(0x5df6, float:3.3707E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            java.lang.String r0 = r0.f16837a
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L96
            r1 = 23157(0x5a75, float:3.245E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L89
            goto L96
        L89:
            java.io.IOException r5 = new java.io.IOException
            r0 = 24055(0x5df7, float:3.3708E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r5.<init>(r0)
            throw r5
        L96:
            java.lang.Object r5 = r5.get(r3)
            oa.b r5 = (oa.AbstractC1469b) r5
            boolean r0 = r5 instanceof oa.l
            if (r0 == 0) goto La7
            oa.l r5 = (oa.l) r5
            float r5 = r5.a()
            return r5
        La7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1 = 24056(0x5df8, float:3.371E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        Lc0:
            oa.b r0 = (oa.AbstractC1469b) r0
            r5.add(r0)
            java.lang.Object r0 = r1.w()
            goto L64
        Lca:
            java.io.IOException r5 = new java.io.IOException
            r0 = 24057(0x5df9, float:3.3711E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r5.<init>(r0)
            throw r5
        Ld7:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.v.c(int):float");
    }

    @Override // wa.o
    public final boolean d() {
        return true;
    }

    @Override // wa.m
    public final Ia.e f(int i3) {
        Ia.b a3 = a();
        float k3 = k(i3);
        float[] fArr = a3.f3244a;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        return new Ia.e((f12 * 0.0f) + (f10 * k3) + fArr[6], (0.0f * f13) + (k3 * f11) + fArr[7]);
    }

    @Override // wa.o
    public final String getName() {
        return this.f22230a.Q(oa.j.f18566m2);
    }

    @Override // wa.m
    public final float k(int i3) {
        Float f10;
        oa.j jVar = oa.j.f18540f1;
        C1471d c1471d = this.f22230a;
        int N3 = c1471d.N(jVar, null, -1);
        int N10 = c1471d.N(oa.j.f18488P1, null, -1);
        List l9 = l();
        if (l9.isEmpty() || i3 < N3 || i3 > N10) {
            n nVar = this.f22233d;
            return nVar != null ? nVar.f22238a.M(oa.j.f18545g2, 0.0f) : c(i3);
        }
        int i10 = i3 - N3;
        if (i10 < l9.size() && (f10 = (Float) l9.get(i10)) != null) {
            return f10.floatValue();
        }
        return 0.0f;
    }

    @Override // wa.q, wa.m
    public final boolean m() {
        return false;
    }

    @Override // wa.m
    public final int q(ByteArrayInputStream byteArrayInputStream) {
        return byteArrayInputStream.read();
    }

    @Override // wa.q
    public final void u() {
        AbstractC1469b J10 = this.f22230a.J(oa.j.f18513X0);
        if (J10 instanceof oa.j) {
            oa.j jVar = (oa.j) J10;
            AbstractC1935c b2 = AbstractC1935c.b(jVar);
            this.f22241k = b2;
            if (b2 == null) {
                Log.w(StubApp.getString2(948), StubApp.getString2(6561) + jVar.f18626a);
            }
        } else if (J10 instanceof C1471d) {
            this.f22241k = new C1934b((C1471d) J10);
        }
        this.f22242l = C1936d.f23119d;
    }

    @Override // wa.q
    public final AbstractC1935c v() {
        throw new UnsupportedOperationException(StubApp.getString2(24058));
    }
}
