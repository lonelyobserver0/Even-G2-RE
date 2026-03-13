package L0;

import o0.AbstractC1416M;
import o0.C1414K;
import o0.C1415L;
import o0.C1427b;
import o0.C1444s;
import o0.C1447v;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g0 extends r {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4088c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4089d;

    public g0(AbstractC1416M abstractC1416M, C1447v c1447v) {
        super(abstractC1416M);
        this.f4089d = c1447v;
    }

    @Override // L0.r, o0.AbstractC1416M
    public C1414K f(int i3, C1414K c1414k, boolean z2) {
        switch (this.f4088c) {
            case 1:
                AbstractC1416M abstractC1416M = this.f4123b;
                C1414K f10 = abstractC1416M.f(i3, c1414k, z2);
                if (abstractC1416M.m(f10.f18044c, (C1415L) this.f4089d, 0L).a()) {
                    f10.h(c1414k.f18042a, c1414k.f18043b, c1414k.f18044c, c1414k.f18045d, c1414k.f18046e, C1427b.f18123c, true);
                } else {
                    f10.f18047f = true;
                }
                return f10;
            default:
                return super.f(i3, c1414k, z2);
        }
    }

    @Override // L0.r, o0.AbstractC1416M
    public C1415L m(int i3, C1415L c1415l, long j) {
        switch (this.f4088c) {
            case 0:
                super.m(i3, c1415l, j);
                C1447v c1447v = (C1447v) this.f4089d;
                c1415l.f18053c = c1447v;
                C1444s c1444s = c1447v.f18249b;
                c1415l.getClass();
                return c1415l;
            default:
                return super.m(i3, c1415l, j);
        }
    }

    public g0(AbstractC1416M abstractC1416M) {
        super(abstractC1416M);
        this.f4089d = new C1415L();
    }
}
