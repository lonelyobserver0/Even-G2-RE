package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import com.stub.StubApp;
import oa.C1471d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class b extends d {

    /* renamed from: g1, reason: collision with root package name */
    public static final String f12790g1 = StubApp.getString2(16180);

    /* renamed from: h1, reason: collision with root package name */
    public static final String f12791h1 = StubApp.getString2(16181);

    /* renamed from: i1, reason: collision with root package name */
    public static final String f12792i1 = StubApp.getString2(16182);

    /* renamed from: j1, reason: collision with root package name */
    public static final String f12793j1 = StubApp.getString2(16183);

    /* renamed from: k1, reason: collision with root package name */
    public static final String f12794k1 = StubApp.getString2(16184);

    /* renamed from: l1, reason: collision with root package name */
    public static final String f12795l1 = StubApp.getString2(16185);

    /* renamed from: m1, reason: collision with root package name */
    public static final String f12796m1 = StubApp.getString2(16186);

    public b(String str) {
        k(str);
    }

    public int A1() {
        return q(StubApp.getString2(16210), 1);
    }

    public String B1() {
        return r(StubApp.getString2(16211));
    }

    public String C1() {
        return y(StubApp.getString2(16212));
    }

    public void D1(int i3) {
        F(StubApp.getString2(16213), i3);
    }

    public void E1(String[] strArr) {
        C(StubApp.getString2(16214), strArr);
    }

    public void F1(String str) {
        G(StubApp.getString2(16215), str);
    }

    public void G1(int i3) {
        F(StubApp.getString2(16210), i3);
    }

    public void H1(String str) {
        G(StubApp.getString2(16211), str);
    }

    public void I1(String str) {
        J(StubApp.getString2(16212), str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d, com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (z(StubApp.getString2(16215))) {
            sb2.append(StubApp.getString2(16216));
            sb2.append(z1());
        }
        if (z(StubApp.getString2(16210))) {
            sb2.append(StubApp.getString2(16217));
            sb2.append(A1());
        }
        if (z(StubApp.getString2(16213))) {
            sb2.append(StubApp.getString2(16218));
            sb2.append(x1());
        }
        if (z(StubApp.getString2(16214))) {
            sb2.append(StubApp.getString2(16219));
            sb2.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a.c(y1()));
        }
        if (z(StubApp.getString2(16211))) {
            sb2.append(StubApp.getString2(16220));
            sb2.append(B1());
        }
        if (z(StubApp.getString2(16212))) {
            sb2.append(StubApp.getString2(16221));
            sb2.append(C1());
        }
        return sb2.toString();
    }

    public int x1() {
        return q(StubApp.getString2(16213), 1);
    }

    public String[] y1() {
        return m(StubApp.getString2(16214));
    }

    public String z1() {
        return s(StubApp.getString2(16215), StubApp.getString2(9895));
    }

    public b(C1471d c1471d) {
        super(c1471d);
    }
}
