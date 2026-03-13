package ya;

import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1471d;
import oa.j;
import oa.p;
import pa.e;
import sa.C1608a;
import sa.f;
import ta.C1741a;
import ta.InterfaceC1743c;
import ta.h;

/* renamed from: ya.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1982c implements InterfaceC1743c {

    /* renamed from: a, reason: collision with root package name */
    public final h f23633a;

    public AbstractC1982c(p pVar, j jVar) {
        this.f23633a = new h(pVar);
        pVar.X(j.f18621y3, j.f18474L3.f18626a);
        pVar.X(j.f18576o3, jVar.f18626a);
    }

    public static AbstractC1982c e(AbstractC1469b abstractC1469b, f fVar) {
        List list;
        oa.h hVar = null;
        if (abstractC1469b == null) {
            return null;
        }
        if (!(abstractC1469b instanceof p)) {
            throw new IOException(StubApp.getString2(24747).concat(abstractC1469b.getClass().getName()));
        }
        p pVar = (p) abstractC1469b;
        String Q10 = pVar.Q(j.f18576o3);
        j jVar = j.f18445F1;
        if (!jVar.f18626a.equals(Q10)) {
            if (j.f18601u1.f18626a.equals(Q10)) {
                C1608a c1608a = fVar != null ? fVar.f20838b : null;
                C1471d G4 = pVar.G(j.f18605v1);
                return (G4 == null || !j.f18611w3.equals(G4.H(j.f18519Y2))) ? new Ba.a(pVar, c1608a) : new Ba.b(pVar, c1608a);
            }
            j jVar2 = j.f18477M2;
            if (jVar2.f18626a.equals(Q10)) {
                return new C1981b(pVar, jVar2);
            }
            throw new IOException(E1.a.j(StubApp.getString2(24746), Q10));
        }
        Ca.a aVar = new Ca.a(new h(pVar), jVar);
        j jVar3 = j.f18532d1;
        AbstractC1469b J10 = pVar.J(jVar3);
        if (J10 instanceof j) {
            j jVar4 = (j) J10;
            list = new C1741a(jVar4, jVar4, pVar, jVar3);
        } else if (J10 instanceof C1468a) {
            C1468a c1468a = (C1468a) J10;
            c1468a.getClass();
            list = new ArrayList(c1468a.f18393a);
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty() && j.f18467K1.equals(list.get(list.size() - 1))) {
            Iterator it = Arrays.asList(j.f18455H3, j.f18619y1, j.f18578p0).iterator();
            while (it.hasNext()) {
                if (!pVar.f18397a.containsKey((j) it.next())) {
                    try {
                        hVar = pVar.Z();
                        List list2 = hVar.f18410a;
                        pVar.a((list2.isEmpty() ? e.f19753b : (e) list2.get(list2.size() - 1)).f19754a);
                        return aVar;
                    } finally {
                        F1.h(hVar);
                    }
                }
            }
        }
        return aVar;
    }

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        return (p) this.f23633a.f21257b;
    }

    public AbstractC1982c(h hVar, j jVar) {
        this.f23633a = hVar;
        j jVar2 = j.f18621y3;
        String str = j.f18474L3.f18626a;
        p pVar = (p) hVar.f21257b;
        pVar.X(jVar2, str);
        pVar.X(j.f18576o3, jVar.f18626a);
    }
}
