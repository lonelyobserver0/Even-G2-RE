package B3;

import R8.C0250h;
import Z9.C;
import android.content.Context;
import com.stub.StubApp;
import i5.C1059c;
import o0.AbstractC1405B;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements E0.l {

    /* renamed from: a, reason: collision with root package name */
    public Context f631a;

    public l a() {
        Context context = this.f631a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + StubApp.getString2(584));
        }
        l lVar = new l();
        lVar.f632a = D3.a.a(n.f640a);
        F5.c cVar = new F5.c(context, 4);
        lVar.f633b = cVar;
        lVar.f634c = D3.a.a(new C(5, cVar, new A0.c(cVar)));
        F5.c cVar2 = lVar.f633b;
        lVar.f635d = new s2.d(cVar2, 8);
        Pb.a a3 = D3.a.a(new C(14, lVar.f635d, D3.a.a(new Z9.q(cVar2, 8))));
        lVar.f636e = a3;
        u5.d dVar = new u5.d(7);
        F5.c cVar3 = lVar.f633b;
        Q2.g gVar = new Q2.g(cVar3, a3, dVar, 14);
        Pb.a aVar = lVar.f632a;
        Pb.a aVar2 = lVar.f634c;
        lVar.f637f = D3.a.a(new Q2.g(new s(aVar, aVar2, gVar, a3, a3, 2), new C1059c(cVar3, aVar2, a3, gVar, aVar, a3, a3), new p2.h(aVar, a3, gVar, a3), 2));
        return lVar;
    }

    @Override // E0.l
    public E0.m l(C0250h c0250h) {
        Context context;
        int i3 = AbstractC1560u.f20190a;
        if (i3 < 23 || (i3 < 31 && ((context = this.f631a) == null || i3 < 28 || !context.getPackageManager().hasSystemFeature(StubApp.getString2(585))))) {
            return new I4.e(4).l(c0250h);
        }
        int h2 = AbstractC1405B.h(((C1438m) c0250h.f6298c).f18216n);
        AbstractC1550k.o(StubApp.getString2(587), StubApp.getString2(586) + AbstractC1560u.C(h2));
        return new C(h2).l(c0250h);
    }
}
