package H0;

import L0.AbstractC0105a;
import L0.InterfaceC0129z;
import L0.d0;
import android.net.Uri;
import com.stub.StubApp;
import java.util.ArrayList;
import javax.net.SocketFactory;
import o0.AbstractC1416M;
import o0.AbstractC1448w;
import o0.C1444s;
import o0.C1447v;
import r0.AbstractC1560u;
import t0.InterfaceC1726z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class w extends AbstractC0105a {

    /* renamed from: h, reason: collision with root package name */
    public final I4.e f2648h;
    public final String j = StubApp.getString2(2430);

    /* renamed from: k, reason: collision with root package name */
    public final Uri f2649k;

    /* renamed from: l, reason: collision with root package name */
    public final SocketFactory f2650l;

    /* renamed from: m, reason: collision with root package name */
    public long f2651m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2652n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2653p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2654q;

    /* renamed from: r, reason: collision with root package name */
    public C1447v f2655r;

    static {
        AbstractC1448w.a(StubApp.getString2(2429));
    }

    public w(C1447v c1447v, I4.e eVar, SocketFactory socketFactory) {
        this.f2655r = c1447v;
        this.f2648h = eVar;
        C1444s c1444s = c1447v.f18249b;
        c1444s.getClass();
        this.f2649k = c1444s.f18242a;
        this.f2650l = socketFactory;
        this.f2651m = -9223372036854775807L;
        this.f2654q = true;
    }

    @Override // L0.AbstractC0105a
    public final InterfaceC0129z b(L0.B b2, P0.e eVar, long j) {
        Z9.q qVar = new Z9.q(this, 6);
        return new t(eVar, this.f2648h, this.f2649k, qVar, this.j, this.f2650l);
    }

    @Override // L0.AbstractC0105a
    public final synchronized C1447v h() {
        return this.f2655r;
    }

    @Override // L0.AbstractC0105a
    public final void j() {
    }

    @Override // L0.AbstractC0105a
    public final void l(InterfaceC1726z interfaceC1726z) {
        w();
    }

    @Override // L0.AbstractC0105a
    public final void n(InterfaceC0129z interfaceC0129z) {
        t tVar = (t) interfaceC0129z;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = tVar.f2630e;
            if (i3 >= arrayList.size()) {
                AbstractC1560u.g(tVar.f2629d);
                tVar.f2642t = true;
                return;
            }
            s sVar = (s) arrayList.get(i3);
            if (!sVar.f2624e) {
                sVar.f2621b.e(null);
                sVar.f2622c.x();
                sVar.f2624e = true;
            }
            i3++;
        }
    }

    @Override // L0.AbstractC0105a
    public final void q() {
    }

    @Override // L0.AbstractC0105a
    public final synchronized void v(C1447v c1447v) {
        this.f2655r = c1447v;
    }

    public final void w() {
        AbstractC1416M d0Var = new d0(this.f2651m, this.f2652n, this.f2653p, h());
        if (this.f2654q) {
            d0Var = new u(d0Var, 0);
        }
        m(d0Var);
    }
}
