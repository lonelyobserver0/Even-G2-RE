package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import com.stub.StubApp;
import oa.C1468a;
import oa.C1471d;
import oa.j;
import ta.C1747g;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class a extends com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.a {
    public a(C1471d c1471d) {
        super(j.f18563m, c1471d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[LOOP:0: B:4:0x0010->B:13:0x0034, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean p(java.lang.String r6) {
        /*
            r5 = this;
            oa.d r0 = r5.k()
            oa.j r1 = oa.j.f18596t
            oa.b r0 = r0.J(r1)
            oa.a r0 = (oa.C1468a) r0
            r1 = 0
            if (r0 == 0) goto L37
            r2 = r1
        L10:
            java.util.ArrayList r3 = r0.f18393a
            int r4 = r3.size()
            if (r2 >= r4) goto L37
            int r4 = r3.size()
            if (r2 >= r4) goto L2b
            java.lang.Object r3 = r3.get(r2)
            boolean r4 = r3 instanceof oa.j
            if (r4 == 0) goto L2b
            oa.j r3 = (oa.j) r3
            java.lang.String r3 = r3.f18626a
            goto L2c
        L2b:
            r3 = 0
        L2c:
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L34
            r6 = 1
            return r6
        L34:
            int r2 = r2 + 1
            goto L10
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.a.p(java.lang.String):boolean");
    }

    public C1747g m() {
        C1468a c1468a = (C1468a) k().J(j.f18418A);
        if (c1468a != null) {
            return new C1747g(c1468a);
        }
        return null;
    }

    public String n() {
        return k().Q(j.f18576o3);
    }

    public String o() {
        return k().Q(j.f18621y3);
    }

    public boolean q() {
        return p(StubApp.getString2(16208));
    }

    public boolean r() {
        return p(StubApp.getString2(14890));
    }

    public boolean s() {
        return p(StubApp.getString2(14891));
    }

    public boolean t() {
        return p(StubApp.getString2(16209));
    }
}
