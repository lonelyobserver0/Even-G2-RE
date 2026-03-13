package H0;

import M4.e0;
import o0.C1438m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f2586a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2587b;

    /* renamed from: c, reason: collision with root package name */
    public final C1438m f2588c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f2589d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2590e;

    public m(C1438m c1438m, int i3, int i10, e0 e0Var, String str) {
        this.f2586a = i3;
        this.f2587b = i10;
        this.f2588c = c1438m;
        this.f2589d = e0.a(e0Var);
        this.f2590e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f2586a == mVar.f2586a && this.f2587b == mVar.f2587b && this.f2588c.equals(mVar.f2588c)) {
                e0 e0Var = this.f2589d;
                e0Var.getClass();
                if (M4.r.f(e0Var, mVar.f2589d) && this.f2590e.equals(mVar.f2590e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2590e.hashCode() + ((this.f2589d.hashCode() + ((this.f2588c.hashCode() + ((((217 + this.f2586a) * 31) + this.f2587b) * 31)) * 31)) * 31);
    }
}
