package H0;

import L0.Y;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final r f2620a;

    /* renamed from: b, reason: collision with root package name */
    public final P0.o f2621b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f2622c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2623d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f2625f;

    public s(t tVar, x xVar, int i3, InterfaceC0061d interfaceC0061d) {
        this.f2625f = tVar;
        this.f2621b = new P0.o(i2.u.p(i3, StubApp.getString2(2428)));
        Y y10 = new Y(tVar.f2626a, null, null);
        this.f2622c = y10;
        this.f2620a = new r(tVar, xVar, i3, y10, interfaceC0061d);
        y10.f4019f = tVar.f2628c;
    }

    public final void a() {
        if (this.f2623d) {
            return;
        }
        this.f2620a.f2617b.f2551k = true;
        this.f2623d = true;
        t.a(this.f2625f);
    }
}
