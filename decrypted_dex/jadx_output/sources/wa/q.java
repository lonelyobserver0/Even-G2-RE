package wa;

import android.util.Log;
import com.stub.StubApp;
import java.util.HashSet;
import java.util.Map;
import oa.AbstractC1469b;
import oa.C1471d;
import xa.AbstractC1935c;
import xa.C1934b;
import xa.C1936d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class q extends m {

    /* renamed from: k, reason: collision with root package name */
    public AbstractC1935c f22241k;

    /* renamed from: l, reason: collision with root package name */
    public C1936d f22242l;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f22243m;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f22244n;

    public q(String str) {
        super(str);
        this.f22244n = new HashSet();
        if (StubApp.getString2(23958).equals(str)) {
            this.f22242l = C1936d.f23120e;
        } else {
            this.f22242l = C1936d.f23119d;
        }
    }

    @Override // wa.m
    public final float j(int i3) {
        Y9.b bVar = this.f22232c;
        if (bVar == null) {
            throw new IllegalStateException(StubApp.getString2(23998));
        }
        String c10 = this.f22241k.c(i3);
        if (StubApp.getString2(7719).equals(c10)) {
            return 250.0f;
        }
        if (StubApp.getString2(23996).equals(c10)) {
            c10 = StubApp.getString2(7738);
        } else if (StubApp.getString2(23997).equals(c10)) {
            c10 = StubApp.getString2(7750);
        }
        Y9.a aVar = (Y9.a) bVar.f8857m.get(c10);
        if (aVar != null) {
            return aVar.f8843b;
        }
        return 0.0f;
    }

    @Override // wa.m
    public boolean m() {
        AbstractC1935c abstractC1935c = this.f22241k;
        if (abstractC1935c instanceof C1934b) {
            C1934b c1934b = (C1934b) abstractC1935c;
            if (c1934b.f23116e.size() > 0) {
                for (Map.Entry entry : c1934b.f23116e.entrySet()) {
                    if (!((String) entry.getValue()).equals(c1934b.f23115d.c(((Integer) entry.getKey()).intValue()))) {
                        return false;
                    }
                }
            }
        }
        if (d()) {
            return false;
        }
        return w.f22277a.containsKey(getName());
    }

    @Override // wa.m
    public final boolean n() {
        return false;
    }

    @Override // wa.m
    public final String r(int i3) {
        return s(i3, C1936d.f23119d);
    }

    @Override // wa.m
    public final String s(int i3, C1936d c1936d) {
        String str;
        C1936d c1936d2 = this.f22242l;
        if (c1936d2 != C1936d.f23119d) {
            c1936d = c1936d2;
        }
        String r8 = super.r(i3);
        if (r8 != null) {
            return r8;
        }
        AbstractC1935c abstractC1935c = this.f22241k;
        if (abstractC1935c != null) {
            str = abstractC1935c.c(i3);
            String c10 = c1936d.c(str);
            if (c10 != null) {
                return c10;
            }
        } else {
            str = null;
        }
        Integer valueOf = Integer.valueOf(i3);
        HashSet hashSet = this.f22244n;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i3));
            String string2 = StubApp.getString2(948);
            if (str != null) {
                Log.w(string2, StubApp.getString2(23999) + str + StubApp.getString2(1561) + i3 + StubApp.getString2(24000) + getName());
                return null;
            }
            StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(24001), StubApp.getString2(24002));
            u2.append(getName());
            Log.w(string2, u2.toString());
        }
        return null;
    }

    public final Boolean t() {
        n nVar = this.f22233d;
        if (nVar != null) {
            return Boolean.valueOf(nVar.e(4));
        }
        return null;
    }

    public void u() {
        AbstractC1469b J10 = this.f22230a.J(oa.j.f18513X0);
        if (J10 instanceof oa.j) {
            oa.j jVar = (oa.j) J10;
            AbstractC1935c b2 = AbstractC1935c.b(jVar);
            this.f22241k = b2;
            if (b2 == null) {
                Log.w(StubApp.getString2(948), StubApp.getString2(6561) + jVar.f18626a);
                this.f22241k = v();
            }
        } else if (J10 instanceof C1471d) {
            C1471d c1471d = (C1471d) J10;
            Boolean t3 = t();
            oa.j H2 = c1471d.H(oa.j.f18617y);
            AbstractC1935c v2 = ((H2 == null || AbstractC1935c.b(H2) == null) && Boolean.TRUE.equals(t3)) ? v() : null;
            if (t3 == null) {
                t3 = Boolean.FALSE;
            }
            this.f22241k = new C1934b(c1471d, !t3.booleanValue(), v2);
        } else {
            this.f22241k = v();
        }
        if (StubApp.getString2(23958).equals((String) w.f22277a.get(getName()))) {
            this.f22242l = C1936d.f23120e;
        } else {
            this.f22242l = C1936d.f23119d;
        }
    }

    public abstract AbstractC1935c v();

    public q(C1471d c1471d) {
        super(c1471d);
        this.f22244n = new HashSet();
    }
}
