package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.stub.StubApp;
import java.util.Iterator;
import java.util.Map;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1471d;
import oa.m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class g extends h {

    /* renamed from: b, reason: collision with root package name */
    public static final String f12779b = StubApp.getString2(16194);

    public g(String str, h hVar) {
        super(StubApp.getString2(16194));
        f0(str);
        d0(hVar);
    }

    private Map<String, Object> H() {
        i J10 = J();
        if (J10 != null) {
            return J10.w();
        }
        return null;
    }

    private i J() {
        h F3 = F();
        while (F3 instanceof g) {
            F3 = ((g) F3).F();
        }
        if (F3 instanceof i) {
            return (i) F3;
        }
        return null;
    }

    public l<String> A() {
        oa.j jVar = oa.j.f18443F;
        l<String> lVar = new l<>();
        AbstractC1469b J10 = p().J(jVar);
        if (J10 instanceof oa.j) {
            lVar.a(((oa.j) J10).f18626a, 0);
        }
        if (J10 instanceof C1468a) {
            Iterator it = ((C1468a) J10).f18393a.iterator();
            String str = null;
            while (it.hasNext()) {
                AbstractC1469b abstractC1469b = (AbstractC1469b) it.next();
                if (abstractC1469b instanceof m) {
                    abstractC1469b = ((m) abstractC1469b).f18629a;
                }
                if (abstractC1469b instanceof oa.j) {
                    str = ((oa.j) abstractC1469b).f18626a;
                    lVar.a(str, 0);
                } else if (abstractC1469b instanceof oa.i) {
                    lVar.f(str, (int) ((oa.i) abstractC1469b).f18416a);
                }
            }
        }
        return lVar;
    }

    public String B() {
        return p().R(oa.j.f18420A1);
    }

    public String C() {
        return p().R(oa.j.f18504U0);
    }

    public String D() {
        return p().R(oa.j.f18484O1);
    }

    public sa.d E() {
        AbstractC1469b J10 = p().J(oa.j.f18459I2);
        if (J10 instanceof C1471d) {
            return new sa.d((C1471d) J10);
        }
        return null;
    }

    public h F() {
        AbstractC1469b J10 = p().J(oa.j.f18421A2);
        if (J10 instanceof C1471d) {
            return h.d((C1471d) J10);
        }
        return null;
    }

    public int G() {
        return p().N(oa.j.f18481N2, null, 0);
    }

    public String I() {
        String K10 = K();
        if (H().containsKey(K10)) {
            Object obj = H().get(K10);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return K10;
    }

    public String K() {
        return p().Q(oa.j.f18519Y2);
    }

    public String L() {
        return p().R(oa.j.f18585q3);
    }

    public void M() {
        e0(G() + 1);
    }

    public void N(d dVar, Object obj) {
        l(dVar, obj);
    }

    public void O(e eVar, Object obj) {
        l(eVar, obj);
    }

    public void P(oa.i iVar, Object obj) {
        k(iVar, obj);
    }

    public void Q(a aVar) {
        oa.j jVar = oa.j.f18535e;
        AbstractC1469b J10 = p().J(jVar);
        if (J10 instanceof C1468a) {
            C1468a c1468a = (C1468a) J10;
            c1468a.I(aVar.p());
            if (c1468a.f18393a.size() == 2 && c1468a.F(1, -1) == 0) {
                p().V(jVar, c1468a.G(0));
            }
        } else {
            if (J10 instanceof m) {
                J10 = ((m) J10).f18629a;
            }
            if (aVar.p().equals(J10)) {
                p().S(jVar);
            }
        }
        aVar.l(null);
    }

    public void R(String str) {
        if (str == null) {
            return;
        }
        oa.j jVar = oa.j.f18443F;
        AbstractC1469b J10 = p().J(jVar);
        oa.j a3 = oa.j.a(str);
        if (!(J10 instanceof C1468a)) {
            if (J10 instanceof m) {
                J10 = ((m) J10).f18629a;
            }
            if (a3.equals(J10)) {
                p().S(jVar);
                return;
            }
            return;
        }
        C1468a c1468a = (C1468a) J10;
        c1468a.I(a3);
        if (c1468a.f18393a.size() == 2 && c1468a.F(1, -1) == 0) {
            p().V(jVar, c1468a.G(0));
        }
    }

    public void S(d dVar) {
        o(dVar);
    }

    public void T(e eVar) {
        o(eVar);
    }

    public void U(oa.i iVar) {
        n(iVar);
    }

    public void V(String str) {
        p().Y(oa.j.f18539f, str);
    }

    public void W(String str) {
        p().Y(oa.j.f18554k, str);
    }

    public void X(l<a> lVar) {
        oa.j jVar = oa.j.f18535e;
        if (lVar.g() == 1 && lVar.d(0) == 0) {
            a b2 = lVar.b(0);
            b2.l(this);
            p().W(jVar, b2);
            return;
        }
        C1468a c1468a = new C1468a();
        for (int i3 = 0; i3 < lVar.g(); i3++) {
            a b10 = lVar.b(i3);
            b10.l(this);
            int d8 = lVar.d(i3);
            if (d8 < 0) {
                throw new IllegalArgumentException(StubApp.getString2(16195));
            }
            c1468a.f18393a.add(b10.p());
            c1468a.a(oa.i.H(d8));
        }
        p().V(jVar, c1468a);
    }

    public void Y(l<String> lVar) {
        if (lVar == null) {
            return;
        }
        oa.j jVar = oa.j.f18443F;
        if (lVar.g() == 1 && lVar.d(0) == 0) {
            p().X(jVar, lVar.b(0));
            return;
        }
        C1468a c1468a = new C1468a();
        for (int i3 = 0; i3 < lVar.g(); i3++) {
            String b2 = lVar.b(i3);
            int d8 = lVar.d(i3);
            if (d8 < 0) {
                throw new IllegalArgumentException(StubApp.getString2(16195));
            }
            c1468a.a(oa.j.a(b2));
            c1468a.a(oa.i.H(d8));
        }
        p().V(jVar, c1468a);
    }

    public void Z(String str) {
        p().Y(oa.j.f18420A1, str);
    }

    public void a0(String str) {
        p().Y(oa.j.f18504U0, str);
    }

    public void b0(String str) {
        p().Y(oa.j.f18484O1, str);
    }

    public void c0(sa.d dVar) {
        p().W(oa.j.f18459I2, dVar);
    }

    public final void d0(h hVar) {
        p().W(oa.j.f18421A2, hVar);
    }

    public void e0(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(16195));
        }
        p().U(oa.j.f18481N2, i3);
    }

    public final void f0(String str) {
        p().X(oa.j.f18519Y2, str);
    }

    public void g0(String str) {
        p().Y(oa.j.f18585q3, str);
    }

    public void r(a aVar) {
        C1468a c1468a;
        oa.j jVar = oa.j.f18535e;
        aVar.l(this);
        AbstractC1469b J10 = p().J(jVar);
        if (J10 instanceof C1468a) {
            c1468a = (C1468a) J10;
        } else {
            C1468a c1468a2 = new C1468a();
            if (J10 != null) {
                c1468a2.a(J10);
                c1468a2.a(oa.i.H(0L));
            }
            c1468a = c1468a2;
        }
        p().V(jVar, c1468a);
        c1468a.f18393a.add(aVar.p());
        c1468a.a(oa.i.H(G()));
    }

    public void s(String str) {
        C1468a c1468a;
        if (str == null) {
            return;
        }
        oa.j jVar = oa.j.f18443F;
        AbstractC1469b J10 = p().J(jVar);
        if (J10 instanceof C1468a) {
            c1468a = (C1468a) J10;
        } else {
            C1468a c1468a2 = new C1468a();
            if (J10 != null) {
                c1468a2.a(J10);
                c1468a2.a(oa.i.H(0L));
            }
            c1468a = c1468a2;
        }
        p().V(jVar, c1468a);
        c1468a.a(oa.j.a(str));
        c1468a.a(oa.i.H(G()));
    }

    public void t(d dVar) {
        c(dVar);
    }

    public void u(e eVar) {
        c(eVar);
    }

    public void v(com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.a aVar) {
        if (aVar == null) {
            return;
        }
        b(oa.i.H(aVar.j()));
    }

    public void w(a aVar) {
        oa.j jVar = oa.j.f18535e;
        AbstractC1469b J10 = p().J(jVar);
        if (!(J10 instanceof C1468a)) {
            C1468a c1468a = new C1468a();
            c1468a.a(J10);
            c1468a.a(oa.i.H(G()));
            p().V(jVar, c1468a);
            return;
        }
        C1468a c1468a2 = (C1468a) J10;
        for (int i3 = 0; i3 < c1468a2.f18393a.size(); i3++) {
            if (c1468a2.G(i3).equals(aVar.p())) {
                int i10 = i3 + 1;
                if (c1468a2.d(i10) instanceof oa.i) {
                    c1468a2.J(i10, oa.i.H(G()));
                }
            }
        }
    }

    public String x() {
        return p().R(oa.j.f18539f);
    }

    public String y() {
        return p().R(oa.j.f18554k);
    }

    public l<a> z() {
        l<a> lVar = new l<>();
        AbstractC1469b J10 = p().J(oa.j.f18535e);
        if (J10 instanceof C1468a) {
            Iterator it = ((C1468a) J10).f18393a.iterator();
            a aVar = null;
            while (it.hasNext()) {
                AbstractC1469b abstractC1469b = (AbstractC1469b) it.next();
                if (abstractC1469b instanceof m) {
                    abstractC1469b = ((m) abstractC1469b).f18629a;
                }
                if (abstractC1469b instanceof C1471d) {
                    aVar = a.d((C1471d) abstractC1469b);
                    aVar.l(this);
                    lVar.a(aVar, 0);
                } else if (abstractC1469b instanceof oa.i) {
                    lVar.f(aVar, ((oa.l) abstractC1469b).F());
                }
            }
        }
        if (J10 instanceof C1471d) {
            a d8 = a.d((C1471d) J10);
            d8.l(this);
            lVar.a(d8, 0);
        }
        return lVar;
    }

    public g(C1471d c1471d) {
        super(c1471d);
    }
}
