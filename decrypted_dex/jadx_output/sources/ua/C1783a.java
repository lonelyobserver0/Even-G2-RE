package ua;

import Aa.d;
import com.stub.StubApp;
import oa.C1468a;
import oa.C1471d;
import oa.C1473f;
import oa.i;
import oa.j;
import ta.InterfaceC1743c;
import ya.C1980a;

/* renamed from: ua.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1783a implements InterfaceC1743c {

    /* renamed from: b, reason: collision with root package name */
    public static final String f21479b = StubApp.getString2(1384);

    /* renamed from: c, reason: collision with root package name */
    public static final String f21480c = StubApp.getString2(4908);

    /* renamed from: a, reason: collision with root package name */
    private final C1471d f21481a;

    public C1783a() {
        this.f21481a = new C1471d();
    }

    @Override // ta.InterfaceC1743c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1471d p() {
        return this.f21481a;
    }

    public Aa.a b() {
        C1471d c1471d = this.f21481a;
        j jVar = j.f18443F;
        C1468a c1468a = (C1468a) c1471d.J(jVar);
        if (c1468a == null) {
            c1468a = new C1468a();
            i iVar = i.f18412d;
            c1468a.a(iVar);
            c1468a.a(iVar);
            c1468a.a(iVar);
            this.f21481a.V(jVar, c1468a);
        }
        return new Aa.a(c1468a.K(), d.f251b);
    }

    public String c() {
        String Q10 = this.f21481a.Q(j.f18519Y2);
        return Q10 == null ? StubApp.getString2(1384) : Q10;
    }

    public float d() {
        return this.f21481a.M(j.F3, 1.0f);
    }

    public C1980a e() {
        C1471d c1471d = this.f21481a;
        j jVar = j.f18618y0;
        C1468a c1468a = (C1468a) c1471d.J(jVar);
        if (c1468a == null) {
            c1468a = new C1468a();
            c1468a.a(i.f18413e);
            this.f21481a.V(jVar, c1468a);
        }
        C1468a c1468a2 = new C1468a();
        c1468a2.a(c1468a);
        return new C1980a(c1468a2, 0);
    }

    public void f(Aa.a aVar) {
        C1468a c1468a;
        if (aVar != null) {
            c1468a = new C1468a();
            c1468a.f18393a.clear();
            for (float f10 : aVar.f247a) {
                c1468a.a(new C1473f(f10));
            }
        } else {
            c1468a = null;
        }
        this.f21481a.V(j.f18443F, c1468a);
    }

    public void g(String str) {
        this.f21481a.X(j.f18519Y2, str);
    }

    public void h(float f10) {
        this.f21481a.T(j.F3, f10);
    }

    public void i(C1468a c1468a) {
        if (c1468a == null) {
            c1468a = null;
        }
        this.f21481a.V(j.f18618y0, c1468a);
    }

    public C1783a(C1471d c1471d) {
        this.f21481a = c1471d;
    }
}
