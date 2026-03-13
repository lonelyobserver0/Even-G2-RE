package oa;

import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import qa.C1532c;
import ta.InterfaceC1743c;

/* renamed from: oa.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1471d extends AbstractC1469b {

    /* renamed from: a, reason: collision with root package name */
    public Map f18397a = new Ia.d();

    public static String L(AbstractC1469b abstractC1469b, ArrayList arrayList) {
        if (abstractC1469b == null) {
            return StubApp.getString2(1116);
        }
        if (arrayList.contains(abstractC1469b)) {
            return String.valueOf(abstractC1469b.hashCode());
        }
        arrayList.add(abstractC1469b);
        boolean z2 = abstractC1469b instanceof C1471d;
        String string2 = StubApp.getString2(1262);
        String string22 = StubApp.getString2(265);
        if (!z2) {
            if (!(abstractC1469b instanceof C1468a)) {
                if (!(abstractC1469b instanceof m)) {
                    return abstractC1469b.toString();
                }
                return StubApp.getString2(21626) + L(((m) abstractC1469b).f18629a, arrayList) + string22;
            }
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(21623));
            Iterator it = ((C1468a) abstractC1469b).f18393a.iterator();
            while (it.hasNext()) {
                sb2.append(L((AbstractC1469b) it.next(), arrayList));
                sb2.append(string2);
            }
            sb2.append(string22);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder(StubApp.getString2(21624));
        for (Map.Entry entry : ((C1471d) abstractC1469b).f18397a.entrySet()) {
            sb3.append(entry.getKey());
            sb3.append(StubApp.getString2(478));
            sb3.append(L((AbstractC1469b) entry.getValue(), arrayList));
            sb3.append(string2);
        }
        sb3.append(string22);
        if (abstractC1469b instanceof p) {
            C1532c a02 = ((p) abstractC1469b).a0();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            F1.i(a02, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            sb3.append(StubApp.getString2(21625));
            sb3.append(Arrays.hashCode(byteArray));
            sb3.append(string22);
            a02.close();
        }
        return sb3.toString();
    }

    public final C1468a F(j jVar) {
        AbstractC1469b J10 = J(jVar);
        if (J10 instanceof C1468a) {
            return (C1468a) J10;
        }
        return null;
    }

    public final C1471d G(j jVar) {
        AbstractC1469b J10 = J(jVar);
        if (J10 instanceof C1471d) {
            return (C1471d) J10;
        }
        return null;
    }

    public final j H(j jVar) {
        AbstractC1469b J10 = J(jVar);
        if (J10 instanceof j) {
            return (j) J10;
        }
        return null;
    }

    public final AbstractC1469b I(String str) {
        return J(j.a(str));
    }

    public final AbstractC1469b J(j jVar) {
        AbstractC1469b abstractC1469b = (AbstractC1469b) this.f18397a.get(jVar);
        if (abstractC1469b instanceof m) {
            abstractC1469b = ((m) abstractC1469b).f18629a;
        }
        if (abstractC1469b instanceof k) {
            return null;
        }
        return abstractC1469b;
    }

    public final AbstractC1469b K(j jVar, j jVar2) {
        AbstractC1469b J10 = J(jVar);
        return (J10 != null || jVar2 == null) ? J10 : J(jVar2);
    }

    public final float M(j jVar, float f10) {
        AbstractC1469b J10 = J(jVar);
        return J10 instanceof l ? ((l) J10).a() : f10;
    }

    public final int N(j jVar, j jVar2, int i3) {
        AbstractC1469b K10 = K(jVar, jVar2);
        return K10 instanceof l ? ((l) K10).F() : i3;
    }

    public final AbstractC1469b O(j jVar) {
        return (AbstractC1469b) this.f18397a.get(jVar);
    }

    public final long P(j jVar) {
        AbstractC1469b J10 = J(jVar);
        if (J10 instanceof l) {
            return ((l) J10).G();
        }
        return -1L;
    }

    public final String Q(j jVar) {
        AbstractC1469b J10 = J(jVar);
        if (J10 instanceof j) {
            return ((j) J10).f18626a;
        }
        if (J10 instanceof q) {
            return ((q) J10).a();
        }
        return null;
    }

    public final String R(j jVar) {
        AbstractC1469b J10 = J(jVar);
        if (J10 instanceof q) {
            return ((q) J10).a();
        }
        return null;
    }

    public final void S(j jVar) {
        this.f18397a.remove(jVar);
    }

    public final void T(j jVar, float f10) {
        V(jVar, new C1473f(f10));
    }

    public final void U(j jVar, int i3) {
        V(jVar, i.H(i3));
    }

    public final void V(j jVar, AbstractC1469b abstractC1469b) {
        if (abstractC1469b == null) {
            S(jVar);
            return;
        }
        Map map = this.f18397a;
        if ((map instanceof Ia.d) && map.size() >= 1000) {
            this.f18397a = new LinkedHashMap(this.f18397a);
        }
        this.f18397a.put(jVar, abstractC1469b);
    }

    public final void W(j jVar, InterfaceC1743c interfaceC1743c) {
        V(jVar, interfaceC1743c != null ? interfaceC1743c.p() : null);
    }

    public final void X(j jVar, String str) {
        V(jVar, str != null ? j.a(str) : null);
    }

    public final void Y(j jVar, String str) {
        V(jVar, str != null ? new q(str) : null);
    }

    public final void a(C1471d c1471d) {
        Map map = this.f18397a;
        if (map instanceof Ia.d) {
            if (c1471d.f18397a.size() + map.size() >= 1000) {
                this.f18397a = new LinkedHashMap(this.f18397a);
            }
        }
        this.f18397a.putAll(c1471d.f18397a);
    }

    public final boolean d(j jVar, boolean z2) {
        AbstractC1469b K10 = K(jVar, null);
        return K10 instanceof C1470c ? K10 == C1470c.f18394b : z2;
    }

    public final String toString() {
        try {
            return L(this, new ArrayList());
        } catch (IOException e10) {
            return StubApp.getString2(21624) + e10.getMessage() + StubApp.getString2(265);
        }
    }
}
