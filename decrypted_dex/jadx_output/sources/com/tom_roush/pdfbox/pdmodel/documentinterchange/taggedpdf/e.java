package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import com.stub.StubApp;
import oa.C1471d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class e extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final String f12881d = StubApp.getString2(10690);

    /* renamed from: e, reason: collision with root package name */
    protected static final String f12882e = StubApp.getString2(16215);

    /* renamed from: f, reason: collision with root package name */
    public static final String f12883f = StubApp.getString2(2202);

    /* renamed from: g, reason: collision with root package name */
    public static final String f12884g = StubApp.getString2(16315);

    /* renamed from: h, reason: collision with root package name */
    public static final String f12885h = StubApp.getString2(16316);
    public static final String j = StubApp.getString2(16317);

    /* renamed from: k, reason: collision with root package name */
    public static final String f12886k = StubApp.getString2(16318);

    /* renamed from: l, reason: collision with root package name */
    public static final String f12887l = StubApp.getString2(9895);

    /* renamed from: m, reason: collision with root package name */
    public static final String f12888m = StubApp.getString2(2201);

    /* renamed from: n, reason: collision with root package name */
    public static final String f12889n = StubApp.getString2(16319);

    /* renamed from: p, reason: collision with root package name */
    public static final String f12890p = StubApp.getString2(16320);

    public e() {
        k(StubApp.getString2(10690));
    }

    public String K() {
        return s(StubApp.getString2(16215), StubApp.getString2(9895));
    }

    public void L(String str) {
        G(StubApp.getString2(16215), str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (z(StubApp.getString2(16215))) {
            sb2.append(StubApp.getString2(16216));
            sb2.append(K());
        }
        return sb2.toString();
    }

    public e(C1471d c1471d) {
        super(c1471d);
    }
}
