package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1471d;
import oa.C1473f;
import oa.m;
import oa.q;
import ta.C1741a;
import ta.InterfaceC1743c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class h implements InterfaceC1743c {

    /* renamed from: a, reason: collision with root package name */
    private final C1471d f12780a;

    public h(String str) {
        C1471d c1471d = new C1471d();
        this.f12780a = c1471d;
        c1471d.X(oa.j.f18621y3, str);
    }

    public static h d(C1471d c1471d) {
        String Q10 = c1471d.Q(oa.j.f18621y3);
        if (StubApp.getString2(16196).equals(Q10)) {
            return new i(c1471d);
        }
        if (Q10 == null || StubApp.getString2(16194).equals(Q10)) {
            return new g(c1471d);
        }
        throw new IllegalArgumentException(StubApp.getString2(16197));
    }

    private InterfaceC1743c f(C1471d c1471d) {
        String Q10 = c1471d.Q(oa.j.f18621y3);
        if (Q10 == null || StubApp.getString2(16194).equals(Q10)) {
            return new g(c1471d);
        }
        if (StubApp.getString2(16193).equals(Q10)) {
            return new e(c1471d);
        }
        if (StubApp.getString2(16191).equals(Q10)) {
            return new d(c1471d);
        }
        return null;
    }

    public void a(g gVar) {
        c(gVar);
        gVar.d0(this);
    }

    public void b(AbstractC1469b abstractC1469b) {
        if (abstractC1469b == null) {
            return;
        }
        C1471d p8 = p();
        oa.j jVar = oa.j.f18472L1;
        AbstractC1469b J10 = p8.J(jVar);
        if (J10 == null) {
            p().V(jVar, abstractC1469b);
            return;
        }
        if (J10 instanceof C1468a) {
            ((C1468a) J10).a(abstractC1469b);
            return;
        }
        C1468a c1468a = new C1468a();
        c1468a.a(J10);
        c1468a.a(abstractC1469b);
        p().V(jVar, c1468a);
    }

    public void c(InterfaceC1743c interfaceC1743c) {
        if (interfaceC1743c == null) {
            return;
        }
        b(interfaceC1743c.p());
    }

    public Object e(AbstractC1469b abstractC1469b) {
        C1471d c1471d;
        if (abstractC1469b instanceof C1471d) {
            c1471d = (C1471d) abstractC1469b;
        } else {
            if (abstractC1469b instanceof m) {
                AbstractC1469b abstractC1469b2 = ((m) abstractC1469b).f18629a;
                if (abstractC1469b2 instanceof C1471d) {
                    c1471d = (C1471d) abstractC1469b2;
                }
            }
            c1471d = null;
        }
        if (c1471d != null) {
            return f(c1471d);
        }
        if (abstractC1469b instanceof oa.i) {
            return Integer.valueOf((int) ((oa.i) abstractC1469b).f18416a);
        }
        return null;
    }

    @Override // ta.InterfaceC1743c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1471d p() {
        return this.f12780a;
    }

    public List<Object> h() {
        ArrayList arrayList = new ArrayList();
        AbstractC1469b J10 = p().J(oa.j.f18472L1);
        if (J10 instanceof C1468a) {
            Iterator it = ((C1468a) J10).f18393a.iterator();
            while (it.hasNext()) {
                Object e10 = e((AbstractC1469b) it.next());
                if (e10 != null) {
                    arrayList.add(e10);
                }
            }
        } else {
            Object e11 = e(J10);
            if (e11 != null) {
                arrayList.add(e11);
            }
        }
        return arrayList;
    }

    public String i() {
        return p().Q(oa.j.f18621y3);
    }

    public void j(g gVar, Object obj) {
        l(gVar, obj);
    }

    public void k(AbstractC1469b abstractC1469b, Object obj) {
        ArrayList arrayList;
        if (abstractC1469b == null || obj == null) {
            return;
        }
        C1471d p8 = p();
        oa.j jVar = oa.j.f18472L1;
        AbstractC1469b J10 = p8.J(jVar);
        if (J10 == null) {
            return;
        }
        AbstractC1469b p9 = obj instanceof InterfaceC1743c ? ((InterfaceC1743c) obj).p() : null;
        if (!(J10 instanceof C1468a)) {
            boolean equals = J10.equals(p9);
            if (!equals && (J10 instanceof m)) {
                equals = ((m) J10).f18629a.equals(p9);
            }
            if (equals) {
                C1468a c1468a = new C1468a();
                c1468a.a(abstractC1469b);
                c1468a.a(p9);
                p().V(jVar, c1468a);
                return;
            }
            return;
        }
        C1468a c1468a2 = (C1468a) J10;
        int i3 = 0;
        while (true) {
            arrayList = c1468a2.f18393a;
            if (i3 >= arrayList.size()) {
                i3 = -1;
                break;
            }
            AbstractC1469b d8 = c1468a2.d(i3);
            if (d8 == null) {
                if (d8 == p9) {
                    break;
                } else {
                    i3++;
                }
            } else {
                if (d8.equals(p9)) {
                    break;
                }
                if ((d8 instanceof m) && ((m) d8).f18629a.equals(p9)) {
                    break;
                }
                i3++;
            }
        }
        arrayList.add(i3, abstractC1469b);
    }

    public void l(InterfaceC1743c interfaceC1743c, Object obj) {
        if (interfaceC1743c == null) {
            return;
        }
        k(interfaceC1743c.p(), obj);
    }

    public boolean m(g gVar) {
        boolean o5 = o(gVar);
        if (o5) {
            gVar.d0(null);
        }
        return o5;
    }

    public boolean n(AbstractC1469b abstractC1469b) {
        if (abstractC1469b != null) {
            C1471d p8 = p();
            oa.j jVar = oa.j.f18472L1;
            AbstractC1469b J10 = p8.J(jVar);
            if (J10 != null) {
                if (J10 instanceof C1468a) {
                    C1468a c1468a = (C1468a) J10;
                    ArrayList arrayList = c1468a.f18393a;
                    boolean remove = arrayList.remove(abstractC1469b);
                    if (!remove) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayList.size()) {
                                break;
                            }
                            AbstractC1469b d8 = c1468a.d(i3);
                            if ((d8 instanceof m) && ((m) d8).f18629a.equals(abstractC1469b)) {
                                remove = arrayList.remove(d8);
                                break;
                            }
                            i3++;
                        }
                    }
                    if (arrayList.size() == 1) {
                        p().V(oa.j.f18472L1, c1468a.G(0));
                    }
                    return remove;
                }
                boolean equals = J10.equals(abstractC1469b);
                if (!equals && (J10 instanceof m)) {
                    equals = ((m) J10).f18629a.equals(abstractC1469b);
                }
                if (equals) {
                    p().S(jVar);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean o(InterfaceC1743c interfaceC1743c) {
        if (interfaceC1743c == null) {
            return false;
        }
        return n(interfaceC1743c.p());
    }

    public void q(List<Object> list) {
        C1468a c1468a;
        C1471d p8 = p();
        oa.j jVar = oa.j.f18472L1;
        if (list == null) {
            c1468a = null;
        } else if (list instanceof C1741a) {
            c1468a = ((C1741a) list).f21244a;
        } else {
            C1468a c1468a2 = new C1468a();
            for (Object obj : list) {
                if (obj instanceof String) {
                    c1468a2.a(new q((String) obj));
                } else if ((obj instanceof Integer) || (obj instanceof Long)) {
                    c1468a2.a(oa.i.H(((Number) obj).longValue()));
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    c1468a2.a(new C1473f(((Number) obj).floatValue()));
                } else if (obj instanceof InterfaceC1743c) {
                    c1468a2.a(((InterfaceC1743c) obj).p());
                } else {
                    if (obj != null) {
                        throw new IllegalArgumentException(StubApp.getString2(16198) + obj.getClass().getName() + StubApp.getString2(620));
                    }
                    c1468a2.a(oa.k.f18628a);
                }
            }
            c1468a = c1468a2;
        }
        p8.V(jVar, c1468a);
    }

    public h(C1471d c1471d) {
        this.f12780a = c1471d;
    }
}
