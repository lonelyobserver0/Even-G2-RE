package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import com.stub.StubApp;
import oa.C1471d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class f extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final String f12891d = StubApp.getString2(16177);

    /* renamed from: e, reason: collision with root package name */
    private static final String f12892e = StubApp.getString2(16323);

    /* renamed from: f, reason: collision with root package name */
    private static final String f12893f = StubApp.getString2(16322);

    /* renamed from: g, reason: collision with root package name */
    private static final String f12894g = StubApp.getString2(16321);

    /* renamed from: h, reason: collision with root package name */
    public static final String f12895h = StubApp.getString2(16327);
    public static final String j = StubApp.getString2(16328);

    /* renamed from: k, reason: collision with root package name */
    public static final String f12896k = StubApp.getString2(16329);

    /* renamed from: l, reason: collision with root package name */
    public static final String f12897l = StubApp.getString2(5691);

    /* renamed from: m, reason: collision with root package name */
    public static final String f12898m = StubApp.getString2(16330);

    /* renamed from: n, reason: collision with root package name */
    public static final String f12899n = StubApp.getString2(1484);

    /* renamed from: p, reason: collision with root package name */
    public static final String f12900p = StubApp.getString2(16331);

    public f() {
        k(StubApp.getString2(16177));
    }

    public String K() {
        return y(StubApp.getString2(16321));
    }

    public String L() {
        return s(StubApp.getString2(16322), StubApp.getString2(1484));
    }

    public String M() {
        return r(StubApp.getString2(16323));
    }

    public void N(String str) {
        J(StubApp.getString2(16321), str);
    }

    public void O(String str) {
        G(StubApp.getString2(16322), str);
    }

    public void P(String str) {
        G(StubApp.getString2(16323), str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (z(StubApp.getString2(16323))) {
            sb2.append(StubApp.getString2(16324));
            sb2.append(M());
        }
        if (z(StubApp.getString2(16322))) {
            sb2.append(StubApp.getString2(16325));
            sb2.append(L());
        }
        if (z(StubApp.getString2(16321))) {
            sb2.append(StubApp.getString2(16326));
            sb2.append(K());
        }
        return sb2.toString();
    }

    public f(C1471d c1471d) {
        super(c1471d);
    }
}
