package H3;

import o0.C1411H;
import o0.InterfaceC1410G;
import r0.InterfaceC1546g;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class g implements J3.b, InterfaceC1546g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2720c;

    public /* synthetic */ g(int i3, C1411H c1411h, C1411H c1411h2) {
        this.f2718a = i3;
        this.f2719b = c1411h;
        this.f2720c = c1411h2;
    }

    @Override // J3.b
    public Object f() {
        ((i) this.f2719b).f2727d.a((B3.j) this.f2720c, this.f2718a + 1, false);
        return null;
    }

    @Override // r0.InterfaceC1546g
    /* renamed from: invoke */
    public void mo0invoke(Object obj) {
        InterfaceC1410G interfaceC1410G = (InterfaceC1410G) obj;
        interfaceC1410G.getClass();
        interfaceC1410G.i(this.f2718a, (C1411H) this.f2719b, (C1411H) this.f2720c);
    }

    public /* synthetic */ g(i iVar, B3.j jVar, int i3) {
        this.f2719b = iVar;
        this.f2720c = jVar;
        this.f2718a = i3;
    }
}
