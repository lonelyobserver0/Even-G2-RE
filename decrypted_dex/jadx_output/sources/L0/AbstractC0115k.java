package L0;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import o0.AbstractC1416M;
import r0.AbstractC1550k;
import t0.InterfaceC1726z;

/* renamed from: L0.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0115k extends AbstractC0105a {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f4104h = new HashMap();
    public Handler j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC1726z f4105k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [L0.C, L0.h] */
    public final void A(final Object obj, AbstractC0105a abstractC0105a) {
        HashMap hashMap = this.f4104h;
        AbstractC1550k.c(!hashMap.containsKey(obj));
        ?? r12 = new C() { // from class: L0.h
            @Override // L0.C
            public final void a(AbstractC0105a abstractC0105a2, AbstractC1416M abstractC1416M) {
                AbstractC0115k.this.z(obj, abstractC0105a2, abstractC1416M);
            }
        };
        C0113i c0113i = new C0113i(this, obj);
        hashMap.put(obj, new C0114j(abstractC0105a, r12, c0113i));
        Handler handler = this.j;
        handler.getClass();
        abstractC0105a.getClass();
        A0.f fVar = abstractC0105a.f4041c;
        fVar.getClass();
        F f10 = new F();
        f10.f3895a = handler;
        f10.f3896b = c0113i;
        fVar.f34c.add(f10);
        this.j.getClass();
        A0.f fVar2 = abstractC0105a.f4042d;
        fVar2.getClass();
        A0.e eVar = new A0.e();
        eVar.f31a = c0113i;
        fVar2.f34c.add(eVar);
        InterfaceC1726z interfaceC1726z = this.f4105k;
        w0.j jVar = this.f4045g;
        AbstractC1550k.h(jVar);
        abstractC0105a.k(r12, interfaceC1726z, jVar);
        if (this.f4040b.isEmpty()) {
            abstractC0105a.c(r12);
        }
    }

    @Override // L0.AbstractC0105a
    public final void d() {
        for (C0114j c0114j : this.f4104h.values()) {
            c0114j.f4101a.c(c0114j.f4102b);
        }
    }

    @Override // L0.AbstractC0105a
    public final void f() {
        for (C0114j c0114j : this.f4104h.values()) {
            c0114j.f4101a.e(c0114j.f4102b);
        }
    }

    @Override // L0.AbstractC0105a
    public void j() {
        Iterator it = this.f4104h.values().iterator();
        while (it.hasNext()) {
            ((C0114j) it.next()).f4101a.j();
        }
    }

    @Override // L0.AbstractC0105a
    public void q() {
        HashMap hashMap = this.f4104h;
        for (C0114j c0114j : hashMap.values()) {
            c0114j.f4101a.p(c0114j.f4102b);
            C0113i c0113i = c0114j.f4103c;
            AbstractC0105a abstractC0105a = c0114j.f4101a;
            abstractC0105a.u(c0113i);
            abstractC0105a.s(c0113i);
        }
        hashMap.clear();
    }

    public abstract B w(Object obj, B b2);

    public long x(long j, Object obj) {
        return j;
    }

    public int y(int i3, Object obj) {
        return i3;
    }

    public abstract void z(Object obj, AbstractC0105a abstractC0105a, AbstractC1416M abstractC1416M);
}
