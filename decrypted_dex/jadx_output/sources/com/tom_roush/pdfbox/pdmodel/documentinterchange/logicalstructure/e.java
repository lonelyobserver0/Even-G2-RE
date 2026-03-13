package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.stub.StubApp;
import java.io.IOException;
import oa.AbstractC1469b;
import oa.C1471d;
import oa.p;
import ta.InterfaceC1743c;
import ya.AbstractC1982c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class e implements InterfaceC1743c {

    /* renamed from: b, reason: collision with root package name */
    public static final String f12776b = StubApp.getString2(16193);

    /* renamed from: a, reason: collision with root package name */
    private final C1471d f12777a;

    public e() {
        C1471d c1471d = new C1471d();
        this.f12777a = c1471d;
        c1471d.X(oa.j.f18621y3, StubApp.getString2(16193));
    }

    @Override // ta.InterfaceC1743c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1471d p() {
        return this.f12777a;
    }

    public InterfaceC1743c b() {
        AbstractC1982c e10;
        AbstractC1469b J10 = p().J(oa.j.f18584q2);
        if (J10 instanceof C1471d) {
            try {
                if ((J10 instanceof p) && (e10 = AbstractC1982c.e(J10, null)) != null) {
                    return e10;
                }
                C1471d c1471d = (C1471d) J10;
                Fa.a a3 = Fa.a.a((C1471d) J10);
                if (a3 instanceof Fa.d) {
                    if (oa.j.f18558l.equals(c1471d.J(oa.j.f18621y3))) {
                    }
                }
                return a3;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public void c(Fa.a aVar) {
        p().W(oa.j.f18584q2, aVar);
    }

    public void d(AbstractC1982c abstractC1982c) {
        p().W(oa.j.f18584q2, abstractC1982c);
    }

    public e(C1471d c1471d) {
        this.f12777a = c1471d;
    }
}
