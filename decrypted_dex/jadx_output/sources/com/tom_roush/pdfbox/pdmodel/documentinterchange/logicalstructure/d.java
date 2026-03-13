package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.stub.StubApp;
import oa.C1471d;
import ta.InterfaceC1743c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class d implements InterfaceC1743c {

    /* renamed from: b, reason: collision with root package name */
    public static final String f12774b = StubApp.getString2(16191);

    /* renamed from: a, reason: collision with root package name */
    private final C1471d f12775a;

    public d() {
        C1471d c1471d = new C1471d();
        this.f12775a = c1471d;
        c1471d.X(oa.j.f18621y3, StubApp.getString2(16191));
    }

    @Override // ta.InterfaceC1743c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1471d p() {
        return this.f12775a;
    }

    public int b() {
        return p().N(oa.j.f18533d2, null, -1);
    }

    public sa.d c() {
        C1471d c1471d = (C1471d) p().J(oa.j.f18459I2);
        if (c1471d != null) {
            return new sa.d(c1471d);
        }
        return null;
    }

    public void d(int i3) {
        p().U(oa.j.f18533d2, i3);
    }

    public void e(sa.d dVar) {
        p().W(oa.j.f18459I2, dVar);
    }

    public String toString() {
        return StubApp.getString2(16192) + b();
    }

    public d(C1471d c1471d) {
        this.f12775a = c1471d;
    }
}
