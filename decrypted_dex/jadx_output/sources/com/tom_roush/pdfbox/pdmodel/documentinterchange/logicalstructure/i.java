package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import android.util.Log;
import com.stub.StubApp;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1471d;
import ta.AbstractC1745e;
import ta.C1742b;
import ta.C1746f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class i extends h {

    /* renamed from: b, reason: collision with root package name */
    private static final String f12781b = StubApp.getString2(16196);

    public i() {
        super(StubApp.getString2(16196));
    }

    public void A(int i3) {
        p().U(oa.j.f18450G2, i3);
    }

    public void B(Map<String, String> map) {
        C1471d c1471d = new C1471d();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            c1471d.X(oa.j.a(key), entry.getValue());
        }
        p().V(oa.j.f18499S2, c1471d);
    }

    public AbstractC1745e r() {
        AbstractC1469b J10 = p().J(oa.j.f18425B1);
        if (J10 instanceof C1471d) {
            return new sa.g((C1471d) J10);
        }
        return null;
    }

    public AbstractC1469b s() {
        return p().J(oa.j.f18472L1);
    }

    @Deprecated
    public C1468a t() {
        C1471d p8 = p();
        oa.j jVar = oa.j.f18472L1;
        AbstractC1469b J10 = p8.J(jVar);
        if (!(J10 instanceof C1471d)) {
            if (J10 instanceof C1468a) {
                return (C1468a) J10;
            }
            return null;
        }
        AbstractC1469b J11 = ((C1471d) J10).J(jVar);
        if (J11 instanceof C1468a) {
            return (C1468a) J11;
        }
        return null;
    }

    public C1746f u() {
        AbstractC1469b J10 = p().J(oa.j.f18446F2);
        if (J10 instanceof C1471d) {
            return new C1746f((C1471d) J10);
        }
        return null;
    }

    public int v() {
        return p().N(oa.j.f18450G2, null, -1);
    }

    public Map<String, Object> w() {
        AbstractC1469b J10 = p().J(oa.j.f18499S2);
        if (J10 instanceof C1471d) {
            try {
                return C1742b.a((C1471d) J10);
            } catch (IOException e10) {
                Log.e(StubApp.getString2(948), e10.getMessage(), e10);
            }
        }
        return new HashMap();
    }

    public void x(AbstractC1745e abstractC1745e) {
        p().W(oa.j.f18425B1, abstractC1745e);
    }

    public void y(AbstractC1469b abstractC1469b) {
        p().V(oa.j.f18472L1, abstractC1469b);
    }

    public void z(C1746f c1746f) {
        p().W(oa.j.f18446F2, c1746f);
    }

    public i(C1471d c1471d) {
        super(c1471d);
    }
}
