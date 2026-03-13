package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import java.util.ArrayList;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1471d;
import oa.C1473f;
import oa.j;
import oa.l;
import oa.q;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class g extends com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a {

    /* renamed from: c, reason: collision with root package name */
    protected static final float f12901c = -1.0f;

    public g() {
    }

    public void A(String str, String[] strArr) {
        AbstractC1469b I10 = p().I(str);
        C1468a c1468a = new C1468a();
        for (String str2 : strArr) {
            c1468a.a(j.a(str2));
        }
        C1471d p8 = p();
        p8.getClass();
        p8.V(j.a(str), c1468a);
        j(I10, p().I(str));
    }

    public void B(String str, float[] fArr) {
        C1468a c1468a = new C1468a();
        for (float f10 : fArr) {
            c1468a.a(new C1473f(f10));
        }
        AbstractC1469b I10 = p().I(str);
        C1471d p8 = p();
        p8.getClass();
        p8.V(j.a(str), c1468a);
        j(I10, p().I(str));
    }

    public void C(String str, String[] strArr) {
        AbstractC1469b I10 = p().I(str);
        C1468a c1468a = new C1468a();
        for (String str2 : strArr) {
            c1468a.a(new q(str2));
        }
        C1471d p8 = p();
        p8.getClass();
        p8.V(j.a(str), c1468a);
        j(I10, p().I(str));
    }

    public void D(String str, Aa.e eVar) {
        AbstractC1469b I10 = p().I(str);
        C1471d p8 = p();
        p8.getClass();
        p8.W(j.a(str), eVar);
        j(I10, eVar == null ? null : eVar.f253a);
    }

    public void E(String str, c cVar) {
        AbstractC1469b I10 = p().I(str);
        C1471d p8 = p();
        p8.getClass();
        p8.W(j.a(str), cVar);
        j(I10, cVar == null ? null : cVar.p());
    }

    public void F(String str, int i3) {
        AbstractC1469b I10 = p().I(str);
        C1471d p8 = p();
        p8.getClass();
        p8.U(j.a(str), i3);
        j(I10, p().I(str));
    }

    public void G(String str, String str2) {
        AbstractC1469b I10 = p().I(str);
        C1471d p8 = p();
        p8.getClass();
        p8.X(j.a(str), str2);
        j(I10, p().I(str));
    }

    public void H(String str, float f10) {
        AbstractC1469b I10 = p().I(str);
        C1471d p8 = p();
        p8.getClass();
        p8.T(j.a(str), f10);
        j(I10, p().I(str));
    }

    public void I(String str, int i3) {
        AbstractC1469b I10 = p().I(str);
        C1471d p8 = p();
        p8.getClass();
        p8.U(j.a(str), i3);
        j(I10, p().I(str));
    }

    public void J(String str, String str2) {
        AbstractC1469b I10 = p().I(str);
        C1471d p8 = p();
        p8.getClass();
        p8.Y(j.a(str), str2);
        j(I10, p().I(str));
    }

    public String[] m(String str) {
        AbstractC1469b I10 = p().I(str);
        if (!(I10 instanceof C1468a)) {
            return null;
        }
        C1468a c1468a = (C1468a) I10;
        String[] strArr = new String[c1468a.f18393a.size()];
        for (int i3 = 0; i3 < c1468a.f18393a.size(); i3++) {
            strArr[i3] = ((j) c1468a.G(i3)).f18626a;
        }
        return strArr;
    }

    public Aa.e n(String str) {
        C1468a c1468a = (C1468a) p().I(str);
        if (c1468a != null) {
            return new Aa.e(c1468a);
        }
        return null;
    }

    public Object o(String str) {
        C1468a c1468a = (C1468a) p().I(str);
        if (c1468a == null) {
            return null;
        }
        ArrayList arrayList = c1468a.f18393a;
        if (arrayList.size() == 3) {
            return new Aa.e(c1468a);
        }
        if (arrayList.size() == 4) {
            return new c(c1468a);
        }
        return null;
    }

    public int q(String str, int i3) {
        C1471d p8 = p();
        p8.getClass();
        return p8.N(j.a(str), null, i3);
    }

    public String r(String str) {
        C1471d p8 = p();
        p8.getClass();
        return p8.Q(j.a(str));
    }

    public String s(String str, String str2) {
        C1471d p8 = p();
        p8.getClass();
        String Q10 = p8.Q(j.a(str));
        return Q10 == null ? str2 : Q10;
    }

    public Object t(String str, String str2) {
        AbstractC1469b I10 = p().I(str);
        if (!(I10 instanceof C1468a)) {
            return I10 instanceof j ? ((j) I10).f18626a : str2;
        }
        C1468a c1468a = (C1468a) I10;
        String[] strArr = new String[c1468a.f18393a.size()];
        for (int i3 = 0; i3 < c1468a.f18393a.size(); i3++) {
            AbstractC1469b G4 = c1468a.G(i3);
            if (G4 instanceof j) {
                strArr[i3] = ((j) G4).f18626a;
            }
        }
        return strArr;
    }

    public float u(String str) {
        C1471d p8 = p();
        p8.getClass();
        return p8.M(j.a(str), f12901c);
    }

    public float v(String str, float f10) {
        C1471d p8 = p();
        p8.getClass();
        return p8.M(j.a(str), f10);
    }

    public Object w(String str, float f10) {
        AbstractC1469b I10 = p().I(str);
        if (!(I10 instanceof C1468a)) {
            if (I10 instanceof l) {
                return Float.valueOf(((l) I10).a());
            }
            if (f10 == f12901c) {
                return null;
            }
            return Float.valueOf(f10);
        }
        C1468a c1468a = (C1468a) I10;
        float[] fArr = new float[c1468a.f18393a.size()];
        for (int i3 = 0; i3 < c1468a.f18393a.size(); i3++) {
            AbstractC1469b G4 = c1468a.G(i3);
            if (G4 instanceof l) {
                fArr[i3] = ((l) G4).a();
            }
        }
        return fArr;
    }

    public Object x(String str, String str2) {
        AbstractC1469b I10 = p().I(str);
        return I10 instanceof l ? Float.valueOf(((l) I10).a()) : I10 instanceof j ? ((j) I10).f18626a : str2;
    }

    public String y(String str) {
        C1471d p8 = p();
        p8.getClass();
        return p8.R(j.a(str));
    }

    public boolean z(String str) {
        return p().I(str) != null;
    }

    public g(C1471d c1471d) {
        super(c1471d);
    }
}
