package androidx.recyclerview.widget;

import t.AbstractC1695h;
import t.C1694g;
import t.C1697j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1697j f10285a = new C1697j(0);

    /* renamed from: b, reason: collision with root package name */
    public final C1694g f10286b = new C1694g();

    public final void a(e0 e0Var, H h2) {
        C1697j c1697j = this.f10285a;
        p0 p0Var = (p0) c1697j.get(e0Var);
        if (p0Var == null) {
            p0Var = p0.a();
            c1697j.put(e0Var, p0Var);
        }
        p0Var.f10276c = h2;
        p0Var.f10274a |= 8;
    }

    public final H b(e0 e0Var, int i3) {
        p0 p0Var;
        H h2;
        C1697j c1697j = this.f10285a;
        int d8 = c1697j.d(e0Var);
        if (d8 >= 0 && (p0Var = (p0) c1697j.i(d8)) != null) {
            int i10 = p0Var.f10274a;
            if ((i10 & i3) != 0) {
                int i11 = i10 & (~i3);
                p0Var.f10274a = i11;
                if (i3 == 4) {
                    h2 = p0Var.f10275b;
                } else {
                    if (i3 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    h2 = p0Var.f10276c;
                }
                if ((i11 & 12) == 0) {
                    c1697j.g(d8);
                    p0Var.f10274a = 0;
                    p0Var.f10275b = null;
                    p0Var.f10276c = null;
                    p0.f10273d.b(p0Var);
                }
                return h2;
            }
        }
        return null;
    }

    public final void c(e0 e0Var) {
        p0 p0Var = (p0) this.f10285a.get(e0Var);
        if (p0Var == null) {
            return;
        }
        p0Var.f10274a &= -2;
    }

    public final void d(e0 e0Var) {
        C1694g c1694g = this.f10286b;
        int e10 = c1694g.e() - 1;
        while (true) {
            if (e10 < 0) {
                break;
            }
            if (e0Var == c1694g.f(e10)) {
                Object[] objArr = c1694g.f21028c;
                Object obj = objArr[e10];
                Object obj2 = AbstractC1695h.f21030a;
                if (obj != obj2) {
                    objArr[e10] = obj2;
                    c1694g.f21026a = true;
                }
            } else {
                e10--;
            }
        }
        p0 p0Var = (p0) this.f10285a.remove(e0Var);
        if (p0Var != null) {
            p0Var.f10274a = 0;
            p0Var.f10275b = null;
            p0Var.f10276c = null;
            p0.f10273d.b(p0Var);
        }
    }
}
