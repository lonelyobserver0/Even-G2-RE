package sa;

import com.stub.StubApp;
import java.util.HashMap;
import oa.AbstractC1469b;
import oa.C1471d;
import oa.j;
import oa.m;
import ta.InterfaceC1743c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f implements InterfaceC1743c {

    /* renamed from: a, reason: collision with root package name */
    public final C1471d f20837a;

    /* renamed from: b, reason: collision with root package name */
    public final C1608a f20838b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f20839c;

    public f() {
        this.f20839c = new HashMap();
        this.f20837a = new C1471d();
        this.f20838b = null;
    }

    public final AbstractC1469b a(j jVar, j jVar2) {
        C1471d G4 = this.f20837a.G(jVar);
        if (G4 == null) {
            return null;
        }
        return G4.J(jVar2);
    }

    public final m b(j jVar, j jVar2) {
        C1471d G4 = this.f20837a.G(jVar);
        if (G4 == null) {
            return null;
        }
        AbstractC1469b O7 = G4.O(jVar2);
        if (O7 instanceof m) {
            return (m) O7;
        }
        return null;
    }

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        return this.f20837a;
    }

    public f(C1471d c1471d) {
        this.f20839c = new HashMap();
        if (c1471d != null) {
            this.f20837a = c1471d;
            this.f20838b = null;
            return;
        }
        throw new IllegalArgumentException(StubApp.getString2(23160));
    }

    public f(C1471d c1471d, C1608a c1608a) {
        this.f20839c = new HashMap();
        if (c1471d != null) {
            this.f20837a = c1471d;
            this.f20838b = c1608a;
            return;
        }
        throw new IllegalArgumentException(StubApp.getString2(23160));
    }
}
