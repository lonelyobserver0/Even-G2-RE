package xa;

import com.stub.StubApp;
import java.util.HashMap;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1471d;
import oa.l;

/* renamed from: xa.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1934b extends AbstractC1935c {

    /* renamed from: c, reason: collision with root package name */
    public final C1471d f23114c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1935c f23115d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f23116e;

    public C1934b(C1471d c1471d) {
        this.f23116e = new HashMap();
        this.f23114c = c1471d;
        this.f23115d = null;
        d();
    }

    public final void d() {
        Integer num;
        AbstractC1469b J10 = this.f23114c.J(oa.j.f18487P0);
        if (J10 instanceof C1468a) {
            C1468a c1468a = (C1468a) J10;
            int i3 = -1;
            for (int i10 = 0; i10 < c1468a.f18393a.size(); i10++) {
                AbstractC1469b G4 = c1468a.G(i10);
                if (G4 instanceof l) {
                    i3 = ((l) G4).F();
                } else if (G4 instanceof oa.j) {
                    oa.j jVar = (oa.j) G4;
                    String str = jVar.f18626a;
                    HashMap hashMap = this.f23117a;
                    String str2 = (String) hashMap.get(Integer.valueOf(i3));
                    HashMap hashMap2 = this.f23118b;
                    if (str2 != null && (num = (Integer) hashMap2.get(str2)) != null && num.intValue() == i3) {
                        hashMap2.remove(str2);
                    }
                    hashMap2.put(str, Integer.valueOf(i3));
                    hashMap.put(Integer.valueOf(i3), str);
                    this.f23116e.put(Integer.valueOf(i3), jVar.f18626a);
                    i3++;
                }
            }
        }
    }

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        return this.f23114c;
    }

    public C1934b(C1471d c1471d, boolean z2, AbstractC1935c abstractC1935c) {
        this.f23116e = new HashMap();
        this.f23114c = c1471d;
        oa.j jVar = oa.j.f18617y;
        AbstractC1935c b2 = c1471d.f18397a.containsKey(jVar) ? AbstractC1935c.b(c1471d.H(jVar)) : null;
        if (b2 != null) {
            abstractC1935c = b2;
        } else if (z2) {
            abstractC1935c = C1940h.f23131d;
        } else if (abstractC1935c == null) {
            throw new IllegalArgumentException(StubApp.getString2(24225));
        }
        this.f23115d = abstractC1935c;
        this.f23117a.putAll(abstractC1935c.f23117a);
        this.f23118b.putAll(abstractC1935c.f23118b);
        d();
    }
}
