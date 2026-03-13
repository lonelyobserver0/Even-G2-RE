package sa;

import android.util.Log;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import ka.InterfaceC1120a;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1471d;
import oa.C1473f;
import oa.j;
import oa.p;
import ta.C1747g;
import ta.InterfaceC1743c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d implements InterfaceC1743c, InterfaceC1120a {

    /* renamed from: a, reason: collision with root package name */
    public final C1471d f20831a;

    /* renamed from: b, reason: collision with root package name */
    public f f20832b;

    /* renamed from: c, reason: collision with root package name */
    public final C1608a f20833c;

    /* renamed from: d, reason: collision with root package name */
    public C1747g f20834d;

    public d(C1471d c1471d) {
        this.f20831a = c1471d;
    }

    @Override // ka.InterfaceC1120a
    public final Ia.b a() {
        return new Ia.b();
    }

    @Override // ka.InterfaceC1120a
    public final C1747g b() {
        return e();
    }

    @Override // ka.InterfaceC1120a
    public final InputStream c() {
        AbstractC1469b J10 = this.f20831a.J(j.f18592s0);
        if (J10 instanceof p) {
            return ((p) J10).Z();
        }
        if (J10 instanceof C1468a) {
            C1468a c1468a = (C1468a) J10;
            if (c1468a.f18393a.size() > 0) {
                byte[] bArr = {10};
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < c1468a.f18393a.size(); i3++) {
                    AbstractC1469b G4 = c1468a.G(i3);
                    if (G4 instanceof p) {
                        arrayList.add(((p) G4).Z());
                        arrayList.add(new ByteArrayInputStream(bArr));
                    }
                }
                return new SequenceInputStream(Collections.enumeration(arrayList));
            }
        }
        return new ByteArrayInputStream(new byte[0]);
    }

    @Override // ka.InterfaceC1120a
    public final f d() {
        if (this.f20832b == null) {
            AbstractC1469b a3 = e.a(j.f18492Q2, this.f20831a);
            if (a3 instanceof C1471d) {
                this.f20832b = new f((C1471d) a3, this.f20833c);
            }
        }
        return this.f20832b;
    }

    public final C1747g e() {
        AbstractC1469b a3 = e.a(j.f18608w0, this.f20831a);
        if (!(a3 instanceof C1468a)) {
            return f();
        }
        C1747g c1747g = new C1747g((C1468a) a3);
        C1747g f10 = f();
        C1747g c1747g2 = new C1747g(0.0f, 0.0f, 0.0f, 0.0f);
        C1473f c1473f = new C1473f(Math.max(f10.a(), c1747g.a()));
        C1468a c1468a = c1747g2.f21255a;
        c1468a.J(0, c1473f);
        c1468a.J(1, new C1473f(Math.max(f10.b(), c1747g.b())));
        c1468a.J(2, new C1473f(Math.min(f10.c(), c1747g.c())));
        c1468a.J(3, new C1473f(Math.min(f10.d(), c1747g.d())));
        return c1747g2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f20831a == this.f20831a;
    }

    public final C1747g f() {
        if (this.f20834d == null) {
            AbstractC1469b a3 = e.a(j.f18537e2, this.f20831a);
            if (a3 instanceof C1468a) {
                this.f20834d = new C1747g((C1468a) a3);
            } else {
                Log.d(StubApp.getString2(948), StubApp.getString2(23159));
                this.f20834d = C1747g.f21254b;
            }
        }
        return this.f20834d;
    }

    public final boolean g() {
        AbstractC1469b J10 = this.f20831a.J(j.f18592s0);
        return J10 instanceof p ? ((p) J10).f18397a.size() > 0 : (J10 instanceof C1468a) && ((C1468a) J10).f18393a.size() > 0;
    }

    public final int hashCode() {
        return this.f20831a.hashCode();
    }

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        return this.f20831a;
    }

    public d(C1471d c1471d, C1608a c1608a) {
        this.f20831a = c1471d;
        this.f20833c = c1608a;
    }
}
