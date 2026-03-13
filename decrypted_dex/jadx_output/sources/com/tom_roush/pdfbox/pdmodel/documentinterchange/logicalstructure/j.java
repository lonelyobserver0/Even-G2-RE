package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oa.C1468a;
import oa.C1471d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class j extends a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f12782c = StubApp.getString2(16176);

    public j() {
        k(StubApp.getString2(16176));
    }

    public void m(k kVar) {
        ((C1468a) p().J(oa.j.f18421A2)).f18393a.add(kVar.p());
        i();
    }

    public List<k> n() {
        C1468a c1468a = (C1468a) p().J(oa.j.f18421A2);
        ArrayList arrayList = new ArrayList(c1468a.f18393a.size());
        for (int i3 = 0; i3 < c1468a.f18393a.size(); i3++) {
            arrayList.add(new k((C1471d) c1468a.G(i3), this));
        }
        return arrayList;
    }

    public void o(k kVar) {
        if (kVar == null) {
            return;
        }
        ((C1468a) p().J(oa.j.f18421A2)).I(kVar.p());
        i();
    }

    public void q(List<k> list) {
        C1468a c1468a = new C1468a();
        Iterator<k> it = list.iterator();
        while (it.hasNext()) {
            c1468a.f18393a.add(it.next().p());
        }
        p().V(oa.j.f18421A2, c1468a);
    }

    public void r(k kVar) {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        return super.toString() + StubApp.getString2(16199) + n();
    }

    public j(C1471d c1471d) {
        super(c1471d);
    }
}
