package com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent;

import Ha.f;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import oa.C1471d;
import oa.j;
import ya.AbstractC1982c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f12786a;

    /* renamed from: b, reason: collision with root package name */
    private final C1471d f12787b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Object> f12788c;

    public a(j jVar, C1471d c1471d) {
        this.f12786a = jVar == null ? null : jVar.f18626a;
        this.f12787b = c1471d;
        this.f12788c = new ArrayList();
    }

    public static a d(j jVar, C1471d c1471d) {
        return j.f18563m.equals(jVar) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.a(c1471d) : new a(jVar, c1471d);
    }

    public void a(a aVar) {
        g().add(aVar);
    }

    public void b(f fVar) {
        g().add(fVar);
    }

    public void c(AbstractC1982c abstractC1982c) {
        g().add(abstractC1982c);
    }

    public String e() {
        if (k() == null) {
            return null;
        }
        return k().R(j.f18539f);
    }

    public String f() {
        if (k() == null) {
            return null;
        }
        return k().R(j.f18554k);
    }

    public List<Object> g() {
        return this.f12788c;
    }

    public String h() {
        if (k() == null) {
            return null;
        }
        return k().R(j.f18504U0);
    }

    public String i() {
        if (k() == null) {
            return null;
        }
        return k().Q(j.f18484O1);
    }

    public int j() {
        if (k() == null) {
            return -1;
        }
        return k().N(j.f18533d2, null, -1);
    }

    public C1471d k() {
        return this.f12787b;
    }

    public String l() {
        return this.f12786a;
    }

    public String toString() {
        return StubApp.getString2(16206) + this.f12786a + StubApp.getString2(2298) + this.f12787b + StubApp.getString2(16207) + this.f12788c;
    }
}
