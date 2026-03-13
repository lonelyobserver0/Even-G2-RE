package sa;

import android.util.Log;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import ka.InterfaceC1120a;
import la.C1251c;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1470c;
import oa.C1471d;
import oa.j;
import oa.l;
import oa.p;
import ta.C1747g;
import ta.InterfaceC1743c;
import wa.v;

/* renamed from: sa.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1610c implements InterfaceC1743c, InterfaceC1120a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20828a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1743c f20829b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20830c;

    public C1610c(v vVar, p pVar) {
        this.f20829b = vVar;
        this.f20830c = pVar;
    }

    @Override // ka.InterfaceC1120a
    public Ia.b a() {
        return ((v) this.f20829b).a();
    }

    @Override // ka.InterfaceC1120a
    public C1747g b() {
        AbstractC1469b J10 = ((v) this.f20829b).f22230a.J(j.f18560l1);
        if (J10 instanceof C1468a) {
            return new C1747g((C1468a) J10);
        }
        return null;
    }

    @Override // ka.InterfaceC1120a
    public InputStream c() {
        return ((p) this.f20830c).Z();
    }

    @Override // ka.InterfaceC1120a
    public f d() {
        j jVar = j.f18492Q2;
        p pVar = (p) this.f20830c;
        if (pVar.f18397a.containsKey(jVar)) {
            String string2 = StubApp.getString2(948);
            Log.w(string2, StubApp.getString2(23155));
            Log.w(string2, StubApp.getString2(23156));
            return new f((C1471d) pVar.J(jVar));
        }
        v vVar = (v) this.f20829b;
        if (vVar.f22272p == null) {
            AbstractC1469b J10 = vVar.f22230a.J(jVar);
            if (J10 instanceof C1471d) {
                vVar.f22272p = new f((C1471d) J10, vVar.f22276t);
            }
        }
        return vVar.f22272p;
    }

    public Ea.c e(j jVar) {
        AbstractC1469b J10 = ((C1471d) this.f20829b).J(j.f18486P);
        if (!(J10 instanceof C1471d)) {
            return null;
        }
        AbstractC1469b J11 = ((C1471d) J10).J(jVar);
        if (!(J11 instanceof C1471d)) {
            return null;
        }
        Ea.c cVar = new Ea.c();
        cVar.f2125b = (C1471d) J11;
        return cVar;
    }

    public C1747g f() {
        ArrayList arrayList = new ArrayList();
        ra.f fVar = new ra.f(this);
        for (Object w10 = fVar.w(); w10 != null; w10 = fVar.w()) {
            if (w10 instanceof C1251c) {
                if (!((C1251c) w10).f16837a.equals(StubApp.getString2(23157)) || arrayList.size() != 6) {
                    return null;
                }
                for (int i3 = 0; i3 < 6; i3++) {
                    if (!(arrayList.get(i3) instanceof l)) {
                        return null;
                    }
                }
                float a3 = ((l) arrayList.get(2)).a();
                float a9 = ((l) arrayList.get(3)).a();
                return new C1747g(a3, a9, ((l) arrayList.get(4)).a() - a3, ((l) arrayList.get(5)).a() - a9);
            }
            arrayList.add((AbstractC1469b) w10);
        }
        return null;
    }

    public int g() {
        return ((C1471d) this.f20829b).N(j.f18495R1, null, 40);
    }

    public va.e h() {
        va.e eVar = (va.e) this.f20830c;
        if (eVar != null) {
            return eVar;
        }
        throw new IOException(StubApp.getString2(23158) + ((C1471d) this.f20829b).Q(j.f18532d1));
    }

    public int i() {
        return ((C1471d) this.f20829b).N(j.f18442E3, null, 0);
    }

    public boolean j() {
        AbstractC1469b J10 = ((C1471d) this.f20829b).J(j.f18521Z0);
        if (J10 instanceof C1470c) {
            return ((C1470c) J10).f18396a;
        }
        return true;
    }

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        switch (this.f20828a) {
            case 0:
                return (C1471d) this.f20829b;
            case 1:
                return (C1471d) this.f20829b;
            default:
                return (p) this.f20830c;
        }
    }

    public C1610c(C1609b c1609b) {
        this.f20830c = c1609b;
        C1471d c1471d = new C1471d();
        this.f20829b = c1471d;
        c1471d.V(j.f18621y3, j.f18465K);
        c1609b.f20823a.f18401d.V(j.f18503T2, c1471d);
    }

    public C1610c(C1471d c1471d, C1609b c1609b) {
        this.f20830c = c1609b;
        this.f20829b = c1471d;
    }

    public C1610c(C1471d c1471d) {
        va.e eVar;
        this.f20829b = c1471d;
        va.f fVar = va.f.f21903b;
        Class cls = (Class) fVar.f21904a.get(c1471d.Q(j.f18532d1));
        if (cls == null) {
            eVar = null;
        } else {
            try {
                eVar = (va.e) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException(e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException(e13);
            }
        }
        this.f20830c = eVar;
    }
}
