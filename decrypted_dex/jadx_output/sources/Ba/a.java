package Ba;

import java.io.InputStream;
import ka.InterfaceC1120a;
import oa.C1468a;
import oa.C1471d;
import oa.j;
import oa.p;
import sa.C1608a;
import sa.f;
import ta.C1747g;
import ta.h;
import ya.AbstractC1982c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class a extends AbstractC1982c implements InterfaceC1120a {

    /* renamed from: b, reason: collision with root package name */
    public final C1608a f744b;

    public a(p pVar, C1608a c1608a) {
        super(pVar, j.f18601u1);
        this.f744b = c1608a;
    }

    @Override // ka.InterfaceC1120a
    public final Ia.b a() {
        return Ia.b.c(((p) this.f23633a.f21257b).J(j.f18529c2));
    }

    @Override // ka.InterfaceC1120a
    public final C1747g b() {
        C1468a c1468a = (C1468a) ((p) this.f23633a.f21257b).J(j.f18418A);
        if (c1468a != null) {
            return new C1747g(c1468a);
        }
        return null;
    }

    @Override // ka.InterfaceC1120a
    public final InputStream c() {
        return ((p) this.f23633a.f21257b).Z();
    }

    @Override // ka.InterfaceC1120a
    public final f d() {
        h hVar = this.f23633a;
        p pVar = (p) hVar.f21257b;
        j jVar = j.f18492Q2;
        C1471d G4 = pVar.G(jVar);
        if (G4 != null) {
            return new f(G4, this.f744b);
        }
        if (((p) hVar.f21257b).f18397a.containsKey(jVar)) {
            return new f();
        }
        return null;
    }
}
