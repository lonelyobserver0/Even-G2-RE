package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oa.AbstractC1469b;
import oa.C1471d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class b extends a {
    public b() {
    }

    public List<String> m() {
        ArrayList arrayList = new ArrayList();
        Iterator it = p().f18397a.entrySet().iterator();
        while (it.hasNext()) {
            oa.j jVar = (oa.j) ((Map.Entry) it.next()).getKey();
            if (!oa.j.f18579p2.equals(jVar)) {
                arrayList.add(jVar.f18626a);
            }
        }
        return arrayList;
    }

    public AbstractC1469b n(String str) {
        return p().I(str);
    }

    public AbstractC1469b o(String str, AbstractC1469b abstractC1469b) {
        AbstractC1469b I10 = p().I(str);
        return I10 == null ? abstractC1469b : I10;
    }

    public void q(String str, AbstractC1469b abstractC1469b) {
        AbstractC1469b n10 = n(str);
        p().V(oa.j.a(str), abstractC1469b);
        j(n10, abstractC1469b);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(StubApp.getString2(16188));
        Iterator<String> it = m().iterator();
        while (it.hasNext()) {
            String next = it.next();
            sb2.append(next);
            sb2.append('=');
            sb2.append(n(next));
            if (it.hasNext()) {
                sb2.append(StubApp.getString2(81));
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public b(C1471d c1471d) {
        super(c1471d);
    }
}
