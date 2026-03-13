package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.stub.StubApp;
import oa.AbstractC1469b;
import oa.C1471d;
import ta.AbstractC1744d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class a extends AbstractC1744d {

    /* renamed from: b, reason: collision with root package name */
    private g f12772b;

    public a() {
    }

    public static String b(float[] fArr) {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1557));
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (i3 > 0) {
                sb2.append(StubApp.getString2(81));
            }
            sb2.append(fArr[i3]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static String c(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1557));
        for (int i3 = 0; i3 < objArr.length; i3++) {
            if (i3 > 0) {
                sb2.append(StubApp.getString2(81));
            }
            sb2.append(objArr[i3]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static a d(C1471d c1471d) {
        String Q10 = c1471d.Q(oa.j.f18579p2);
        return StubApp.getString2(16176).equals(Q10) ? new j(c1471d) : StubApp.getString2(10690).equals(Q10) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e(c1471d) : StubApp.getString2(16177).equals(Q10) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f(c1471d) : StubApp.getString2(16178).equals(Q10) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.h(c1471d) : StubApp.getString2(16179).equals(Q10) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d(c1471d) : (StubApp.getString2(16180).equals(Q10) || StubApp.getString2(16181).equals(Q10) || StubApp.getString2(16182).equals(Q10) || StubApp.getString2(16183).equals(Q10) || StubApp.getString2(16184).equals(Q10) || StubApp.getString2(16185).equals(Q10) || StubApp.getString2(16186).equals(Q10)) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b(c1471d) : new b(c1471d);
    }

    private g f() {
        return this.f12772b;
    }

    private boolean h(AbstractC1469b abstractC1469b, AbstractC1469b abstractC1469b2) {
        return abstractC1469b == null ? abstractC1469b2 != null : !abstractC1469b.equals(abstractC1469b2);
    }

    public String e() {
        return p().Q(oa.j.f18579p2);
    }

    public boolean g() {
        return p().f18397a.size() == 1 && e() != null;
    }

    public void i() {
        if (f() != null) {
            f().w(this);
        }
    }

    public void j(AbstractC1469b abstractC1469b, AbstractC1469b abstractC1469b2) {
        if (h(abstractC1469b, abstractC1469b2)) {
            i();
        }
    }

    public void k(String str) {
        p().X(oa.j.f18579p2, str);
    }

    public void l(g gVar) {
        this.f12772b = gVar;
    }

    public String toString() {
        return StubApp.getString2(16187) + e();
    }

    public a(C1471d c1471d) {
        super(c1471d);
    }
}
