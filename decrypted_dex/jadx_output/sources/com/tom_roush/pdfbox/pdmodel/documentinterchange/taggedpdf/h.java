package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import com.stub.StubApp;
import oa.C1471d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class h extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final String f12902d = StubApp.getString2(16178);

    /* renamed from: e, reason: collision with root package name */
    protected static final String f12903e = StubApp.getString2(16210);

    /* renamed from: f, reason: collision with root package name */
    protected static final String f12904f = StubApp.getString2(16213);

    /* renamed from: g, reason: collision with root package name */
    protected static final String f12905g = StubApp.getString2(16214);

    /* renamed from: h, reason: collision with root package name */
    protected static final String f12906h = StubApp.getString2(16211);
    protected static final String j = StubApp.getString2(16212);

    /* renamed from: k, reason: collision with root package name */
    public static final String f12907k = StubApp.getString2(15634);

    /* renamed from: l, reason: collision with root package name */
    public static final String f12908l = StubApp.getString2(16332);

    /* renamed from: m, reason: collision with root package name */
    public static final String f12909m = StubApp.getString2(16333);

    public h() {
        k(StubApp.getString2(16178));
    }

    public int K() {
        return q(StubApp.getString2(16213), 1);
    }

    public String[] L() {
        return m(StubApp.getString2(16214));
    }

    public int M() {
        return q(StubApp.getString2(16210), 1);
    }

    public String N() {
        return r(StubApp.getString2(16211));
    }

    public String O() {
        return y(StubApp.getString2(16212));
    }

    public void P(int i3) {
        F(StubApp.getString2(16213), i3);
    }

    public void Q(String[] strArr) {
        C(StubApp.getString2(16214), strArr);
    }

    public void R(int i3) {
        F(StubApp.getString2(16210), i3);
    }

    public void S(String str) {
        G(StubApp.getString2(16211), str);
    }

    public void T(String str) {
        J(StubApp.getString2(16212), str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (z(StubApp.getString2(16210))) {
            sb2.append(StubApp.getString2(16217));
            sb2.append(M());
        }
        if (z(StubApp.getString2(16213))) {
            sb2.append(StubApp.getString2(16218));
            sb2.append(K());
        }
        if (z(StubApp.getString2(16214))) {
            sb2.append(StubApp.getString2(16219));
            sb2.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a.c(L()));
        }
        if (z(StubApp.getString2(16211))) {
            sb2.append(StubApp.getString2(16220));
            sb2.append(N());
        }
        if (z(StubApp.getString2(16212))) {
            sb2.append(StubApp.getString2(16221));
            sb2.append(O());
        }
        return sb2.toString();
    }

    public h(C1471d c1471d) {
        super(c1471d);
    }
}
