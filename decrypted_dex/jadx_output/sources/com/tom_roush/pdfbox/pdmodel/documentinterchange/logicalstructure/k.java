package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.stub.StubApp;
import oa.AbstractC1469b;
import oa.C1470c;
import oa.C1471d;
import ta.AbstractC1744d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class k extends AbstractC1744d {

    /* renamed from: b, reason: collision with root package name */
    private final j f12783b;

    public k(j jVar) {
        this.f12783b = jVar;
    }

    private boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 != null : !obj.equals(obj2);
    }

    private void g(Object obj, Object obj2) {
        if (e(obj, obj2)) {
            this.f12783b.r(this);
        }
    }

    public String b() {
        return p().R(oa.j.f18528c1);
    }

    public String c() {
        return p().Q(oa.j.f18561l2);
    }

    public AbstractC1469b d() {
        return p().J(oa.j.f18442E3);
    }

    @Override // ta.AbstractC1744d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        j jVar = this.f12783b;
        if (jVar == null) {
            if (kVar.f12783b != null) {
                return false;
            }
        } else if (!jVar.equals(kVar.f12783b)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        return p().d(oa.j.f18609w1, false);
    }

    public void h(String str) {
        g(b(), str);
        p().Y(oa.j.f18528c1, str);
    }

    @Override // ta.AbstractC1744d
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        j jVar = this.f12783b;
        return hashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public void i(boolean z2) {
        g(Boolean.valueOf(f()), Boolean.valueOf(z2));
        p().V(oa.j.f18609w1, z2 ? C1470c.f18394b : C1470c.f18395c);
    }

    public void j(String str) {
        g(c(), str);
        p().X(oa.j.f18561l2, str);
    }

    public void k(AbstractC1469b abstractC1469b) {
        g(d(), abstractC1469b);
        p().V(oa.j.f18442E3, abstractC1469b);
    }

    public String toString() {
        return StubApp.getString2(16200) + c() + StubApp.getString2(16201) + d() + StubApp.getString2(16202) + b() + StubApp.getString2(16203) + f();
    }

    public k(C1471d c1471d, j jVar) {
        super(c1471d);
        this.f12783b = jVar;
    }
}
