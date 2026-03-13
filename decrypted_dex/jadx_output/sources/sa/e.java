package sa;

import M4.C0132c;
import com.stub.StubApp;
import java.util.HashSet;
import java.util.Iterator;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1471d;
import oa.j;
import ta.InterfaceC1743c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e implements InterfaceC1743c, Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final C1471d f20835a;

    /* renamed from: b, reason: collision with root package name */
    public final C1609b f20836b;

    public e(C1471d c1471d, C1609b c1609b) {
        new HashSet();
        if (c1471d == null) {
            throw new IllegalArgumentException(StubApp.getString2(17434));
        }
        if (j.f18426B2.equals(c1471d.H(j.f18621y3))) {
            C1468a c1468a = new C1468a();
            c1468a.a(c1471d);
            C1471d c1471d2 = new C1471d();
            this.f20835a = c1471d2;
            c1471d2.V(j.f18480N1, c1468a);
            c1471d2.U(j.f18597t0, 1);
        } else {
            this.f20835a = c1471d;
        }
        this.f20836b = c1609b;
    }

    public static AbstractC1469b a(j jVar, C1471d c1471d) {
        AbstractC1469b J10 = c1471d.J(jVar);
        if (J10 != null) {
            return J10;
        }
        AbstractC1469b K10 = c1471d.K(j.f18441E2, j.f18421A2);
        if (!(K10 instanceof C1471d)) {
            return null;
        }
        C1471d c1471d2 = (C1471d) K10;
        if (j.f18431C2.equals(c1471d2.J(j.f18621y3))) {
            return a(jVar, c1471d2);
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0132c(this, this.f20835a);
    }

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        return this.f20835a;
    }
}
