package v0;

import o0.C1425W;
import o0.C1437l;
import o0.C1438m;
import o0.InterfaceC1410G;
import r0.InterfaceC1546g;

/* renamed from: v0.u, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C1825u implements InterfaceC1546g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21807a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1425W f21808b;

    public /* synthetic */ C1825u(C1425W c1425w) {
        this.f21808b = c1425w;
    }

    @Override // r0.InterfaceC1546g
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        switch (this.f21807a) {
            case 0:
                ((InterfaceC1410G) obj).f(this.f21808b);
                break;
            default:
                w0.h hVar = (w0.h) obj;
                Bc.i iVar = hVar.f22028o;
                C1425W c1425w = this.f21808b;
                if (iVar != null) {
                    C1438m c1438m = (C1438m) iVar.f767c;
                    if (c1438m.f18224v == -1) {
                        C1437l a3 = c1438m.a();
                        a3.f18184t = c1425w.f18114a;
                        a3.f18185u = c1425w.f18115b;
                        hVar.f22028o = new Bc.i(new C1438m(a3), iVar.f766b, (String) iVar.f768d);
                    }
                }
                int i3 = c1425w.f18114a;
                break;
        }
    }

    public /* synthetic */ C1825u(w0.a aVar, C1425W c1425w) {
        this.f21808b = c1425w;
    }
}
