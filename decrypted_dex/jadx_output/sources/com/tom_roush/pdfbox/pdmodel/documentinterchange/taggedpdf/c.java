package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import oa.AbstractC1469b;
import oa.C1468a;
import oa.k;
import ta.InterfaceC1743c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class c implements InterfaceC1743c {

    /* renamed from: a, reason: collision with root package name */
    private final C1468a f12797a;

    public c() {
        C1468a c1468a = new C1468a();
        this.f12797a = c1468a;
        k kVar = k.f18628a;
        c1468a.a(kVar);
        c1468a.a(kVar);
        c1468a.a(kVar);
        c1468a.a(kVar);
    }

    private Aa.e c(int i3) {
        AbstractC1469b G4 = this.f12797a.G(i3);
        if (G4 instanceof C1468a) {
            return new Aa.e((C1468a) G4);
        }
        return null;
    }

    private void h(int i3, Aa.e eVar) {
        this.f12797a.J(i3, eVar == null ? k.f18628a : eVar.f253a);
    }

    public Aa.e a() {
        return c(1);
    }

    public Aa.e b() {
        return c(0);
    }

    public Aa.e d() {
        return c(3);
    }

    public Aa.e e() {
        return c(2);
    }

    public void f(Aa.e eVar) {
        h(1, eVar);
    }

    public void g(Aa.e eVar) {
        h(0, eVar);
    }

    public void i(Aa.e eVar) {
        h(3, eVar);
    }

    public void j(Aa.e eVar) {
        h(2, eVar);
    }

    @Override // ta.InterfaceC1743c
    public AbstractC1469b p() {
        return this.f12797a;
    }

    public c(C1468a c1468a) {
        this.f12797a = c1468a;
        if (c1468a.f18393a.size() < 4) {
            for (int size = c1468a.f18393a.size() - 1; size < 4; size++) {
                this.f12797a.a(k.f18628a);
            }
        }
    }
}
